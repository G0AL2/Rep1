package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.eU  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1720eU<ModelType, StateType> {
    public static byte[] A05;
    public static final C1720eU A06;
    public final C1720eU A00;
    public final ModelType A01;
    public final StateType A02;
    public final String A03;
    public final List<InterfaceC1723eX<ModelType, StateType>> A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{81, 89, 92, 96, 101};
    }

    static {
        A02();
        A06 = new C1720eU(null, null, A01(0, 5, 123), Collections.emptyList(), A06);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1720eU(com.facebook.ads.redexgen.X.C1721eV<ModelType, StateType> r7) {
        /*
            r6 = this;
            java.lang.Object r1 = com.facebook.ads.redexgen.X.C1721eV.A01(r7)
            java.lang.Object r2 = com.facebook.ads.redexgen.X.C1721eV.A02(r7)
            java.lang.String r3 = com.facebook.ads.redexgen.X.C1721eV.A03(r7)
            java.util.List r0 = com.facebook.ads.redexgen.X.C1721eV.A04(r7)
            if (r0 != 0) goto L1f
            java.util.List r4 = java.util.Collections.emptyList()
        L16:
            com.facebook.ads.redexgen.X.eU r5 = com.facebook.ads.redexgen.X.C1721eV.A00(r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1f:
            java.util.List r4 = com.facebook.ads.redexgen.X.C1721eV.A04(r7)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1720eU.<init>(com.facebook.ads.redexgen.X.eV):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C1720eU(ModelType model, StateType state, String str, List<InterfaceC1723eX<ModelType, StateType>> list, C1720eU c1720eU) {
        this.A01 = model;
        this.A02 = state;
        this.A03 = str;
        this.A00 = c1720eU;
        this.A04 = list;
    }

    public static <ModelType, StateType> C1721eV<ModelType, StateType> A00(ModelType modeltype, StateType statetype, String str) {
        return new C1721eV<>(modeltype, statetype, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eX != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final void A03(InterfaceC1709eJ interfaceC1709eJ) {
        for (InterfaceC1723eX<ModelType, StateType> interfaceC1723eX : this.A04) {
            interfaceC1723eX.A5I(this, interfaceC1709eJ);
        }
    }
}
