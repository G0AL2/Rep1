package x8;

import ea.n0;
import j8.p1;
import java.io.IOException;
import p8.a0;
import p8.k;
import p8.w;
import p8.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StreamReader.java */
/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    private a0 f38740b;

    /* renamed from: c  reason: collision with root package name */
    private k f38741c;

    /* renamed from: d  reason: collision with root package name */
    private g f38742d;

    /* renamed from: e  reason: collision with root package name */
    private long f38743e;

    /* renamed from: f  reason: collision with root package name */
    private long f38744f;

    /* renamed from: g  reason: collision with root package name */
    private long f38745g;

    /* renamed from: h  reason: collision with root package name */
    private int f38746h;

    /* renamed from: i  reason: collision with root package name */
    private int f38747i;

    /* renamed from: k  reason: collision with root package name */
    private long f38749k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f38750l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f38751m;

    /* renamed from: a  reason: collision with root package name */
    private final e f38739a = new e();

    /* renamed from: j  reason: collision with root package name */
    private b f38748j = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StreamReader.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        p1 f38752a;

        /* renamed from: b  reason: collision with root package name */
        g f38753b;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StreamReader.java */
    /* loaded from: classes2.dex */
    public static final class c implements g {
        private c() {
        }

        @Override // x8.g
        public long a(p8.j jVar) {
            return -1L;
        }

        @Override // x8.g
        public x b() {
            return new x.b(-9223372036854775807L);
        }

        @Override // x8.g
        public void c(long j10) {
        }
    }

    private void a() {
        ea.a.h(this.f38740b);
        n0.j(this.f38741c);
    }

    private boolean i(p8.j jVar) throws IOException {
        while (this.f38739a.d(jVar)) {
            this.f38749k = jVar.getPosition() - this.f38744f;
            if (!h(this.f38739a.c(), this.f38744f, this.f38748j)) {
                return true;
            }
            this.f38744f = jVar.getPosition();
        }
        this.f38746h = 3;
        return false;
    }

    private int j(p8.j jVar) throws IOException {
        if (i(jVar)) {
            p1 p1Var = this.f38748j.f38752a;
            this.f38747i = p1Var.f32723z;
            if (!this.f38751m) {
                this.f38740b.d(p1Var);
                this.f38751m = true;
            }
            g gVar = this.f38748j.f38753b;
            if (gVar != null) {
                this.f38742d = gVar;
            } else if (jVar.b() == -1) {
                this.f38742d = new c();
            } else {
                f b10 = this.f38739a.b();
                this.f38742d = new x8.a(this, this.f38744f, jVar.b(), b10.f38733e + b10.f38734f, b10.f38731c, (b10.f38730b & 4) != 0);
            }
            this.f38746h = 2;
            this.f38739a.f();
            return 0;
        }
        return -1;
    }

    private int k(p8.j jVar, w wVar) throws IOException {
        long a10 = this.f38742d.a(jVar);
        if (a10 >= 0) {
            wVar.f35701a = a10;
            return 1;
        }
        if (a10 < -1) {
            e(-(a10 + 2));
        }
        if (!this.f38750l) {
            this.f38741c.n((x) ea.a.h(this.f38742d.b()));
            this.f38750l = true;
        }
        if (this.f38749k <= 0 && !this.f38739a.d(jVar)) {
            this.f38746h = 3;
            return -1;
        }
        this.f38749k = 0L;
        ea.a0 c10 = this.f38739a.c();
        long f10 = f(c10);
        if (f10 >= 0) {
            long j10 = this.f38745g;
            if (j10 + f10 >= this.f38743e) {
                long b10 = b(j10);
                this.f38740b.a(c10, c10.f());
                this.f38740b.e(b10, 1, c10.f(), 0, null);
                this.f38743e = -1L;
            }
        }
        this.f38745g += f10;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b(long j10) {
        return (j10 * 1000000) / this.f38747i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long c(long j10) {
        return (this.f38747i * j10) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(k kVar, a0 a0Var) {
        this.f38741c = kVar;
        this.f38740b = a0Var;
        l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(long j10) {
        this.f38745g = j10;
    }

    protected abstract long f(ea.a0 a0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(p8.j jVar, w wVar) throws IOException {
        a();
        int i10 = this.f38746h;
        if (i10 != 0) {
            if (i10 == 1) {
                jVar.m((int) this.f38744f);
                this.f38746h = 2;
                return 0;
            } else if (i10 == 2) {
                n0.j(this.f38742d);
                return k(jVar, wVar);
            } else if (i10 == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        return j(jVar);
    }

    protected abstract boolean h(ea.a0 a0Var, long j10, b bVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(boolean z10) {
        if (z10) {
            this.f38748j = new b();
            this.f38744f = 0L;
            this.f38746h = 0;
        } else {
            this.f38746h = 1;
        }
        this.f38743e = -1L;
        this.f38745g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(long j10, long j11) {
        this.f38739a.e();
        if (j10 == 0) {
            l(!this.f38750l);
        } else if (this.f38746h != 0) {
            this.f38743e = c(j11);
            ((g) n0.j(this.f38742d)).c(this.f38743e);
            this.f38746h = 2;
        }
    }
}
