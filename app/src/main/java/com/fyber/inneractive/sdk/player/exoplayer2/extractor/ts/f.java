package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.inmobi.media.fq;
import java.util.List;

/* loaded from: classes2.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18819a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18820b;

    /* renamed from: c  reason: collision with root package name */
    public String f18821c;

    /* renamed from: d  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18822d;

    /* renamed from: e  reason: collision with root package name */
    public int f18823e;

    /* renamed from: f  reason: collision with root package name */
    public int f18824f;

    /* renamed from: g  reason: collision with root package name */
    public int f18825g;

    /* renamed from: h  reason: collision with root package name */
    public long f18826h;

    /* renamed from: i  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.i f18827i;

    /* renamed from: j  reason: collision with root package name */
    public int f18828j;

    /* renamed from: k  reason: collision with root package name */
    public long f18829k;

    public f(String str) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(new byte[15]);
        this.f18819a = kVar;
        byte[] bArr = kVar.f19579a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.f18823e = 0;
        this.f18820b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        this.f18823e = 0;
        this.f18824f = 0;
        this.f18825g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.f18821c = dVar.b();
        this.f18822d = hVar.a(dVar.c(), 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j10, boolean z10) {
        this.f18829k = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        while (kVar.a() > 0) {
            int i10 = this.f18823e;
            boolean z10 = false;
            if (i10 == 0) {
                while (true) {
                    if (kVar.a() <= 0) {
                        break;
                    }
                    int i11 = this.f18825g << 8;
                    this.f18825g = i11;
                    int l10 = i11 | kVar.l();
                    this.f18825g = l10;
                    if (l10 == 2147385345) {
                        this.f18825g = 0;
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    this.f18824f = 4;
                    this.f18823e = 1;
                }
            } else if (i10 == 1) {
                byte[] bArr = this.f18819a.f19579a;
                int min = Math.min(kVar.a(), 15 - this.f18824f);
                System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, this.f18824f, min);
                kVar.f19580b += min;
                int i12 = this.f18824f + min;
                this.f18824f = i12;
                if (i12 == 15) {
                    byte[] bArr2 = this.f18819a.f19579a;
                    if (this.f18827i == null) {
                        String str = this.f18821c;
                        String str2 = this.f18820b;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(bArr2, bArr2.length);
                        jVar.c(60);
                        int i13 = com.fyber.inneractive.sdk.player.exoplayer2.audio.e.f18059a[jVar.a(6)];
                        int i14 = com.fyber.inneractive.sdk.player.exoplayer2.audio.e.f18060b[jVar.a(4)];
                        int a10 = jVar.a(5);
                        int[] iArr = com.fyber.inneractive.sdk.player.exoplayer2.audio.e.f18061c;
                        int i15 = a10 >= iArr.length ? -1 : (iArr[a10] * 1000) / 2;
                        jVar.c(10);
                        com.fyber.inneractive.sdk.player.exoplayer2.i a11 = com.fyber.inneractive.sdk.player.exoplayer2.i.a(str, "audio/vnd.dts", (String) null, i15, -1, i13 + (jVar.a(2) > 0 ? 1 : 0), i14, -1, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, str2);
                        this.f18827i = a11;
                        this.f18822d.a(a11);
                    }
                    this.f18828j = (((bArr2[5] & 2) << 12) | ((bArr2[6] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f18826h = (int) (((((((bArr2[5] & 252) >> 2) | ((bArr2[4] & 1) << 6)) + 1) * 32) * 1000000) / this.f18827i.f19132s);
                    this.f18819a.e(0);
                    this.f18822d.a(this.f18819a, 15);
                    this.f18823e = 2;
                }
            } else if (i10 == 2) {
                int min2 = Math.min(kVar.a(), this.f18828j - this.f18824f);
                this.f18822d.a(kVar, min2);
                int i16 = this.f18824f + min2;
                this.f18824f = i16;
                int i17 = this.f18828j;
                if (i16 == i17) {
                    this.f18822d.a(this.f18829k, 1, i17, 0, null);
                    this.f18829k += this.f18826h;
                    this.f18823e = 0;
                }
            }
        }
    }
}
