package com.yanshijie;


/**
 * Subject
 *
 * @author Joseph
 * @version 1.0
 * 2019/12/22 8:39
 **/
public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void notifyObservers();

}
