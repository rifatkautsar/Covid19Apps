package com.rifat.covid19app.Adapter.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Rifat on 10/5/21.
 */
public class Provinsi {

    @SerializedName("FID")
    @Expose
    private Integer fid;
    @SerializedName("Kode_Provi")
    @Expose
    private Integer kodeProvi;
    @SerializedName("Provinsi")
    @Expose
    private String provinsi;
    @SerializedName("Kasus_Posi")
    @Expose
    private Integer kasusPosi;
    @SerializedName("Kasus_Semb")
    @Expose
    private Integer kasusSemb;
    @SerializedName("Kasus_Meni")
    @Expose
    private Integer kasusMeni;

    public Provinsi(Integer fid, Integer kodeProvi, String provinsi, Integer kasusPosi, Integer kasusSemb, Integer kasusMeni) {
        super();
        this.fid = fid;
        this.kodeProvi = kodeProvi;
        this.provinsi = provinsi;
        this.kasusPosi = kasusPosi;
        this.kasusSemb = kasusSemb;
        this.kasusMeni = kasusMeni;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getKodeProvi() {
        return kodeProvi;
    }

    public void setKodeProvi(Integer kodeProvi) {
        this.kodeProvi = kodeProvi;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Integer getKasusPosi() {
        return kasusPosi;
    }

    public void setKasusPosi(Integer kasusPosi) {
        this.kasusPosi = kasusPosi;
    }

    public Integer getKasusSemb() {
        return kasusSemb;
    }

    public void setKasusSemb(Integer kasusSemb) {
        this.kasusSemb = kasusSemb;
    }

    public Integer getKasusMeni() {
        return kasusMeni;
    }

    public void setKasusMeni(Integer kasusMeni) {
        this.kasusMeni = kasusMeni;
    }
}
