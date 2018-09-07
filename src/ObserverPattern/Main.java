/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

/**
 *
 * @author hai
 */
public class Main {
    public static void main(String[] args) {
        StockGrabber grabber = new StockGrabber();
        
        StockObserver observer1 = new StockObserver(grabber);
        grabber.setGooglePrice(23.4);
        grabber.setApplePrice(445.7);
        
         //grabber.unregister(observer1);
         
        StockObserver observer2 = new StockObserver(grabber);
        grabber.setGooglePrice(363.4);
        grabber.setApplePrice(7888.34);
        
                grabber.unregister(observer2);

    }
}
