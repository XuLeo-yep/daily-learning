/**
 * CatalogItem
 * Represents a generic item in a library catalog.
 *This class serves as the base class for Catalog.
 *
 * @author XuLeo
 * @version 1.0
 */
public class CatalogItem {

    /** The unique identifier code for the item*/
    private String code;


    /** The title of the item.*/
    private String title;

    /** The year of publication*/
    private int year;

    /** Indicates whether the item is currently available for borrowing.*/
    private boolean available;

    /**
     * Gets the code of this catalog item.
     * @return the code string
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets the title of this catalog item.
     * @return the title string.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the year of this catalog item.
     * @return the year of publication.
     */
    public int getYear() {
        return year;
    }

    /**
     * Constructs a new CatalogItem with the specified details.
     *
     * @param code      the unique identifier code for the item
     * @param title     the title of the item
     * @param year      the year of publication
     * @param available the initial availability status (true if available, false otherwise)
     */
    public CatalogItem(String code, String title, int year, boolean available) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.available = available;
    }

    /**
     *  Checks if this item is available for borrowing.
     * @return true if the item is available,false otherwise
     */
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", available=" + available ;
    }

    /**
     * Sets the availability status of this item.
     * @param available  true to mark the item as available,false otherwise
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
