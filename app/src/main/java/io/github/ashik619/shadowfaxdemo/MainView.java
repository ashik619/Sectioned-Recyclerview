package io.github.ashik619.shadowfaxdemo;

import java.util.List;

import io.github.ashik619.shadowfaxdemo.model.Country;

/**
 * Created by dilip on 22/1/19.
 */

public interface MainView {
    void onCountryList(List<Country> countryList);
}
