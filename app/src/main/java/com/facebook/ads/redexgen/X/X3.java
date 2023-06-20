package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public final class X3 implements BL {
    public static String[] A0B = {"r", "4", "I5O53mReJYgY4Jy6Te4gmLvwKot1lmjj", "5S", "zkj4NaHy3qG", "EJmI2pRz04", "Xqte5C1rywD", "1UQbdYDvzSk5pKr4kl4SZHHNZLcQI2bC"};
    public int A01;
    public int A02;
    public int A04;
    public int A05;
    public boolean A08;
    public boolean A09;
    public ByteBuffer A06 = BL.A00;
    public ByteBuffer A07 = BL.A00;
    public int A00 = -1;
    public int A03 = -1;
    public byte[] A0A = new byte[0];

    public final void A00(int i10, int i11) {
        this.A05 = i10;
        this.A04 = i11;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A47(int i10, int i11, int i12) throws BK {
        if (i12 == 2) {
            this.A00 = i11;
            this.A03 = i10;
            int i13 = this.A04;
            this.A0A = new byte[i13 * i11 * 2];
            this.A01 = 0;
            int i14 = this.A05;
            this.A02 = i14 * i11 * 2;
            boolean z10 = this.A09;
            this.A09 = (i14 == 0 && i13 == 0) ? false : true;
            return z10 != this.A09;
        }
        throw new BK(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final ByteBuffer A73() {
        ByteBuffer byteBuffer = this.A07;
        this.A07 = BL.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A74() {
        return this.A00;
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
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8R() {
        return this.A08 && this.A07 == BL.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADU() {
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADV(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.position();
        int trimBytes = byteBuffer.limit();
        int i10 = trimBytes - remaining;
        int min = Math.min(i10, this.A02);
        this.A02 -= min;
        byteBuffer.position(remaining + min);
        if (this.A02 > 0) {
            return;
        }
        int remainingBytesToOutput = i10 - min;
        int length = (this.A01 + remainingBytesToOutput) - this.A0A.length;
        if (this.A06.capacity() < length) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length);
            if (A0B[3].length() == 18) {
                throw new RuntimeException();
            }
            A0B[3] = "Xd8Hzn34smT7X798Wj1HPKCywQ0V";
            this.A06 = allocateDirect.order(ByteOrder.nativeOrder());
        } else {
            this.A06.clear();
        }
        int remaining2 = C1020Iz.A06(length, 0, this.A01);
        this.A06.put(this.A0A, 0, remaining2);
        int A06 = C1020Iz.A06(length - remaining2, 0, remainingBytesToOutput);
        int inputBufferBytesToOutput = byteBuffer.position();
        byteBuffer.limit(inputBufferBytesToOutput + A06);
        this.A06.put(byteBuffer);
        byteBuffer.limit(trimBytes);
        int remainingBytesToOutput2 = remainingBytesToOutput - A06;
        int inputBufferBytesToOutput2 = this.A01;
        this.A01 = inputBufferBytesToOutput2 - remaining2;
        byte[] bArr = this.A0A;
        int inputBufferBytesToOutput3 = this.A01;
        System.arraycopy(bArr, remaining2, bArr, 0, inputBufferBytesToOutput3);
        byte[] bArr2 = this.A0A;
        int inputBufferBytesToOutput4 = this.A01;
        byteBuffer.get(bArr2, inputBufferBytesToOutput4, remainingBytesToOutput2);
        int inputBufferBytesToOutput5 = this.A01;
        this.A01 = inputBufferBytesToOutput5 + remainingBytesToOutput2;
        this.A06.flip();
        this.A07 = this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void flush() {
        this.A07 = BL.A00;
        this.A08 = false;
        this.A02 = 0;
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void reset() {
        flush();
        this.A06 = BL.A00;
        this.A00 = -1;
        this.A03 = -1;
        this.A0A = new byte[0];
    }
}
