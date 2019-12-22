package com.yanshijie.design;

/**
 * WxUser
 *
 * @author Joseph
 * @version 1.0
 * 2019/12/22 9:12
 **/
public class WxUser implements Observer{
    private String name;

    public WxUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"-->"+message);
    }
}
