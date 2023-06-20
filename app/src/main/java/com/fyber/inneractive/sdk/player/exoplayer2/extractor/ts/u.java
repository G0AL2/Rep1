package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class u implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* renamed from: l  reason: collision with root package name */
    public static final long f18989l = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a("AC-3");

    /* renamed from: m  reason: collision with root package name */
    public static final long f18990m = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a("EAC3");

    /* renamed from: n  reason: collision with root package name */
    public static final long f18991n = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a("HEVC");

    /* renamed from: a  reason: collision with root package name */
    public final int f18992a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.util.r> f18993b;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18994c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f18995d;

    /* renamed from: e  reason: collision with root package name */
    public final v.c f18996e;

    /* renamed from: f  reason: collision with root package name */
    public final SparseArray<v> f18997f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseBooleanArray f18998g;

    /* renamed from: h  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h f18999h;

    /* renamed from: i  reason: collision with root package name */
    public int f19000i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f19001j;

    /* renamed from: k  reason: collision with root package name */
    public v f19002k;

    /* loaded from: classes2.dex */
    public class a implements q {

        /* renamed from: a  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.j f19003a = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[4]);

        public a() {
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
        public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
            if (kVar.l() != 0) {
                return;
            }
            kVar.f(7);
            int a10 = kVar.a() / 4;
            for (int i10 = 0; i10 < a10; i10++) {
                kVar.a(this.f19003a, 4);
                int a11 = this.f19003a.a(16);
                this.f19003a.c(3);
                if (a11 == 0) {
                    this.f19003a.c(13);
                } else {
                    int a12 = this.f19003a.a(13);
                    u uVar = u.this;
                    uVar.f18997f.put(a12, new r(new b(a12)));
                    u.this.f19000i++;
                }
            }
            u uVar2 = u.this;
            if (uVar2.f18992a != 2) {
                uVar2.f18997f.remove(0);
            }
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
        public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements q {

        /* renamed from: a  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.j f19005a = new com.fyber.inneractive.sdk.player.exoplayer2.util.j(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        public final SparseArray<v> f19006b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        public final SparseIntArray f19007c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        public final int f19008d;

        public b(int i10) {
            this.f19008d = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x01fb  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r25) {
            /*
                Method dump skipped, instructions count: 707
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u.b.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q
        public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, v.d dVar) {
        }
    }

    public u(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, v.c cVar) {
        this.f18996e = (v.c) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(cVar);
        this.f18992a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f18993b = arrayList;
            arrayList.add(rVar);
        } else {
            this.f18993b = Collections.singletonList(rVar);
        }
        this.f18994c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(940);
        this.f18998g = new SparseBooleanArray();
        this.f18997f = new SparseArray<>();
        this.f18995d = new SparseIntArray();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        r2 = r2 + 1;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r7) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r6.f18994c
            byte[] r0 = r0.f19579a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.a(r0, r1, r2, r1)
            r2 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 != r4) goto L1a
            r7.c(r2)
            r7 = 1
            return r7
        L1a:
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L26
            int r2 = r2 + 1
            goto Ld
        L26:
            int r3 = r3 + 1
            goto L12
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.f18999h = hVar;
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        int size = this.f18993b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18993b.get(i10).f19605c = -9223372036854775807L;
        }
        this.f18994c.r();
        this.f18995d.clear();
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
        if (r0 != ((r7 + 1) & 15)) goto L48;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r10, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    public final void a() {
        this.f18998g.clear();
        this.f18997f.clear();
        SparseArray<v> a10 = this.f18996e.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18997f.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f18997f.put(0, new r(new a()));
        this.f19002k = null;
    }
}
