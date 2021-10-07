package com.rifat.covid19app.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Rifat on 9/29/21.
 */
public class HomeModel {
    @SerializedName("positif")
    @Expose
    private String positif;
    @SerializedName("sembuh")
    @Expose
    private String sembuh;
    @SerializedName("meninggal")
    @Expose
    private String meninggal;

    /**
     * No args constructor for use in serialization
     *
     */
    public HomeModel() {
    }

    /**
     *
     * @param meninggal
     * @param positif
     * @param sembuh
     * @param name
     */
    public HomeModel(String name, String positif, String sembuh, String meninggal) {
        super();
        this.positif = positif;
        this.sembuh = sembuh;
        this.meninggal = meninggal;
    }


    public String getPositif() {
        return positif;
    }

    public void setPositif(String positif) {
        this.positif = positif;
    }

    public String getSembuh() {
        return sembuh;
    }

    public void setSembuh(String sembuh) {
        this.sembuh = sembuh;
    }

    public String getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(String meninggal) {
        this.meninggal = meninggal;
    }

}
