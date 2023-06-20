package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class GJ extends AbstractC1696e1 {
    public static byte[] A01;
    public static String[] A02 = {"rUhg5nWIULCK5t0gW05eAQLFFSPSWMvZ", "IWlot4Qxgt9kC5cL8sfJp7UuHzQVcIMi", "pyGO9NZUXO3VfNbPYY8A9lbBjy3aVFuI", "BR2eyutWjUUloqp0GJ1CKmWpDC9ci7iC", "R8", "7OIMX1dy42ob61A4JIfUI17XWGQLX3ws", "f7SraaJMsc9s0A0ZVYKOMxYCK6pogew2", "N778iUAZTctb3pJ5Cpi07oq2oMO9GnTO"};
    public final long A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[1].charAt(11) == strArr[7].charAt(11)) {
                throw new RuntimeException();
            }
            A02[2] = "gnOcZLWDvxdPQhFZXDuJbQjlKnJrGFNK";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 84);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-71, -51, -28, -116, -33, -43, -26, -47, -116, -39, -31, -33, -32, -116, -50, -47, -116, -36, -37, -33, -43, -32, -43, -30, -47, -116, -38, -31, -39, -50, -47, -34, -115};
    }

    static {
        A01();
    }

    public GJ(long j10) {
        if (j10 > 0) {
            this.A00 = j10;
            return;
        }
        throw new IllegalArgumentException(A00(0, 33, 24));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1696e1
    public final boolean A08(File file, long j10, int i10) {
        return j10 <= this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1696e1, com.facebook.ads.redexgen.X.C0B
    public final /* bridge */ /* synthetic */ void AFC(File file) throws IOException {
        super.AFC(file);
    }
}
