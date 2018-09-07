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
public interface Subject {
     void register(Observer o);//add to ArrayList
    void unregister(Observer o);//remove from ArrayList
    void notifyChange();
}
