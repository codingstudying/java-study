package loopS6;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}

//25.09.24 김영한의 자바 입문 - 섹션6.반복문 - 38.break, continue