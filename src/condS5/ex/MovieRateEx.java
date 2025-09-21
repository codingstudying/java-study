package condS5.ex;

public class MovieRateEx {

    public static void main(String[] args) {
        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }

        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }

        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}

//25.09.19 김영한의 자바 입문 - 섹션6.문제와 풀이2 (문제4의 정답)