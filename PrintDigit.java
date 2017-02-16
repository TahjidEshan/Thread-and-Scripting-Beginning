/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author E
 */
public class PrintDigit implements Runnable {

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Thread1")) {
            try {
                System.out.println("Starting Thread 1");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);

                }
                System.out.println("Pausing Thread 1");
                Thread.sleep(10);
                System.out.println("Resuming Thread 1");
                for (int i = 21; i <= 30; i++) {
                    System.out.println(i);

                }
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintDigit.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Thread.currentThread().getName().equals("Thread2")) {
            System.out.println("Starting Thread 2");
            for (int i = 11; i <= 20; i++) {
                System.out.println(i);

            }
        }
    }

}
