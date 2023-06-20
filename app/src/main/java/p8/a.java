package p8;

import ea.n0;
import java.io.IOException;
import p8.x;

/* compiled from: BinarySearchSeeker.java */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0477a f35588a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f35589b;

    /* renamed from: c  reason: collision with root package name */
    protected c f35590c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35591d;

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: p8.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0477a implements x {

        /* renamed from: a  reason: collision with root package name */
        private final d f35592a;

        /* renamed from: b  reason: collision with root package name */
        private final long f35593b;

        /* renamed from: c  reason: collision with root package name */
        private final long f35594c;

        /* renamed from: d  reason: collision with root package name */
        private final long f35595d;

        /* renamed from: e  reason: collision with root package name */
        private final long f35596e;

        /* renamed from: f  reason: collision with root package name */
        private final long f35597f;

        /* renamed from: g  reason: collision with root package name */
        private final long f35598g;

        public C0477a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f35592a = dVar;
            this.f35593b = j10;
            this.f35594c = j11;
            this.f35595d = j12;
            this.f35596e = j13;
            this.f35597f = j14;
            this.f35598g = j15;
        }

        @Override // p8.x
        public x.a d(long j10) {
            return new x.a(new y(j10, c.h(this.f35592a.a(j10), this.f35594c, this.f35595d, this.f35596e, this.f35597f, this.f35598g)));
        }

        @Override // p8.x
        public boolean f() {
            return true;
        }

        @Override // p8.x
        public long i() {
            return this.f35593b;
        }

        public long k(long j10) {
            return this.f35592a.a(j10);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public static final class b implements d {
        @Override // p8.a.d
        public long a(long j10) {
            return j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f35599a;

        /* renamed from: b  reason: collision with root package name */
        private final long f35600b;

        /* renamed from: c  reason: collision with root package name */
        private final long f35601c;

        /* renamed from: d  reason: collision with root package name */
        private long f35602d;

        /* renamed from: e  reason: collision with root package name */
        private long f35603e;

        /* renamed from: f  reason: collision with root package name */
        private long f35604f;

        /* renamed from: g  reason: collision with root package name */
        private long f35605g;

        /* renamed from: h  reason: collision with root package name */
        private long f35606h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f35599a = j10;
            this.f35600b = j11;
            this.f35602d = j12;
            this.f35603e = j13;
            this.f35604f = j14;
            this.f35605g = j15;
            this.f35601c = j16;
            this.f35606h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return n0.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f35605g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f35604f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f35606h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f35599a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f35600b;
        }

        private void n() {
            this.f35606h = h(this.f35600b, this.f35602d, this.f35603e, this.f35604f, this.f35605g, this.f35601c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f35603e = j10;
            this.f35605g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f35602d = j10;
            this.f35604f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public interface d {
        long a(long j10);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f35607d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a  reason: collision with root package name */
        private final int f35608a;

        /* renamed from: b  reason: collision with root package name */
        private final long f35609b;

        /* renamed from: c  reason: collision with root package name */
        private final long f35610c;

        private e(int i10, long j10, long j11) {
            this.f35608a = i10;
            this.f35609b = j10;
            this.f35610c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes2.dex */
    public interface f {
        e a(j jVar, long j10) throws IOException;

        void b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f35589b = fVar;
        this.f35591d = i10;
        this.f35588a = new C0477a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f35588a.k(j10), this.f35588a.f35594c, this.f35588a.f35595d, this.f35588a.f35596e, this.f35588a.f35597f, this.f35588a.f35598g);
    }

    public final x b() {
        return this.f35588a;
    }

    public int c(j jVar, w wVar) throws IOException {
        while (true) {
            c cVar = (c) ea.a.h(this.f35590c);
            long j10 = cVar.j();
            long i10 = cVar.i();
            long k10 = cVar.k();
            if (i10 - j10 <= this.f35591d) {
                e(false, j10);
                return g(jVar, j10, wVar);
            } else if (!i(jVar, k10)) {
                return g(jVar, k10, wVar);
            } else {
                jVar.f();
                e a10 = this.f35589b.a(jVar, cVar.m());
                int i11 = a10.f35608a;
                if (i11 == -3) {
                    e(false, k10);
                    return g(jVar, k10, wVar);
                } else if (i11 == -2) {
                    cVar.p(a10.f35609b, a10.f35610c);
                } else if (i11 != -1) {
                    if (i11 == 0) {
                        i(jVar, a10.f35610c);
                        e(true, a10.f35610c);
                        return g(jVar, a10.f35610c, wVar);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    cVar.o(a10.f35609b, a10.f35610c);
                }
            }
        }
    }

    public final boolean d() {
        return this.f35590c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f35590c = null;
        this.f35589b.b();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected final int g(j jVar, long j10, w wVar) {
        if (j10 == jVar.getPosition()) {
            return 0;
        }
        wVar.f35701a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f35590c;
        if (cVar == null || cVar.l() != j10) {
            this.f35590c = a(j10);
        }
    }

    protected final boolean i(j jVar, long j10) throws IOException {
        long position = j10 - jVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        jVar.m((int) position);
        return true;
    }
}
