package loopS6;

public class Nested1 {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for 시작 i:" +i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for " + i + "-" +j);
            }
            System.out.println("외부 for 종료 i:" + i);
            System.out.println();
        }
    }
}

//25.09.24 김영한의 자바 입문 - 섹션6.반복문 - 41.중첩 반복문