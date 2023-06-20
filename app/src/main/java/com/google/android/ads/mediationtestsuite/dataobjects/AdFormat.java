package com.google.android.ads.mediationtestsuite.dataobjects;

import android.util.Log;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.google.android.ads.mediationtestsuite.g;
import com.google.android.ads.mediationtestsuite.utils.a;
import com.google.android.ads.mediationtestsuite.utils.c;
import com.google.android.ads.mediationtestsuite.utils.d;
import com.google.android.ads.mediationtestsuite.utils.e;
import com.google.android.ads.mediationtestsuite.utils.f;
import com.google.android.ads.mediationtestsuite.utils.h;
import com.google.android.ads.mediationtestsuite.utils.i;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import fm.castbox.mediation.widget.AdView;
import org.jspecify.nullness.Nullable;

/* loaded from: classes2.dex */
public enum AdFormat {
    BANNER(AdView.AdType.BANNER, g.E) { // from class: com.google.android.ads.mediationtestsuite.dataobjects.AdFormat.1
        @Override // com.google.android.ads.mediationtestsuite.dataobjects.AdFormat
        public a createAdLoader(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
            return new d(networkConfig, aVar);
        }
    },
    INTERSTITIAL("interstitial", g.G) { // from class: com.google.android.ads.mediationtestsuite.dataobjects.AdFormat.2
        @Override // com.google.android.ads.mediationtestsuite.dataobjects.AdFormat
        public a createAdLoader(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
            return new f(networkConfig, aVar);
        }
    },
    NATIVE("native", g.H) { // from class: com.google.android.ads.mediationtestsuite.dataobjects.AdFormat.3
        @Override // com.google.android.ads.mediationtestsuite.dataobjects.AdFormat
        public a createAdLoader(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
            return new h(networkConfig, aVar);
        }
    },
    REWARDED(RNAdsEvents.EVENT_REWARDED, g.I) { // from class: com.google.android.ads.mediationtestsuite.dataobjects.AdFormat.4
        @Override // com.google.android.ads.mediationtestsuite.dataobjects.AdFormat
        public a createAdLoader(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
            return new i(networkConfig, aVar);
        }
    },
    BANNER_INTERSTITIAL("banner,interstitial", g.F) { // from class: com.google.android.ads.mediationtestsuite.dataobjects.AdFormat.5
        @Override // com.google.android.ads.mediationtestsuite.dataobjects.AdFormat
        public a createAdLoader(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
            int i10 = AnonymousClass7.$SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$AdFormat[networkConfig.i().g().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    String string = e.k().getString(g.f20895z, networkConfig.i().g().getFormatString());
                    if (!c.j(e.k())) {
                        Log.d("gma_test", string);
                        return AdFormat.BANNER.createAdLoader(networkConfig, aVar);
                    }
                    throw new AssertionError(string);
                }
                return AdFormat.INTERSTITIAL.createAdLoader(networkConfig, aVar);
            }
            return AdFormat.BANNER.createAdLoader(networkConfig, aVar);
        }
    },
    UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN, -1) { // from class: com.google.android.ads.mediationtestsuite.dataobjects.AdFormat.6
        @Override // com.google.android.ads.mediationtestsuite.dataobjects.AdFormat
        @Nullable
        public a createAdLoader(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
            return null;
        }
    };
    
    private final int displayResId;
    private final String formatString;

    /* renamed from: com.google.android.ads.mediationtestsuite.dataobjects.AdFormat$7  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$AdFormat;

        static {
            int[] iArr = new int[AdFormat.values().length];
            $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$AdFormat = iArr;
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$AdFormat[AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static AdFormat from(String str) {
        AdFormat[] values;
        for (AdFormat adFormat : values()) {
            if (str.equals(adFormat.getFormatString())) {
                return adFormat;
            }
        }
        return UNKNOWN;
    }

    public abstract a createAdLoader(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar);

    public String getDisplayString() {
        return e.k().getString(this.displayResId);
    }

    public String getFormatString() {
        return this.formatString;
    }

    AdFormat(String str, int i10) {
        this.formatString = str;
        this.displayResId = i10;
    }
}
