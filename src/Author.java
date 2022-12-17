public class Author {
    private String name;
    private String firstName;

    public Author(String name, String firstName){
        this.name = name;
        this.firstName = firstName;
    }
    public String getName(){
        return this.name;
    }
    public String getFirstName(){
        return this.firstName;
    }
}
