package com.casperdaris.beroepsproductgroepc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.casperdaris.beroepsproductgroepc.Fragments.RegioInformatieTab;
import com.casperdaris.beroepsproductgroepc.Fragments.RegioRegioTab;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class RegioActivity extends AppCompatActivity {

    private TextView naamVanRegio, beschrijvingVanRegio;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regio);

        naamVanRegio = findViewById(R.id.naamVanRegio);
        beschrijvingVanRegio = findViewById(R.id.beschrijvingVanRegio);

        tabLayout = findViewById(R.id.regioTabLayout);
        viewPager =  findViewById(R.id.regioViewPager);

        // Een adapter aanmaken welke de navigatie tussen fragments regelt
        RegioAdapter adapter = new RegioAdapter(getSupportFragmentManager());

        // Hier maak je nieuwe fragments aan die in de TabLayout komen te staan
        adapter.fragmentToevoegen(new RegioInformatieTab(), "Informatie");
        adapter.fragmentToevoegen(new RegioRegioTab(), "Regio's");

        // Hier link je de TabLayout (de tabs waar je op kunt klikken) en de ViewPager (het swipen tussen fragments)
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
