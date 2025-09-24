package loopS6;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

//25.09.24 김영한의 자바 입문 - 섹션6.반복문 - 38.break, continue