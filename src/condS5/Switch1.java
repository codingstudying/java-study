package condS5;

public class Switch1 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}

//25.09.19 김영한의 자바 입문 - 섹션5.조건문 - 29.switch문