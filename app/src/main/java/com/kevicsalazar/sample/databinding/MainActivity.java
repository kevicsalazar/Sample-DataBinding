package com.kevicsalazar.sample.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.kevicsalazar.sample.databinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this);
        Temperature temperature = new Temperature("10");
        binding.setTemp(temperature);
        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(Temperature temperature) {
        String celsius = temperature.getCelsius();
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show();
    }

}
