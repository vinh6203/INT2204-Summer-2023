package Controller.WindowsController;

import java.io.IOException;

import Controller.DictionaryManagement;
import Model.Word;
import Model.Dictionary;
import View.windows.AddWindow;

public class AddWindowController {
    private static AddWindow addWindow = new AddWindow();

    public static void addNewWord(String word_target, String word_explain) {
        try {
            addWord(word_target, word_explain);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    /**
     * Add word to dictionary.
     */
    public static void addWord(String word_target, String word_explain) throws IOException {
        Word word = new Word(word_target, word_explain);
        Dictionary.dict.add(word);
        DictionaryManagement.wordTrie.insertWordToTrie(word);
    }

    /**
     * Somehow dispose method don't clear all the data so we close (dispose)
     * and then create a new find Window object.
     */
    public static void disposeWindow() {
        addWindow.closeWindow();
        addWindow = new AddWindow();
    }

    public static void openWindow() {
        addWindow.displayWindow();
    }
}
