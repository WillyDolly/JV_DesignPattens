/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hai
 */

//Singleton eliminate the option of instantiating more than 1 object
//3 things to make Singleton: object-styled variable, private Constructor, getInstance method(use synchronized if multiThread)
public class SingletonClass {
    public static SingletonClass firstInstance = null;
    private SingletonClass(){}
    
    String[] letters = {"a","a","a","a","a","a","a","a","a","a",
                        "b","b","b","b","c","c","c","c","d","d",
                        "e","e","e","e","f","f","f","f","g","g",
                        "h", "h", "h", "h","i","i","j","k","k","k",
                        "l","l","l","l","m","m","m","n","n","o","o",
                        "p","q","r","r","r","r","s","s","s","t","t",
                        "v","v","w","y","y","z"};
    LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(letters));
    
    static boolean firstThread = true;
    public static SingletonClass getInstance(){
        if(firstInstance == null){
            if(firstThread){
                try {
                    firstThread = false;
                    Thread.currentThread();
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SingletonClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            synchronized(SingletonClass.class){
                if(firstInstance == null){
                   firstInstance = new SingletonClass();
                   //Collections.shuffle(firstInstance.letterList);
                }
            }
        }
        
        return firstInstance;
    }
    
    public LinkedList<String> getLetterList(){
        return firstInstance.letterList;
    }
    
    public LinkedList<String> getLetterGroup(int quatity){
        LinkedList<String> letterGroup = new LinkedList<String>();
        for(int i=0;i<=quatity;i++){
            letterGroup.add(letterList.remove(0));//LinkedList.remove(index) return value at the index
        }
        
        return letterGroup;
    }
}
