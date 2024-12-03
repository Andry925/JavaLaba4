import java.util.ArrayList;
import java.util.List;


class Sentence {
    private final List<Word> words;

    public Sentence(StringBuffer sentence) {
        words = new ArrayList<>();
        String[] wordArray = sentence.toString().split("\\s+");
        for (String word : wordArray) {
            words.add(new Word(new StringBuffer(word)));
        }
    }

    public List<Word> getWords() {
        return words;
    }
}