public class Book {
    private String bookName;
    private int yearPublication;

    public Book(String bookName, int yearPublication){
        this.yearPublication = yearPublication;
        this.bookName = bookName;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getYearPublication(){
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;
    }
}
