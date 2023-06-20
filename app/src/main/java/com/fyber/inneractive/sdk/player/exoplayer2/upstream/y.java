package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class y<T> implements x.c {

    /* renamed from: a  reason: collision with root package name */
    public final j f19536a;

    /* renamed from: b  reason: collision with root package name */
    public final g f19537b;

    /* renamed from: c  reason: collision with root package name */
    public final a<? extends T> f19538c;

    /* renamed from: d  reason: collision with root package name */
    public volatile T f19539d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f19540e;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f19541f;

    /* loaded from: classes2.dex */
    public interface a<T> {
    }

    public y(g gVar, Uri uri, int i10, a<? extends T> aVar) {
        this.f19537b = gVar;
        this.f19536a = new j(uri, 1);
        this.f19538c = aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public final boolean a() {
        return this.f19540e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public final void b() {
        this.f19540e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public final void load() throws IOException, InterruptedException {
        i iVar = new i(this.f19537b, this.f19536a);
        try {
            if (!iVar.f19459d) {
                iVar.f19456a.a(iVar.f19457b);
                iVar.f19459d = true;
            }
            this.f19539d = (T) ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d) this.f19538c).a(this.f19537b.a(), iVar);
        } finally {
            this.f19541f = iVar.f19461f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(iVar);
        }
    }
}
