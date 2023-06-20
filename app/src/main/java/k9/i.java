package k9;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.k;
import da.d0;
import da.e0;
import i9.b0;
import i9.n0;
import i9.o0;
import i9.p0;
import j8.b3;
import j8.p1;
import j8.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k9.j;

/* compiled from: ChunkSampleStream.java */
/* loaded from: classes2.dex */
public class i<T extends j> implements o0, p0, e0.b<f>, e0.f {

    /* renamed from: a  reason: collision with root package name */
    public final int f33396a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f33397b;

    /* renamed from: c  reason: collision with root package name */
    private final p1[] f33398c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f33399d;

    /* renamed from: e  reason: collision with root package name */
    private final T f33400e;

    /* renamed from: f  reason: collision with root package name */
    private final p0.a<i<T>> f33401f;

    /* renamed from: g  reason: collision with root package name */
    private final b0.a f33402g;

    /* renamed from: h  reason: collision with root package name */
    private final d0 f33403h;

    /* renamed from: i  reason: collision with root package name */
    private final e0 f33404i;

    /* renamed from: j  reason: collision with root package name */
    private final h f33405j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<k9.a> f33406k;

    /* renamed from: l  reason: collision with root package name */
    private final List<k9.a> f33407l;

    /* renamed from: m  reason: collision with root package name */
    private final n0 f33408m;

    /* renamed from: n  reason: collision with root package name */
    private final n0[] f33409n;

    /* renamed from: o  reason: collision with root package name */
    private final c f33410o;

    /* renamed from: p  reason: collision with root package name */
    private f f33411p;

    /* renamed from: q  reason: collision with root package name */
    private p1 f33412q;

    /* renamed from: r  reason: collision with root package name */
    private b<T> f33413r;

    /* renamed from: s  reason: collision with root package name */
    private long f33414s;

    /* renamed from: t  reason: collision with root package name */
    private long f33415t;

    /* renamed from: u  reason: collision with root package name */
    private int f33416u;

    /* renamed from: v  reason: collision with root package name */
    private k9.a f33417v;

    /* renamed from: w  reason: collision with root package name */
    boolean f33418w;

    /* compiled from: ChunkSampleStream.java */
    /* loaded from: classes2.dex */
    public final class a implements o0 {

        /* renamed from: a  reason: collision with root package name */
        public final i<T> f33419a;

        /* renamed from: b  reason: collision with root package name */
        private final n0 f33420b;

        /* renamed from: c  reason: collision with root package name */
        private final int f33421c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f33422d;

        public a(i<T> iVar, n0 n0Var, int i10) {
            this.f33419a = iVar;
            this.f33420b = n0Var;
            this.f33421c = i10;
        }

        private void b() {
            if (this.f33422d) {
                return;
            }
            i.this.f33402g.i(i.this.f33397b[this.f33421c], i.this.f33398c[this.f33421c], 0, null, i.this.f33415t);
            this.f33422d = true;
        }

        @Override // i9.o0
        public void a() {
        }

        public void c() {
            ea.a.f(i.this.f33399d[this.f33421c]);
            i.this.f33399d[this.f33421c] = false;
        }

        @Override // i9.o0
        public int f(q1 q1Var, m8.g gVar, int i10) {
            if (i.this.H()) {
                return -3;
            }
            if (i.this.f33417v == null || i.this.f33417v.h(this.f33421c + 1) > this.f33420b.C()) {
                b();
                return this.f33420b.S(q1Var, gVar, i10, i.this.f33418w);
            }
            return -3;
        }

        @Override // i9.o0
        public boolean isReady() {
            return !i.this.H() && this.f33420b.K(i.this.f33418w);
        }

        @Override // i9.o0
        public int n(long j10) {
            if (i.this.H()) {
                return 0;
            }
            int E = this.f33420b.E(j10, i.this.f33418w);
            if (i.this.f33417v != null) {
                E = Math.min(E, i.this.f33417v.h(this.f33421c + 1) - this.f33420b.C());
            }
            this.f33420b.e0(E);
            if (E > 0) {
                b();
            }
            return E;
        }
    }

    /* compiled from: ChunkSampleStream.java */
    /* loaded from: classes2.dex */
    public interface b<T extends j> {
        void a(i<T> iVar);
    }

