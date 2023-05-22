package chap_09_.Coffee;

public class CoffeeByName {
    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커미 준비 완료 : " + name);
    }
}
