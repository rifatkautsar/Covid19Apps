package com.rifat.covid19app.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rifat on 10/5/21.
 */
public class ProvinsiModel {

    @SerializedName("attributes")
    private AttributesProv attributesProv;

    public ProvinsiModel(AttributesProv attributesProv) {
        this.attributesProv = attributesProv;
    }

    public AttributesProv getAttributesProv() {
        return attributesProv;
    }

    public void setAttributesProv(AttributesProv attributesProv) {
        this.attributesProv = attributesProv;
    }

    public static class AttributesProv {
        @SerializedName("Provinsi")
        private String provinsi;
        @SerializedName("Kasus_Posi")
        private int confirmed;
        @SerializedName("Kasus_Semb")
        private int recovered;
        @SerializedName("Kasus_Meni")
        private int dead;

        public AttributesProv(String provinsi, int confirmed, int recovered, int dead) {
            this.provinsi = provinsi;
            this.confirmed = confirmed;
            this.recovered = recovered;
            this.dead = dead;
        }

        public String getProvinsi() {
            return provinsi;
        }

        public void setProvinsi(String provinsi) {
            this.provinsi = provinsi;
        }

        public int getConfirmed() {
            return confirmed;
        }

        public void setConfirmed(int confirmed) {
            this.confirmed = confirmed;
        }

        public int getRecovered() {
            return recovered;
        }

        public void setRecovered(int recovered) {
            this.recovered = recovered;
        }

        public int getDead() {
            return dead;
        }

        public void setDead(int dead) {
            this.dead = dead;
        }
    }
}
