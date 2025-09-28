package castingS7;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting= " + intValue);

        intValue = (int) maxIntOver; //형변환 (오버플로우)
        System.out.println("maxInOver casting= " + intValue);
    }
}

//25.09.25 김영한의 자바 입문 - 섹션7.스코프, 형변환 - 48.형변환2-자동 형변환