package com.example.modernslideanimated;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TravelLocationAdapter extends RecyclerView.Adapter<TravelLocationAdapter.TravelLocationAdapterViewHolder> {

    private List<TravelLocation> travelLocations;

    public TravelLocationAdapter(List<TravelLocation> travelLocations) {
        this.travelLocations=travelLocations;
    }


    @NonNull
    @Override
    public TravelLocationAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TravelLocationAdapterViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container_location,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull TravelLocationAdapterViewHolder holder, int position) {

        holder.setLocationData(travelLocations.get(position));
    }

    @Override
    public int getItemCount() {
        return travelLocations.size();
    }

    static class TravelLocationAdapterViewHolder extends RecyclerView.ViewHolder{
        private KenBurnsView kenBurnsView;
        private TextView textTitle,textlocation,textstarrating;

        public TravelLocationAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            kenBurnsView=itemView.findViewById(R.id.kbvlocation);
            textTitle=itemView.findViewById(R.id.textTitle);
            textlocation=itemView.findViewById(R.id.textLocation);
            textstarrating=itemView.findViewById(R.id.textstarrating);
        }
        void setLocationData(TravelLocation travelLocation){
            Picasso.get().load(travelLocation.imageurl).into(kenBurnsView);
            textTitle.setText(travelLocation.title);
            textstarrating.setText(String.valueOf(travelLocation.starRating));
            textlocation.setText(travelLocation.location);
        }
    }
}
