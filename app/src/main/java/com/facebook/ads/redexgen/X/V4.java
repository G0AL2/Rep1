package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class V4 implements InterfaceC0975He {
    public static byte[] A00;
    public static final InterfaceC0974Hd A01;
    public static final V4 A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 59, 51, 51, 63, -26, 57, 53, 59, 56, 41, 43};
    }

    static {
        A01();
        A02 = new V4();
        A01 = new V5();
    }

    public V4() {
    }

    public /* synthetic */ V4(V5 v52) {
        this();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final Uri A7k() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final long ACw(C0979Hi c0979Hi) throws IOException {
        throw new IOException(A00(0, 12, 126));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0975He
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        throw new UnsupportedOperationException();
    }
}
