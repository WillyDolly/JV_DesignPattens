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
public abstract class BeverageBuilder {
    private Beverage beverage;
    
    public Beverage getBeverage(){
        return beverage;
    }
    
    public void setBeverage(Beverage b){
        beverage = b;
    }
    
    public Beverage buildBeverage(){
        Beverage beverage = createBeverage();
        setBeverage(beverage);
        setType();
        setMilk();
        setCoffeeQuatity();
        setTeaQuatity();
        setWater();
        return beverage;
    }
    
    public abstract void setType();
    public abstract void setWater();
    public abstract void setMilk();
    public abstract void setCoffeeQuatity();
    public abstract void setTeaQuatity();
    public abstract Beverage createBeverage();
}
