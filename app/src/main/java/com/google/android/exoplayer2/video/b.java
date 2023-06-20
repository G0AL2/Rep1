package com.google.android.exoplayer2.video;

import ea.a0;
import ea.w;
import j8.j2;
import java.util.Collections;
import java.util.List;

/* compiled from: HevcConfig.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f21811a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21812b;

    /* renamed from: c  reason: collision with root package name */
    public final float f21813c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21814d;

    private b(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f21811a = list;
        this.f21812b = i10;
        this.f21813c = f10;
        this.f21814d = str;
    }

    public static b a(a0 a0Var) throws j2 {
        int i10;
        int i11;
        try {
            a0Var.Q(21);
            int D = a0Var.D() & 3;
            int D2 = a0Var.D();
            int e10 = a0Var.e();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < D2; i14++) {
                a0Var.Q(1);
                int J = a0Var.J();
                for (int i15 = 0; i15 < J; i15++) {
                    int J2 = a0Var.J();
                    i13 += J2 + 4;
                    a0Var.Q(J2);
                }
            }
            a0Var.P(e10);
            byte[] bArr = new byte[i13];
            String str = null;
            int i16 = 0;
            int i17 = 0;
            int i18 = -1;
            int i19 = -1;
            float f10 = 1.0f;
            while (i16 < D2) {
                int D3 = a0Var.D() & 127;
                int J3 = a0Var.J();
                int i20 = 0;
                while (i20 < J3) {
                    int J4 = a0Var.J();
                    byte[] bArr2 = w.f29749a;
                    int i21 = D2;
                    System.arraycopy(bArr2, i12, bArr, i17, bArr2.length);
                    int length = i17 + bArr2.length;
                    System.arraycopy(a0Var.d(), a0Var.e(), bArr, length, J4);
                    if (D3 == 33 && i20 == 0) {
                        w.a h10 = w.h(bArr, length, length + J4);
                        int i22 = h10.f29759g;
                        i19 = h10.f29760h;
                        f10 = h10.f29761i;
                        i10 = D3;
                        i11 = J3;
                        i18 = i22;
                        str = ea.d.c(h10.f29753a, h10.f29754b, h10.f29755c, h10.f29756d, h10.f29757e, h10.f29758f);
                    } else {
                        i10 = D3;
                        i11 = J3;
                    }
                    i17 = length + J4;
                    a0Var.Q(J4);
                    i20++;
                    D2 = i21;
                    D3 = i10;
                    J3 = i11;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            return new b(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), D + 1, i18, i19, f10, str);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw j2.a("Error parsing HEVC config", e11);
        }
    }
}
