package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* loaded from: assets/audience_network.dex */
public final class FJ extends AbstractC1625cq {
    public static String[] A02 = {"6CKGqR2K2MH05agWbJN3ka4F1ij3xhtD", "25gFyXHUhXKi43K8KJ4chgoS7w07JQQZ", "vjdmG7Wc53PSGoj25veSMfUO8xL7SxfR", "TQa00i6LjIP9KGMZzj8Rx2HUQjG1dRa1", "ap4e45gngLG", "PTi4Abr85pNMPfkRgyZo1NxbOs1aDg0f", "O7pu2EfbMgektne8Y3vUNLOEHbflJ4Uv", "IlEhKaiOmMN"};
    @Nullable
    public C1616ch A00;
    public final AnonymousClass24 A01;

    public FJ(AnonymousClass24 anonymousClass24) {
        super(anonymousClass24.A0B, A00(anonymousClass24));
        this.A01 = anonymousClass24;
    }

    public static AnonymousClass23 A00(AnonymousClass24 anonymousClass24) {
        return new C1611cc(anonymousClass24);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1625cq
    public final void A05() {
        C1616ch c1616ch = this.A00;
        if (c1616ch != null) {
            c1616ch.A0I();
        }
        super.A00.AEV(EnumC06111u.A04);
    }

    @Nullable
    public final C1616ch A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new C1616ch(this.A01, this, this.A02);
        this.A00.A0M(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A09(com.facebook.ads.Ad ad2, @Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z10) {
        if (super.A00.A5K()) {
            return;
        }
        this.A01.A01(ad2);
        C1616ch c1616ch = this.A00;
        if (c1616ch != null) {
            c1616ch.A0M(str, adExperienceType, z10);
            String[] strArr = A02;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "snzzAybKLkKRz85P4BzzU6VwJ24uwEo8";
            strArr2[1] = "iwkpZYLOXs3iYxZlCgOD0Nxy0vDnSGoK";
            return;
        }
        AnonymousClass24 anonymousClass24 = this.A01;
        anonymousClass24.A05 = str;
        anonymousClass24.A02 = adExperienceType;
        anonymousClass24.A08 = z10;
        A08();
    }

    public final void A0A(RewardData rewardData) {
        this.A01.A03 = rewardData;
        C1616ch c1616ch = this.A00;
        if (c1616ch != null) {
            c1616ch.A0K(rewardData);
        }
    }

    public final boolean A0B() {
        C1616ch c1616ch = this.A00;
        if (c1616ch != null) {
            return c1616ch.A0N();
        }
        return this.A01.A01 > 0 && MJ.A00() > this.A01.A01;
    }

    public final boolean A0C() {
        C1616ch c1616ch = this.A00;
        if (c1616ch != null) {
            return c1616ch.A0O();
        }
        return super.A00.A5d() == EnumC06111u.A06;
    }

    public final boolean A0D(com.facebook.ads.Ad ad2, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((C06955d) rewardedVideoShowAdConfig).A00();
        long A01 = ((C06955d) rewardedVideoShowAdConfig).A01();
        if (super.A00.A5L()) {
            return false;
        }
        this.A01.A01(ad2);
        C1616ch c1616ch = this.A00;
        if (c1616ch != null) {
            return c1616ch.A0P(A00, A01);
        }
        this.A00 = new C1616ch(this.A01, this, this.A02);
        this.A00.A0P(A00, A01);
        return false;
    }
}
