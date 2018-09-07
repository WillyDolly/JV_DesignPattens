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
public class Nokia implements Mobile{
    private String model;
    private double ram;
    private String processor;
    
    public Nokia(String m,double r,String p){
        
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String m){
        model = m;
    }

    @Override
    public double number() {
       return 2;
    }
}
