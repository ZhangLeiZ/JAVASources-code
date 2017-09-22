package FILE;
import java.io.*;
//实现该接口的类才具有序列化的功能
public class Student implements Serializable {     
int id; //学号
  String name; //姓名
  int age; //年龄
  String department; //系别

 public Student(int id, String name, int age, String department) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.department = department;
  }

  public static void main(String[] args) {
      Student stu = new Student(981036, "Liu Ming", 18, "CSD");
      Student stug;
      try {
          FileOutputStream fo = new FileOutputStream("data.ser");
          //保存对象的状态  实现序列化
          ObjectOutputStream so = new ObjectOutputStream(fo);
          so.writeObject(stu);
          so.close();

          FileInputStream fi = new FileInputStream("data.ser");
          ObjectInputStream si = new ObjectInputStream(fi);
          //恢复对象的状态  实现反序列化
          stug = (Student) si.readObject();
          System.out.println(stug.name);
          si.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}
