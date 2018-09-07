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
public class CoffeeBuilder extends BeverageBuilder{

//    public CoffeeBuilder(String name){
//        System.out.println(name);
//    }
    @Override
    public void setMilk() {
        System.out.println("step 1: add milk");
        getBeverage().setMilk(21);
    }
    
    @Override
    public void setCoffeeQuatity() {
        System.out.println("step 2: add coffee");
        getBeverage().setCoffeeQuatity(34);
    }
    
    @Override
    public void setTeaQuatity() {
//       System.out.println("step 3: add tea");
//        getBeverage().setTeaQuatity(0);
    }
    
    @Override
    public void setWater() {
        System.out.println("step 3: add water");
        getBeverage().setWater(12);
    }

    @Override
    public Beverage createBeverage() {
        return new Beverage();
    }

    @Override
    public void setType() {
        System.out.println("coffee");
        getBeverage().setName("coffee");
    }
    
}
