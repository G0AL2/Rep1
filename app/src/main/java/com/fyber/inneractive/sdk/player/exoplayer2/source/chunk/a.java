package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;

/* loaded from: classes2.dex */
public abstract class a implements x.c {

    /* renamed from: a  reason: collision with root package name */
    public final j f19243a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19244b;

    /* renamed from: c  reason: collision with root package name */
    public final i f19245c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19246d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f19247e;

    /* renamed from: f  reason: collision with root package name */
    public final long f19248f;

    /* renamed from: g  reason: collision with root package name */
    public final long f19249g;

    /* renamed from: h  reason: collision with root package name */
    public final g f19250h;

    public a(g gVar, j jVar, int i10, i iVar, int i11, Object obj, long j10, long j11) {
        this.f19250h = (g) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(gVar);
        this.f19243a = (j) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(jVar);
        this.f19244b = i10;
        this.f19245c = iVar;
        this.f19246d = i11;
        this.f19247e = obj;
        this.f19248f = j10;
        this.f19249g = j11;
    }

    public abstract long c();
}
