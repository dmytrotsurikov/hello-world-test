package com.playtika.javacourse.pizza;

public class PizzaAutomat {
    public static void main(String[] args) {
        UkrainePizzaMakerFactory factory = new UkrainePizzaMakerFactory();
        String pizza= factory.getPizzaMaker(Button.B)
                .makePizza();
        System.out.println(pizza);
         pizza= factory.getPizzaMaker(Button.A)
                .makePizza();
        System.out.println(pizza);
         pizza= factory.getPizzaMaker(Button.C)
                .makePizza();
        System.out.println(pizza);
         pizza= factory.getPizzaMaker(Button.D)
                .makePizza();
        System.out.println(pizza);


    }
}
