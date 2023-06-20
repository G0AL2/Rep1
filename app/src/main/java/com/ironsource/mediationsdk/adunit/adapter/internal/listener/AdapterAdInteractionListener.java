package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

/* loaded from: classes3.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdEnded();

    void onAdOpened();

    void onAdShowFailed(int i10, String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
