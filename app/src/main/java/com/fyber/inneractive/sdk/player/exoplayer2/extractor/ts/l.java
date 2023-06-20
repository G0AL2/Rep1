package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;

/* loaded from: classes2.dex */
public final class l implements h {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18929a = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(10);

    /* renamed from: b  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18930b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18931c;

    /* renamed from: d  reason: collision with root package name */
    public long f18932d;

    /* renamed from: e  reason: collision with root package name */
    public int f18933e;

    /* renamed from: f  reason: collision with root package name */
    public int f18934f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        this.f18931c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
        int i10;
        if (this.f18931c && (i10 = this.f18933e) != 0 && this.f18934f == i10) {
            this.f18930b.a(this.f18932d, 1, i10, 0, null);
            this.f18931c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a10 = hVar.a(dVar.c(), 4);
        this.f18930b = a10;
        a10.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(dVar.b(), "application/id3", null, -1, null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j10, boolean z10) {
        if (z10) {
            this.f18931c = true;
            this.f18932d = j10;
            this.f18933e = 0;
            this.f18934f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        if (this.f18931c) {
            int a10 = kVar.a();
            int i10 = this.f18934f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(kVar.f19579a, kVar.f19580b, this.f18929a.f19579a, this.f18934f, min);
                if (this.f18934f + min == 10) {
                    this.f18929a.e(0);
                    if (73 == this.f18929a.l() && 68 == this.f18929a.l() && 51 == this.f18929a.l()) {
                        this.f18929a.f(3);
                        this.f18933e = this.f18929a.k() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f18931c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f18933e - this.f18934f);
            this.f18930b.a(kVar, min2);
            this.f18934f += min2;
        }
    }
}
