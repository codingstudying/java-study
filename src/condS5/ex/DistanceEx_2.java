package condS5.ex;

public class DistanceEx_2 {

    public static void main(String[] args) {

        int distance = 25;

        if (distance <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (distance <= 5) {
            System.out.println("자전거를 이용하세요.");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요.");
        }

    }
}

//25.09.19 김영한의 자바 입문 - 섹션6.문제와 풀이1 (문제2 / 직접 만든 코드)