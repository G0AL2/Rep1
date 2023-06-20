package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XC implements BL {
    public static String[] A08 = {"hI95CJvP", "e7uFmzv8JlxhzV9w6wWiWm3C", "0BfqaNpqjs7ROgqNLFdYFDMF2kIE2JVl", "01nBjZj9wdoXPRYWJREYdbIjHTCf93fz", "xbIGt4PZ2jMEHXqvTGNBXf5J", "qzrNEKfdD0Je3OCcD1S0Cr1qEsV7v9mi", "0sM3QN", "C1cp7SniMnLQ2eyeNR7DTGSoW6Un2OTz"};
    public boolean A04;
    public boolean A05;
    @Nullable
    public int[] A06;
    @Nullable
    public int[] A07;
    public ByteBuffer A02 = BL.A00;
    public ByteBuffer A03 = BL.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(@Nullable int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A47(int i10, int i11, int i12) throws BK {
        boolean z10 = !Arrays.equals(this.A07, this.A06);
        this.A06 = this.A07;
        if (this.A06 == null) {
            this.A04 = false;
            return z10;
        } else if (i12 == 2) {
            if (!z10 && this.A01 == i10) {
                int i13 = this.A00;
                String[] strArr = A08;
                if (strArr[6].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[6] = "gVI3SL";
                strArr2[0] = "1HQF1tqI";
                if (i13 == i11) {
                    return false;
                }
            }
            this.A01 = i10;
            this.A00 = i11;
            this.A04 = i11 != this.A06.length;
            int i14 = 0;
            while (true) {
                int[] iArr = this.A06;
                if (i14 >= iArr.length) {
                    return true;
                }
                int i15 = iArr[i14];
                if (i15 < i11) {
                    this.A04 |= i15 != i14;
                    i14++;
                } else {
                    throw new BK(i10, i11, i12);
                }
            }
        } else {
            throw new BK(i10, i11, i12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final ByteBuffer A73() {
        ByteBuffer byteBuffer = this.A03;
        this.A03 = BL.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A74() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A75() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A76() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8N() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8R() {
        return this.A05 && this.A03 == BL.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADU() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADV(ByteBuffer byteBuffer) {
        int[] iArr;
        IK.A04(this.A06 != null);
        int outputSize = byteBuffer.position();
        int limit = byteBuffer.limit();
        int limit2 = this.A00;
        int i10 = (limit - outputSize) / (limit2 * 2);
        int frameCount = this.A06.length;
        int i11 = frameCount * i10 * 2;
        int frameCount2 = this.A02.capacity();
        if (frameCount2 < i11) {
            this.A02 = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (outputSize < limit) {
            for (int frameCount3 : this.A06) {
                int channelIndex = frameCount3 * 2;
                this.A02.putShort(byteBuffer.getShort(channelIndex + outputSize));
            }
            outputSize += this.A00 * 2;
        }
        byteBuffer.position(limit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void flush() {
        this.A03 = BL.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void reset() {
        flush();
        this.A02 = BL.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
