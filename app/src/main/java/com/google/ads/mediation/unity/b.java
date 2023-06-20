package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;

/* compiled from: UnityInitializer.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f20729a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f20729a == null) {
                f20729a = new b();
            }
            bVar = f20729a;
        }
        return bVar;
    }

    public void b(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (UnityAds.isInitialized()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaData = new MediationMetaData(context);
        mediationMetaData.setName("AdMob");
        mediationMetaData.setVersion(UnityAds.getVersion());
        mediationMetaData.set("adapter_version", "4.2.1.1");
        mediationMetaData.commit();
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }
}
