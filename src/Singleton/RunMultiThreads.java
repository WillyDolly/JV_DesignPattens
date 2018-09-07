/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author hai
 */
public class RunMultiThreads {//destroy Singleton pattern
    public static void main(String[] args) {
        Runnable thread1 = new MyThread();
        Runnable thread2 = new MyThread();
        
        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}
