package com.facebook.ads.redexgen.X;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4v */
/* loaded from: assets/audience_network.dex */
public final class C06874v extends Thread {
    public static byte[] A07;
    public static String[] A08 = {"22scehDHoaCOvZMprlsBZA8XDImDmfKB", "weKghC0VptQmI5ngiGaEXX", "Hf9H6", "FJiPG4ANJnN6", "MZm2fX9OE1lWAQp9g7i9e16yKVjr6LaO", "qv5p39sFFmKE2Upe5HhwzyNbLjT31UC6", "BSHanWyHkNGNXcGKwO9o06mFf", "6OihQTIk4xH7HyNYKpu4LMiaEL1fh7ec"};
    public static final String A09;
    public final int A00;
    public final Handler A01;
    public final C06894x A02;
    public final C1400Xy A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{97, 101, 10, 102, 105, 117, 10, 99, 66, 83, 66, 68, 83, 72, 85, 103, 101, 110, 101, 114, 105, 99};
    }

    static {
        A02();
        A09 = C06874v.class.getName();
    }

    public C06874v(C1400Xy c1400Xy, C06894x c06894x) {
        this(c1400Xy, c06894x, JR.A06(c1400Xy));
    }

    public C06874v(C1400Xy c1400Xy, C06894x c06894x, int i10) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new Runnable() { // from class: com.facebook.ads.redexgen.X.4u
            @Override // java.lang.Runnable
            public final void run() {
                if (L0.A02(this)) {
                    return;
                }
                try {
                    C06874v.A00(C06874v.this, 0L);
                    C06874v.A03(C06874v.this, false);
                } catch (Throwable th) {
                    L0.A00(th, this);
                }
            }
        };
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 83));
        this.A00 = i10;
        this.A03 = c1400Xy;
        this.A02 = c06894x;
    }

    public static /* synthetic */ long A00(C06874v c06874v, long j10) {
        c06874v.A05 = j10;
        return j10;
    }

    public static /* synthetic */ boolean A03(C06874v c06874v, boolean z10) {
        c06874v.A06 = z10;
        return z10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            long j10 = this.A00;
            while (!isInterrupted()) {
                long j11 = this.A05;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[2].length()) {
                    String[] strArr2 = A08;
                    strArr2[3] = "QDJRY7exkP3l";
                    strArr2[6] = "zyOVtGNErBmKt3HrtbWcAlOC0";
                    boolean needPost = j11 == 0;
                    this.A05 = j10;
                    if (needPost) {
                        this.A01.post(this.A04);
                    }
                    try {
                        Thread.sleep(j10);
                        if (this.A05 != 0) {
                            boolean needPost2 = this.A06;
                            if (!needPost2) {
                                boolean needPost3 = Debug.isDebuggerConnected();
                                if (!needPost3) {
                                    boolean needPost4 = this.A02.A05();
                                    if (needPost4) {
                                        this.A03.A06().A8y(A01(15, 7, 116), C07828z.A1D, new AnonymousClass90(this.A02.A04()));
                                    }
                                    this.A06 = true;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        BuildConfigApi.isDebug();
                        return;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
