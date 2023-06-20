package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.e;
import com.bytedance.sdk.openadsdk.utils.u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import i3.a;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import m3.b;
import m3.c;

/* compiled from: NativeVideoController.java */
/* loaded from: classes.dex */
public class b extends com.bytedance.sdk.openadsdk.core.video.a.a {
    private String A;
    private boolean B;
    private boolean C;
    private WeakReference<c.b> D;
    private WeakReference<c.d> I;
    private WeakReference<a> J;
    private int K;
    private int L;
    private l3.c P;
    private long Q;
    private j R;
    private long X;
    private int Z;

    /* renamed from: t  reason: collision with root package name */
    private final WeakReference<ViewGroup> f12895t;

    /* renamed from: w  reason: collision with root package name */
    private c.a f12898w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f12899x;

    /* renamed from: u  reason: collision with root package name */
    private long f12896u = 0;

    /* renamed from: v  reason: collision with root package name */
    private long f12897v = 0;

    /* renamed from: y  reason: collision with root package name */
    private boolean f12900y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f12901z = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = true;
    private boolean H = true;
    private int M = 0;
    private boolean N = false;
    private boolean O = true;
    private a.InterfaceC0404a S = new a.InterfaceC0404a() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1
        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar) {
            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.x();
                }
            });
            b.this.a(4);
        }

        @Override // i3.a.InterfaceC0404a
        public void b(i3.a aVar) {
            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.I != null && b.this.I.get() != null) {
                        ((c.d) b.this.I.get()).e_();
                    }
                    if (!b.this.f12899x) {
                        b.this.z();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.b();
                    }
                    ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.removeCallbacks(b.this.f12894s);
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void b(i3.a aVar, int i10) {
        }

        @Override // i3.a.InterfaceC0404a
        public void c(i3.a aVar) {
        }

        @Override // i3.a.InterfaceC0404a
        public void d(i3.a aVar) {
        }

        @Override // i3.a.InterfaceC0404a
        public void e(i3.a aVar) {
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, long j10) {
            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.b();
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.removeCallbacks(b.this.f12894s);
                        b.this.N = false;
                    }
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12799m && b.this.J != null && b.this.J.get() != null) {
                        ((a) b.this.J.get()).f();
                    }
                    b.this.L();
                    ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.removeCallbacks(b.this.f12894s);
                }
            });
            b.this.z();
            b.this.Q = System.currentTimeMillis();
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, final l3.a aVar2) {
            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1.4
                @Override // java.lang.Runnable
                public void run() {
                    int a10 = aVar2.a();
                    int b10 = aVar2.b();
                    b.this.b(a10, b10);
                    l.e("CSJ_VIDEO_NativeController", "CALLBACK_ON_ERROR、、before isVideoPlaying、、、、、");
                    if (!b.this.u() || b10 == -1004) {
                        l.e("CSJ_VIDEO_NativeController", "Video play error： errorcode,extra、、、、、、、" + a10 + "," + b10);
                        if (b.this.d(a10, b10)) {
                            l.e("CSJ_VIDEO_NativeController", "Play video error，show result page、、、、、、、");
                            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.a(((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12791e, ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12794h, false);
                            b.this.c(true);
                            b.this.f();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.b();
                        }
                        if (b.this.f12898w != null) {
                            b.this.f12898w.b(b.this.f12897v, h3.a.a(((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12792f, ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12803q));
                        }
                        if (b.this.I == null || b.this.I.get() == null || b.this.u()) {
                            return;
                        }
                        ((c.d) b.this.I.get()).a(a10, b10);
                    }
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, boolean z10) {
            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1.5
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.b();
                    }
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, int i10, int i11) {
            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1.6
                @Override // java.lang.Runnable
                public void run() {
                    b.this.H();
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, int i10, int i11, int i12) {
            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.u();
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.postDelayed(b.this.f12894s, 8000L);
                        b.this.N = true;
                    }
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, int i10) {
            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1.8
                @Override // java.lang.Runnable
                public void run() {
                    ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.b();
                    ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.removeCallbacks(b.this.f12894s);
                    b.this.N = false;
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, final long j10, final long j11) {
            if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12792f) < 50) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.1.9
                @Override // java.lang.Runnable
                public void run() {
                    b.this.a(j10, j11);
                }
            });
        }
    };
    private int T = 0;
    private long U = 0;

    /* renamed from: s  reason: collision with root package name */
    Runnable f12894s = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.4
        @Override // java.lang.Runnable
        public void run() {
            if (((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d != null) {
                ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.a(((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12791e, ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12794h, false);
                ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.b();
                b.this.c(true);
                l.e("CSJ_VIDEO_NativeController", "Show result page after error.......showAdCard");
            }
        }
    };
    private long V = 0;
    private long W = 0;
    private final BroadcastReceiver Y = new BroadcastReceiver() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                b.this.b();
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                int i10 = 0;
                if (!intent.getBooleanExtra("noConnectivity", false)) {
                    NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                    if (networkInfo != null) {
                        int type = networkInfo.getType();
                        if (type == 1) {
                            i10 = 4;
                        } else if (type == 0) {
                            i10 = 1;
                        }
                    } else {
                        i10 = o.c(context);
                    }
                }
                b.this.c(context, i10);
            }
        }
    };

    /* renamed from: aa  reason: collision with root package name */
    private boolean f12893aa = false;

    /* compiled from: NativeVideoController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b$6  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12920a;

        static {
            int[] iArr = new int[e.a.values().length];
            f12920a = iArr;
            try {
                iArr[e.a.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12920a[e.a.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12920a[e.a.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: NativeVideoController.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);

        void f();
    }

    public b(Context context, ViewGroup viewGroup, n nVar, String str, boolean z10, boolean z11, boolean z12, j jVar) {
        this.A = "embeded_ad";
        this.B = false;
        this.C = true;
        this.K = 0;
        this.L = 0;
        this.Z = 1;
        this.Z = o.c(context);
        a(z10);
        this.A = str;
        try {
            this.K = viewGroup.getWidth();
            this.L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.f12895t = new WeakReference<>(viewGroup);
        this.f12794h = new WeakReference<>(context);
        this.f12791e = nVar;
        a(context);
        this.f12899x = Build.VERSION.SDK_INT >= 17;
        this.B = z11;
        this.C = z12;
        if (jVar != null) {
            this.R = jVar;
        }
    }

    public void a(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(Map<String, Object> map) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r2 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
        r3 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void H() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.H():void");
    }

    private com.bykv.vk.openvk.component.video.api.renderview.a I() {
        d dVar;
        WeakReference<Context> weakReference = this.f12794h;
        if (weakReference == null || weakReference.get() == null || this.f12794h.get().getResources().getConfiguration().orientation != 1 || (dVar = this.f12790d) == null) {
            return null;
        }
        return dVar.q();
    }

    private void J() {
        if (C()) {
            f(!this.f12802p);
            if (!(this.f12794h.get() instanceof Activity)) {
                l.b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            d dVar = this.f12790d;
            if (dVar != null) {
                dVar.b(this.f12895t.get());
                this.f12790d.c(false);
            }
            b(1);
            WeakReference<c.b> weakReference = this.D;
            c.b bVar = weakReference != null ? weakReference.get() : null;
            if (bVar != null) {
                bVar.a(this.f12802p);
            }
        }
    }

    private void K() {
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.c(0);
            this.f12790d.a(false, false);
            this.f12790d.c(false);
            this.f12790d.e();
            this.f12790d.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        n nVar = this.f12791e;
        if (nVar != null) {
            m.g().a(com.bytedance.sdk.openadsdk.k.e.a(nVar.T(), true, this.f12791e));
        }
    }

    private void M() {
        if (this.f12794h == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12791e, this.f12790d, this.P);
    }

    private void c(l3.c cVar) {
        l.b("tag_video_play", "[video] NativeVideoController#playVideo has invoke !");
        if (cVar == null) {
            l.b("tag_video_play", "VideoUrlModel is null  !!!");
            return;
        }
        if (this.f12789c != null) {
            n nVar = this.f12791e;
            if (nVar != null) {
                cVar.p(String.valueOf(u.f(nVar)));
            }
            cVar.l(0);
            this.f12789c.a(cVar);
            l.b("tag_video_play", "[video] MediaPlayerProxy has setDataSource !");
        }
        this.f12896u = System.currentTimeMillis();
        if (!TextUtils.isEmpty(cVar.z())) {
            this.f12790d.d(8);
            this.f12790d.d(0);
            a(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.3
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f12896u = System.currentTimeMillis();
                    ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12790d.c(0);
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12789c == null || ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12792f != 0) {
                        if (((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12789c != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12789c.b(true, ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12792f, ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12800n);
                            return;
                        }
                        return;
                    }
                    ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12789c.b(true, 0L, ((com.bytedance.sdk.openadsdk.core.video.a.a) b.this).f12800n);
                }
            });
        }
        if (this.f12799m) {
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        d dVar;
        this.T++;
        if (C() && (dVar = this.f12790d) != null) {
            dVar.b();
            c.a aVar = this.f12898w;
            if (aVar != null) {
                aVar.a(this.f12897v, h3.a.a(this.f12792f, this.f12803q));
            }
            this.f12897v = System.currentTimeMillis() - this.f12896u;
            if ((!u.b(this.f12791e) || this.T >= 2) && this.H) {
                this.f12790d.a(this.f12791e, this.f12794h, true);
            }
            if (!this.f12901z) {
                this.f12901z = true;
                long j10 = this.f12803q;
                a(j10, j10);
                long j11 = this.f12803q;
                this.f12792f = j11;
                this.f12793g = j11;
                o.a aVar2 = new o.a();
                aVar2.a(g());
                aVar2.c(j());
                aVar2.b(h());
                aVar2.f(i());
                com.bytedance.sdk.openadsdk.b.b.a.a.b(this.f12790d, aVar2, this.R);
            }
            if (!this.f12799m && this.f12802p) {
                e(this.f12790d, null);
            }
            this.f12798l = true;
            if (!u.b(this.f12791e) || this.T >= 2) {
                return;
            }
            a();
        }
    }

    private void y() {
        l.a("CSJ_VIDEO_NativeController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.f12796j));
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            if (aVar.m()) {
                if (this.f12796j) {
                    E();
                } else {
                    b(this.f12804r);
                }
                l.a("CSJ_VIDEO_NativeController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.f12796j));
            } else {
                this.f12789c.b(false, this.f12792f, this.f12800n);
            }
        }
        if (this.f12900y) {
            o.a aVar2 = new o.a();
            aVar2.a(g());
            aVar2.c(j());
            aVar2.b(h());
            com.bytedance.sdk.openadsdk.b.b.a.a.b(o(), aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.f12900y) {
            return;
        }
        o.a aVar = new o.a();
        aVar.a(this.G);
        aVar.c(j());
        com.bytedance.sdk.openadsdk.b.b.a.a.a(m.a(), this.f12790d, aVar, this.R);
        this.f12900y = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    /* renamed from: F */
    public d o() {
        return this.f12790d;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void d() {
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.a();
        }
        d dVar2 = this.f12790d;
        if (dVar2 != null) {
            dVar2.v();
        }
        y();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void e() {
        a(true, 3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void f() {
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.d();
            this.f12789c = null;
        }
        if (!u.b(this.f12791e) || this.T == 2) {
            if (!this.H) {
                return;
            }
            this.f12790d.a(this.f12791e, this.f12794h, true);
        }
        x xVar = this.f12797k;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages(null);
        }
        List<Runnable> list = this.f12795i;
        if (list != null) {
            list.clear();
        }
        if (this.f12799m) {
            w();
        }
    }

    public void g(boolean z10) {
        this.H = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public long h() {
        if (n() == null) {
            return 0L;
        }
        return n().o();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public int i() {
        if (n() == null) {
            return 0;
        }
        return n().p();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public long j() {
        if (n() == null) {
            return 0L;
        }
        return n().q();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public long k() {
        return g() + h();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public int l() {
        return h3.a.a(this.f12793g, this.f12803q);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public boolean r() {
        return this.N;
    }

    public boolean t() {
        i3.a aVar = this.f12789c;
        return aVar == null || aVar.h();
    }

    public boolean u() {
        i3.a aVar = this.f12789c;
        return aVar != null && aVar.l();
    }

    public void v() {
        if (this.f12893aa || !this.O) {
            return;
        }
        Context applicationContext = m.a().getApplicationContext();
        this.f12893aa = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            applicationContext.registerReceiver(this.Y, intentFilter);
        } catch (Exception unused) {
        }
    }

    public void w() {
        if (this.f12893aa && this.O) {
            Context applicationContext = m.a().getApplicationContext();
            this.f12893aa = false;
            try {
                applicationContext.unregisterReceiver(this.Y);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a, m3.a
    public void e(m3.b bVar, View view) {
        a(bVar, view, false);
    }

    public void h(boolean z10) {
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.a();
        }
        d dVar2 = this.f12790d;
        if (dVar2 != null && z10) {
            dVar2.v();
        }
        y();
    }

    private View b(Context context) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(t.e(context, "tt_root_view"));
        relativeLayout.setBackgroundColor(-16777216);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout2.setId(t.e(context, "tt_video_loading_retry_layout"));
        relativeLayout2.setBackgroundColor(0);
        relativeLayout2.setGravity(17);
        relativeLayout2.setLayoutParams(layoutParams);
        relativeLayout.addView(relativeLayout2);
        ImageView imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        imageView.setId(t.e(context, "tt_video_loading_cover_image"));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams2);
        relativeLayout2.addView(imageView);
        ProgressBar progressBar = new ProgressBar(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        progressBar.setId(t.e(context, "tt_video_loading_progress"));
        layoutParams3.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams3);
        progressBar.setIndeterminateDrawable(t.c(context, "tt_video_loading_progress_bar"));
        relativeLayout2.addView(progressBar);
        ImageView imageView2 = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        imageView2.setId(t.e(context, "tt_video_play"));
        layoutParams4.addRule(13, -1);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(t.d(context, "tt_play_movebar_textpage"));
        imageView2.setVisibility(8);
        imageView2.setLayoutParams(layoutParams4);
        relativeLayout.addView(imageView2);
        ViewStub viewStub = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        viewStub.setId(t.e(context, "tt_video_ad_cover"));
        viewStub.setLayoutParams(layoutParams5);
        viewStub.setLayoutResource(t.f(context, "tt_video_ad_cover_layout"));
        relativeLayout.addView(viewStub);
        ViewStub viewStub2 = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        viewStub2.setId(t.e(context, "tt_video_draw_layout_viewStub"));
        viewStub2.setLayoutParams(layoutParams6);
        viewStub2.setLayoutResource(t.f(context, "tt_video_draw_btn_layout"));
        relativeLayout.addView(viewStub2);
        return relativeLayout;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void e(boolean z10) {
        this.O = z10;
    }

    public void a(final NativeVideoTsView.a aVar) {
        d dVar;
        if (!this.f12799m || (dVar = this.f12790d) == null) {
            return;
        }
        dVar.a(new NativeVideoTsView.a() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.2
            @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.a
            public void a(View view, int i10) {
                NativeVideoTsView.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(view, i10);
                }
            }
        });
    }

    public void d(long j10) {
        this.f12792f = j10;
        long j11 = this.f12793g;
        if (j11 > j10) {
            j10 = j11;
        }
        this.f12793g = j10;
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.a();
        }
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.b(true, this.f12792f, this.f12800n);
        }
    }

    public void a(TTNativeAd tTNativeAd) {
        d dVar;
        if (!this.f12799m || (dVar = this.f12790d) == null) {
            return;
        }
        dVar.a(tTNativeAd);
    }

    public void a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.K = i10;
        this.L = i11;
        l.b("CSJ_VIDEO_NativeController", "width=" + i10 + "height=" + i11);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void d(m3.b bVar, View view) {
        if (this.f12802p) {
            f(false);
            d dVar = this.f12790d;
            if (dVar != null) {
                dVar.b(this.f12895t.get());
            }
            b(1);
            return;
        }
        e();
    }

    @SuppressLint({"InflateParams"})
    private void a(Context context) {
        View inflate;
        EnumSet noneOf = EnumSet.noneOf(b.a.class);
        noneOf.add(b.a.hideCloseBtn);
        noneOf.add(b.a.hideBackBtn);
        if (this.f12799m) {
            inflate = b(context);
        } else {
            inflate = LayoutInflater.from(context.getApplicationContext()).inflate(t.f(context, "tt_video_detail_layout"), (ViewGroup) null, false);
        }
        View view = inflate;
        if (view == null) {
            return;
        }
        if (this.f12799m) {
            this.f12790d = new d(context, view, true, noneOf, this.f12791e, this, G());
        } else {
            this.f12790d = new c(context, view, true, noneOf, this.f12791e, this, false);
        }
        this.f12790d.a(this);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void c(m3.b bVar, View view) {
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.i();
        }
        e();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void d(boolean z10) {
        this.G = z10;
    }

    private boolean c(int i10) {
        return this.f12790d.b(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i10, int i11) {
        l.b("TTVideoLandingPage", "OnError - Error code: " + i10 + " Extra code: " + i11);
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    private boolean c(int i10, int i11) {
        n nVar;
        if (i11 == 0) {
            b();
            this.f12801o = true;
            d dVar = this.f12790d;
            if (dVar != null) {
                dVar.a(this.f12791e, this.f12794h, false);
            }
        }
        if (i11 != 4 && i11 != 0) {
            d dVar2 = this.f12790d;
            if (dVar2 != null) {
                dVar2.a();
            }
            b();
            this.f12801o = true;
            this.E = false;
            d dVar3 = this.f12790d;
            if (dVar3 != null && (nVar = this.f12791e) != null) {
                return dVar3.a(i10, nVar.J(), this.C);
            }
        } else if (i11 == 4) {
            this.f12801o = false;
            d dVar4 = this.f12790d;
            if (dVar4 != null) {
                dVar4.s();
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(c.d dVar) {
        this.I = new WeakReference<>(dVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public boolean a(l3.c cVar) {
        c(false);
        l.b("tag_video_play", "[video] start NativeVideoController#playVideoUrl and video url is :\r\n" + cVar.z());
        if (TextUtils.isEmpty(cVar.z())) {
            l.e("tag_video_play", "[video] play video stop , because no video info");
            return false;
        }
        this.P = cVar;
        M();
        this.f12800n = cVar.u();
        if (!com.bytedance.sdk.openadsdk.core.nativeexpress.o.b(this.A) || this.f12792f <= 0) {
            this.f12792f = cVar.q();
        }
        if (cVar.q() <= 0) {
            this.f12901z = false;
            this.f12900y = false;
        }
        if (cVar.q() > 0) {
            long q10 = cVar.q();
            this.f12792f = q10;
            long j10 = this.f12793g;
            if (j10 > q10) {
                q10 = j10;
            }
            this.f12793g = q10;
        }
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.a();
            if (this.T == 0) {
                this.f12790d.g();
            }
            this.f12790d.c(cVar.k(), cVar.n());
            this.f12790d.c(this.f12895t.get());
            this.f12790d.a(cVar.k(), cVar.n());
        }
        if (this.f12789c == null && cVar.B() != -2 && cVar.B() != 1) {
            this.f12789c = new g3.d();
        }
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.a(this.S);
        }
        A();
        l.b("tag_video_play", "[video] new MediaPlayer");
        this.f12897v = 0L;
        try {
            c(cVar);
            return true;
        } catch (Exception e10) {
            l.e("tag_video_play", "[video] invoke NativeVideoController#playVideo cause exception :" + e10.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, int i10) {
        b(context, i10);
        if (i10 == 4) {
            this.f12801o = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void c(boolean z10) {
        this.f12798l = z10;
    }

    public b(Context context, ViewGroup viewGroup, n nVar, String str, boolean z10, boolean z11, j jVar) {
        this.A = "embeded_ad";
        this.B = false;
        this.C = true;
        this.K = 0;
        this.L = 0;
        this.Z = 1;
        this.Z = com.bytedance.sdk.component.utils.o.c(context);
        try {
            this.K = viewGroup.getWidth();
            this.L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.f12895t = new WeakReference<>(viewGroup);
        this.A = str;
        this.f12794h = new WeakReference<>(context);
        this.f12791e = nVar;
        a(context);
        this.f12899x = Build.VERSION.SDK_INT >= 17;
        this.B = z10;
        this.C = z11;
        if (jVar != null) {
            this.R = jVar;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void b() {
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.b();
        }
        if (this.f12901z || !this.f12900y) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            if (com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", true)) {
                o.a aVar2 = new o.a();
                aVar2.a(g());
                aVar2.c(j());
                aVar2.b(h());
                com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12790d, aVar2);
            }
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", Boolean.TRUE);
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.t.a().b()) {
            o.a aVar3 = new o.a();
            aVar3.a(g());
            aVar3.c(j());
            aVar3.b(h());
            com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12790d, aVar3);
        }
        com.bytedance.sdk.openadsdk.core.t.a().a(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(c.b bVar) {
        this.D = new WeakReference<>(bVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(c.a aVar) {
        this.f12898w = aVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(boolean z10, int i10) {
        if (this.f12799m) {
            this.U = j();
            a(1);
        }
        if (!this.f12901z && this.f12900y) {
            if (z10) {
                o.a aVar = new o.a();
                aVar.a(g());
                aVar.c(j());
                aVar.b(h());
                aVar.e(i10);
                aVar.f(i());
                com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12790d, aVar, this.R);
                this.f12901z = false;
            } else {
                o.a aVar2 = new o.a();
                aVar2.a(g());
                aVar2.c(j());
                aVar2.b(h());
                com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f12790d, aVar2);
            }
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, int i11) {
        if (this.f12791e == null) {
            return;
        }
        o.a aVar = new o.a();
        aVar.b(h());
        aVar.c(j());
        aVar.a(g());
        aVar.a(i10);
        aVar.b(i11);
        com.bytedance.sdk.openadsdk.b.b.a.a.c(o(), aVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void b(m3.b bVar, int i10) {
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void b(m3.b bVar, View view) {
        b(bVar, view, false, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(m3.b bVar, View view) {
        if (this.f12789c == null || !C()) {
            return;
        }
        if (this.f12789c.l()) {
            b();
            this.f12790d.b(true, false);
            this.f12790d.f();
        } else if (!this.f12789c.m()) {
            d dVar = this.f12790d;
            if (dVar != null) {
                dVar.c(this.f12895t.get());
            }
            d(this.f12792f);
            d dVar2 = this.f12790d;
            if (dVar2 != null) {
                dVar2.b(false, false);
            }
        } else {
            h(false);
            d dVar3 = this.f12790d;
            if (dVar3 != null) {
                dVar3.b(false, false);
            }
        }
    }

    public void b(m3.b bVar, View view, boolean z10, boolean z11) {
        if (C()) {
            f(!this.f12802p);
            if (!(this.f12794h.get() instanceof Activity)) {
                l.b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            if (this.f12802p) {
                b(z10 ? 8 : 0);
                d dVar = this.f12790d;
                if (dVar != null) {
                    dVar.a(this.f12895t.get());
                    this.f12790d.c(false);
                }
            } else {
                b(1);
                d dVar2 = this.f12790d;
                if (dVar2 != null) {
                    dVar2.b(this.f12895t.get());
                    this.f12790d.c(false);
                }
            }
            WeakReference<c.b> weakReference = this.D;
            c.b bVar2 = weakReference != null ? weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.a(this.f12802p);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(m3.b bVar, int i10) {
        if (this.f12789c == null) {
            return;
        }
        a(this.X, c(i10));
    }

    public void b(int i10) {
        if (C()) {
            boolean z10 = i10 == 0 || i10 == 8;
            Context context = this.f12794h.get();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                try {
                    activity.setRequestedOrientation(i10);
                } catch (Throwable unused) {
                }
                if (!z10) {
                    activity.getWindow().setFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
                } else {
                    activity.getWindow().clearFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(m3.b bVar, int i10, boolean z10) {
        if (C()) {
            long n10 = (((float) (i10 * this.f12803q)) * 1.0f) / t.n(this.f12794h.get(), "tt_video_progress_max");
            if (this.f12803q > 0) {
                this.X = (int) n10;
            } else {
                this.X = 0L;
            }
            d dVar = this.f12790d;
            if (dVar != null) {
                dVar.a(this.X);
            }
        }
    }

    private void b(Context context, int i10) {
        if (!C() || context == null || this.Z == i10) {
            return;
        }
        this.Z = i10;
        if (i10 != 4 && i10 != 0) {
            this.E = false;
        }
        if (!this.E && !q() && this.B) {
            c(2, i10);
        }
        WeakReference<a> weakReference = this.J;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.J.get().a(this.Z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10, long j11) {
        this.f12792f = j10;
        this.f12803q = j11;
        this.f12790d.a(j10, j11);
        this.f12790d.a(h3.a.a(j10, j11));
        try {
            c.a aVar = this.f12898w;
            if (aVar != null) {
                aVar.a(j10, j11);
            }
        } catch (Throwable th) {
            l.c("CSJ_VIDEO_NativeController", "onProgressUpdate error: ", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void b(l3.c cVar) {
        this.P = cVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(m3.b bVar, View view, boolean z10, boolean z11) {
        if (this.f12799m) {
            b();
        }
        if (z10 && !this.f12799m && !t()) {
            this.f12790d.b(!u(), false);
            this.f12790d.a(z11, true, false);
        }
        i3.a aVar = this.f12789c;
        if (aVar != null && aVar.l()) {
            this.f12790d.f();
            this.f12790d.e();
            return;
        }
        this.f12790d.f();
    }

    public void a(m3.b bVar, View view, boolean z10) {
        J();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a, m3.a
    public void a() {
        if (com.bytedance.sdk.component.utils.o.c(m.a()) == 0) {
            return;
        }
        f();
        l3.c cVar = this.P;
        if (cVar == null) {
            return;
        }
        cVar.j(this.f12791e.Y());
        this.P.b(this.K);
        this.P.i(this.L);
        this.P.f(null);
        this.P.m(this.f12791e.ac());
        this.P.c(0L);
        this.P.g(p());
        l3.c cVar2 = this.P;
        cVar2.d(cVar2.a());
        a(this.P);
        c(false);
    }

    private void a(long j10, boolean z10) {
        if (this.f12789c == null) {
            return;
        }
        if (z10) {
            K();
        }
        this.f12789c.a(j10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(e.a aVar, String str) {
        int i10 = AnonymousClass6.f12920a[aVar.ordinal()];
        if (i10 == 1) {
            b();
        } else if (i10 == 2) {
            e();
        } else if (i10 != 3) {
        } else {
            d();
            this.f12801o = false;
            this.E = true;
        }
    }

    public void a(Context context, int i10) {
        b(context, i10);
        if (i10 == 4) {
            this.f12801o = false;
            d();
        }
    }

    public void a(a aVar) {
        this.J = new WeakReference<>(aVar);
    }
}
