package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class l implements n, n.a {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f19314a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a f19315b;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f19316c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19317d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f19318e;

    /* renamed from: f  reason: collision with root package name */
    public final a f19319f;

    /* renamed from: g  reason: collision with root package name */
    public final p.b f19320g = new p.b();

    /* renamed from: h  reason: collision with root package name */
    public n.a f19321h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f19322i;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public l(Uri uri, g.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar, int i10, Handler handler, a aVar2, String str) {
        this.f19314a = uri;
        this.f19315b = aVar;
        this.f19316c = iVar;
        this.f19317d = i10;
        this.f19318e = handler;
        this.f19319f = aVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a() throws IOException {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.e eVar, boolean z10, n.a aVar) {
        this.f19321h = aVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.h) aVar).f19063f.obtainMessage(7, Pair.create(new q(-9223372036854775807L, false), null)).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void b() {
        this.f19321h = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public m a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i10 == 0);
        return new i(this.f19314a, this.f19315b.a(), this.f19316c.a(), this.f19317d, this.f19318e, this.f19319f, this, bVar, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a(m mVar) {
        i iVar = (i) mVar;
        i.d dVar = iVar.f19276j;
        x xVar = iVar.f19275i;
        j jVar = new j(iVar, dVar);
        x.b<? extends x.c> bVar = xVar.f19525b;
        if (bVar != null) {
            bVar.a(true);
        }
        xVar.f19524a.execute(jVar);
        xVar.f19524a.shutdown();
        iVar.f19280n.removeCallbacksAndMessages(null);
        iVar.G = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, Object obj) {
        boolean z10 = pVar.a(0, this.f19320g, false).f19222d != -9223372036854775807L;
        if (!this.f19322i || z10) {
            this.f19322i = z10;
            this.f19321h.a(pVar, null);
        }
    }
}
