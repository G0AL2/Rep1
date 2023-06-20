package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.inmobi.media.fq;
import java.util.List;

/* loaded from: classes2.dex */
public final class m implements h {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18935a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k f18936b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18937c;

    /* renamed from: d  reason: collision with root package name */
    public String f18938d;

    /* renamed from: e  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18939e;

    /* renamed from: f  reason: collision with root package name */
    public int f18940f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f18941g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18942h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18943i;

    /* renamed from: j  reason: collision with root package name */
    public long f18944j;

    /* renamed from: k  reason: collision with root package name */
    public int f18945k;

    /* renamed from: l  reason: collision with root package name */
    public long f18946l;

    public m(String str) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(4);
        this.f18935a = kVar;
        kVar.f19579a[0] = -1;
        this.f18936b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.k();
        this.f18937c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        this.f18940f = 0;
        this.f18941g = 0;
        this.f18943i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.f18938d = dVar.b();
        this.f18939e = hVar.a(dVar.c(), 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j10, boolean z10) {
        this.f18946l = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        while (kVar.a() > 0) {
            int i10 = this.f18940f;
            if (i10 == 0) {
                byte[] bArr = kVar.f19579a;
                int i11 = kVar.f19580b;
                int i12 = kVar.f19581c;
                while (true) {
                    if (i11 < i12) {
                        boolean z10 = (bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                        boolean z11 = this.f18943i && (bArr[i11] & 224) == 224;
                        this.f18943i = z10;
                        if (z11) {
                            kVar.e(i11 + 1);
                            this.f18943i = false;
                            this.f18935a.f19579a[1] = bArr[i11];
                            this.f18941g = 2;
                            this.f18940f = 1;
                            break;
                        }
                        i11++;
                    } else {
                        kVar.e(i12);
                        break;
                    }
                }
            } else if (i10 == 1) {
                int min = Math.min(kVar.a(), 4 - this.f18941g);
                kVar.a(this.f18935a.f19579a, this.f18941g, min);
                int i13 = this.f18941g + min;
                this.f18941g = i13;
                if (i13 >= 4) {
                    this.f18935a.e(0);
                    if (!com.fyber.inneractive.sdk.player.exoplayer2.extractor.k.a(this.f18935a.c(), this.f18936b)) {
                        this.f18941g = 0;
                        this.f18940f = 1;
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.k kVar2 = this.f18936b;
                        this.f18945k = kVar2.f18406c;
                        if (!this.f18942h) {
                            int i14 = kVar2.f18407d;
                            this.f18944j = (kVar2.f18410g * 1000000) / i14;
                            this.f18939e.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(this.f18938d, kVar2.f18405b, (String) null, -1, 4096, kVar2.f18408e, i14, -1, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, this.f18937c));
                            this.f18942h = true;
                        }
                        this.f18935a.e(0);
                        this.f18939e.a(this.f18935a, 4);
                        this.f18940f = 2;
                    }
                }
            } else if (i10 == 2) {
                int min2 = Math.min(kVar.a(), this.f18945k - this.f18941g);
                this.f18939e.a(kVar, min2);
                int i15 = this.f18941g + min2;
                this.f18941g = i15;
                int i16 = this.f18945k;
                if (i15 >= i16) {
                    this.f18939e.a(this.f18946l, 1, i16, 0, null);
                    this.f18946l += this.f18944j;
                    this.f18941g = 0;
                    this.f18940f = 0;
                }
            }
        }
    }
}
