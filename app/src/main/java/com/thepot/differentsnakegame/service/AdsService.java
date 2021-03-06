package com.thepot.differentsnakegame.service;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.thepot.differentsnakegame.Board;
import com.thepot.differentsnakegame.R;
import com.thepot.differentsnakegame.clicklistener.AdL;

public class AdsService {

    private InterstitialAd interstitialAd;
    private int clickCount;
    private static final int CLICK_THRESHOLD = 2;

    public AdsService(AppCompatActivity activity, Board board) {

        MobileAds.initialize(activity, initializationStatus -> {
        });
//        MobileAds.setRequestConfiguration(new RequestConfiguration.Builder().setTestDeviceIds(singletonList("35CC9854176EF7429B8898AC4FBB9CF6")).build());
        activity.<AdView>findViewById(R.id.adView).loadAd(new AdRequest.Builder().build());

        interstitialAd = new InterstitialAd(activity);
        interstitialAd.setAdUnitId("ca-app-pub-3436517585020059/5097995112");
//        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdL(interstitialAd, board));
        clickCount = CLICK_THRESHOLD - 1;
    }

    public boolean canShowAd() {
        clickCount++;
        if (interstitialAd.isLoaded() && clickCount > CLICK_THRESHOLD) {
            clickCount = 0;
            return true;
        }

        return false;
    }

    public void showAd() {
        interstitialAd.show();
    }

}


