package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network.dex */
public final class VV implements InterfaceC0870Co {
    public static String[] A0F = {"I0oQBEUbvXwmLkE4WWtRMgz", "xnniIxRr7DxSpuMWabRYn3WDpy4qBN9b", "Y7uRaXgz80uNyvcPATB9r3b0PwOkuM1V", "hSCUvOutOZqOqVGgCzlnUKxaNOAoeOWK", "Xz3O4WRIuCzLKbQHyaIDpuywePn7", "cSGy8Fn9cMgpPa", "oA7ibzMCvoxqvUcH1m6Eely4XW9nrCN1", "6CG0cGfKidBjxaDlKmMoUzgrmHvkLCHY"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C0938Ft A04;
    public C0938Ft A05;
    public C0938Ft A06;
    public InterfaceC0939Fu A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final HW A0D;
    public final C0937Fs A0C = new C0937Fs();
    public final C0936Fr A0B = new C0936Fr();
    public final C1004Ij A0E = new C1004Ij(32);

    public VV(HW hw) {
        this.A0D = hw;
        this.A0A = hw.A6o();
        this.A04 = new C0938Ft(0L, this.A0A);
        C0938Ft c0938Ft = this.A04;
        this.A05 = c0938Ft;
        this.A06 = c0938Ft;
    }

    private int A00(int i10) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3L(), new C0938Ft(this.A06.A03, this.A0A));
        }
        return Math.min(i10, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j10) {
        if (format == null) {
            return null;
        }
        if (j10 != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j10);
        }
        return format;
    }

    private void A02(int i10) {
        this.A01 += i10;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j10) {
        while (j10 >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j10) {
        if (j10 == -1) {
            return;
        }
        while (j10 >= this.A04.A03) {
            HW hw = this.A0D;
            HV hv = this.A04.A01;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "uyKFH8oWQ0ou8mdxvkWufQ8fbIwtl6Z0";
            strArr[1] = "5GODjm0a5UxNqoFNrNo0AvXndV19DDx4";
            hw.ADn(hv);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j10, ByteBuffer byteBuffer, int i10) {
        A03(j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (this.A05.A03 - j10));
            byteBuffer.put(this.A05.A01.A01, this.A05.A00(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j10, byte[] bArr, int i10) {
        A03(j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (this.A05.A03 - j10));
            System.arraycopy(this.A05.A01.A01, this.A05.A00(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
        if (r10 < r11) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07(com.facebook.ads.redexgen.X.X2 r20, com.facebook.ads.redexgen.X.C0936Fr r21) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VV.A07(com.facebook.ads.redexgen.X.X2, com.facebook.ads.redexgen.X.Fr):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.X.C0938Ft r6) {
        /*
            r5 = this;
            boolean r0 = r6.A02
            if (r0 != 0) goto L5
            return
        L5:
            com.facebook.ads.redexgen.X.Ft r0 = r5.A06
            boolean r4 = r0.A02
            com.facebook.ads.redexgen.X.Ft r0 = r5.A06
            long r2 = r0.A04
            long r0 = r6.A04
            long r2 = r2 - r0
            int r1 = (int) r2
            int r0 = r5.A0A
            int r1 = r1 / r0
            int r4 = r4 + r1
            com.facebook.ads.redexgen.X.HV[] r2 = new com.facebook.ads.redexgen.X.HV[r4]
            r1 = 0
        L18:
            int r0 = r2.length
            if (r1 >= r0) goto L26
            com.facebook.ads.redexgen.X.HV r0 = r6.A01
            r2[r1] = r0
            com.facebook.ads.redexgen.X.Ft r6 = r6.A01()
            int r1 = r1 + 1
            goto L18
        L26:
            com.facebook.ads.redexgen.X.HW r0 = r5.A0D
            r0.ADo(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VV.A08(com.facebook.ads.redexgen.X.Ft):void");
    }

    private final void A09(boolean z10) {
        this.A0C.A0H(z10);
        A08(this.A04);
        this.A04 = new C0938Ft(0L, this.A0A);
        C0938Ft c0938Ft = this.A04;
        this.A05 = c0938Ft;
        this.A06 = c0938Ft;
        this.A01 = 0L;
        this.A0D.AFE();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j10, boolean z10, boolean z11) {
        return this.A0C.A08(j10, z10, z11);
    }

    public final int A0E(AZ az, X2 x22, boolean z10, boolean z11, long j10) {
        int A09 = this.A0C.A09(az, x22, z10, z11, this.A02, this.A0B);
        if (A09 == -5) {
            this.A02 = az.A00;
            return -5;
        } else if (A09 != -4) {
            if (A09 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        } else {
            if (!x22.A04()) {
                long j11 = x22.A00;
                if (A0F[7].charAt(20) != 'U') {
                    throw new RuntimeException();
                }
                A0F[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
                if (j11 < j10) {
                    x22.A00(RecyclerView.UNDEFINED_DURATION);
                }
                if (x22.A0A()) {
                    A07(x22, this.A0B);
                }
                x22.A09(this.A0B.A00);
                A05(this.A0B.A01, x22.A01, this.A0B.A00);
            }
            return -4;
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j10, boolean z10, boolean z11) {
        A04(this.A0C.A0D(j10, z10, z11));
    }

    public final void A0L(InterfaceC0939Fu interfaceC0939Fu) {
        this.A07 = interfaceC0939Fu;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0870Co
    public final void A5V(Format format) {
        Format A01 = A01(format, this.A00);
        boolean A0K = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        InterfaceC0939Fu interfaceC0939Fu = this.A07;
        if (interfaceC0939Fu != null && A0K) {
            interfaceC0939Fu.ACe(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0870Co
    public final int AEF(InterfaceC0861Cd interfaceC0861Cd, int i10, boolean z10) throws IOException, InterruptedException {
        int read = interfaceC0861Cd.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        if (A0F[4].length() != 13) {
            String[] strArr = A0F;
            strArr[0] = "gj56WjutkODHGuBsULoCjgk";
            strArr[5] = "cXoHIYif5j6YkS";
            return read;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0870Co
    public final void AEG(C1004Ij c1004Ij, int i10) {
        while (i10 > 0) {
            int A00 = A00(i10);
            c1004Ij.A0c(this.A06.A01.A01, this.A06.A00(this.A01), A00);
            i10 -= A00;
            A02(A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0870Co
    public final void AEH(long j10, int i10, int i11, int i12, C0869Cn c0869Cn) {
        if (this.A08) {
            A5V(this.A03);
        }
        if (this.A09) {
            if ((i10 & 1) != 0) {
                C0937Fs c0937Fs = this.A0C;
                if (A0F[4].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[3] = "x9Xeu0fQ5laTPGHIgNPQILpO6czCAzIw";
                strArr[1] = "ozcoxAULLkb5oe9KcRf5sNeK93qRoKsz";
                if (!c0937Fs.A0J(j10)) {
                    return;
                }
                String[] strArr2 = A0F;
                if (strArr2[0].length() == strArr2[5].length()) {
                    throw new RuntimeException();
                }
                A0F[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
                this.A09 = false;
            } else {
                return;
            }
        }
        long timeUs = j10 + this.A00;
        this.A0C.A0G(timeUs, i10, (this.A01 - i11) - i12, i11, c0869Cn);
    }
}
