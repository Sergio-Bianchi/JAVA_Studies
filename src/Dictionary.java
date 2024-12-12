import javax.print.DocFlavor;
import java.lang.String;
import java.util.Objects;

public class Dictionary {
    private Word[] words;

    private int wordsCount;


    public static void main(String[] args) {
        Dictionary dic = new Dictionary();

        dic.addWord("casdiao");
        dic.addWord("ciao!");
        dic.addWord("asdf!");
        dic.addWord("casdissfgfdgao!");
        dic.addWord("sadasdf");
        dic.addWord("asfgd");
        dic.addWord("dfsfgsg");
        dic.addWord("sgfdfadf");
        dic.addWord("ssfsaddgsadf");
        dic.addWord("sfdasdgsadf");
        dic.addWord("asfgd");
        dic.addWord("dfsasdfasdgsg");
        dic.addWord("sgfasdfadf");
        dic.addWord("ssfdgsadf");
        dic.addWord("sfdasgsadf");

        System.out.print(dic);



    }


    /**
     * Returns an empty Dictionary
     */
    public Dictionary() {
        words = new Word[100];
    }

    /**
     * Returns a Dictionary with all the Words in a provided String
     *
     * @param phrase The phrase you want to split into Words
     */
    public Dictionary(String phrase) {

    }

    /**
     * Return a Dictionary with all the Words of a specified length
     *
     * @param l The length of the words you want to search
     */
    public Dictionary wordsLongL(int l) {
        Dictionary newDictionary = new Dictionary();
        for (Word w : words) {

        }

        return newDictionary;
    }


    /*==== "ADD" METHODS ====*/

    /**
     * Add the words provided in the phrase to the dictionary
     *
     * @param phrase the phrase you want to add to the dictionary
     */
    public void addPhrase(String phrase) {

    }

    public void addWord(String word) {

        for (Word w : words) {
            if (w != null && w.toString().equals(word)) {
                w.addOccurrence();
                return;
            }
        }

        if (wordsCount < words.length) {
            words[wordsCount] = new Word(word);
            wordsCount++;
        }
    }

    public void addWord(Word word) {

    }


    /**
     * Check if a Word is present in the Dictionary
     *
     * @param word The Word you want to know if exists
     */
    public Boolean exists(String word) {
        for (Word w : words) {
            if (w.toString().equals(word)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Returns the number of occurrences of the provided String
     *
     * @param word The word you want to know the occurrences
     */
    public long occurrences(String word) {
        return 0;
    }

    /**
     * Returns the number of occurrences of the provided Word
     *
     * @param word The word you want to know the occurrences
     */
    public long occurrences(Word word) {
        return 0;
    }




    /*==== MISC METHODS ====*/


    public Dictionary(Dictionary toClone) {
        Dictionary cloned = new Dictionary();
        for (Word w : toClone.words) {
            cloned.addWord(w.toString());
        }
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%15s | %-10s %n", "OCCURRENCES", "WORD"));
        output.append("------------------------\n");
        for (int i = 0; i < wordsCount; i++) {
            Word w = words[i];
            output.append(String.format("%015d | %s %n", w.getOccurrences(), w));
        }
        return output.toString();
    }

    /*==== PRIVATE METHODS ====*/


    private int getMaxWords() {
        return words.length;
    }

    private int getWordsLength() {
        return words.length;
    }


}
