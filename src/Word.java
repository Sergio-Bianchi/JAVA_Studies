import java.lang.String;

/**
 * @author Sergio Bianchi
 * @version 12.12.2024
 * The class Word provides an interface for a String with an associated occurrences counter
 * */
public class Word {
    private long occurrences;
    private String word;

    /**
     * @return the number of occurrences
     * */
    public long getOccurrences() {
        return occurrences;
    }

    /**
     * @return the word
     * */
    public String getWord() {
        return word;
    }

    /** Converts the Word to a String
     * @return the corresponded String
     * */
    public String toString() {
        return getWord();
    }

    /** Change the content of the Word
     * @param word      The new word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /** Set the number of occurrences of the Word
     * @param occurrences   The new number of occurrences
     * */
    public void setOccurrences(long occurrences) {
        this.occurrences = occurrences;
    }

    /** Add an occurrence to the Word
     */
    public void addOccurrence() {
        this.occurrences++;
    }





    public Word(String word) {
        this.word = word;
        occurrences = 1;
    }


}
