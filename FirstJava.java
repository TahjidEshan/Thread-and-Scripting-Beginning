class ThreadTest implements Runnable
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
public class FirstJava extends Thread {

    public static void main(String args[]) {
        
        ThreadTest tt1 = new ThreadTest("First");
        ThreadTest tt2 = new ThreadTest("Second");
        
        Thread t1 = new Thread(tt1);
        Thread t2 = new Thread(tt2);
        
        t1.start();
        t2.start();
    }

}