package com.chartboost.sdk.Events;

import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Model.CBError;

/* loaded from: classes.dex */
public class BannerErrorMap {

    /* renamed from: com.chartboost.sdk.Events.BannerErrorMap$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError;

        static {
            int[] iArr = new int[CBError.CBImpressionError.values().length];
            $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError = iArr;
            try {
                iArr[CBError.CBImpressionError.INVALID_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.WRONG_ORIENTATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.NO_AD_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.ASSET_MISSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.NETWORK_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.INTERNET_UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_CACHE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.ERROR_CREATING_VIEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.ERROR_DISPLAYING_VIEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.PENDING_IMPRESSION_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.WEB_VIEW_CLIENT_RECEIVED_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[CBError.CBImpressionError.WEB_VIEW_PAGE_LOAD_TIMEOUT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    private static ChartboostCacheError createBannerCacheError(ChartboostCacheError.Code code) {
        return new ChartboostCacheError(code);
    }

    private static ChartboostShowError createBannerShowError(ChartboostShowError.Code code, boolean z10) {
        return new ChartboostShowError(code, z10);
    }

    public static ChartboostError mapImpressionErrorToBannerCacheError(CBError.CBImpressionError cBImpressionError) {
        switch (AnonymousClass1.$SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[cBImpressionError.ordinal()]) {
            case 1:
            case 3:
            case 4:
                return createBannerCacheError(ChartboostCacheError.Code.NO_AD_FOUND);
            case 2:
                return createBannerCacheError(ChartboostCacheError.Code.ASSET_DOWNLOAD_FAILURE);
            case 5:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return createBannerCacheError(ChartboostCacheError.Code.INTERNAL);
            case 6:
                return createBannerCacheError(ChartboostCacheError.Code.NETWORK_FAILURE);
            case 7:
                return createBannerCacheError(ChartboostCacheError.Code.INTERNET_UNAVAILABLE);
            case 8:
            default:
                return createBannerCacheError(ChartboostCacheError.Code.INTERNAL);
        }
    }

    public static ChartboostError mapImpressionErrorToBannerShowError(CBError.CBImpressionError cBImpressionError) {
        switch (AnonymousClass1.$SwitchMap$com$chartboost$sdk$Model$CBError$CBImpressionError[cBImpressionError.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return createBannerShowError(ChartboostShowError.Code.NO_CACHED_AD, false);
            case 7:
            case 8:
            case 9:
                return createBannerShowError(ChartboostShowError.Code.INTERNET_UNAVAILABLE, false);
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return createBannerShowError(ChartboostShowError.Code.PRESENTATION_FAILURE, false);
            case 15:
                return createBannerShowError(ChartboostShowError.Code.INTERNET_UNAVAILABLE, true);
            default:
                return createBannerShowError(ChartboostShowError.Code.INTERNAL, false);
        }
    }
}
