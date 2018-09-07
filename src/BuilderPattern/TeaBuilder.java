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
public class TeaBuilder extends BeverageBuilder{

//    public TeaBuilder(String name){
//        System.out.println(name);
//    }
     @Override
    public void setTeaQuatity() {
        System.out.println("step 1: add tea");
        getBeverage().setTeaQuatity(34);
    }
    
    @Override
    public void setWater() {
        System.out.println("step 2: add water");
        getBeverage().setWater(34);
    }

    @Override
    public void setMilk() {
//        System.out.println("step 2: add milk");
//        getBeverage().setMilk(0);
    }
    
    @Override
    public void setCoffeeQuatity() {
//        System.out.println("add coffee");
//        getBeverage().setCoffeeQuatity(0);
    }


    @Override
    public Beverage createBeverage() {
        return new Beverage();
    }

    @Override
    public void setType() {
        System.out.println("tea");
        getBeverage().setName("tea");
    }
    
}
