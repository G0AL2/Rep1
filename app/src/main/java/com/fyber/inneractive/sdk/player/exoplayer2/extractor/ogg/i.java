package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.inmobi.media.fq;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f18757a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18758b;

    /* renamed from: c  reason: collision with root package name */
    public int f18759c;

    /* renamed from: d  reason: collision with root package name */
    public int f18760d;

    public i(byte[] bArr) {
        this.f18757a = bArr;
        this.f18758b = bArr.length;
    }

    public boolean a() {
        boolean z10 = (((this.f18757a[this.f18759c] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> this.f18760d) & 1) == 1;
        b(1);
        return z10;
    }

    public void b(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f18759c + i12;
        this.f18759c = i13;
        int i14 = this.f18760d + (i10 - (i12 * 8));
        this.f18760d = i14;
        boolean z10 = true;
        if (i14 > 7) {
            this.f18759c = i13 + 1;
            this.f18760d = i14 - 8;
        }
        int i15 = this.f18759c;
        if (i15 < 0 || (i15 >= (i11 = this.f18758b) && (i15 != i11 || this.f18760d != 0))) {
            z10 = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(z10);
    }

    public int a(int i10) {
        int i11 = this.f18759c;
        int min = Math.min(i10, 8 - this.f18760d);
        int i12 = i11 + 1;
        int i13 = ((this.f18757a[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> this.f18760d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f18757a[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }
}
