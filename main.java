import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        L2 in=new L2();
        in.TheSumOfAllEvenNumber();



        System.out.println(in.TheSumOfAllOddnumber(0,10));

        Scanner yu=new Scanner(System.in);
        String input=yu.nextLine();
        int length=input.length();
        int sum=0;
        int dig=0;
        for (int i=0;i<length;i++) {
            if (length % 2 == 1) {
                sum += i;
                System.out.println(sum);
            }

        }

    }

}
