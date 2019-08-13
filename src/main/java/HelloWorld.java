import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
       // int a = 1;
       // int b = 2 ;
       // System.out.println( a  +  " Hello world! " + b );
      //   System.out.printf("%d плюс %d  ",  a,b) ;
        Scanner scanner= new  Scanner(System.in) ;
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        System.out.printf("%d * %d = %d", x, y,  x * y );
    }

}
