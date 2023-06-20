package z8;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import ea.n0;
import j8.j2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p8.x;
import z8.i0;

/* compiled from: TsExtractor.java */
/* loaded from: classes2.dex */
public final class h0 implements p8.i {

    /* renamed from: a */
    private final int f40200a;

    /* renamed from: b */
    private final int f40201b;

    /* renamed from: c */
    private final List<ea.j0> f40202c;

    /* renamed from: d */
    private final ea.a0 f40203d;

    /* renamed from: e */
    private final SparseIntArray f40204e;

    /* renamed from: f */
    private final i0.c f40205f;

    /* renamed from: g */
    private final SparseArray<i0> f40206g;

    /* renamed from: h */
    private final SparseBooleanArray f40207h;

    /* renamed from: i */
    private final SparseBooleanArray f40208i;

    /* renamed from: j */
    private final f0 f40209j;

    /* renamed from: k */
    private e0 f40210k;

    /* renamed from: l */
    private p8.k f40211l;

    /* renamed from: m */
    private int f40212m;

    /* renamed from: n */
    private boolean f40213n;

    /* renamed from: o */
    private boolean f40214o;

    /* renamed from: p */
    private boolean f40215p;

    /* renamed from: q */
    private i0 f40216q;

    /* renamed from: r */
    private int f40217r;

    /* renamed from: s */
    private int f40218s;

    /* compiled from: TsExtractor.java */
    /* loaded from: classes2.dex */
    public class a implements b0 {

        /* renamed from: a */
        private final ea.z f40219a = new ea.z(new byte[4]);

        public a() {
            h0.this = r2;
        }

        @Override // z8.b0
        public void a(ea.j0 j0Var, p8.k kVar, i0.d dVar) {
        }

