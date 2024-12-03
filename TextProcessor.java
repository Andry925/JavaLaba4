import java.util.List;




class TextProcessor {

    public static void sortWordsByVowelCount(List<Word> words) {
        words.sort((w1, w2) -> Integer.compare(w1.getVowelCount(), w2.getVowelCount()));
    }

   
    public static StringBuffer processText(Text text) {
        StringBuffer sortedText = new StringBuffer();

        for (Sentence sentence : text.getSentences()) {
            List<Word> words = sentence.getWords();
            sortWordsByVowelCount(words);
            for (int i = 0; i < words.size(); i++) {
                sortedText.append(words.get(i).toString());
                if (i < words.size() - 1) {
                    sortedText.append(" ");
                }
            }
            sortedText.append(". ");
        }

        return new StringBuffer(sortedText.toString().trim());
    }
}