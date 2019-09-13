package com.playtika.javacourse.pizza;

public class UkrainePizzaMakerFactory implements PizzaMakerFactory {
    public AbstractPizzaMaker getPizzaMaker(Button button) {
        switch (button) {
            case A:return new KarbonaraPizzaMaker();
            case B:return new ForCheesPizzaMaker();
            case C:return new PapperonyPizzMaker();
            case D:return new PoloPizzaMaker();
        }
        return null;
    }

}
