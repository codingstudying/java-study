package condS5.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {

        int dollar = 10;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }
}

//25.09.19 김영한의 자바 입문 - 섹션6.문제와 풀이1 (문제3의 정답)