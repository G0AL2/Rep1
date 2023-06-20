package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;

/* loaded from: classes2.dex */
public final class k implements h {

    /* renamed from: a  reason: collision with root package name */
    public final s f18902a;

    /* renamed from: b  reason: collision with root package name */
    public String f18903b;

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18904c;

    /* renamed from: d  reason: collision with root package name */
    public a f18905d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18906e;

    /* renamed from: l  reason: collision with root package name */
    public long f18913l;

    /* renamed from: m  reason: collision with root package name */
    public long f18914m;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f18907f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final n f18908g = new n(32, 128);

    /* renamed from: h  reason: collision with root package name */
    public final n f18909h = new n(33, 128);

    /* renamed from: i  reason: collision with root package name */
    public final n f18910i = new n(34, 128);

    /* renamed from: j  reason: collision with root package name */
    public final n f18911j = new n(39, 128);

    /* renamed from: k  reason: collision with root package name */
    public final n f18912k = new n(40, 128);

    /* renamed from: n  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18915n = new com.fyber.inneractive.sdk.player.exoplayer2.util.k();

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18916a;

        /* renamed from: b  reason: collision with root package name */
        public long f18917b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f18918c;

        /* renamed from: d  reason: collision with root package name */
        public int f18919d;

        /* renamed from: e  reason: collision with root package name */
        public long f18920e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f18921f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f18922g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f18923h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f18924i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f18925j;

        /* renamed from: k  reason: collision with root package name */
        public long f18926k;

        /* renamed from: l  reason: collision with root package name */
        public long f18927l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f18928m;

        public a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar) {
            this.f18916a = nVar;
        }
    }

    public k(s sVar) {
        this.f18902a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(this.f18907f);
        this.f18908g.a();
        this.f18909h.a();
        this.f18910i.a();
        this.f18911j.a();
        this.f18912k.a();
        a aVar = this.f18905d;
        aVar.f18921f = false;
        aVar.f18922g = false;
        aVar.f18923h = false;
        aVar.f18924i = false;
        aVar.f18925j = false;
        this.f18913l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.f18903b = dVar.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n a10 = hVar.a(dVar.c(), 2);
        this.f18904c = a10;
        this.f18905d = new a(a10);
        this.f18902a.a(hVar, dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j10, boolean z10) {
        this.f18914m = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c9  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r39) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f18906e) {
            a aVar = this.f18905d;
            if (aVar.f18921f) {
                int i12 = aVar.f18919d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    aVar.f18922g = (bArr[i13] & 128) != 0;
                    aVar.f18921f = false;
                } else {
                    aVar.f18919d = i12 + (i11 - i10);
                }
            }
        } else {
            this.f18908g.a(bArr, i10, i11);
            this.f18909h.a(bArr, i10, i11);
            this.f18910i.a(bArr, i10, i11);
        }
        this.f18911j.a(bArr, i10, i11);
        this.f18912k.a(bArr, i10, i11);
    }
}
