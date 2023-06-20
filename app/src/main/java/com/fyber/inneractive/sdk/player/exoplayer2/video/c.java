package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f19672a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19673b;

    public c(List<byte[]> list, int i10) {
        this.f19672a = list;
        this.f19673b = i10;
    }

    public static c a(k kVar) throws l {
        try {
            kVar.f(21);
            int l10 = kVar.l() & 3;
            int l11 = kVar.l();
            int i10 = kVar.f19580b;
            int i11 = 0;
            for (int i12 = 0; i12 < l11; i12++) {
                kVar.f(1);
                int q10 = kVar.q();
                for (int i13 = 0; i13 < q10; i13++) {
                    int q11 = kVar.q();
                    i11 += q11 + 4;
                    kVar.f(q11);
                }
            }
            kVar.e(i10);
            byte[] bArr = new byte[i11];
            int i14 = 0;
            for (int i15 = 0; i15 < l11; i15++) {
                kVar.f(1);
                int q12 = kVar.q();
                for (int i16 = 0; i16 < q12; i16++) {
                    int q13 = kVar.q();
                    byte[] bArr2 = i.f19558a;
                    System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                    int length = i14 + bArr2.length;
                    System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, length, q13);
                    i14 = length + q13;
                    kVar.f(q13);
                }
            }
            return new c(i11 == 0 ? null : Collections.singletonList(bArr), l10 + 1);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new l("Error parsing HEVC config", e10);
        }
    }
}
