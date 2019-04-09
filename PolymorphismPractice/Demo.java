import homework.ElectronicSecuredNotepad;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ElectronicSecuredNotepad notepad;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("please enter a password with a least one capital letter one small letter and a digit");
            String password = sc.nextLine();
            if(passwordIsStrong(password)){
                int numberOfPages;
                String ownerName;
                System.out.println("enter the number of pages you want in your notepad(if input is bad default is 5)");
                numberOfPages = sc.nextInt();
                System.out.println("enter the name of the owner for the new notepad: ");
                sc.nextLine();
                ownerName = sc.nextLine();
                notepad = new ElectronicSecuredNotepad(ownerName,numberOfPages,password);
                break;
            }else{
                System.out.println("error password too weak!");
            }
        }while (true);
        boolean endingTheProgram = false;
        do{
            System.out.println( "==========================================================" +
                    "\npress 1 to add text to a page\npress 2 to overwrite the text of a page" +
                    "\npress 3 to delete the text of a page\npress 4 to see all the pages in your notepad" +
                    "\npress 5 to search for a word in your notepad\npress 6 to see all pages that contain digits" +
                    "\npress 7 to start your electronic notepad\npress 8 to turn off your electronic notepad" +
                    "\npress 9 to see if your notepad is on\n press 10 to end the program.");
            int input = sc.nextInt();
            sc.nextLine();
            String text,word;
            int page;
            switch (input){
                case 1:
                    System.out.println("enter the text you want to append: ");
                    text = sc.nextLine();
                    System.out.println("and now the page you want to put it in: ");
                    page = sc.nextInt();
                    notepad.addTextTo(text,page);
                    break;
                case 2:
                    System.out.println("enter the new text: ");
                    text = sc.nextLine();
                    System.out.println("and now the page you want to put it in: ");
                    page = sc.nextInt();
                    sc.nextLine();
                    notepad.overwriteTextOf(text,page);
                    break;
                case 3:
                    System.out.println("enter the page you want to delete the text of: ");
                    page = sc.nextInt();
                    sc.nextLine();
                    notepad.deleteTextOf(page);
                    break;
                case 4:
                    notepad.showPages();
                    break;
                case 5:
                    System.out.println("enter the word you want to look for: ");
                    word = sc.nextLine();
                    notepad.searchWord(word);
                    break;
                case 6:
                    notepad.printAllPagesWithDigits();
                    break;
                case 7:
                    notepad.start();
                    break;
                case 8:
                    notepad.stop();
                    break;
                case 9:
                    if(notepad.isStarted()){
                        System.out.println("your notepad is on");
                    }
                    else{
                        System.out.println("your notepad is off");
                    }
                    break;
                case 10:
                    endingTheProgram = true;
                    break;
                default:
                    System.out.println("error bad input!");
                    break;
            }
        }while(!endingTheProgram);
    }


    public static boolean passwordIsStrong(String password){
        int pointsForStringPassword = 0; // needs to be 3 in order to return true;
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                pointsForStringPassword++;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                pointsForStringPassword++;
                break;
            }
        }
        if(password.matches(".*\\d+.*")){
            pointsForStringPassword++;
        }
        return pointsForStringPassword == 3;
    }
}
