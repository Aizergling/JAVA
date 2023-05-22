package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case

        int ranking = 1;
        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        ranking = 3;
        switch (ranking) { // 조건
            case 1 : // 값 불일치 (미 실행)
                System.out.println("전액 장학금");
                break;
            case 2 : // 값 불일치 (미 실행)
                System.out.println("반액 장학금");
                break;
            case 3 : // 값 일치 (실행)
                System.out.println("반액 장학금");
                break; // case문 탈출
            default: // 조건이 전부 불일치 하면 실행
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");
    }
}
