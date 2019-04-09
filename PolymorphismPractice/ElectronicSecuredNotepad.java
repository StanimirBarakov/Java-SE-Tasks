package homework;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
    private boolean working;

    public ElectronicSecuredNotepad(String ownerName, int numberOfPages,String password) {
        super(ownerName, numberOfPages,password);
        this.working = false;
    }

    @Override
    public void start() {
        this.working = true;
    }

    @Override
    public void stop() {
        this.working = false;
    }

    @Override
    public boolean isStarted() {
        return this.working;
    }

    @Override
    public void addTextTo(String text, int page) {
        if (isStarted()) {
            super.addTextTo(text, page);
        }
        else{
            System.out.println("your notepad is not turned on!");
        }
    }

    @Override
    public void overwriteTextOf(String text, int page) {
        if (isStarted()) {
            super.overwriteTextOf(text, page);
        }
        else{
            System.out.println("your notepad is not turned on!");
        }
    }

    @Override
    public void deleteTextOf(int page) {
        if (isStarted()) {

            super.deleteTextOf(page);
        }
        else{
            System.out.println("your notepad is not turned on!");
        }

    }

    @Override
    public void showPages() {
        if (isStarted()) {
            super.showPages();
        }
        else{
            System.out.println("your notepad is not turned on!");
        }

    }

    @Override
    public void searchWord(String word) {
        if (isStarted()) {
            super.searchWord(word);
        }
        else{
            System.out.println("your notepad is not turned on!");
        }
    }

    @Override
    public void printAllPagesWithDigits() {
        if (isStarted()) {

            super.printAllPagesWithDigits();
        }
        else{
            System.out.println("your notepad is not turned on!");
        }
    }
}
