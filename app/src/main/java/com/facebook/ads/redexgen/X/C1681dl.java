package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1681dl extends L8 {
    public static byte[] A02;
    public final /* synthetic */ C05850u A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C1681dl(C05850u c05850u, JSONObject jSONObject) {
        this.A00 = c05850u;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C8U c8u;
        C8U c8u2;
        CountDownLatch countDownLatch;
        C05840t c05840t;
        C05840t c05840t2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c05840t = this.A00.A02;
            synchronized (c05840t) {
                c05840t2 = this.A00.A02;
                c05840t2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e10) {
            c8u2 = this.A00.A03;
            c8u2.A06().A8y(A00(0, 17, 116), C07828z.A1B, new AnonymousClass90(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c8u = this.A00.A03;
            c8u.A06().A8y(A00(0, 17, 116), C07828z.A1A, new AnonymousClass90(e11));
        }
    }
}
