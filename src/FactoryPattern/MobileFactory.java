/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author hai
 */
public class MobileFactory {
    public static Mobile create(String name){
            if(name.equals(Mobile.nokia))
                return new Nokia("n1",3,"dual core");
            else if(name.equals(Mobile.samsung))
                return new SamSung("ss1",4);
            else if(name.equals(Mobile.google))
                return new Google();
            else 
                return null;
        }
           
}
