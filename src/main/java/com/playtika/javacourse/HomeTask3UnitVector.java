package com.playtika.javacourse;

   public class HomeTask3UnitVector {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0;

    double ModuleVector = Math.sqrt(x * x + y * y +z * z);

        double UnitVectorX = (x / ModuleVector);
        double UnitVectorY = (y / ModuleVector);
        double UnitVectorZ = (z / ModuleVector);
      /*  System.out.println(UnitVectorX);
        System.out.println(UnitVectorY);
        System.out.println(UnitVectorZ); */

        System.out.printf("Единичный вектор для вектора (x:%d y:%d z:%d)",  x, y, z );
    }



}
