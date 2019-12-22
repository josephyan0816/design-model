package com.yanshijie.design;

/**
 * Subject
 *
 * @author Joseph
 * @version 1.0
 * 2019/12/22 9:08
 **/
public interface Subject {

    //增加订阅用户
    public void add(Observer o);

    //删除订阅用户
    public void remove(Observer o);


    //通知订阅者更新信息
    public void notify(String message);


}
