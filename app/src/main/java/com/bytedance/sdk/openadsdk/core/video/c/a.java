package com.bytedance.sdk.openadsdk.core.video.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.d;
import com.bytedance.sdk.openadsdk.core.widget.e;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import i3.a;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Map;
import m3.b;
import m3.c;

/* compiled from: BaseVideoController.java */
/* loaded from: classes.dex */
public abstract class a extends com.bytedance.sdk.openadsdk.core.video.a.a {
    private c.a C;
    private WeakReference<c.b> G;
    private int H;
    private long K;
    private boolean M;
    private long O;
    private int Q;

    /* renamed from: x  reason: collision with root package name */
    protected l3.c f12836x;

    /* renamed from: z  reason: collision with root package name */
    private final ViewGroup f12838z;
    private long A = 0;
    private long B = 0;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;

    /* renamed from: s  reason: collision with root package name */
    protected Map<String, Object> f12831s = null;

    /* renamed from: t  reason: collision with root package name */
    protected long f12832t = 0;

    /* renamed from: u  reason: collision with root package name */
    protected long f12833u = 0;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f12834v = false;

    /* renamed from: w  reason: collision with root package name */
    protected boolean f12835w = false;
    private boolean I = false;
    private boolean J = true;
    private boolean L = false;

    /* renamed from: y  reason: collision with root package name */
    a.InterfaceC0404a f12837y = new a.InterfaceC0404a() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1
        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onCompletion: ");
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.O();
                }
            });
            if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e.ax() == null || ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e.ax().a() == null) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e.ax().a().d(a.this.g());
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e.ax().a().e(a.this.g());
        }

        @Override // i3.a.InterfaceC0404a
        public void b(i3.a aVar) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onPrepared: ");
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.removeCallbacks(a.this.N);
                    }
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d.b();
                    }
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void c(i3.a aVar) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRelease: ");
        }

        @Override // i3.a.InterfaceC0404a
        public void d(i3.a aVar) {
        }

        @Override // i3.a.InterfaceC0404a
        public void e(i3.a aVar) {
        }

        @Override // i3.a.InterfaceC0404a
        public void b(i3.a aVar, int i10) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferingUpdate: ");
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, final long j10) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRenderStart: ");
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d.b();
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.removeCallbacks(a.this.N);
                        a.this.I = false;
                    }
                    if (a.this.D) {
                        return;
                    }
                    a aVar2 = a.this;
                    aVar2.f12833u = j10;
                    aVar2.x();
                    a.this.V();
                    a.this.D = true;
                    a.this.f12835w = true;
                }
            });
            a.this.K = System.currentTimeMillis();
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, final l3.a aVar2) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onError: ");
            if (aVar2 == null) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1.4
                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(aVar2.a(), aVar2.b());
                    ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.removeCallbacks(a.this.N);
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d.b();
                    }
                    if (a.this.C != null) {
                        a.this.C.b(a.this.B, h3.a.a(((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12792f, ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12803q));
                    }
                }
            });
            aVar2.a();
            aVar2.c();
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, boolean z10) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onSeekCompletion: ");
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1.5
                @Override // java.lang.Runnable
                public void run() {
                    ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.removeCallbacks(a.this.N);
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d.b();
                    }
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, int i10, int i11) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onVideoSizeChanged: ");
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.P()) {
                        if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e == null || (!com.bytedance.sdk.openadsdk.core.e.l.b(((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e) && !a.this.M)) {
                            if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e == null || ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e.t() != 3) {
                                if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e == null || ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e.t() != 0) {
                                    a.this.S();
                                    return;
                                } else {
                                    a.this.T();
                                    return;
                                }
                            }
                            a.this.g(true);
                            return;
                        }
                        a.this.g(true);
                        return;
                    }
                    a.this.Q();
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, int i10, int i11, int i12) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferStart: ");
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d.u();
                        a.this.N();
                        a.this.I = true;
                    }
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, int i10) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferEnd: ");
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d.b();
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.removeCallbacks(a.this.N);
                        a.this.I = false;
                    }
                }
            });
        }

        @Override // i3.a.InterfaceC0404a
        public void a(i3.a aVar, final long j10, final long j11) {
            if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12792f) < 50) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12797k.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.1.9
                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(j10, j11);
                }
            });
            if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e.ax() == null || ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e.ax().a() == null) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12791e.ax().a().a(j10, j11);
        }
    };
    private final Runnable N = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.3
        @Override // java.lang.Runnable
        public void run() {
            if (a.this.C != null) {
                a.this.z();
                a.this.C.a();
            }
        }
    };
    private final BroadcastReceiver P = new BroadcastReceiver() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    a.this.b();
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
                    a.this.a(context, i10);
                }
            } catch (Throwable unused) {
            }
        }
    };
    private boolean R = false;

    /* compiled from: BaseVideoController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.c.a$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12856a;

        static {
            int[] iArr = new int[e.a.values().length];
            f12856a = iArr;
            try {
                iArr[e.a.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12856a[e.a.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12856a[e.a.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, ViewGroup viewGroup, n nVar) {
        this.Q = 1;
        this.Q = o.c(context);
        this.f12838z = viewGroup;
        this.f12794h = new WeakReference<>(context);
        this.f12791e = nVar;
        a(context);
        this.H = u.f(this.f12791e);
    }

    protected abstract void a(int i10, int i11);

    public void a(m3.b bVar, View view, boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(c.d dVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void d(boolean z10) {
    }

    protected abstract int t();

    protected abstract void u();

    protected abstract void v();

    protected abstract void w();

    protected abstract void x();

    protected abstract void y();

    protected abstract void z();

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        int y10;
        int t10 = t();
        if (t10 != 2 && t10 != 1) {
            y10 = t10 == 3 ? m.h().e(String.valueOf(this.H)) : 5;
        } else {
            y10 = m.h().y() * 1000;
        }
        this.f12797k.removeCallbacks(this.N);
        this.f12797k.postDelayed(this.N, y10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (C() && this.f12790d != null) {
            this.f12797k.removeCallbacks(this.N);
            this.f12790d.b();
            long currentTimeMillis = System.currentTimeMillis() - this.A;
            this.B = currentTimeMillis;
            c.a aVar = this.C;
            if (aVar != null) {
                aVar.a(currentTimeMillis, h3.a.a(this.f12792f, this.f12803q));
            }
            if (!this.E) {
                this.E = true;
                long j10 = this.f12803q;
                a(j10, j10);
                long j11 = this.f12803q;
                this.f12792f = j11;
                this.f12793g = j11;
                u();
            }
            this.f12798l = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        n nVar = this.f12791e;
        return nVar == null || nVar.an() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        ViewGroup viewGroup;
        try {
            if (J() != null && this.f12789c != null && (viewGroup = this.f12838z) != null) {
                int width = viewGroup.getWidth();
                int height = this.f12838z.getHeight();
                float j10 = this.f12789c.j();
                float k10 = this.f12789c.k();
                float f10 = width;
                float f11 = height;
                if (j10 / (f10 * 1.0f) <= k10 / (f11 * 1.0f)) {
                    f10 = (f11 / (k10 * 1.0f)) * j10;
                } else {
                    f11 = (f10 / (j10 * 1.0f)) * k10;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) f11);
                layoutParams.addRule(13);
                if (J() instanceof TextureView) {
                    ((TextureView) J()).setLayoutParams(layoutParams);
                } else if (J() instanceof SurfaceView) {
                    ((SurfaceView) J()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            l.c("changeVideoSize", "changeVideoSizeSupportInteraction error", th);
        }
    }

    private boolean R() throws Throwable {
        n nVar;
        WeakReference<Context> weakReference = this.f12794h;
        return weakReference == null || weakReference.get() == null || J() == null || this.f12789c == null || (nVar = this.f12791e) == null || nVar.G() != null || this.f12791e.v() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c A[Catch: all -> 0x0187, TryCatch #0 {all -> 0x0187, blocks: (B:3:0x0004, B:6:0x0025, B:10:0x003f, B:14:0x0059, B:20:0x0073, B:26:0x00ec, B:33:0x0100, B:35:0x011c, B:37:0x013b, B:39:0x014d, B:41:0x0155, B:45:0x0170, B:47:0x0178, B:42:0x015f, B:44:0x0167, B:48:0x0181, B:31:0x00fa, B:18:0x0068), top: B:53:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d A[Catch: all -> 0x0187, TryCatch #0 {all -> 0x0187, blocks: (B:3:0x0004, B:6:0x0025, B:10:0x003f, B:14:0x0059, B:20:0x0073, B:26:0x00ec, B:33:0x0100, B:35:0x011c, B:37:0x013b, B:39:0x014d, B:41:0x0155, B:45:0x0170, B:47:0x0178, B:42:0x015f, B:44:0x0167, B:48:0x0181, B:31:0x00fa, B:18:0x0068), top: B:53:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S() {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.c.a.S():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        n nVar;
        try {
            WeakReference<Context> weakReference = this.f12794h;
            if (weakReference != null && weakReference.get() != null && J() != null && this.f12789c != null && (nVar = this.f12791e) != null) {
                boolean z10 = nVar.am() == 1;
                int[] b10 = v.b(m.a());
                a(b10[0], b10[1], this.f12789c.j(), this.f12789c.k(), z10);
                l.b("changeVideoSize", "changeSize=end");
            }
        } catch (Throwable th) {
            l.a("changeVideoSize", "changeSize error", th);
        }
    }

    private void U() {
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
    public void V() {
        n nVar = this.f12791e;
        if (nVar != null) {
            m.g().a(com.bytedance.sdk.openadsdk.k.e.a(nVar.T(), true, this.f12791e));
        }
    }

    private void c(l3.c cVar) throws Exception {
        if (cVar == null) {
            return;
        }
        this.f12836x = cVar;
        if (this.f12789c != null) {
            n nVar = this.f12791e;
            if (nVar != null) {
                nVar.J();
                cVar.p(String.valueOf(u.f(this.f12791e)));
            }
            cVar.l(1);
            this.f12789c.a(cVar);
        }
        this.A = System.currentTimeMillis();
        if (TextUtils.isEmpty(cVar.z())) {
            return;
        }
        this.f12790d.d(8);
        this.f12790d.d(0);
        a(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.c.a.2
            @Override // java.lang.Runnable
            public void run() {
                a.this.A = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12790d.c(0);
                if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12789c == null || ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12792f != 0) {
                    if (((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12789c != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12789c.b(true, ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12792f, ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12800n);
                        return;
                    }
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12789c.b(true, 0L, ((com.bytedance.sdk.openadsdk.core.video.a.a) a.this).f12800n);
            }
        });
    }

    public void H() {
        a.InterfaceC0404a interfaceC0404a = this.f12837y;
        if (interfaceC0404a != null) {
            interfaceC0404a.a((i3.a) null, 0, 0);
        }
    }

    public void I() {
        if (this.E || !this.D) {
            return;
        }
        w();
        if (this.f12791e.ax() == null || this.f12791e.ax().a() == null) {
            return;
        }
        this.f12791e.ax().a().c(g());
    }

    public com.bykv.vk.openvk.component.video.api.renderview.a J() {
        d dVar;
        WeakReference<Context> weakReference = this.f12794h;
        if (weakReference == null || weakReference.get() == null || (dVar = this.f12790d) == null) {
            return null;
        }
        return dVar.q();
    }

    public boolean K() {
        return this.f12789c.h();
    }

    public boolean L() {
        i3.a aVar = this.f12789c;
        return aVar != null && aVar.l();
    }

    public void M() {
        this.M = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void d() {
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.a();
            this.f12790d.s();
            this.f12790d.v();
        }
        l.a("CSJ_VIDEO_BaseController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.f12796j));
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            if (aVar.m()) {
                if (this.f12796j) {
                    E();
                } else {
                    b(this.f12804r);
                }
                l.a("CSJ_VIDEO_BaseController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.f12796j));
            } else {
                this.f12789c.b(false, this.f12792f, this.f12800n);
            }
        }
        if (this.E || !this.D) {
            return;
        }
        w();
        if (this.f12791e.ax() == null || this.f12791e.ax().a() == null) {
            return;
        }
        this.f12791e.ax().a().c(g());
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void e(boolean z10) {
        this.J = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void f() {
        e();
    }

    protected void g(boolean z10) {
        try {
            l.c("changeVideoSize", "landingPageChangeVideoSize start.......mMaterialMeta.getAdSlot()=" + this.f12791e.x());
            if (!R() || z10) {
                l.c("changeVideoSize", "landingPageChangeVideoSize start check condition complete ... go ..");
                float j10 = this.f12789c.j();
                float k10 = this.f12789c.k();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) j10, (int) k10);
                layoutParams.addRule(13);
                if (J() != null) {
                    if (J() instanceof TextureView) {
                        ((TextureView) J()).setLayoutParams(layoutParams);
                    } else if (J() instanceof SurfaceView) {
                        ((SurfaceView) J()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.f12838z.getLayoutParams();
                    if (this.f12838z.getHeight() > 0) {
                        float min = Math.min(this.f12838z.getWidth() / j10, this.f12838z.getHeight() / k10);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (j10 * min);
                            layoutParams.height = (int) (k10 * min);
                            if (J() instanceof TextureView) {
                                ((TextureView) J()).setLayoutParams(layoutParams);
                            } else if (J() instanceof SurfaceView) {
                                ((SurfaceView) J()).setLayoutParams(layoutParams);
                            }
                            if (this.M) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.f12838z.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
                l.b("changeVideoSize", "changeVideoSize .... complete ... end !!!");
            }
        } catch (Throwable th) {
            l.c("changeVideoSize", "changeSize error", th);
        }
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
        return this.I;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void e() {
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.d();
            this.f12789c = null;
        }
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.i();
        }
        x xVar = this.f12797k;
        if (xVar != null) {
            xVar.removeCallbacks(this.N);
            this.f12797k.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void b(l3.c cVar) {
        this.f12836x = cVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void b() {
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.b();
        }
        if (this.E || !this.D) {
            return;
        }
        v();
        if (this.f12791e.ax() == null || this.f12791e.ax().a() == null) {
            return;
        }
        this.f12791e.ax().a().b(this.f12792f);
    }

    @SuppressLint({"InflateParams"})
    private void a(Context context) {
        EnumSet noneOf = EnumSet.noneOf(b.a.class);
        noneOf.add(b.a.hideCloseBtn);
        noneOf.add(b.a.hideBackBtn);
        d dVar = new d(context.getApplicationContext(), LayoutInflater.from(context.getApplicationContext()).inflate(t.f(context, "tt_video_play_layout_for_live"), (ViewGroup) null, false), true, noneOf, this.f12791e, this);
        this.f12790d = dVar;
        dVar.a(this);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void b(m3.b bVar, int i10) {
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a, m3.a
    public void e(m3.b bVar, View view) {
        a(bVar, view, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void b(m3.b bVar, View view) {
        b(bVar, view, false, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public boolean a(l3.c cVar) {
        c(false);
        if (cVar == null) {
            return false;
        }
        i3.a aVar = this.f12789c;
        if (aVar != null && aVar.m()) {
            this.f12789c.a();
            return true;
        }
        this.f12836x = cVar;
        l.b("CSJ_VIDEO_BaseController", "video local url " + cVar.z());
        if (TextUtils.isEmpty(cVar.z())) {
            l.e("CSJ_VIDEO_BaseController", "No video info");
            return false;
        }
        y();
        this.f12834v = !cVar.z().startsWith("http");
        this.f12800n = cVar.u();
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
            this.f12790d.g();
            this.f12790d.c(cVar.k(), cVar.n());
            this.f12790d.c(this.f12838z);
        }
        if (this.f12789c == null && cVar.B() != -2 && cVar.B() != 1) {
            this.f12789c = new g3.d();
        }
        i3.a aVar2 = this.f12789c;
        if (aVar2 != null) {
            aVar2.a(this.f12837y);
        }
        A();
        this.B = 0L;
        try {
            c(cVar);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void b(m3.b bVar, View view, boolean z10, boolean z11) {
        if (C()) {
            f(!this.f12802p);
            if (!(this.f12794h.get() instanceof Activity)) {
                l.b("CSJ_VIDEO_BaseController", "context is not activity, not support this function.");
                return;
            }
            if (this.f12802p) {
                a(z10 ? 8 : 0);
                d dVar = this.f12790d;
                if (dVar != null) {
                    dVar.a(this.f12838z);
                    this.f12790d.c(false);
                }
            } else {
                a(1);
                d dVar2 = this.f12790d;
                if (dVar2 != null) {
                    dVar2.b(this.f12838z);
                    this.f12790d.c(false);
                }
            }
            WeakReference<c.b> weakReference = this.G;
            c.b bVar2 = weakReference != null ? weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.a(this.f12802p);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void c(m3.b bVar, View view) {
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.i();
        }
        a(true, 3);
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

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void d(m3.b bVar, View view) {
        if (this.f12802p) {
            f(false);
            d dVar = this.f12790d;
            if (dVar != null) {
                dVar.b(this.f12838z);
            }
            a(1);
            return;
        }
        a(true, 3);
    }

    private boolean b(int i10) {
        return this.f12790d.b(i10);
    }

    private boolean b(int i10, int i11) {
        n nVar;
        if (i11 != 4 && i11 != 0) {
            b();
            this.f12801o = true;
            this.F = false;
            d dVar = this.f12790d;
            if (dVar != null && (nVar = this.f12791e) != null) {
                return dVar.a(i10, nVar.J(), true);
            }
        } else if (i11 == 4) {
            this.f12801o = false;
            d dVar2 = this.f12790d;
            if (dVar2 != null) {
                dVar2.s();
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(Map<String, Object> map) {
        this.f12831s = map;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(c.b bVar) {
        this.G = new WeakReference<>(bVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(c.a aVar) {
        this.C = aVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, m3.c
    public void a(boolean z10, int i10) {
        e();
    }

    private void a(float f10, float f11, float f12, float f13, boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            l.b("changeVideoSize", "screenWidth=" + f10 + ",screenHeight=" + f11);
            l.b("changeVideoSize", "videoHeight=" + f13 + ",videoWidth=" + f12);
            if (f12 <= 0.0f || f13 <= 0.0f) {
                f12 = this.f12791e.J().i();
                f13 = this.f12791e.J().f();
            }
            if (f13 > 0.0f && f12 > 0.0f) {
                if (z10) {
                    if (f12 < f13) {
                        return;
                    }
                    l.b("changeVideoSize", "Vertical screen mode use video width compute scale value");
                    layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) ((f13 * f10) / f12));
                    layoutParams.addRule(13);
                } else if (f12 > f13) {
                    return;
                } else {
                    l.b("changeVideoSize", "Landscape screen mode use video height compute scale value");
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) ((f12 * f11) / f13), (int) f11);
                    layoutParams2.addRule(13);
                    layoutParams = layoutParams2;
                }
                if (J() != null) {
                    if (J() instanceof TextureView) {
                        ((TextureView) J()).setLayoutParams(layoutParams);
                    } else if (J() instanceof SurfaceView) {
                        ((SurfaceView) J()).setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            l.a("changeVideoSize", "changeSize error", th);
        }
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
                dVar.c(this.f12838z);
            }
            d(this.f12792f);
            d dVar2 = this.f12790d;
            if (dVar2 != null) {
                dVar2.b(false, false);
            }
        } else {
            d();
            d dVar3 = this.f12790d;
            if (dVar3 != null) {
                dVar3.b(false, false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(m3.b bVar, int i10) {
        if (this.f12789c == null) {
            return;
        }
        a(this.O, b(i10));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(m3.b bVar, int i10, boolean z10) {
        if (C()) {
            long n10 = (((float) (i10 * this.f12803q)) * 1.0f) / t.n(this.f12794h.get(), "tt_video_progress_max");
            if (this.f12803q > 0) {
                this.O = (int) n10;
            } else {
                this.O = 0L;
            }
            d dVar = this.f12790d;
            if (dVar != null) {
                dVar.a(this.O);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10, long j11) {
        this.f12792f = j10;
        this.f12803q = j11;
        this.f12790d.a(j10, j11);
        this.f12790d.a(h3.a.a(j10, j11));
        try {
            c.a aVar = this.C;
            if (aVar != null) {
                aVar.a(j10, j11);
            }
        } catch (Throwable th) {
            l.c("CSJ_VIDEO_BaseController", "onProgressUpdate error: ", th);
        }
    }

    public void a(int i10) {
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
    public void a(m3.b bVar, View view, boolean z10, boolean z11) {
        if (this.f12799m) {
            b();
        }
        if (z10 && !this.f12799m && !K()) {
            this.f12790d.b(!L(), false);
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

    @Override // com.bytedance.sdk.openadsdk.core.video.a.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a, m3.a
    public void a() {
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.e();
            this.f12790d.a();
        }
        d dVar2 = this.f12790d;
        if (dVar2 != null) {
            dVar2.v();
        }
        d(-1L);
    }

    private void a(long j10, boolean z10) {
        if (this.f12789c == null) {
            return;
        }
        if (z10) {
            U();
        }
        this.f12789c.a(j10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(e.a aVar, String str) {
        int i10 = AnonymousClass5.f12856a[aVar.ordinal()];
        if (i10 == 1) {
            b();
        } else if (i10 == 2) {
            a(true, 3);
        } else if (i10 != 3) {
        } else {
            d();
            this.f12801o = false;
            this.F = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i10) {
        if (C() && this.Q != i10) {
            if (!this.F) {
                b(2, i10);
            }
            this.Q = i10;
        }
    }
}
