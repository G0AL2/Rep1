package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19469a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19470b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f19471c;

    /* renamed from: d  reason: collision with root package name */
    public final a[] f19472d;

    /* renamed from: e  reason: collision with root package name */
    public int f19473e;

    /* renamed from: f  reason: collision with root package name */
    public int f19474f;

    /* renamed from: g  reason: collision with root package name */
    public int f19475g;

    /* renamed from: h  reason: collision with root package name */
    public a[] f19476h;

    public k(boolean z10, int i10, int i11) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i10 > 0);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i11 >= 0);
        this.f19469a = z10;
        this.f19470b = i10;
        this.f19475g = i11;
        this.f19476h = new a[i11 + 100];
        if (i11 > 0) {
            this.f19471c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f19476h[i12] = new a(this.f19471c, i12 * i10);
            }
        } else {
            this.f19471c = null;
        }
        this.f19472d = new a[1];
    }

    public synchronized void a(a[] aVarArr) {
        boolean z10;
        int i10 = this.f19475g;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f19476h;
        if (length >= aVarArr2.length) {
            this.f19476h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            byte[] bArr = aVar.f19374a;
            if (bArr != this.f19471c && bArr.length != this.f19470b) {
                z10 = false;
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z10);
                a[] aVarArr3 = this.f19476h;
                int i11 = this.f19475g;
                this.f19475g = i11 + 1;
                aVarArr3[i11] = aVar;
            }
            z10 = true;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z10);
            a[] aVarArr32 = this.f19476h;
            int i112 = this.f19475g;
            this.f19475g = i112 + 1;
            aVarArr32[i112] = aVar;
        }
        this.f19474f -= aVarArr.length;
        notifyAll();
    }

    public synchronized void b() {
        int i10 = 0;
        int max = Math.max(0, com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(this.f19473e, this.f19470b) - this.f19474f);
        int i11 = this.f19475g;
        if (max >= i11) {
            return;
        }
        if (this.f19471c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a[] aVarArr = this.f19476h;
                a aVar = aVarArr[i10];
                byte[] bArr = aVar.f19374a;
                byte[] bArr2 = this.f19471c;
                if (bArr == bArr2) {
                    i10++;
                } else {
                    a aVar2 = aVarArr[i12];
                    if (aVar2.f19374a != bArr2) {
                        i12--;
                    } else {
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f19475g) {
                return;
            }
        }
        Arrays.fill(this.f19476h, max, this.f19475g, (Object) null);
        this.f19475g = max;
    }

    public int a() {
        return this.f19470b;
    }
}
