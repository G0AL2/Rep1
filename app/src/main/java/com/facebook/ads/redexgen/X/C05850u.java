package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0u  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05850u {
    @Nullable
    public static C05850u A08;
    public static byte[] A09;
    public static String[] A0A = {"TOlR5WIHpQxnCrBDCJGIvboS5c1GP2eb", "1A072KPTjzB", "BhIKZU0mEosMUOfZes2VT64q11XJ2Uhn", "3eQHzZddeWPmYl0bNsvnb2WjxREMTE8a", "x", "3ukMDhdDleVgfGP2GHVzNRiRwZbG92ZS", "tXOxwX9vQ8QECIpzr41AiGeD6LbiHgO3", "feL0RS1gsJrC9VyxtC"};
    public static final String A0B;
    public boolean A01;
    public final C8U A03;
    public final String A04;
    public final Executor A07;
    public final CountDownLatch A05 = new CountDownLatch(1);
    public final CountDownLatch A06 = new CountDownLatch(1);
    public final C05840t A02 = new C05840t();
    @Nullable
    public String A00 = null;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 69);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {114, 115, 97, 10, 31, 65, 68, 83, 99, 65, 80, 80, 73, 78, 71, 105, 78, 70, 79, 14, 84, 88, 84, 1, 3, 18, 18, 7, 6, 35, 6, 17, 76, 22, 26, 22, 37, 49, 38, 50, 54, 38, 45, 32, 58, 28, 32, 34, 51, 51, 42, 45, 36};
        if (A0A[0].charAt(25) == 's') {
            throw new RuntimeException();
        }
        A0A[6] = "ekiMbk44dvQ4iEpOly1MsU0Tkyq5eij5";
        A09 = bArr;
    }

    static {
        A09();
        A0B = C05850u.class.getSimpleName();
    }

    @VisibleForTesting
    public C05850u(C8U c8u, boolean z10, Executor executor, String str) {
        this.A03 = c8u.A00();
        this.A04 = str;
        this.A07 = executor;
        if (z10) {
            A0A();
        }
    }

    public static synchronized C05850u A01(C8U c8u) {
        C05850u c05850u;
        synchronized (C05850u.class) {
            if (A08 == null) {
                A08 = new C05850u(c8u, true, MX.A06, A03(0, 0, 103));
            }
            c05850u = A08;
        }
        return c05850u;
    }

    private String A04(String str) {
        String A03 = A03(0, 0, 103);
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                if (file.exists() && file.length() > 0) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[(int) file.length()];
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    A03 = new String(bArr, A03(0, 5, 98));
                }
            }
        } catch (FileNotFoundException e10) {
            this.A03.A06().A8y(A03(36, 17, 6), C07828z.A17, new AnonymousClass90(e10));
        } catch (IOException e11) {
            this.A03.A06().A8y(A03(36, 17, 6), C07828z.A19, new AnonymousClass90(e11));
        }
        return A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        String A03 = A03(36, 17, 6);
        try {
            C05840t c05840t = this.A02;
            c05840t.A08(A04(this.A04 + A03(23, 13, 39)));
            this.A02.A0A(A04(A03(5, 18, 101)));
        } catch (AnonymousClass90 e10) {
            A0M();
            this.A03.A06().A8y(A03, C07828z.A18, e10);
        } catch (JSONException e11) {
            A0M();
            this.A03.A06().A8y(A03, C07828z.A1A, new AnonymousClass90(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        String jSONObject;
        synchronized (this.A02) {
            jSONObject = this.A02.A05().toString();
        }
        A0G(A0K(), jSONObject);
    }

    @VisibleForTesting
    private final void A0A() {
        this.A07.execute(new C1682dm(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E(C1O c1o, String str, boolean z10) {
        c1o.A07(z10);
        if (c1o.A08() || c1o.A09()) {
            this.A02.A07(str);
        } else {
            this.A02.A09(str);
        }
    }

    private void A0F(String str) {
        File file = new File(this.A03.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    private final synchronized void A0G(String str, String str2) {
        A0H(this.A04 + A03(23, 13, 39), str.getBytes());
        A0H(A03(5, 18, 101), str2.getBytes());
    }

    private void A0H(String str, byte[] bArr) {
        try {
            synchronized (this) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.A03.getFilesDir(), str));
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            }
        } catch (FileNotFoundException e10) {
            this.A03.A06().A8y(A03(36, 17, 6), C07828z.A17, new AnonymousClass90(e10));
        } catch (IOException e11) {
            this.A03.A06().A8y(A03(36, 17, 6), C07828z.A19, new AnonymousClass90(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(String str) {
        boolean z10 = false;
        try {
            synchronized (this.A02) {
                z10 = this.A02.A05().get(str) instanceof C1O;
            }
        } catch (JSONException e10) {
            this.A03.A06().A8y(A03(36, 17, 6), C07828z.A1A, new AnonymousClass90(e10));
        }
        return z10;
    }

    public final String A0K() {
        return this.A02.A04();
    }

    public final void A0L() {
        if (!this.A01 || this.A00 == null) {
            return;
        }
        this.A07.execute(new C1679dj(this, this.A00));
    }

    public final synchronized void A0M() {
        A0F(this.A04 + A03(5, 18, 101));
        A0F(this.A04 + A03(23, 13, 39));
    }

    public final void A0N(String str) {
        if (!this.A01) {
            return;
        }
        this.A00 = str;
        this.A07.execute(new C1680dk(this, str));
    }

    public final void A0O(JSONObject jSONObject) {
        this.A01 = JR.A0x(this.A03);
        if (!this.A01) {
            return;
        }
        this.A07.execute(new C1681dl(this, jSONObject));
    }
}
