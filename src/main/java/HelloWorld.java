import java.util.Scanner;

public class HelloWorld {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int z;
        if (c < min(a,b) && c < d)
            z = c;
        else
            z = d;
        return z;

    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int m;
        if (a < b)
            m = a;
        else
            m = b;
        return m;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}
