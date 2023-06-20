package i9;

import i9.u;
import j8.j3;
import j8.x1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MergingMediaSource.java */
/* loaded from: classes2.dex */
public final class d0 extends f<Integer> {

    /* renamed from: v  reason: collision with root package name */
    private static final x1 f31594v = new x1.c().c("MergingMediaSource").a();

    /* renamed from: k  reason: collision with root package name */
    private final boolean f31595k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f31596l;

    /* renamed from: m  reason: collision with root package name */
    private final u[] f31597m;

    /* renamed from: n  reason: collision with root package name */
    private final j3[] f31598n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList<u> f31599o;

    /* renamed from: p  reason: collision with root package name */
    private final h f31600p;

    /* renamed from: q  reason: collision with root package name */
    private final Map<Object, Long> f31601q;

    /* renamed from: r  reason: collision with root package name */
    private final jb.b0<Object, d> f31602r;

    /* renamed from: s  reason: collision with root package name */
    private int f31603s;

    /* renamed from: t  reason: collision with root package name */
    private long[][] f31604t;

    /* renamed from: u  reason: collision with root package name */
    private b f31605u;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MergingMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends l {

        /* renamed from: c  reason: collision with root package name */
        private final long[] f31606c;

        /* renamed from: d  reason: collision with root package name */
        private final long[] f31607d;

        public a(j3 j3Var, Map<Object, Long> map) {
            super(j3Var);
            int p10 = j3Var.p();
            this.f31607d = new long[j3Var.p()];
            j3.c cVar = new j3.c();
            for (int i10 = 0; i10 < p10; i10++) {
                this.f31607d[i10] = j3Var.n(i10, cVar).f32532n;
            }
            int i11 = j3Var.i();
            this.f31606c = new long[i11];
            j3.b bVar = new j3.b();
            for (int i12 = 0; i12 < i11; i12++) {
                j3Var.g(i12, bVar, true);
                long longValue = ((Long) ea.a.e(map.get(bVar.f32509b))).longValue();
                long[] jArr = this.f31606c;
                jArr[i12] = longValue == Long.MIN_VALUE ? bVar.f32511d : longValue;
                long j10 = bVar.f32511d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f31607d;
                    int i13 = bVar.f32510c;
                    jArr2[i13] = jArr2[i13] - (j10 - jArr[i12]);
                }
            }
        }

        @Override // i9.l, j8.j3
        public j3.b g(int i10, j3.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f32511d = this.f31606c[i10];
            return bVar;
        }