    public i(int i10, int[] iArr, Format[] formatArr, T t10, p0.a<i<T>> aVar, da.b bVar, long j10, com.google.android.exoplayer2.drm.l lVar, k.a aVar2, d0 d0Var, b0.a aVar3) {
        this.f33396a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f33397b = iArr;
        this.f33398c = formatArr == null ? new p1[0] : formatArr;
        this.f33400e = t10;
        this.f33401f = aVar;
        this.f33402g = aVar3;
        this.f33403h = d0Var;
        this.f33404i = new e0("ChunkSampleStream");
        this.f33405j = new h();
        ArrayList<k9.a> arrayList = new ArrayList<>();
        this.f33406k = arrayList;
        this.f33407l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f33409n = new n0[length];
        this.f33399d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        n0[] n0VarArr = new n0[i12];
        n0 k10 = n0.k(bVar, lVar, aVar2);
        this.f33408m = k10;
        iArr2[0] = i10;
        n0VarArr[0] = k10;
        while (i11 < length) {
            n0 l10 = n0.l(bVar);
            this.f33409n[i11] = l10;
            int i13 = i11 + 1;
            n0VarArr[i13] = l10;
            iArr2[i13] = this.f33397b[i11];
            i11 = i13;
        }
        this.f33410o = new c(iArr2, n0VarArr);
        this.f33414s = j10;
        this.f33415t = j10;
    }

    private void A(int i10) {
        int min = Math.min(N(i10, 0), this.f33416u);
        if (min > 0) {
            ea.n0.N0(this.f33406k, 0, min);
            this.f33416u -= min;
        }
    }

    private void B(int i10) {
        ea.a.f(!this.f33404i.j());
        int size = this.f33406k.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!F(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = E().f33392h;
        k9.a C = C(i10);
        if (this.f33406k.isEmpty()) {
            this.f33414s = this.f33415t;
        }
        this.f33418w = false;
        this.f33402g.D(this.f33396a, C.f33391g, j10);
    }

    private k9.a C(int i10) {
        k9.a aVar = this.f33406k.get(i10);
        ArrayList<k9.a> arrayList = this.f33406k;
        ea.n0.N0(arrayList, i10, arrayList.size());
        this.f33416u = Math.max(this.f33416u, this.f33406k.size());
        int i11 = 0;
        this.f33408m.u(aVar.h(0));
        while (true) {
            n0[] n0VarArr = this.f33409n;
            if (i11 >= n0VarArr.length) {
                return aVar;
            }
            n0 n0Var = n0VarArr[i11];
            i11++;
            n0Var.u(aVar.h(i11));
        }
    }

    private k9.a E() {
        ArrayList<k9.a> arrayList = this.f33406k;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean F(int i10) {
        int C;
        k9.a aVar = this.f33406k.get(i10);
        if (this.f33408m.C() > aVar.h(0)) {
            return true;
        }
        int i11 = 0;
        do {
            n0[] n0VarArr = this.f33409n;
            if (i11 >= n0VarArr.length) {
                return false;
            }
            C = n0VarArr[i11].C();
            i11++;
        } while (C <= aVar.h(i11));
        return true;
    }

    private boolean G(f fVar) {
        return fVar instanceof k9.a;
    }

    private void I() {
        int N = N(this.f33408m.C(), this.f33416u - 1);
        while (true) {
            int i10 = this.f33416u;
            if (i10 > N) {
                return;
            }
            this.f33416u = i10 + 1;
            J(i10);
        }
    }

    private void J(int i10) {
        k9.a aVar = this.f33406k.get(i10);
        p1 p1Var = aVar.f33388d;
        if (!p1Var.equals(this.f33412q)) {
            this.f33402g.i(this.f33396a, p1Var, aVar.f33389e, aVar.f33390f, aVar.f33391g);
        }
        this.f33412q = p1Var;
    }

    private int N(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f33406k.size()) {
                return this.f33406k.size() - 1;
            }
        } while (this.f33406k.get(i11).h(0) <= i10);
        return i11 - 1;
    }

    private void Q() {
        this.f33408m.V();
        for (n0 n0Var : this.f33409n) {
            n0Var.V();
        }
    }

    public T D() {
        return this.f33400e;
    }

    boolean H() {
        return this.f33414s != -9223372036854775807L;
    }

