package com.bizzybooks.bizzybooks;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Owner on 10/29/16.
 */

public class FirebaseUniversalsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    View uView;
    Context uContext;

    public FirebaseUniversalsViewHolder(View universeView) {
        super(universeView);
        uView = universeView;
        uContext = universeView.getContext();
        universeView.setOnClickListener(this);
    }

    public void bindUniversal(UniversalItem universalItem){
        CardView cardView = (CardView)itemView.findViewById(R.id.uCardView);
        TextView uTextView = (TextView)itemView.findViewById(R.id.uTextView);
        //uTextView.setText(universal.getPhone());
    }

    @Override
    public void onClick(View view){

    }

}
