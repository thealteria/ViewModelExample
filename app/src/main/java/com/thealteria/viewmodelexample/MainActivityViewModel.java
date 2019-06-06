package com.thealteria.viewmodelexample;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

class MainActivityViewModel extends ViewModel {
    private String TAG = this.getClass().getSimpleName();
    //    private String randomNumber;
    private MutableLiveData<String> randomNumber;

    MutableLiveData<String> getNumber() {
        Log.i(TAG, "Get number");
        if (randomNumber == null) {
            randomNumber = new MutableLiveData<>();
            createNumber();
        }
        return randomNumber;
    }

    void createNumber() {
        Log.i(TAG, "createNumber");
        Random random = new Random();
//        randomNumber = "Number: " + (random.nextInt(10 - 1) + 1);
        randomNumber.setValue("Number: " + (random.nextInt(100) + 1));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "ViewModel destroyed");
    }
}
