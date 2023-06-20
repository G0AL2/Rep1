package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1631cw implements Kj {
    public static byte[] A0E;
    public static String[] A0F = {"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    @Nullable
    public InterfaceC06091s A00;
    public C9H A01;
    @Nullable
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    @Nullable
    public final AdSize A06;
    public final C05830s A07;
    public final C1400Xy A08;
    public final InterfaceC1028Jh A09;
    public final KM A0A;
    public final C1055Kk A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            A0F[1] = "uoxYJqIRleds8fPMMv";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 87);
            i13++;
        }
    }

    public static void A05() {
        byte[] bArr = {64, 65, -14, 66, 62, 51, 53, 55, 63, 55, 64, 70, -14, 59, 64, -14, 68, 55, 69, 66, 65, 64, 69, 55};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        A0F[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    static {
        A05();
        MU.A02();
    }

    public C1631cw(C1400Xy c1400Xy, String str, KM km, @Nullable AdSize adSize, int i10) {
        this.A08 = c1400Xy;
        this.A0D = str;
        this.A0A = km;
        this.A06 = adSize;
        this.A04 = i10;
        this.A0B = new C1055Kk(this.A08);
        this.A0B.A0P(this);
        this.A07 = new C05830s();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new FM(this);
        this.A09 = c1400Xy.A08();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C1670da> A04() {
        C9H c9h = this.A01;
        ArrayList arrayList = new ArrayList(c9h.A02());
        for (C9F A04 = c9h.A04(); A04 != null; A04 = c9h.A04()) {
            InterfaceC05780n A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (A00 != null && A00.A7B() == AdPlacementType.NATIVE) {
                C1670da c1670da = (C1670da) A00;
                c1670da.A0L(this.A08, new FN(this, arrayList, c1670da), this.A09, new C06071q(A04.A04(), c9h.A05(), this.A0D, c9h.A05().A0C()), UB.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            KR kr = new KR(this.A08, null, null, null);
            C1400Xy c1400Xy = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0O(new C1053Kh(c1400Xy, str, adSize != null ? new M4(adSize.getWidth(), this.A06.getHeight()) : null, this.A0A, null, this.A04, AdSettings.isTestMode(this.A08), AdSettings.isMixedAudience(), kr, MA.A01(JR.A0H(this.A08)), this.A02, null));
        } catch (KI e10) {
            AAi(KH.A02(e10));
        }
    }

    public final void A08(InterfaceC06091s interfaceC06091s) {
        this.A00 = interfaceC06091s;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        C9H c9h = this.A01;
        return c9h == null || c9h.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.Kj
    public final void AAi(KH kh) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        InterfaceC06091s interfaceC06091s = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        A0F[2] = "yGn7NPCZVX";
        if (interfaceC06091s != null) {
            interfaceC06091s.AAi(kh);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Kj
    public final void ACS(C1299Ty c1299Ty) {
        C9H A00 = c1299Ty.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<C1670da> A04 = A04();
            if (this.A00 != null) {
                if (A04.isEmpty()) {
                    this.A00.AAi(KH.A01(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.ABd(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 123));
    }
}
