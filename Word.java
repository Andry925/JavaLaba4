
import java.util.List;
import java.util.ArrayList;

class Word {
    private final List<Letter> letters;

    public Word(StringBuffer word) {
        letters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            letters.add(new Letter(word.charAt(i)));
        }
    }

    public int getVowelCount() {
        int count = 0;
        for (Letter letter : letters) {
            if (letter.isVowel()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder wordBuilder = new StringBuilder();
        for (Letter letter : letters) {
            wordBuilder.append(letter.getCharacter());
        }
        return wordBuilder.toString();
    }
}