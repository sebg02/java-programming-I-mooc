/**
 *  @author SEB
 */

public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String name, int pageCount){
        this.author = author;
        this.title = name;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages(){
        return this.pageCount;
    }

    @Override
    public String toString(){
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }
}
