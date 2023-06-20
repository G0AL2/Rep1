package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"CatchGeneralException"})
/* loaded from: assets/audience_network.dex */
public abstract class L8 implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC1068Ky> A04;
    @Nullable
    public final C1066Kw A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, 14, 77, 92, 75, 79, 90, 75, 74, 0, 14, 122, 70, 92, 75, 79, 74, 20, 14};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public L8() {
        if (A03.get()) {
            this.A00 = LD.A01(new LC(A01(0, 26, 90) + Thread.currentThread().getName()));
            return;
        }
        this.A00 = null;
    }

    public static void A03(boolean z10) {
        A03.set(z10);
    }

    public static void A04(boolean z10, InterfaceC1068Ky interfaceC1068Ky) {
        A02.set(z10);
        A04.set(interfaceC1068Ky);
    }

    @Nullable
    public final C1066Kw A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                LD.A03(this);
            }
            A06();
            if (A03.get()) {
                LD.A04(this);
            }
        } catch (Throwable t10) {
            L0.A00(t10, this);
        }
    }
}
