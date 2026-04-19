/**
 * Book
 * Represents a book in a library catalog.
 *This class serves as the base class for CatalogItem.
 *
 * @author XuLeo
 * @version 1.0
 */
public class Book extends CatalogItem{

    private String author;

    private int numberOfPages;

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Constructs a new book with the specific details.
     *
     * @param code the unique identifier code (inherited)
     * @param title the title of book (inherited)
     * @param year the year of publication (inherited)
     * @param available the initial availability status (inherited)
     * @param author the author of this book.
     * @param numberOfPages the total number of pages in the book.
     */
    public Book(String code, String title, int year, boolean available, String author, int numberOfPages) {
        super(code, title, year, available);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
}
