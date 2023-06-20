package j8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.android.exoplayer2.metadata.Metadata;
import ea.q;
import ga.l;
import i9.q0;
import i9.u;
import j8.a1;
import j8.b;
import j8.d;
import j8.f3;
import j8.i2;
import j8.j3;
import j8.l1;
import j8.p;
import j8.p2;
import j8.r2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: ExoPlayerImpl.java */
/* loaded from: classes2.dex */
public final class a1 extends j8.e implements p {
    private final j8.d A;
    private final f3 B;
    private final o3 C;
    private final p3 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private b3 L;
    private i9.q0 M;
    private boolean N;
    private p2.b O;
    private b2 P;
    private p1 Q;
    private p1 R;
    private AudioTrack S;
    private Object T;
    private Surface U;
    private SurfaceHolder V;
    private ga.l W;
    private boolean X;
    private TextureView Y;
    private int Z;

    /* renamed from: a0 */
    private int f32213a0;

    /* renamed from: b */
    final ba.b0 f32214b;

    /* renamed from: b0 */
    private int f32215b0;

    /* renamed from: c */
    final p2.b f32216c;

    /* renamed from: c0 */
    private int f32217c0;

    /* renamed from: d */
    private final ea.f f32218d;

    /* renamed from: d0 */
    private m8.e f32219d0;

    /* renamed from: e */
    private final Context f32220e;

    /* renamed from: e0 */
    private m8.e f32221e0;

    /* renamed from: f */
    private final p2 f32222f;

    /* renamed from: f0 */
    private int f32223f0;

    /* renamed from: g */
    private final w2[] f32224g;

    /* renamed from: g0 */
    private l8.d f32225g0;

    /* renamed from: h */
    private final ba.a0 f32226h;

    /* renamed from: h0 */
    private float f32227h0;

    /* renamed from: i */
    private final ea.n f32228i;

    /* renamed from: i0 */
    private boolean f32229i0;

    /* renamed from: j */
    private final l1.f f32230j;

    /* renamed from: j0 */
    private List<r9.b> f32231j0;

    /* renamed from: k */
    private final l1 f32232k;

    /* renamed from: k0 */
    private boolean f32233k0;

    /* renamed from: l */
    private final ea.q<p2.d> f32234l;

    /* renamed from: l0 */
    private boolean f32235l0;

    /* renamed from: m */
    private final CopyOnWriteArraySet<p.a> f32236m;

    /* renamed from: m0 */
    private ea.c0 f32237m0;

    /* renamed from: n */
    private final j3.b f32238n;

    /* renamed from: n0 */
    private boolean f32239n0;

    /* renamed from: o */
    private final List<e> f32240o;

    /* renamed from: o0 */
    private m f32241o0;

    /* renamed from: p */
    private final boolean f32242p;

    /* renamed from: p0 */
    private fa.v f32243p0;

    /* renamed from: q */
    private final u.a f32244q;

    /* renamed from: q0 */
    private b2 f32245q0;

    /* renamed from: r */
    private final k8.a f32246r;

    /* renamed from: r0 */
    private n2 f32247r0;

    /* renamed from: s */
    private final Looper f32248s;

    /* renamed from: s0 */
    private int f32249s0;

    /* renamed from: t */
    private final da.f f32250t;

    /* renamed from: t0 */
    private int f32251t0;

    /* renamed from: u */
    private final long f32252u;

    /* renamed from: u0 */
    private long f32253u0;

    /* renamed from: v */
    private final long f32254v;

    /* renamed from: w */
    private final ea.c f32255w;

    /* renamed from: x */
    private final c f32256x;

    /* renamed from: y */
    private final d f32257y;

    /* renamed from: z */
    private final j8.b f32258z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public static k8.o1 a() {
            return new k8.o1(LogSessionId.LOG_SESSION_ID_NONE);
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes2.dex */
    public final class c implements com.google.android.exoplayer2.video.d, l8.r, r9.l, c9.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, d.b, b.InterfaceC0414b, f3.b, p.a {
        private c() {
            a1.this = r1;
        }

        public static /* synthetic */ void E(Metadata metadata, p2.d dVar) {
            dVar.g(metadata);
        }

        public static /* synthetic */ void F(fa.v vVar, p2.d dVar) {
            dVar.j(vVar);
        }

        public static /* synthetic */ void G(m mVar, p2.d dVar) {
            dVar.E(mVar);
        }

        public static /* synthetic */ void H(int i10, boolean z10, p2.d dVar) {
            dVar.H(i10, z10);
        }

        public static /* synthetic */ void I(List list, p2.d dVar) {
            dVar.k(list);
        }

        public static /* synthetic */ void J(boolean z10, p2.d dVar) {
            dVar.a(z10);
        }

        public static /* synthetic */ void K(c cVar, p2.d dVar) {
            cVar.M(dVar);
        }

        public /* synthetic */ void M(p2.d dVar) {
            dVar.N(a1.this.P);
        }

        @Override // j8.p.a
        public void A(boolean z10) {
            a1.this.F2();
        }

        @Override // j8.d.b
        public void B(float f10) {
            a1.this.p2();
        }

        @Override // j8.d.b
        public void C(int i10) {
            boolean E = a1.this.E();
            a1.this.C2(E, i10, a1.B1(E, i10));
        }

        @Override // j8.p.a
        public /* synthetic */ void D(boolean z10) {
            o.a(this, z10);
        }

        @Override // l8.r
        public void a(final boolean z10) {
            if (a1.this.f32229i0 == z10) {
                return;
            }
            a1.this.f32229i0 = z10;
            a1.this.f32234l.l(23, new q.a() { // from class: j8.h1
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.c.J(z10, (p2.d) obj);
                }
            });
        }

        @Override // l8.r
        public void b(Exception exc) {
            a1.this.f32246r.b(exc);
        }

        @Override // com.google.android.exoplayer2.video.d
        public void c(String str) {
            a1.this.f32246r.c(str);
        }

        @Override // j8.f3.b
        public void d(int i10) {
            final m t12 = a1.t1(a1.this.B);
            if (t12.equals(a1.this.f32241o0)) {
                return;
            }
            a1.this.f32241o0 = t12;
            a1.this.f32234l.l(29, new q.a() { // from class: j8.e1
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.c.G(m.this, (p2.d) obj);
                }
            });
        }

        @Override // l8.r
        public void e(p1 p1Var, m8.i iVar) {
            a1.this.R = p1Var;
            a1.this.f32246r.e(p1Var, iVar);
        }

        @Override // l8.r
        public void f(String str) {
            a1.this.f32246r.f(str);
        }

