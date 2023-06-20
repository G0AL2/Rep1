package com.applovin.impl.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8806a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8807b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Collection<CountDownLatch> f8808c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f8809d = false;

    /* renamed from: e  reason: collision with root package name */
    private static o.a f8810e = null;

    public static o.a a(Context context) {
        return b(context);
    }

    public static boolean a() {
        return Utils.checkClassExistence("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    private static o.a b(Context context) {
        o.a aVar;
        HashSet<CountDownLatch> hashSet;
        Object obj = f8807b;
        synchronized (obj) {
            if (f8809d) {
                return f8810e;
            }
            Collection<CountDownLatch> collection = f8808c;
            boolean isEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (isEmpty) {
                o.a c10 = c(context);
                synchronized (obj) {
                    f8809d = true;
                    f8810e = c10;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                for (CountDownLatch countDownLatch2 : hashSet) {
                    countDownLatch2.countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS) && v.a()) {
                    v.i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e10) {
                if (v.a()) {
                    v.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e10);
                }
            }
            synchronized (f8807b) {
                aVar = f8810e;
            }
            return aVar;
        }
    }

    private static o.a c(Context context) {
        o.a d10 = d(context);
        if (d10 == null) {
            d10 = e(context);
        }
        return d10 == null ? new o.a() : d10;
    }

    private static o.a d(Context context) {
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context) || !v.a()) {
                return null;
            }
            v.i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            o.a aVar = new o.a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            aVar.f8766a = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.f8767b = advertisingIdInfo.getId();
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context) || !v.a()) {
                return null;
            }
            v.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    private static o.a e(Context context) {
        String str;
        if (f8806a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                o.a aVar = new o.a();
                aVar.f8767b = StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id"));
                aVar.f8766a = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                return aVar;
            } catch (Settings.SettingNotFoundException e10) {
                e = e10;
                if (v.a()) {
                    str = "Unable to determine if Fire OS limited ad tracking is turned on";
                    v.c("DataCollector", str, e);
                }
            } catch (Throwable th) {
                e = th;
                if (v.a()) {
                    str = "Unable to collect Fire OS IDFA";
                    v.c("DataCollector", str, e);
                }
            }
        }
        f8806a = false;
        return null;
    }
}
