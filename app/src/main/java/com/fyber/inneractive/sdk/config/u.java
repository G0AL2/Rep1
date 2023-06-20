package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.config.k;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes.dex */
public class u {
    public static void a(Context context, t tVar) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id2 = advertisingIdInfo.getId();
            IAlog.d("advertising id: %s", id2);
            boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            IAlog.d("limit ad tracking: %s", Boolean.valueOf(isLimitAdTrackingEnabled));
            k kVar = (k) tVar;
            synchronized (kVar) {
                k.c cVar = kVar.f16994b;
                cVar.f16996a = id2;
                cVar.f16997b = isLimitAdTrackingEnabled;
                cVar.f16998c = false;
            }
        } catch (Exception e10) {
            IAlog.d("Handled Exception:", new Object[0]);
            IAlog.d(com.fyber.inneractive.sdk.util.s.a(e10), new Object[0]);
            IAlog.c("Advertising ID is not available. Please add Google Play Services library (v 4.0+) to improve your ad targeting. (relevant for devices running Android API 2.3 and above)", new Object[0]);
        }
    }
}
