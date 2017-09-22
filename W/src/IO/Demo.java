package IO;

import java.util.Scanner;

 public class Demo {
 
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         boolean flag = true;
         String msg = "";
         while(true){
             if(flag){
                 msg = "加密";
                 flag = false;
             }else{
                 msg = "解密";
                 flag = true;
             }
             System.out.println("请输入需要"+msg+"的字符串：");
             String password = scan.nextLine();
             char[] array = password.toCharArray();
             for(int i = 0;i<array.length;i++){
                 array[i] = (char)(array[i]^'r');
             }
             System.out.println(msg+"结果如下：");
             System.out.println(new String(array));
         }
         
     }
 }

