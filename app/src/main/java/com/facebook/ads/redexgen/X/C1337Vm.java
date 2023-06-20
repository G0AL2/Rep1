package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1337Vm implements EG {
    @Override // com.facebook.ads.redexgen.X.EG
    public final Metadata A4h(DJ dj) {
        ByteBuffer buffer = dj.A01;
        byte[] array = buffer.array();
        int size = buffer.limit();
        C1004Ij c1004Ij = new C1004Ij(array, size);
        String A0Q = c1004Ij.A0Q();
        String A0Q2 = c1004Ij.A0Q();
        long A0M = c1004Ij.A0M();
        long timescale = C1020Iz.A0F(c1004Ij.A0M(), 1000000L, A0M);
        long presentationTimeUs = c1004Ij.A0M();
        long id2 = C1020Iz.A0F(presentationTimeUs, 1000L, A0M);
        return new Metadata(new EventMessage(A0Q, A0Q2, id2, c1004Ij.A0M(), Arrays.copyOfRange(array, c1004Ij.A06(), size), timescale));
    }
}
