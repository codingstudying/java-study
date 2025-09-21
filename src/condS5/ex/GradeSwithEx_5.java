package condS5.ex;

public class GradeSwithEx_5 {

    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다.");
                break;
            case "B":
                System.out.println("좋은 성과입니다.");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("탁월한 성과입니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }

    }
}

//25.09.19 김영한의 자바 입문 - 섹션6.문제와 풀이2 (문제5 / 직접 만든 코드)