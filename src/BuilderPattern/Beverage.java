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
public class Beverage {
    private double water;
    private double milk;
    
    private double coffeeQuatity;
    private double teaQuatity;
    private String name;

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
        System.out.println(water+"");
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
        System.out.println(milk+"");
    }

    public double getCoffeeQuatity() {
        return coffeeQuatity;
    }

    public void setCoffeeQuatity(double coffeeQuatity) {
        this.coffeeQuatity = coffeeQuatity;
        System.out.println(coffeeQuatity+"");
    }

    public double getTeaQuatity() {
        return teaQuatity;
    }

    public void setTeaQuatity(double teaQuatity) {
        this.teaQuatity = teaQuatity;
        System.out.println(teaQuatity+"");
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
     @Override
    public String toString() {
        return name + " water=" + water + ", milk=" + milk + ", coffeeQuatity=" + coffeeQuatity + ", teaQuatity=" + teaQuatity + '}';
    }
}
