package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.r;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.d {
    public static final AtomicInteger G = new AtomicInteger();
    public int A;
    public int B;
    public boolean C;
    public j D;
    public volatile boolean E;
    public volatile boolean F;

    /* renamed from: j  reason: collision with root package name */
    public final int f18237j;

    /* renamed from: k  reason: collision with root package name */
    public final int f18238k;

    /* renamed from: l  reason: collision with root package name */
    public final a.C0250a f18239l;

    /* renamed from: m  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f18240m;

    /* renamed from: n  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.j f18241n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f18242o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f18243p;

    /* renamed from: q  reason: collision with root package name */
    public final r f18244q;

    /* renamed from: r  reason: collision with root package name */
    public final String f18245r;

    /* renamed from: s  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.f f18246s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f18247t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f18248u;

    /* renamed from: v  reason: collision with root package name */
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.i> f18249v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f18250w;

    /* renamed from: x  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g f18251x;

    /* renamed from: y  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18252y;

    /* renamed from: z  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.f f18253z;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar2, a.C0250a c0250a, List<com.fyber.inneractive.sdk.player.exoplayer2.i> list, int i10, Object obj, long j10, long j11, int i11, int i12, boolean z10, r rVar, f fVar, byte[] bArr, byte[] bArr2) {
        super(a(gVar, bArr, bArr2), jVar, c0250a.f18318b, i10, obj, j10, j11, i11);
        this.f18238k = i12;
        this.f18241n = jVar2;
        this.f18239l = c0250a;
        this.f18249v = list;
        this.f18243p = z10;
        this.f18244q = rVar;
        this.f18242o = this.f19250h instanceof a;
        String lastPathSegment = jVar.f19462a.getLastPathSegment();
        this.f18245r = lastPathSegment;
        boolean z11 = false;
        boolean z12 = lastPathSegment.endsWith(".aac") || lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3") || lastPathSegment.endsWith(".mp3");
        this.f18250w = z12;
        if (fVar != null) {
            this.f18251x = fVar.f18251x;
            this.f18252y = fVar.f18252y;
            this.f18246s = fVar.f18253z;
            boolean z13 = fVar.f18239l != c0250a;
            this.f18247t = z13;
            this.f18248u = (fVar.f18238k != i12 || z13) ? true : true;
        } else {
            this.f18251x = z12 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g() : null;
            this.f18252y = z12 ? new com.fyber.inneractive.sdk.player.exoplayer2.util.k(10) : null;
            this.f18246s = null;
            this.f18247t = false;
            this.f18248u = true;
        }
        this.f18240m = gVar;
        this.f18237j = G.getAndIncrement();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public boolean a() {
        return this.E;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    public void b() {
        this.E = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public long c() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01aa A[Catch: all -> 0x01f3, TryCatch #5 {all -> 0x01f3, blocks: (B:123:0x0198, B:125:0x01aa, B:127:0x01b2, B:129:0x01bb, B:128:0x01b9, B:131:0x01c3, B:140:0x01e1, B:133:0x01ca, B:135:0x01ce), top: B:152:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c3 A[Catch: all -> 0x01f3, TRY_LEAVE, TryCatch #5 {all -> 0x01f3, blocks: (B:123:0x0198, B:125:0x01aa, B:127:0x01b2, B:129:0x01bb, B:128:0x01b9, B:131:0x01c3, B:140:0x01e1, B:133:0x01ca, B:135:0x01ce), top: B:152:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void load() throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f.load():void");
    }

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.a a10;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.f18146e = 0;
        if (bVar.a(this.f18252y.f19579a, 0, 10, true)) {
            this.f18252y.c(10);
            if (this.f18252y.n() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.f19204b) {
                return -9223372036854775807L;
            }
            this.f18252y.f(3);
            int k10 = this.f18252y.k();
            int i10 = k10 + 10;
            if (i10 > this.f18252y.b()) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = this.f18252y;
                byte[] bArr = kVar.f19579a;
                kVar.c(i10);
                System.arraycopy(bArr, 0, this.f18252y.f19579a, 0, 10);
            }
            if (bVar.a(this.f18252y.f19579a, 10, k10, true) && (a10 = this.f18251x.a(this.f18252y.f19579a, k10)) != null) {
                int length = a10.f19180a.length;
                for (int i11 = 0; i11 < length; i11++) {
                    a.b bVar2 = a10.f19180a[i11];
                    if (bVar2 instanceof com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i) {
                        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i) bVar2;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(iVar.f19210b)) {
                            System.arraycopy(iVar.f19211c, 0, this.f18252y.f19579a, 0, 8);
                            this.f18252y.c(8);
                            return this.f18252y.i();
                        }
                    }
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.upstream.g a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null) ? gVar : new a(gVar, bArr, bArr2);
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.f a(long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.f aVar;
        if (this.f18245r.endsWith(".aac")) {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(j10);
        } else if (!this.f18245r.endsWith(".ac3") && !this.f18245r.endsWith(".ec3")) {
            if (this.f18245r.endsWith(".mp3")) {
                aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b(0, j10);
            } else {
                throw new IllegalArgumentException("Unkown extension for audio file: " + this.f18245r);
            }
        } else {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(j10);
        }
        aVar.a(this.D);
        return aVar;
    }
}
