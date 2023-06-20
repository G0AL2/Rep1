package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.n;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h implements n, e.InterfaceC0251e {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f18270a;

    /* renamed from: b  reason: collision with root package name */
    public final d f18271b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a f18272c;

    /* renamed from: d  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e f18273d;

    /* renamed from: e  reason: collision with root package name */
    public n.a f18274e;

    public h(Uri uri, g.a aVar, int i10, Handler handler, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar) {
        this(uri, new b(aVar), i10, handler, fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.e eVar, boolean z10, n.a aVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f18273d == null);
        Uri uri = this.f18270a;
        d dVar = this.f18271b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e(uri, dVar, this.f18272c, 3, this);
        this.f18273d = eVar2;
        this.f18274e = aVar;
        eVar2.f18376i.a(new y(((b) dVar).f18214a.a(), uri, 4, eVar2.f18370c), eVar2, 3);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar = this.f18273d;
        if (eVar != null) {
            eVar.f18376i.d();
            for (e.a aVar : eVar.f18372e.values()) {
                aVar.f18383b.d();
            }
            eVar.f18373f.removeCallbacksAndMessages(null);
            eVar.f18372e.clear();
            this.f18273d = null;
        }
        this.f18274e = null;
    }

    public h(Uri uri, d dVar, int i10, Handler handler, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar) {
        this.f18270a = uri;
        this.f18271b = dVar;
        this.f18272c = new f.a(handler, fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar = this.f18273d;
        eVar.f18376i.c();
        a.C0250a c0250a = eVar.f18379l;
        if (c0250a != null) {
            e.a aVar = eVar.f18372e.get(c0250a);
            aVar.f18383b.c();
            IOException iOException = aVar.f18391j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public m a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i10 == 0);
        return new g(this.f18273d, this.f18271b, 3, this.f18272c, bVar, j10);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.n
    public void a(m mVar) {
        g gVar = (g) mVar;
        gVar.f18254a.f18375h.remove(gVar);
        gVar.f18261h.removeCallbacksAndMessages(null);
        j[] jVarArr = gVar.f18267n;
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                int size = jVar.f18286j.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jVar.f18286j.valueAt(i10).b();
                }
                jVar.f18283g.d();
                jVar.f18289m.removeCallbacksAndMessages(null);
                jVar.f18295s = true;
            }
        }
    }
}
