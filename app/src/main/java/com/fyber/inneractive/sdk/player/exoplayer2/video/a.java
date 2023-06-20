package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f19662a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19663b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19664c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19665d;

    /* renamed from: e  reason: collision with root package name */
    public final float f19666e;

    public a(List<byte[]> list, int i10, int i11, int i12, float f10) {
        this.f19662a = list;
        this.f19663b = i10;
        this.f19664c = i11;
        this.f19665d = i12;
        this.f19666e = f10;
    }

    public static byte[] a(k kVar) {
        int q10 = kVar.q();
        int i10 = kVar.f19580b;
        kVar.f(q10);
        byte[] bArr = kVar.f19579a;
        byte[] bArr2 = com.fyber.inneractive.sdk.player.exoplayer2.util.c.f19548a;
        byte[] bArr3 = new byte[bArr2.length + q10];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, q10);
        return bArr3;
    }

    public static a b(k kVar) throws l {
        int i10;
        int i11;
        float f10;
        try {
            kVar.f(4);
            int l10 = (kVar.l() & 3) + 1;
            if (l10 != 3) {
                ArrayList arrayList = new ArrayList();
                int l11 = kVar.l() & 31;
                for (int i12 = 0; i12 < l11; i12++) {
                    arrayList.add(a(kVar));
                }
                int l12 = kVar.l();
                for (int i13 = 0; i13 < l12; i13++) {
                    arrayList.add(a(kVar));
                }
                if (l11 > 0) {
                    i.b b10 = i.b((byte[]) arrayList.get(0), l10, ((byte[]) arrayList.get(0)).length);
                    int i14 = b10.f19566b;
                    int i15 = b10.f19567c;
                    f10 = b10.f19568d;
                    i10 = i14;
                    i11 = i15;
                } else {
                    i10 = -1;
                    i11 = -1;
                    f10 = 1.0f;
                }
                return new a(arrayList, l10, i10, i11, f10);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new l("Error parsing AVC config", e10);
        }
    }
}
