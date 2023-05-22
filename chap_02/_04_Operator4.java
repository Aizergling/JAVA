package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 | 계란말이 | 제육볶음); // 하나라도 true 이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true

        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고, 3은 1보다 크다
        System.out.println((5 > 3) && (3 < 1));

        // OR 연산
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나, 3은 1보다 크다
        System.out.println((5 > 3) || (3 < 1));
        System.out.println((5 < 3) || (3 < 1));
    }
}
