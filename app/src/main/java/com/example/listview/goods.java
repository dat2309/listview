package com.example.listview;

public class goods {
    private String name;
    private String gia;
    private int inmagegoods;

    public goods(String name, String gia, int inmagegoods) {
        this.name = name;
        this.gia = gia;
        this.inmagegoods = inmagegoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getInmagegoods() {
        return inmagegoods;
    }

    public void setInmagegoods(int inmagegoods) {
        this.inmagegoods = inmagegoods;
    }
}
