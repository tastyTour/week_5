import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do{
            System.out.print("숫자를 입력하세요 : ");
            a = sc.nextInt();
        }while (a<=0);
        System.out.println("입력한 값은 : " + a);
    }
}
