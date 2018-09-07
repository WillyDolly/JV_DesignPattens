/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

import java.util.Random;

/**
 *
 * @author hai
 */
public class SamSung implements Mobile{
    private String model;
    private double ram;
    
    public SamSung(String m,double r){
       model = m;
       ram = r;
    }
    
    public double generator(){
        Random r = new Random();
        return ram = r.nextDouble();
    }

    @Override
    public double number() {
       return 1;
    }
}
