package io.github.ashik619.shadowfaxdemo;

import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.github.ashik619.shadowfaxdemo.data_repository.CountryDataRepo;
import io.github.ashik619.shadowfaxdemo.model.Country;

/**
 * Created by dilip on 22/1/19.
 */

public class MainPresenterImpl implements MainPresenter {
    private MainView view;

    public MainPresenterImpl(MainView view){
        this.view = view;
    }

    private List<Country> allCountryList;
    @Override
    public void onViewAttached() {
        allCountryList = CountryDataRepo.getCountryList();
        view.onCountryList(allCountryList);
    }

    @Override
    public void onSearch(String text) {
        new SearchTask().execute(text);
    }

    @Override
    public void clearSerach() {
        view.onCountryList(allCountryList);
    }

    private class SearchTask extends AsyncTask<String,Void,List<Country>>{
        @Override
        protected List<Country> doInBackground(String... text) {
            List<Country> searchList = new ArrayList<>();
            for (Country country : allCountryList){
                if(country.getName().toUpperCase().contains(text[0])){
                    searchList.add(country);
                }
            }
            return searchList;
        }

        @Override
        protected void onPostExecute(List<Country> countryList) {
            super.onPostExecute(countryList);
            if(view!=null){
                view.onCountryList(countryList);
            }
        }
    }

    @Override
    public void onViewDetached() {
        this.view = null;
    }

}
