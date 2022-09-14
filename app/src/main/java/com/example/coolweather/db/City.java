package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int id;

    private String cityName;

    private int cityCOde;

    private int provinceID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCOde() {
        return cityCOde;
    }

    public void setCityCOde(int cityCOde) {
        this.cityCOde = cityCOde;
    }

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }
}
