package com.playtika.javacourse.pizza;

public abstract class AbstractPizzaMaker {
    private final String pizzaName ;

    protected AbstractPizzaMaker(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String makePizza() {
        takeBlank();
        putIngredients();
        bake();
        slice();
        wrap();
        return pizzaName;
    }

    protected abstract void wrap();




    protected abstract void bake() ;

    protected abstract void putIngredients();

    private void takeBlank() {
        System.out.println("Берем заготовку");
    }
    private void slice() {
        System.out.println("Разрезаем на 6 порций");
    }
}
