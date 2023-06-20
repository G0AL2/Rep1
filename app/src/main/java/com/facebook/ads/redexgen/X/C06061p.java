package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06061p {
    public static String[] A0D = {"erlsxJKV5RGKo0fyhsjft4C8myFkBTFD", "xxCOSS58nTJL4g358MAx2boWparhVsnt", "50HA7KO7TX73z1", "kwTSvTyvqMkAeNvnsZNufhK8xoNKpC5A", "CvvJJ5wn5WoPjh", "PJeUG8MSArG13FCqdbuWaTyquTMQa3YW", "KbVXHt7uQSAfPtAdYM2eE220TAgmiqZ3", "QWgxf2msfb1fWKXeTjGnwNJbVHOPLzwf"};
    public int A00;
    public long A01;
    @Nullable
    public RewardData A02;
    @Nullable
    public EnumC1046Jz A03;
    @Nullable
    public String A04;
    @Nullable
    public String A05;
    public boolean A06;
    public final KK A07;
    public final KM A08;
    public final String A09;
    @Nullable
    public final EnumSet<CacheFlag> A0A;
    public final int A0B;
    public final AdPlacementType A0C;

    public C06061p(String str, KM km, AdPlacementType adPlacementType, KK kk, int i10) {
        this(str, km, adPlacementType, kk, i10, EnumSet.of(CacheFlag.NONE));
    }

    public C06061p(String str, KM km, AdPlacementType adPlacementType, KK kk, int i10, @Nullable EnumSet<CacheFlag> enumSet) {
        this.A09 = str;
        this.A0C = adPlacementType;
        this.A07 = kk;
        this.A0B = i10;
        this.A0A = enumSet;
        this.A08 = km;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0C;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        KK kk = this.A07;
        if (kk == null) {
            return AdPlacementType.NATIVE;
        }
        if (kk == KK.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final C1053Kh A01(C1400Xy c1400Xy, KR kr, @Nullable AdExperienceType adExperienceType) {
        M4 m42;
        String str;
        String str2 = this.A09;
        KK kk = this.A07;
        if (kk != null) {
            m42 = new M4(kk.A03(), this.A07.A02());
        } else {
            m42 = null;
        }
        KM km = this.A08;
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            str = AdSettings.getTestAdType().getAdTypeString();
        } else {
            str = null;
        }
        C1053Kh c1053Kh = new C1053Kh(c1400Xy, str2, m42, km, str, this.A0B, AdSettings.isTestMode(c1400Xy), AdSettings.isMixedAudience(), kr, MA.A01(JR.A0H(c1400Xy)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null);
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "1YKhexqCB6oyofjWexJTrFb8PReFz0lW";
        strArr2[3] = "PDYLpd11u8hpbIrKg4rw9QV8MRNrtAlX";
        return c1053Kh;
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final void A03(long j10) {
        this.A01 = j10;
    }

    public final void A04(@Nullable RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(@Nullable EnumC1046Jz enumC1046Jz) {
        this.A03 = enumC1046Jz;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(@Nullable String str) {
        this.A05 = str;
    }

    public final void A08(boolean z10) {
        this.A06 = z10;
    }
}
