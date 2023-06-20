package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* renamed from: e  reason: collision with root package name */
    public static final int f18777e = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a("ID3");

    /* renamed from: a  reason: collision with root package name */
    public final long f18778a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18779b = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(2786);

    /* renamed from: c  reason: collision with root package name */
    public b f18780c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18781d;

    public a(long j10) {
        this.f18778a = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
        if ((r1 - r3) < 8192) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        r5.f18146e = 0;
        r1 = r1 + 1;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r10 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f19579a
            r5 = r11
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) r5
            r5.a(r4, r2, r1, r2)
            r0.e(r2)
            int r4 = r0.n()
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a.f18777e
            if (r4 == r6) goto L68
            r5.f18146e = r2
            r5.a(r3, r2)
            r1 = r3
        L22:
            r11 = 0
        L23:
            byte[] r4 = r0.f19579a
            r6 = 5
            r5.a(r4, r2, r6, r2)
            r0.e(r2)
            int r4 = r0.q()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r4 == r7) goto L43
            r5.f18146e = r2
            int r1 = r1 + 1
            int r11 = r1 - r3
            r4 = 8192(0x2000, float:1.148E-41)
            if (r11 < r4) goto L3f
            return r2
        L3f:
            r5.a(r1, r2)
            goto L22
        L43:
            r4 = 1
            int r11 = r11 + r4
            r7 = 4
            if (r11 < r7) goto L49
            return r4
        L49:
            byte[] r4 = r0.f19579a
            int r8 = r4.length
            r9 = -1
            if (r8 >= r6) goto L51
            r4 = -1
            goto L5f
        L51:
            r6 = r4[r7]
            r6 = r6 & 192(0xc0, float:2.69E-43)
            int r6 = r6 >> 6
            r4 = r4[r7]
            r4 = r4 & 63
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a(r6, r4)
        L5f:
            if (r4 != r9) goto L62
            return r2
        L62:
            int r4 = r4 + (-5)
            r5.a(r4, r2)
            goto L23
        L68:
            r4 = 3
            r0.f(r4)
            int r4 = r0.k()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.a(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        b bVar = new b(null);
        this.f18780c = bVar;
        bVar.f18785d = "0";
        bVar.f18786e = hVar.a(0, 1);
        hVar.c();
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        this.f18781d = false;
        this.f18780c.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws IOException, InterruptedException {
        int a10 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).a(this.f18779b.f19579a, 0, 2786);
        if (a10 == -1) {
            return -1;
        }
        this.f18779b.e(0);
        this.f18779b.d(a10);
        if (!this.f18781d) {
            this.f18780c.f18793l = this.f18778a;
            this.f18781d = true;
        }
        this.f18780c.a(this.f18779b);
        return 0;
    }
}
