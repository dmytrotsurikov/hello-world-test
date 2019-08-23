package Game;

import java.util.concurrent.ThreadLocalRandom;

public class LetterMixer {

    public String mix (String word) {
        String mixedWord = mixLetter(word);
        while (word.equals(mixedWord)); {
            mixedWord = mixLetter(word);
        }
        return mixedWord;

    }
        private String  mixLetter(String word) {
            char[] letters = word.toCharArray();

            for(int i = 0; i < letters.length; i++) {
                char temp = letters[i];
                int index = ThreadLocalRandom.current().nextInt(word.length());
                letters [i]=letters[index];
                letters [index] = temp;
        }
            return new String(letters);
    }
}
