package io.github.ashik619.shadowfaxdemo.model;

import java.util.List;

/**
 * Created by dilip on 21/1/19.
 */

public class Country {
    private String name;
    private List<String> citylist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCitylist() {
        return citylist;
    }

    public void setCitylist(List<String> citylist) {
        this.citylist = citylist;
    }
}
