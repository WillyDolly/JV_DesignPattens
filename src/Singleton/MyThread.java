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
public class MyThread implements Runnable{

    @Override
    public void run() {
        SingletonClass newInstance1 = SingletonClass.getInstance();
        System.out.println("track object: "+System.identityHashCode(newInstance1));
        System.out.println("letterList: "+newInstance1.getLetterList());
        System.out.println("letterGroup: "+newInstance1.getLetterGroup(7));
    }
    
}
