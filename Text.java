import java.util.ArrayList;
import java.util.List;

class Text {
    private final List<Sentence> sentences;

    public Text(StringBuffer text) {
        sentences = new ArrayList<>();
        String[] sentenceArray = text.toString().split("[.!?]\\s*");
        for (String sentence : sentenceArray) {
            sentences.add(new Sentence(new StringBuffer(sentence)));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }
}
