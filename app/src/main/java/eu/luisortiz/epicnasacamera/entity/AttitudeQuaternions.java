package eu.luisortiz.epicnasacamera.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by luis on 2/11/15.
 */
public class AttitudeQuaternions {

    @SerializedName("q0")
    private double q0;

    @SerializedName("q1")
    private double q1;

    @SerializedName("q2")
    private double q2;

    @SerializedName("q3")
    private double q3;

    public double getQ0() {
        return q0;
    }

    public void setQ0(double q0) {
        this.q0 = q0;
    }

    public double getQ1() {
        return q1;
    }

    public void setQ1(double q1) {
        this.q1 = q1;
    }

    public double getQ2() {
        return q2;
    }

    public void setQ2(double q2) {
        this.q2 = q2;
    }

    public double getQ3() {
        return q3;
    }

    public void setQ3(double q3) {
        this.q3 = q3;
    }
}
