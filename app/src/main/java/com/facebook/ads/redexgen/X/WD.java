package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import com.google.android.gms.ads.AdRequest;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class WD implements InterfaceC0879Di {
    public static byte[] A0H;
    public static String[] A0I = {"wge6vcbYVd2LlwU9IzXxO7y1yc7Npjql", "e4ah1", "HxlECSCujzZIBhcakhB8llOPpIPg4jPi", "c3jgZ7razfwrLoite54T", "YnWTxT53I9VC0eKuEFoJi1GxqSMOrSIM", "mGJBSiyG9M2YGViPKeXmqCjoZalx0YC5", "VtpTHv8dn8NrwXo7ikKBEmVWKD8j4YCX", "dqOZRsMzwGVkln1A4hbisIXuNnIWGGSy"};
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public InterfaceC0870Co A07;
    public InterfaceC0870Co A08;
    public InterfaceC0870Co A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C1003Ii A0D;
    public final C1004Ij A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] - i12) - 49);
            if (A0I[4].charAt(1) != 'n') {
                throw new RuntimeException();
            }
            A0I[4] = "bnluMaXE1Uw3b3JGoNOZfy6HcCqjlXqz";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-120, 124, -66, -47, -48, 124, -67, -49, -49, -47, -55, -59, -54, -61, 124, -99, -99, -97, 124, -88, -97, -118, -118, -83, -67, -68, -101, -82, -86, -83, -82, -69, -18, 15, 30, 15, 13, 30, 15, 14, -54, 11, 31, 14, 19, 25, -54, 25, 12, 20, 15, 13, 30, -54, 30, 35, 26, 15, -28, -54, -26, -11, -11, -15, -18, -24, -26, -7, -18, -12, -13, -76, -18, -23, -72, 16, 36, 19, 24, 30, -34, 28, 31, -29, 16, -36, 27, 16, 35, 28};
    }

    static {
        A06();
        A0J = new byte[]{73, 68, 51};
    }

    public WD(boolean z10) {
        this(z10, null);
    }

    public WD(boolean z10, String str) {
        this.A0D = new C1003Ii(new byte[7]);
        this.A0E = new C1004Ij(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z10;
        this.A0F = str;
    }

    private void A01() throws C0813Af {
        this.A0D.A07(0);
        if (!this.A0C) {
            int A04 = this.A0D.A04(2) + 1;
            if (A04 != 2) {
                Log.w(A00(22, 10, 24), A00(32, 28, 121) + A04 + A00(0, 22, 43));
                A04 = 2;
            }
            int A042 = this.A0D.A04(4);
            this.A0D.A08(1);
            int sampleRateIndex = this.A0D.A04(3);
            byte[] A07 = IO.A07(A04, A042, sampleRateIndex);
            Pair<Integer, Integer> A03 = IO.A03(A07);
            Format A072 = Format.A07(this.A0A, A00(75, 15, 126), null, -1, -1, ((Integer) A03.second).intValue(), ((Integer) A03.first).intValue(), Collections.singletonList(A07), null, 0, this.A0F);
            this.A05 = 1024000000 / A072.A0C;
            this.A09.A5V(A072);
            this.A0C = true;
        } else {
            C1003Ii c1003Ii = this.A0D;
            String[] strArr = A0I;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int sampleSize = str2.length();
            if (length == sampleSize) {
                throw new RuntimeException();
            }
            A0I[4] = "gnfbeCT7ETb0BF6eGTwxRLZIMNoo6eBq";
            c1003Ii.A08(10);
        }
        this.A0D.A08(4);
        int A043 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            A043 -= 2;
        }
        InterfaceC0870Co interfaceC0870Co = this.A09;
        long j10 = this.A05;
        if (A0I[0].charAt(1) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[5] = "DPeEZCdjnoP4QwMjUw7HIDON5EObNWtY";
        strArr2[6] = "TWt76gMmW2EkEQM2OhdsBT8X6vSrq3Ij";
        A07(interfaceC0870Co, j10, 0, A043);
    }

    private void A02() {
        this.A08.AEG(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0J.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(InterfaceC0870Co interfaceC0870Co, long j10, int i10, int i11) {
        this.A03 = 3;
        this.A00 = i10;
        this.A07 = interfaceC0870Co;
        this.A04 = j10;
        this.A02 = i11;
    }

    private void A08(C1004Ij c1004Ij) {
        byte[] bArr = c1004Ij.A00;
        int position = c1004Ij.A06();
        int A07 = c1004Ij.A07();
        while (position < A07) {
            int i10 = position + 1;
            int i11 = bArr[position] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            int position2 = this.A01;
            if (position2 == 512 && i11 >= 240 && i11 != 255) {
                int position3 = i11 & 1;
                this.A0B = position3 == 0;
                A04();
                c1004Ij.A0Y(i10);
                return;
            }
            int i12 = this.A01;
            int i13 = i12 | i11;
            if (i13 == 329) {
                this.A01 = 768;
            } else if (i13 == 511) {
                this.A01 = AdRequest.MAX_CONTENT_URL_LENGTH;
            } else if (i13 == 836) {
                this.A01 = IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
            } else if (i13 != 1075) {
                if (i12 != 256) {
                    this.A01 = 256;
                    position = i10 - 1;
                }
            } else {
                A05();
                c1004Ij.A0Y(i10);
                return;
            }
            position = i10;
        }
        c1004Ij.A0Y(position);
    }

    private void A09(C1004Ij c1004Ij) {
        int min = Math.min(c1004Ij.A04(), this.A02 - this.A00);
        this.A07.AEG(c1004Ij, min);
        this.A00 += min;
        int i10 = this.A00;
        int i11 = this.A02;
        if (i10 == i11) {
            this.A07.AEH(this.A06, 1, i11, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(C1004Ij c1004Ij, byte[] bArr, int i10) {
        int min = Math.min(c1004Ij.A04(), i10 - this.A00);
        c1004Ij.A0c(bArr, this.A00, min);
        this.A00 += min;
        return this.A00 == i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A48(C1004Ij c1004Ij) throws C0813Af {
        while (c1004Ij.A04() > 0) {
            int i10 = this.A03;
            if (i10 == 0) {
                A08(c1004Ij);
            } else if (i10 != 1) {
                String[] strArr = A0I;
                if (strArr[5].charAt(25) == strArr[6].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "9CqnxzaEQimEcBf5cSINZxdBysafSxdF";
                strArr2[6] = "zLp55t2V8ycwykcXwXcmLQHdTFNUXCiS";
                if (i10 == 2) {
                    boolean A0A = A0A(c1004Ij, this.A0D.A00, this.A0B ? 7 : 5);
                    if (A0I[0].charAt(1) == 'g') {
                        String[] strArr3 = A0I;
                        strArr3[3] = "PBSyuwIG2tPzzgRnoBM9";
                        strArr3[1] = "owzwp";
                        if (A0A) {
                            A01();
                        }
                    } else if (A0A) {
                        A01();
                    }
                } else if (i10 == 3) {
                    A09(c1004Ij);
                }
            } else if (A0A(c1004Ij, this.A0E.A00, 10)) {
                A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A4V(InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        c0893Dw.A05();
        this.A0A = c0893Dw.A04();
        this.A09 = interfaceC0862Ce.AFD(c0893Dw.A03(), 1);
        if (this.A0G) {
            c0893Dw.A05();
            this.A08 = interfaceC0862Ce.AFD(c0893Dw.A03(), 4);
            this.A08.A5V(Format.A0B(c0893Dw.A04(), A00(60, 15, 84), null, -1, null));
            return;
        }
        this.A08 = new C1368Ws();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD4(long j10, boolean z10) {
        this.A06 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AEK() {
        A03();
    }
}
