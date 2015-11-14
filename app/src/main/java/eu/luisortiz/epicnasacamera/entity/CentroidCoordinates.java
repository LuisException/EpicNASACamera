package eu.luisortiz.epicnasacamera.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by luis on 2/11/15.
 */
public class CentroidCoordinates {

    @SerializedName("lat")
    private double latitud;

    @SerializedName("long")
    private double longitud;

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
