package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.player.cache.d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.g;

/* loaded from: classes.dex */
public class e implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public final d.c f17804a;

    /* renamed from: b  reason: collision with root package name */
    public d.b f17805b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17806c;

    /* renamed from: d  reason: collision with root package name */
    public final s f17807d;

    public e(d.b bVar, d.c cVar, int i10, s sVar) {
        this.f17805b = bVar;
        this.f17806c = i10;
        this.f17804a = cVar;
        this.f17807d = sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g.a
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.g a() {
        d dVar = new d();
        dVar.f17796h = this.f17805b;
        dVar.f17798j = this.f17806c;
        dVar.f17799k = this.f17807d;
        dVar.f17797i = this.f17804a;
        return dVar;
    }
}
