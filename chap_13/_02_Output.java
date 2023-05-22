package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format()
        // System.out.printf();
        System.out.println("-----------------정수-------------------");
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d %n", 1,2,3); // 1 2 3
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n", 1234); // __1234 (6자리의 공간을 확보하고 1234 출력)
        System.out.printf("%06d%n", 1234); // 001234 (6자리의 공간 확보 후 1234 출력, 빈 공간은 0으로 채움)
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234
        System.out.printf("%,15d%n", 1000000000); // __1,000,000,000 (세 자리마다 콤마로 구분)
        System.out.printf("%-6d%n", 1234); // 1234__ (왼쪽 정렬)

        System.out.println("---------------실수---------------------");
        System.out.printf("%f%n", Math.PI); // 3.14159... (일반 출력)
        System.out.printf("%.2f%n", Math.PI); // 3.14 (소수점 둘째자리)
        System.out.printf("%6.2f%n", Math.PI); // __3.14
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__
        System.out.printf("%06.2f%n", Math.PI); // 003.14
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14

        System.out.println("--------------문자열--------------------");
        System.out.printf("%s%n", "Java"); // Java
        System.out.printf("%6s%n", "Java"); // __Java
        System.out.printf("%-6s%n", "Java"); // Java__
        System.out.printf("%6.2s%n", "Java"); // ____Ja (문자열 중 2글자만)
        System.out.printf("%-6.2s%n", "Java"); // Ja____

        System.out.println("----------------응용----------------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호" + 90 + " " + 80 + " " + 85.0);
        System.out.println("서태웅" + 100 + " " + 100 + " " + 100.0);
        System.out.println("채지수" + 95 + " " + 100 + " " + 97.5);

        System.out.println("----------------응용2----------------");
        System.out.println("이름      영어   수학   평균"); // 공백 6,3,3
        System.out.printf("%-6s %4d %4d %6.1f %n", "강백호",90,80,85.0);
        System.out.printf("%-6s %4d %4d %6.1f %n", "서태웅",100,100,100.0);
        System.out.printf("%-6s %4d %4d %6.1f %n", "채지수",95,100,97.5);

        System.out.println("-----------참고--------------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
        // 한, 영, 숫자 모두 포함하는 공간이 다름
    }
}
