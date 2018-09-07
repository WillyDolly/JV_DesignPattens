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
public class Main {
    public static void main(String[] args) {
        SingletonClass newInstance1 = SingletonClass.getInstance();
        System.out.println("track object: "+System.identityHashCode(newInstance1));
        System.out.println("letterList: "+newInstance1.getLetterList());
        System.out.println("letterGroup: "+newInstance1.getLetterGroup(7));
        System.out.println("letterList after removal: "+newInstance1.getLetterList());
        //newInstance1.firstInstance = null; allow creating new instance
        
        SingletonClass newInstance2 = SingletonClass.getInstance();
        System.out.println("track object: "+System.identityHashCode(newInstance2));
        System.out.println("letterList: "+newInstance2.getLetterList());
        System.out.println("letterGroup: "+newInstance2.getLetterGroup(7));
        System.out.println("letterList after removal: "+newInstance1.getLetterList());
    }
}
