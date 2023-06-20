package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: b  reason: collision with root package name */
    public final k f18205b;

    /* renamed from: c  reason: collision with root package name */
    public final k f18206c;

    /* renamed from: d  reason: collision with root package name */
    public int f18207d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18208e;

    /* renamed from: f  reason: collision with root package name */
    public int f18209f;

    public e(n nVar) {
        super(nVar);
        this.f18205b = new k(i.f19558a);
        this.f18206c = new k(4);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public boolean a(k kVar) throws d.a {
        int l10 = kVar.l();
        int i10 = (l10 >> 4) & 15;
        int i11 = l10 & 15;
        if (i11 == 7) {
            this.f18209f = i10;
            return i10 != 5;
        }
        throw new d.a("Video format not supported: " + i11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public void b(k kVar, long j10) throws l {
        int l10 = kVar.l();
        long n10 = j10 + (kVar.n() * 1000);
        if (l10 == 0 && !this.f18208e) {
            k kVar2 = new k(new byte[kVar.a()]);
            kVar.a(kVar2.f19579a, 0, kVar.a());
            com.fyber.inneractive.sdk.player.exoplayer2.video.a b10 = com.fyber.inneractive.sdk.player.exoplayer2.video.a.b(kVar2);
            this.f18207d = b10.f19663b;
            this.f18204a.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "video/avc", (String) null, -1, -1, b10.f19664c, b10.f19665d, -1.0f, b10.f19662a, -1, b10.f19666e, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null));
            this.f18208e = true;
        } else if (l10 == 1 && this.f18208e) {
            byte[] bArr = this.f18206c.f19579a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = 4 - this.f18207d;
            int i11 = 0;
            while (kVar.a() > 0) {
                kVar.a(this.f18206c.f19579a, i10, this.f18207d);
                this.f18206c.e(0);
                int o10 = this.f18206c.o();
                this.f18205b.e(0);
                this.f18204a.a(this.f18205b, 4);
                this.f18204a.a(kVar, o10);
                i11 = i11 + 4 + o10;
            }
            this.f18204a.a(n10, this.f18209f == 1 ? 1 : 0, i11, 0, null);
        }
    }
}
