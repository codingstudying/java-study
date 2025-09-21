package opertaorS4;

public class Logical2 {

    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20; //(a > 10) && (a < 20)
        System.out.println("result = " + result);
    }
}

//25.09.18 김영한의 자바 입문 - 섹션4.연산자 - 22.논리 연산자