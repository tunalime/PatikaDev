import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Mersin",100,"mehmet","05.03.2019");
        Book book2 = new Book("Adana",80,"eren","07.05.2014");
        Book book3 = new Book("Izmir",70,"ekrem","19.01.2012");
        Book book4 = new Book("Duzce",120,"kagan","24.07.2018");
        Book book5 = new Book("Sakarya",130,"kemal","11.09.2015");
        Book book6 = new Book("Antalya",110,"aysu","13.01.2012");

        TreeSet<Book> set1 = new TreeSet<>();
        set1.add(book1);
        set1.add(book2);
        set1.add(book3);
        set1.add(book4);
        set1.add(book5);
        set1.add(book6);

        Iterator<Book> itr = set1.iterator();
        while(itr.hasNext()){
            Book b = itr.next();
            System.out.println(b.getBookName() +
                    "\t" + b.getPageCount() +
                    "\t" + b.getAuthorName() +
                    "\t" + b.getPublishDate());
        }

        System.out.println("###################");

        TreeSet<Book> set2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPageCount() - o1.getPageCount();
            }
        });

        set2.add(book1);
        set2.add(book2);
        set2.add(book3);
        set2.add(book4);
        set2.add(book5);
        set2.add(book6);

        Iterator<Book> itr2 = set2.iterator();
        while(itr2.hasNext()){
            Book b = itr2.next();
            System.out.println(b.getBookName() +
                    "\t" + b.getPageCount() +
                    "\t" + b.getAuthorName() +
                    "\t" + b.getPublishDate());
        }
    }
}