
package Student;
class Q2{
	private String name="陈琼";
	private String sex="女";

	public synchronized void put(String name,String sex){
	     this.name = name;
	     try{
	         Thread.sleep(10);
	     }catch(Exception e){
	         e.printStackTrace();
	     }
	     this.sex = sex;
	}

	public synchronized void get(){
	   System.out.println(name + "---->" + sex);
	}
}


class Producer2 implements Runnable{
	Q2 q=null;

	public Producer2(Q2 q){
	   this.q=q;
    }

	public void run(){
		int i=0;
		while(true){
				if(i==0){
			        q.put("张孝祥","男");
				}
				else{
			        q.put("陈琼","女");
				}

			i=(i+1)%2;
        }
   }

}



class Consumer2 implements Runnable{
	Q2 q=null;
	public Consumer2(Q2 q)	{
		this.q=q;
	}
	public void run(){
		while(true){
			q.get();
	    }
    }
}

public class ThreadCommunation2{
	public static void main(String [] args)	{
		Q2 q=new Q2();
		new Thread(new Producer2(q)).start();
		new Thread(new Consumer2(q)).start();
	}
}

