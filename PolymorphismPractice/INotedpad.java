package homework;

public interface INotedpad {
    void addTextTo(String text,int page);
    void overwriteTextOf(String text,int page);
    void deleteTextOf(int page);
    void showPages();
    void searchWord(String word);
    void printAllPagesWithDigits();

}
