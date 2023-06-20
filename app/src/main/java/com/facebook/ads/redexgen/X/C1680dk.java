package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.dk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1680dk extends L8 {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C05850u A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A03[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A03[3] = "LuOw";
        A02 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public C1680dk(C05850u c05850u, String str) {
        this.A00 = c05850u;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C8U c8u;
        C8U c8u2;
        CountDownLatch countDownLatch;
        C05840t c05840t;
        C05840t c05840t2;
        C05840t c05840t3;
        boolean A0J;
        C05840t c05840t4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c05840t = this.A00.A02;
            synchronized (c05840t) {
                c05840t2 = this.A00.A02;
                Iterator<String> keys = c05840t2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C05850u c05850u = this.A00;
                    String encryptedId = this.A01;
                    A0J = c05850u.A0J(encryptedId);
                    if (A0J) {
                        C05850u c05850u2 = this.A00;
                        c05840t4 = this.A00.A02;
                        String encryptedId2 = this.A01;
                        c05850u2.A0E((C1O) c05840t4.A05().get(next), next, next.equals(encryptedId2));
                    }
                }
                c05840t3 = this.A00.A02;
                c05840t3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            c8u2 = this.A00.A03;
            c8u2.A06().A8y(A00(0, 17, 8), C07828z.A1B, new AnonymousClass90(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c8u = this.A00.A03;
            c8u.A06().A8y(A00(0, 17, 8), C07828z.A1A, new AnonymousClass90(e11));
        }
    }
}
