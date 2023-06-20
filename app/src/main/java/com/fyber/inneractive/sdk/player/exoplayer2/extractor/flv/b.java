package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements f, m {

    /* renamed from: n  reason: collision with root package name */
    public static final int f18189n = u.a("FLV");

    /* renamed from: e  reason: collision with root package name */
    public h f18194e;

    /* renamed from: g  reason: collision with root package name */
    public int f18196g;

    /* renamed from: h  reason: collision with root package name */
    public int f18197h;

    /* renamed from: i  reason: collision with root package name */
    public int f18198i;

    /* renamed from: j  reason: collision with root package name */
    public long f18199j;

    /* renamed from: k  reason: collision with root package name */
    public a f18200k;

    /* renamed from: l  reason: collision with root package name */
    public e f18201l;

    /* renamed from: m  reason: collision with root package name */
    public c f18202m;

    /* renamed from: a  reason: collision with root package name */
    public final k f18190a = new k(4);

    /* renamed from: b  reason: collision with root package name */
    public final k f18191b = new k(9);

    /* renamed from: c  reason: collision with root package name */
    public final k f18192c = new k(11);

    /* renamed from: d  reason: collision with root package name */
    public final k f18193d = new k();

    /* renamed from: f  reason: collision with root package name */
    public int f18195f = 1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j10) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.a(this.f18190a.f19579a, 0, 3, false);
        this.f18190a.e(0);
        if (this.f18190a.n() != f18189n) {
            return false;
        }
        bVar.a(this.f18190a.f19579a, 0, 2, false);
        this.f18190a.e(0);
        if ((this.f18190a.q() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        bVar.a(this.f18190a.f19579a, 0, 4, false);
        this.f18190a.e(0);
        int c10 = this.f18190a.c();
        bVar.f18146e = 0;
        bVar.a(c10, false);
        bVar.a(this.f18190a.f19579a, 0, 4, false);
        this.f18190a.e(0);
        return this.f18190a.c() == 0;
    }

    public final k b(g gVar) throws IOException, InterruptedException {
        if (this.f18198i > this.f18193d.b()) {
            k kVar = this.f18193d;
            kVar.f19579a = new byte[Math.max(kVar.b() * 2, this.f18198i)];
            kVar.f19581c = 0;
            kVar.f19580b = 0;
        } else {
            this.f18193d.e(0);
        }
        this.f18193d.d(this.f18198i);
        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18193d.f19579a, 0, this.f18198i, false);
        return this.f18193d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    public final boolean c(g gVar) throws IOException, InterruptedException {
        boolean z10;
        c cVar;
        e eVar;
        a aVar;
        int i10 = this.f18197h;
        if (i10 == 8 && (aVar = this.f18200k) != null) {
            aVar.a(b(gVar), this.f18199j);
        } else if (i10 == 9 && (eVar = this.f18201l) != null) {
            eVar.a(b(gVar), this.f18199j);
        } else if (i10 == 18 && (cVar = this.f18202m) != null) {
            cVar.a(b(gVar), this.f18199j);
        } else {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c(this.f18198i);
            z10 = false;
            this.f18196g = 4;
            this.f18195f = 2;
            return z10;
        }
        z10 = true;
        this.f18196g = 4;
        this.f18195f = 2;
        return z10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.f18202m.f18203b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(h hVar) {
        this.f18194e = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        this.f18195f = 1;
        this.f18196g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public int a(g gVar, l lVar) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.f18195f;
            boolean z10 = true;
            if (i10 == 1) {
                if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18191b.f19579a, 0, 9, true)) {
                    this.f18191b.e(0);
                    this.f18191b.f(4);
                    int l10 = this.f18191b.l();
                    boolean z11 = (l10 & 4) != 0;
                    boolean z12 = (l10 & 1) != 0;
                    if (z11 && this.f18200k == null) {
                        this.f18200k = new a(this.f18194e.a(8, 1));
                    }
                    if (z12 && this.f18201l == null) {
                        this.f18201l = new e(this.f18194e.a(9, 2));
                    }
                    if (this.f18202m == null) {
                        this.f18202m = new c(null);
                    }
                    this.f18194e.c();
                    this.f18194e.a(this);
                    this.f18196g = (this.f18191b.c() - 9) + 4;
                    this.f18195f = 2;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return -1;
                }
            } else if (i10 == 2) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).c(this.f18196g);
                this.f18196g = 0;
                this.f18195f = 3;
            } else if (i10 != 3) {
                if (i10 == 4 && c(gVar)) {
                    return 0;
                }
            } else {
                if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18192c.f19579a, 0, 11, true)) {
                    this.f18192c.e(0);
                    this.f18197h = this.f18192c.l();
                    this.f18198i = this.f18192c.n();
                    this.f18199j = this.f18192c.n();
                    this.f18199j = ((this.f18192c.l() << 24) | this.f18199j) * 1000;
                    this.f18192c.f(3);
                    this.f18195f = 4;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return -1;
                }
            }
        }
    }
}
