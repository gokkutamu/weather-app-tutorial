package com.example.weatherapp.Services;

public class Tomorrow {
    private String day;
    private String urlPath;
    private String status;
    private int highTemp;
    private int lowTemp;


    /**
     * Constructor
     * @param day, urlPath, status, high, low
     * */
    public Tomorrow(String day, String urlPath, String status, int highTemp, int lowTemp) {
        this.day = day;
        this.urlPath = urlPath;
        this.status = status;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }
}
