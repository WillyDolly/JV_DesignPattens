package FactoryPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Main {
    public static void main(String[] arg){
        Mobile mobile = MobileFactory.create(Mobile.nokia);   
        System.out.println(  mobile.number()+"");
    }
}
