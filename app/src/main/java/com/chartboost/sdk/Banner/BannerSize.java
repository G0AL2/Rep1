package com.chartboost.sdk.Banner;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ms.bd.o.Pgl.c;

/* loaded from: classes.dex */
public enum BannerSize {
    STANDARD,
    MEDIUM,
    LEADERBOARD;
    

    /* renamed from: a  reason: collision with root package name */
    private static final CBSize f13624a = new CBSize(320, 50);

    /* renamed from: b  reason: collision with root package name */
    private static final CBSize f13625b = new CBSize(c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);

    /* renamed from: c  reason: collision with root package name */
    private static final CBSize f13626c = new CBSize(728, 90);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13628a;

        static {
            int[] iArr = new int[BannerSize.values().length];
            f13628a = iArr;
            try {
                iArr[BannerSize.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13628a[BannerSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13628a[BannerSize.LEADERBOARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static CBSize a(BannerSize bannerSize) {
        int i10 = a.f13628a[bannerSize.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return f13626c;
            }
            return f13625b;
        }
        return f13624a;
    }

    public static BannerSize fromInteger(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return LEADERBOARD;
            }
            return MEDIUM;
        }
        return STANDARD;
    }

    public static int getHeight(BannerSize bannerSize) {
        CBSize a10 = a(bannerSize);
        if (a10 != null) {
            return a10.getHeight();
        }
        return 0;
    }

    public static int getWidth(BannerSize bannerSize) {
        CBSize a10 = a(bannerSize);
        if (a10 != null) {
            return a10.getWidth();
        }
        return 0;
    }
}
