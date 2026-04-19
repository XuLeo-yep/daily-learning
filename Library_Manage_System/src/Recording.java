/**
 * Recording
 * Represents a recording in a library catalog.
 *This class serves as the base class for CatalogItem.
 *
 * @author XuLeo
 * @version 1.0
 */
public class Recording extends CatalogItem{

    private String performer;

    private String format;

    public String getPerformer() {
        return performer;
    }

    public String getFormat() {
        return format;
    }

    /**
     * Constructs a new recording with specific details
     *
     * @param code the unique identifier code of this recording.(inherited)
     * @param title the title of the recording.(inherited)
     * @param year the year of the publication.(inherited)
     * @param available the initial availability status.(inherited)
     * @param performer the performer of the recording.
     * @param format the format of the recording.
     */
    public Recording(String code, String title, int year, boolean available, String performer, String format) {
        super(code, title, year, available);
        this.performer = performer;
        this.format = format;
    }
}
