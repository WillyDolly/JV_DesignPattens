/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

import java.util.ArrayList;

/**
 *
 * @author hai
 */
public class StockGrabber implements Subject{
    ArrayList<Observer> observers;
    double GooglePrice, ApplePrice;
    
    public StockGrabber(){
        observers = new ArrayList<>();
    }
    
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
        System.out.println("remove "+index);
    }

    @Override
    public void notifyChange() {
        for(Observer o : observers){
            o.update(GooglePrice,ApplePrice);
        } 
    }
    
    void setGooglePrice(double gPrice){
        GooglePrice = gPrice;
        notifyChange();
    }
    
    void setApplePrice(double aPrice){
        ApplePrice = aPrice;
        notifyChange();
    }
}
