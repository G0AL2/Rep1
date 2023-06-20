package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class NC implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TM A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public NC(TM tm) {
        this.A00 = tm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1110Mq interfaceC1110Mq;
        if (L0.A02(this)) {
            return;
        }
        try {
            interfaceC1110Mq = this.A00.A05;
            interfaceC1110Mq.A3s(A00(0, 15, 9));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
