package com.facebook.ads.redexgen.X;

import com.inmobi.media.fq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public final class X6 implements BL {
    public static String[] A06 = {"5utGUnn02b5VIzuc1FLHs1Qqi0fGEzz2", "DaG3Y2wQcTFt6n6rQ7Gr6iJZtSjkgUIR", "I5wcdOmu3UXBpwLMhd1MA2dM71iQzRTS", "a3TfZcOy08z7kq2pPCWxFv40lmZdIopZ", "nCxl35vO69EqZhEDDoDcGzJRz4rMZlE7", "Y5761Ga76B4ReZAKlzLfDyZ1gXjGXB3L", "t1lur4hbWemc11jTFC6OlnNGsbjhQ3VM", "6CnjKSKlGDDfBCJgDd7Ssr26upnReJdk"};
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public ByteBuffer A03 = BL.A00;
    public ByteBuffer A04 = BL.A00;

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A47(int i10, int i11, int i12) throws BK {
        if (i12 == 3 || i12 == 2 || i12 == Integer.MIN_VALUE || i12 == 1073741824) {
            if (this.A02 == i10 && this.A00 == i11 && this.A01 == i12) {
                return false;
            }
            this.A02 = i10;
            this.A00 = i11;
            this.A01 = i12;
            return true;
        }
        throw new BK(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final ByteBuffer A73() {
        ByteBuffer byteBuffer = this.A04;
        this.A04 = BL.A00;
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
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8N() {
        int i10 = this.A01;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8R() {
        return this.A05 && this.A04 == BL.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADU() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADV(ByteBuffer byteBuffer) {
        int i10;
        int size = byteBuffer.position();
        int resampledSize = byteBuffer.limit();
        int i11 = resampledSize - size;
        int i12 = this.A01;
        if (i12 == Integer.MIN_VALUE) {
            i10 = (i11 / 3) * 2;
        } else if (i12 == 3) {
            i10 = i11 * 2;
        } else if (i12 == 1073741824) {
            i10 = i11 / 2;
        } else {
            throw new IllegalStateException();
        }
        int capacity = this.A03.capacity();
        String[] strArr = A06;
        if (strArr[6].charAt(17) == strArr[3].charAt(17)) {
            String[] strArr2 = A06;
            strArr2[2] = "W94yXwDUFyNDAMV4dQ9gRwTb9HKmhar0";
            strArr2[1] = "UxSCLQ06z7wJwwSNZRUXPEmpHaH1zCeE";
            if (capacity < i10) {
                this.A03 = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
            } else {
                this.A03.clear();
            }
            int i13 = this.A01;
            if (i13 == Integer.MIN_VALUE) {
                while (size < resampledSize) {
                    this.A03.put(byteBuffer.get(size + 1));
                    this.A03.put(byteBuffer.get(size + 2));
                    size += 3;
                }
            } else if (i13 == 3) {
                while (size < resampledSize) {
                    this.A03.put((byte) 0);
                    this.A03.put((byte) ((byteBuffer.get(size) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                    size++;
                }
            } else if (i13 == 1073741824) {
                while (size < resampledSize) {
                    ByteBuffer byteBuffer2 = this.A03;
                    String[] strArr3 = A06;
                    if (strArr3[2].charAt(9) != strArr3[1].charAt(9)) {
                        String[] strArr4 = A06;
                        strArr4[2] = "sfuVTkj8IwDRAmHRKMELNpZyhpVkIKBS";
                        strArr4[1] = "Fl4ka6a0nXkGByMLlkeuhoftQnViDXP0";
                        byteBuffer2.put(byteBuffer.get(size + 2));
                        this.A03.put(byteBuffer.get(size + 3));
                        size += 4;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
            byteBuffer.position(byteBuffer.limit());
            this.A03.flip();
            this.A04 = this.A03;
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void flush() {
        this.A04 = BL.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = BL.A00;
    }
}
