package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f18699a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f18700b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f18701c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18702d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f18703e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f18704f;

    public k(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iArr.length == jArr2.length);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(jArr.length == jArr2.length);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iArr2.length == jArr2.length);
        this.f18700b = jArr;
        this.f18701c = iArr;
        this.f18702d = i10;
        this.f18703e = jArr2;
        this.f18704f = iArr2;
        this.f18699a = jArr.length;
    }

    public int a(long j10) {
        for (int b10 = u.b(this.f18703e, j10, true, false); b10 >= 0; b10--) {
            if ((this.f18704f[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int a10 = u.a(this.f18703e, j10, true, false); a10 < this.f18703e.length; a10++) {
            if ((this.f18704f[a10] & 1) != 0) {
                return a10;
            }
        }
        return -1;
    }
}
