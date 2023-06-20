package com.vehiclecloud.app.videofetch.rnads.admob;

import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsIlrd;

/* loaded from: classes3.dex */
public class RNAdsAdmobIlrd implements RNAdsIlrd {
    private static final String NAME = "Admob";
    public static OnPaidEventListener onPaidEventListener;

    public static /* synthetic */ void a(RNAdsIlrd.Uploader uploader, AdValue adValue) {
        lambda$init$0(uploader, adValue);
    }

    public static /* synthetic */ void lambda$init$0(RNAdsIlrd.Uploader uploader, AdValue adValue) {
        uploader.onPaidEvent(adValue.getCurrencyCode(), adValue.getValueMicros() * 1.0E-6d);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsIlrd
    public String getAdPlatform() {
        return NAME;
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsIlrd
    public void init(ReadableMap readableMap, final RNAdsIlrd.Uploader uploader) {
        onPaidEventListener = new OnPaidEventListener() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.a
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                RNAdsAdmobIlrd.a(RNAdsIlrd.Uploader.this, adValue);
            }
        };
    }
}
