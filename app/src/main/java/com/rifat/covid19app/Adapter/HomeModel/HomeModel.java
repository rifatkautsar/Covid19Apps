package com.rifat.covid19app.Adapter.HomeModel;

/**
 * Created by Rifat on 9/29/21.
 */
public class HomeModel {

    int id;
    String totalkasus, totalmeninggal, totalPerhari, totalTerkonfirmasi;

    public HomeModel(int id, String totalkasus, String totalmeninggal, String totalPerhari, String totalTerkonfirmasi) {
        this.id = id;
        this.totalkasus = totalkasus;
        this.totalmeninggal = totalmeninggal;
        this.totalPerhari = totalPerhari;
        this.totalTerkonfirmasi = totalTerkonfirmasi;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTotalkasus() {
        return totalkasus;
    }

    public void setTotalkasus(String totalkasus) {
        this.totalkasus = totalkasus;
    }

    public String getTotalmeninggal() {
        return totalmeninggal;
    }

    public void setTotalmeninggal(String totalmeninggal) {
        this.totalmeninggal = totalmeninggal;
    }

    public String getTotalPerhari() {
        return totalPerhari;
    }

    public void setTotalPerhari(String totalPerhari) {
        this.totalPerhari = totalPerhari;
    }

    public String getTotalTerkonfirmasi() {
        return totalTerkonfirmasi;
    }

    public void setTotalTerkonfirmasi(String totalTerkonfirmasi) {
        this.totalTerkonfirmasi = totalTerkonfirmasi;
    }
}
