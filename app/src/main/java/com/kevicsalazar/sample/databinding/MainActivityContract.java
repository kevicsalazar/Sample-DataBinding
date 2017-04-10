package com.kevicsalazar.sample.databinding;

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */

public interface MainActivityContract {
    interface Presenter {
        void onShowData(Temperature temperatureData);
    }

    interface View {
        void showData(Temperature temperatureData);
    }
}