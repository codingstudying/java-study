package opertaorS4;

public class Comp1 {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과물 boolean  변수에 담음
        boolean result = a == b;
        System.out.println(result);
    }
}

//25.09.18 김영한의 자바 입문 - 섹션4.연산자 - 21.비교 연산자