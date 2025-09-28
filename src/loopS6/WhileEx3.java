package loopS6;

public class WhileEx3 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int max = 2;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
