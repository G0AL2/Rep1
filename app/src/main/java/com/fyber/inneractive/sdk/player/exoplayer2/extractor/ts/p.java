package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.inmobi.media.fq;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.r f18964a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18967d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18968e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18969f;

    /* renamed from: g  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h f18970g;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18966c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(4096);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<a> f18965b = new SparseArray<>();

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h f18971a;

        /* renamed from: b  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.r f18972b;

        /* renamed from: c  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.j f18973c = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        public boolean f18974d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f18975e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f18976f;

        /* renamed from: g  reason: collision with root package name */
        public long f18977g;

        public a(h hVar, com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar) {
            this.f18971a = hVar;
            this.f18972b = rVar;
        }
    }

    public p(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar) {
        this.f18964a = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.a(bArr, 0, 14, false);
        if (442 == (((bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            bVar.a(bArr[13] & 7, false);
            bVar.a(bArr, 0, 3, false);
            return 1 == ((((bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.f18970g = hVar;
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        this.f18964a.f19605c = -9223372036854775807L;
        for (int i10 = 0; i10 < this.f18965b.size(); i10++) {
            a valueAt = this.f18965b.valueAt(i10);
            valueAt.f18976f = false;
            valueAt.f18971a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r14, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }
}
