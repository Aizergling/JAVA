package My_First_Project._Game;

import java.util.Random;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int Dice_Number = random.nextInt(6) + 1;
        int My_Number = random.nextInt(6) + 1;

        System.out.println("컴퓨터의 숫자 : " + Dice_Number);
        System.out.println("당신의 숫자 : " + My_Number);
        if (Dice_Number < My_Number) {
            System.out.println("당신이 승리하셨습니다.");
        } else if (Dice_Number == My_Number) {
            System.out.println("비기셨습니다.");
        } else if (Dice_Number > My_Number) {
            System.out.println("당신이 패배하였습니다.");
        }
    }
}
