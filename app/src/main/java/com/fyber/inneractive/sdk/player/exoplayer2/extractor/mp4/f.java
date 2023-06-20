package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;
import java.util.Stack;

/* loaded from: classes.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f, m {

    /* renamed from: p  reason: collision with root package name */
    public static final int f18647p = u.a("qt  ");

    /* renamed from: e  reason: collision with root package name */
    public int f18652e;

    /* renamed from: f  reason: collision with root package name */
    public int f18653f;

    /* renamed from: g  reason: collision with root package name */
    public long f18654g;

    /* renamed from: h  reason: collision with root package name */
    public int f18655h;

    /* renamed from: i  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.k f18656i;

    /* renamed from: j  reason: collision with root package name */
    public int f18657j;

    /* renamed from: k  reason: collision with root package name */
    public int f18658k;

    /* renamed from: l  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h f18659l;

    /* renamed from: m  reason: collision with root package name */
    public a[] f18660m;

    /* renamed from: n  reason: collision with root package name */
    public long f18661n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18662o;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18650c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(16);

    /* renamed from: d  reason: collision with root package name */
    public final Stack<a.C0253a> f18651d = new Stack<>();

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18648a = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(com.fyber.inneractive.sdk.player.exoplayer2.util.i.f19558a);

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18649b = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(4);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h f18663a;

        /* renamed from: b  reason: collision with root package name */
        public final k f18664b;

        /* renamed from: c  reason: collision with root package name */
        public final n f18665c;

        /* renamed from: d  reason: collision with root package name */
        public int f18666d;

        public a(h hVar, k kVar, n nVar) {
            this.f18663a = hVar;
            this.f18664b = kVar;
            this.f18665c = nVar;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        return g.a(gVar, false);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.f18661n;
    }

    public final void d() {
        this.f18652e = 0;
        this.f18655h = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.f18659l = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc A[Catch: all -> 0x022a, TryCatch #0 {all -> 0x022a, blocks: (B:32:0x00a5, B:34:0x00a9, B:36:0x00af, B:38:0x00b4, B:41:0x00bc, B:42:0x00c3, B:43:0x00cb, B:45:0x00cf, B:46:0x00d7, B:48:0x00db, B:49:0x00e3, B:51:0x00e7, B:52:0x00f0, B:54:0x00f4, B:55:0x00fd, B:57:0x0101, B:59:0x010a, B:61:0x010e, B:62:0x0116, B:64:0x011a, B:65:0x0122, B:67:0x0126, B:68:0x012d, B:70:0x0131, B:71:0x0138, B:73:0x013c, B:74:0x0143, B:76:0x0147, B:77:0x014e, B:79:0x0152, B:80:0x0159, B:82:0x015d, B:83:0x0165, B:85:0x0169, B:86:0x0170, B:88:0x0174, B:89:0x017b, B:91:0x017f, B:126:0x01f0, B:92:0x0184, B:94:0x018c, B:97:0x0195, B:100:0x019b, B:102:0x019f, B:105:0x01a5, B:107:0x01a9, B:108:0x01b0, B:110:0x01b4, B:111:0x01bb, B:113:0x01bf, B:114:0x01c6, B:116:0x01ca, B:117:0x01d1, B:119:0x01d5, B:120:0x01dc, B:122:0x01e0, B:123:0x01e5, B:125:0x01e9, B:128:0x020d, B:129:0x0215), top: B:429:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[Catch: all -> 0x022a, TryCatch #0 {all -> 0x022a, blocks: (B:32:0x00a5, B:34:0x00a9, B:36:0x00af, B:38:0x00b4, B:41:0x00bc, B:42:0x00c3, B:43:0x00cb, B:45:0x00cf, B:46:0x00d7, B:48:0x00db, B:49:0x00e3, B:51:0x00e7, B:52:0x00f0, B:54:0x00f4, B:55:0x00fd, B:57:0x0101, B:59:0x010a, B:61:0x010e, B:62:0x0116, B:64:0x011a, B:65:0x0122, B:67:0x0126, B:68:0x012d, B:70:0x0131, B:71:0x0138, B:73:0x013c, B:74:0x0143, B:76:0x0147, B:77:0x014e, B:79:0x0152, B:80:0x0159, B:82:0x015d, B:83:0x0165, B:85:0x0169, B:86:0x0170, B:88:0x0174, B:89:0x017b, B:91:0x017f, B:126:0x01f0, B:92:0x0184, B:94:0x018c, B:97:0x0195, B:100:0x019b, B:102:0x019f, B:105:0x01a5, B:107:0x01a9, B:108:0x01b0, B:110:0x01b4, B:111:0x01bb, B:113:0x01bf, B:114:0x01c6, B:116:0x01ca, B:117:0x01d1, B:119:0x01d5, B:120:0x01dc, B:122:0x01e0, B:123:0x01e5, B:125:0x01e9, B:128:0x020d, B:129:0x0215), top: B:429:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r88) throws com.fyber.inneractive.sdk.player.exoplayer2.l {
        /*
            Method dump skipped, instructions count: 2629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f.c(long):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        this.f18651d.clear();
        this.f18655h = 0;
        this.f18657j = 0;
        this.f18658k = 0;
        if (j10 == 0) {
            d();
            return;
        }
        a[] aVarArr = this.f18660m;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                k kVar = aVar.f18664b;
                int a10 = kVar.a(j11);
                if (a10 == -1) {
                    a10 = kVar.b(j11);
                }
                aVar.f18666d = a10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0006 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r24, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j10) {
        long j11 = Long.MAX_VALUE;
        for (a aVar : this.f18660m) {
            k kVar = aVar.f18664b;
            int a10 = kVar.a(j10);
            if (a10 == -1) {
                a10 = kVar.b(j10);
            }
            long j12 = kVar.f18700b[a10];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }
}
