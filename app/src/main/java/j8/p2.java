package j8;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import ea.l;
import java.util.List;

/* compiled from: Player.java */
/* loaded from: classes2.dex */
public interface p2 {

    /* compiled from: Player.java */
    /* loaded from: classes2.dex */
    public static final class b implements g {

        /* renamed from: b  reason: collision with root package name */
        public static final b f32750b = new a().e();

        /* renamed from: a  reason: collision with root package name */
        private final ea.l f32751a;

        /* compiled from: Player.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final l.b f32752a = new l.b();

            public a a(int i10) {
                this.f32752a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f32752a.b(bVar.f32751a);
                return this;
            }

            public a c(int... iArr) {
                this.f32752a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f32752a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f32752a.e());
            }
        }

        public boolean b(int i10) {
            return this.f32751a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f32751a.equals(((b) obj).f32751a);
            }
            return false;
        }

        public int hashCode() {
            return this.f32751a.hashCode();
        }

        private b(ea.l lVar) {
            this.f32751a = lVar;
        }
    }

    /* compiled from: Player.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final ea.l f32753a;

        public c(ea.l lVar) {
            this.f32753a = lVar;
        }

        public boolean a(int i10) {
            return this.f32753a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f32753a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f32753a.equals(((c) obj).f32753a);
            }
            return false;
        }

        public int hashCode() {
            return this.f32753a.hashCode();
        }
    }

    /* compiled from: Player.java */
    /* loaded from: classes2.dex */
    public interface d {
        void C(boolean z10);

        void D(b bVar);

        void E(m mVar);

        void H(int i10, boolean z10);

        void J();

        void K(m2 m2Var);

        void N(b2 b2Var);

        void O(n3 n3Var);

        void P(int i10, int i11);

        void T(p2 p2Var, c cVar);

        @Deprecated
        void U(int i10);

        void V(e eVar, e eVar2, int i10);

        void W(boolean z10);

        @Deprecated
        void X();

        void Y(float f10);

        @Deprecated
        void Z(i9.y0 y0Var, ba.u uVar);

        void a(boolean z10);

        void d(o2 o2Var);

        @Deprecated
        void d0(boolean z10, int i10);

        void e0(m2 m2Var);

        void g(Metadata metadata);

        void g0(j3 j3Var, int i10);

        void h0(boolean z10, int i10);

        void j(fa.v vVar);

        void k(List<r9.b> list);

        void k0(boolean z10);

        void r(int i10);

        void w(int i10);

        @Deprecated
        void x(boolean z10);

        void y(x1 x1Var, int i10);

        void z(int i10);
    }

    /* compiled from: Player.java */
    /* loaded from: classes2.dex */
    public static final class e implements g {

        /* renamed from: a  reason: collision with root package name */
        public final Object f32754a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32755b;

        /* renamed from: c  reason: collision with root package name */
        public final x1 f32756c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f32757d;

        /* renamed from: e  reason: collision with root package name */
        public final int f32758e;

        /* renamed from: f  reason: collision with root package name */
        public final long f32759f;

        /* renamed from: g  reason: collision with root package name */
        public final long f32760g;

        /* renamed from: h  reason: collision with root package name */
        public final int f32761h;

        /* renamed from: i  reason: collision with root package name */
        public final int f32762i;

        public e(Object obj, int i10, x1 x1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f32754a = obj;
            this.f32755b = i10;
            this.f32756c = x1Var;
            this.f32757d = obj2;
            this.f32758e = i11;
            this.f32759f = j10;
            this.f32760g = j11;
            this.f32761h = i12;
            this.f32762i = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f32755b == eVar.f32755b && this.f32758e == eVar.f32758e && this.f32759f == eVar.f32759f && this.f32760g == eVar.f32760g && this.f32761h == eVar.f32761h && this.f32762i == eVar.f32762i && ib.i.a(this.f32754a, eVar.f32754a) && ib.i.a(this.f32757d, eVar.f32757d) && ib.i.a(this.f32756c, eVar.f32756c);
        }

        public int hashCode() {
            return ib.i.b(this.f32754a, Integer.valueOf(this.f32755b), this.f32756c, this.f32757d, Integer.valueOf(this.f32758e), Long.valueOf(this.f32759f), Long.valueOf(this.f32760g), Integer.valueOf(this.f32761h), Integer.valueOf(this.f32762i));
        }
    }

    @Deprecated
    ba.u A();

    void C(int i10, long j10);

    b D();

    boolean E();

    void F(boolean z10);

    long H();

    int I();

    void J(TextureView textureView);

    fa.v K();

    boolean L();

    int M();

    void N(long j10);

    long O();

    long P();

    long Q();

    boolean R();

    int S();

    int T();

    void U(int i10);

    void V(SurfaceView surfaceView);

    int W();

    boolean X();

    long Y();

    void Z();

    void a();

    void a0();

    void b(o2 o2Var);

    b2 b0();

    o2 c();

    long c0();

    boolean d();

    long e();

    boolean e0();

    void f();

    int g();

    long getCurrentPosition();

    long getDuration();

    void h(SurfaceView surfaceView);

    void i(d dVar);

    boolean isPlaying();

    void j(int i10, int i11);

    void k();

    m2 l();

    void m(boolean z10);

    boolean o();

    void p(d dVar);

    void pause();

    void play();

    List<r9.b> q();

    int r();

    void release();

    boolean s(int i10);

    void setVolume(float f10);

    void stop();

    boolean t();

    int u();

    n3 v();

    j3 w();

    Looper x();

    void y();

    void z(TextureView textureView);
}
