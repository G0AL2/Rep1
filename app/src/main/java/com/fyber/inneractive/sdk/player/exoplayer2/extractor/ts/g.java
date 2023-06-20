package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public final List<v.a> f18830a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] f18831b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18832c;

    /* renamed from: d  reason: collision with root package name */
    public int f18833d;

    /* renamed from: e  reason: collision with root package name */
    public int f18834e;

    /* renamed from: f  reason: collision with root package name */
    public long f18835f;

    public g(List<v.a> list) {
        this.f18830a = list;
        this.f18831b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        this.f18832c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
        if (this.f18832c) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar : this.f18831b) {
                nVar.a(this.f18835f, 1, this.f18834e, 0, null);
            }
            this.f18832c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        for (int i10 = 0; i10 < this.f18831b.length; i10++) {
            v.a aVar = this.f18830a.get(i10);
            dVar.a();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a10 = hVar.a(dVar.c(), 3);
            a10.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(dVar.b(), "application/dvbsubs", (String) null, -1, Collections.singletonList(aVar.f19011b), aVar.f19010a, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null));
            this.f18831b[i10] = a10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j10, boolean z10) {
        if (z10) {
            this.f18832c = true;
            this.f18835f = j10;
            this.f18834e = 0;
            this.f18833d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] nVarArr;
        if (this.f18832c) {
            if (this.f18833d != 2 || a(kVar, 32)) {
                if (this.f18833d != 1 || a(kVar, 0)) {
                    int i10 = kVar.f19580b;
                    int a10 = kVar.a();
                    for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar : this.f18831b) {
                        kVar.e(i10);
                        nVar.a(kVar, a10);
                    }
                    this.f18834e += a10;
                }
            }
        }
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) {
        if (kVar.a() == 0) {
            return false;
        }
        if (kVar.l() != i10) {
            this.f18832c = false;
        }
        this.f18833d--;
        return this.f18832c;
    }
}
