package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07738p implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C1399Xx A00;
    public final InterfaceC07798w A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, 28, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, 11, 7, 5, 70, 14, 9, 11, 13, 10, 7, 7, 3, 70, 9, 12, 27, 71, 86, 69, 87, 76, 20, 18, 5, 19, 30, 23, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C07738p(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1399Xx c1399Xx, InterfaceC07728o interfaceC07728o) {
        this(uncaughtExceptionHandler, c1399Xx, interfaceC07728o, C07808x.A00());
    }

    public C07738p(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1399Xx c1399Xx, InterfaceC07728o interfaceC07728o, InterfaceC07798w interfaceC07798w) {
        this.A02 = uncaughtExceptionHandler;
        if (c1399Xx != null) {
            this.A00 = c1399Xx;
            this.A03 = interfaceC07728o.A7U(c1399Xx);
            this.A01 = interfaceC07798w;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String A03 = MA.A03(this.A00, th);
            if (!TextUtils.isEmpty(A03) && A03.contains(A00(17, 16, 41))) {
                Map<String, String> A02 = new C07718n(A03, this.A03).A02();
                A02.put(A00(38, 7, 38), A00(33, 5, 101));
                Throwable A00 = AbstractRunnableC1065Kv.A00();
                String A002 = A00(45, 12, 98);
                if (A00 != th) {
                    A02.put(A002, A00(0, 1, 91));
                } else {
                    A02.put(A002, A00(1, 1, 108));
                }
                this.A01.AFj(new AnonymousClass93(this.A00.A07().A01(), this.A00.A07().A02(), A02), this.A00);
                if (JR.A1R(this.A00)) {
                    JR.A0b(this.A00);
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
