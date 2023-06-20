package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1618cj extends AbstractC05790o {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ C1616ch A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public C1618cj(C1616ch c1616ch) {
        this.A00 = c1616ch;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0B;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0B;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j10;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        MK mk;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C06955d c06955d = (C06955d) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j10 = this.A00.A02;
            c06955d.A02(currentTimeMillis - j10);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c06955d.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
        mk = this.A00.A07;
        mk.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass24;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        anonymousClass24 = this.A00.A0C;
        s2SRewardedVideoAdExtendedListener.onAdClicked(anonymousClass24.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass24;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        anonymousClass24 = this.A00.A0C;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(anonymousClass24.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0F(InterfaceC05780n interfaceC05780n) {
        FL fl;
        FL fl2;
        AnonymousClass24 anonymousClass24;
        AnonymousClass24 anonymousClass242;
        FL fl3;
        AnonymousClass18 anonymousClass18;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass243;
        AnonymousClass18 anonymousClass182;
        RewardedVideoAd rewardedVideoAd2;
        AnonymousClass18 anonymousClass183;
        AnonymousClass24 anonymousClass244;
        RewardedVideoAd rewardedVideoAd3;
        AnonymousClass18 anonymousClass184;
        AnonymousClass24 anonymousClass245;
        AnonymousClass18 anonymousClass185;
        AnonymousClass24 anonymousClass246;
        AnonymousClass24 anonymousClass247;
        AnonymousClass24 anonymousClass248;
        fl = this.A00.A05;
        if (fl == null) {
            this.A00.A0A.A06().A8y(A00(0, 3, 70), C07828z.A0N, new AnonymousClass90(A00(3, 18, 43)));
            return;
        }
        C1616ch c1616ch = this.A00;
        fl2 = c1616ch.A05;
        c1616ch.A08 = fl2.A0E();
        AbstractC1660dQ abstractC1660dQ = (AbstractC1660dQ) interfaceC05780n;
        anonymousClass24 = this.A00.A0C;
        if (anonymousClass24.A03 != null) {
            anonymousClass248 = this.A00.A0C;
            abstractC1660dQ.A02(anonymousClass248.A03);
        }
        anonymousClass242 = this.A00.A0C;
        int A0D = abstractC1660dQ.A0D();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        anonymousClass242.A00 = A0D;
        this.A00.A09 = true;
        C1616ch c1616ch2 = this.A00;
        fl3 = c1616ch2.A05;
        c1616ch2.A04 = fl3.A0T();
        anonymousClass18 = this.A00.A04;
        if (anonymousClass18 != null) {
            anonymousClass184 = this.A00.A04;
            if (anonymousClass184.A0G() > 0) {
                C1071Lb c1071Lb = new C1071Lb();
                C1400Xy c1400Xy = this.A00.A0A;
                anonymousClass245 = this.A00.A0C;
                String str = anonymousClass245.A06;
                anonymousClass185 = this.A00.A04;
                if (c1071Lb.A09(c1400Xy, str, anonymousClass185.A0G())) {
                    c1071Lb.A08(this.A00.A0A, true);
                    C1616ch c1616ch3 = this.A00;
                    C1400Xy c1400Xy2 = c1616ch3.A0A;
                    anonymousClass246 = this.A00.A0C;
                    String str2 = anonymousClass246.A0C;
                    anonymousClass247 = this.A00.A0C;
                    c1616ch3.A03 = c1071Lb.A07(c1400Xy2, str2, anonymousClass247.A06);
                } else {
                    c1071Lb.A08(this.A00.A0A, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0B;
            anonymousClass243 = this.A00.A0C;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(anonymousClass243.A00());
            return;
        }
        anonymousClass182 = this.A00.A04;
        anonymousClass182.A0m(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        anonymousClass183 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(anonymousClass183.A0M());
        anonymousClass244 = this.A00.A0C;
        RewardedVideoAd.RewardedVideoLoadAdConfig build = withRewardData.withAdExperience(anonymousClass244.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.1z
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(com.facebook.ads.Ad ad2) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(com.facebook.ads.Ad ad2) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                AnonymousClass24 anonymousClass249;
                s2SRewardedVideoAdExtendedListener2 = C1618cj.this.A00.A0B;
                anonymousClass249 = C1618cj.this.A00.A0C;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(anonymousClass249.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(com.facebook.ads.Ad ad2, AdError adError) {
                AnonymousClass18 anonymousClass186;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                AnonymousClass24 anonymousClass249;
                C1618cj.this.A00.A03 = null;
                anonymousClass186 = C1618cj.this.A00.A04;
                anonymousClass186.A0m(false);
                s2SRewardedVideoAdExtendedListener2 = C1618cj.this.A00.A0B;
                anonymousClass249 = C1618cj.this.A00.A0C;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(anonymousClass249.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(com.facebook.ads.Ad ad2) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                MK mk;
                s2SRewardedVideoAdExtendedListener2 = C1618cj.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
                mk = C1618cj.this.A00.A07;
                mk.A05();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C1618cj.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(build);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0G(KH kh) {
        AnonymousClass24 anonymousClass24;
        long j10;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass242;
        this.A00.A0F(true);
        anonymousClass24 = this.A00.A0C;
        C0R A0D = anonymousClass24.A0B.A0D();
        j10 = this.A00.A01;
        A0D.A2a(MJ.A01(j10), kh.A03().getErrorCode(), kh.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        anonymousClass242 = this.A00.A0C;
        s2SRewardedVideoAdExtendedListener.onError(anonymousClass242.A00(), C1073Ld.A00(kh));
    }
}
