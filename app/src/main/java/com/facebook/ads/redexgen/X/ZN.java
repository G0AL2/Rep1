package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZN extends C07296m {
    public static byte[] A01;
    public final KeyguardManager A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-57, -63, -43, -61, -47, -67, -50, -64};
    }

    public ZN(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (KeyguardManager) context.getSystemService(A02(0, 8, 85));
    }

    public final InterfaceC07386v A0G() {
        return new ZR(this);
    }

    public final InterfaceC07386v A0H() {
        return new ZQ(this);
    }

    public final InterfaceC07386v A0I() {
        return new ZP(this);
    }

    public final InterfaceC07386v A0J() {
        return new ZO(this);
    }
}
