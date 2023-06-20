package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class Y3 extends L8 {
    public static byte[] A02;
    public final /* synthetic */ Y2 A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, 22, 80, 87, 95, 90, 24, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public Y3(Y2 y22, AtomicBoolean atomicBoolean) {
        this.A00 = y22;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C8U c8u;
        long j10;
        C8U c8u2;
        long j11;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC1035Jo.A0H);
                c8u2 = this.A00.A02.A04;
                C7N c7n = this.A00.A01;
                int i10 = C7X.A00;
                j11 = this.A00.A02.A00;
                C7X.A02(c8u2, c7n, i10, A00(11, 14, 17), j11);
                this.A00.A02.A0T();
                this.A00.A00.AAO();
                return;
            }
            this.A00.A02.A0I(EnumC1035Jo.A0G);
            c8u = this.A00.A02.A04;
            C7N c7n2 = this.A00.A01;
            int i11 = C7X.A04;
            j10 = this.A00.A02.A00;
            C7X.A02(c8u, c7n2, i11, A00(0, 11, 41), j10);
            this.A00.A02.A0U();
            this.A00.A00.AAH();
        }
    }
}
