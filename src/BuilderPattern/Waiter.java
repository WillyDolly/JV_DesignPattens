/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author hai
 */
public class Waiter {
    BeverageBuilder builder = null;
    public Beverage takeOrder(String type){
        if(type.equalsIgnoreCase("tea")){
            builder = new TeaBuilder();
        }
        else if(type.equalsIgnoreCase("coffee")){
            builder = new CoffeeBuilder();          
        }
        else 
            System.out.println("we don't serve "+type);;
        return builder.buildBeverage();
    }
}
