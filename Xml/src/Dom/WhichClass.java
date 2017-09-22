package Dom;
/*--

 $Id: WhichClass.java,v 1.2 2004/02/06 09:57:48 jhunter Exp $

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

// Posted to jdom-interest by Patrick Dowler

import java.net.URL;

class WhichClass {
  public static void main(String[] args) {
    String targetClass = null;
    if (args.length == 1) {
      targetClass = args[0];
    }
    else {
      printUsage();
      return;
    }

    try {
      Class.forName(targetClass);
      System.out.println("Found class '" + targetClass + "'");
    }
    catch (ClassNotFoundException ex){
      System.out.println("Failed to find class '" + targetClass + "'");
    }

    URL u = ClassLoader.getSystemResource(toPath(targetClass));
    if (u != null) {
      System.out.println("at URL '" + u + "'");
    }
  }

  private static String toPath(String className){
    StringBuffer sb = new StringBuffer(className);
    for (int i=0; i < sb.length(); i++) {
      if (sb.charAt(i) == '.') {
        sb.setCharAt(i, '/');
      }
    }
    sb.append(".class");
    return sb.toString();
  }

  private static void printUsage() {
    System.out.println("此程序报告类文件的位置");
    System.out.println("用法：whichclass java类名");
  }
}

