package homework;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad{
    private String password;

    public SecuredNotepad(String ownerName, int numberOfPages,String password) {
        super(ownerName, numberOfPages);
        this.password = password;
    }
    private boolean checkPassword(){
        System.out.println("enter your password: ");
        String password = new Scanner(System.in).nextLine();
        if(this.password.equals(password)) {
            return true;
        }
        System.out.println("error! wrong password");
        return false;
    }
    @Override
    public void addTextTo(String text, int page) {
        if(checkPassword()) {
            super.addTextTo(text, page);
        }
    }
    @Override
    public void overwriteTextOf(String text, int page) {
        if (checkPassword()) {
            super.overwriteTextOf(text, page);
        }
    }

    @Override
    public void deleteTextOf(int page) {
        if(checkPassword()) {
            super.deleteTextOf(page);
        }
    }

    @Override
    public void showPages() {
        if(checkPassword()) {
            super.showPages();
        }
    }

    @Override
    public void searchWord(String word) {
        if(checkPassword()) {
            super.searchWord(word);
        }
    }

    @Override
    public void printAllPagesWithDigits() {
        if(checkPassword()) {
            super.printAllPagesWithDigits();
        }
    }
}