        @Override // i9.l, j8.j3
        public j3.c o(int i10, j3.c cVar, long j10) {
            long j11;
            super.o(i10, cVar, j10);
            long j12 = this.f31607d[i10];
            cVar.f32532n = j12;
            if (j12 != -9223372036854775807L) {
                long j13 = cVar.f32531m;
                if (j13 != -9223372036854775807L) {
                    j11 = Math.min(j13, j12);
                    cVar.f32531m = j11;
                    return cVar;
                }
            }
            j11 = cVar.f32531m;
            cVar.f32531m = j11;
            return cVar;
        }
    }

    /* compiled from: MergingMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b extends IOException {
        public b(int i10) {
        }
    }

    public d0(u... uVarArr) {
        this(false, uVarArr);
    }

    private void M() {
        j3.b bVar = new j3.b();
        for (int i10 = 0; i10 < this.f31603s; i10++) {
            long j10 = -this.f31598n[0].f(i10, bVar).p();
            int i11 = 1;
            while (true) {
                j3[] j3VarArr = this.f31598n;
                if (i11 < j3VarArr.length) {
                    this.f31604t[i10][i11] = j10 - (-j3VarArr[i11].f(i10, bVar).p());
                    i11++;
                }
            }
        }
    }

    private void P() {
        j3[] j3VarArr;
        j3.b bVar = new j3.b();
        for (int i10 = 0; i10 < this.f31603s; i10++) {
            long j10 = Long.MIN_VALUE;
            int i11 = 0;
            while (true) {
                j3VarArr = this.f31598n;
                if (i11 >= j3VarArr.length) {
                    break;
                }
                long l10 = j3VarArr[i11].f(i10, bVar).l();
                if (l10 != -9223372036854775807L) {
                    long j11 = l10 + this.f31604t[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object m10 = j3VarArr[0].m(i10);
            this.f31601q.put(m10, Long.valueOf(j10));
            for (d dVar : this.f31602r.get(m10)) {
                dVar.s(0L, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i9.f, i9.a
    public void C(da.m0 m0Var) {
        super.C(m0Var);
        for (int i10 = 0; i10 < this.f31597m.length; i10++) {
            L(Integer.valueOf(i10), this.f31597m[i10]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i9.f, i9.a
    public void E() {
        super.E();
        Arrays.fill(this.f31598n, (Object) null);
        this.f31603s = -1;
        this.f31605u = null;
        this.f31599o.clear();
        Collections.addAll(this.f31599o, this.f31597m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i9.f
    /* renamed from: N */
    public u.b G(Integer num, u.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i9.f
    /* renamed from: O */
    public void K(Integer num, u uVar, j3 j3Var) {
        if (this.f31605u != null) {
            return;
        }
        if (this.f31603s == -1) {
            this.f31603s = j3Var.i();
        } else if (j3Var.i() != this.f31603s) {
            this.f31605u = new b(0);
            return;
        }
        if (this.f31604t.length == 0) {
            this.f31604t = (long[][]) Array.newInstance(long.class, this.f31603s, this.f31598n.length);
        }
        this.f31599o.remove(uVar);
        this.f31598n[num.intValue()] = j3Var;
        if (this.f31599o.isEmpty()) {
            if (this.f31595k) {
                M();
            }
            a aVar = this.f31598n[0];
            if (this.f31596l) {
                P();
                aVar = new a(aVar, this.f31601q);
            }
            D(aVar);
        }
    }

    @Override // i9.u
    public x1 d() {
        u[] uVarArr = this.f31597m;
        return uVarArr.length > 0 ? uVarArr[0].d() : f31594v;
    }

    @Override // i9.u
    public r f(u.b bVar, da.b bVar2, long j10) {
        int length = this.f31597m.length;
        r[] rVarArr = new r[length];
        int b10 = this.f31598n[0].b(bVar.f31793a);
        for (int i10 = 0; i10 < length; i10++) {
            rVarArr[i10] = this.f31597m[i10].f(bVar.c(this.f31598n[i10].m(b10)), bVar2, j10 - this.f31604t[b10][i10]);
        }
        c0 c0Var = new c0(this.f31600p, this.f31604t[b10], rVarArr);
        if (this.f31596l) {
            d dVar = new d(c0Var, true, 0L, ((Long) ea.a.e(this.f31601q.get(bVar.f31793a))).longValue());
            this.f31602r.put(bVar.f31793a, dVar);
            return dVar;
        }
        return c0Var;
    }

    @Override // i9.u
    public void i(r rVar) {
        if (this.f31596l) {
            d dVar = (d) rVar;
            Iterator<Map.Entry<Object, d>> it = this.f31602r.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, d> next = it.next();
                if (next.getValue().equals(dVar)) {
                    this.f31602r.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            rVar = dVar.f31585a;
        }
        c0 c0Var = (c0) rVar;
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f31597m;
            if (i10 >= uVarArr.length) {
                return;
            }
            uVarArr[i10].i(c0Var.a(i10));
            i10++;
        }
    }

    @Override // i9.f, i9.u
    public void p() throws IOException {
        b bVar = this.f31605u;
        if (bVar == null) {
            super.p();
            return;
        }
        throw bVar;
    }

    public d0(boolean z10, u... uVarArr) {
        this(z10, false, uVarArr);
    }

    public d0(boolean z10, boolean z11, u... uVarArr) {
        this(z10, z11, new i(), uVarArr);
    }

    public d0(boolean z10, boolean z11, h hVar, u... uVarArr) {
        this.f31595k = z10;
        this.f31596l = z11;
        this.f31597m = uVarArr;
        this.f31600p = hVar;
        this.f31599o = new ArrayList<>(Arrays.asList(uVarArr));
        this.f31603s = -1;
        this.f31598n = new j3[uVarArr.length];
        this.f31604t = new long[0];
        this.f31601q = new HashMap();
        this.f31602r = jb.c0.a().a().e();
    }
}
