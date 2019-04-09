package homework;

public class Page {
    private String headline;
    private String content;

    Page(String headline){
        if(headline != null && !headline.isEmpty()){
            this.headline = headline;
        }
        else{
            this.headline = "a new page";
        }
        this.content = "";
    }
     void addText(String text){
        if(text != null && !text.isEmpty()){
            this.content = this.content.concat(text);
        }
    }
    public void setHeadline(String headline){
        if(headline != null && !headline.isEmpty()){
            this.headline = headline;
        }
    }
     void deleteText(){
        this.content = "";
    }
     void previewPage(){
        System.out.println("-------------------------------------\n"
                +this.headline + "\n-------------------------------------\n"
                + this.content);
    }
    boolean searchWord(String word){
        return this.content.contains(word);
    }
    boolean containsDigits(){
        return this.content.matches(".*\\d+.*");
    }
}
