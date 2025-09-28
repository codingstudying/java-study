package castingS7;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue;// 컴파일 오류 발생
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}

//25.09.25 김영한의 자바 입문 - 섹션7.스코프, 형변환 - 48.형변환2-자동 형변환