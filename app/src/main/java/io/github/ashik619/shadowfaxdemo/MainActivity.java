package io.github.ashik619.shadowfaxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.List;

import io.github.ashik619.shadowfaxdemo.model.Country;
import io.github.ashik619.shadowfaxdemo.recyclerview.HeaderRecyclerViewSection;
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity implements MainView {

    RecyclerView recyclerView;
    EditText searchText;

    MainPresenter presenter;
    private SectionedRecyclerViewAdapter sectionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.listView);
        searchText = (EditText) findViewById(R.id.search_bar);

        presenter = new MainPresenterImpl(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        sectionAdapter = new SectionedRecyclerViewAdapter();

        presenter.onViewAttached();

        searchText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(searchText.getText().length()==0){
                    presenter.clearSerach();
                }else {
                    presenter.onSearch(searchText.getText().toString().toUpperCase());
                }
            }
        });

    }

    @Override
    public void onCountryList(List<Country> countryList) {
        sectionAdapter.removeAllSections();
        for (Country country : countryList){
            sectionAdapter.addSection(new HeaderRecyclerViewSection(country.getName(), country.getCitylist()));
        }
        recyclerView.setAdapter(sectionAdapter);
    }
}
