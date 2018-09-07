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
public class Google implements Mobile{
    private String model;
    private boolean sdCard;
    
    public Google(){
        
    }

    @Override
    public double number() {
        return 3;
    }
}