    @Override // da.e0.b
    /* renamed from: K */
    public void j(f fVar, long j10, long j11, boolean z10) {
        this.f33411p = null;
        this.f33417v = null;
        i9.n nVar = new i9.n(fVar.f33385a, fVar.f33386b, fVar.e(), fVar.d(), j10, j11, fVar.a());
        this.f33403h.d(fVar.f33385a);
        this.f33402g.r(nVar, fVar.f33387c, this.f33396a, fVar.f33388d, fVar.f33389e, fVar.f33390f, fVar.f33391g, fVar.f33392h);
        if (z10) {
            return;
        }
        if (H()) {
            Q();
        } else if (G(fVar)) {
            C(this.f33406k.size() - 1);
            if (this.f33406k.isEmpty()) {
                this.f33414s = this.f33415t;
            }
        }
        this.f33401f.m(this);
    }

    @Override // da.e0.b
    /* renamed from: L */
    public void m(f fVar, long j10, long j11) {
        this.f33411p = null;
        this.f33400e.g(fVar);
        i9.n nVar = new i9.n(fVar.f33385a, fVar.f33386b, fVar.e(), fVar.d(), j10, j11, fVar.a());
        this.f33403h.d(fVar.f33385a);
        this.f33402g.u(nVar, fVar.f33387c, this.f33396a, fVar.f33388d, fVar.f33389e, fVar.f33390f, fVar.f33391g, fVar.f33392h);
        this.f33401f.m(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    @Override // da.e0.b
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public da.e0.c s(k9.f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.i.s(k9.f, long, long, java.io.IOException, int):da.e0$c");
    }

    public void O() {
        P(null);
    }

    public void P(b<T> bVar) {
        this.f33413r = bVar;
        this.f33408m.R();
        for (n0 n0Var : this.f33409n) {
            n0Var.R();
        }
        this.f33404i.m(this);
    }

    public void R(long j10) {
        boolean Z;
        this.f33415t = j10;
        if (H()) {
            this.f33414s = j10;
            return;
        }
        k9.a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f33406k.size()) {
                break;
            }
            k9.a aVar2 = this.f33406k.get(i11);
            int i12 = (aVar2.f33391g > j10 ? 1 : (aVar2.f33391g == j10 ? 0 : -1));
            if (i12 == 0 && aVar2.f33357k == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i12 > 0) {
                break;
            } else {
                i11++;
            }
        }
        if (aVar != null) {
            Z = this.f33408m.Y(aVar.h(0));
        } else {
            Z = this.f33408m.Z(j10, j10 < b());
        }
        if (Z) {
            this.f33416u = N(this.f33408m.C(), 0);
            n0[] n0VarArr = this.f33409n;
            int length = n0VarArr.length;
            while (i10 < length) {
                n0VarArr[i10].Z(j10, true);
                i10++;
            }
            return;
        }
        this.f33414s = j10;
        this.f33418w = false;
        this.f33406k.clear();
        this.f33416u = 0;
        if (this.f33404i.j()) {
            this.f33408m.r();
            n0[] n0VarArr2 = this.f33409n;
            int length2 = n0VarArr2.length;
            while (i10 < length2) {
                n0VarArr2[i10].r();
                i10++;
            }
            this.f33404i.f();
            return;
        }
        this.f33404i.g();
        Q();
    }

