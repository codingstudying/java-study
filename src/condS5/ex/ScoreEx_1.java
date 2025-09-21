package condS5.ex;

public class ScoreEx_1 {

    public static void main(String[] args) {

        int score = 95;
        String result;

        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else if (score >= 60) {
            result = "D";
        } else {
            result = "F";
        }
        System.out.println("score: " + score);
        System.out.println("학점은 " + result + "입니다.");
    }
}

//25.09.19 김영한의 자바 입문 - 섹션6.문제와 풀이1 (문제1 / 직접 만든 코드)