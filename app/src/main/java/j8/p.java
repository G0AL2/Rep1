package j8;

import android.content.Context;
import android.os.Looper;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import i9.u;
import j8.i;
import j8.p;

/* compiled from: ExoPlayer.java */
/* loaded from: classes2.dex */
public interface p extends p2 {

    /* compiled from: ExoPlayer.java */
    /* loaded from: classes2.dex */
    public interface a {
        void A(boolean z10);

        void D(boolean z10);
    }

    /* compiled from: ExoPlayer.java */
    /* loaded from: classes2.dex */
    public static final class b {
        boolean A;

        /* renamed from: a */
        final Context f32671a;

        /* renamed from: b */
        ea.c f32672b;

        /* renamed from: c */
        long f32673c;

        /* renamed from: d */
        ib.q<a3> f32674d;

        /* renamed from: e */
        ib.q<u.a> f32675e;

        /* renamed from: f */
        ib.q<ba.a0> f32676f;

        /* renamed from: g */
        ib.q<v1> f32677g;

        /* renamed from: h */
        ib.q<da.f> f32678h;

        /* renamed from: i */
        ib.f<ea.c, k8.a> f32679i;

        /* renamed from: j */
        Looper f32680j;

        /* renamed from: k */
        ea.c0 f32681k;

        /* renamed from: l */
        l8.d f32682l;

        /* renamed from: m */
        boolean f32683m;

        /* renamed from: n */
        int f32684n;

        /* renamed from: o */
        boolean f32685o;

        /* renamed from: p */
        boolean f32686p;

        /* renamed from: q */
        int f32687q;

        /* renamed from: r */
        int f32688r;

        /* renamed from: s */
        boolean f32689s;

        /* renamed from: t */
        b3 f32690t;

        /* renamed from: u */
        long f32691u;

        /* renamed from: v */
        long f32692v;

        /* renamed from: w */
        u1 f32693w;

        /* renamed from: x */
        long f32694x;

        /* renamed from: y */
        long f32695y;

        /* renamed from: z */
        boolean f32696z;

        public b(final Context context) {
            this(context, new ib.q() { // from class: j8.u
                @Override // ib.q
                public final Object get() {
                    return p.b.d(context);
                }
            }, new ib.q() { // from class: j8.w
                @Override // ib.q
                public final Object get() {
                    return p.b.f(context);
                }
            });
        }

        public static /* synthetic */ u.a a(Context context) {
            return q(context);
        }

        public static /* synthetic */ da.f b(Context context) {
            return da.s.n(context);
        }

        public static /* synthetic */ ba.a0 c(ba.a0 a0Var) {
            return t(a0Var);
        }

        public static /* synthetic */ a3 d(Context context) {
            return l(context);
        }

        public static /* synthetic */ ba.a0 e(Context context) {
            return n(context);
        }

        public static /* synthetic */ u.a f(Context context) {
            return m(context);
        }

        public static /* synthetic */ da.f g(da.f fVar) {
            return r(fVar);
        }

        public static /* synthetic */ a3 h(a3 a3Var) {
            return p(a3Var);
        }

        public static /* synthetic */ v1 i(v1 v1Var) {
            return s(v1Var);
        }

        public static /* synthetic */ a3 l(Context context) {
            return new l(context);
        }

        public static /* synthetic */ u.a m(Context context) {
            return new i9.j(context, new p8.g());
        }

        public static /* synthetic */ ba.a0 n(Context context) {
            return new ba.l(context);
        }

        public static /* synthetic */ a3 p(a3 a3Var) {
            return a3Var;
        }

        public static /* synthetic */ u.a q(Context context) {
            return new i9.j(context, new p8.g());
        }

        public static /* synthetic */ da.f r(da.f fVar) {
            return fVar;
        }

        public static /* synthetic */ v1 s(v1 v1Var) {
            return v1Var;
        }

        public static /* synthetic */ ba.a0 t(ba.a0 a0Var) {
            return a0Var;
        }

        public p j() {
            ea.a.f(!this.A);
            this.A = true;
            return new a1(this, null);
        }

        public c3 k() {
            ea.a.f(!this.A);
            this.A = true;
            return new c3(this);
        }

        public b u(final da.f fVar) {
            ea.a.f(!this.A);
            this.f32678h = new ib.q() { // from class: j8.y
                @Override // ib.q
                public final Object get() {
                    return p.b.g(da.f.this);
                }
            };
            return this;
        }

        public b v(final v1 v1Var) {
            ea.a.f(!this.A);
            this.f32677g = new ib.q() { // from class: j8.z
                @Override // ib.q
                public final Object get() {
                    return p.b.i(v1.this);
                }
            };
            return this;
        }

        public b w(final ba.a0 a0Var) {
            ea.a.f(!this.A);
            this.f32676f = new ib.q() { // from class: j8.x
                @Override // ib.q
                public final Object get() {
                    return p.b.c(ba.a0.this);
                }
            };
            return this;
        }

        public b(final Context context, final a3 a3Var) {
            this(context, new ib.q() { // from class: j8.a0
                @Override // ib.q
                public final Object get() {
                    return p.b.h(a3.this);
                }
            }, new ib.q() { // from class: j8.s
                @Override // ib.q
                public final Object get() {
                    return p.b.a(context);
                }
            });
        }

        private b(final Context context, ib.q<a3> qVar, ib.q<u.a> qVar2) {
            this(context, qVar, qVar2, new ib.q() { // from class: j8.v
                @Override // ib.q
                public final Object get() {
                    return p.b.e(context);
                }
            }, new ib.q() { // from class: j8.r
                @Override // ib.q
                public final Object get() {
                    return new j();
                }
            }, new ib.q() { // from class: j8.t
                @Override // ib.q
                public final Object get() {
                    return p.b.b(context);
                }
            }, new ib.f() { // from class: j8.q
                @Override // ib.f
                public final Object apply(Object obj) {
                    return new k8.n1((ea.c) obj);
                }
            });
        }

        private b(Context context, ib.q<a3> qVar, ib.q<u.a> qVar2, ib.q<ba.a0> qVar3, ib.q<v1> qVar4, ib.q<da.f> qVar5, ib.f<ea.c, k8.a> fVar) {
            this.f32671a = context;
            this.f32674d = qVar;
            this.f32675e = qVar2;
            this.f32676f = qVar3;
            this.f32677g = qVar4;
            this.f32678h = qVar5;
            this.f32679i = fVar;
            this.f32680j = ea.n0.Q();
            this.f32682l = l8.d.f33779g;
            this.f32684n = 0;
            this.f32687q = 1;
            this.f32688r = 0;
            this.f32689s = true;
            this.f32690t = b3.f32329d;
            this.f32691u = 5000L;
            this.f32692v = 15000L;
            this.f32693w = new i.b().a();
            this.f32672b = ea.c.f29651a;
            this.f32694x = 500L;
            this.f32695y = Constants.MIN_PROGRESS_TIME;
        }
    }

    int B(int i10);

    int G();

    @Deprecated
    void d0(i9.u uVar, boolean z10, boolean z11);

    p1 n();
}
