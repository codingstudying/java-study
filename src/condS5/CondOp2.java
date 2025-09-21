package condS5;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}

//25.09.19 김영한의 자바 입문 - 섹션5.조건문 - 30.삼향 연산자