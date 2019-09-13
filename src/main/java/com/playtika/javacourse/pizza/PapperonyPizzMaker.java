package com.playtika.javacourse.pizza;

public class PapperonyPizzMaker extends AbstractPizzaMaker {
    public PapperonyPizzMaker() {
        super("Пеперонии");
    }

    @Override
    protected void wrap() {
        System.out.println("Запаковать Пеперонии");
    }

    @Override
    protected void bake() {
        System.out.println("Выпекаем Пеперонни");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngredients() {
        System.out.println("Добавляем zяйца , колбасу , лук для Пеперонни");
    }
}

