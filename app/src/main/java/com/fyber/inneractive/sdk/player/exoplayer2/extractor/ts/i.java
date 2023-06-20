package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i implements h {

    /* renamed from: n  reason: collision with root package name */
    public static final double[] f18836n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f18837a;

    /* renamed from: b  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18838b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18839c;

    /* renamed from: d  reason: collision with root package name */
    public long f18840d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean[] f18841e = new boolean[4];

    /* renamed from: f  reason: collision with root package name */
    public final a f18842f = new a(128);

    /* renamed from: g  reason: collision with root package name */
    public boolean f18843g;

    /* renamed from: h  reason: collision with root package name */
    public long f18844h;

    /* renamed from: i  reason: collision with root package name */
    public long f18845i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18846j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18847k;

    /* renamed from: l  reason: collision with root package name */
    public long f18848l;

    /* renamed from: m  reason: collision with root package name */
    public long f18849m;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18850a;

        /* renamed from: b  reason: collision with root package name */
        public int f18851b;

        /* renamed from: c  reason: collision with root package name */
        public int f18852c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f18853d;

        public a(int i10) {
            this.f18853d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f18850a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f18853d;
                int length = bArr2.length;
                int i13 = this.f18851b + i12;
                if (length < i13) {
                    this.f18853d = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f18853d, this.f18851b, i12);
                this.f18851b += i12;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(this.f18841e);
        a aVar = this.f18842f;
        aVar.f18850a = false;
        aVar.f18851b = 0;
        aVar.f18852c = 0;
        this.f18846j = false;
        this.f18843g = false;
        this.f18844h = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        dVar.a();
        this.f18837a = dVar.b();
        this.f18838b = hVar.a(dVar.c(), 2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public void a(long j10, boolean z10) {
        boolean z11 = j10 != -9223372036854775807L;
        this.f18846j = z11;
        if (z11) {
            this.f18845i = j10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r26) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }
}
