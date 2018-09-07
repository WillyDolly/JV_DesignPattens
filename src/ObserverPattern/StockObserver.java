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
public class StockObserver implements Observer{
//Subject subject;
static int observerID = 0;
    public StockObserver(StockGrabber grabber){
        observerID++;
        System.out.println("observer "+observerID);
        grabber.register(this);
    }
    
    @Override
    public void update(double GooglePrice, double ApplePrice) {
        System.out.println("gPrice: "+GooglePrice+" - "+"aPrice: "+ApplePrice);
    }
    
}
