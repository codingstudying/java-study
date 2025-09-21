package opertaorS4;

public class operatorAdd1 {

    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

        a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자
        ++a; //a = a + 1
        System.out.println("a = " + a); //3
        ++a; //a = a + 1
        System.out.println("a = " + a); //
    }
}

//25.09.18 김영한의 자바 입문 - 섹션4.연산자 - 20.증감 연산자
