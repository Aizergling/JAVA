package chap_06;

public class _05_Overloading {
    public static int getpower(int number) {
        int result = number * number;
        return result;
        //return number * number;
    }

    public static int getPower(String strNumber) {
        int Number = Integer.parseInt(strNumber);
        return Number * Number;
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달 값이 다르거나
        // 2. 전달 갯수가 다르거나
        System.out.println(getpower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3));
    }
}
