package com.playtika.javacourse.pizza;

public class ForCheesPizzaMaker extends AbstractPizzaMaker {
    public ForCheesPizzaMaker() {
        super("4 Сыра");
    }

    @Override
    protected void wrap() {
        System.out.println("Запаковать 4 Сыра");
    }

    @Override
    protected void bake() {
        System.out.println("Выпекаем 4 Сыра");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngredients() {
        System.out.println("Добавляем 1 Сыр , 2Сыр , 3Сыр, 4Сыр для 4Сыра");
    }
}


