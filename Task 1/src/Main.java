import java.util.Scanner;

public class Main {
    static String booksInfo = "";
    public static void main(String[] args) {
        while(true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int priceCount = inputPriceCount();
            addBook(name);
            addBook(name,pageCount);
            addBook(priceCount);
            printInfo();
        }
    }


    // метод для ввода название книги
    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц: ");
        return new Scanner(System.in).nextInt();
    }

    public static int inputPriceCount() {
        System.out.println("Введите цену: ");
        return new Scanner(System.in).nextInt();
    }

    //метод куда информация попадает и хранится
    public static void addBook(String bookName) {
        addBook(bookName,0);
        addBook(0);
    }

    public static void addBook(String bookName, int pageCount) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр.\n";
    }

    public static void addBook(double priceCount) {
        booksInfo = booksInfo + "Цена: " + (priceCount > 0 ? priceCount + " руб.\n" : "не установлено\n");
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }
}
