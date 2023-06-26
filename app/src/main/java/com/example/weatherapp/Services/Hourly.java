package com.example.weatherapp.Services;

public class Hourly {
    private String Hour;
    private int intTemp;
    private String urlPath;

    public Hourly(String hour, int intTemp, String urlPath) {
        Hour = hour;
        this.intTemp = intTemp;
        this.urlPath = urlPath;
    }

    public String getHour() {
        return Hour;
    }

    public void setHour(String hour) {
        Hour = hour;
    }

    public int getIntTemp() {
        return intTemp;
    }

    public void setIntTemp(int intTemp) {
        this.intTemp = intTemp;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }
}
