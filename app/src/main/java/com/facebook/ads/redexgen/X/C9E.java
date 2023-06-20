package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.9E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9E extends N4 {
    public static byte[] A01;
    public final /* synthetic */ P2 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public C9E(P2 p22) {
        this.A00 = p22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A02 */
    public final void A03(N5 n52) {
        P1 p12;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new P0(this));
        p12 = this.A00.A0B;
        A03 = this.A00.A03();
        p12.ACj(A00(0, 5, 60), A03);
    }
}
