package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f18501a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f18502b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18503c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f18501a = jArr;
        this.f18502b = jArr2;
        this.f18503c = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j10) {
        return this.f18502b[u.b(this.f18501a, j10, true, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a
    public long b(long j10) {
        return this.f18501a[u.b(this.f18502b, j10, true, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.f18503c;
    }
}
