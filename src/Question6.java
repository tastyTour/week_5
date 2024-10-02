import java.util.Scanner;


public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int result = 0;
        System.out.print("첫 번째 숫자를 입력하시오 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하시오 : ");
        int b = sc.nextInt();

        while (a != b) {
            if (a >= b) {
                a -=b;
            }else {
                b -= a;
            }
        }
        System.out.println(a);
    }
}
