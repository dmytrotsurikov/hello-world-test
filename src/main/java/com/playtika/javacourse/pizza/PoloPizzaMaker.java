package com.playtika.javacourse.pizza;

public class PoloPizzaMaker extends AbstractPizzaMaker{
    public PoloPizzaMaker() {
        super("Запаковать Поло");
    }

    @Override
    protected void wrap() {
        System.out.println("Запаковать Поло");
    }

    @Override
    protected void bake() {
        System.out.println("Выпекаем Поло");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void putIngredients() {
        System.out.println("Добавляем 1 Мясо , 2 Колбаса , 3 Сыр, 4 Майонез для Поло");
    }
}
