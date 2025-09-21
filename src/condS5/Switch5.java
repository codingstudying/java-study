package condS5;

public class Switch5 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}

//25.09.19 김영한의 자바 입문 - 섹션5.조건문 - 29.switch문