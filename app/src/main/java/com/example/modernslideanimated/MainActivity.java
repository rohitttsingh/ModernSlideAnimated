package com.example.modernslideanimated;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2=findViewById(R.id.locationViewPager);
        List<TravelLocation> travelLocations= new ArrayList<>();

        TravelLocation travelLocationEiffeltower= new TravelLocation();
        travelLocationEiffeltower.imageurl="https://www.planetware.com/photos-large/F/eiffel-tower.jpg";
        travelLocationEiffeltower.location="Eiffel Tower";
        travelLocationEiffeltower.starRating=4.8f;
        travelLocationEiffeltower.title="France";
        travelLocations.add(travelLocationEiffeltower);

        TravelLocation travelLocationMountainView= new TravelLocation();
        travelLocationMountainView.imageurl="https://img.jakpost.net/c/2017/10/27/2017_10_27_34843_1509094003._large.jpg";
        travelLocationMountainView.location="Indonesia";
        travelLocationMountainView.starRating=4.5f;
        travelLocationMountainView.title="Mountain View";
        travelLocations.add(travelLocationMountainView);

        TravelLocation travelLocationTajmahal= new TravelLocation();
        travelLocationTajmahal.imageurl="https://cdn.britannica.com/86/170586-050-AB7FEFAE/Taj-Mahal-Agra-India.jpg";
        travelLocationTajmahal.location="Agra-India";
        travelLocationTajmahal.starRating=3.9f;
        travelLocationTajmahal.title="Taj mahal";
        travelLocations.add(travelLocationTajmahal);

        TravelLocation travelLocationLakeView= new TravelLocation();
        travelLocationLakeView.imageurl="https://media.istockphoto.com/photos/kalamalka-lake-picture-id516402656?k=20&m=516402656&s=612x612&w=0&h=iU2WNiMATNgb0WhWJ1v23J8f7KoATLb03scrLuUlMao=";
        travelLocationLakeView.location="Canada";
        travelLocationLakeView.starRating=4.9f;
        travelLocationLakeView.title="Lake";
        travelLocations.add(travelLocationLakeView);

        TravelLocation travelLocationCharminar= new TravelLocation();
        travelLocationCharminar.imageurl="https://indiacurrents.com/wp-content/uploads/2021/08/1599px-The_Charminar_on_a_cloudy_day.jpeg";
        travelLocationCharminar.location="Charminar";
        travelLocationCharminar.starRating=4.1f;
        travelLocationCharminar.title="India";
        travelLocations.add(travelLocationCharminar);

        viewPager2.setAdapter(new TravelLocationAdapter(travelLocations));
    }
}