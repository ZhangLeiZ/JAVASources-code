package Dom;
/*--

 $Id: Ident.java,v 1.2 2004/02/06 09:57:48 jhunter Exp $

 Copyright (C) 2000-2004 Jason Hunter & Brett McLaughlin.
 All rights reserved.

 在符合下列条件时，允许在有或没有修改的情况下，在源和二进制形式中进行再分配和使用：
 1。以源代码形式的发布必须保留上述版权声明，此条件列表，和下面的免责声明。
 2。以二进制形式重新分配必须保留上述版权声明、本条件清单，和下面的免责声明所提供的版本
 的文档和/或其他材料的这些条件。三.名称“JDOM”不能被用来支持或推广该软件衍生的产品事先
 书面许可，不。书面许可，请联系request_at_jdom_dot_org > <。4。从该软件衍生的产品
 不可能被称为“转换”，也可以“满足”出现在他们的名字，未经事先书面许可JDOM项目管理
 request_at_jdom_dot_org > <。此外，我们要求（但不要求），包括你所提供的再分配
 和/或软件本身的确认相当于下列最终用户文档：“该产品包括由JDOM项目开发的软件
 （http：/ / www.jdom。org /）”。另外，
 确认可能使用http://www.jdom.org/images/logos标志图形。
 该软件提供` `是'任何明示或暗示的担保，包括但不限于，默示保证适销性和适用性的担保。
 在任何情况下不得JDOM作者或项目的出资人承担任何直接、间接、附带的、特殊的、典型的、
 或间接的损害赔偿（包括但不限于，替代商品或服务；采购使用、数据或利润；或业务中断损失）
 而造成的任何责任理论，无论是合同，严格责任，或侵权行为（包括疏忽或其他原因）
 以任何方式从使用本软件所产生的，即使这种损害的可能性。该软件由对JDOM项目代表许多人自愿
 捐款，最初是由杰森猎人< jhunter_at_jdom_dot_org >和brett mclaughlin 
 < brett_at_jdom_dot_org >创建。在JDOM项目的更多信息，
 请参见< HTTP：/ / www.jdom。org / >。 

 */

 import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * <p>
 * The <code>Ident</code> class is a class which works like the 
 * ident(1) program used to display RCS keys stored in binary files,
 * but with the added facility of being able to look inside .zip/.jar 
 * files and check each one on the file contain within.
 * </p>
 *
 * <p>
 * Known issues: The class can get confused if a $ appears in the class
 * file where it's not a delimiter.
 *
 * @author Jools Enticknap
 */
public final class Ident {
    
    /** Starting character for an RCS string */
    private final static int KDELIM = '$';

    /** Delimiter withing the tags */
    private final static int VDELIM = ':';
    
    /** All the known RCS tags */
    private final static String[] rcsTags = {
        "Author", // 检查版本的用户的登录名.

        "Date",   // 检查的日期和时间.

        "Header", // A standard header containing the full pathname of the RCS
                  // file, the revision number, the date and time, the author,
                  // the state, and the locker (if locked).
 
        "Id",     // Same as $Header: /home/cvs/jdom-contrib/src/java/Ident.java,v 1.2 2004/02/06 09:57:48 jhunter Exp $, except that the RCS filename is without 
                  // a path.
 
        "Locker", // The login name of the user who locked the revision (empty
                  // if not locked).
 
        "Log",    // The log message supplied during checkin.  For ident's  
                  // purposes, this is equivalent to $RCSfile: Ident.java,v $.
 
        "Name",   // The symbolic name used to check out the revision, if any.
        
        "RCSfile",// The name of the RCS file without a path.
 
        "Revision",// The revision number assigned to the revision.
 
        "Source", // The full pathname of the RCS file.
 
        "State"   // The state assigned to the revision with the -s option 
                  // of rcs(1) or ci(1).
    };
    
    /** A Map of all the tags for easy lookup */
    private final static HashMap tagMap;
    
    public static void main(String args[]) throws IOException {
        if (args.length > 0 ) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]+":");
                if (isZip(args[i])) {
                    ZipFile zipFile = new ZipFile(args[i]);
                    Enumeration entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry ze = (ZipEntry)entries.nextElement();
                        System.out.println("   ->"+ze.getName()+"<-");
                        scan(zipFile.getInputStream(ze));
                    }
                } else {
                    FileInputStream fis = new FileInputStream(args[i]);
                    scan(fis);
                }
            }
        } else {
            printUsage();
        }
    }

    private static void printUsage() {
        System.out.println(
          "This program prints RCS information about a class file.");
        System.out.println("Usage: java Ident [classfile.class | jarfile.jar]");
    }

    private static boolean isZip(String fileName) {
        return fileName.endsWith(".jar") ||
               fileName.endsWith(".zip");
    }

    private static void scan(InputStream is) throws IOException {
        int i = 0;
        StringBuffer sb = new StringBuffer();

        boolean inTag    = false;
        boolean validTag = false;
        
        while ((i = is.read()) != -1) {
            
            // We have found a starting tag.
            if (i == KDELIM) {
                // We are at the end of the 
                if (inTag) {
                    if (validTag) {
                        System.out.println("     $"+sb.toString()+"$");
                    }
                    validTag = inTag = false;
                    sb = new StringBuffer();
                } else {
                    inTag = true;
                    continue;
                }
            } else if (i == VDELIM) {
                if (inTag && !validTag) {
                    String tag = sb.toString();
                    if (tagMap.get(tag) == null) {
                        // Failed to match a tag, start again.
                        inTag = false;
                        validTag = false;
                        sb = new StringBuffer();
                    } else {
                        validTag = true;
                    }
                }
            } 
            
            if (inTag) {
                sb.append((char)i);
            }
        }
    }

    static {
        tagMap = new HashMap();
        for (int i = 0; i < rcsTags.length; i++) {
            tagMap.put(rcsTags[i],rcsTags[i]); 
        }
    }
}
