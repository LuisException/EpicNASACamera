package eu.luisortiz.epicnasacamera.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by luis on 2/11/15.
 */
public class EpicImage {

    @SerializedName("image")
    private String image;

    @SerializedName("date")
    private String date;

    @SerializedName("caption")
    private String caption;

    @SerializedName("coords")
    private Coords coords;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public EpicImage(String image, String date, String caption, Coords coords){
        this.image = image;
        this.date = date;
        this.caption = caption;
        this.coords = coords;
    }
}
