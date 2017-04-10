package com.kevicsalazar.sample.databinding;

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */

public class MainActivityPresenter {

    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    public void onShowData(Temperature temperature) {
        view.showData(temperature);
    }

}
