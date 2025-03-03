/**
* @author SEB
*/

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String name, int pages, int year) {
        this.title = name;
        this.numberOfPages = pages;
        this.publicationYear = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return this.title + ", " + this.numberOfPages + " pages , "
                + this.publicationYear;
    }
}
