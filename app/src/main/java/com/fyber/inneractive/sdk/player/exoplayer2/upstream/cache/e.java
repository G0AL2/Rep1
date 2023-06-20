package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.g;

/* loaded from: classes2.dex */
public final class e implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f19413a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a f19414b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a f19415c;

    /* renamed from: d  reason: collision with root package name */
    public final f.a f19416d;

    public e(a aVar, g.a aVar2, g.a aVar3, f.a aVar4, int i10, d.a aVar5) {
        this.f19413a = aVar;
        this.f19414b = aVar2;
        this.f19415c = aVar3;
        this.f19416d = aVar4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g.a
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.g a() {
        b bVar;
        a aVar = this.f19413a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g a10 = this.f19414b.a();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g a11 = this.f19415c.a();
        f.a aVar2 = this.f19416d;
        if (aVar2 != null) {
            c cVar = (c) aVar2;
            bVar = new b(cVar.f19392a, cVar.f19393b, 20480);
        } else {
            bVar = null;
        }
        return new d(aVar, a10, a11, bVar, 2, null);
    }
}
