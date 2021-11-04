package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        words.add(word);
    }

    void getWordsStartWith(String prefix) {
        List<String> removeWords = new ArrayList<>();
        for (String word: words
             ) {
            if (!word.startsWith(prefix)){
                removeWords.add(word);
            }
        }
        words.removeAll(removeWords);
    }

    void getWordsWithLength(int length) {
        List<String> removeWords = new ArrayList<>();
        for (String word: words
        ) {
            if (word.length() != length){
                removeWords.add(word);
            }
        }
        words.removeAll(removeWords);
    }
}
