package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.54  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass54 implements AdViewApi {
    public static byte[] A0D;
    public static String[] A0E = {"of0bzA7MwNGTia9F31tAkieNA09H6OOQ", "TyTQj7xFBxvma6AaZ1TUwVS6lItsexiQ", "kN9yyhhGlFuDqh5wulKzoOOSsFZblOVu", "DXKKP4SSVuW5x9unPZpKCS00jdGSX4q", "ceBkREnsnDPWKQGMERGG6oDocc2kf8dJ", "ULZujO58Hn4sCnlurEwExiI5FfKtYml", "oBzM86F4GMvLYp6iWCqbmyfPVfF4ncm8", "8s2Qgj6JQYkd4IbFNTxV1lfTN5yJUxqm"};
    public long A00;
    @Nullable
    public View A01;
    @Nullable
    public AdListener A02;
    @Nullable
    public FQ A03;
    @Nullable
    public OE A04;
    @Nullable
    public String A05;
    @Nullable
    public String A06;
    public final DisplayMetrics A07;
    public final AdView A08;
    public final AdViewParentApi A09;
    public final C0904El A0A;
    public final KK A0B;
    public final String A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-77, -73, -75, -29, -74, -79, -72, -73, 121, 119, -90, 124, 117, 126, -87, -11, -12, -11, -11, -15, -16, -15, 35, -17, 14, 27, 27, 18, 31, -51, 14, 17, -51, 17, 18, 32, 33, 31, 28, 38, 18, 17, -14, 17, 30, 30, 21, 34, -48, 17, 20, -48, 28, 31, 17, 20, -48, 34, 21, 33, 37, 21, 35, 36, 21, 20, -118, -88, -75, -75, -74, -69, 103, -83, -80, -75, -85, 103, -88, 103, -69, -84, -76, -73, -77, -88, -69, -84, 103, -69, -81, -88, -69, 103, -77, -74, -88, -85, 103, -87, -80, -85, 103, 110, 108, -70, 110, -77, -74, -91, -69, -52, -73, -20, -19, -5, -4, -6, -9, 1, -40, -37, -51, -48, -83, -48};
        if (A0E[2].charAt(11) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[7] = "i0zr3oWhaZ1ZQYjulO9yltnfKtDweGPM";
        strArr[6] = "f16HnFk6V4WfoRTY4RGQrwGHYb77b2mz";
        A0D = bArr;
    }

    static {
        A02();
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public AnonymousClass54(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = C1075Lf.A04(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = C5G.A06(context);
            this.A0A.A0D().A2g(AdPlacementType.BANNER.toString(), str);
            C06061p c06061p = new C06061p(str, C1075Lf.A05(this.A0B), AdPlacementType.BANNER, C1075Lf.A04(adSize), 1);
            c06061p.A06(this.A05);
            c06061p.A07(this.A06);
            this.A03 = new FQ(this.A0A, c06061p);
            this.A03.A0M(new C1564bm(this));
            return;
        }
        throw new IllegalArgumentException(A01(107, 6, 18));
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public AnonymousClass54(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws KI {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0D().A3c();
    }

    public static AdSize A00(String str) throws KI {
        KM A00 = KR.A00(str);
        if (A00 != null) {
            KR.A03(A00);
            return C1075Lf.A01(A00);
        }
        throw new KI(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A01(66, 41, 7), str));
    }

    private void A03(@Nullable String str) {
        this.A00 = System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0D().A2d();
        } else {
            this.A0A.A0D().A2c();
        }
        FQ fq = this.A03;
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "8EJDtH9EjlwutgZO3WtzB3nx702AY4O";
        strArr2[5] = "dTiKD7UwUCw1SvcKYJrEphBgoR9CLtC";
        if (fq != null) {
            fq.A0P(str);
        }
        this.A0A.A0D().A2b();
    }

    public final long A04() {
        return this.A00;
    }

    public final DisplayMetrics A05() {
        return this.A07;
    }

    @Nullable
    public final AdListener A06() {
        return this.A02;
    }

    public final AdView A07() {
        return this.A08;
    }

    @Nullable
    public final FQ A08() {
        return this.A03;
    }

    public final C0904El A09() {
        return this.A0A;
    }

    public final KK A0A() {
        return this.A0B;
    }

    public final void A0B(RelativeLayout relativeLayout, View view) {
        C1180Pi A01;
        this.A0A.A0D().A3p(this.A06 != null);
        String str = this.A06;
        if (str != null && (A01 = C1179Ph.A01(this.A0A, str)) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(A01, new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0C(@Nullable AdListener adListener) {
        this.A0A.A0D().A2Z(adListener != null);
        this.A02 = adListener;
    }

    public final void A0D(OE oe2) {
        this.A04 = oe2;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new C1041Ju(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        KV.A05(A01(113, 7, 72), A01(23, 19, 109), A01(0, 8, 65));
        this.A0A.A0D().A2h();
        FQ fq = this.A03;
        if (fq != null) {
            fq.A0R(true);
            this.A03 = null;
        }
        if (Build.VERSION.SDK_INT >= 18 && this.A04 != null && JR.A0w(this.A08.getContext())) {
            OE oe2 = this.A04;
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "fmi4ltQko56R0Ot1hIU3uMuoiOam3SD1";
            strArr2[6] = "7H1g3sSDF1cZj7eOXlokIXc1uirRZwhG";
            oe2.A07();
            View view = this.A01;
            if (view != null) {
                view.getOverlay().remove(this.A04);
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        FQ fq = this.A03;
        boolean z10 = fq == null || fq.A0S();
        this.A0A.A0D().A4Y(z10);
        return z10;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        KV.A05(A01(120, 6, 44), A01(42, 24, 112), A01(15, 8, 127));
        A03(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(AdView.AdViewLoadConfig adViewLoadConfig) {
        KV.A05(A01(120, 6, 44), A01(42, 24, 112), A01(8, 7, 5));
        A03(((C1041Ju) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        View view = this.A01;
        if (view != null) {
            KO.A01(this.A07, view, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
    }
}
