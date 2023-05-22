package My_First_Project;

import java.util.Scanner;

// 주민등록번호로 남,여 구분

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호 => ");
        String Number = scanner.nextLine();

        if (Number.length() >= Number.length()+1) {
            char sevenChar = Number.charAt(7);
            if (sevenChar == '1' || sevenChar == '3') {
                System.out.println("남자");
            } else if (sevenChar == '2' || sevenChar == '4') {
                System.out.println("여자");
            }
        } else {
            System.out.println("올바른 주민등록번호가 아닙니다.");
        }

        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("문자열을 입력하세요: ");
//        String input = scanner.nextLine();
//
//        if (input.length() >= 7) {
//            char seventhChar = input.charAt(6);
//            System.out.println("7번째 문자: " + seventhChar);
//        } else {
//            System.out.println("입력한 문자열이 너무 짧습니다.");
//        }
//
//        scanner.close();
    }
}
