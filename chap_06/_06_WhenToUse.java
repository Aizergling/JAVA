package chap_06;

public class _06_WhenToUse {
    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 똑같은 작업을 계속 쓰면 유지 보수가 어려움


        //2의 2승 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);
    }
}
