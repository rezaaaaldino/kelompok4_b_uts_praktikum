package com.rezha.utspraktikum;

// ProfileFragment.java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class WeeklyWeatherFragment extends Fragment {

    private RecyclerView recyclerViewTomorrow;
    private TomorrowAdapter tomorrowAdapter;
    private ArrayList<TomorrowDomain> tomorrowList;

    public WeeklyWeatherFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weeklyweather, container, false);

        // Inisialisasi RecyclerView
        recyclerViewTomorrow = view.findViewById(R.id.weather_recycler_view);
        recyclerViewTomorrow.setLayoutManager(new LinearLayoutManager(getContext()));

        tomorrowList = new ArrayList<>();
        tomorrowList.add(new TomorrowDomain("Sat", "storm", "Storm", 30, 20));
        tomorrowList.add(new TomorrowDomain("Mon", "cloudy", "Cloudy", 25, 18));
        tomorrowList.add(new TomorrowDomain("Sat", "storm", "Storm", 30, 20));
        tomorrowList.add(new TomorrowDomain("Mon", "cloudy", "Cloudy", 25, 18));
        tomorrowList.add(new TomorrowDomain("Sat", "storm", "Storm", 30, 20));
        tomorrowList.add(new TomorrowDomain("Mon", "cloudy", "Cloudy", 25, 18));
        tomorrowList.add(new TomorrowDomain("Sat", "storm", "Storm", 30, 20));
        tomorrowList.add(new TomorrowDomain("Mon", "cloudy", "Cloudy", 25, 18));
        tomorrowList.add(new TomorrowDomain("Sat", "storm", "Storm", 30, 20));
        tomorrowList.add(new TomorrowDomain("Mon", "cloudy", "Cloudy", 25, 18));
        tomorrowList.add(new TomorrowDomain("Sat", "storm", "Storm", 30, 20));
        tomorrowList.add(new TomorrowDomain("Mon", "cloudy", "Cloudy", 25, 18));

        // Inisialisasi adapter
        tomorrowAdapter = new TomorrowAdapter(tomorrowList);

        // Set adapter ke RecyclerView
        recyclerViewTomorrow.setAdapter(tomorrowAdapter);

        return view;
    }
}