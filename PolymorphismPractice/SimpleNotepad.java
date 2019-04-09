package homework;

public class SimpleNotepad implements INotedpad{
    final private String ownerName;
    private Page[] pages;
    public SimpleNotepad(String ownerName,int numberOfPages){
        if(ownerName != null && !ownerName.isEmpty()){
            this.ownerName = ownerName;
        }else{
            this.ownerName = "no one";
        }
        if(numberOfPages < 1){
            this.pages = new Page[5];
        }else {
            this.pages = new Page[numberOfPages];
        }
        for (int i = 0; i < pages.length; i++) {
            pages[i] = new Page("page " + (i+1));
        }
    }

    @Override
    public void addTextTo(String text, int page) {
        if(page > 0 && page <= this.pages.length && text != null){
            this.pages[page-1].addText(text);
            System.out.println("text added successfully");
        }else{
            System.out.println("error! bad input");
        }
    }

    @Override
    public void overwriteTextOf(String text, int page) {
        if(page > 0 && page <= this.pages.length && text != null){
            this.pages[page-1].deleteText();
            this.pages[page-1].addText(text);
            System.out.println("text changed successfully");
        }else{
            System.out.println("error! bad input");
        }
    }

    @Override
    public void deleteTextOf(int page) {
        if(page > 0 && page <= this.pages.length){
            this.pages[page].deleteText();
            System.out.println("text deleted successfully");
        }else{
            System.out.println("error! bad input");
        }
    }
    @Override
    public void showPages() {
        for (int i = 0; i < this.pages.length; i++) {
            this.pages[i].previewPage();
        }
    }

    @Override
    public void searchWord(String word) {
        if(word != null && !word.isEmpty()) {
            for (int i = 0; i < this.pages.length; i++) {
                if (this.pages[i].searchWord(word)) {
                    System.out.println("page " + (i + 1) + " contains the word " + word);
                }
            }
        }
    }

    @Override
    public void printAllPagesWithDigits() {
        for (int i = 0; i < this.pages.length; i++) {
            if(this.pages[i].containsDigits()){
                this.pages[i].previewPage();
            }
        }

    }
}
