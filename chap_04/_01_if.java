package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if
        // if문 안에서 두개의 문장을 쓸려면 {}를 무조건 써야함 , 한개의 문장은 {} 생략가능
        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문완료");

        System.out.println("------------------");

        hour = 10;
        boolean mc = true;
        if (hour < 14 && mc == false) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");
    }
}
