package ScopeS7;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + m);
        } //x 생존 종료
        //System.out.println("main x = " + x);
        System.out.println("main m = " + m);
    } //m 생존 종료
}

//25.09.25 김영한의 자바 입문 - 섹션7.스코프, 형변환 - 45.스코프1 - 지역 변수와 스코프