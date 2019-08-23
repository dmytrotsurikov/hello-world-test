package Game;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class GuessingGame {

        private final LetterMixer letterMixer;
        private final WordSource wordSource;
        private final Scanner scanner;

        public GuessingGame(Scanner scanner) {
            letterMixer = new LetterMixer();
            wordSource = new WordSource();
            this.scanner = scanner;

        }

        public void playGame(){
            String word = wordSource.getWord();
            String mixedWord = letterMixer.mix(word);
            System.out.printf("Guess a word: %s%n", mixedWord);
            String inputWord = scanner.nextLine();
            while (!word.equals(inputWord)) {
                System.out.println("You are wrong. Pls try again");
                inputWord = scanner.nextLine();

            }
            System.out.println("Good job");

    }

    public static void main(String[] args) {
            GuessingGame game = new GuessingGame(new Scanner(System.in));
            game.playGame();

    }
}
