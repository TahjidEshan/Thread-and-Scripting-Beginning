/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author E
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadTemp threadMain = new ThreadTemp();

        Thread thread1 = new Thread(threadMain, "Thread1");
        Thread thread2 = new Thread(threadMain, "Thread2");
        Thread thread3 = new Thread(threadMain, "Thread3");
        Thread thread4 = new Thread(threadMain, "Thread4");
        Thread thread5 = new Thread(threadMain, "Thread5");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread4.setPriority(Thread.MAX_PRIORITY);
        thread5.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

//        thread1.stop();
//        thread2.stop();
//        thread3.stop();
//        thread4.stop();
//        thread5.stop();

        System.out.println(thread1.getName() + " : " + thread1.getState());
        System.out.println(thread1.getName() + " is alive : " + thread1.isAlive());

        System.out.println(thread2.getName() + " : " + thread2.getState());
        System.out.println(thread2.getName() + " is alive : " + thread2.isAlive());

        System.out.println(thread3.getName() + " : " + thread3.getState());
        System.out.println(thread3.getName() + " is alive : " + thread3.isAlive());

        System.out.println(thread4.getName() + " : " + thread4.getState());
        System.out.println(thread4.getName() + " is alive : " + thread4.isAlive());

        System.out.println(thread5.getName() + " : " + thread5.getState());
        System.out.println(thread5.getName() + " is alive : " + thread5.isAlive());
    }

}
