package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.inmobi.media.fq;

/* loaded from: classes2.dex */
public final class r implements v {

    /* renamed from: a  reason: collision with root package name */
    public final q f18978a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18979b = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(32);

    /* renamed from: c  reason: collision with root package name */
    public int f18980c;

    /* renamed from: d  reason: collision with root package name */
    public int f18981d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18982e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18983f;

    public r(q qVar) {
        this.f18978a = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        this.f18978a.a(rVar, hVar, dVar);
        this.f18983f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public void a() {
        this.f18983f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, boolean z10) {
        int l10 = z10 ? kVar.f19580b + kVar.l() : -1;
        if (this.f18983f) {
            if (!z10) {
                return;
            }
            this.f18983f = false;
            kVar.e(l10);
            this.f18981d = 0;
        }
        while (kVar.a() > 0) {
            int i10 = this.f18981d;
            if (i10 < 3) {
                if (i10 == 0) {
                    int l11 = kVar.l();
                    kVar.e(kVar.f19580b - 1);
                    if (l11 == 255) {
                        this.f18983f = true;
                        return;
                    }
                }
                int min = Math.min(kVar.a(), 3 - this.f18981d);
                kVar.a(this.f18979b.f19579a, this.f18981d, min);
                int i11 = this.f18981d + min;
                this.f18981d = i11;
                if (i11 == 3) {
                    this.f18979b.c(3);
                    this.f18979b.f(1);
                    int l12 = this.f18979b.l();
                    int l13 = this.f18979b.l();
                    this.f18982e = (l12 & 128) != 0;
                    this.f18980c = (((l12 & 15) << 8) | l13) + 3;
                    int b10 = this.f18979b.b();
                    int i12 = this.f18980c;
                    if (b10 < i12) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar2 = this.f18979b;
                        byte[] bArr = kVar2.f19579a;
                        kVar2.c(Math.min(4098, Math.max(i12, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f18979b.f19579a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(kVar.a(), this.f18980c - this.f18981d);
                kVar.a(this.f18979b.f19579a, this.f18981d, min2);
                int i13 = this.f18981d + min2;
                this.f18981d = i13;
                int i14 = this.f18980c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (this.f18982e) {
                        byte[] bArr2 = this.f18979b.f19579a;
                        int i15 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.f19606a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i14; i17++) {
                            i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.f19613h[((i16 >>> 24) ^ (bArr2[i17] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)) & 255] ^ (i16 << 8);
                        }
                        if (i16 != 0) {
                            this.f18983f = true;
                            return;
                        }
                        this.f18979b.c(this.f18980c - 4);
                    } else {
                        this.f18979b.c(i14);
                    }
                    this.f18978a.a(this.f18979b);
                    this.f18981d = 0;
                }
            }
        }
    }
}
