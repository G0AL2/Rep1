package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public interface BL {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A47(int i10, int i11, int i12) throws BK;

    ByteBuffer A73();

    int A74();

    int A75();

    int A76();

    boolean A8N();

    boolean A8R();

    void ADU();

    void ADV(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
