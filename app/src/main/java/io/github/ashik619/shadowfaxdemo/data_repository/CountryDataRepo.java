package io.github.ashik619.shadowfaxdemo.data_repository;

import java.util.ArrayList;
import java.util.List;

import io.github.ashik619.shadowfaxdemo.model.Country;

/**
 * Created by dilip on 21/1/19.
 */

public class CountryDataRepo {
    public static List<Country> getCountryList(){
        List<Country> countryList = new ArrayList<>();
        Country c1 = new Country();
        c1.setName("India");
        List<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Bengaluru");
        cityList.add("Chennai");
        cityList.add("Hyderabad");
        c1.setCitylist(cityList);
        countryList.add(c1);

        Country c2 = new Country();
        c2.setName("Australia");
        List<String> cityList2 = new ArrayList<>();
        cityList2.add("Sydney");
        cityList2.add("Melbourne");
        cityList2.add("Victoria");
        c2.setCitylist(cityList2);
        countryList.add(c2);

        Country c3 = new Country();
        c3.setName("USA");
        List<String> cityList3 = new ArrayList<>();
        cityList3.add("Chicago");
        cityList3.add("New York");
        cityList3.add("Washington");
        c3.setCitylist(cityList3);
        countryList.add(c3);

        Country c4 = new Country();
        c4.setName("Canada");
        List<String> cityList4 = new ArrayList<>();
        cityList4.add("Toronto");
        cityList4.add("Ontario");
        cityList4.add("Montreal");
        c4.setCitylist(cityList4);
        countryList.add(c4);

        return countryList;
    }
}
