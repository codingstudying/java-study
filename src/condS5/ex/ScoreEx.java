package condS5.ex;

public class ScoreEx {

    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("학접은 A입니다.");
        } else if (score >= 80) {
            System.out.println("학접은 B입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("학점은 F입니다.");
        }
    }
}

//25.09.19 김영한의 자바 입문 - 섹션6.문제와 풀이1 (문제1의 정답)