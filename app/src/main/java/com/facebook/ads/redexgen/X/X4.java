package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: assets/audience_network.dex */
public final class X4 implements BL {
    public static String[] A0D = {"iVI49d2ZLsEdnN", "8nt9Mx90pYcLgm8jwIqfRxnuNB", "N5EnT7xPV04alRStuSSEb4qxGw0ypgBS", "CZFk7KMkAj1VPwfzqXgnV4RMFN6v0v1b", "0r4SPeKqFHrxpG", "Bbc1ECWkbstPDX5EGN6JJHjdPo9FJmAx", "C6RSY0Y2UTdbfyI9HBBCvYbiYc", "niyGYsc3TbIZXUeN92sM43TjCNQsZLKY"};
    public long A06;
    public long A07;
    @Nullable
    public C0849Bq A08;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;
    public ByteBuffer A09 = BL.A00;
    public ShortBuffer A0B = this.A09.asShortBuffer();
    public ByteBuffer A0A = BL.A00;
    public int A04 = -1;

    public final float A00(float f10) {
        float A00 = C1020Iz.A00(f10, 0.1f, 8.0f);
        if (this.A00 != A00) {
            this.A00 = A00;
            this.A08 = null;
        }
        flush();
        return A00;
    }

    public final float A01(float f10) {
        float A00 = C1020Iz.A00(f10, 0.1f, 8.0f);
        if (this.A01 != A00) {
            this.A01 = A00;
            this.A08 = null;
        }
        flush();
        return A00;
    }

    public final long A02(long j10) {
        long j11 = this.A07;
        if (j11 >= 1024) {
            int i10 = this.A03;
            int i11 = this.A05;
            if (i10 == i11) {
                return C1020Iz.A0F(j10, this.A06, j11);
            }
            return C1020Iz.A0F(j10, this.A06 * i10, j11 * i11);
        }
        return (long) (this.A01 * j10);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A47(int i10, int i11, int i12) throws BK {
        if (i12 == 2) {
            int i13 = this.A04;
            if (i13 == -1) {
                i13 = i10;
            }
            if (this.A05 == i10 && this.A02 == i11 && this.A03 == i13) {
                return false;
            }
            this.A05 = i10;
            this.A02 = i11;
            this.A03 = i13;
            this.A08 = null;
            return true;
        }
        throw new BK(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final ByteBuffer A73() {
        ByteBuffer byteBuffer = this.A0A;
        this.A0A = BL.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A74() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A75() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A76() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8N() {
        if (this.A05 != -1) {
            if (Math.abs(this.A01 - 1.0f) < 0.01f) {
                float abs = Math.abs(this.A00 - 1.0f);
                String[] strArr = A0D;
                if (strArr[6].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[4] = "vE55EECrsMoThx";
                strArr2[0] = "BaJHYxULwHsid1";
                if (abs >= 0.01f || this.A03 != this.A05) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8R() {
        C0849Bq c0849Bq;
        return this.A0C && ((c0849Bq = this.A08) == null || c0849Bq.A0H() == 0);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADU() {
        IK.A04(this.A08 != null);
        this.A08.A0J();
        this.A0C = true;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADV(ByteBuffer byteBuffer) {
        IK.A04(this.A08 != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A06 += remaining;
            this.A08.A0L(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int A0H = this.A08.A0H() * this.A02 * 2;
        if (A0H > 0) {
            if (this.A09.capacity() < A0H) {
                this.A09 = ByteBuffer.allocateDirect(A0H).order(ByteOrder.nativeOrder());
                this.A0B = this.A09.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            this.A08.A0K(this.A0B);
            this.A07 += A0H;
            this.A09.limit(A0H);
            this.A0A = this.A09;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void flush() {
        if (A8N()) {
            C0849Bq c0849Bq = this.A08;
            if (c0849Bq == null) {
                this.A08 = new C0849Bq(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                c0849Bq.A0I();
            }
        }
        this.A0A = BL.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        this.A09 = BL.A00;
        this.A0B = this.A09.asShortBuffer();
        this.A0A = BL.A00;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}
