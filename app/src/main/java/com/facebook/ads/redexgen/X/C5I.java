package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.5I  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5I implements InterstitialAdApi, Repairable {
    public static byte[] A05;
    public static String[] A06 = {"S822El9zG6GuADGrtluuLX363osWhxiG", "ZFI3hp6NIHNPBZ8p7tKJKM6DxTur89gU", "rKe2xKovfMLHVnc2kJBHIfRtW7KI2joW", "CTsEdbmp9bu3ZhSS7yZH02ALmjP1FNtP", "mPYAOoIIU9PuPwOlU3lFT13mhy9mIxzC", "", "", "HqZNdyzgU2LJRhG9zHJvoyCPzWSUAGCn"};
    public boolean A00;
    public final InterstitialAd A01;
    public final AnonymousClass20 A02;
    public final FK A03;
    public final C1400Xy A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            if (A06[0].charAt(22) != '3') {
                throw new RuntimeException();
            }
            A06[4] = "dLq0XFJawohP2A9uDPm8W8ZKhW9iXRhW";
            copyOfRange[i13] = (byte) (i14 - 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-30, -32, 21, 18, 19, -31, 20, -30, -72, -73, -25, -72, -73, -70, -73, -73, 56, 93, 99, 84, 97, 93, 80, 91, 15, 84, 97, 97, 94, 97, 29, -7, -49, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -90, -25, -22, -90, -22, -21, -7, -6, -8, -11, -1, -21, -22, -29, 8, 14, -1, 12, 13, 14, 3, 14, 3, -5, 6, -70, -5, -2, -70, 6, 9, -5, -2, -70, 12, -1, 11, 15, -1, 13, 14, -1, -2, -56, -19, -13, -28, -15, -14, -13, -24, -13, -24, -32, -21, -97, -32, -29, -97, -14, -25, -18, -10, -97, -30, -32, -21, -21, -28, -29, 8, -39, -40, -37, -39, 11, 8, -10, -9, 5, 6, 4, 1, 11, -28, -17, -52, -17, -31, -28, -63, -28, 49, 38, 45, 53};
    }

    static {
        A01();
    }

    public C5I(Context context, String str, InterstitialAd interstitialAd) {
        this.A01 = interstitialAd;
        this.A04 = C5G.A03(context);
        this.A04.A0D().A2g(AdPlacementType.INTERSTITIAL.toString(), str);
        this.A02 = new AnonymousClass20(this.A04, interstitialAd, str);
        this.A04.A0G(this);
        this.A03 = new FK(this.A02);
    }

    public final void A02(InterstitialAdListener interstitialAdListener) {
        this.A04.A0D().A2Z(interstitialAdListener != null);
        this.A02.A0D(interstitialAdListener);
        if (A06[0].charAt(22) != '3') {
            throw new RuntimeException();
        }
        A06[4] = "rYQ6gTbtajntBm3fXVm84HcfyQ9ACN8J";
    }

    public final void A03(RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A04(RewardedAdListener rewardedAdListener) {
        this.A02.A0F(rewardedAdListener);
    }

    public final void A05(EnumSet<CacheFlag> enumSet, @Nullable String str, boolean z10) {
        KV.A05(A00(128, 8, 2), A00(57, 30, 28), A00(114, 7, 39));
        if (str == null) {
            this.A04.A0D().A2d();
        } else {
            this.A04.A0D().A2c();
        }
        this.A00 = z10;
        this.A03.A09(this.A01, enumSet, str);
        this.A04.A0D().A2b();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C5J(this);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C5K();
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        KV.A05(A00(121, 7, 20), A00(32, 25, 8), A00(8, 8, 7));
        if (JR.A1Z(this.A04)) {
            return;
        }
        this.A03.A05();
        this.A04.A0D().A2h();
    }

    public final void finalize() {
        this.A03.A04();
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A02.A09();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean A0A = this.A03.A0A();
        this.A04.A0D().A4Y(A0A);
        return A0A;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A03.A0B();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        A05(CacheFlag.ALL, null, false);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((C5J) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void registerAdCompanionView(AdCompanionView adCompanionView) {
        if (this.A00 && this.A03.A07() != null) {
            this.A03.A07().A0H(adCompanionView);
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A02.A02() != null) {
            InterstitialAdListener A02 = this.A02.A02();
            InterstitialAd interstitialAd = this.A01;
            A02.onError(interstitialAd, new AdError(2001, A00(16, 16, 113) + MA.A03(this.A04, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A02.A0H(extraHints.getHints());
        this.A02.A0I(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        KV.A05(A00(136, 4, 64), A00(87, 27, 1), A00(0, 8, 49));
        this.A04.A0D().A2m();
        boolean A0C = this.A03.A0C(this.A01, new C5K());
        this.A04.A0D().A2l(A0C);
        return A0C;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A04.A0D().A2m();
        boolean A0C = this.A03.A0C(this.A01, interstitialShowAdConfig);
        this.A04.A0D().A2l(A0C);
        return A0C;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void unregisterAdCompanionView() {
        if (this.A00 && this.A03.A07() != null) {
            this.A03.A07().A0G();
        }
    }
}
