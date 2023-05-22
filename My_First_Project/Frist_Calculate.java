package My_First_Project;

// 계산기 만들기

import java.util.Scanner;

public class Frist_Calculate {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("계산할 숫자의 개수를 입력하세요: ");
                int count = scanner.nextInt();

                if (count <= 0) {
                    System.out.println("유효하지 않은 개수입니다.");
                    scanner.close();
                    return;
                }

                double result = 0;

                System.out.print("첫 번째 숫자를 입력하세요: ");
                result = scanner.nextDouble();

                for (int i = 2; i <= count; i++) {
                    System.out.print("연산자 (+, -, *, /)를 입력하세요: ");
                    String operator = scanner.next();

                    System.out.print("숫자 #" + i + "를 입력하세요: ");
                    double number = scanner.nextDouble();

                    switch (operator) {
                        case "+":
                            result += number;
                            break;
                        case "-":
                            result -= number;
                            break;
                        case "*":
                            result *= number;
                            break;
                        case "/":
                            if (number != 0) {
                                result /= number;
                            } else {
                                System.out.println("0으로 나눌 수 없습니다.");
                                scanner.close();
                                return;
                            }
                            break;
                        default:
                            System.out.println("올바른 연산자를 입력하세요.");
                            scanner.close();
                            return;
                    }
                }

                System.out.println("계산 결과: " + result);

                scanner.close();
            }


    }
