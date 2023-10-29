
public class Book {
    String bookName;
    int pageNumber;
    String writer;
    int year;

    public Book(String bookName, int pageNumber, String writer, int year) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.writer = writer;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

