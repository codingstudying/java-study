package scannerS8;

import java.util.Scanner;

public class scannerWhle3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료):");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            sum += number; //sum = sum + number
        }
        System.out.println("입력한 모든 정수의 합: " + sum);
    }
}

//25.09.26 김영한의 자바 입문 - 섹션8.훈련 - 53.Scanner - 반복 예제