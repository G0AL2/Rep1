package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.chartboost.sdk.Banner.BannerSize;
import com.chartboost.sdk.CBLocation;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Model.CBError;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import java.util.ArrayList;

/* compiled from: ChartboostAdapterUtils.java */
/* loaded from: classes2.dex */
class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChartboostAdapterUtils.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20486a;

        static {
            int[] iArr = new int[CBError.CBImpressionError.values().length];
            f20486a = iArr;
            try {
                iArr[CBError.CBImpressionError.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20486a[CBError.CBImpressionError.INTERNET_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20486a[CBError.CBImpressionError.TOO_MANY_CONNECTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20486a[CBError.CBImpressionError.WRONG_ORIENTATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20486a[CBError.CBImpressionError.FIRST_SESSION_INTERSTITIALS_DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20486a[CBError.CBImpressionError.NETWORK_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20486a[CBError.CBImpressionError.NO_AD_FOUND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20486a[CBError.CBImpressionError.SESSION_NOT_STARTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20486a[CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20486a[CBError.CBImpressionError.NO_HOST_ACTIVITY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20486a[CBError.CBImpressionError.USER_CANCELLATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20486a[CBError.CBImpressionError.INVALID_LOCATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20486a[CBError.CBImpressionError.VIDEO_UNAVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20486a[CBError.CBImpressionError.VIDEO_ID_MISSING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20486a[CBError.CBImpressionError.ERROR_PLAYING_VIDEO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20486a[CBError.CBImpressionError.INVALID_RESPONSE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20486a[CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20486a[CBError.CBImpressionError.ERROR_CREATING_VIEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20486a[CBError.CBImpressionError.ERROR_DISPLAYING_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f20486a[CBError.CBImpressionError.INCOMPATIBLE_API_VERSION.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f20486a[CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f20486a[CBError.CBImpressionError.ASSET_PREFETCH_IN_PROGRESS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f20486a[CBError.CBImpressionError.ACTIVITY_MISSING_IN_MANIFEST.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f20486a[CBError.CBImpressionError.EMPTY_LOCAL_VIDEO_LIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f20486a[CBError.CBImpressionError.END_POINT_DISABLED.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f20486a[CBError.CBImpressionError.HARDWARE_ACCELERATION_DISABLED.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f20486a[CBError.CBImpressionError.PENDING_IMPRESSION_ERROR.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f20486a[CBError.CBImpressionError.VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f20486a[CBError.CBImpressionError.ASSET_MISSING.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f20486a[CBError.CBImpressionError.WEB_VIEW_PAGE_LOAD_TIMEOUT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f20486a[CBError.CBImpressionError.WEB_VIEW_CLIENT_RECEIVED_ERROR.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f20486a[CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(Bundle bundle, Bundle bundle2) {
        c cVar = new c();
        String string = bundle.getString("appId");
        String string2 = bundle.getString("appSignature");
        if (string != null && string2 != null) {
            cVar.g(string.trim());
            cVar.h(string2.trim());
        }
        String string3 = bundle.getString("adLocation");
        if (!i(string3)) {
            Log.w(ChartboostMediationAdapter.TAG, String.format("Chartboost ad location is empty, defaulting to %s. Please set the Ad Location parameter in the AdMob UI.", CBLocation.LOCATION_DEFAULT));
            string3 = CBLocation.LOCATION_DEFAULT;
        }
        cVar.l(string3.trim());
        if (bundle2 != null && bundle2.containsKey("framework") && bundle2.containsKey("framework_version")) {
            cVar.j((Chartboost.CBFramework) bundle2.getSerializable("framework"));
            cVar.k(bundle2.getString("framework_version"));
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError b(ChartboostCacheError chartboostCacheError) {
        return new AdError(chartboostCacheError.code.getErrorCode(), chartboostCacheError.toString(), "com.chartboost.sdk");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError c(ChartboostClickError chartboostClickError) {
        return new AdError(chartboostClickError.code.getErrorCode(), chartboostClickError.toString(), "com.chartboost.sdk");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError d(ChartboostShowError chartboostShowError) {
        return new AdError(chartboostShowError.code.getErrorCode(), chartboostShowError.toString(), "com.chartboost.sdk");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError e(CBError.CBImpressionError cBImpressionError) {
        return new AdError(g(cBImpressionError), cBImpressionError.toString(), "com.google.ads.mediation.chartboost");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BannerSize f(Context context, AdSize adSize) {
        BannerSize bannerSize = BannerSize.STANDARD;
        AdSize adSize2 = new AdSize(BannerSize.getWidth(bannerSize), BannerSize.getHeight(bannerSize));
        BannerSize bannerSize2 = BannerSize.MEDIUM;
        AdSize adSize3 = new AdSize(BannerSize.getWidth(bannerSize2), BannerSize.getHeight(bannerSize2));
        BannerSize bannerSize3 = BannerSize.LEADERBOARD;
        AdSize adSize4 = new AdSize(BannerSize.getWidth(bannerSize3), BannerSize.getHeight(bannerSize3));
        ArrayList arrayList = new ArrayList();
        arrayList.add(adSize2);
        arrayList.add(adSize3);
        arrayList.add(adSize4);
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            return null;
        }
        if (findClosestSize.equals(adSize2)) {
            return bannerSize;
        }
        if (findClosestSize.equals(adSize3)) {
            return bannerSize2;
        }
        if (findClosestSize.equals(adSize4)) {
            return bannerSize3;
        }
        return null;
    }

    public static int g(CBError.CBImpressionError cBImpressionError) {
        switch (a.f20486a[cBImpressionError.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            default:
                return 99;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(c cVar) {
        String str;
        String a10 = cVar.a();
        String b10 = cVar.b();
        if (i(a10) && i(b10)) {
            return true;
        }
        if (i(a10)) {
            str = "App Signature";
        } else {
            str = !i(b10) ? "App ID and App Signature" : "App ID";
        }
        String str2 = ChartboostMediationAdapter.TAG;
        Log.e(str2, str + " cannot be empty.");
        return false;
    }

    static boolean i(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }
}
