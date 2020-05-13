package com.upszakoni.zakoni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CrimesRecyclerAdapter extends RecyclerView.Adapter<CrimesRecyclerAdapter.CrimeViewHolder> {


    private ArrayList<CrimesData> crimesArrayList;

    public static class CrimeViewHolder extends RecyclerView.ViewHolder {

        TextView titleText1;
        TextView descriptionText2;


        public CrimeViewHolder(@NonNull View itemView) {
            super(itemView);

            titleText1 = itemView.findViewById(R.id.titleText);
            descriptionText2 = itemView.findViewById(R.id.text2);

        }
    }

    public CrimesRecyclerAdapter(ArrayList<CrimesData> crimesList) {
        crimesArrayList = crimesList;
    }

    @NonNull
    @Override
    public CrimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.offenses_item, parent, false);
        CrimeViewHolder mvh = new CrimeViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CrimeViewHolder holder, int position) {

        CrimesData currentItem = crimesArrayList.get(position);
        holder.titleText1.setText(currentItem.getTitle());
        holder.descriptionText2.setText(currentItem.getDescription());

    }

    @Override
    public int getItemCount() {
        return crimesArrayList.size();
    }


}
