package eu.luisortiz.epicnasacamera.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by luis on 2/11/15.
 */
public class Coords {

    @SerializedName("centroid_coordinates")
    private CentroidCoordinates centroidCoordinates;

    @SerializedName("dscovr_j2000_position")
    private DscovrJ2000Position dscovrJ2000Position;

    @SerializedName("sun_j2000_position")
    private SunJ2000Position sunJ2000Position;

    @SerializedName("attitude_quaternions")
    private AttitudeQuaternions attitudeQuaternions;

    public CentroidCoordinates getCentroidCoordinates() {
        return centroidCoordinates;
    }

    public void setCentroidCoordinates(CentroidCoordinates centroidCoordinates) {
        this.centroidCoordinates = centroidCoordinates;
    }

    public DscovrJ2000Position getDscovrJ2000Position() {
        return dscovrJ2000Position;
    }

    public void setDscovrJ2000Position(DscovrJ2000Position dscovrJ2000Position) {
        this.dscovrJ2000Position = dscovrJ2000Position;
    }

    public SunJ2000Position getSunJ2000Position() {
        return sunJ2000Position;
    }

    public void setSunJ2000Position(SunJ2000Position sunJ2000Position) {
        this.sunJ2000Position = sunJ2000Position;
    }

    public AttitudeQuaternions getAttitudeQuaternions() {
        return attitudeQuaternions;
    }

    public void setAttitudeQuaternions(AttitudeQuaternions attitudeQuaternions) {
        this.attitudeQuaternions = attitudeQuaternions;
    }
}
