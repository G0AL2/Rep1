package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class z implements g {

    /* renamed from: a  reason: collision with root package name */
    public final g f19542a;

    /* renamed from: b  reason: collision with root package name */
    public final f f19543b;

    public z(g gVar, f fVar) {
        this.f19542a = (g) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(gVar);
        this.f19543b = (f) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(j jVar) throws IOException {
        long a10 = this.f19542a.a(jVar);
        if (jVar.f19466e == -1 && a10 != -1) {
            jVar = new j(jVar.f19462a, null, jVar.f19464c, jVar.f19465d, a10, jVar.f19467f, jVar.f19468g);
        }
        this.f19543b.a(jVar);
        return a10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        try {
            this.f19542a.close();
        } finally {
            this.f19543b.close();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        int a10 = this.f19542a.a(bArr, i10, i11);
        if (a10 > 0) {
            this.f19543b.a(bArr, i10, a10);
        }
        return a10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        return this.f19542a.a();
    }
}
