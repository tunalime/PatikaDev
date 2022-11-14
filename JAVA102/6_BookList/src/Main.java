import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("YUZUK KARDESLIGI",350,"J.R.R. TOLKIEN","1953"));
        books.add(new Book("IKI KULE",250,"J.R.R. TOLKIEN","1955"));
        books.add(new Book("KRALIN DONUSU",450,"J.R.R. TOLKIEN","1957"));
        books.add(new Book("FELSEFE TASI",200,"J.K. ROWLING","1994"));
        books.add(new Book("SIRLAR ODASI",150,"J.K. ROWLING","1996"));
        books.add(new Book("AZKABAN TUTSAGI",75,"J.K. ROWLING","1997"));
        books.add(new Book("ATES KADEHI",250,"J.K. ROWLING","1999"));
        books.add(new Book("ZUMRUDUANKA YOLDASLIGI",450,"J.K. ROWLING","2001"));
        books.add(new Book("MELEZ PRENS",350,"J.K. ROWLING","2003"));
        books.add(new Book("OLUM YADIGARLARI",600,"J.K. ROWLING","2005"));

        Map<String, String> mappedBooks = new HashMap<>();
        books.stream().forEach(book -> mappedBooks.put(book.getBookName(), book.getAuthorName()));
        mappedBooks.forEach((key, value) -> System.out.println(key + "\t : \t" + value));

        System.out.println("####################################################################");

        books.stream().filter(book -> book.getPageCount() < 300).forEach(book -> System.out.println(book.getPageCount() + "\t" + book.getBookName() + "\t" + book.getAuthorName() + "\t" + book.getPublishDate()));
    }
}