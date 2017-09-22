package Student;
/**
 * 通过双向管道进行线程通信
 */
import java.io.*;

public class PipeDemo extends Thread {
    PipedOutputStream output;

    public PipeDemo(PipedOutputStream out) {
        output = out; //copy to loacal member var
    }

    public void run() {
        try {
            // created a printstream for convenient writing
            PrintStream p = new PrintStream(output);
            //print message
            p.println(" Hello from another thread via pipes!");
            p.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            //created a pipe for writing
            PipedOutputStream pout = new PipedOutputStream();
            //created a pipe for reading,and connect it to output pipe
            PipedInputStream pin = new PipedInputStream(pout);
            //creat a new demo thread,to write to our pipe
            PipeDemo pdemo = new PipeDemo(pout);
            pdemo.start();
            //read thread data;
            int input = pin.read();
            //Terminate when end of stream reached
            while (input != -1) {
                //Print message
                System.out.print((char) input + " ");
                //Read next byte
                input = pin.read();
            }
        } catch (Exception e) {
            System.err.println("Pipe error" + e);
        }
    }
}
