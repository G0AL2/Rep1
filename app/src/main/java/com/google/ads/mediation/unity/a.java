package com.google.ads.mediation.unity;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.UnityBannerSize;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;

/* compiled from: UnityAdsAdapterUtils.java */
/* loaded from: classes2.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnityAdsAdapterUtils.java */
    /* renamed from: com.google.ads.mediation.unity.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0280a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20715a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f20716b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f20717c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f20718d;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            f20718d = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20718d[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20718d[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20718d[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20718d[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20718d[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20718d[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            f20717c = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20717c[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20717c[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20717c[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20717c[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
            f20716b = iArr3;
            try {
                iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20716b[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20716b[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr4 = new int[BannerErrorCode.values().length];
            f20715a = iArr4;
            try {
                iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20715a[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20715a[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20715a[BannerErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* compiled from: UnityAdsAdapterUtils.java */
    /* loaded from: classes2.dex */
    public enum b {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError a(int i10, String str) {
        return new AdError(i10, str, "com.unity3d.ads");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError b(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        return a(e(unityAdsInitializationError), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError c(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        return a(f(unityAdsLoadError), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError d(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        return a(g(unityAdsShowError), str);
    }

    static int e(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i10 = C0280a.f20716b[unityAdsInitializationError.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
                }
                return 303;
            }
            return IronSourceConstants.OFFERWALL_AVAILABLE;
        }
        return 301;
    }

    static int f(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i10 = C0280a.f20717c[unityAdsLoadError.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? DownloadResource.STATUS_BAD_REQUEST : TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE : TTAdConstant.DEEPLINK_FALLBACK_CODE : TTAdConstant.DEEPLINK_UNAVAILABLE_CODE : TTAdConstant.AD_ID_IS_NULL_CODE : TTAdConstant.MATE_IS_NULL_CODE;
    }

    static int g(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (C0280a.f20718d[unityAdsShowError.ordinal()]) {
            case 1:
                return IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE;
            case 2:
                return IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION;
            case 3:
                return 503;
            case 4:
                return ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOK_GUEST;
            case 5:
                return IronSourceError.ERROR_CODE_KEY_NOT_SET;
            case 6:
                return IronSourceError.ERROR_CODE_INVALID_KEY_VALUE;
            case 7:
                return 507;
            default:
                return 500;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(BannerErrorInfo bannerErrorInfo) {
        int i10 = C0280a.f20715a[bannerErrorInfo.errorCode.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return i10 != 4 ? 200 : 204;
                }
                return 203;
            }
            return 202;
        }
        return 201;
    }

    public static UnityBannerSize i(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize != null) {
            return new UnityBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight());
        }
        return null;
    }
}
