package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.google.android.gms.ads.AdRequest;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f18799r = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18800a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.j f18801b = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[7]);

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18802c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(Arrays.copyOf(f18799r, 10));

    /* renamed from: d  reason: collision with root package name */
    public final String f18803d;

    /* renamed from: e  reason: collision with root package name */
    public String f18804e;

    /* renamed from: f  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18805f;

    /* renamed from: g  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18806g;

    /* renamed from: h  reason: collision with root package name */
    public int f18807h;

    /* renamed from: i  reason: collision with root package name */
    public int f18808i;

    /* renamed from: j  reason: collision with root package name */
    public int f18809j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18810k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18811l;

    /* renamed from: m  reason: collision with root package name */
    public long f18812m;

    /* renamed from: n  reason: collision with root package name */
    public int f18813n;

    /* renamed from: o  reason: collision with root package name */
    public long f18814o;

    /* renamed from: p  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18815p;

    /* renamed from: q  reason: collision with root package name */
    public long f18816q;

    public d(boolean z10, String str) {
        c();
        this.f18800a = z10;
        this.f18803d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    public final void c() {
        this.f18807h = 0;
        this.f18808i = 0;
        this.f18809j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.f18804e = dVar.b();
        this.f18805f = hVar.a(dVar.c(), 1);
        if (this.f18800a) {
            dVar.a();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a10 = hVar.a(dVar.c(), 4);
            this.f18806g = a10;
            a10.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a(dVar.b(), "application/id3", null, -1, null));
            return;
        }
        this.f18806g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.e();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j10, boolean z10) {
        this.f18814o = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        while (kVar.a() > 0) {
            int i10 = this.f18807h;
            if (i10 == 0) {
                byte[] bArr = kVar.f19579a;
                int i11 = kVar.f19580b;
                int i12 = kVar.f19581c;
                while (true) {
                    if (i11 < i12) {
                        int i13 = i11 + 1;
                        int i14 = bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                        int i15 = this.f18809j;
                        if (i15 != 512 || i14 < 240 || i14 == 255) {
                            int i16 = i14 | i15;
                            if (i16 == 329) {
                                this.f18809j = 768;
                            } else if (i16 == 511) {
                                this.f18809j = AdRequest.MAX_CONTENT_URL_LENGTH;
                            } else if (i16 == 836) {
                                this.f18809j = IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
                            } else if (i16 == 1075) {
                                this.f18807h = 1;
                                this.f18808i = f18799r.length;
                                this.f18813n = 0;
                                this.f18802c.e(0);
                                kVar.e(i13);
                                break;
                            } else if (i15 != 256) {
                                this.f18809j = 256;
                                i11 = i13 - 1;
                            }
                            i11 = i13;
                        } else {
                            this.f18810k = (i14 & 1) == 0;
                            this.f18807h = 2;
                            this.f18808i = 0;
                            kVar.e(i13);
                        }
                    } else {
                        kVar.e(i11);
                        break;
                    }
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    if (a(kVar, this.f18801b.f19575a, this.f18810k ? 7 : 5)) {
                        this.f18801b.b(0);
                        if (!this.f18811l) {
                            int a10 = this.f18801b.a(2) + 1;
                            if (a10 != 2) {
                                Log.w("AdtsReader", "Detected audio object type: " + a10 + ", but assuming AAC LC.");
                                a10 = 2;
                            }
                            int a11 = this.f18801b.a(4);
                            this.f18801b.c(1);
                            byte[] bArr2 = {(byte) (((a10 << 3) & 248) | ((a11 >> 1) & 7)), (byte) (((a11 << 7) & 128) | ((this.f18801b.a(3) << 3) & 120))};
                            Pair<Integer, Integer> a12 = com.fyber.inneractive.sdk.player.exoplayer2.util.c.a(bArr2);
                            com.fyber.inneractive.sdk.player.exoplayer2.i a13 = com.fyber.inneractive.sdk.player.exoplayer2.i.a(this.f18804e, AudioTrackTranscoder.MIMETYPE_AUDIO_AAC, (String) null, -1, -1, ((Integer) a12.second).intValue(), ((Integer) a12.first).intValue(), -1, Collections.singletonList(bArr2), (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, this.f18803d);
                            this.f18812m = 1024000000 / a13.f19132s;
                            this.f18805f.a(a13);
                            this.f18811l = true;
                        } else {
                            this.f18801b.c(10);
                        }
                        this.f18801b.c(4);
                        int a14 = (this.f18801b.a(13) - 2) - 5;
                        if (this.f18810k) {
                            a14 -= 2;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar = this.f18805f;
                        long j10 = this.f18812m;
                        this.f18807h = 3;
                        this.f18808i = 0;
                        this.f18815p = nVar;
                        this.f18816q = j10;
                        this.f18813n = a14;
                    }
                } else if (i10 == 3) {
                    int min = Math.min(kVar.a(), this.f18813n - this.f18808i);
                    this.f18815p.a(kVar, min);
                    int i17 = this.f18808i + min;
                    this.f18808i = i17;
                    int i18 = this.f18813n;
                    if (i17 == i18) {
                        this.f18815p.a(this.f18814o, 1, i18, 0, null);
                        this.f18814o += this.f18816q;
                        c();
                    }
                }
            } else if (a(kVar, this.f18802c.f19579a, 10)) {
                this.f18806g.a(this.f18802c, 10);
                this.f18802c.e(6);
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.f18806g;
                this.f18807h = 3;
                this.f18808i = 10;
                this.f18815p = nVar2;
                this.f18816q = 0L;
                this.f18813n = this.f18802c.k() + 10;
            }
        }
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, byte[] bArr, int i10) {
        int min = Math.min(kVar.a(), i10 - this.f18808i);
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, this.f18808i, min);
        kVar.f19580b += min;
        int i11 = this.f18808i + min;
        this.f18808i = i11;
        return i11 == i10;
    }
}
