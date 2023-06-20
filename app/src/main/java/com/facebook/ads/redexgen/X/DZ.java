package com.facebook.ads.redexgen.X;

import com.inmobi.media.fq;

/* loaded from: assets/audience_network.dex */
public final class DZ {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public DZ(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        int i10;
        int i11 = this.A01;
        IK.A04(i11 >= 0 && (i11 < (i10 = this.A02) || (i11 == i10 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int bitsRead) {
        int i10 = this.A01;
        int tempByteOffset = Math.min(bitsRead, 8 - this.A00);
        int i11 = i10 + 1;
        int i12 = ((this.A03[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> this.A00) & (255 >> (8 - tempByteOffset));
        while (tempByteOffset < bitsRead) {
            i12 |= (this.A03[i11] & 255) << tempByteOffset;
            tempByteOffset += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - bitsRead));
        A03(bitsRead);
        return i13;
    }

    public final void A03(int i10) {
        int i11 = i10 / 8;
        this.A01 += i11;
        this.A00 += i10 - (i11 * 8);
        int i12 = this.A00;
        if (i12 > 7) {
            this.A01++;
            this.A00 = i12 - 8;
        }
        A00();
    }

    public final boolean A04() {
        boolean z10 = (((this.A03[this.A01] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> this.A00) & 1) == 1;
        A03(1);
        return z10;
    }
}
