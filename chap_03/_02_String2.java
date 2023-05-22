package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and", ",")); // " and" 를 ","로 변환하게 됨.
        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));

        // 공백 제거
        s = "      I love Java.       ";
        System.out.println(s);
        System.out.println(s.trim()); // 불필요한(앞, 뒤) 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
