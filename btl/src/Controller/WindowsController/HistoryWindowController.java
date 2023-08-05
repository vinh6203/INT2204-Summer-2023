package Controller.WindowsController;

import java.util.Stack;

import Controller.DictionaryManagement;
import Model.Dictionary;
import Model.Word;
import View.buttons.HistoryButton;
import View.windows.HistoryWindow;

public class HistoryWindowController {
    public static Stack<Word> getHistoryWordsStack() {
        return Dictionary.getHistoryWords();
    }

    public static void clearHistoryWordsStack() {
        Dictionary.clearHistoryWords();
        try {
            DictionaryManagement.dictionaryExportToHistory();

            HistoryButton.historyWindow.closeWindow();
            HistoryButton.historyWindow = new HistoryWindow();
            HistoryButton.historyWindow.displayWindow();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
