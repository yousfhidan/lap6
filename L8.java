import java.util.Scanner;

public class L8 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int number;

        System.out.println("------------------");
        System.out.println("Enter The number :");
        System.out.println("------------------");
        number=in.nextInt();


     for (int i=0;i<=number;i++ ){
         if (i%2==1)
             System.out.println(i);

    }
        if (number%2!=1)

        System.out.println(number);
    }}