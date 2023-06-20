package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.p;

/* loaded from: classes2.dex */
public final class q extends com.fyber.inneractive.sdk.player.exoplayer2.p {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f19323g = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final long f19324b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19325c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19326d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19327e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f19328f;

    public q(long j10, boolean z10) {
        this(j10, j10, 0L, 0L, z10, false);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public int a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public p.c a(int i10, p.c cVar, boolean z10, long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i10, 0, 1);
        Object obj = z10 ? f19323g : null;
        long j11 = this.f19327e;
        boolean z11 = this.f19328f;
        if (z11) {
            j11 += j10;
            if (j11 > this.f19325c) {
                j11 = -9223372036854775807L;
            }
        }
        long j12 = this.f19325c;
        long j13 = this.f19326d;
        cVar.f19224a = obj;
        cVar.f19225b = z11;
        cVar.f19228e = j11;
        cVar.f19229f = j12;
        cVar.f19226c = 0;
        cVar.f19227d = 0;
        cVar.f19230g = j13;
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public int b() {
        return 1;
    }

    public q(long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f19324b = j10;
        this.f19325c = j11;
        this.f19326d = j12;
        this.f19327e = j13;
        this.f19328f = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public p.b a(int i10, p.b bVar, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i10, 0, 1);
        Object obj = z10 ? f19323g : null;
        long j10 = this.f19324b;
        bVar.f19219a = obj;
        bVar.f19220b = obj;
        bVar.f19221c = 0;
        bVar.f19222d = j10;
        bVar.f19223e = -this.f19326d;
        return bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
    public int a(Object obj) {
        return f19323g.equals(obj) ? 0 : -1;
    }
}
