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
public class ThreadTemp implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadTemp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
