package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        //주차 1시간당 4000원 일일 최대 30000원
        // 경차 장애인 최종 금액에서 반값.
        int hour = 5;
        boolean SmallCar = false; //경차여부
        boolean Person = false; // 장애인 차량 여부

        int fee = hour * 4000; // 시간 당 금액
        if (fee > 30000) {
            fee = 30000; // 일일 최대 요금
        }
        if ( SmallCar || Person) {
            fee = fee / 2; //50% 할인 적용
        }
        System.out.println("주차요금은 " + fee + "원입니다.");
    }
}
