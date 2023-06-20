package s8;

import android.net.Uri;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ea.a0;
import java.io.IOException;
import java.util.Map;
import p8.i;
import p8.j;
import p8.k;
import p8.m;
import p8.n;
import p8.w;
import p8.x;

/* compiled from: FlvExtractor.java */
/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: f */
    private k f36802f;

    /* renamed from: h */
    private boolean f36804h;

    /* renamed from: i */
    private long f36805i;

    /* renamed from: j */
    private int f36806j;

    /* renamed from: k */
    private int f36807k;

    /* renamed from: l */
    private int f36808l;

    /* renamed from: m */
    private long f36809m;

    /* renamed from: n */
    private boolean f36810n;

    /* renamed from: o */
    private a f36811o;

    /* renamed from: p */
    private f f36812p;

    /* renamed from: a */
    private final a0 f36797a = new a0(4);

    /* renamed from: b */
    private final a0 f36798b = new a0(9);

    /* renamed from: c */
    private final a0 f36799c = new a0(11);

    /* renamed from: d */
    private final a0 f36800d = new a0();

    /* renamed from: e */
    private final d f36801e = new d();

    /* renamed from: g */
    private int f36803g = 1;

    static {
        b bVar = new n() { // from class: s8.b
            @Override // p8.n
            public /* synthetic */ i[] a(Uri uri, Map map) {
                return m.a(this, uri, map);
            }

            @Override // p8.n
            public final i[] b() {
                return c.b();
            }
        };
    }

    public static /* synthetic */ i[] b() {
        return f();
    }

    private void d() {
        if (this.f36810n) {
            return;
        }
        this.f36802f.n(new x.b(-9223372036854775807L));
        this.f36810n = true;
    }

    private long e() {
        if (this.f36804h) {
            return this.f36805i + this.f36809m;
        }
        if (this.f36801e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f36809m;
    }

    public static /* synthetic */ i[] f() {
        return new i[]{new c()};
    }

    private a0 i(j jVar) throws IOException {
        if (this.f36808l > this.f36800d.b()) {
            a0 a0Var = this.f36800d;
            a0Var.N(new byte[Math.max(a0Var.b() * 2, this.f36808l)], 0);
        } else {
            this.f36800d.P(0);
        }
        this.f36800d.O(this.f36808l);
        jVar.readFully(this.f36800d.d(), 0, this.f36808l);
        return this.f36800d;
    }

    private boolean j(j jVar) throws IOException {
        if (jVar.h(this.f36798b.d(), 0, 9, true)) {
            this.f36798b.P(0);
            this.f36798b.Q(4);
            int D = this.f36798b.D();
            boolean z10 = (D & 4) != 0;
            boolean z11 = (D & 1) != 0;
            if (z10 && this.f36811o == null) {
                this.f36811o = new a(this.f36802f.f(8, 1));
            }
            if (z11 && this.f36812p == null) {
                this.f36812p = new f(this.f36802f.f(9, 2));
            }
            this.f36802f.r();
            this.f36806j = (this.f36798b.n() - 9) + 4;
            this.f36803g = 2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean k(p8.j r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.e()
            int r2 = r9.f36807k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            s8.a r7 = r9.f36811o
            if (r7 == 0) goto L24
            r9.d()
            s8.a r2 = r9.f36811o
            ea.a0 r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
        L22:
            r10 = 1
            goto L75
        L24:
            r7 = 9
            if (r2 != r7) goto L3a
            s8.f r7 = r9.f36812p
            if (r7 == 0) goto L3a
            r9.d()
            s8.f r2 = r9.f36812p
            ea.a0 r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
            goto L22
        L3a:
            r7 = 18
            if (r2 != r7) goto L6f
            boolean r2 = r9.f36810n
            if (r2 != 0) goto L6f
            s8.d r2 = r9.f36801e
            ea.a0 r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
            s8.d r10 = r9.f36801e
            long r0 = r10.d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            p8.k r10 = r9.f36802f
            p8.v r2 = new p8.v
            s8.d r7 = r9.f36801e
            long[] r7 = r7.e()
            s8.d r8 = r9.f36801e
            long[] r8 = r8.f()
            r2.<init>(r7, r8, r0)
            r10.n(r2)
            r9.f36810n = r6
            goto L22
        L6f:
            int r0 = r9.f36808l
            r10.m(r0)
            r10 = 0
        L75:
            boolean r0 = r9.f36804h
            if (r0 != 0) goto L8f
            if (r5 == 0) goto L8f
            r9.f36804h = r6
            s8.d r0 = r9.f36801e
            long r0 = r0.d()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L8b
            long r0 = r9.f36809m
            long r0 = -r0
            goto L8d
        L8b:
            r0 = 0
        L8d:
            r9.f36805i = r0
        L8f:
            r0 = 4
            r9.f36806j = r0
            r0 = 2
            r9.f36803g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.c.k(p8.j):boolean");
    }

    private boolean l(j jVar) throws IOException {
        if (jVar.h(this.f36799c.d(), 0, 11, true)) {
            this.f36799c.P(0);
            this.f36807k = this.f36799c.D();
            this.f36808l = this.f36799c.G();
            this.f36809m = this.f36799c.G();
            this.f36809m = ((this.f36799c.D() << 24) | this.f36809m) * 1000;
            this.f36799c.Q(3);
            this.f36803g = 4;
            return true;
        }
        return false;
    }

    private void m(j jVar) throws IOException {
        jVar.m(this.f36806j);
        this.f36806j = 0;
        this.f36803g = 3;
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f36803g = 1;
            this.f36804h = false;
        } else {
            this.f36803g = 3;
        }
        this.f36806j = 0;
    }

    @Override // p8.i
    public void c(k kVar) {
        this.f36802f = kVar;
    }

    @Override // p8.i
    public int g(j jVar, w wVar) throws IOException {
        ea.a.h(this.f36802f);
        while (true) {
            int i10 = this.f36803g;
            if (i10 != 1) {
                if (i10 == 2) {
                    m(jVar);
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        if (k(jVar)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!l(jVar)) {
                    return -1;
                }
            } else if (!j(jVar)) {
                return -1;
            }
        }
    }

    @Override // p8.i
    public boolean h(j jVar) throws IOException {
        jVar.p(this.f36797a.d(), 0, 3);
        this.f36797a.P(0);
        if (this.f36797a.G() != 4607062) {
            return false;
        }
        jVar.p(this.f36797a.d(), 0, 2);
        this.f36797a.P(0);
        if ((this.f36797a.J() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        jVar.p(this.f36797a.d(), 0, 4);
        this.f36797a.P(0);
        int n10 = this.f36797a.n();
        jVar.f();
        jVar.j(n10);
        jVar.p(this.f36797a.d(), 0, 4);
        this.f36797a.P(0);
        return this.f36797a.n() == 0;
    }

    @Override // p8.i
    public void release() {
    }
}