        @Override // c9.e
        public void g(final Metadata metadata) {
            a1 a1Var = a1.this;
            a1Var.f32245q0 = a1Var.f32245q0.b().J(metadata).G();
            b2 q12 = a1.this.q1();
            if (!q12.equals(a1.this.P)) {
                a1.this.P = q12;
                a1.this.f32234l.i(14, new q.a() { // from class: j8.f1
                    @Override // ea.q.a
                    public final void b(Object obj) {
                        a1.c.K(a1.c.this, (p2.d) obj);
                    }
                });
            }
            a1.this.f32234l.i(28, new q.a() { // from class: j8.c1
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.c.E(Metadata.this, (p2.d) obj);
                }
            });
            a1.this.f32234l.f();
        }

        @Override // j8.b.InterfaceC0414b
        public void h() {
            a1.this.C2(false, -1, 3);
        }

        @Override // l8.r
        public void i(m8.e eVar) {
            a1.this.f32221e0 = eVar;
            a1.this.f32246r.i(eVar);
        }

        @Override // com.google.android.exoplayer2.video.d
        public void j(final fa.v vVar) {
            a1.this.f32243p0 = vVar;
            a1.this.f32234l.l(25, new q.a() { // from class: j8.d1
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.c.F(fa.v.this, (p2.d) obj);
                }
            });
        }

        @Override // r9.l
        public void k(final List<r9.b> list) {
            a1.this.f32231j0 = list;
            a1.this.f32234l.l(27, new q.a() { // from class: j8.g1
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.c.I(list, (p2.d) obj);
                }
            });
        }

        @Override // l8.r
        public void l(long j10) {
            a1.this.f32246r.l(j10);
        }

        @Override // com.google.android.exoplayer2.video.d
        public void m(p1 p1Var, m8.i iVar) {
            a1.this.Q = p1Var;
            a1.this.f32246r.m(p1Var, iVar);
        }

        @Override // com.google.android.exoplayer2.video.d
        public void n(Exception exc) {
            a1.this.f32246r.n(exc);
        }

        @Override // com.google.android.exoplayer2.video.d
        public void o(m8.e eVar) {
            a1.this.f32246r.o(eVar);
            a1.this.Q = null;
            a1.this.f32219d0 = null;
        }

        @Override // l8.r
        public void onAudioDecoderInitialized(String str, long j10, long j11) {
            a1.this.f32246r.onAudioDecoderInitialized(str, j10, j11);
        }

        @Override // com.google.android.exoplayer2.video.d
        public void onDroppedFrames(int i10, long j10) {
            a1.this.f32246r.onDroppedFrames(i10, j10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            a1.this.w2(surfaceTexture);
            a1.this.j2(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            a1.this.x2(null);
            a1.this.j2(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            a1.this.j2(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.video.d
        public void onVideoDecoderInitialized(String str, long j10, long j11) {
            a1.this.f32246r.onVideoDecoderInitialized(str, j10, j11);
        }

        @Override // com.google.android.exoplayer2.video.d
        public void p(m8.e eVar) {
            a1.this.f32219d0 = eVar;
            a1.this.f32246r.p(eVar);
        }

        @Override // com.google.android.exoplayer2.video.d
        public void q(Object obj, long j10) {
            a1.this.f32246r.q(obj, j10);
            if (a1.this.T == obj) {
                a1.this.f32234l.l(26, new q.a() { // from class: j8.i1
                    @Override // ea.q.a
                    public final void b(Object obj2) {
                        ((p2.d) obj2).J();
                    }
                });
            }
        }

        @Override // l8.r
        public /* synthetic */ void r(p1 p1Var) {
            l8.g.a(this, p1Var);
        }

        @Override // l8.r
        public void s(Exception exc) {
            a1.this.f32246r.s(exc);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            a1.this.j2(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (a1.this.X) {
                a1.this.x2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (a1.this.X) {
                a1.this.x2(null);
            }
            a1.this.j2(0, 0);
        }

        @Override // l8.r
        public void t(m8.e eVar) {
            a1.this.f32246r.t(eVar);
            a1.this.R = null;
            a1.this.f32221e0 = null;
        }

        @Override // l8.r
        public void u(int i10, long j10, long j11) {
            a1.this.f32246r.u(i10, j10, j11);
        }

        @Override // com.google.android.exoplayer2.video.d
        public void v(long j10, int i10) {
            a1.this.f32246r.v(j10, i10);
        }

        @Override // com.google.android.exoplayer2.video.d
        public /* synthetic */ void w(p1 p1Var) {
            fa.k.a(this, p1Var);
        }

        @Override // ga.l.b
        public void x(Surface surface) {
            a1.this.x2(null);
        }

        @Override // ga.l.b
        public void y(Surface surface) {
            a1.this.x2(surface);
        }

        @Override // j8.f3.b
        public void z(final int i10, final boolean z10) {
            a1.this.f32234l.l(30, new q.a() { // from class: j8.b1
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.c.H(i10, z10, (p2.d) obj);
                }
            });
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes2.dex */
    public static final class d implements fa.h, ga.a, r2.b {

        /* renamed from: a */
        private fa.h f32260a;

        /* renamed from: b */
        private ga.a f32261b;

        /* renamed from: c */
        private fa.h f32262c;

        /* renamed from: d */
        private ga.a f32263d;

        private d() {
        }

        @Override // fa.h
        public void a(long j10, long j11, p1 p1Var, MediaFormat mediaFormat) {
            fa.h hVar = this.f32262c;
            if (hVar != null) {
                hVar.a(j10, j11, p1Var, mediaFormat);
            }
            fa.h hVar2 = this.f32260a;
            if (hVar2 != null) {
                hVar2.a(j10, j11, p1Var, mediaFormat);
            }
        }

        @Override // ga.a
        public void b(long j10, float[] fArr) {
            ga.a aVar = this.f32263d;
            if (aVar != null) {
                aVar.b(j10, fArr);
            }
            ga.a aVar2 = this.f32261b;
            if (aVar2 != null) {
                aVar2.b(j10, fArr);
            }
        }

        @Override // ga.a
        public void c() {
            ga.a aVar = this.f32263d;
            if (aVar != null) {
                aVar.c();
            }
            ga.a aVar2 = this.f32261b;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // j8.r2.b
        public void k(int i10, Object obj) {
            if (i10 == 7) {
                this.f32260a = (fa.h) obj;
            } else if (i10 == 8) {
                this.f32261b = (ga.a) obj;
            } else if (i10 != 10000) {
            } else {
                ga.l lVar = (ga.l) obj;
                if (lVar == null) {
                    this.f32262c = null;
                    this.f32263d = null;
                    return;
                }
                this.f32262c = lVar.getVideoFrameMetadataListener();
                this.f32263d = lVar.getCameraMotionListener();
            }
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes2.dex */
    public static final class e implements g2 {

        /* renamed from: a */
        private final Object f32264a;

        /* renamed from: b */
        private j3 f32265b;

        public e(Object obj, j3 j3Var) {
            this.f32264a = obj;
            this.f32265b = j3Var;
        }

        @Override // j8.g2
        public j3 a() {
            return this.f32265b;
        }

        @Override // j8.g2
        public Object e() {
            return this.f32264a;
        }
    }

    static {
        m1.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public a1(p.b bVar, p2 p2Var) {
        a1 a1Var;
        Context applicationContext;
        k8.a apply;
        c cVar;
        d dVar;
        Handler handler;
        da.f fVar;
        Looper looper;
        int i10;
        l1 l1Var;
        ea.f fVar2 = new ea.f();
        this.f32218d = fVar2;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = ea.n0.f29713e;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [");
            sb2.append("ExoPlayerLib/2.17.1");
            sb2.append("] [");
            sb2.append(str);
            sb2.append("]");
            ea.r.f("ExoPlayerImpl", sb2.toString());
            applicationContext = bVar.f32671a.getApplicationContext();
            this.f32220e = applicationContext;
            apply = bVar.f32679i.apply(bVar.f32672b);
            this.f32246r = apply;
            this.f32237m0 = bVar.f32681k;
            this.f32225g0 = bVar.f32682l;
            this.Z = bVar.f32687q;
            this.f32213a0 = bVar.f32688r;
            this.f32229i0 = bVar.f32686p;
            this.E = bVar.f32695y;
            cVar = new c();
            this.f32256x = cVar;
            dVar = new d();
            this.f32257y = dVar;
            handler = new Handler(bVar.f32680j);
            w2[] a10 = bVar.f32674d.get().a(handler, cVar, cVar, cVar, cVar);
            this.f32224g = a10;
            ea.a.f(a10.length > 0);
            ba.a0 a0Var = bVar.f32676f.get();
            this.f32226h = a0Var;
            this.f32244q = bVar.f32675e.get();
            fVar = bVar.f32678h.get();
            this.f32250t = fVar;
            this.f32242p = bVar.f32689s;
            this.L = bVar.f32690t;
            this.f32252u = bVar.f32691u;
            this.f32254v = bVar.f32692v;
            this.N = bVar.f32696z;
            looper = bVar.f32680j;
            this.f32248s = looper;
            ea.c cVar2 = bVar.f32672b;
            this.f32255w = cVar2;
            p2 p2Var2 = p2Var == null ? this : p2Var;
            this.f32222f = p2Var2;
            this.f32234l = new ea.q<>(looper, cVar2, new q.b() { // from class: j8.p0
                @Override // ea.q.b
                public final void a(Object obj, ea.l lVar) {
                    a1.r0(a1.this, (p2.d) obj, lVar);
                }
            });
            this.f32236m = new CopyOnWriteArraySet<>();
            this.f32240o = new ArrayList();
            this.M = new q0.a(0);
            ba.b0 b0Var = new ba.b0(new z2[a10.length], new ba.q[a10.length], n3.f32654b, null);
            this.f32214b = b0Var;
            this.f32238n = new j3.b();
            p2.b e10 = new p2.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).d(29, a0Var.d()).e();
            this.f32216c = e10;
            this.O = new p2.b.a().b(e10).a(4).a(10).e();
            this.f32228i = cVar2.b(looper, null);
            l1.f fVar3 = new l1.f() { // from class: j8.q0
                @Override // j8.l1.f
                public final void a(l1.e eVar) {
                    a1.this.M1(eVar);
                }
            };
            this.f32230j = fVar3;
            this.f32247r0 = n2.k(b0Var);
            apply.c0(p2Var2, looper);
            i10 = ea.n0.f29709a;
            try {
                l1Var = new l1(a10, a0Var, b0Var, bVar.f32677g.get(), fVar, this.F, this.G, apply, this.L, bVar.f32693w, bVar.f32694x, this.N, looper, cVar2, fVar3, i10 < 31 ? new k8.o1() : b.a());
                a1Var = this;
            } catch (Throwable th) {
                th = th;
                a1Var = this;
            }
        } catch (Throwable th2) {
            th = th2;
            a1Var = this;
        }
        try {
            a1Var.f32232k = l1Var;
            a1Var.f32227h0 = 1.0f;
            a1Var.F = 0;
            b2 b2Var = b2.H;
            a1Var.P = b2Var;
            a1Var.f32245q0 = b2Var;
            a1Var.f32249s0 = -1;
            if (i10 < 21) {
                a1Var.f32223f0 = a1Var.H1(0);
            } else {
                a1Var.f32223f0 = ea.n0.F(applicationContext);
            }
            a1Var.f32231j0 = jb.s.t();
            a1Var.f32233k0 = true;
            a1Var.i(apply);
            fVar.h(new Handler(looper), apply);
            a1Var.o1(cVar);
            long j10 = bVar.f32673c;
            if (j10 > 0) {
                l1Var.u(j10);
            }
            j8.b bVar2 = new j8.b(bVar.f32671a, handler, cVar);
            a1Var.f32258z = bVar2;
            bVar2.b(bVar.f32685o);
            j8.d dVar2 = new j8.d(bVar.f32671a, handler, cVar);
            a1Var.A = dVar2;
            dVar2.m(bVar.f32683m ? a1Var.f32225g0 : null);
            f3 f3Var = new f3(bVar.f32671a, handler, cVar);
            a1Var.B = f3Var;
            f3Var.h(ea.n0.h0(a1Var.f32225g0.f33782c));
            o3 o3Var = new o3(bVar.f32671a);
            a1Var.C = o3Var;
            o3Var.a(bVar.f32684n != 0);
            p3 p3Var = new p3(bVar.f32671a);
            a1Var.D = p3Var;
            p3Var.a(bVar.f32684n == 2);
            a1Var.f32241o0 = t1(f3Var);
            a1Var.f32243p0 = fa.v.f30291e;
            a1Var.o2(1, 10, Integer.valueOf(a1Var.f32223f0));
            a1Var.o2(2, 10, Integer.valueOf(a1Var.f32223f0));
            a1Var.o2(1, 3, a1Var.f32225g0);
            a1Var.o2(2, 4, Integer.valueOf(a1Var.Z));
            a1Var.o2(2, 5, Integer.valueOf(a1Var.f32213a0));
            a1Var.o2(1, 9, Boolean.valueOf(a1Var.f32229i0));
            a1Var.o2(2, 7, dVar);
            a1Var.o2(6, 8, dVar);
            fVar2.e();
        } catch (Throwable th3) {
            th = th3;
            a1Var.f32218d.e();
            throw th;
        }
    }

    public static /* synthetic */ void A0(n2 n2Var, p2.d dVar) {
        a2(n2Var, dVar);
    }

    private Pair<Object, Long> A1(j3 j3Var, j3 j3Var2) {
        long P = P();
        if (!j3Var.q() && !j3Var2.q()) {
            Pair<Object, Long> j10 = j3Var.j(this.f32377a, this.f32238n, T(), ea.n0.C0(P));
            Object obj = ((Pair) ea.n0.j(j10)).first;
            if (j3Var2.b(obj) != -1) {
                return j10;
            }
            Object z02 = l1.z0(this.f32377a, this.f32238n, this.F, this.G, obj, j3Var, j3Var2);
            if (z02 != null) {
                j3Var2.h(z02, this.f32238n);
                int i10 = this.f32238n.f32510c;
                return i2(j3Var2, i10, j3Var2.n(i10, this.f32377a).d());
            }
            return i2(j3Var2, -1, -9223372036854775807L);
        }
        boolean z10 = !j3Var.q() && j3Var2.q();
        int z12 = z10 ? -1 : z1();
        if (z10) {
            P = -9223372036854775807L;
        }
        return i2(j3Var2, z12, P);
    }

    private void A2(boolean z10, n nVar) {
        n2 b10;
        if (z10) {
            b10 = l2(0, this.f32240o.size()).f(null);
        } else {
            n2 n2Var = this.f32247r0;
            b10 = n2Var.b(n2Var.f32636b);
            b10.f32651q = b10.f32653s;
            b10.f32652r = 0L;
        }
        n2 h10 = b10.h(1);
        if (nVar != null) {
            h10 = h10.f(nVar);
        }
        n2 n2Var2 = h10;
        this.H++;
        this.f32232k.h1();
        D2(n2Var2, 0, 1, false, n2Var2.f32635a.q() && !this.f32247r0.f32635a.q(), 4, y1(n2Var2), -1);
    }

    public static /* synthetic */ void B0(a1 a1Var, p2.d dVar) {
        a1Var.R1(dVar);
    }

    public static int B1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private void B2() {
        p2.b bVar = this.O;
        p2.b H = ea.n0.H(this.f32222f, this.f32216c);
        this.O = H;
        if (H.equals(bVar)) {
            return;
        }
        this.f32234l.i(13, new q.a() { // from class: j8.u0
            @Override // ea.q.a
            public final void b(Object obj) {
                a1.B0(a1.this, (p2.d) obj);
            }
        });
    }

    public void C2(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        n2 n2Var = this.f32247r0;
        if (n2Var.f32646l == z11 && n2Var.f32647m == i12) {
            return;
        }
        this.H++;
        n2 e10 = n2Var.e(z11, i12);
        this.f32232k.Q0(z11, i12);
        D2(e10, 0, i11, false, false, 5, -9223372036854775807L, -1);
    }

    public static /* synthetic */ void D0(int i10, p2.e eVar, p2.e eVar2, p2.d dVar) {
        T1(i10, eVar, eVar2, dVar);
    }

    private p2.e D1(long j10) {
        x1 x1Var;
        Object obj;
        int i10;
        int T = T();
        Object obj2 = null;
        if (this.f32247r0.f32635a.q()) {
            x1Var = null;
            obj = null;
            i10 = -1;
        } else {
            n2 n2Var = this.f32247r0;
            Object obj3 = n2Var.f32636b.f31793a;
            n2Var.f32635a.h(obj3, this.f32238n);
            i10 = this.f32247r0.f32635a.b(obj3);
            obj = obj3;
            obj2 = this.f32247r0.f32635a.n(T, this.f32377a).f32519a;
            x1Var = this.f32377a.f32521c;
        }
        long Z0 = ea.n0.Z0(j10);
        long Z02 = this.f32247r0.f32636b.b() ? ea.n0.Z0(F1(this.f32247r0)) : Z0;
        u.b bVar = this.f32247r0.f32636b;
        return new p2.e(obj2, T, x1Var, obj, i10, Z0, Z02, bVar.f31794b, bVar.f31795c);
    }

    private void D2(final n2 n2Var, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13) {
        n2 n2Var2 = this.f32247r0;
        this.f32247r0 = n2Var;
        Pair<Boolean, Integer> w12 = w1(n2Var, n2Var2, z11, i12, !n2Var2.f32635a.equals(n2Var.f32635a));
        boolean booleanValue = ((Boolean) w12.first).booleanValue();
        final int intValue = ((Integer) w12.second).intValue();
        b2 b2Var = this.P;
        if (booleanValue) {
            r3 = n2Var.f32635a.q() ? null : n2Var.f32635a.n(n2Var.f32635a.h(n2Var.f32636b.f31793a, this.f32238n).f32510c, this.f32377a).f32521c;
            this.f32245q0 = b2.H;
        }
        if (booleanValue || !n2Var2.f32644j.equals(n2Var.f32644j)) {
            this.f32245q0 = this.f32245q0.b().K(n2Var.f32644j).G();
            b2Var = q1();
        }
        boolean z12 = !b2Var.equals(this.P);
        this.P = b2Var;
        boolean z13 = n2Var2.f32646l != n2Var.f32646l;
        boolean z14 = n2Var2.f32639e != n2Var.f32639e;
        if (z14 || z13) {
            F2();
        }
        boolean z15 = n2Var2.f32641g;
        boolean z16 = n2Var.f32641g;
        boolean z17 = z15 != z16;
        if (z17) {
            E2(z16);
        }
        if (!n2Var2.f32635a.equals(n2Var.f32635a)) {
            this.f32234l.i(0, new q.a() { // from class: j8.i0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.G0(n2.this, i10, (p2.d) obj);
                }
            });
        }
        if (z11) {
            final p2.e E1 = E1(i12, n2Var2, i13);
            final p2.e D1 = D1(j10);
            this.f32234l.i(11, new q.a() { // from class: j8.t0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.D0(i12, E1, D1, (p2.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f32234l.i(1, new q.a() { // from class: j8.v0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.F0(x1.this, intValue, (p2.d) obj);
                }
            });
        }
        if (n2Var2.f32640f != n2Var.f32640f) {
            this.f32234l.i(10, new q.a() { // from class: j8.x0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.p0(n2.this, (p2.d) obj);
                }
            });
            if (n2Var.f32640f != null) {
                this.f32234l.i(10, new q.a() { // from class: j8.f0
                    @Override // ea.q.a
                    public final void b(Object obj) {
                        a1.z0(n2.this, (p2.d) obj);
                    }
                });
            }
        }
        ba.b0 b0Var = n2Var2.f32643i;
        ba.b0 b0Var2 = n2Var.f32643i;
        if (b0Var != b0Var2) {
            this.f32226h.e(b0Var2.f5047e);
            final ba.u uVar = new ba.u(n2Var.f32643i.f5045c);
            this.f32234l.i(2, new q.a() { // from class: j8.k0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.s0(n2.this, uVar, (p2.d) obj);
                }
            });
            this.f32234l.i(2, new q.a() { // from class: j8.e0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.y0(n2.this, (p2.d) obj);
                }
            });
        }
        if (z12) {
            final b2 b2Var2 = this.P;
            this.f32234l.i(14, new q.a() { // from class: j8.w0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.q0(b2.this, (p2.d) obj);
                }
            });
        }
        if (z17) {
            this.f32234l.i(3, new q.a() { // from class: j8.g0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.A0(n2.this, (p2.d) obj);
                }
            });
        }
        if (z14 || z13) {
            this.f32234l.i(-1, new q.a() { // from class: j8.y0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.u0(n2.this, (p2.d) obj);
                }
            });
        }
        if (z14) {
            this.f32234l.i(4, new q.a() { // from class: j8.z0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.v0(n2.this, (p2.d) obj);
                }
            });
        }
        if (z13) {
            this.f32234l.i(5, new q.a() { // from class: j8.j0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.L0(n2.this, i11, (p2.d) obj);
                }
            });
        }
        if (n2Var2.f32647m != n2Var.f32647m) {
            this.f32234l.i(6, new q.a() { // from class: j8.d0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.x0(n2.this, (p2.d) obj);
                }
            });
        }
        if (I1(n2Var2) != I1(n2Var)) {
            this.f32234l.i(7, new q.a() { // from class: j8.c0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.w0(n2.this, (p2.d) obj);
                }
            });
        }
        if (!n2Var2.f32648n.equals(n2Var.f32648n)) {
            this.f32234l.i(12, new q.a() { // from class: j8.h0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.J0(n2.this, (p2.d) obj);
                }
            });
        }
        if (z10) {
            this.f32234l.i(-1, new q.a() { // from class: j8.o0
                @Override // ea.q.a
                public final void b(Object obj) {
                    ((p2.d) obj).X();
                }
            });
        }
        B2();
        this.f32234l.f();
        if (n2Var2.f32649o != n2Var.f32649o) {
            Iterator<p.a> it = this.f32236m.iterator();
            while (it.hasNext()) {
                it.next().D(n2Var.f32649o);
            }
        }
        if (n2Var2.f32650p != n2Var.f32650p) {
            Iterator<p.a> it2 = this.f32236m.iterator();
            while (it2.hasNext()) {
                it2.next().A(n2Var.f32650p);
            }
        }
    }

    public static /* synthetic */ void E0(int i10, p2.d dVar) {
        dVar.r(i10);
    }

    private p2.e E1(int i10, n2 n2Var, int i11) {
        int i12;
        Object obj;
        x1 x1Var;
        Object obj2;
        int i13;
        long j10;
        long F1;
        j3.b bVar = new j3.b();
        if (n2Var.f32635a.q()) {
            i12 = i11;
            obj = null;
            x1Var = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = n2Var.f32636b.f31793a;
            n2Var.f32635a.h(obj3, bVar);
            int i14 = bVar.f32510c;
            i12 = i14;
            obj2 = obj3;
            i13 = n2Var.f32635a.b(obj3);
            obj = n2Var.f32635a.n(i14, this.f32377a).f32519a;
            x1Var = this.f32377a.f32521c;
        }
        if (i10 == 0) {
            if (n2Var.f32636b.b()) {
                u.b bVar2 = n2Var.f32636b;
                j10 = bVar.d(bVar2.f31794b, bVar2.f31795c);
                F1 = F1(n2Var);
            } else {
                if (n2Var.f32636b.f31797e != -1) {
                    j10 = F1(this.f32247r0);
                } else {
                    j10 = bVar.f32512e + bVar.f32511d;
                }
                F1 = j10;
            }
        } else if (n2Var.f32636b.b()) {
            j10 = n2Var.f32653s;
            F1 = F1(n2Var);
        } else {
            j10 = bVar.f32512e + n2Var.f32653s;
            F1 = j10;
        }
        long Z0 = ea.n0.Z0(j10);
        long Z02 = ea.n0.Z0(F1);
        u.b bVar3 = n2Var.f32636b;
        return new p2.e(obj, i12, x1Var, obj2, i13, Z0, Z02, bVar3.f31794b, bVar3.f31795c);
    }

    private void E2(boolean z10) {
        ea.c0 c0Var = this.f32237m0;
        if (c0Var != null) {
            if (z10 && !this.f32239n0) {
                c0Var.a(0);
                this.f32239n0 = true;
            } else if (z10 || !this.f32239n0) {
            } else {
                c0Var.b(0);
                this.f32239n0 = false;
            }
        }
    }

    public static /* synthetic */ void F0(x1 x1Var, int i10, p2.d dVar) {
        dVar.y(x1Var, i10);
    }

    private static long F1(n2 n2Var) {
        j3.c cVar = new j3.c();
        j3.b bVar = new j3.b();
        n2Var.f32635a.h(n2Var.f32636b.f31793a, bVar);
        if (n2Var.f32637c == -9223372036854775807L) {
            return n2Var.f32635a.n(bVar.f32510c, cVar).e();
        }
        return bVar.p() + n2Var.f32637c;
    }

    public void F2() {
        int S = S();
        boolean z10 = true;
        if (S != 1) {
            if (S == 2 || S == 3) {
                this.C.b((!E() || x1()) ? false : false);
                this.D.b(E());
                return;
            } else if (S != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    public static /* synthetic */ void G0(n2 n2Var, int i10, p2.d dVar) {
        S1(n2Var, i10, dVar);
    }

    /* renamed from: G1 */
    public void L1(l1.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.H - eVar.f32599c;
        this.H = i10;
        boolean z11 = true;
        if (eVar.f32600d) {
            this.I = eVar.f32601e;
            this.J = true;
        }
        if (eVar.f32602f) {
            this.K = eVar.f32603g;
        }
        if (i10 == 0) {
            j3 j3Var = eVar.f32598b.f32635a;
            if (!this.f32247r0.f32635a.q() && j3Var.q()) {
                this.f32249s0 = -1;
                this.f32253u0 = 0L;
                this.f32251t0 = 0;
            }
            if (!j3Var.q()) {
                List<j3> E = ((s2) j3Var).E();
                ea.a.f(E.size() == this.f32240o.size());
                for (int i11 = 0; i11 < E.size(); i11++) {
                    this.f32240o.get(i11).f32265b = E.get(i11);
                }
            }
            if (this.J) {
                if (eVar.f32598b.f32636b.equals(this.f32247r0.f32636b) && eVar.f32598b.f32638d == this.f32247r0.f32653s) {
                    z11 = false;
                }
                if (z11) {
                    if (!j3Var.q() && !eVar.f32598b.f32636b.b()) {
                        n2 n2Var = eVar.f32598b;
                        j11 = k2(j3Var, n2Var.f32636b, n2Var.f32638d);
                    } else {
                        j11 = eVar.f32598b.f32638d;
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.J = false;
            D2(eVar.f32598b, 1, this.K, false, z10, this.I, j10, -1);
        }
    }

    private void G2() {
        this.f32218d.b();
        if (Thread.currentThread() != x().getThread()) {
            String C = ea.n0.C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), x().getThread().getName());
            if (!this.f32233k0) {
                ea.r.i("ExoPlayerImpl", C, this.f32235l0 ? null : new IllegalStateException());
                this.f32235l0 = true;
                return;
            }
            throw new IllegalStateException(C);
        }
    }

    public static /* synthetic */ void H0(p2.d dVar) {
        N1(dVar);
    }

    private int H1(int i10) {
        AudioTrack audioTrack = this.S;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.S.release();
            this.S = null;
        }
        if (this.S == null) {
            this.S = new AudioTrack(3, TTAdSdk.INIT_LOCAL_FAIL_CODE, 4, 2, 2, 0, i10);
        }
        return this.S.getAudioSessionId();
    }

    private static boolean I1(n2 n2Var) {
        return n2Var.f32639e == 3 && n2Var.f32646l && n2Var.f32647m == 0;
    }

    public static /* synthetic */ void J0(n2 n2Var, p2.d dVar) {
        g2(n2Var, dVar);
    }

    public static /* synthetic */ void K0(int i10, int i11, p2.d dVar) {
        dVar.P(i10, i11);
    }

    public /* synthetic */ void K1(p2.d dVar, ea.l lVar) {
        dVar.T(this.f32222f, new p2.c(lVar));
    }

    public static /* synthetic */ void L0(n2 n2Var, int i10, p2.d dVar) {
        d2(n2Var, i10, dVar);
    }

    public /* synthetic */ void M1(final l1.e eVar) {
        this.f32228i.post(new Runnable() { // from class: j8.r0
            @Override // java.lang.Runnable
            public final void run() {
                a1.this.L1(eVar);
            }
        });
    }

    public static /* synthetic */ void N1(p2.d dVar) {
        dVar.K(n.f(new n1(1), 1003));
    }

    public /* synthetic */ void R1(p2.d dVar) {
        dVar.D(this.O);
    }

    public static /* synthetic */ void S1(n2 n2Var, int i10, p2.d dVar) {
        dVar.g0(n2Var.f32635a, i10);
    }

    public static /* synthetic */ void T1(int i10, p2.e eVar, p2.e eVar2, p2.d dVar) {
        dVar.U(i10);
        dVar.V(eVar, eVar2, i10);
    }

    public static /* synthetic */ void V1(n2 n2Var, p2.d dVar) {
        dVar.e0(n2Var.f32640f);
    }

    public static /* synthetic */ void W1(n2 n2Var, p2.d dVar) {
        dVar.K(n2Var.f32640f);
    }

    public static /* synthetic */ void X1(n2 n2Var, ba.u uVar, p2.d dVar) {
        dVar.Z(n2Var.f32642h, uVar);
    }

    public static /* synthetic */ void Y1(n2 n2Var, p2.d dVar) {
        dVar.O(n2Var.f32643i.f5046d);
    }

    public static /* synthetic */ void a2(n2 n2Var, p2.d dVar) {
        dVar.x(n2Var.f32641g);
        dVar.W(n2Var.f32641g);
    }

    public static /* synthetic */ void b2(n2 n2Var, p2.d dVar) {
        dVar.d0(n2Var.f32646l, n2Var.f32639e);
    }

    public static /* synthetic */ void c2(n2 n2Var, p2.d dVar) {
        dVar.z(n2Var.f32639e);
    }

    public static /* synthetic */ void d2(n2 n2Var, int i10, p2.d dVar) {
        dVar.h0(n2Var.f32646l, i10);
    }

    public static /* synthetic */ void e2(n2 n2Var, p2.d dVar) {
        dVar.w(n2Var.f32647m);
    }

    public static /* synthetic */ void f2(n2 n2Var, p2.d dVar) {
        dVar.k0(I1(n2Var));
    }

    public static /* synthetic */ void g2(n2 n2Var, p2.d dVar) {
        dVar.d(n2Var.f32648n);
    }

    private n2 h2(n2 n2Var, j3 j3Var, Pair<Object, Long> pair) {
        int i10;
        long j10;
        ea.a.a(j3Var.q() || pair != null);
        j3 j3Var2 = n2Var.f32635a;
        n2 j11 = n2Var.j(j3Var);
        if (j3Var.q()) {
            u.b l10 = n2.l();
            long C0 = ea.n0.C0(this.f32253u0);
            n2 b10 = j11.c(l10, C0, C0, C0, 0L, i9.y0.f31861d, this.f32214b, jb.s.t()).b(l10);
            b10.f32651q = b10.f32653s;
            return b10;
        }
        Object obj = j11.f32636b.f31793a;
        boolean z10 = !obj.equals(((Pair) ea.n0.j(pair)).first);
        u.b bVar = z10 ? new u.b(pair.first) : j11.f32636b;
        long longValue = ((Long) pair.second).longValue();
        long C02 = ea.n0.C0(P());
        if (!j3Var2.q()) {
            C02 -= j3Var2.h(obj, this.f32238n).p();
        }
        if (z10 || longValue < C02) {
            ea.a.f(!bVar.b());
            n2 b11 = j11.c(bVar, longValue, longValue, longValue, 0L, z10 ? i9.y0.f31861d : j11.f32642h, z10 ? this.f32214b : j11.f32643i, z10 ? jb.s.t() : j11.f32644j).b(bVar);
            b11.f32651q = longValue;
            return b11;
        }
        if (i10 == 0) {
            int b12 = j3Var.b(j11.f32645k.f31793a);
            if (b12 == -1 || j3Var.f(b12, this.f32238n).f32510c != j3Var.h(bVar.f31793a, this.f32238n).f32510c) {
                j3Var.h(bVar.f31793a, this.f32238n);
                if (bVar.b()) {
                    j10 = this.f32238n.d(bVar.f31794b, bVar.f31795c);
                } else {
                    j10 = this.f32238n.f32511d;
                }
                j11 = j11.c(bVar, j11.f32653s, j11.f32653s, j11.f32638d, j10 - j11.f32653s, j11.f32642h, j11.f32643i, j11.f32644j).b(bVar);
                j11.f32651q = j10;
            }
        } else {
            ea.a.f(!bVar.b());
            long max = Math.max(0L, j11.f32652r - (longValue - C02));
            long j12 = j11.f32651q;
            if (j11.f32645k.equals(j11.f32636b)) {
                j12 = longValue + max;
            }
            j11 = j11.c(bVar, longValue, longValue, longValue, max, j11.f32642h, j11.f32643i, j11.f32644j);
            j11.f32651q = j12;
        }
        return j11;
    }

    private Pair<Object, Long> i2(j3 j3Var, int i10, long j10) {
        if (j3Var.q()) {
            this.f32249s0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f32253u0 = j10;
            this.f32251t0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= j3Var.p()) {
            i10 = j3Var.a(this.G);
            j10 = j3Var.n(i10, this.f32377a).d();
        }
        return j3Var.j(this.f32377a, this.f32238n, i10, ea.n0.C0(j10));
    }

    public void j2(final int i10, final int i11) {
        if (i10 == this.f32215b0 && i11 == this.f32217c0) {
            return;
        }
        this.f32215b0 = i10;
        this.f32217c0 = i11;
        this.f32234l.l(24, new q.a() { // from class: j8.s0
            @Override // ea.q.a
            public final void b(Object obj) {
                a1.K0(i10, i11, (p2.d) obj);
            }
        });
    }

    private long k2(j3 j3Var, u.b bVar, long j10) {
        j3Var.h(bVar.f31793a, this.f32238n);
        return j10 + this.f32238n.p();
    }

    private n2 l2(int i10, int i11) {
        boolean z10 = false;
        ea.a.a(i10 >= 0 && i11 >= i10 && i11 <= this.f32240o.size());
        int T = T();
        j3 w10 = w();
        int size = this.f32240o.size();
        this.H++;
        m2(i10, i11);
        j3 u12 = u1();
        n2 h22 = h2(this.f32247r0, u12, A1(w10, u12));
        int i12 = h22.f32639e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && T >= h22.f32635a.p()) {
            z10 = true;
        }
        if (z10) {
            h22 = h22.h(4);
        }
        this.f32232k.o0(i10, i11, this.M);
        return h22;
    }

    private void m2(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f32240o.remove(i12);
        }
        this.M = this.M.c(i10, i11);
    }

    private void n2() {
        if (this.W != null) {
            v1(this.f32257y).n(10000).m(null).l();
            this.W.i(this.f32256x);
            this.W = null;
        }
        TextureView textureView = this.Y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f32256x) {
                ea.r.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Y.setSurfaceTextureListener(null);
            }
            this.Y = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f32256x);
            this.V = null;
        }
    }

    public static /* synthetic */ void o0(boolean z10, p2.d dVar) {
        dVar.C(z10);
    }

    private void o2(int i10, int i11, Object obj) {
        w2[] w2VarArr;
        for (w2 w2Var : this.f32224g) {
            if (w2Var.e() == i10) {
                v1(w2Var).n(i11).m(obj).l();
            }
        }
    }

    public static /* synthetic */ void p0(n2 n2Var, p2.d dVar) {
        V1(n2Var, dVar);
    }

    private List<i2.c> p1(int i10, List<i9.u> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            i2.c cVar = new i2.c(list.get(i11), this.f32242p);
            arrayList.add(cVar);
            this.f32240o.add(i11 + i10, new e(cVar.f32483b, cVar.f32482a.Q()));
        }
        this.M = this.M.i(i10, arrayList.size());
        return arrayList;
    }

    public void p2() {
        o2(1, 2, Float.valueOf(this.f32227h0 * this.A.g()));
    }

    public static /* synthetic */ void q0(b2 b2Var, p2.d dVar) {
        dVar.N(b2Var);
    }

    public b2 q1() {
        j3 w10 = w();
        if (w10.q()) {
            return this.f32245q0;
        }
        return this.f32245q0.b().I(w10.n(T(), this.f32377a).f32521c.f32822d).G();
    }

    public static /* synthetic */ void r0(a1 a1Var, p2.d dVar, ea.l lVar) {
        a1Var.K1(dVar, lVar);
    }

    public static /* synthetic */ void s0(n2 n2Var, ba.u uVar, p2.d dVar) {
        X1(n2Var, uVar, dVar);
    }

    public static /* synthetic */ void t0(float f10, p2.d dVar) {
        dVar.Y(f10);
    }

    public static m t1(f3 f3Var) {
        return new m(0, f3Var.d(), f3Var.c());
    }

    public static /* synthetic */ void u0(n2 n2Var, p2.d dVar) {
        b2(n2Var, dVar);
    }

    private j3 u1() {
        return new s2(this.f32240o, this.M);
    }

    private void u2(List<i9.u> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int z12 = z1();
        long currentPosition = getCurrentPosition();
        boolean z11 = true;
        this.H++;
        if (!this.f32240o.isEmpty()) {
            m2(0, this.f32240o.size());
        }
        List<i2.c> p12 = p1(0, list);
        j3 u12 = u1();
        if (!u12.q() && i10 >= u12.p()) {
            throw new t1(u12, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i11 = u12.a(this.G);
        } else if (i10 == -1) {
            i11 = z12;
            j11 = currentPosition;
        } else {
            i11 = i10;
            j11 = j10;
        }
        n2 h22 = h2(this.f32247r0, u12, i2(u12, i11, j11));
        int i12 = h22.f32639e;
        if (i11 != -1 && i12 != 1) {
            i12 = (u12.q() || i11 >= u12.p()) ? 4 : 2;
        }
        n2 h10 = h22.h(i12);
        this.f32232k.N0(p12, i11, ea.n0.C0(j11), this.M);
        D2(h10, 0, 1, false, (this.f32247r0.f32636b.f31793a.equals(h10.f32636b.f31793a) || this.f32247r0.f32635a.q()) ? false : false, 4, y1(h10), -1);
    }

    public static /* synthetic */ void v0(n2 n2Var, p2.d dVar) {
        c2(n2Var, dVar);
    }

    private r2 v1(r2.b bVar) {
        int z12 = z1();
        l1 l1Var = this.f32232k;
        return new r2(l1Var, bVar, this.f32247r0.f32635a, z12 == -1 ? 0 : z12, this.f32255w, l1Var.B());
    }

    private void v2(SurfaceHolder surfaceHolder) {
        this.X = false;
        this.V = surfaceHolder;
        surfaceHolder.addCallback(this.f32256x);
        Surface surface = this.V.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.V.getSurfaceFrame();
            j2(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        j2(0, 0);
    }

    public static /* synthetic */ void w0(n2 n2Var, p2.d dVar) {
        f2(n2Var, dVar);
    }

    private Pair<Boolean, Integer> w1(n2 n2Var, n2 n2Var2, boolean z10, int i10, boolean z11) {
        j3 j3Var = n2Var2.f32635a;
        j3 j3Var2 = n2Var.f32635a;
        if (j3Var2.q() && j3Var.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (j3Var2.q() != j3Var.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!j3Var.n(j3Var.h(n2Var2.f32636b.f31793a, this.f32238n).f32510c, this.f32377a).f32519a.equals(j3Var2.n(j3Var2.h(n2Var.f32636b.f31793a, this.f32238n).f32510c, this.f32377a).f32519a)) {
            if (z10 && i10 == 0) {
                i11 = 1;
            } else if (z10 && i10 == 1) {
                i11 = 2;
            } else if (!z11) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
        } else if (z10 && i10 == 0 && n2Var2.f32636b.f31796d < n2Var.f32636b.f31796d) {
            return new Pair<>(Boolean.TRUE, 0);
        } else {
            return new Pair<>(Boolean.FALSE, -1);
        }
    }

    public void w2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        x2(surface);
        this.U = surface;
    }

    public static /* synthetic */ void x0(n2 n2Var, p2.d dVar) {
        e2(n2Var, dVar);
    }

    public void x2(Object obj) {
        boolean z10;
        ArrayList<r2> arrayList = new ArrayList();
        w2[] w2VarArr = this.f32224g;
        int length = w2VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            w2 w2Var = w2VarArr[i10];
            if (w2Var.e() == 2) {
                arrayList.add(v1(w2Var).n(1).m(obj).l());
            }
            i10++;
        }
        Object obj2 = this.T;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (r2 r2Var : arrayList) {
                    r2Var.a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.T;
            Surface surface = this.U;
            if (obj3 == surface) {
                surface.release();
                this.U = null;
            }
        }
        this.T = obj;
        if (z10) {
            A2(false, n.f(new n1(3), 1003));
        }
    }

    public static /* synthetic */ void y0(n2 n2Var, p2.d dVar) {
        Y1(n2Var, dVar);
    }

    private long y1(n2 n2Var) {
        if (n2Var.f32635a.q()) {
            return ea.n0.C0(this.f32253u0);
        }
        if (n2Var.f32636b.b()) {
            return n2Var.f32653s;
        }
        return k2(n2Var.f32635a, n2Var.f32636b, n2Var.f32653s);
    }

    public static /* synthetic */ void z0(n2 n2Var, p2.d dVar) {
        W1(n2Var, dVar);
    }

    private int z1() {
        if (this.f32247r0.f32635a.q()) {
            return this.f32249s0;
        }
        n2 n2Var = this.f32247r0;
        return n2Var.f32635a.h(n2Var.f32636b.f31793a, this.f32238n).f32510c;
    }

    @Override // j8.p2
    public ba.u A() {
        G2();
        return new ba.u(this.f32247r0.f32643i.f5045c);
    }

    @Override // j8.p
    public int B(int i10) {
        G2();
        return this.f32224g[i10].e();
    }

    @Override // j8.p2
    public void C(int i10, long j10) {
        G2();
        this.f32246r.B();
        j3 j3Var = this.f32247r0.f32635a;
        if (i10 >= 0 && (j3Var.q() || i10 < j3Var.p())) {
            this.H++;
            if (d()) {
                ea.r.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                l1.e eVar = new l1.e(this.f32247r0);
                eVar.b(1);
                this.f32230j.a(eVar);
                return;
            }
            int i11 = S() != 1 ? 2 : 1;
            int T = T();
            n2 h22 = h2(this.f32247r0.h(i11), j3Var, i2(j3Var, i10, j10));
            this.f32232k.B0(j3Var, i10, ea.n0.C0(j10));
            D2(h22, 0, 1, true, true, 1, y1(h22), T);
            return;
        }
        throw new t1(j3Var, i10, j10);
    }

    @Override // j8.p2
    /* renamed from: C1 */
    public n l() {
        G2();
        return this.f32247r0.f32640f;
    }

    @Override // j8.p2
    public p2.b D() {
        G2();
        return this.O;
    }

    @Override // j8.p2
    public boolean E() {
        G2();
        return this.f32247r0.f32646l;
    }

    @Override // j8.p2
    public void F(final boolean z10) {
        G2();
        if (this.G != z10) {
            this.G = z10;
            this.f32232k.X0(z10);
            this.f32234l.i(9, new q.a() { // from class: j8.l0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.o0(z10, (p2.d) obj);
                }
            });
            B2();
            this.f32234l.f();
        }
    }

    @Override // j8.p
    public int G() {
        G2();
        return this.f32224g.length;
    }

    @Override // j8.p2
    public long H() {
        G2();
        return 3000L;
    }

    @Override // j8.p2
    public int I() {
        G2();
        if (this.f32247r0.f32635a.q()) {
            return this.f32251t0;
        }
        n2 n2Var = this.f32247r0;
        return n2Var.f32635a.b(n2Var.f32636b.f31793a);
    }

    @Override // j8.p2
    public void J(TextureView textureView) {
        G2();
        if (textureView == null || textureView != this.Y) {
            return;
        }
        r1();
    }

    @Override // j8.p2
    public fa.v K() {
        G2();
        return this.f32243p0;
    }

    @Override // j8.p2
    public int M() {
        G2();
        if (d()) {
            return this.f32247r0.f32636b.f31795c;
        }
        return -1;
    }

    @Override // j8.p2
    public long O() {
        G2();
        return this.f32254v;
    }

    @Override // j8.p2
    public long P() {
        G2();
        if (d()) {
            n2 n2Var = this.f32247r0;
            n2Var.f32635a.h(n2Var.f32636b.f31793a, this.f32238n);
            n2 n2Var2 = this.f32247r0;
            if (n2Var2.f32637c == -9223372036854775807L) {
                return n2Var2.f32635a.n(T(), this.f32377a).d();
            }
            return this.f32238n.o() + ea.n0.Z0(this.f32247r0.f32637c);
        }
        return getCurrentPosition();
    }

    @Override // j8.p2
    public long Q() {
        G2();
        if (d()) {
            n2 n2Var = this.f32247r0;
            if (n2Var.f32645k.equals(n2Var.f32636b)) {
                return ea.n0.Z0(this.f32247r0.f32651q);
            }
            return getDuration();
        }
        return Y();
    }

    @Override // j8.p2
    public int S() {
        G2();
        return this.f32247r0.f32639e;
    }

    @Override // j8.p2
    public int T() {
        G2();
        int z12 = z1();
        if (z12 == -1) {
            return 0;
        }
        return z12;
    }

    @Override // j8.p2
    public void U(final int i10) {
        G2();
        if (this.F != i10) {
            this.F = i10;
            this.f32232k.U0(i10);
            this.f32234l.i(8, new q.a() { // from class: j8.m0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.E0(i10, (p2.d) obj);
                }
            });
            B2();
            this.f32234l.f();
        }
    }

    @Override // j8.p2
    public void V(SurfaceView surfaceView) {
        G2();
        s1(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // j8.p2
    public int W() {
        G2();
        return this.F;
    }

    @Override // j8.p2
    public boolean X() {
        G2();
        return this.G;
    }

    @Override // j8.p2
    public long Y() {
        G2();
        if (this.f32247r0.f32635a.q()) {
            return this.f32253u0;
        }
        n2 n2Var = this.f32247r0;
        if (n2Var.f32645k.f31796d != n2Var.f32636b.f31796d) {
            return n2Var.f32635a.n(T(), this.f32377a).f();
        }
        long j10 = n2Var.f32651q;
        if (this.f32247r0.f32645k.b()) {
            n2 n2Var2 = this.f32247r0;
            j3.b h10 = n2Var2.f32635a.h(n2Var2.f32645k.f31793a, this.f32238n);
            long h11 = h10.h(this.f32247r0.f32645k.f31794b);
            j10 = h11 == Long.MIN_VALUE ? h10.f32511d : h11;
        }
        n2 n2Var3 = this.f32247r0;
        return ea.n0.Z0(k2(n2Var3.f32635a, n2Var3.f32645k, j10));
    }

    @Override // j8.p2
    public void a() {
        G2();
        boolean E = E();
        int p10 = this.A.p(E, 2);
        C2(E, p10, B1(E, p10));
        n2 n2Var = this.f32247r0;
        if (n2Var.f32639e != 1) {
            return;
        }
        n2 f10 = n2Var.f(null);
        n2 h10 = f10.h(f10.f32635a.q() ? 4 : 2);
        this.H++;
        this.f32232k.j0();
        D2(h10, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // j8.p2
    public void b(o2 o2Var) {
        G2();
        if (o2Var == null) {
            o2Var = o2.f32663d;
        }
        if (this.f32247r0.f32648n.equals(o2Var)) {
            return;
        }
        n2 g10 = this.f32247r0.g(o2Var);
        this.H++;
        this.f32232k.S0(o2Var);
        D2(g10, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // j8.p2
    public b2 b0() {
        G2();
        return this.P;
    }

    @Override // j8.p2
    public o2 c() {
        G2();
        return this.f32247r0.f32648n;
    }

    @Override // j8.p2
    public long c0() {
        G2();
        return this.f32252u;
    }

    @Override // j8.p2
    public boolean d() {
        G2();
        return this.f32247r0.f32636b.b();
    }

    @Override // j8.p
    @Deprecated
    public void d0(i9.u uVar, boolean z10, boolean z11) {
        G2();
        r2(uVar, z10);
        a();
    }

    @Override // j8.p2
    public long e() {
        G2();
        return ea.n0.Z0(this.f32247r0.f32652r);
    }

    @Override // j8.p2
    public long getCurrentPosition() {
        G2();
        return ea.n0.Z0(y1(this.f32247r0));
    }

    @Override // j8.p2
    public long getDuration() {
        G2();
        if (d()) {
            n2 n2Var = this.f32247r0;
            u.b bVar = n2Var.f32636b;
            n2Var.f32635a.h(bVar.f31793a, this.f32238n);
            return ea.n0.Z0(this.f32238n.d(bVar.f31794b, bVar.f31795c));
        }
        return f0();
    }

    @Override // j8.p2
    public void h(SurfaceView surfaceView) {
        G2();
        if (surfaceView instanceof fa.g) {
            n2();
            x2(surfaceView);
            v2(surfaceView.getHolder());
        } else if (surfaceView instanceof ga.l) {
            n2();
            this.W = (ga.l) surfaceView;
            v1(this.f32257y).n(10000).m(this.W).l();
            this.W.d(this.f32256x);
            x2(this.W.getVideoSurface());
            v2(surfaceView.getHolder());
        } else {
            y2(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // j8.p2
    public void i(p2.d dVar) {
        ea.a.e(dVar);
        this.f32234l.c(dVar);
    }

    @Override // j8.p2
    public void j(int i10, int i11) {
        G2();
        n2 l22 = l2(i10, Math.min(i11, this.f32240o.size()));
        D2(l22, 0, 1, false, !l22.f32636b.f31793a.equals(this.f32247r0.f32636b.f31793a), 4, y1(l22), -1);
    }

    @Override // j8.p2
    public void m(boolean z10) {
        G2();
        int p10 = this.A.p(z10, S());
        C2(z10, p10, B1(z10, p10));
    }

    @Override // j8.p
    public p1 n() {
        G2();
        return this.Q;
    }

    public void o1(p.a aVar) {
        this.f32236m.add(aVar);
    }

    @Override // j8.p2
    public void p(p2.d dVar) {
        ea.a.e(dVar);
        this.f32234l.k(dVar);
    }

    @Override // j8.p2
    public List<r9.b> q() {
        G2();
        return this.f32231j0;
    }

    public void q2(i9.u uVar) {
        G2();
        s2(Collections.singletonList(uVar));
    }

    @Override // j8.p2
    public int r() {
        G2();
        if (d()) {
            return this.f32247r0.f32636b.f31794b;
        }
        return -1;
    }

    public void r1() {
        G2();
        n2();
        x2(null);
        j2(0, 0);
    }

    public void r2(i9.u uVar, boolean z10) {
        G2();
        t2(Collections.singletonList(uVar), z10);
    }

    @Override // j8.p2
    public void release() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = ea.n0.f29713e;
        String b10 = m1.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(b10).length());
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append("ExoPlayerLib/2.17.1");
        sb2.append("] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(b10);
        sb2.append("]");
        ea.r.f("ExoPlayerImpl", sb2.toString());
        G2();
        if (ea.n0.f29709a < 21 && (audioTrack = this.S) != null) {
            audioTrack.release();
            this.S = null;
        }
        this.f32258z.b(false);
        this.B.g();
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f32232k.l0()) {
            this.f32234l.l(10, new q.a() { // from class: j8.n0
                @Override // ea.q.a
                public final void b(Object obj) {
                    a1.H0((p2.d) obj);
                }
            });
        }
        this.f32234l.j();
        this.f32228i.e(null);
        this.f32250t.g(this.f32246r);
        n2 h10 = this.f32247r0.h(1);
        this.f32247r0 = h10;
        n2 b11 = h10.b(h10.f32636b);
        this.f32247r0 = b11;
        b11.f32651q = b11.f32653s;
        this.f32247r0.f32652r = 0L;
        this.f32246r.release();
        n2();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        if (this.f32239n0) {
            ((ea.c0) ea.a.e(this.f32237m0)).b(0);
            this.f32239n0 = false;
        }
        this.f32231j0 = jb.s.t();
    }

    public void s1(SurfaceHolder surfaceHolder) {
        G2();
        if (surfaceHolder == null || surfaceHolder != this.V) {
            return;
        }
        r1();
    }

    public void s2(List<i9.u> list) {
        G2();
        t2(list, true);
    }

    @Override // j8.p2
    public void setVolume(float f10) {
        G2();
        final float p10 = ea.n0.p(f10, 0.0f, 1.0f);
        if (this.f32227h0 == p10) {
            return;
        }
        this.f32227h0 = p10;
        p2();
        this.f32234l.l(22, new q.a() { // from class: j8.b0
            @Override // ea.q.a
            public final void b(Object obj) {
                a1.t0(p10, (p2.d) obj);
            }
        });
    }

    @Override // j8.p2
    public void stop() {
        G2();
        z2(false);
    }

    public void t2(List<i9.u> list, boolean z10) {
        G2();
        u2(list, -1, -9223372036854775807L, z10);
    }

    @Override // j8.p2
    public int u() {
        G2();
        return this.f32247r0.f32647m;
    }

    @Override // j8.p2
    public n3 v() {
        G2();
        return this.f32247r0.f32643i.f5046d;
    }

    @Override // j8.p2
    public j3 w() {
        G2();
        return this.f32247r0.f32635a;
    }

    @Override // j8.p2
    public Looper x() {
        return this.f32248s;
    }

    public boolean x1() {
        G2();
        return this.f32247r0.f32650p;
    }

    public void y2(SurfaceHolder surfaceHolder) {
        G2();
        if (surfaceHolder == null) {
            r1();
            return;
        }
        n2();
        this.X = true;
        this.V = surfaceHolder;
        surfaceHolder.addCallback(this.f32256x);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            x2(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            j2(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        x2(null);
        j2(0, 0);
    }

    @Override // j8.p2
    public void z(TextureView textureView) {
        G2();
        if (textureView == null) {
            r1();
            return;
        }
        n2();
        this.Y = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ea.r.h("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f32256x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            x2(null);
            j2(0, 0);
            return;
        }
        w2(surfaceTexture);
        j2(textureView.getWidth(), textureView.getHeight());
    }

    public void z2(boolean z10) {
        G2();
        this.A.p(E(), 1);
        A2(z10, null);
        this.f32231j0 = jb.s.t();
    }
}
