package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f18483a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18484b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18485c;

    public a(long j10, int i10, long j11) {
        this.f18483a = j10;
        this.f18484b = i10;
        this.f18485c = j11 == -1 ? -9223372036854775807L : b(j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return this.f18485c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a
    public long b(long j10) {
        return ((Math.max(0L, j10 - this.f18483a) * 1000000) * 8) / this.f18484b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.f18485c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j10) {
        long j11 = this.f18485c;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        int i10 = u.f19606a;
        return this.f18483a + ((Math.max(0L, Math.min(j10, j11)) * this.f18484b) / 8000000);
    }
}
