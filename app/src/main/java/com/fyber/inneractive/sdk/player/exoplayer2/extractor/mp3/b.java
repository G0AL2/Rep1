package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final int f18486m = u.a("Xing");

    /* renamed from: n  reason: collision with root package name */
    public static final int f18487n = u.a("Info");

    /* renamed from: o  reason: collision with root package name */
    public static final int f18488o = u.a("VBRI");

    /* renamed from: a  reason: collision with root package name */
    public final long f18489a;

    /* renamed from: e  reason: collision with root package name */
    public h f18493e;

    /* renamed from: f  reason: collision with root package name */
    public n f18494f;

    /* renamed from: g  reason: collision with root package name */
    public int f18495g;

    /* renamed from: h  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.a f18496h;

    /* renamed from: i  reason: collision with root package name */
    public a f18497i;

    /* renamed from: k  reason: collision with root package name */
    public long f18499k;

    /* renamed from: l  reason: collision with root package name */
    public int f18500l;

    /* renamed from: b  reason: collision with root package name */
    public final k f18490b = new k(10);

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k f18491c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.k();

    /* renamed from: d  reason: collision with root package name */
    public final j f18492d = new j();

    /* renamed from: j  reason: collision with root package name */
    public long f18498j = -9223372036854775807L;

    /* loaded from: classes.dex */
    public interface a extends m {
        long b(long j10);
    }

    public b(int i10, long j10) {
        this.f18489a = j10;
    }

    public static boolean a(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(g gVar) throws IOException, InterruptedException {
        return a(gVar, true);
    }

    public final a b(g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        bVar.a(this.f18490b.f19579a, 0, 4, false);
        this.f18490b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.k.a(this.f18490b.c(), this.f18491c);
        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a(bVar.f18144c, this.f18491c.f18409f, bVar.f18143b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(h hVar) {
        this.f18493e = hVar;
        this.f18494f = hVar.a(0, 1);
        this.f18493e.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        this.f18495g = 0;
        this.f18498j = -9223372036854775807L;
        this.f18499k = 0L;
        this.f18500l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r12 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.f18487n) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r36, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r37) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
        if (r14 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
        r13.c(r3 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
        r13.f18146e = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
        r12.f18495g = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00df, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r13, boolean r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, boolean):boolean");
    }
}
