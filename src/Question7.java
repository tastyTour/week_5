import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");

        int a = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
