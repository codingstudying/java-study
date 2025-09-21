package condS5;

public class IF3 {

    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        }
        if (age >=8 && age <= 13) {
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 10) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
    }
}

//25.09.18 김영한의 자바 입문 - 섹션5.조건문 - 26.if문1 - else if