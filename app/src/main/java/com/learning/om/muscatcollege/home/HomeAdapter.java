package com.learning.om.muscatcollege.home;

import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.learning.om.muscatcollege.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Home> homeArrayList;
    private Home home;
    private FragmentTransaction fragmentTransaction;
    private CardView cardView;
    private onItemClick itemClick;

    public HomeAdapter(Context context, ArrayList<Home> homeArrayList, FragmentTransaction fragmentTransaction) {
        this.context=context;
        this.homeArrayList=homeArrayList;
        this.fragmentTransaction=fragmentTransaction;
    }


    public interface onItemClick{
        public void onItemClick(int position);
    }
    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.home_adapter,parent, false);
        cardView = view.findViewById(R.id.home_card);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        home=homeArrayList.get(position);
        holder.imageView.setImageResource(home.getImage());
        holder.textView.setText(home.getText());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClick.onItemClick(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.email_text);
            imageView = itemView.findViewById(R.id.email);
        }
    }
    public void onCardViewClick(onItemClick itemClick){
        this.itemClick=itemClick;
    }
}
