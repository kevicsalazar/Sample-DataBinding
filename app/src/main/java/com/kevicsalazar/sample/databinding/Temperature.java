package com.kevicsalazar.sample.databinding;


import android.databinding.BaseObservable;
import android.databinding.Bindable;


/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */

public class Temperature extends BaseObservable {

    private String celsius;

    public Temperature(String celsius) {
        this.celsius = celsius;
    }

    private String fahrenheit;

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {

        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }

}
