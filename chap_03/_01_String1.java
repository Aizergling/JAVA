package chap_03;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환

        //포함 관계
        System.out.println(s.contains("Java")); // 포함 true, 아니면 false
        System.out.println(s.indexOf("Java")); // 위치정보  7
        System.out.println(s.contains("C#"));  // 포함되지않으면 false
        System.out.println(s.indexOf("C#")); // 포함되지 않으면 -1
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치 정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true, 아니면 false
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true
    }
}
