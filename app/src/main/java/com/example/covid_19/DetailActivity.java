package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int postionCountry;
    TextView tvCountry,tvCases,tvRecoverd,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent i = getIntent();
        postionCountry = i.getIntExtra("position", 0);

        getSupportActionBar().setTitle("Details of "+AffectedCountries.countryModelList.get(postionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvCountry=findViewById(R.id.tvCountry);
        tvCases=findViewById(R.id.tvCases);
        tvRecoverd=findViewById(R.id.tvRecovered);
        tvCritical=findViewById(R.id.tvCritical);
        tvActive=findViewById(R.id.tvActive);
        tvTodayCases=findViewById(R.id.tvTodayCases);
        tvTotalDeaths=findViewById(R.id.tvTotalDeaths);
        tvTodayDeaths=findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(AffectedCountries.countryModelList.get(postionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(postionCountry).getCases());
        tvRecoverd.setText(AffectedCountries.countryModelList.get(postionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(postionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(postionCountry).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(postionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelList.get(postionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(postionCountry).getTodayDeaths());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) ;
        finish();
        return super.onOptionsItemSelected(item);
    }
}
