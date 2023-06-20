package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.dj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1679dj extends L8 {
    public static byte[] A02;
    public static String[] A03 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ C05850u A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {29, 41, 28, 40, 44, 28, 37, 26, 48, 22, 26, 24, 39, 39, 32, 37, 30};
        String[] strArr = A03;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        A03[5] = "QkfkB";
        A02 = bArr;
    }

    static {
        A02();
    }

    public C1679dj(C05850u c05850u, String str) {
        this.A00 = c05850u;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C8U c8u;
        C8U c8u2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C05840t c05840t;
        C05840t c05840t2;
        C05840t c05840t3;
        String A00 = A00(0, 17, 116);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c05840t = this.A00.A02;
                ((C1O) c05840t.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c05840t2 = this.A00.A02;
                c05840t2.A07(this.A01);
                c05840t3 = this.A00.A02;
                c05840t3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            c8u2 = this.A00.A03;
            c8u2.A06().A8y(A00, C07828z.A1B, new AnonymousClass90(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c8u = this.A00.A03;
            c8u.A06().A8y(A00, C07828z.A1A, new AnonymousClass90(e11));
        }
    }
}