        @Override // z8.b0
        public void c(ea.a0 a0Var) {
            if (a0Var.D() == 0 && (a0Var.D() & 128) != 0) {
                a0Var.Q(6);
                int a10 = a0Var.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    a0Var.i(this.f40219a, 4);
                    int h10 = this.f40219a.h(16);
                    this.f40219a.r(3);
                    if (h10 == 0) {
                        this.f40219a.r(13);
                    } else {
                        int h11 = this.f40219a.h(13);
                        if (h0.this.f40206g.get(h11) == null) {
                            h0.this.f40206g.put(h11, new c0(new b(h11)));
                            h0.k(h0.this);
                        }
                    }
                }
                if (h0.this.f40200a != 2) {
                    h0.this.f40206g.remove(0);
                }
            }
        }
    }

    /* compiled from: TsExtractor.java */
    /* loaded from: classes2.dex */
    private class b implements b0 {

        /* renamed from: a */
        private final ea.z f40221a = new ea.z(new byte[5]);

        /* renamed from: b */
        private final SparseArray<i0> f40222b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f40223c = new SparseIntArray();

        /* renamed from: d */
        private final int f40224d;

        public b(int i10) {
            h0.this = r2;
            this.f40224d = i10;
        }

        private i0.b b(ea.a0 a0Var, int i10) {
            int e10 = a0Var.e();
            int i11 = i10 + e10;
            String str = null;
            ArrayList arrayList = null;
            int i12 = -1;
            while (a0Var.e() < i11) {
                int D = a0Var.D();
                int e11 = a0Var.e() + a0Var.D();
                if (e11 > i11) {
                    break;
                }
                if (D == 5) {
                    long F = a0Var.F();
                    if (F != 1094921523) {
                        if (F != 1161904947) {
                            if (F != 1094921524) {
                                if (F == 1212503619) {
                                    i12 = 36;
                                }
                            }
                            i12 = 172;
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                } else {
                    if (D != 106) {
                        if (D != 122) {
                            if (D == 127) {
                                if (a0Var.D() != 21) {
                                }
                                i12 = 172;
                            } else if (D == 123) {
                                i12 = 138;
                            } else if (D == 10) {
                                str = a0Var.A(3).trim();
                            } else if (D == 89) {
                                arrayList = new ArrayList();
                                while (a0Var.e() < e11) {
                                    String trim = a0Var.A(3).trim();
                                    int D2 = a0Var.D();
                                    byte[] bArr = new byte[4];
                                    a0Var.j(bArr, 0, 4);
                                    arrayList.add(new i0.a(trim, D2, bArr));
                                }
                                i12 = 89;
                            } else if (D == 111) {
                                i12 = 257;
                            }
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                }
                a0Var.Q(e11 - a0Var.e());
            }
            a0Var.P(i11);
            return new i0.b(i12, str, arrayList, Arrays.copyOfRange(a0Var.d(), e10, i11));
        }

        @Override // z8.b0
        public void a(ea.j0 j0Var, p8.k kVar, i0.d dVar) {
        }

        @Override // z8.b0
        public void c(ea.a0 a0Var) {
            ea.j0 j0Var;
            if (a0Var.D() != 2) {
                return;
            }
            if (h0.this.f40200a == 1 || h0.this.f40200a == 2 || h0.this.f40212m == 1) {
                j0Var = (ea.j0) h0.this.f40202c.get(0);
            } else {
                j0Var = new ea.j0(((ea.j0) h0.this.f40202c.get(0)).c());
                h0.this.f40202c.add(j0Var);
            }
            if ((a0Var.D() & 128) == 0) {
                return;
            }
            a0Var.Q(1);
            int J = a0Var.J();
            int i10 = 3;
            a0Var.Q(3);
            a0Var.i(this.f40221a, 2);
            this.f40221a.r(3);
            int i11 = 13;
            h0.this.f40218s = this.f40221a.h(13);
            a0Var.i(this.f40221a, 2);
            int i12 = 4;
            this.f40221a.r(4);
            a0Var.Q(this.f40221a.h(12));
            if (h0.this.f40200a == 2 && h0.this.f40216q == null) {
                i0.b bVar = new i0.b(21, null, null, n0.f29714f);
                h0 h0Var = h0.this;
                h0Var.f40216q = h0Var.f40205f.b(21, bVar);
                if (h0.this.f40216q != null) {
                    h0.this.f40216q.a(j0Var, h0.this.f40211l, new i0.d(J, 21, Constants.BUFFER_SIZE));
                }
            }
            this.f40222b.clear();
            this.f40223c.clear();
            int a10 = a0Var.a();
            while (a10 > 0) {
                a0Var.i(this.f40221a, 5);
                int h10 = this.f40221a.h(8);
                this.f40221a.r(i10);
                int h11 = this.f40221a.h(i11);
                this.f40221a.r(i12);
                int h12 = this.f40221a.h(12);
                i0.b b10 = b(a0Var, h12);
                if (h10 == 6 || h10 == 5) {
                    h10 = b10.f40250a;
                }
                a10 -= h12 + 5;
                int i13 = h0.this.f40200a == 2 ? h10 : h11;
                if (!h0.this.f40207h.get(i13)) {
                    i0 b11 = (h0.this.f40200a == 2 && h10 == 21) ? h0.this.f40216q : h0.this.f40205f.b(h10, b10);
                    if (h0.this.f40200a != 2 || h11 < this.f40223c.get(i13, Constants.BUFFER_SIZE)) {
                        this.f40223c.put(i13, h11);
                        this.f40222b.put(i13, b11);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f40223c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = this.f40223c.keyAt(i14);
                int valueAt = this.f40223c.valueAt(i14);
                h0.this.f40207h.put(keyAt, true);
                h0.this.f40208i.put(valueAt, true);
                i0 valueAt2 = this.f40222b.valueAt(i14);
                if (valueAt2 != null) {
                    if (valueAt2 != h0.this.f40216q) {
                        valueAt2.a(j0Var, h0.this.f40211l, new i0.d(J, keyAt, Constants.BUFFER_SIZE));
                    }
                    h0.this.f40206g.put(valueAt, valueAt2);
                }
            }
            if (h0.this.f40200a == 2) {
                if (h0.this.f40213n) {
                    return;
                }
                h0.this.f40211l.r();
                h0.this.f40212m = 0;
                h0.this.f40213n = true;
                return;
            }
            h0.this.f40206g.remove(this.f40224d);
            h0 h0Var2 = h0.this;
            h0Var2.f40212m = h0Var2.f40200a == 1 ? 0 : h0.this.f40212m - 1;
            if (h0.this.f40212m == 0) {
                h0.this.f40211l.r();
                h0.this.f40213n = true;
            }
        }
    }

    static {
        g0 g0Var = new p8.n() { // from class: z8.g0
            @Override // p8.n
            public /* synthetic */ p8.i[] a(Uri uri, Map map) {
                return p8.m.a(this, uri, map);
            }

            @Override // p8.n
            public final p8.i[] b() {
                return h0.b();
            }
        };
    }

    public h0() {
        this(0);
    }

    public static /* synthetic */ p8.i[] b() {
        return w();
    }

    static /* synthetic */ int k(h0 h0Var) {
        int i10 = h0Var.f40212m;
        h0Var.f40212m = i10 + 1;
        return i10;
    }

    private boolean u(p8.j jVar) throws IOException {
        byte[] d10 = this.f40203d.d();
        if (9400 - this.f40203d.e() < 188) {
            int a10 = this.f40203d.a();
            if (a10 > 0) {
                System.arraycopy(d10, this.f40203d.e(), d10, 0, a10);
            }
            this.f40203d.N(d10, a10);
        }
        while (this.f40203d.a() < 188) {
            int f10 = this.f40203d.f();
            int c10 = jVar.c(d10, f10, 9400 - f10);
            if (c10 == -1) {
                return false;
            }
            this.f40203d.O(f10 + c10);
        }
        return true;
    }

    private int v() throws j2 {
        int e10 = this.f40203d.e();
        int f10 = this.f40203d.f();
        int a10 = j0.a(this.f40203d.d(), e10, f10);
        this.f40203d.P(a10);
        int i10 = a10 + 188;
        if (i10 > f10) {
            int i11 = this.f40217r + (a10 - e10);
            this.f40217r = i11;
            if (this.f40200a == 2 && i11 > 376) {
                throw j2.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f40217r = 0;
        }
        return i10;
    }

    public static /* synthetic */ p8.i[] w() {
        return new p8.i[]{new h0()};
    }

    private void x(long j10) {
        if (this.f40214o) {
            return;
        }
        this.f40214o = true;
        if (this.f40209j.b() != -9223372036854775807L) {
            e0 e0Var = new e0(this.f40209j.c(), this.f40209j.b(), j10, this.f40218s, this.f40201b);
            this.f40210k = e0Var;
            this.f40211l.n(e0Var.b());
            return;
        }
        this.f40211l.n(new x.b(this.f40209j.b()));
    }

    private void y() {
        this.f40207h.clear();
        this.f40206g.clear();
        SparseArray<i0> a10 = this.f40205f.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f40206g.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f40206g.put(0, new c0(new a()));
        this.f40216q = null;
    }

    private boolean z(int i10) {
        return this.f40200a == 2 || this.f40213n || !this.f40208i.get(i10, false);
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        e0 e0Var;
        ea.a.f(this.f40200a != 2);
        int size = this.f40202c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ea.j0 j0Var = this.f40202c.get(i10);
            boolean z10 = j0Var.e() == -9223372036854775807L;
            if (!z10) {
                long c10 = j0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                j0Var.g(j11);
            }
        }
        if (j11 != 0 && (e0Var = this.f40210k) != null) {
            e0Var.h(j11);
        }
        this.f40203d.L(0);
        this.f40204e.clear();
        for (int i11 = 0; i11 < this.f40206g.size(); i11++) {
            this.f40206g.valueAt(i11).b();
        }
        this.f40217r = 0;
    }

    @Override // p8.i
    public void c(p8.k kVar) {
        this.f40211l = kVar;
    }

    @Override // p8.i
    public int g(p8.j jVar, p8.w wVar) throws IOException {
        long b10 = jVar.b();
        if (this.f40213n) {
            if (((b10 == -1 || this.f40200a == 2) ? false : true) && !this.f40209j.d()) {
                return this.f40209j.e(jVar, wVar, this.f40218s);
            }
            x(b10);
            if (this.f40215p) {
                this.f40215p = false;
                a(0L, 0L);
                if (jVar.getPosition() != 0) {
                    wVar.f35701a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f40210k;
            if (e0Var != null && e0Var.d()) {
                return this.f40210k.c(jVar, wVar);
            }
        }
        if (u(jVar)) {
            int v10 = v();
            int f10 = this.f40203d.f();
            if (v10 > f10) {
                return 0;
            }
            int n10 = this.f40203d.n();
            if ((8388608 & n10) != 0) {
                this.f40203d.P(v10);
                return 0;
            }
            int i10 = ((4194304 & n10) != 0 ? 1 : 0) | 0;
            int i11 = (2096896 & n10) >> 8;
            boolean z10 = (n10 & 32) != 0;
            i0 i0Var = (n10 & 16) != 0 ? this.f40206g.get(i11) : null;
            if (i0Var == null) {
                this.f40203d.P(v10);
                return 0;
            }
            if (this.f40200a != 2) {
                int i12 = n10 & 15;
                int i13 = this.f40204e.get(i11, i12 - 1);
                this.f40204e.put(i11, i12);
                if (i13 == i12) {
                    this.f40203d.P(v10);
                    return 0;
                } else if (i12 != ((i13 + 1) & 15)) {
                    i0Var.b();
                }
            }
            if (z10) {
                int D = this.f40203d.D();
                i10 |= (this.f40203d.D() & 64) != 0 ? 2 : 0;
                this.f40203d.Q(D - 1);
            }
            boolean z11 = this.f40213n;
            if (z(i11)) {
                this.f40203d.O(v10);
                i0Var.c(this.f40203d, i10);
                this.f40203d.O(f10);
            }
            if (this.f40200a != 2 && !z11 && this.f40213n && b10 != -1) {
                this.f40215p = true;
            }
            this.f40203d.P(v10);
            return 0;
        }
        return -1;
    }

    @Override // p8.i
    public boolean h(p8.j jVar) throws IOException {
        boolean z10;
        byte[] d10 = this.f40203d.d();
        jVar.p(d10, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (d10[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                jVar.m(i10);
                return true;
            }
        }
        return false;
    }

    @Override // p8.i
    public void release() {
    }

    public h0(int i10) {
        this(1, i10, 112800);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new ea.j0(0L), new j(i11), i12);
    }

    public h0(int i10, ea.j0 j0Var, i0.c cVar) {
        this(i10, j0Var, cVar, 112800);
    }

    public h0(int i10, ea.j0 j0Var, i0.c cVar, int i11) {
        this.f40205f = (i0.c) ea.a.e(cVar);
        this.f40201b = i11;
        this.f40200a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f40202c = arrayList;
            arrayList.add(j0Var);
        } else {
            this.f40202c = Collections.singletonList(j0Var);
        }
        this.f40203d = new ea.a0(new byte[9400], 0);
        this.f40207h = new SparseBooleanArray();
        this.f40208i = new SparseBooleanArray();
        this.f40206g = new SparseArray<>();
        this.f40204e = new SparseIntArray();
        this.f40209j = new f0(i11);
        this.f40211l = p8.k.f35672d0;
        this.f40218s = -1;
        y();
    }
}
