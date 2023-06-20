package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ch  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1616ch implements InterfaceC06141x {
    public static byte[] A0D;
    public static String[] A0E = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0F;
    public long A02;
    @Nullable
    public RewardedVideoAd A03;
    @Nullable
    public AnonymousClass18 A04;
    @Nullable
    public FL A05;
    @Nullable
    public C1572bu A06;
    @Nullable
    public String A08;
    public final C1400Xy A0A;
    public final S2SRewardedVideoAdExtendedListener A0B;
    public final AnonymousClass24 A0C;
    public int A00 = 0;
    public boolean A09 = false;
    public long A01 = -1;
    public MK A07 = new MK();

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0D = new byte[]{120, 87, 25, 88, 93, 25, 85, 86, 88, 93, 25, 80, 74, 25, 88, 85, 75, 92, 88, 93, 64, 25, 80, 87, 25, 73, 75, 86, 94, 75, 92, 74, 74, 23, 25, 96, 86, 76, 25, 74, 81, 86, 76, 85, 93, 25, 78, 88, 80, 77, 25, 95, 86, 75, 25, 88, 93, 117, 86, 88, 93, 92, 93, 17, 16, 25, 77, 86, 25, 91, 92, 25, 90, 88, 85, 85, 92, 93, 47, 24, 24, 5, 24, 74, 6, 5, 11, 14, 3, 4, 13, 74, 24, 15, 29, 11, 24, 14, 15, 14, 74, 28, 3, 14, 15, 5, 74, 11, 14, 92, 77, 84};
        if (A0E[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A0C();
        A0F = C1616ch.class.getSimpleName();
    }

    public C1616ch(AnonymousClass24 anonymousClass24, AnonymousClass27 anonymousClass27, String str) {
        this.A0C = anonymousClass24;
        this.A0A = anonymousClass24.A0B;
        this.A0B = new C1609ca(str, anonymousClass27, this, anonymousClass24);
    }

    private void A0E(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z10) {
        String A02;
        if (!this.A09 && this.A05 != null) {
            Log.w(A0F, A0A(0, 78, 100));
        }
        A0F(false);
        this.A09 = false;
        C06061p c06061p = new C06061p(this.A0C.A0C, KM.A06, AdPlacementType.REWARDED_VIDEO, KK.A07, 1);
        c06061p.A08(z10);
        if (JR.A1o(this.A0A) && (A02 = C1071Lb.A02(this.A0A, this.A0C.A06)) != null) {
            AnonymousClass24 anonymousClass24 = this.A0C;
            String[] strArr = A0E;
            if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            A0E[6] = "NRWBzlFLQPOGySbiiYXSLDN6";
            anonymousClass24.A06 = A02;
        }
        c06061p.A06(this.A0C.A06);
        c06061p.A07(this.A0C.A07);
        this.A05 = new FL(this.A0C.A0B, c06061p);
        this.A05.A0M(new C1618cj(this));
        this.A05.A0Q(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(boolean z10) {
        FL fl = this.A05;
        if (fl != null) {
            fl.A0M(new C1617ci(this));
            this.A05.A0R(z10);
            this.A05 = null;
        }
    }

    public final long A0H() {
        FL fl = this.A05;
        if (fl != null) {
            return fl.A0B();
        }
        return -1L;
    }

    public final void A0I() {
        A0F(true);
    }

    public final void A0J() {
        C1572bu c1572bu = this.A06;
        if (c1572bu != null) {
            c1572bu.A02();
        }
    }

    public final void A0K(RewardData rewardData) {
        FL fl;
        this.A0C.A03 = rewardData;
        if (this.A09 && (fl = this.A05) != null) {
            fl.A0U(rewardData);
        }
    }

    public final void A0L(AdCompanionView adCompanionView) {
        AnonymousClass18 anonymousClass18;
        this.A06 = (C1572bu) adCompanionView.getAdCompanionViewApi();
        C1400Xy c1400Xy = this.A0A;
        if (c1400Xy != null && (anonymousClass18 = this.A04) != null) {
            this.A06.A03(c1400Xy, anonymousClass18);
        }
    }

    public final void A0M(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z10) {
        this.A01 = System.currentTimeMillis();
        try {
            A0E(str, adExperienceType, z10);
        } catch (Exception e10) {
            Log.e(A0F, A0A(78, 31, 55), e10);
            this.A0C.A0B.A06().A8y(A0A(109, 3, 96), C07828z.A0b, new AnonymousClass90(e10));
            AdError internalError = AdError.internalError(2004);
            this.A0C.A0B.A0D().A2a(MJ.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A0B.onError(this.A0C.A00(), internalError);
        }
    }

    public final boolean A0N() {
        FL fl = this.A05;
        return fl == null || fl.A0S();
    }

    public final boolean A0O() {
        return this.A09;
    }

    public final boolean A0P(int i10, long j10) {
        if (!this.A09) {
            this.A0B.onError(this.A0C.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        } else if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A07.A02(i10);
            this.A05.A07.A03(j10);
            this.A05.A0G();
            this.A09 = false;
            return true;
        } else {
            this.A09 = false;
            return false;
        }
    }
}
