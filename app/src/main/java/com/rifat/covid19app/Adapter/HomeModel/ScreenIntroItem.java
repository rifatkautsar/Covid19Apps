package com.rifat.covid19app.Adapter.HomeModel;

public class ScreenIntroItem {
    int introtext, img;

    public ScreenIntroItem(int introtext, int img) {
        this.introtext = introtext;
        this.img = img;
    }

    public int getIntrotext() {
        return introtext;
    }

    public void setIntrotext(int introtext) {
        this.introtext = introtext;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
