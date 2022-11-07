import java.util.Scanner;
public class L7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number;
int binary;
        System.out.println("------------------");
        System.out.println("Enter The number :");
        System.out.println("------------------");
        number=in.nextInt();
        System.out.println("--");
    for (;;) {
        if (number == 0) break;

        binary = (number % 2 == 1) ? 1 : 0;
        number = number / 2;

        System.out.println( binary);
    }}}
