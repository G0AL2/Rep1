package com.brentvatne.exoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import ba.a;
import ba.l;
import ba.s;
import ba.u;
import ba.w;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.n0;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.d;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.gms.common.api.Api;
import com.inmobi.media.jh;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import da.a0;
import da.f;
import da.l;
import da.q;
import da.s;
import fa.v;
import i9.d0;
import i9.j0;
import i9.t0;
import i9.u;
import i9.w0;
import i9.y0;
import j8.b2;
import j8.j3;
import j8.m;
import j8.m2;
import j8.n3;
import j8.o2;
import j8.p;
import j8.p1;
import j8.p2;
import j8.q2;
import j8.x1;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import n8.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReactExoplayerView.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class g extends FrameLayout implements LifecycleEventListener, p2.d, f.a, t2.b, AudioManager.OnAudioFocusChangeListener, k {

    /* renamed from: v0  reason: collision with root package name */
    private static final CookieManager f9121v0;
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private int F;
    private double G;
    private double H;
    private double I;
    private Handler J;
    private int K;
    private Uri L;
    private String M;
    private boolean N;
    private String O;
    private Dynamic P;
    private String Q;
    private Dynamic R;
    private String S;
    private Dynamic T;
    private ReadableArray U;
    private boolean V;
    private boolean W;

    /* renamed from: a  reason: collision with root package name */
    private final com.brentvatne.exoplayer.i f9122a;

    /* renamed from: b  reason: collision with root package name */
    private final com.brentvatne.exoplayer.e f9123b;

    /* renamed from: c  reason: collision with root package name */
    private final s f9124c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.android.exoplayer2.ui.c f9125d;

    /* renamed from: e  reason: collision with root package name */
    private View f9126e;

    /* renamed from: f  reason: collision with root package name */
    private p2.d f9127f;

    /* renamed from: g  reason: collision with root package name */
    private com.brentvatne.exoplayer.d f9128g;

    /* renamed from: g0  reason: collision with root package name */
    private long f9129g0;

    /* renamed from: h  reason: collision with root package name */
    private l.a f9130h;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f9131h0;

    /* renamed from: i  reason: collision with root package name */
    private p f9132i;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f9133i0;

    /* renamed from: j  reason: collision with root package name */
    private ba.l f9134j;

    /* renamed from: j0  reason: collision with root package name */
    private float f9135j0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9136k;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f9137k0;

    /* renamed from: l  reason: collision with root package name */
    private int f9138l;

    /* renamed from: l0  reason: collision with root package name */
    private Map<String, String> f9139l0;

    /* renamed from: m  reason: collision with root package name */
    private long f9140m;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f9141m0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9142n;

    /* renamed from: n0  reason: collision with root package name */
    private UUID f9143n0;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9144o;

    /* renamed from: o0  reason: collision with root package name */
    private String f9145o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9146p;

    /* renamed from: p0  reason: collision with root package name */
    private String[] f9147p0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f9148q;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f9149q0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9150r;

    /* renamed from: r0  reason: collision with root package name */
    private final n0 f9151r0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f9152s;

    /* renamed from: s0  reason: collision with root package name */
    private final AudioManager f9153s0;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9154t;

    /* renamed from: t0  reason: collision with root package name */
    private final t2.a f9155t0;

    /* renamed from: u  reason: collision with root package name */
    private float f9156u;

    /* renamed from: u0  reason: collision with root package name */
    private final Handler f9157u0;

    /* renamed from: v  reason: collision with root package name */
    private float f9158v;

    /* renamed from: w  reason: collision with root package name */
    private int f9159w;

    /* renamed from: x  reason: collision with root package name */
    private int f9160x;

    /* renamed from: y  reason: collision with root package name */
    private long f9161y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f9162z;

    /* compiled from: ReactExoplayerView.java */
    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1 && g.this.f9132i != null && g.this.f9132i.S() == 3 && g.this.f9132i.E()) {
                long currentPosition = g.this.f9132i.getCurrentPosition();
                g.this.f9122a.q(currentPosition, (g.this.f9132i.g() * g.this.f9132i.getDuration()) / 100, g.this.f9132i.getDuration(), g.this.S0(currentPosition));
                sendMessageDelayed(obtainMessage(1), Math.round(g.this.f9135j0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactExoplayerView.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.Y1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactExoplayerView.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (g.this.f9132i != null && g.this.f9132i.S() == 4) {
                g.this.f9132i.N(0L);
            }
            g.this.C1(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactExoplayerView.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.C1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactExoplayerView.java */
    /* loaded from: classes.dex */
    public class e implements p2.d {
        e() {
        }

        @Override // j8.p2.d
        public /* synthetic */ void C(boolean z10) {
            q2.x(this, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void D(p2.b bVar) {
            q2.a(this, bVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void E(m mVar) {
            q2.c(this, mVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void H(int i10, boolean z10) {
            q2.d(this, i10, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void J() {
            q2.u(this);
        }

        @Override // j8.p2.d
        public /* synthetic */ void K(m2 m2Var) {
            q2.p(this, m2Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void N(b2 b2Var) {
            q2.j(this, b2Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void O(n3 n3Var) {
            q2.C(this, n3Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void P(int i10, int i11) {
            q2.z(this, i10, i11);
        }

        @Override // j8.p2.d
        public /* synthetic */ void T(p2 p2Var, p2.c cVar) {
            q2.e(this, p2Var, cVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void U(int i10) {
            q2.s(this, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void V(p2.e eVar, p2.e eVar2, int i10) {
            q2.t(this, eVar, eVar2, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void W(boolean z10) {
            q2.f(this, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void X() {
            q2.w(this);
        }

        @Override // j8.p2.d
        public /* synthetic */ void Y(float f10) {
            q2.E(this, f10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void Z(y0 y0Var, u uVar) {
            q2.B(this, y0Var, uVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void a(boolean z10) {
            q2.y(this, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void d(o2 o2Var) {
            q2.m(this, o2Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void d0(boolean z10, int i10) {
            q2.r(this, z10, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void e0(m2 m2Var) {
            q2.q(this, m2Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void g(Metadata metadata) {
            q2.k(this, metadata);
        }

        @Override // j8.p2.d
        public /* synthetic */ void g0(j3 j3Var, int i10) {
            q2.A(this, j3Var, i10);
        }

        @Override // j8.p2.d
        public void h0(boolean z10, int i10) {
            g gVar = g.this;
            gVar.i1(gVar.f9126e);
            g.this.f9132i.p(g.this.f9127f);
        }

        @Override // j8.p2.d
        public /* synthetic */ void j(v vVar) {
            q2.D(this, vVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void k(List list) {
            q2.b(this, list);
        }

        @Override // j8.p2.d
        public /* synthetic */ void k0(boolean z10) {
            q2.g(this, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void r(int i10) {
            q2.v(this, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void w(int i10) {
            q2.o(this, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void x(boolean z10) {
            q2.h(this, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void y(x1 x1Var, int i10) {
            q2.i(this, x1Var, i10);
        }

        @Override // j8.p2.d
        public void z(int i10) {
            g gVar = g.this;
            gVar.i1(gVar.f9126e);
            g.this.f9132i.p(g.this.f9127f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactExoplayerView.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f9168a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9169b;

        /* compiled from: ReactExoplayerView.java */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* compiled from: ReactExoplayerView.java */
            /* renamed from: com.brentvatne.exoplayer.g$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0139a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.google.android.exoplayer2.drm.l f9172a;

                RunnableC0139a(com.google.android.exoplayer2.drm.l lVar) {
                    this.f9172a = lVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        f fVar = f.this;
                        g.this.c1(fVar.f9168a, this.f9172a);
                    } catch (Exception e10) {
                        f.this.f9168a.f9136k = true;
                        Log.e("ExoPlayer Exception", "Failed to initialize Player!");
                        Log.e("ExoPlayer Exception", e10.toString());
                        f.this.f9168a.f9122a.g(e10.toString(), e10, "1001");
                    }
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                com.google.android.exoplayer2.drm.l b12 = g.this.b1(fVar.f9168a);
                if (b12 == null && f.this.f9168a.f9143n0 != null) {
                    Log.e("ExoPlayer Exception", "Failed to initialize DRM Session Manager Framework!");
                    g.this.f9122a.g("Failed to initialize DRM Session Manager Framework!", new Exception("DRM Session Manager Framework failure!"), "3003");
                    return;
                }
                f.this.f9169b.runOnUiThread(new RunnableC0139a(b12));
            }
        }

        f(g gVar, Activity activity) {
            this.f9168a = gVar;
            this.f9169b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (g.this.f9132i == null) {
                    g.this.a1(this.f9168a);
                }
                if (!g.this.f9136k || g.this.L == null) {
                    if (g.this.L != null) {
                        g.this.c1(this.f9168a, null);
                        return;
                    }
                    return;
                }
                g.this.f9128g.g();
                Executors.newSingleThreadExecutor().execute(new a());
            } catch (Exception e10) {
                this.f9168a.f9136k = true;
                Log.e("ExoPlayer Exception", "Failed to initialize Player!");
                Log.e("ExoPlayer Exception", e10.toString());
                g.this.f9122a.g(e10.toString(), e10, "1001");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactExoplayerView.java */
    /* renamed from: com.brentvatne.exoplayer.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0140g implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.exoplayer2.drm.l f9174a;

        C0140g(g gVar, com.google.android.exoplayer2.drm.l lVar) {
            this.f9174a = lVar;
        }

        @Override // n8.o
        public com.google.android.exoplayer2.drm.l a(x1 x1Var) {
            return this.f9174a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactExoplayerView.java */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f9175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f9176b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9177c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f9178d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WritableArray f9179e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ WritableArray f9180f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f9181g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f9182h;

        h(long j10, long j11, int i10, int i11, WritableArray writableArray, WritableArray writableArray2, int i12, String str) {
            this.f9175a = j10;
            this.f9176b = j11;
            this.f9177c = i10;
            this.f9178d = i11;
            this.f9179e = writableArray;
            this.f9180f = writableArray2;
            this.f9181g = i12;
            this.f9182h = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f9122a.m(this.f9175a, this.f9176b, this.f9177c, this.f9178d, this.f9179e, this.f9180f, g.this.V0(this.f9181g), this.f9182h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactExoplayerView.java */
    /* loaded from: classes.dex */
    public class i implements Callable<WritableArray> {

        /* renamed from: a  reason: collision with root package name */
        l f9184a;

        /* renamed from: b  reason: collision with root package name */
        Uri f9185b;

        /* renamed from: c  reason: collision with root package name */
        long f9186c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f9187d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Uri f9188e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f9189f;

        i(l lVar, Uri uri, long j10) {
            this.f9187d = lVar;
            this.f9188e = uri;
            this.f9189f = j10;
            this.f9184a = lVar;
            this.f9185b = uri;
            this.f9186c = j10 * 1000;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public WritableArray call() throws Exception {
            int i10;
            WritableArray createArray = Arguments.createArray();
            try {
                m9.c b10 = com.google.android.exoplayer2.source.dash.c.b(this.f9184a, this.f9185b);
                int e10 = b10.e();
                int i11 = 0;
                while (i11 < e10) {
                    m9.g d10 = b10.d(i11);
                    int i12 = 0;
                    while (i12 < d10.f34368c.size()) {
                        m9.a aVar = d10.f34368c.get(i12);
                        if (aVar.f34323b != 2) {
                            i10 = i11;
                        } else {
                            int i13 = 0;
                            boolean z10 = false;
                            while (true) {
                                if (i13 >= aVar.f34324c.size()) {
                                    i10 = i11;
                                    break;
                                }
                                m9.j jVar = aVar.f34324c.get(i13);
                                p1 p1Var = jVar.f34379a;
                                i10 = i11;
                                if (jVar.f34381c <= this.f9186c) {
                                    break;
                                }
                                WritableMap createMap = Arguments.createMap();
                                int i14 = p1Var.f32714q;
                                if (i14 == -1) {
                                    i14 = 0;
                                }
                                createMap.putInt("width", i14);
                                int i15 = p1Var.f32715r;
                                if (i15 == -1) {
                                    i15 = 0;
                                }
                                createMap.putInt("height", i15);
                                int i16 = p1Var.f32705h;
                                if (i16 == -1) {
                                    i16 = 0;
                                }
                                createMap.putInt("bitrate", i16);
                                String str = p1Var.f32706i;
                                if (str == null) {
                                    str = "";
                                }
                                createMap.putString("codecs", str);
                                String str2 = p1Var.f32698a;
                                if (str2 == null) {
                                    str2 = String.valueOf(i13);
                                }
                                createMap.putString("trackId", str2);
                                if (g.this.e1(p1Var)) {
                                    createArray.pushMap(createMap);
                                }
                                i13++;
                                z10 = true;
                                i11 = i10;
                            }
                            if (z10) {
                                return createArray;
                            }
                        }
                        i12++;
                        i11 = i10;
                    }
                    i11++;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactExoplayerView.java */
    /* loaded from: classes.dex */
    public class j extends j8.j {

        /* renamed from: l  reason: collision with root package name */
        private int f9191l;

        /* renamed from: m  reason: collision with root package name */
        private Runtime f9192m;

        public j(q qVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
            super(qVar, i10, i11, i12, i13, i14, z10, i15, z11);
            this.f9191l = 0;
            this.f9192m = Runtime.getRuntime();
            n0 n0Var = g.this.f9151r0;
            n0 unused = g.this.f9151r0;
            this.f9191l = (int) Math.floor(((ActivityManager) n0Var.getSystemService("activity")).getMemoryClass() * g.this.G * 1024.0d * 1024.0d);
        }

        @Override // j8.j, j8.v1
        public boolean h(long j10, long j11, float f10) {
            if (g.this.W) {
                return false;
            }
            int c10 = d().c();
            int i10 = this.f9191l;
            if (i10 > 0 && c10 >= i10) {
                return false;
            }
            long j12 = j11 / 1000;
            if (((long) g.this.I) * this.f9192m.maxMemory() <= this.f9192m.maxMemory() - (this.f9192m.totalMemory() - this.f9192m.freeMemory()) || j12 <= Constants.MIN_PROGRESS_TIME) {
                if (this.f9192m.freeMemory() == 0) {
                    Log.w("ExoPlayer Warning", "Free memory reached 0, forcing garbage collection");
                    this.f9192m.gc();
                    return false;
                }
                return super.h(j10, j11, f10);
            }
            return false;
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        f9121v0 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public g(n0 n0Var, com.brentvatne.exoplayer.e eVar) {
        super(n0Var);
        this.f9152s = false;
        this.f9154t = false;
        this.f9156u = 1.0f;
        this.f9158v = 1.0f;
        this.f9159w = 3;
        this.f9160x = 0;
        this.f9161y = -9223372036854775807L;
        this.f9162z = false;
        this.A = false;
        this.B = false;
        this.C = 50000;
        this.D = 50000;
        this.E = IronSourceConstants.IS_INSTANCE_NOT_FOUND;
        this.F = jh.DEFAULT_BITMAP_TIMEOUT;
        this.G = 1.0d;
        this.H = 0.0d;
        this.I = 0.0d;
        this.K = 0;
        this.f9129g0 = -1L;
        this.f9133i0 = true;
        this.f9135j0 = 250.0f;
        this.f9137k0 = false;
        this.f9141m0 = false;
        this.f9143n0 = null;
        this.f9145o0 = null;
        this.f9147p0 = null;
        this.f9157u0 = new a(Looper.getMainLooper());
        this.f9151r0 = n0Var;
        this.f9122a = new com.brentvatne.exoplayer.i(n0Var);
        this.f9123b = eVar;
        this.f9124c = eVar.c();
        O0();
        this.f9153s0 = (AudioManager) n0Var.getSystemService("audio");
        n0Var.addLifecycleEventListener(this);
        this.f9155t0 = new t2.a(n0Var);
    }

    private void B0() {
        if (this.f9132i == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f9125d.setLayoutParams(layoutParams);
        int indexOfChild = indexOfChild(this.f9125d);
        if (indexOfChild != -1) {
            removeViewAt(indexOfChild);
        }
        addView(this.f9125d, 1, layoutParams);
    }

    private void C0() {
        J1(this.N);
        B1(this.f9152s);
    }

    private l.a D0(boolean z10) {
        return com.brentvatne.exoplayer.b.c(this.f9151r0, z10 ? this.f9124c : null, this.f9139l0);
    }

    private com.google.android.exoplayer2.drm.l E0(UUID uuid, String str, String[] strArr) throws n8.v {
        return F0(uuid, str, strArr, 0);
    }

    private void E1(boolean z10) {
        p pVar = this.f9132i;
        if (pVar == null) {
            return;
        }
        if (z10) {
            boolean l12 = l1();
            this.f9154t = l12;
            if (l12) {
                this.f9132i.m(true);
                return;
            }
            return;
        }
        pVar.m(false);
    }

    private com.google.android.exoplayer2.drm.l F0(UUID uuid, String str, String[] strArr, int i10) throws n8.v {
        if (ea.n0.f29709a < 18) {
            return null;
        }
        try {
            r rVar = new r(str, G0(false));
            if (strArr != null) {
                for (int i11 = 0; i11 < strArr.length - 1; i11 += 2) {
                    rVar.e(strArr[i11], strArr[i11 + 1]);
                }
            }
            com.google.android.exoplayer2.drm.q C = com.google.android.exoplayer2.drm.q.C(uuid);
            if (this.f9162z) {
                C.D("securityLevel", "L3");
            }
            return new com.google.android.exoplayer2.drm.e(uuid, C, rVar, null, false, 3);
        } catch (n8.v e10) {
            throw e10;
        } catch (Exception e11) {
            if (i10 < 3) {
                return F0(uuid, str, strArr, i10 + 1);
            }
            this.f9122a.g(e11.toString(), e11, "3006");
            return null;
        }
    }

    private a0.b G0(boolean z10) {
        return com.brentvatne.exoplayer.b.d(this.f9151r0, z10 ? this.f9124c : null, this.f9139l0);
    }

    private i9.u H0(Uri uri, String str, com.google.android.exoplayer2.drm.l lVar) {
        String lastPathSegment;
        if (uri != null) {
            if (TextUtils.isEmpty(str)) {
                lastPathSegment = uri.getLastPathSegment();
            } else {
                lastPathSegment = "." + str;
            }
            int q02 = ea.n0.q0(lastPathSegment);
            this.f9123b.a(this.f9131h0);
            x1 a10 = new x1.c().f(uri).a();
            C0140g c0140g = lVar != null ? new C0140g(this, lVar) : null;
            if (q02 != 0) {
                if (q02 != 1) {
                    if (q02 != 2) {
                        if (q02 == 4) {
                            return new j0.b(this.f9130h).d(c0140g).e(this.f9123b.b(this.f9159w)).b(a10);
                        }
                        throw new IllegalStateException("Unsupported type: " + q02);
                    }
                    return new HlsMediaSource.Factory(this.f9130h).b(c0140g).c(this.f9123b.b(this.f9159w)).a(a10);
                }
                return new SsMediaSource.Factory(new a.C0291a(this.f9130h), D0(false)).b(c0140g).c(this.f9123b.b(this.f9159w)).a(a10);
            }
            return new DashMediaSource.Factory(new d.a(this.f9130h), D0(false)).b(c0140g).c(this.f9123b.b(this.f9159w)).a(a10);
        }
        throw new IllegalStateException("Invalid video uri");
    }

    private i9.u I0(String str, Uri uri, String str2, String str3) {
        return new t0.b(this.f9130h).a(new x1.k.a(uri).m(str2).l(str3).o(1).n(128).k(str).i(), -9223372036854775807L);
    }

    private ArrayList<i9.u> J0() {
        ArrayList<i9.u> arrayList = new ArrayList<>();
        if (this.U == null) {
            return arrayList;
        }
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            ReadableMap map = this.U.getMap(i10);
            String string = map.getString("language");
            i9.u I0 = I0(map.hasKey("title") ? map.getString("title") : string + " " + i10, Uri.parse(map.getString("uri")), map.getString("type"), string);
            if (I0 != null) {
                arrayList.add(I0);
            }
        }
        return arrayList;
    }

    private void L0() {
        this.f9157u0.removeMessages(1);
    }

    private void M0() {
        this.f9138l = -1;
        this.f9140m = -9223372036854775807L;
    }

    private void O0() {
        M0();
        this.f9130h = D0(true);
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = f9121v0;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        com.brentvatne.exoplayer.d dVar = new com.brentvatne.exoplayer.d(getContext());
        this.f9128g = dVar;
        dVar.setLayoutParams(layoutParams);
        addView(this.f9128g, 0, layoutParams);
        this.J = new Handler();
    }

    private void P0() {
        Z0();
        q1(this.f9149q0);
        C0();
        U1();
    }

    private WritableArray Q0() {
        WritableArray createArray = Arguments.createArray();
        ba.l lVar = this.f9134j;
        if (lVar == null) {
            return createArray;
        }
        s.a i10 = lVar.i();
        int U0 = U0(1);
        if (i10 != null && U0 != -1) {
            y0 f10 = i10.f(U0);
            for (int i11 = 0; i11 < f10.f31863a; i11++) {
                p1 c10 = f10.b(i11).c(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i11);
                String str = c10.f32698a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                createMap.putString("title", str);
                createMap.putString("type", c10.f32709l);
                String str3 = c10.f32700c;
                if (str3 == null) {
                    str3 = "";
                }
                createMap.putString("language", str3);
                int i12 = c10.f32705h;
                if (i12 != -1) {
                    str2 = String.format(Locale.US, "%.2fMbps", Float.valueOf(i12 / 1000000.0f));
                }
                createMap.putString("bitrate", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    private int R0(y0 y0Var) {
        if (y0Var.f31863a == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i10 = 0; i10 < y0Var.f31863a; i10++) {
            String str = y0Var.b(i10).c(0).f32700c;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i10;
            }
        }
        return 0;
    }

    private WritableArray T0() {
        WritableArray createArray = Arguments.createArray();
        s.a i10 = this.f9134j.i();
        int U0 = U0(3);
        if (i10 != null && U0 != -1) {
            y0 f10 = i10.f(U0);
            for (int i11 = 0; i11 < f10.f31863a; i11++) {
                p1 c10 = f10.b(i11).c(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i11);
                String str = c10.f32698a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                createMap.putString("title", str);
                createMap.putString("type", c10.f32709l);
                String str3 = c10.f32700c;
                if (str3 != null) {
                    str2 = str3;
                }
                createMap.putString("language", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    private void U1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableArray V0(int i10) {
        WritableArray W0;
        if (this.f9129g0 != -1 && (W0 = W0()) != null) {
            this.A = true;
            return W0;
        }
        WritableArray createArray = Arguments.createArray();
        s.a i11 = this.f9134j.i();
        if (i11 != null && i10 != -1) {
            y0 f10 = i11.f(i10);
            for (int i12 = 0; i12 < f10.f31863a; i12++) {
                w0 b10 = f10.b(i12);
                for (int i13 = 0; i13 < b10.f31846a; i13++) {
                    p1 c10 = b10.c(i13);
                    if (e1(c10)) {
                        WritableMap createMap = Arguments.createMap();
                        int i14 = c10.f32714q;
                        if (i14 == -1) {
                            i14 = 0;
                        }
                        createMap.putInt("width", i14);
                        int i15 = c10.f32715r;
                        if (i15 == -1) {
                            i15 = 0;
                        }
                        createMap.putInt("height", i15);
                        int i16 = c10.f32705h;
                        if (i16 == -1) {
                            i16 = 0;
                        }
                        createMap.putInt("bitrate", i16);
                        String str = c10.f32706i;
                        if (str == null) {
                            str = "";
                        }
                        createMap.putString("codecs", str);
                        String str2 = c10.f32698a;
                        if (str2 == null) {
                            str2 = String.valueOf(i13);
                        }
                        createMap.putString("trackId", str2);
                        createArray.pushMap(createMap);
                    }
                }
            }
        }
        return createArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r0 != 4) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void V1() {
        /*
            r3 = this;
            j8.p r0 = r3.f9132i
            if (r0 == 0) goto L25
            int r0 = r0.S()
            r1 = 1
            if (r0 == r1) goto L21
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 3
            if (r0 == r2) goto L15
            r1 = 4
            if (r0 == r1) goto L21
            goto L28
        L15:
            j8.p r0 = r3.f9132i
            boolean r0 = r0.E()
            if (r0 != 0) goto L28
            r3.E1(r1)
            goto L28
        L21:
            r3.Y0()
            goto L28
        L25:
            r3.Y0()
        L28:
            boolean r0 = r3.V
            if (r0 != 0) goto L31
            boolean r0 = r3.f9133i0
            r3.setKeepScreenOn(r0)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.g.V1():void");
    }

    private WritableArray W0() {
        return X0(0);
    }

    private void W1() {
        this.f9157u0.sendEmptyMessage(1);
    }

    private WritableArray X0(int i10) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            WritableArray writableArray = (WritableArray) newSingleThreadExecutor.submit(new i(this.f9130h.a(), this.L, (this.f9129g0 * 1000) - 100)).get(3000L, TimeUnit.MILLISECONDS);
            if (writableArray == null && i10 < 1) {
                return X0(i10 + 1);
            }
            newSingleThreadExecutor.shutdown();
            return writableArray;
        } catch (Exception unused) {
            return null;
        }
    }

    private void X1() {
        g1();
        j1();
    }

    private void Y0() {
        new Handler().postDelayed(new f(this, this.f9151r0.getCurrentActivity()), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y1() {
        if (this.f9132i == null) {
            return;
        }
        i1(this.f9125d);
        if (this.f9125d.I()) {
            this.f9125d.F();
        } else {
            this.f9125d.P();
        }
    }

    private void Z0() {
        if (this.f9125d == null) {
            this.f9125d = new com.google.android.exoplayer2.ui.c(getContext());
        }
        this.f9125d.setPlayer(this.f9132i);
        this.f9125d.P();
        this.f9126e = this.f9125d.findViewById(s2.a.exo_play_pause_container);
        this.f9128g.setOnClickListener(new b());
        ((ImageButton) this.f9125d.findViewById(s2.a.f36714b)).setOnClickListener(new c());
        ((ImageButton) this.f9125d.findViewById(s2.a.f36713a)).setOnClickListener(new d());
        e eVar = new e();
        this.f9127f = eVar;
        this.f9132i.i(eVar);
    }

    private void Z1() {
        this.f9138l = this.f9132i.T();
        this.f9140m = this.f9132i.R() ? Math.max(0L, this.f9132i.getCurrentPosition()) : -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(g gVar) {
        ba.l lVar = new ba.l(new a.b());
        gVar.f9134j = lVar;
        l.e x10 = this.f9134j.x();
        int i10 = this.f9160x;
        if (i10 == 0) {
            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        lVar.Y(x10.b0(i10));
        p j10 = new p.b(getContext(), new j8.l(getContext()).j(0)).w(gVar.f9134j).u(this.f9124c).v(new j(new q(true, Constants.MIN_PROGRESS_STEP), this.C, this.D, this.E, this.F, -1, true, this.K, false)).j();
        this.f9132i = j10;
        j10.i(gVar);
        this.f9128g.setPlayer(this.f9132i);
        this.f9155t0.b(gVar);
        this.f9124c.h(new Handler(), gVar);
        E1(!this.f9148q);
        this.f9136k = true;
        this.f9132i.b(new o2(this.f9156u, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.exoplayer2.drm.l b1(g gVar) {
        int i10;
        UUID uuid = gVar.f9143n0;
        if (uuid != null) {
            try {
                return gVar.E0(uuid, gVar.f9145o0, gVar.f9147p0);
            } catch (n8.v e10) {
                if (ea.n0.f29709a < 18) {
                    i10 = s2.b.error_drm_not_supported;
                } else {
                    i10 = e10.f34723a == 1 ? s2.b.error_drm_unsupported_scheme : s2.b.error_drm_unknown;
                }
                this.f9122a.g(getResources().getString(i10), e10, "3003");
                return null;
            }
        }
        return null;
    }

    private void b2() {
        if (this.f9142n) {
            this.f9142n = false;
            M1(this.O, this.P);
            P1(this.Q, this.R);
            N1(this.S, this.T);
            p1 n10 = this.f9132i.n();
            int i10 = n10 != null ? n10.f32714q : 0;
            int i11 = n10 != null ? n10.f32715r : 0;
            Executors.newSingleThreadExecutor().execute(new h(this.f9132i.getDuration(), this.f9132i.getCurrentPosition(), i10, i11, Q0(), T0(), U0(2), n10 != null ? n10.f32698a : "-1"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(g gVar, com.google.android.exoplayer2.drm.l lVar) {
        p pVar;
        ArrayList<i9.u> J0 = J0();
        i9.u H0 = H0(gVar.L, gVar.M, lVar);
        if (J0.size() != 0) {
            J0.add(0, H0);
            H0 = new d0((i9.u[]) J0.toArray(new i9.u[J0.size()]));
        }
        while (true) {
            pVar = this.f9132i;
            if (pVar != null) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                Log.e("ExoPlayer Exception", e10.toString());
            }
        }
        int i10 = this.f9138l;
        boolean z10 = i10 != -1;
        if (z10) {
            pVar.C(i10, this.f9140m);
        }
        this.f9132i.d0(H0, !z10, false);
        this.f9136k = false;
        i1(this.f9128g);
        this.f9122a.n();
        this.f9142n = true;
        P0();
    }

    private static boolean d1(m2 m2Var) {
        return m2Var.f32623a == 1002;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e1(p1 p1Var) {
        int i10 = p1Var.f32714q;
        if (i10 == -1) {
            i10 = 0;
        }
        int i11 = p1Var.f32715r;
        if (i11 == -1) {
            i11 = 0;
        }
        float f10 = p1Var.f32716s;
        if (f10 == -1.0f) {
            f10 = 0.0f;
        }
        String str = p1Var.f32709l;
        if (str == null) {
            return true;
        }
        try {
            return b9.v.r(str, false, false).u(i10, i11, f10);
        } catch (Exception unused) {
            return true;
        }
    }

    private void f1(boolean z10) {
        if (this.f9150r == z10) {
            return;
        }
        this.f9150r = z10;
        if (z10) {
            this.f9122a.e(true);
        } else {
            this.f9122a.e(false);
        }
    }

    private void g1() {
        if (this.f9144o) {
            x1(false);
        }
        this.f9153s0.abandonAudioFocus(this);
    }

    private void h1() {
        p pVar = this.f9132i;
        if (pVar != null && pVar.E()) {
            E1(false);
        }
        setKeepScreenOn(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private void j1() {
        if (this.f9132i != null) {
            Z1();
            this.f9132i.release();
            this.f9132i.p(this);
            this.f9134j = null;
            this.f9132i = null;
        }
        this.f9157u0.removeMessages(1);
        this.f9151r0.removeLifecycleEventListener(this);
        this.f9155t0.a();
        this.f9124c.g(this);
    }

    private void k1() {
        this.f9136k = true;
        Y0();
    }

    private boolean l1() {
        return this.V || this.L == null || this.f9154t || this.f9153s0.requestAudioFocus(this, 3, 1) == 1;
    }

    @Override // da.f.a
    public void A(int i10, long j10, long j11) {
        if (this.f9141m0) {
            p pVar = this.f9132i;
            if (pVar == null) {
                this.f9122a.d(j11, 0, 0, "-1");
                return;
            }
            p1 n10 = pVar.n();
            int i11 = n10 != null ? n10.f32714q : 0;
            this.f9122a.d(j11, n10 != null ? n10.f32715r : 0, i11, n10 != null ? n10.f32698a : "-1");
        }
    }

    public void A1(int i10) {
        this.f9159w = i10;
        j1();
        Y0();
    }

    public void B1(boolean z10) {
        this.f9152s = z10;
        p pVar = this.f9132i;
        if (pVar != null) {
            pVar.setVolume(z10 ? 0.0f : this.f9158v);
        }
    }

    @Override // j8.p2.d
    public void C(boolean z10) {
    }

    public void C1(boolean z10) {
        this.f9148q = z10;
        if (this.f9132i != null) {
            if (!z10) {
                V1();
            } else {
                h1();
            }
        }
    }

    @Override // j8.p2.d
    public /* synthetic */ void D(p2.b bVar) {
        q2.a(this, bVar);
    }

    public void D1(boolean z10) {
        this.f9137k0 = z10;
    }

    @Override // j8.p2.d
    public /* synthetic */ void E(m mVar) {
        q2.c(this, mVar);
    }

    public void F1(boolean z10) {
        this.f9133i0 = z10;
    }

    @Override // com.google.android.exoplayer2.drm.k
    public void G(int i10, u.b bVar) {
        Log.d("DRM Info", "onDrmKeysLoaded");
    }

    public void G1(float f10) {
        this.f9135j0 = f10;
    }

    @Override // j8.p2.d
    public /* synthetic */ void H(int i10, boolean z10) {
        q2.d(this, i10, z10);
    }

    public void H1(float f10) {
        this.f9156u = f10;
        if (this.f9132i != null) {
            this.f9132i.b(new o2(this.f9156u, 1.0f));
        }
    }

    public void I1(Uri uri, String str) {
        if (uri != null) {
            boolean equals = uri.equals(this.L);
            this.L = uri;
            this.M = str;
            this.f9130h = D0(true);
            if (equals) {
                return;
            }
            k1();
        }
    }

    @Override // j8.p2.d
    public /* synthetic */ void J() {
        q2.u(this);
    }

    public void J1(boolean z10) {
        p pVar = this.f9132i;
        if (pVar != null) {
            if (z10) {
                pVar.U(1);
            } else {
                pVar.U(0);
            }
        }
        this.N = z10;
    }

    @Override // j8.p2.d
    public void K(m2 m2Var) {
        if (m2Var == null) {
            return;
        }
        String str = "ExoPlaybackException: " + m2.a(m2Var.f32623a);
        String str2 = "2" + String.valueOf(m2Var.f32623a);
        int i10 = m2Var.f32623a;
        if ((i10 == 6000 || i10 == 6002 || i10 == 6004 || i10 == 6006 || i10 == 6007) && !this.f9162z) {
            this.f9162z = true;
            this.f9136k = true;
            Z1();
            Y0();
            E1(true);
            return;
        }
        this.f9122a.g(str, m2Var, str2);
        this.f9136k = true;
        if (d1(m2Var)) {
            M0();
            Y0();
            return;
        }
        Z1();
    }

    public void K0() {
        X1();
    }

    public void K1(boolean z10) {
        this.f9141m0 = z10;
    }

    @Override // com.google.android.exoplayer2.drm.k
    public /* synthetic */ void L(int i10, u.b bVar) {
        n8.e.a(this, i10, bVar);
    }

    public void L1(int i10) {
        this.f9128g.setResizeMode(i10);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public void M(int i10, u.b bVar, Exception exc) {
        Log.d("DRM Info", "onDrmSessionManagerError");
        this.f9122a.g("onDrmSessionManagerError", exc, "3002");
    }

    public void M1(String str, Dynamic dynamic) {
        this.O = str;
        this.P = dynamic;
        O1(1, str, dynamic);
    }

    @Override // j8.p2.d
    public /* synthetic */ void N(b2 b2Var) {
        q2.j(this, b2Var);
    }

    public void N0() {
        if (this.L != null) {
            this.f9132i.stop();
            this.f9132i.f();
            this.L = null;
            this.M = null;
            this.f9139l0 = null;
            this.f9130h = null;
            M0();
        }
    }

    public void N1(String str, Dynamic dynamic) {
        this.S = str;
        this.T = dynamic;
        O1(3, str, dynamic);
    }

    @Override // j8.p2.d
    public void O(n3 n3Var) {
    }

    public void O1(int i10, String str, Dynamic dynamic) {
        s.a i11;
        int R0;
        p1 p1Var;
        boolean z10;
        int i12;
        int i13;
        if (this.f9132i == null) {
            return;
        }
        int U0 = U0(i10);
        int i14 = -1;
        if (U0 == -1 || (i11 = this.f9134j.i()) == null) {
            return;
        }
        y0 f10 = i11.f(U0);
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        arrayList.add(0);
        String str2 = TextUtils.isEmpty(str) ? "default" : str;
        l.d z11 = this.f9134j.D().f().d0(U0, true).z();
        if (str2.equals("disabled")) {
            this.f9134j.Z(z11);
            return;
        }
        if (str2.equals("language")) {
            R0 = 0;
            while (R0 < f10.f31863a) {
                String str3 = f10.b(R0).c(0).f32700c;
                if (str3 != null && str3.equals(dynamic.asString())) {
                    break;
                }
                R0++;
            }
            R0 = -1;
        } else if (str2.equals("title")) {
            R0 = 0;
            while (R0 < f10.f31863a) {
                String str4 = f10.b(R0).c(0).f32698a;
                if (str4 != null && str4.equals(dynamic.asString())) {
                    break;
                }
                R0++;
            }
            R0 = -1;
        } else {
            if (str2.equals("index")) {
                if (dynamic.asInt() < f10.f31863a) {
                    R0 = dynamic.asInt();
                }
                i14 = -1;
            } else if (str2.equals("resolution")) {
                int asInt = dynamic.asInt();
                int i16 = -1;
                int i17 = 0;
                while (i17 < f10.f31863a) {
                    w0 b10 = f10.b(i17);
                    int i18 = 0;
                    p1 p1Var2 = null;
                    int i19 = -1;
                    while (true) {
                        if (i18 >= b10.f31846a) {
                            p1Var = p1Var2;
                            i14 = i19;
                            z10 = false;
                            break;
                        }
                        p1 c10 = b10.c(i18);
                        int i20 = c10.f32715r;
                        if (i20 == asInt) {
                            arrayList.set(i15, Integer.valueOf(i18));
                            i16 = i17;
                            z10 = true;
                            p1Var = null;
                            break;
                        }
                        if (this.A) {
                            if (p1Var2 != null) {
                                if (c10.f32705h <= p1Var2.f32705h) {
                                    if (i20 <= p1Var2.f32715r) {
                                    }
                                }
                                if (i20 >= asInt) {
                                }
                                p1Var2 = c10;
                                i19 = i18;
                            } else {
                                if (i20 >= asInt) {
                                }
                                p1Var2 = c10;
                                i19 = i18;
                            }
                        }
                        i18++;
                        i14 = -1;
                        i15 = 0;
                    }
                    if (p1Var == null && this.A && !z10) {
                        int i21 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        for (int i22 = 0; i22 < b10.f31846a; i22++) {
                            int i23 = b10.c(i22).f32715r;
                            if (i23 < i21) {
                                arrayList.set(0, Integer.valueOf(i22));
                                i16 = i17;
                                i21 = i23;
                            }
                        }
                    }
                    if (p1Var != null && i14 != -1) {
                        arrayList.set(0, Integer.valueOf(i14));
                        i16 = i17;
                    }
                    i17++;
                    i14 = -1;
                    i15 = 0;
                }
                R0 = i16;
            } else {
                if (i10 != 3 || ea.n0.f29709a <= 18) {
                    if (U0 == 1) {
                        R0 = R0(f10);
                    }
                    i14 = -1;
                } else {
                    CaptioningManager captioningManager = (CaptioningManager) this.f9151r0.getSystemService("captioning");
                    R0 = (captioningManager == null || !captioningManager.isEnabled()) ? -1 : R0(f10);
                }
                i14 = -1;
            }
            R0 = -1;
        }
        if (R0 == i14 && i10 == 2 && f10.f31863a != 0) {
            w0 b11 = f10.b(0);
            new ArrayList(b11.f31846a);
            arrayList = new ArrayList(b11.f31846a);
            for (int i24 = 0; i24 < b11.f31846a; i24++) {
                arrayList.add(Integer.valueOf(i24));
            }
            ArrayList arrayList2 = new ArrayList();
            int i25 = 0;
            for (int i26 = 0; i26 < arrayList.size(); i26++) {
                if (e1(b11.c(i26))) {
                    i25++;
                }
            }
            if (arrayList.size() != 1) {
                ArrayList arrayList3 = new ArrayList(i25 + 1);
                for (int i27 = 0; i27 < arrayList.size(); i27++) {
                    if (e1(b11.c(i27))) {
                        arrayList3.add((Integer) arrayList.get(i27));
                        arrayList2.add((Integer) arrayList.get(i27));
                    }
                }
                arrayList = arrayList3;
            }
            i13 = -1;
            i12 = 0;
        } else {
            i12 = R0;
            i13 = -1;
        }
        if (i12 == i13) {
            this.f9134j.Z(z11);
        } else {
            this.f9134j.Z(this.f9134j.D().f().d0(U0, false).e0(new w.b().a(new w.c(f10.b(i12), arrayList)).b()).z());
        }
    }

    @Override // j8.p2.d
    public /* synthetic */ void P(int i10, int i11) {
        q2.z(this, i10, i11);
    }

    public void P1(String str, Dynamic dynamic) {
        this.Q = str;
        this.R = dynamic;
        O1(2, str, dynamic);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public /* synthetic */ void Q(int i10, u.b bVar, int i11) {
        n8.e.b(this, i10, bVar, i11);
    }

    public void Q1(Uri uri, String str, Map<String, String> map) {
        if (uri != null) {
            boolean equals = uri.equals(this.L);
            this.f9162z = false;
            this.L = uri;
            this.M = str;
            this.f9139l0 = map;
            this.f9130h = com.brentvatne.exoplayer.b.c(this.f9151r0, this.f9124c, map);
            if (equals) {
                return;
            }
            k1();
        }
    }

    @Override // com.google.android.exoplayer2.drm.k
    public void R(int i10, u.b bVar) {
        Log.d("DRM Info", "onDrmKeysRemoved");
    }

    public void R1(ReadableArray readableArray) {
        this.U = readableArray;
        k1();
    }

    public double S0(long j10) {
        j3.c cVar = new j3.c();
        if (!this.f9132i.w().q()) {
            this.f9132i.w().n(this.f9132i.T(), cVar);
        }
        return cVar.f32524f + j10;
    }

    public void S1(boolean z10) {
        this.f9128g.setUseTextureView(z10 && this.f9143n0 == null);
    }

    @Override // j8.p2.d
    public void T(p2 p2Var, p2.c cVar) {
        if (cVar.a(4) || cVar.a(5)) {
            int S = p2Var.S();
            boolean E = p2Var.E();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onStateChanged: playWhenReady=");
            sb2.append(E);
            sb2.append(", playbackState=");
            if (S == 1) {
                this.f9122a.l();
                L0();
                if (p2Var.E()) {
                    return;
                }
                setKeepScreenOn(false);
            } else if (S == 2) {
                f1(true);
                L0();
                setKeepScreenOn(this.f9133i0);
            } else if (S != 3) {
                if (S != 4) {
                    return;
                }
                this.f9122a.f();
                g1();
                setKeepScreenOn(false);
            } else {
                this.f9122a.r();
                f1(false);
                W1();
                b2();
                if (this.B && this.A) {
                    this.B = false;
                    O1(2, this.Q, this.R);
                }
                com.google.android.exoplayer2.ui.c cVar2 = this.f9125d;
                if (cVar2 != null) {
                    cVar2.P();
                }
                setKeepScreenOn(this.f9133i0);
            }
        }
    }

    public void T1(float f10) {
        this.f9158v = f10;
        p pVar = this.f9132i;
        if (pVar != null) {
            pVar.setVolume(f10);
        }
    }

    @Override // j8.p2.d
    public /* synthetic */ void U(int i10) {
        q2.s(this, i10);
    }

    public int U0(int i10) {
        p pVar = this.f9132i;
        if (pVar != null) {
            int G = pVar.G();
            for (int i11 = 0; i11 < G; i11++) {
                if (this.f9132i.B(i11) == i10) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // j8.p2.d
    public void V(p2.e eVar, p2.e eVar2, int i10) {
        if (this.f9136k) {
            Z1();
        }
        if (this.A) {
            O1(2, this.Q, this.R);
            this.B = true;
        }
        if (i10 == 0 && this.f9132i.W() == 1) {
            this.f9122a.f();
        }
    }

    @Override // j8.p2.d
    public void W(boolean z10) {
    }

    @Override // j8.p2.d
    public /* synthetic */ void X() {
        q2.w(this);
    }

    @Override // j8.p2.d
    public /* synthetic */ void Y(float f10) {
        q2.E(this, f10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void Z(y0 y0Var, ba.u uVar) {
        q2.B(this, y0Var, uVar);
    }

    @Override // j8.p2.d
    public /* synthetic */ void a(boolean z10) {
        q2.y(this, z10);
    }

    public void a2(boolean z10) {
        this.f9128g.l(z10);
    }

    @Override // j8.p2.d
    public void d(o2 o2Var) {
        this.f9122a.o(o2Var.f32664a);
    }

    @Override // j8.p2.d
    public /* synthetic */ void d0(boolean z10, int i10) {
        q2.r(this, z10, i10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void e0(m2 m2Var) {
        q2.q(this, m2Var);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public void f0(int i10, u.b bVar) {
        Log.d("DRM Info", "onDrmKeysRestored");
    }

    @Override // j8.p2.d
    public void g(Metadata metadata) {
        this.f9122a.v(metadata);
    }

    @Override // j8.p2.d
    public void g0(j3 j3Var, int i10) {
    }

    @Override // t2.b
    public void h() {
        this.f9122a.b();
    }

    @Override // j8.p2.d
    public /* synthetic */ void h0(boolean z10, int i10) {
        q2.l(this, z10, i10);
    }

    @Override // com.google.android.exoplayer2.drm.k
    public /* synthetic */ void i0(int i10, u.b bVar) {
        n8.e.c(this, i10, bVar);
    }

    @Override // j8.p2.d
    public /* synthetic */ void j(v vVar) {
        q2.D(this, vVar);
    }

    @Override // j8.p2.d
    public /* synthetic */ void k(List list) {
        q2.b(this, list);
    }

    @Override // j8.p2.d
    public void k0(boolean z10) {
        this.f9122a.p(z10);
    }

    public void m1(long j10) {
        p pVar = this.f9132i;
        if (pVar != null) {
            pVar.N(j10);
            this.f9122a.t(this.f9132i.getCurrentPosition(), j10);
        }
    }

    public void n1(int i10) {
        Runtime runtime = Runtime.getRuntime();
        if (((long) this.H) * runtime.maxMemory() > runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) {
            Log.w("ExoPlayer Warning", "Not enough reserve memory, setting back buffer to 0ms to reduce memory pressure!");
            this.K = 0;
            return;
        }
        this.K = i10;
    }

    public void o1(int i10, int i11, int i12, int i13, double d10, double d11, double d12) {
        this.C = i10;
        this.D = i11;
        this.E = i12;
        this.F = i13;
        this.G = d10;
        this.H = d11;
        this.I = d12;
        j1();
        Y0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Y0();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        if (i10 == -2) {
            this.f9122a.c(false);
        } else if (i10 == -1) {
            this.f9154t = false;
            this.f9122a.c(false);
            h1();
            this.f9153s0.abandonAudioFocus(this);
        } else if (i10 == 1) {
            this.f9154t = true;
            this.f9122a.c(true);
        }
        p pVar = this.f9132i;
        if (pVar != null) {
            if (i10 == -3) {
                if (this.f9152s) {
                    return;
                }
                pVar.setVolume(this.f9158v * 0.8f);
            } else if (i10 != 1 || this.f9152s) {
            } else {
                pVar.setVolume(this.f9158v * 1.0f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        X1();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f9146p = true;
        if (this.f9137k0) {
            return;
        }
        E1(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (!this.f9137k0 || !this.f9146p) {
            E1(!this.f9148q);
        }
        this.f9146p = false;
    }

    public void p1(int i10) {
        this.f9129g0 = i10;
    }

    public void q1(boolean z10) {
        this.f9149q0 = z10;
        if (this.f9132i == null || this.f9128g == null) {
            return;
        }
        if (z10) {
            B0();
            return;
        }
        int indexOfChild = indexOfChild(this.f9125d);
        if (indexOfChild != -1) {
            removeViewAt(indexOfChild);
        }
    }

    @Override // j8.p2.d
    public void r(int i10) {
    }

    public void r1(boolean z10) {
        this.W = z10;
    }

    public void s1(boolean z10) {
        this.f9131h0 = z10;
    }

    @Override // android.view.View
    public void setId(int i10) {
        super.setId(i10);
        this.f9122a.u(i10);
    }

    public void t1(boolean z10) {
        this.V = z10;
    }

    public void u1(String[] strArr) {
        this.f9147p0 = strArr;
    }

    public void v1(String str) {
        this.f9145o0 = str;
    }

    @Override // j8.p2.d
    public /* synthetic */ void w(int i10) {
        q2.o(this, i10);
    }

    public void w1(UUID uuid) {
        this.f9143n0 = uuid;
    }

    @Override // j8.p2.d
    public /* synthetic */ void x(boolean z10) {
        q2.h(this, z10);
    }

    public void x1(boolean z10) {
        if (z10 == this.f9144o) {
            return;
        }
        this.f9144o = z10;
        Activity currentActivity = this.f9151r0.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        if (this.f9144o) {
            int i10 = ea.n0.f29709a >= 19 ? 4102 : 6;
            this.f9122a.k();
            decorView.setSystemUiVisibility(i10);
            this.f9122a.i();
            return;
        }
        this.f9122a.j();
        decorView.setSystemUiVisibility(0);
        this.f9122a.h();
    }

    @Override // j8.p2.d
    public /* synthetic */ void y(x1 x1Var, int i10) {
        q2.i(this, x1Var, i10);
    }

    public void y1(boolean z10) {
        this.f9128g.setHideShutterView(z10);
    }

    @Override // j8.p2.d
    public void z(int i10) {
        if (i10 != 3 || this.f9161y == -9223372036854775807L) {
            return;
        }
        this.f9122a.t(this.f9132i.getCurrentPosition(), this.f9161y);
        this.f9161y = -9223372036854775807L;
        if (this.A) {
            O1(2, this.Q, this.R);
        }
    }

    public void z1(int i10) {
        this.f9160x = i10;
        if (this.f9132i != null) {
            ba.l lVar = this.f9134j;
            l.e x10 = lVar.x();
            int i11 = this.f9160x;
            if (i11 == 0) {
                i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            lVar.Y(x10.b0(i11));
        }
    }
}
