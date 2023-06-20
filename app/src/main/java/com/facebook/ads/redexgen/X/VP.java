package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VP implements GY {
    public static String[] A01 = {"uyzG6nZhYmNB4VufbjNeT4Wu24aJjB", "gpgsRAJrUCyLiJ0U4KQoajYft8d2IWSs", "V6tp6oNeuWY4Rz4wk", "QxLD6Qr0", "n2jYEAQ7ylPlmaGFo", "iuLvneSMbLfhzIa7Pvm7Ht11vKly078I", "9KvTRZ4e8scFY8IRtC8ize1aHWfIVCyu", "s0mDJJaIHWanY7Mz7gNVqOFT5NJr2uCg"};
    public final List<GX> A00;

    public VP(List<GX> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6B(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6b(int i10) {
        IK.A03(i10 == 0);
        String[] strArr = A01;
        if (strArr[6].charAt(12) != strArr[7].charAt(12)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "k5niKSSkUsmLECakjkbMaTYSf6uR41";
        strArr2[3] = "iDI18Hfk";
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6c() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A70(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
