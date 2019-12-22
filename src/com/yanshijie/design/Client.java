package com.yanshijie.design;

/**
 * Client
 *
 * @author Joseph
 * @version 1.0
 * 2019/12/22 9:21
 **/
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        WxUser user1 = new WxUser("达达");
        WxUser user2 = new WxUser("涛涛");
        WxUser user3 = new WxUser("飞飞");

        subscriptionSubject.add(user1);
        subscriptionSubject.add(user2);
        subscriptionSubject.add(user3);

        subscriptionSubject.notify("我的专栏更新了");
    }
}
