package Student;
public class RunnableApp {
   public static void main(String[] args){
       new Thread(new RunnableA()).start();//实例化线程并启动
       new Thread(new RunnableB()).start();//实例化线程并启动

   }
}
//创建线程A
class RunnableA implements Runnable{
   public void run(){
      for(int i=0;i<=10000;i++){
         System.out.print("    A "+i);
      }
   }
}
//创建线程B
class RunnableB implements Runnable{
    public void run(){
       for(int i=90000;i<=100000;i++){
          System.out.println("    B "+i);
       }
   }
}
