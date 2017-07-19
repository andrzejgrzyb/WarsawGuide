package pl.com.andrzejgrzyb.warsawguide;

/**
 * Created by Andrzej on 19.07.2017.
 */

public class AttractionObject {

    private String title;
    private String description;
    private int image;

    public AttractionObject(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public AttractionObject(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
