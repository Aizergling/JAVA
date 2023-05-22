package chap_09_.Coffee;

import chap_09_.User.User;

public class CoffeeByUser <T extends User>{
    public T User;

    public CoffeeByUser(T user) {
        User = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + User.name);
        User.addPoint();
    }
}
