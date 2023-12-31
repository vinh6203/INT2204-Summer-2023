package Model;

public class Word {
    private String word_target;
    private String word_explain;

    // Constructor 1
    public Word() {
        word_target = new String();
        word_explain = new String();
    }

    // Constructor 2
    public Word(String word_target, String word_explain) {
        this.word_target = word_target.trim();   // remove whitespace both ends
        this.word_explain = word_explain.trim(); // remove whitespace both ends
    }

    public String getWordTarget() {
        return this.word_target;
    }

    public void setWordTarget(String word_target) {
        this.word_target = word_target;
    }

    public String getWordExplain() {
        return this.word_explain;
    }

    public void setWordExplain(String word_explain) {
        this.word_explain = word_explain;
    }

    public String toString() {
        return "Dictionary{" +
                ", word_target='" + word_target + '\'' +
                ", word_explain='" + word_explain + '\'' +
                "}";
    }
}
