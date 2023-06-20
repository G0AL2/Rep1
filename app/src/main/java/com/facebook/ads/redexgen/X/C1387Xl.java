package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1387Xl extends L8 {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C1399Xx A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{91, 108, 99, 40, 123, 125, 107, 107, 109, 123, 123, 110, 125, 100, 100, 113, 40, 97, 102, 97, 124, 97, 105, 100, 97, 114, 109, 108, 41};
    }

    public C1387Xl(C1399Xx c1399Xx, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1399Xx;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        try {
            XW.A02().A0C(this.A01);
        } catch (Throwable th) {
            this.A01.A06().A3R(th);
        }
        C9N.A0C(this.A01);
        AudienceNetworkAds.InitListener initListener = this.A00;
        if (initListener != null) {
            C9N.A04(initListener, new C9M(true, A00(0, 29, 0)));
        }
    }
}
