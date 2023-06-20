package com.google.ads.mediation.fyber;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import ms.bd.o.Pgl.c;

/* compiled from: FyberAdapterUtils.java */
/* loaded from: classes2.dex */
class a {

    /* compiled from: FyberAdapterUtils.java */
    /* renamed from: com.google.ads.mediation.fyber.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C0277a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20579a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f20580b;

        static {
            int[] iArr = new int[InneractiveErrorCode.values().length];
            f20580b = iArr;
            try {
                iArr[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20580b[InneractiveErrorCode.CONNECTION_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20580b[InneractiveErrorCode.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20580b[InneractiveErrorCode.SERVER_INVALID_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20580b[InneractiveErrorCode.SERVER_INTERNAL_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20580b[InneractiveErrorCode.SDK_INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20580b[InneractiveErrorCode.UNSPECIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20580b[InneractiveErrorCode.LOAD_TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20580b[InneractiveErrorCode.INVALID_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20580b[InneractiveErrorCode.SPOT_DISABLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20580b[InneractiveErrorCode.UNSUPPORTED_SPOT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20580b[InneractiveErrorCode.IN_FLIGHT_TIMEOUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20580b[InneractiveErrorCode.SDK_NOT_INITIALIZED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20580b[InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20580b[InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20580b[InneractiveErrorCode.NATIVE_ADS_NOT_SUPPORTED_FOR_OS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20580b[InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20580b[InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20580b[InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr2 = new int[OnFyberMarketplaceInitializedListener.FyberInitStatus.values().length];
            f20579a = iArr2;
            try {
                iArr2[OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f20579a[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f20579a[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f20579a[OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError a(InneractiveErrorCode inneractiveErrorCode) {
        int i10;
        switch (C0277a.f20580b[inneractiveErrorCode.ordinal()]) {
            case 1:
                i10 = c.COLLECT_MODE_FINANCE;
                break;
            case 2:
                i10 = 301;
                break;
            case 3:
                i10 = IronSourceConstants.OFFERWALL_AVAILABLE;
                break;
            case 4:
                i10 = 303;
                break;
            case 5:
                i10 = 304;
                break;
            case 6:
                i10 = IronSourceConstants.OFFERWALL_OPENED;
                break;
            case 7:
                i10 = 306;
                break;
            case 8:
                i10 = DownloadConnection.HTTP_TEMP_REDIRECT;
                break;
            case 9:
                i10 = 308;
                break;
            case 10:
                i10 = 309;
                break;
            case 11:
                i10 = 310;
                break;
            case 12:
                i10 = 311;
                break;
            case 13:
                i10 = 312;
                break;
            case 14:
                i10 = 313;
                break;
            case 15:
                i10 = 314;
                break;
            case 16:
                i10 = 315;
                break;
            case 17:
                i10 = 316;
                break;
            case 18:
                i10 = 317;
                break;
            default:
                i10 = 399;
                break;
        }
        return new AdError(i10, "Fyber failed to request ad with reason: " + inneractiveErrorCode, FyberMediationAdapter.ERROR_DOMAIN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError b(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        int i10 = C0277a.f20579a[fyberInitStatus.ordinal()];
        int i11 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? 299 : 203 : 202 : 201 : 200;
        return new AdError(i11, "Fyber failed to initialize with reason: " + fyberInitStatus, FyberMediationAdapter.ERROR_DOMAIN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        InneractiveUserConfig inneractiveUserConfig = new InneractiveUserConfig();
        if (bundle.containsKey("age")) {
            inneractiveUserConfig.setAge(bundle.getInt("age", 0));
        }
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
