public class Book {
    private String name;
    private String bookName;
    private int yearPublication;

    public Book(String name, String bookName, int yearPublication){
        this.name = name;
        this.yearPublication = yearPublication;
        this.bookName = bookName;
    }

    public String getName() {
        return this.name;
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
