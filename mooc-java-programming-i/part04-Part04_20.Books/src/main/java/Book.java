
public class Book {

    private String title;
    private int pages;
    private int year;

    //constructor
    public Book(String initTitle, int initPages, int initYear) {
        this.title = initTitle;
        this.pages = initPages;
        this.year = initYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }

}
