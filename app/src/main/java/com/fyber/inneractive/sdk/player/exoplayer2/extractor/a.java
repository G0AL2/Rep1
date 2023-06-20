package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f18138a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f18139b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18140c;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18138a = jArr;
        this.f18139b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i10 = length - 1;
            this.f18140c = jArr2[i10] + jArr3[i10];
            return;
        }
        this.f18140c = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j10) {
        return this.f18138a[u.b(this.f18139b, j10, true, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.f18140c;
    }
}
