public class Main {

    public static void printBook(String getName,String getFirstName, String getBookName, int getYearPublication){
        System.out.println("Автор - " + getName + " " + getFirstName + " Название книги - " + getBookName + " Дата публикации - " + getYearPublication);
    }
    public static void main(String[] args) {

        Author tolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeas = new Book("War and Peas", 1865);
        printBook(tolstoy.getName(), tolstoy.getFirstName(), warAndPeas.getBookName(), warAndPeas.getYearPublication());
        System.out.println("Корректировка даты публикации");
        warAndPeas.setYearPublication(1869);
        printBook(tolstoy.getName(), tolstoy.getFirstName(), warAndPeas.getBookName(), warAndPeas.getYearPublication());
        Author pushkin = new Author("Aleksandr", "Pushkin");
        Book evgeniiOnegin = new Book("Evgenii Onegin", 1825);
        printBook(pushkin.getName(), pushkin.getFirstName(), evgeniiOnegin.getBookName(), evgeniiOnegin.getYearPublication());

    }
}