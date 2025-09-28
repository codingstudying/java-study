package ScopeS7;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m); // 블록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } //i 생존 종료

        //System.out.println("main i = " +i);
        System.out.println("main m = " +m);

    }
}

//25.09.25 김영한의 자바 입문 - 섹션7.스코프, 형변환 - 45.스코프1 - 지역 변수와 스코프