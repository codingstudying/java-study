package ScopeS7;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

//25.09.25 김영한의 자바 입문 - 섹션7.스코프, 형변환 - 46.스코프2 - 스코프 존재 이유