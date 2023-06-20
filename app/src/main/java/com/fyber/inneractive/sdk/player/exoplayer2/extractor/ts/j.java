package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;

/* loaded from: classes2.dex */
public final class j implements h {

    /* renamed from: a  reason: collision with root package name */
    public final s f18854a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18855b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18856c;

    /* renamed from: g  reason: collision with root package name */
    public long f18860g;

    /* renamed from: i  reason: collision with root package name */
    public String f18862i;

    /* renamed from: j  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18863j;

    /* renamed from: k  reason: collision with root package name */
    public b f18864k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18865l;

    /* renamed from: m  reason: collision with root package name */
    public long f18866m;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f18861h = new boolean[3];

    /* renamed from: d  reason: collision with root package name */
    public final n f18857d = new n(7, 128);

    /* renamed from: e  reason: collision with root package name */
    public final n f18858e = new n(8, 128);

    /* renamed from: f  reason: collision with root package name */
    public final n f18859f = new n(6, 128);

    /* renamed from: n  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18867n = new com.fyber.inneractive.sdk.player.exoplayer2.util.k();

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18868a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18869b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f18870c;

        /* renamed from: f  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.l f18873f;

        /* renamed from: g  reason: collision with root package name */
        public byte[] f18874g;

        /* renamed from: h  reason: collision with root package name */
        public int f18875h;

        /* renamed from: i  reason: collision with root package name */
        public int f18876i;

        /* renamed from: j  reason: collision with root package name */
        public long f18877j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f18878k;

        /* renamed from: l  reason: collision with root package name */
        public long f18879l;

        /* renamed from: o  reason: collision with root package name */
        public boolean f18882o;

        /* renamed from: p  reason: collision with root package name */
        public long f18883p;

        /* renamed from: q  reason: collision with root package name */
        public long f18884q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f18885r;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<i.b> f18871d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<i.a> f18872e = new SparseArray<>();

        /* renamed from: m  reason: collision with root package name */
        public a f18880m = new a();

        /* renamed from: n  reason: collision with root package name */
        public a f18881n = new a();

        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f18886a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f18887b;

            /* renamed from: c  reason: collision with root package name */
            public i.b f18888c;

            /* renamed from: d  reason: collision with root package name */
            public int f18889d;

            /* renamed from: e  reason: collision with root package name */
            public int f18890e;

            /* renamed from: f  reason: collision with root package name */
            public int f18891f;

            /* renamed from: g  reason: collision with root package name */
            public int f18892g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f18893h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f18894i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f18895j;

            /* renamed from: k  reason: collision with root package name */
            public boolean f18896k;

            /* renamed from: l  reason: collision with root package name */
            public int f18897l;

            /* renamed from: m  reason: collision with root package name */
            public int f18898m;

            /* renamed from: n  reason: collision with root package name */
            public int f18899n;

            /* renamed from: o  reason: collision with root package name */
            public int f18900o;

            /* renamed from: p  reason: collision with root package name */
            public int f18901p;

            public a() {
            }

            public static boolean a(a aVar, a aVar2) {
                boolean z10;
                boolean z11;
                if (aVar.f18886a) {
                    if (!aVar2.f18886a || aVar.f18891f != aVar2.f18891f || aVar.f18892g != aVar2.f18892g || aVar.f18893h != aVar2.f18893h) {
                        return true;
                    }
                    if (aVar.f18894i && aVar2.f18894i && aVar.f18895j != aVar2.f18895j) {
                        return true;
                    }
                    int i10 = aVar.f18889d;
                    int i11 = aVar2.f18889d;
                    if (i10 != i11 && (i10 == 0 || i11 == 0)) {
                        return true;
                    }
                    int i12 = aVar.f18888c.f19572h;
                    if (i12 == 0 && aVar2.f18888c.f19572h == 0 && (aVar.f18898m != aVar2.f18898m || aVar.f18899n != aVar2.f18899n)) {
                        return true;
                    }
                    if ((i12 == 1 && aVar2.f18888c.f19572h == 1 && (aVar.f18900o != aVar2.f18900o || aVar.f18901p != aVar2.f18901p)) || (z10 = aVar.f18896k) != (z11 = aVar2.f18896k)) {
                        return true;
                    }
                    if (z10 && z11 && aVar.f18897l != aVar2.f18897l) {
                        return true;
                    }
                }
                return false;
            }
        }

        public b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar, boolean z10, boolean z11) {
            this.f18868a = nVar;
            this.f18869b = z10;
            this.f18870c = z11;
            byte[] bArr = new byte[128];
            this.f18874g = bArr;
            this.f18873f = new com.fyber.inneractive.sdk.player.exoplayer2.util.l(bArr, 0, 0);
            a();
        }

        public void a() {
            this.f18878k = false;
            this.f18882o = false;
            a aVar = this.f18881n;
            aVar.f18887b = false;
            aVar.f18886a = false;
        }
    }

    public j(s sVar, boolean z10, boolean z11) {
        this.f18854a = sVar;
        this.f18855b = z10;
        this.f18856c = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(this.f18861h);
        this.f18857d.a();
        this.f18858e.a();
        this.f18859f.a();
        b bVar = this.f18864k;
        bVar.f18878k = false;
        bVar.f18882o = false;
        b.a aVar = bVar.f18881n;
        aVar.f18887b = false;
        aVar.f18886a = false;
        this.f18860g = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.f18862i = dVar.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a10 = hVar.a(dVar.c(), 2);
        this.f18863j = a10;
        this.f18864k = new b(a10, this.f18855b, this.f18856c);
        this.f18854a.a(hVar, dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j10, boolean z10) {
        this.f18866m = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b9, code lost:
        if ((r1.f18887b && ((r1 = r1.f18890e) == 7 || r1 == 2)) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ea, code lost:
        if (r6 != 1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020a A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r31) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j.a(byte[], int, int):void");
    }
}
