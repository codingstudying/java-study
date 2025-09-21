package condS5.ex;

public class MovieRateEx_4 {

    public static void main(String[] args) {

        double rating = 7;

        if (rating > 8) {
            System.out.println("'어바웃타임'을 추천합니다.");
        } else if (rating > 7) {
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이 스토리'를 추천합니다.");
        } else {
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이 스토리'를 추천합니다.");
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}

//25.09.19 김영한의 자바 입문 - 섹션6.문제와 풀이2 (문제4 / 직접 만든 코드)