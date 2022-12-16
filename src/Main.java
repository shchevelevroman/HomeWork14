public class Main {

    public static String printBook(String getName, String getBookName, int getYearPublication){
        System.out.println(Book);
    }
    public static int printYearPublication (int getYearPublication){
        System.out.println(printYearPublication(getYearPublication));
    }
    public static void main(String[] args) {

        Book tolstoy = new Book("Lev Tolstoy", "War and Peas", 1865);
        printBook();
        System.out.println("Автор = " + tolstoy.getName());
        System.out.println("Название книги = " + tolstoy.getBookName());
        System.out.println("Дата публикации = " + tolstoy.getYearPublication());
        tolstoy.setYearPublication(1869);
        System.out.println("Исправленная дата публикации = " + tolstoy.getYearPublication());
        Book pushkin = new Book("Aleksandr Pushkin", "Evgenii Onegin", 1825);
        System.out.println("Автор = " + pushkin.getName());
        System.out.println("Название книги = " + pushkin.getBookName());
        System.out.println("Дата публикации = " + pushkin.getYearPublication());
    }
}