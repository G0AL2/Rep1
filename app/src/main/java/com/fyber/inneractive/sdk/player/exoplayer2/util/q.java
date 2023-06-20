package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19599a;

    /* renamed from: b  reason: collision with root package name */
    public long f19600b;

    /* renamed from: c  reason: collision with root package name */
    public long f19601c;

    /* renamed from: d  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.m f19602d = com.fyber.inneractive.sdk.player.exoplayer2.m.f19141d;

    public void a(long j10) {
        this.f19600b = j10;
        if (this.f19599a) {
            this.f19601c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.g
    public com.fyber.inneractive.sdk.player.exoplayer2.m i() {
        return this.f19602d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.g
    public long o() {
        long j10;
        long j11 = this.f19600b;
        if (this.f19599a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19601c;
            com.fyber.inneractive.sdk.player.exoplayer2.m mVar = this.f19602d;
            if (mVar.f19142a == 1.0f) {
                j10 = com.fyber.inneractive.sdk.player.exoplayer2.b.a(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * mVar.f19144c;
            }
            return j11 + j10;
        }
        return j11;
    }

    public void a(g gVar) {
        a(gVar.o());
        this.f19602d = gVar.i();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.g
    public com.fyber.inneractive.sdk.player.exoplayer2.m a(com.fyber.inneractive.sdk.player.exoplayer2.m mVar) {
        if (this.f19599a) {
            a(o());
        }
        this.f19602d = mVar;
        return mVar;
    }
}
