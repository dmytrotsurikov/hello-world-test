package com.playtika.javacourse.pizza;

public class KarbonaraPizzaMaker extends AbstractPizzaMaker {
    public KarbonaraPizzaMaker() {
        super("Карбонару");
    }

    @Override
    protected void wrap() {
        System.out.println("Запаковать Карбонару");
    }

    @Override
    protected void bake() {
        System.out.println("Выпекаем Карбонару");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngredients() {
        System.out.println("Добавляем zяйца , колбасу , лук для Карбонары");
    }
}
