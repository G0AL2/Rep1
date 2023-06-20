package com.facebook.ads.redexgen.X;

import android.provider.Settings;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ZZ implements InterfaceC07386v {
    public static byte[] A01;
    public final /* synthetic */ ZY A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-77, -93, -78, -91, -91, -82, -97, -94, -78, -87, -89, -88, -76, -82, -91, -77, -77};
    }

    public ZZ(ZY zy) {
        this.A00 = zy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ZY zy = this.A00;
        return zy.A03(Settings.System.getInt(zy.A00, A00(0, 17, 62), -1) / 255.0f);
    }
}
