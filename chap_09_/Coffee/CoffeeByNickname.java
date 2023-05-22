package chap_09_.Coffee;

public class CoffeeByNickname {
    public String nickname;

    public CoffeeByNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 준비 완료 :" + nickname);
    }
}
