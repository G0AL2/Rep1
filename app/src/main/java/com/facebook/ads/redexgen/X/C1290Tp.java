package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1290Tp implements M8 {
    public static byte[] A03;
    public static String[] A04 = {"3JpGgMVfhEKs4h1tr8RMzDA7DOHokops", "dXqQ9QAcXKU8whF3kmnzOWjNbVMrrIOv", "otwaAvusvekoag06qMT5pISHPHVrRcMV", "WpvUEDFnYdSXMC7RGaJnlQQN5lPpeUoV", "uIVwlH6eBNHvEYk4kE6nlnhEt8muXj04", "pYVE6LchgLxW1usH7NIdAbU6pOe1Iyyx", "cgHZB3wyyqxQlT2ShG9pTXiCyg", "w9qB75SnMFWvoXL9CpdnGLUKrWLPOybN"};
    public int A00;
    @Nullable
    public String A01;
    public final M8 A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            String[] strArr = A04;
            if (strArr[5].charAt(25) == strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "Ai5XpAh7M4hRkPfPQf54GYnUnAkHicBv";
            strArr2[3] = "aIcIWiLMc3Hy2WApHOm5eO35KvTaoUWD";
            copyOfRange[i13] = (byte) ((b10 - i12) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-117, -117, 125, Byte.MIN_VALUE};
    }

    static {
        A02();
    }

    public C1290Tp(M8 m82) {
        this.A02 = m82;
    }

    private void A01() {
        if (this.A01 != null) {
            M8 m82 = this.A02;
            m82.ADK(this.A01 + A00(0, 4, 10) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void ADK(String str) {
        boolean A0A;
        String A042;
        A0A = MA.A0A(str);
        if (!A0A) {
            A042 = MA.A04(str);
            if (A042.equals(this.A01)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = A042;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.ADK(str);
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
