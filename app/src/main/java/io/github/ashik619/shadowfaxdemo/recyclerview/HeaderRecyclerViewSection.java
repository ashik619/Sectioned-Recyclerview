package io.github.ashik619.shadowfaxdemo.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import io.github.ashik619.shadowfaxdemo.R;
import io.github.ashik619.shadowfaxdemo.model.Country;
import io.github.ashik619.shadowfaxdemo.recyclerview.viewholders.HeaderViewHolder;
import io.github.ashik619.shadowfaxdemo.recyclerview.viewholders.ItemViewHolder;
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionParameters;
import io.github.luizgrp.sectionedrecyclerviewadapter.StatelessSection;

/**
 * Created by dilip on 21/1/19.
 */

public class HeaderRecyclerViewSection extends StatelessSection {
    private static final String TAG = HeaderRecyclerViewSection.class.getSimpleName();
    private String title;
    private List<String> list;
    public HeaderRecyclerViewSection(String title, List<String> list) {
        super(SectionParameters.builder()
                .itemResourceId(R.layout.item_layout)
                .headerResourceId(R.layout.header_layout)
                .build());
        this.title = title;
        this.list = list;
    }
    @Override
    public int getContentItemsTotal() {
        return list.size();
    }
    @Override
    public RecyclerView.ViewHolder getItemViewHolder(View view) {
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder iHolder = (ItemViewHolder)holder;
        iHolder.itemContent.setText(list.get(position));
    }
    @Override
    public RecyclerView.ViewHolder getHeaderViewHolder(View view) {
        return new HeaderViewHolder(view);
    }
    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder) {
        HeaderViewHolder hHolder = (HeaderViewHolder)holder;
        hHolder.headerTitle.setText(title);
    }
}