    public i<T>.a S(long j10, int i10) {
        for (int i11 = 0; i11 < this.f33409n.length; i11++) {
            if (this.f33397b[i11] == i10) {
                ea.a.f(!this.f33399d[i11]);
                this.f33399d[i11] = true;
                this.f33409n[i11].Z(j10, true);
                return new a(this, this.f33409n[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // i9.o0
    public void a() throws IOException {
        this.f33404i.a();
        this.f33408m.N();
        if (this.f33404i.j()) {
            return;
        }
        this.f33400e.a();
    }

    @Override // i9.p0
    public long b() {
        if (H()) {
            return this.f33414s;
        }
        if (this.f33418w) {
            return Long.MIN_VALUE;
        }
        return E().f33392h;
    }

    @Override // i9.p0
    public boolean c() {
        return this.f33404i.j();
    }

    @Override // i9.p0
    public boolean d(long j10) {
        List<k9.a> list;
        long j11;
        if (this.f33418w || this.f33404i.j() || this.f33404i.i()) {
            return false;
        }
        boolean H = H();
        if (H) {
            list = Collections.emptyList();
            j11 = this.f33414s;
        } else {
            list = this.f33407l;
            j11 = E().f33392h;
        }
        this.f33400e.d(j10, j11, list, this.f33405j);
        h hVar = this.f33405j;
        boolean z10 = hVar.f33395b;
        f fVar = hVar.f33394a;
        hVar.a();
        if (z10) {
            this.f33414s = -9223372036854775807L;
            this.f33418w = true;
            return true;
        } else if (fVar == null) {
            return false;
        } else {
            this.f33411p = fVar;
            if (G(fVar)) {
                k9.a aVar = (k9.a) fVar;
                if (H) {
                    long j12 = aVar.f33391g;
                    long j13 = this.f33414s;
                    if (j12 != j13) {
                        this.f33408m.b0(j13);
                        for (n0 n0Var : this.f33409n) {
                            n0Var.b0(this.f33414s);
                        }
                    }
                    this.f33414s = -9223372036854775807L;
                }
                aVar.j(this.f33410o);
                this.f33406k.add(aVar);
            } else if (fVar instanceof m) {
                ((m) fVar).f(this.f33410o);
            }
            this.f33402g.A(new i9.n(fVar.f33385a, fVar.f33386b, this.f33404i.n(fVar, this, this.f33403h.c(fVar.f33387c))), fVar.f33387c, this.f33396a, fVar.f33388d, fVar.f33389e, fVar.f33390f, fVar.f33391g, fVar.f33392h);
            return true;
        }
    }

    public long e(long j10, b3 b3Var) {
        return this.f33400e.e(j10, b3Var);
    }

    @Override // i9.o0
    public int f(q1 q1Var, m8.g gVar, int i10) {
        if (H()) {
            return -3;
        }
        k9.a aVar = this.f33417v;
        if (aVar == null || aVar.h(0) > this.f33408m.C()) {
            I();
            return this.f33408m.S(q1Var, gVar, i10, this.f33418w);
        }
        return -3;
    }

    @Override // i9.p0
    public long g() {
        if (this.f33418w) {
            return Long.MIN_VALUE;
        }
        if (H()) {
            return this.f33414s;
        }
        long j10 = this.f33415t;
        k9.a E = E();
        if (!E.g()) {
            if (this.f33406k.size() > 1) {
                ArrayList<k9.a> arrayList = this.f33406k;
                E = arrayList.get(arrayList.size() - 2);
            } else {
                E = null;
            }
        }
        if (E != null) {
            j10 = Math.max(j10, E.f33392h);
        }
        return Math.max(j10, this.f33408m.z());
    }

    @Override // i9.p0
    public void h(long j10) {
        if (this.f33404i.i() || H()) {
            return;
        }
        if (this.f33404i.j()) {
            f fVar = (f) ea.a.e(this.f33411p);
            if (!(G(fVar) && F(this.f33406k.size() - 1)) && this.f33400e.f(j10, fVar, this.f33407l)) {
                this.f33404i.f();
                if (G(fVar)) {
                    this.f33417v = (k9.a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int i10 = this.f33400e.i(j10, this.f33407l);
        if (i10 < this.f33406k.size()) {
            B(i10);
        }
    }

    @Override // i9.o0
    public boolean isReady() {
        return !H() && this.f33408m.K(this.f33418w);
    }

    @Override // i9.o0
    public int n(long j10) {
        if (H()) {
            return 0;
        }
        int E = this.f33408m.E(j10, this.f33418w);
        k9.a aVar = this.f33417v;
        if (aVar != null) {
            E = Math.min(E, aVar.h(0) - this.f33408m.C());
        }
        this.f33408m.e0(E);
        I();
        return E;
    }

    @Override // da.e0.f
    public void o() {
        this.f33408m.T();
        for (n0 n0Var : this.f33409n) {
            n0Var.T();
        }
        this.f33400e.release();
        b<T> bVar = this.f33413r;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void u(long j10, boolean z10) {
        if (H()) {
            return;
        }
        int x10 = this.f33408m.x();
        this.f33408m.q(j10, z10, true);
        int x11 = this.f33408m.x();
        if (x11 > x10) {
            long y10 = this.f33408m.y();
            int i10 = 0;
            while (true) {
                n0[] n0VarArr = this.f33409n;
                if (i10 >= n0VarArr.length) {
                    break;
                }
                n0VarArr[i10].q(y10, z10, this.f33399d[i10]);
                i10++;
            }
        }
        A(x11);
    }
}
