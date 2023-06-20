package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Er  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0910Er implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ F0 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-73, -39, -22, -33, -27, -28, -106, -36, -33, -30, -37, -106, -30, -27, -41, -38, -33, -28, -35, -106, -36, -41, -33, -30, -37, -38, -92, -66, -23, -15, -24, -26, -23, -37, -34, -57, -37, -24, -37, -31, -33, -20};
    }

    public RunnableC0910Er(F0 f02) {
        this.A00 = f02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0901Eg c0901Eg;
        DownloadAction.Deserializer[] deserializerArr;
        Handler handler;
        if (L0.A02(this)) {
            return;
        }
        try {
            c0901Eg = this.A00.A09;
            deserializerArr = this.A00.A0E;
            DownloadAction[] A03 = c0901Eg.A03(deserializerArr);
            handler = this.A00.A07;
            handler.post(new RunnableC0909Eq(this, A03));
        }
    }
}
