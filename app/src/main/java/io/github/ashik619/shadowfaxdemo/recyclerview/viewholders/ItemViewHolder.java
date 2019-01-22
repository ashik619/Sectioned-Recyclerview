package io.github.ashik619.shadowfaxdemo.recyclerview.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import io.github.ashik619.shadowfaxdemo.R;

/**
 * Created by dilip on 21/1/19.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder{
    public TextView itemContent;
    public ItemViewHolder(View itemView) {
        super(itemView);
        itemContent = (TextView)itemView.findViewById(R.id.item_content);
    }
}
