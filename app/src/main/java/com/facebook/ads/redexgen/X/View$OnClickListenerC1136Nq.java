package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1136Nq implements View.OnClickListener {
    public static byte[] A02;
    public final /* synthetic */ C1400Xy A00;
    public final /* synthetic */ C1138Ns A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 20, 33, 18, 20, 22, 39, 28, 41, 28, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
    }

    public View$OnClickListenerC1136Nq(C1138Ns c1138Ns, C1400Xy c1400Xy) {
        this.A01 = c1138Ns;
        this.A00 = c1400Xy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        if (L0.A02(this)) {
            return;
        }
        try {
            str = this.A01.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 35);
            str2 = this.A01.A06;
            if (!A00.equals(str2)) {
                String A002 = A00(22, 26, 33);
                str3 = this.A01.A06;
                Intent intent = new Intent(A002, C1070La.A00(str3));
                intent.addFlags(268435456);
                this.A00.A0D().A8A();
                try {
                    LN.A0B(this.A00, intent);
                } catch (LL e10) {
                    Throwable cause = e10.getCause();
                    Throwable th = e10;
                    if (cause != null) {
                        th = e10.getCause();
                    }
                    this.A00.A06().A8y(A00(11, 11, 113), C07828z.A00, new AnonymousClass90(th));
                }
            }
        } catch (Throwable th2) {
            L0.A00(th2, this);
        }
    }
}
