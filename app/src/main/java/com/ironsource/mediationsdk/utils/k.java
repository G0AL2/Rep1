package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static k f27471a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f27472b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f27473c = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.utils.k$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27474a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.model.l.values().length];
            f27474a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.model.l.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27474a[com.ironsource.mediationsdk.model.l.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f27475a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f27476b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f27477c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f27478d = 4;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ int[] f27479e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) f27479e.clone();
        }
    }

    k() {
    }

    private static int a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
                if (currentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0L) < IronSourceUtils.getIntFromSharedPrefs(context, a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), 0) * 1000) {
                    return a.f27477c;
                }
            }
            if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
                int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
                String a10 = a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
                int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, a10, 0);
                String a11 = a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
                if (currentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, a11, 0L)) {
                    IronSourceUtils.saveIntToSharedPrefs(context, a10, 0);
                    IronSourceUtils.saveLongToSharedPrefs(context, a11, 0L);
                } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                    return a.f27476b;
                }
            }
            return a.f27478d;
        }
        return a.f27475a;
    }

    private static long a(com.ironsource.mediationsdk.model.l lVar) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i10 = AnonymousClass1.f27474a[lVar.ordinal()];
        if (i10 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i10 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (f27471a == null) {
                f27471a = new k();
            }
            kVar = f27471a;
        }
        return kVar;
    }

    private static String a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? IronSourceConstants.INTERSTITIAL_AD_UNIT : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? IronSourceConstants.BANNER_AD_UNIT : ad_unit.toString();
    }

    private static String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    public static synchronized void a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (k.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.k placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized void a(Context context, Placement placement) {
        synchronized (k.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.k placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized void a(Context context, com.ironsource.mediationsdk.model.f fVar) {
        synchronized (k.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.k placementAvailabilitySettings = fVar.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            a(context, IronSourceConstants.BANNER_AD_UNIT, fVar.getPlacementName(), placementAvailabilitySettings);
        }
    }

    private static void a(Context context, String str, String str2, com.ironsource.mediationsdk.model.k kVar) {
        boolean z10 = kVar.f27255a;
        IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z10);
        if (z10) {
            boolean z11 = kVar.f27256b;
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, "CappingManager.IS_CAPPING_ENABLED", str2), z11);
            if (z11) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), kVar.f27259e);
                IronSourceUtils.saveStringToSharedPrefs(context, a(str, "CappingManager.CAPPING_TYPE", str2), kVar.f27258d.toString());
            }
            boolean z12 = kVar.f27257c;
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, "CappingManager.IS_PACING_ENABLED", str2), z12);
            if (z12) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), kVar.f27260f);
            }
        }
    }

    public static synchronized boolean a(Context context, String str) {
        boolean z10;
        synchronized (k.class) {
            z10 = a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str) != a.f27478d;
        }
        return z10;
    }

    public static synchronized boolean a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        boolean z10;
        synchronized (k.class) {
            z10 = a(context, a(ad_unit), str) != a.f27478d;
        }
        return z10;
    }

    public static synchronized int b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (k.class) {
            if (context != null && interstitialPlacement != null) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    return a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
                }
            }
            return a.f27478d;
        }
    }

    public static synchronized int b(Context context, Placement placement) {
        synchronized (k.class) {
            if (context != null && placement != null) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    return a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                }
            }
            return a.f27478d;
        }
    }

    public static synchronized void b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (k.class) {
            b(context, a(ad_unit), str);
        }
    }

    private static void b(Context context, String str, String str2) {
        int i10 = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.getIntFromSharedPrefs(context, a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a10 = a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a10, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, a(str, "CappingManager.CAPPING_TYPE", str2), com.ironsource.mediationsdk.model.l.PER_DAY.toString());
                com.ironsource.mediationsdk.model.l lVar = null;
                com.ironsource.mediationsdk.model.l[] values = com.ironsource.mediationsdk.model.l.values();
                int length = values.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    com.ironsource.mediationsdk.model.l lVar2 = values[i10];
                    if (lVar2.f27270c.equals(stringFromSharedPrefs)) {
                        lVar = lVar2;
                        break;
                    }
                    i10++;
                }
                IronSourceUtils.saveLongToSharedPrefs(context, a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), a(lVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, a10, intFromSharedPrefs + 1);
        }
    }

    public static synchronized boolean b(Context context, String str) {
        boolean z10;
        synchronized (k.class) {
            z10 = a(context, IronSourceConstants.BANNER_AD_UNIT, str) != a.f27478d;
        }
        return z10;
    }

    public static synchronized void c(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (k.class) {
            if (interstitialPlacement != null) {
                b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
            }
        }
    }

    public static synchronized void c(Context context, Placement placement) {
        synchronized (k.class) {
            if (placement != null) {
                b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
    }

    public static synchronized boolean c(Context context, String str) {
        boolean z10;
        synchronized (k.class) {
            z10 = a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != a.f27478d;
        }
        return z10;
    }

    public static synchronized void d(Context context, String str) {
        synchronized (k.class) {
            b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str);
        }
    }

    public static synchronized void e(Context context, String str) {
        synchronized (k.class) {
            b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    public static synchronized void f(Context context, String str) {
        synchronized (k.class) {
            if (!TextUtils.isEmpty(str)) {
                b(context, IronSourceConstants.BANNER_AD_UNIT, str);
            }
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f27472b.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f27473c.put(str, list);
    }

    public HashSet<ImpressionDataListener> b() {
        return this.f27472b;
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f27472b.remove(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.f27472b.clear();
        }
    }

    public ConcurrentHashMap<String, List<String>> d() {
        return this.f27473c;
    }
}
