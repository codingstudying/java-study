package scannerS8;

import java.util.Scanner;

public class scannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(exit: 종료):");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }

    }
}

//25.09.26 김영한의 자바 입문 - 섹션8.훈련 - 52.Scanner - 기본 예제