package r8;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.Metadata;
import ea.a0;
import ea.n0;
import java.io.IOException;
import java.util.Map;
import p8.i;
import p8.j;
import p8.k;
import p8.m;
import p8.n;
import p8.o;
import p8.p;
import p8.q;
import p8.r;
import p8.w;
import p8.x;

/* compiled from: FlacExtractor.java */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a */
    private final byte[] f36466a;

    /* renamed from: b */
    private final a0 f36467b;

    /* renamed from: c */
    private final boolean f36468c;

    /* renamed from: d */
    private final o.a f36469d;

    /* renamed from: e */
    private k f36470e;

    /* renamed from: f */
    private p8.a0 f36471f;

    /* renamed from: g */
    private int f36472g;

    /* renamed from: h */
    private Metadata f36473h;

    /* renamed from: i */
    private r f36474i;

    /* renamed from: j */
    private int f36475j;

    /* renamed from: k */
    private int f36476k;

    /* renamed from: l */
    private b f36477l;

    /* renamed from: m */
    private int f36478m;

    /* renamed from: n */
    private long f36479n;

    static {
        c cVar = new n() { // from class: r8.c
            @Override // p8.n
            public /* synthetic */ i[] a(Uri uri, Map map) {
                return m.a(this, uri, map);
            }

            @Override // p8.n
            public final i[] b() {
                return d.b();
            }
        };
    }

    public d() {
        this(0);
    }

    public static /* synthetic */ i[] b() {
        return j();
    }

    private long d(a0 a0Var, boolean z10) {
        boolean z11;
        ea.a.e(this.f36474i);
        int e10 = a0Var.e();
        while (e10 <= a0Var.f() - 16) {
            a0Var.P(e10);
            if (o.d(a0Var, this.f36474i, this.f36476k, this.f36469d)) {
                a0Var.P(e10);
                return this.f36469d.f35674a;
            }
            e10++;
        }
        if (z10) {
            while (e10 <= a0Var.f() - this.f36475j) {
                a0Var.P(e10);
                try {
                    z11 = o.d(a0Var, this.f36474i, this.f36476k, this.f36469d);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (a0Var.e() <= a0Var.f() ? z11 : false) {
                    a0Var.P(e10);
                    return this.f36469d.f35674a;
                }
                e10++;
            }
            a0Var.P(a0Var.f());
            return -1L;
        }
        a0Var.P(e10);
        return -1L;
    }

    private void e(j jVar) throws IOException {
        this.f36476k = p.b(jVar);
        ((k) n0.j(this.f36470e)).n(f(jVar.getPosition(), jVar.b()));
        this.f36472g = 5;
    }

    private x f(long j10, long j11) {
        ea.a.e(this.f36474i);
        r rVar = this.f36474i;
        if (rVar.f35688k != null) {
            return new q(rVar, j10);
        }
        if (j11 != -1 && rVar.f35687j > 0) {
            b bVar = new b(rVar, this.f36476k, j10, j11);
            this.f36477l = bVar;
            return bVar.b();
        }
        return new x.b(rVar.f());
    }

    private void i(j jVar) throws IOException {
        byte[] bArr = this.f36466a;
        jVar.p(bArr, 0, bArr.length);
        jVar.f();
        this.f36472g = 2;
    }

    public static /* synthetic */ i[] j() {
        return new i[]{new d()};
    }

    private void k() {
        ((p8.a0) n0.j(this.f36471f)).e((this.f36479n * 1000000) / ((r) n0.j(this.f36474i)).f35682e, 1, this.f36478m, 0, null);
    }

    private int l(j jVar, w wVar) throws IOException {
        boolean z10;
        ea.a.e(this.f36471f);
        ea.a.e(this.f36474i);
        b bVar = this.f36477l;
        if (bVar != null && bVar.d()) {
            return this.f36477l.c(jVar, wVar);
        }
        if (this.f36479n == -1) {
            this.f36479n = o.i(jVar, this.f36474i);
            return 0;
        }
        int f10 = this.f36467b.f();
        if (f10 < 32768) {
            int c10 = jVar.c(this.f36467b.d(), f10, 32768 - f10);
            z10 = c10 == -1;
            if (!z10) {
                this.f36467b.O(f10 + c10);
            } else if (this.f36467b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int e10 = this.f36467b.e();
        int i10 = this.f36478m;
        int i11 = this.f36475j;
        if (i10 < i11) {
            a0 a0Var = this.f36467b;
            a0Var.Q(Math.min(i11 - i10, a0Var.a()));
        }
        long d10 = d(this.f36467b, z10);
        int e11 = this.f36467b.e() - e10;
        this.f36467b.P(e10);
        this.f36471f.a(this.f36467b, e11);
        this.f36478m += e11;
        if (d10 != -1) {
            k();
            this.f36478m = 0;
            this.f36479n = d10;
        }
        if (this.f36467b.a() < 16) {
            int a10 = this.f36467b.a();
            System.arraycopy(this.f36467b.d(), this.f36467b.e(), this.f36467b.d(), 0, a10);
            this.f36467b.P(0);
            this.f36467b.O(a10);
        }
        return 0;
    }

    private void m(j jVar) throws IOException {
        this.f36473h = p.d(jVar, !this.f36468c);
        this.f36472g = 1;
    }

    private void n(j jVar) throws IOException {
        p.a aVar = new p.a(this.f36474i);
        boolean z10 = false;
        while (!z10) {
            z10 = p.e(jVar, aVar);
            this.f36474i = (r) n0.j(aVar.f35675a);
        }
        ea.a.e(this.f36474i);
        this.f36475j = Math.max(this.f36474i.f35680c, 6);
        ((p8.a0) n0.j(this.f36471f)).d(this.f36474i.g(this.f36466a, this.f36473h));
        this.f36472g = 4;
    }

    private void o(j jVar) throws IOException {
        p.i(jVar);
        this.f36472g = 3;
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f36472g = 0;
        } else {
            b bVar = this.f36477l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f36479n = j11 != 0 ? -1L : 0L;
        this.f36478m = 0;
        this.f36467b.L(0);
    }

    @Override // p8.i
    public void c(k kVar) {
        this.f36470e = kVar;
        this.f36471f = kVar.f(0, 1);
        kVar.r();
    }

    @Override // p8.i
    public int g(j jVar, w wVar) throws IOException {
        int i10 = this.f36472g;
        if (i10 == 0) {
            m(jVar);
            return 0;
        } else if (i10 == 1) {
            i(jVar);
            return 0;
        } else if (i10 == 2) {
            o(jVar);
            return 0;
        } else if (i10 == 3) {
            n(jVar);
            return 0;
        } else if (i10 == 4) {
            e(jVar);
            return 0;
        } else if (i10 == 5) {
            return l(jVar, wVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // p8.i
    public boolean h(j jVar) throws IOException {
        p.c(jVar, false);
        return p.a(jVar);
    }

    @Override // p8.i
    public void release() {
    }

    public d(int i10) {
        this.f36466a = new byte[42];
        this.f36467b = new a0(new byte[32768], 0);
        this.f36468c = (i10 & 1) != 0;
        this.f36469d = new o.a();
        this.f36472g = 0;
    }
}
