package loopS6;

public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        //1+2+3 = 6

        for (int i = 1; i <= endNum; i++) {
            sum = sum + 1;
            System.out.println("i=" + i + " sum" + sum);
        }
    }
}

//25.09.24 김영한의 자바 입문 - 섹션6.반복문 - 39.for문1