public class Book implements Comparable<Book>{

    private String bookName;
    private int pageCount;
    private String authorName;
    private String publishDate;

    public String getBookName() {
        return bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public Book(String bookName, int pageCount, String authorName, String publishDate) {
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book b) {
        return getBookName().compareTo(b.getBookName());
    }
}
