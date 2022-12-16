public class Main {

    public static void printBook(String getName, String getBookName, int getYearPublication){
        System.out.println("Автор - " + getName + " Название книги - " + getBookName + " Дата публикации - " + getYearPublication);
    }
    public static void main(String[] args) {

        Book tolstoy = new Book("Lev Tolstoy", "War and Peas", 1865);
        printBook(tolstoy.getName(), tolstoy.getBookName(), tolstoy.getYearPublication());
        System.out.println("Корректировка даты публикации");
        tolstoy.setYearPublication(1869);
        printBook(tolstoy.getName(), tolstoy.getBookName(), tolstoy.getYearPublication());
        Book pushkin = new Book("Aleksandr Pushkin", "Evgenii Onegin", 1825);
        printBook(pushkin.getName(), pushkin.getBookName(), pushkin.getYearPublication());

    }
}