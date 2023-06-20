package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import java.io.IOException;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class j implements x.a<com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a>, p, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h, d.InterfaceC0248d {

    /* renamed from: a  reason: collision with root package name */
    public final int f18277a;

    /* renamed from: b  reason: collision with root package name */
    public final b f18278b;

    /* renamed from: c  reason: collision with root package name */
    public final c f18279c;

    /* renamed from: d  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f18280d;

    /* renamed from: e  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.i f18281e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18282f;

    /* renamed from: h  reason: collision with root package name */
    public final f.a f18284h;

    /* renamed from: n  reason: collision with root package name */
    public boolean f18290n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18291o;

    /* renamed from: p  reason: collision with root package name */
    public int f18292p;

    /* renamed from: q  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.i f18293q;

    /* renamed from: r  reason: collision with root package name */
    public int f18294r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f18295s;

    /* renamed from: t  reason: collision with root package name */
    public s f18296t;

    /* renamed from: u  reason: collision with root package name */
    public int f18297u;

    /* renamed from: v  reason: collision with root package name */
    public boolean[] f18298v;

    /* renamed from: w  reason: collision with root package name */
    public long f18299w;

    /* renamed from: x  reason: collision with root package name */
    public long f18300x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f18301y;

    /* renamed from: g  reason: collision with root package name */
    public final x f18283g = new x("Loader:HlsSampleStreamWrapper");

    /* renamed from: i  reason: collision with root package name */
    public final c.b f18285i = new c.b();

    /* renamed from: j  reason: collision with root package name */
    public final SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> f18286j = new SparseArray<>();

    /* renamed from: k  reason: collision with root package name */
    public final LinkedList<f> f18287k = new LinkedList<>();

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f18288l = new a();

    /* renamed from: m  reason: collision with root package name */
    public final Handler f18289m = new Handler();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.i();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public j(int i10, b bVar, c cVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2, long j10, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i11, f.a aVar) {
        this.f18277a = i10;
        this.f18278b = bVar;
        this.f18279c = cVar;
        this.f18280d = bVar2;
        this.f18281e = iVar;
        this.f18282f = i11;
        this.f18284h = aVar;
        this.f18299w = j10;
        this.f18300x = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.h
    public void a(m mVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar, long j10, long j11, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar2 = aVar;
        f.a aVar3 = this.f18284h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar = aVar2.f19243a;
        int i10 = aVar2.f19244b;
        int i11 = this.f18277a;
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar = aVar2.f19245c;
        int i12 = aVar2.f19246d;
        Object obj = aVar2.f19247e;
        long j12 = aVar2.f19248f;
        long j13 = aVar2.f19249g;
        long c10 = aVar2.c();
        if (aVar3.f19264b != null) {
            aVar3.f19263a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(aVar3, jVar, i10, i11, iVar, i12, obj, j12, j13, j10, j11, c10));
        }
        if (z10) {
            return;
        }
        int size = this.f18286j.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f18286j.valueAt(i13).a(this.f18298v[i13]);
        }
        ((g) this.f18278b).a(this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.h
    public void c() {
        this.f18290n = true;
        this.f18289m.post(this.f18288l);
    }

    public void d(long j10) {
        this.f18299w = j10;
        this.f18300x = j10;
        this.f18301y = false;
        this.f18287k.clear();
        if (this.f18283g.b()) {
            this.f18283g.a();
            return;
        }
        int size = this.f18286j.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18286j.valueAt(i10).a(this.f18298v[i10]);
        }
    }

    public void g() {
        if (this.f18291o) {
            return;
        }
        a(this.f18299w);
    }

    public final boolean h() {
        return this.f18300x != -9223372036854775807L;
    }

    public final void i() {
        j[] jVarArr;
        if (this.f18295s || this.f18291o || !this.f18290n) {
            return;
        }
        int size = this.f18286j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f18286j.valueAt(i10).e() == null) {
                return;
            }
        }
        int size2 = this.f18286j.size();
        int i11 = 0;
        char c10 = 0;
        int i12 = -1;
        while (true) {
            char c11 = 3;
            if (i11 >= size2) {
                break;
            }
            String str = this.f18286j.valueAt(i11).e().f19119f;
            if (!com.fyber.inneractive.sdk.player.exoplayer2.util.h.e(str)) {
                if (com.fyber.inneractive.sdk.player.exoplayer2.util.h.d(str)) {
                    c11 = 2;
                } else {
                    c11 = "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.h.b(str)) ? (char) 1 : (char) 0;
                }
            }
            if (c11 > c10) {
                i12 = i11;
                c10 = c11;
            } else if (c11 == c10 && i12 != -1) {
                i12 = -1;
            }
            i11++;
        }
        r rVar = this.f18279c.f18220f;
        int i13 = rVar.f19329a;
        this.f18297u = -1;
        this.f18298v = new boolean[size2];
        r[] rVarArr = new r[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            com.fyber.inneractive.sdk.player.exoplayer2.i e10 = this.f18286j.valueAt(i14).e();
            if (i14 == i12) {
                com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.i[i13];
                for (int i15 = 0; i15 < i13; i15++) {
                    iVarArr[i15] = a(rVar.f19330b[i15], e10);
                }
                rVarArr[i14] = new r(iVarArr);
                this.f18297u = i14;
            } else {
                rVarArr[i14] = new r(a((c10 == 3 && com.fyber.inneractive.sdk.player.exoplayer2.util.h.d(e10.f19119f)) ? this.f18281e : null, e10));
            }
        }
        this.f18296t = new s(rVarArr);
        this.f18291o = true;
        g gVar = (g) this.f18278b;
        int i16 = gVar.f18264k - 1;
        gVar.f18264k = i16;
        if (i16 > 0) {
            return;
        }
        int i17 = 0;
        for (j jVar : gVar.f18267n) {
            i17 += jVar.f18296t.f19333a;
        }
        r[] rVarArr2 = new r[i17];
        int i18 = 0;
        for (j jVar2 : gVar.f18267n) {
            int i19 = jVar2.f18296t.f19333a;
            int i20 = 0;
            while (i20 < i19) {
                rVarArr2[i18] = jVar2.f18296t.f19334b[i20];
                i20++;
                i18++;
            }
        }
        gVar.f18266m = new s(rVarArr2);
        ((com.fyber.inneractive.sdk.player.exoplayer2.h) gVar.f18263j).f19063f.obtainMessage(8, gVar).sendToTarget();
    }

    public void j() throws IOException {
        this.f18283g.c();
        c cVar = this.f18279c;
        IOException iOException = cVar.f18224j;
        if (iOException == null) {
            a.C0250a c0250a = cVar.f18225k;
            if (c0250a != null) {
                e.a aVar = cVar.f18219e.f18372e.get(c0250a);
                aVar.f18383b.c();
                IOException iOException2 = aVar.f18391j;
                if (iOException2 != null) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar, long j10, long j11) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar2 = aVar;
        c cVar = this.f18279c;
        cVar.getClass();
        if (aVar2 instanceof c.a) {
            c.a aVar3 = (c.a) aVar2;
            cVar.f18223i = aVar3.f19251i;
            cVar.a(aVar3.f19243a.f19462a, aVar3.f18231l, aVar3.f18232m);
        }
        f.a aVar4 = this.f18284h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar = aVar2.f19243a;
        int i10 = aVar2.f19244b;
        int i11 = this.f18277a;
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar = aVar2.f19245c;
        int i12 = aVar2.f19246d;
        Object obj = aVar2.f19247e;
        long j12 = aVar2.f19248f;
        long j13 = aVar2.f19249g;
        long c10 = aVar2.c();
        if (aVar4.f19264b != null) {
            aVar4.f19263a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(aVar4, jVar, i10, i11, iVar, i12, obj, j12, j13, j10, j11, c10));
        }
        if (!this.f18291o) {
            a(this.f18299w);
        } else {
            ((g) this.f18278b).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[ORIG_RETURN, RETURN] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r30, long r31, long r33, java.io.IOException r35) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) r1
            long r2 = r1.c()
            boolean r4 = r1 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f
            r5 = 1
            if (r4 == 0) goto L18
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L18
        L16:
            r2 = 0
            goto L19
        L18:
            r2 = 1
        L19:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c r3 = r0.f18279c
            r3.getClass()
            if (r2 == 0) goto L3b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r2 = r3.f18230p
            com.fyber.inneractive.sdk.player.exoplayer2.source.r r3 = r3.f18220f
            com.fyber.inneractive.sdk.player.exoplayer2.i r7 = r1.f19245c
            int r3 = r3.a(r7)
            int r3 = r2.c(r3)
            r7 = 60000(0xea60, double:2.9644E-319)
            r15 = r35
            boolean r2 = com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b.a(r2, r3, r15, r7)
            if (r2 == 0) goto L3d
            r2 = 1
            goto L3e
        L3b:
            r15 = r35
        L3d:
            r2 = 0
        L3e:
            if (r2 == 0) goto L5f
            if (r4 == 0) goto L60
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.f18287k
            java.lang.Object r2 = r2.removeLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f) r2
            if (r2 != r1) goto L4e
            r2 = 1
            goto L4f
        L4e:
            r2 = 0
        L4f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(r2)
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.f18287k
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L60
            long r2 = r0.f18299w
            r0.f18300x = r2
            goto L60
        L5f:
            r5 = 0
        L60:
            com.fyber.inneractive.sdk.player.exoplayer2.source.f$a r10 = r0.f18284h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r11 = r1.f19243a
            int r12 = r1.f19244b
            int r13 = r0.f18277a
            com.fyber.inneractive.sdk.player.exoplayer2.i r14 = r1.f19245c
            int r2 = r1.f19246d
            java.lang.Object r3 = r1.f19247e
            long r7 = r1.f19248f
            r17 = r7
            long r6 = r1.f19249g
            long r25 = r1.c()
            com.fyber.inneractive.sdk.player.exoplayer2.source.f r1 = r10.f19264b
            if (r1 == 0) goto L94
            android.os.Handler r1 = r10.f19263a
            com.fyber.inneractive.sdk.player.exoplayer2.source.d r4 = new com.fyber.inneractive.sdk.player.exoplayer2.source.d
            r9 = r4
            r15 = r2
            r16 = r3
            r19 = r6
            r21 = r31
            r23 = r33
            r27 = r35
            r28 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27, r28)
            r1.post(r4)
        L94:
            if (r5 == 0) goto La9
            boolean r1 = r0.f18291o
            if (r1 != 0) goto La0
            long r1 = r0.f18299w
            r0.a(r1)
            goto La7
        La0:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b r1 = r0.f18278b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g) r1
            r1.a(r0)
        La7:
            r6 = 2
            goto Laa
        La9:
            r6 = 0
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$c, long, long, java.io.IOException):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.h
    public /* bridge */ /* synthetic */ n a(int i10, int i11) {
        return a(i10);
    }

    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] eVarArr, boolean[] zArr, o[] oVarArr, boolean[] zArr2, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f18291o);
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            if (oVarArr[i10] != null && (eVarArr[i10] == null || !zArr[i10])) {
                int i11 = ((i) oVarArr[i10]).f18275a;
                a(i11, false);
                this.f18286j.valueAt(i11).b();
                oVarArr[i10] = null;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            if (oVarArr[i12] == null && eVarArr[i12] != null) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar2 = eVarArr[i12];
                int a10 = this.f18296t.a(eVar2.b());
                a(a10, true);
                if (a10 == this.f18297u) {
                    this.f18279c.f18230p = eVar2;
                    eVar = eVar2;
                }
                oVarArr[i12] = new i(this, a10);
                zArr2[i12] = true;
                z11 = true;
            }
        }
        if (z10) {
            int size = this.f18286j.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (!this.f18298v[i13]) {
                    this.f18286j.valueAt(i13).b();
                }
            }
            if (eVar != null && !this.f18287k.isEmpty()) {
                eVar.a(0L);
                if (eVar.a() != this.f18279c.f18220f.a(this.f18287k.getLast().f19245c)) {
                    d(this.f18299w);
                }
            }
        }
        if (this.f18292p == 0) {
            this.f18279c.f18224j = null;
            this.f18293q = null;
            this.f18287k.clear();
            if (this.f18283g.b()) {
                this.f18283g.a();
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(long r37) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j.a(long):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public long a() {
        if (h()) {
            return this.f18300x;
        }
        if (this.f18301y) {
            return Long.MIN_VALUE;
        }
        return this.f18287k.getLast().f19249g;
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.d a(int i10) {
        if (this.f18286j.indexOfKey(i10) >= 0) {
            return this.f18286j.get(i10);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.d dVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.d(this.f18280d);
        dVar.f18162n = this;
        dVar.f18151c.f18184r = this.f18294r;
        this.f18286j.put(i10, dVar);
        return dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.d.InterfaceC0248d
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
        this.f18289m.post(this.f18288l);
    }

    public final void a(int i10, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f18298v[i10] != z10);
        this.f18298v[i10] = z10;
        this.f18292p += z10 ? 1 : -1;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.i a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar, com.fyber.inneractive.sdk.player.exoplayer2.i iVar2) {
        if (iVar == null) {
            return iVar2;
        }
        String str = null;
        int c10 = com.fyber.inneractive.sdk.player.exoplayer2.util.h.c(iVar2.f19119f);
        if (c10 == 1) {
            str = a(iVar.f19116c, 1);
        } else if (c10 == 2) {
            str = a(iVar.f19116c, 2);
        }
        String str2 = str;
        return new com.fyber.inneractive.sdk.player.exoplayer2.i(iVar.f19114a, iVar2.f19118e, iVar2.f19119f, str2, iVar.f19115b, iVar2.f19120g, iVar.f19123j, iVar.f19124k, iVar2.f19125l, iVar2.f19126m, iVar2.f19127n, iVar2.f19129p, iVar2.f19128o, iVar2.f19130q, iVar2.f19131r, iVar2.f19132s, iVar2.f19133t, iVar2.f19134u, iVar2.f19135v, iVar.f19137x, iVar.f19138y, iVar2.f19139z, iVar2.f19136w, iVar2.f19121h, iVar2.f19122i, iVar2.f19117d);
    }

    public static String a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : split) {
            if (i10 == com.fyber.inneractive.sdk.player.exoplayer2.util.h.c(com.fyber.inneractive.sdk.player.exoplayer2.util.h.a(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }
}
