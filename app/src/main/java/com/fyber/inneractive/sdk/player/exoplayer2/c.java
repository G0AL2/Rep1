package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f18105a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18106b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18107c;

    /* renamed from: d  reason: collision with root package name */
    public final long f18108d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18109e;

    /* renamed from: f  reason: collision with root package name */
    public int f18110f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18111g;

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, long j10, long j11) {
        this(kVar, i10, i11, j10, j11, null);
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.b a() {
        return this.f18105a;
    }

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, long j10, long j11, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        this.f18105a = kVar;
        this.f18106b = i10 * 1000;
        this.f18107c = i11 * 1000;
        this.f18108d = j10 * 1000;
        this.f18109e = j11 * 1000;
    }

    public boolean a(long j10) {
        char c10;
        int i10;
        boolean z10 = false;
        if (j10 > this.f18107c) {
            c10 = 0;
        } else {
            c10 = j10 < this.f18106b ? (char) 2 : (char) 1;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.f18105a;
        synchronized (kVar) {
            i10 = kVar.f19474f * kVar.f19470b;
        }
        boolean z11 = i10 >= this.f18110f;
        boolean z12 = this.f18111g;
        if (c10 == 2 || (c10 == 1 && z12 && !z11)) {
            z10 = true;
        }
        this.f18111g = z10;
        return z10;
    }

    public final void a(boolean z10) {
        this.f18110f = 0;
        this.f18111g = false;
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.f18105a;
            synchronized (kVar) {
                if (kVar.f19469a) {
                    synchronized (kVar) {
                        boolean z11 = kVar.f19473e > 0;
                        kVar.f19473e = 0;
                        if (z11) {
                            kVar.b();
                        }
                    }
                }
            }
        }
    }
}
