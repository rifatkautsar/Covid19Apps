package com.rifat.covid19app.Adapter.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rifat on 10/5/21.
 */
public class ProvinsiModel {

    @SerializedName("attributes")
    @Expose
    private List<Provinsi> provinsi = null;

    public ProvinsiModel(List<Provinsi> provinsi) {
        this.provinsi = provinsi;
    }

    public List<Provinsi> getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(List<Provinsi> provinsi) {
        this.provinsi = provinsi;
    }
}
