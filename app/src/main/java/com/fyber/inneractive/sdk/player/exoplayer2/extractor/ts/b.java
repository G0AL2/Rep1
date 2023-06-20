package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.util.List;

/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.j f18782a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18783b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18784c;

    /* renamed from: d  reason: collision with root package name */
    public String f18785d;

    /* renamed from: e  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18786e;

    /* renamed from: f  reason: collision with root package name */
    public int f18787f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f18788g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18789h;

    /* renamed from: i  reason: collision with root package name */
    public long f18790i;

    /* renamed from: j  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.i f18791j;

    /* renamed from: k  reason: collision with root package name */
    public int f18792k;

    /* renamed from: l  reason: collision with root package name */
    public long f18793l;

    public b(String str) {
        byte[] bArr = new byte[8];
        this.f18782a = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(bArr);
        this.f18783b = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(bArr);
        this.f18784c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        this.f18787f = 0;
        this.f18788g = 0;
        this.f18789h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.f18785d = dVar.b();
        this.f18786e = hVar.a(dVar.c(), 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j10, boolean z10) {
        this.f18793l = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int a10;
        int i10;
        int i11;
        String str;
        int i12;
        boolean z10;
        while (kVar.a() > 0) {
            int i13 = this.f18787f;
            if (i13 == 0) {
                while (true) {
                    if (kVar.a() <= 0) {
                        z10 = false;
                        break;
                    } else if (!this.f18789h) {
                        this.f18789h = kVar.l() == 11;
                    } else {
                        int l10 = kVar.l();
                        if (l10 == 119) {
                            this.f18789h = false;
                            z10 = true;
                            break;
                        }
                        this.f18789h = l10 == 11;
                    }
                }
                if (z10) {
                    this.f18787f = 1;
                    byte[] bArr = this.f18783b.f19579a;
                    bArr[0] = 11;
                    bArr[1] = 119;
                    this.f18788g = 2;
                }
            } else if (i13 == 1) {
                byte[] bArr2 = this.f18783b.f19579a;
                int min = Math.min(kVar.a(), 8 - this.f18788g);
                System.arraycopy(kVar.f19579a, kVar.f19580b, bArr2, this.f18788g, min);
                kVar.f19580b += min;
                int i14 = this.f18788g + min;
                this.f18788g = i14;
                if (i14 == 8) {
                    this.f18782a.b(0);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = this.f18782a;
                    int i15 = (jVar.f19576b * 8) + jVar.f19577c;
                    jVar.c(40);
                    boolean z11 = jVar.a(5) == 16;
                    jVar.b(i15);
                    int i16 = 6;
                    if (z11) {
                        jVar.c(21);
                        i11 = (jVar.a(11) + 1) * 2;
                        int a11 = jVar.a(2);
                        if (a11 == 3) {
                            i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17999c[jVar.a(2)];
                        } else {
                            i16 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17997a[jVar.a(2)];
                            i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17998b[a11];
                        }
                        i12 = i16 * 256;
                        a10 = jVar.a(3);
                        str = "audio/eac3";
                    } else {
                        jVar.c(32);
                        int a12 = jVar.a(2);
                        int a13 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a(a12, jVar.a(6));
                        jVar.c(8);
                        a10 = jVar.a(3);
                        if ((a10 & 1) != 0 && a10 != 1) {
                            jVar.c(2);
                        }
                        if ((a10 & 4) != 0) {
                            jVar.c(2);
                        }
                        if (a10 == 2) {
                            jVar.c(2);
                        }
                        i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17998b[a12];
                        i11 = a13;
                        str = "audio/ac3";
                        i12 = 1536;
                    }
                    int i17 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f18000d[a10] + (jVar.b() ? 1 : 0);
                    com.fyber.inneractive.sdk.player.exoplayer2.i iVar = this.f18791j;
                    if (iVar == null || i17 != iVar.f19131r || i10 != iVar.f19132s || str != iVar.f19119f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.i a14 = com.fyber.inneractive.sdk.player.exoplayer2.i.a(this.f18785d, str, (String) null, -1, -1, i17, i10, -1, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, this.f18784c);
                        this.f18791j = a14;
                        this.f18786e.a(a14);
                    }
                    this.f18792k = i11;
                    this.f18790i = (i12 * 1000000) / this.f18791j.f19132s;
                    this.f18783b.e(0);
                    this.f18786e.a(this.f18783b, 8);
                    this.f18787f = 2;
                }
            } else if (i13 == 2) {
                int min2 = Math.min(kVar.a(), this.f18792k - this.f18788g);
                this.f18786e.a(kVar, min2);
                int i18 = this.f18788g + min2;
                this.f18788g = i18;
                int i19 = this.f18792k;
                if (i18 == i19) {
                    this.f18786e.a(this.f18793l, 1, i19, 0, null);
                    this.f18793l += this.f18790i;
                    this.f18787f = 0;
                }
            }
        }
    }
}
