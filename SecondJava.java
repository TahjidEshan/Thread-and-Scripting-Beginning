/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author khaled
 */

class ThreadTest extends Thread
{
    private String threadName;
    public ThreadTest(String str)
    {
        threadName = str;
    }
    public void run() {
        System.out.println("Starting " + threadName);
        for(int i = 0; i<5; i++)
        {
            System.out.println("Thread:"+threadName+"# printing "+ i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
public class SecondJava extends Thread {

    public static void main(String args[]) {
        
        ThreadTest tt = new ThreadTest("First");
        ThreadTest tt1 = new ThreadTest("Second");
        
        tt.start();
        tt1.start();
    }

}