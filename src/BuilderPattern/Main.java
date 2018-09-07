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
public class Main {
    public static void main(String[] args) {
        Waiter w = new Waiter();
        Beverage tea = w.takeOrder("tea");
        System.out.println(tea);
        
        Beverage coffee = w.takeOrder("coffee");
        System.out.println(coffee);
    }
    
    //Builder's model: client  ->   Builder
                             //{ parent object }  <- Object class
                             //{ method build consist of abstract methods }
    //     child Object 1 <-                   -> child Object 2
    //                   implement abstract methods
}
