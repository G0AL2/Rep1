package k9;

import android.util.SparseArray;
import ea.n0;
import ea.v;
import j8.p1;
import java.io.IOException;
import java.util.List;
import k8.o1;
import k9.g;
import p8.a0;
import p8.w;
import p8.x;
import p8.z;

/* compiled from: BundledChunkExtractor.java */
/* loaded from: classes2.dex */
public final class e implements p8.k, g {

    /* renamed from: j */
    public static final g.a f33367j = new g.a() { // from class: k9.d
        @Override // k9.g.a
        public final g a(int i10, p1 p1Var, boolean z10, List list, a0 a0Var, o1 o1Var) {
            return e.e(i10, p1Var, z10, list, a0Var, o1Var);
        }
    };

    /* renamed from: k */
    private static final w f33368k = new w();

    /* renamed from: a */
    private final p8.i f33369a;

    /* renamed from: b */
    private final int f33370b;

    /* renamed from: c */
    private final p1 f33371c;

    /* renamed from: d */
    private final SparseArray<a> f33372d = new SparseArray<>();

    /* renamed from: e */
    private boolean f33373e;

    /* renamed from: f */
    private g.b f33374f;

    /* renamed from: g */
    private long f33375g;

    /* renamed from: h */
    private x f33376h;

    /* renamed from: i */
    private p1[] f33377i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BundledChunkExtractor.java */
    /* loaded from: classes2.dex */
    public static final class a implements a0 {

        /* renamed from: a */
        private final int f33378a;

        /* renamed from: b */
        private final int f33379b;

        /* renamed from: c */
        private final p1 f33380c;

        /* renamed from: d */
        private final p8.h f33381d = new p8.h();

        /* renamed from: e */
        public p1 f33382e;

        /* renamed from: f */
        private a0 f33383f;

        /* renamed from: g */
        private long f33384g;

        public a(int i10, int i11, p1 p1Var) {
            this.f33378a = i10;
            this.f33379b = i11;
            this.f33380c = p1Var;
        }

        @Override // p8.a0
        public /* synthetic */ void a(ea.a0 a0Var, int i10) {
            z.b(this, a0Var, i10);
        }

        @Override // p8.a0
        public int b(da.i iVar, int i10, boolean z10, int i11) throws IOException {
            return ((a0) n0.j(this.f33383f)).c(iVar, i10, z10);
        }

        @Override // p8.a0
        public /* synthetic */ int c(da.i iVar, int i10, boolean z10) {
            return z.a(this, iVar, i10, z10);
        }

        @Override // p8.a0
        public void d(p1 p1Var) {
            p1 p1Var2 = this.f33380c;
            if (p1Var2 != null) {
                p1Var = p1Var.j(p1Var2);
            }
            this.f33382e = p1Var;
            ((a0) n0.j(this.f33383f)).d(this.f33382e);
        }

        @Override // p8.a0
        public void e(long j10, int i10, int i11, int i12, a0.a aVar) {
            long j11 = this.f33384g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f33383f = this.f33381d;
            }
            ((a0) n0.j(this.f33383f)).e(j10, i10, i11, i12, aVar);
        }

        @Override // p8.a0
        public void f(ea.a0 a0Var, int i10, int i11) {
            ((a0) n0.j(this.f33383f)).a(a0Var, i10);
        }

        public void g(g.b bVar, long j10) {
            if (bVar == null) {
                this.f33383f = this.f33381d;
                return;
            }
            this.f33384g = j10;
            a0 f10 = bVar.f(this.f33378a, this.f33379b);
            this.f33383f = f10;
            p1 p1Var = this.f33382e;
            if (p1Var != null) {
                f10.d(p1Var);
            }
        }
    }

    public e(p8.i iVar, int i10, p1 p1Var) {
        this.f33369a = iVar;
        this.f33370b = i10;
        this.f33371c = p1Var;
    }

    public static /* synthetic */ g e(int i10, p1 p1Var, boolean z10, List list, a0 a0Var, o1 o1Var) {
        return g(i10, p1Var, z10, list, a0Var, o1Var);
    }

    public static /* synthetic */ g g(int i10, p1 p1Var, boolean z10, List list, a0 a0Var, o1 o1Var) {
        p8.i gVar;
        String str = p1Var.f32708k;
        if (v.s(str)) {
            if (!"application/x-rawcc".equals(str)) {
                return null;
            }
            gVar = new y8.a(p1Var);
        } else if (v.r(str)) {
            gVar = new u8.e(1);
        } else {
            gVar = new w8.g(z10 ? 4 : 0, null, null, list, a0Var);
        }
        return new e(gVar, i10, p1Var);
    }

    @Override // k9.g
    public boolean a(p8.j jVar) throws IOException {
        int g10 = this.f33369a.g(jVar, f33368k);
        ea.a.f(g10 != 1);
        return g10 == 0;
    }

    @Override // k9.g
    public void b(g.b bVar, long j10, long j11) {
        this.f33374f = bVar;
        this.f33375g = j11;
        if (!this.f33373e) {
            this.f33369a.c(this);
            if (j10 != -9223372036854775807L) {
                this.f33369a.a(0L, j10);
            }
            this.f33373e = true;
            return;
        }
        p8.i iVar = this.f33369a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        iVar.a(0L, j10);
        for (int i10 = 0; i10 < this.f33372d.size(); i10++) {
            this.f33372d.valueAt(i10).g(bVar, j11);
        }
    }

    @Override // k9.g
    public p8.d c() {
        x xVar = this.f33376h;
        if (xVar instanceof p8.d) {
            return (p8.d) xVar;
        }
        return null;
    }

    @Override // k9.g
    public p1[] d() {
        return this.f33377i;
    }

    @Override // p8.k
    public a0 f(int i10, int i11) {
        a aVar = this.f33372d.get(i10);
        if (aVar == null) {
            ea.a.f(this.f33377i == null);
            aVar = new a(i10, i11, i11 == this.f33370b ? this.f33371c : null);
            aVar.g(this.f33374f, this.f33375g);
            this.f33372d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // p8.k
    public void n(x xVar) {
        this.f33376h = xVar;
    }

    @Override // p8.k
    public void r() {
        p1[] p1VarArr = new p1[this.f33372d.size()];
        for (int i10 = 0; i10 < this.f33372d.size(); i10++) {
            p1VarArr[i10] = (p1) ea.a.h(this.f33372d.valueAt(i10).f33382e);
        }
        this.f33377i = p1VarArr;
    }

    @Override // k9.g
    public void release() {
        this.f33369a.release();
    }
}
