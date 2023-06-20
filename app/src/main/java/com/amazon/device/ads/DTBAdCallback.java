package com.amazon.device.ads;

/* loaded from: classes.dex */
public interface DTBAdCallback {
    void onFailure(AdError adError);

    void onSuccess(DTBAdResponse dTBAdResponse);
}
