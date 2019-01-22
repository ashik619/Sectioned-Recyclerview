package io.github.ashik619.shadowfaxdemo.recyclerview.viewholders;

/**
 * Created by dilip on 21/1/19.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import io.github.ashik619.shadowfaxdemo.R;

public class HeaderViewHolder extends RecyclerView.ViewHolder{
    public TextView headerTitle;
    public HeaderViewHolder(View itemView) {
        super(itemView);
        headerTitle = (TextView)itemView.findViewById(R.id.header_id);
    }
}
