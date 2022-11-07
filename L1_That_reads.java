import java.io.PrintStream;
import java.util.Scanner;

public class L1_That_reads {

    public static void main(String[] args) {
       int year=0;
        Scanner in=new Scanner(System.in);
        double balance,rete;

        System.out.println("--------------------------------------");
        System.out.println("Enter The Initial Investment Balance :");

        System.out.println("--------------------------------------");
        balance= in.nextInt();
        System.out.println("--------------------------");
        System.out.println("Enter The  Interest Rate :");
        System.out.println("--------------------------");

        rete=in.nextInt();
        rete*=0.01;

         for (;;){

        balance+=balance*rete;
        if (balance>=1000000)break;

        else year++;

    }
        System.out.println("__________________________");
        System.out.println("The number of years is :"+year);
        System.out.println("                        ---");
    }


}
