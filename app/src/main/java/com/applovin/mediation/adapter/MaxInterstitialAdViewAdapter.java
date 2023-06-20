package com.applovin.mediation.adapter;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* loaded from: classes.dex */
public interface MaxInterstitialAdViewAdapter {
    void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener);
}
