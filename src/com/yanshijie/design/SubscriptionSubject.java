package com.yanshijie.design;

import java.util.ArrayList;

/**
 * SubscriptionSubject
 *
 * @author Joseph
 * @version 1.0
 * 2019/12/22 9:15
 **/
public class SubscriptionSubject implements Subject{
    private ArrayList<Observer> wxUsers=new ArrayList<>();

    @Override
    public void add(Observer o) {
        wxUsers.add(o);
    }

    @Override
    public void remove(Observer o) {
        int i=wxUsers.indexOf(o);
        if(i>=0)
        {
            wxUsers.remove(i);
        }
    }

    @Override
    public void notify(String message) {
        for (Observer wxUser : wxUsers) {
            wxUser.update(message);
        }
    }
}
