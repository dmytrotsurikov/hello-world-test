package com.playtika.javacourse;

public class HT1 {
    static  int x = 150;
    static  int y = 400;
    static  int z = 1566816;
    static   int n = 68468168;
    static long ex1 = x - (y + 123) / z * n;
    static  int ex2 = (x + (50 - y * z) / n) - x;
    static float ex3 = x / (y * (z - 1) - 564) + n;
    static  double ex4 = -x / -y + z / (n + 15);

    public static void main(String[] args) {
        System.out.println("Long result=" + ex1);
        System.out.println("int result2=" + ex2);
        System.out.println("float result3=" + ex3);
        System.out.println("double result4=" + ex4);

    }
}
