package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* renamed from: a  reason: collision with root package name */
    public h f18725a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        boolean z10;
        boolean equals;
        try {
            e eVar = new e();
            if (eVar.a(gVar, true) && (eVar.f18732a & 2) == 2) {
                int min = Math.min(eVar.f18736e, 8);
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(min);
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).a(kVar.f19579a, 0, min, false);
                kVar.e(0);
                if (kVar.a() >= 5 && kVar.l() == 127 && kVar.m() == 1179402563) {
                    this.f18725a = new b();
                } else {
                    kVar.e(0);
                    try {
                        z10 = k.a(1, kVar, true);
                    } catch (l unused) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f18725a = new j();
                    } else {
                        kVar.e(0);
                        int i10 = g.f18739o;
                        int a10 = kVar.a();
                        byte[] bArr = g.f18740p;
                        if (a10 < bArr.length) {
                            equals = false;
                        } else {
                            byte[] bArr2 = new byte[bArr.length];
                            int length = bArr.length;
                            System.arraycopy(kVar.f19579a, kVar.f19580b, bArr2, 0, length);
                            kVar.f19580b += length;
                            equals = Arrays.equals(bArr2, bArr);
                        }
                        if (equals) {
                            this.f18725a = new g();
                        }
                    }
                }
                return true;
            }
        } catch (l unused2) {
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        n a10 = hVar.a(0, 1);
        hVar.c();
        h hVar2 = this.f18725a;
        hVar2.f18744c = hVar;
        hVar2.f18743b = a10;
        hVar2.f18742a = new d();
        hVar2.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        h hVar = this.f18725a;
        d dVar = hVar.f18742a;
        dVar.f18726a.a();
        dVar.f18727b.r();
        dVar.f18728c = -1;
        dVar.f18730e = false;
        if (j10 == 0) {
            hVar.a(!hVar.f18753l);
        } else if (hVar.f18749h != 0) {
            hVar.f18746e = hVar.f18745d.c(j11);
            hVar.f18749h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws IOException, InterruptedException {
        h hVar = this.f18725a;
        int i10 = hVar.f18749h;
        if (i10 == 0) {
            boolean z10 = true;
            while (z10) {
                if (!hVar.f18742a.a(gVar)) {
                    hVar.f18749h = 3;
                    return -1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
                long j10 = bVar.f18144c;
                long j11 = hVar.f18747f;
                hVar.f18752k = j10 - j11;
                boolean a10 = hVar.a(hVar.f18742a.f18727b, j11, hVar.f18751j);
                if (a10) {
                    hVar.f18747f = bVar.f18144c;
                }
                z10 = a10;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.i iVar = hVar.f18751j.f18755a;
            hVar.f18750i = iVar.f19132s;
            if (!hVar.f18754m) {
                hVar.f18743b.a(iVar);
                hVar.f18754m = true;
            }
            f fVar = hVar.f18751j.f18756b;
            if (fVar != null) {
                hVar.f18745d = fVar;
            } else {
                long j12 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).f18143b;
                if (j12 == -1) {
                    hVar.f18745d = new h.b();
                } else {
                    e eVar = hVar.f18742a.f18726a;
                    hVar.f18745d = new a(hVar.f18747f, j12, hVar, eVar.f18735d + eVar.f18736e, eVar.f18733b);
                }
            }
            hVar.f18751j = null;
            hVar.f18749h = 2;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = hVar.f18742a.f18727b;
            byte[] bArr = kVar.f19579a;
            if (bArr.length != 65025) {
                kVar.f19579a = Arrays.copyOf(bArr, Math.max(65025, kVar.f19581c));
            }
        } else if (i10 == 1) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c((int) hVar.f18747f);
            hVar.f18749h = 2;
        } else if (i10 == 2) {
            long a11 = hVar.f18745d.a(gVar);
            if (a11 >= 0) {
                lVar.f18411a = a11;
                return 1;
            }
            if (a11 < -1) {
                hVar.b(-(a11 + 2));
            }
            if (!hVar.f18753l) {
                hVar.f18744c.a(hVar.f18745d.b());
                hVar.f18753l = true;
            }
            if (hVar.f18752k <= 0 && !hVar.f18742a.a(gVar)) {
                hVar.f18749h = 3;
                return -1;
            }
            hVar.f18752k = 0L;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar2 = hVar.f18742a.f18727b;
            long a12 = hVar.a(kVar2);
            if (a12 >= 0) {
                long j13 = hVar.f18748g;
                if (j13 + a12 >= hVar.f18746e) {
                    hVar.f18743b.a(kVar2, kVar2.f19581c);
                    hVar.f18743b.a((j13 * 1000000) / hVar.f18750i, 1, kVar2.f19581c, 0, null);
                    hVar.f18746e = -1L;
                }
            }
            hVar.f18748g += a12;
        } else {
            throw new IllegalStateException();
        }
        return 0;
    }
}
