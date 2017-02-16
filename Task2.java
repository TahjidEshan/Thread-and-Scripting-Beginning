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
public class Task2 {

    public static void main(String[] args) {
    PrintDigit printD=new PrintDigit();
    
    Thread t1=new Thread(printD,"Thread1");
    Thread t2=new Thread(printD,"Thread2");
    
    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    
    t1.start();
    t2.start();
    
    }

}
