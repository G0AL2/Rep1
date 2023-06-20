package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements f, m {

    /* renamed from: a  reason: collision with root package name */
    public h f19020a;

    /* renamed from: b  reason: collision with root package name */
    public n f19021b;

    /* renamed from: c  reason: collision with root package name */
    public b f19022c;

    /* renamed from: d  reason: collision with root package name */
    public int f19023d;

    /* renamed from: e  reason: collision with root package name */
    public int f19024e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(g gVar) throws IOException, InterruptedException {
        return c.a(gVar) != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        b bVar = this.f19022c;
        return ((bVar.f19032h / bVar.f19028d) * 1000000) / bVar.f19026b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(h hVar) {
        this.f19020a = hVar;
        this.f19021b = hVar.a(0, 1);
        this.f19022c = null;
        hVar.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        this.f19024e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public int a(g gVar, l lVar) throws IOException, InterruptedException {
        if (this.f19022c == null) {
            b a10 = c.a(gVar);
            this.f19022c = a10;
            if (a10 != null) {
                int i10 = a10.f19026b;
                int i11 = a10.f19025a;
                this.f19021b.a(i.a((String) null, "audio/raw", (String) null, a10.f19029e * i10 * i11, 32768, i11, i10, a10.f19030f, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null));
                this.f19023d = this.f19022c.f19028d;
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.l("Unsupported or unrecognized wav header.");
            }
        }
        b bVar = this.f19022c;
        if (!((bVar.f19031g == 0 || bVar.f19032h == 0) ? false : true)) {
            gVar.getClass();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
            bVar2.f18146e = 0;
            k kVar = new k(8);
            c.a a11 = c.a.a(gVar, kVar);
            while (a11.f19033a != u.a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + a11.f19033a);
                long j10 = a11.f19034b + 8;
                if (a11.f19033a == u.a("RIFF")) {
                    j10 = 12;
                }
                if (j10 <= 2147483647L) {
                    bVar2.c((int) j10);
                    a11 = c.a.a(gVar, kVar);
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.l("Chunk is too large (~2GB+) to skip; id: " + a11.f19033a);
                }
            }
            bVar2.c(8);
            long j11 = bVar2.f18144c;
            long j12 = a11.f19034b;
            bVar.f19031g = j11;
            bVar.f19032h = j12;
            this.f19020a.a(this);
        }
        int a12 = this.f19021b.a(gVar, 32768 - this.f19024e, true);
        if (a12 != -1) {
            this.f19024e += a12;
        }
        int i12 = this.f19024e;
        int i13 = this.f19023d;
        int i14 = i12 / i13;
        if (i14 > 0) {
            b bVar3 = this.f19022c;
            int i15 = i14 * i13;
            int i16 = i12 - i15;
            this.f19024e = i16;
            this.f19021b.a(((((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).f18144c - i12) * 1000000) / bVar3.f19027c, 1, i15, i16, null);
        }
        return a12 == -1 ? -1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j10) {
        b bVar = this.f19022c;
        long j11 = bVar.f19028d;
        return Math.min((((j10 * bVar.f19027c) / 1000000) / j11) * j11, bVar.f19032h - j11) + bVar.f19031g;
    }
}
