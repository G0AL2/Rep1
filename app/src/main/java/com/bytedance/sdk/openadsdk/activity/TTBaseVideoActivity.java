package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.a.a;
import com.bytedance.sdk.openadsdk.component.reward.a.f;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.g;
import com.bytedance.sdk.openadsdk.core.e.l;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.j;
import com.bytedance.sdk.openadsdk.core.video.c.b;
import com.bytedance.sdk.openadsdk.core.video.c.c;
import com.bytedance.sdk.openadsdk.core.widget.a;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.g.d;
import com.bytedance.sdk.openadsdk.g.e;
import com.bytedance.sdk.openadsdk.g.f;
import com.bytedance.sdk.openadsdk.g.g;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class TTBaseVideoActivity extends Activity implements x.a, b, c, f {
    protected final AtomicBoolean A;
    protected a B;
    protected IListenerManager C;
    protected String D;
    protected g E;
    boolean F;
    boolean G;
    protected boolean H;
    ProgressBar I;
    protected int J;
    String K;
    protected com.bytedance.sdk.openadsdk.component.reward.b.a L;
    protected boolean M;
    public AtomicBoolean N;
    public int O;
    protected e P;
    protected d Q;
    private com.bytedance.sdk.openadsdk.core.b.e R;
    private Double S;
    private long T;
    private AtomicBoolean U;
    private boolean V;
    private boolean W;
    private float X;
    private int Y;
    private int Z;

    /* renamed from: a  reason: collision with root package name */
    protected final String f10684a;

    /* renamed from: aa  reason: collision with root package name */
    private int f10685aa;

    /* renamed from: ab  reason: collision with root package name */
    private boolean f10686ab;

    /* renamed from: ac  reason: collision with root package name */
    private AtomicBoolean f10687ac;

    /* renamed from: ad  reason: collision with root package name */
    private AtomicBoolean f10688ad;

    /* renamed from: ae  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.c f10689ae;

    /* renamed from: af  reason: collision with root package name */
    private LinearLayout f10690af;
    private boolean ag;
    private int ah;

    /* renamed from: b  reason: collision with root package name */
    Context f10691b;

    /* renamed from: c  reason: collision with root package name */
    n f10692c;

    /* renamed from: d  reason: collision with root package name */
    String f10693d;

    /* renamed from: e  reason: collision with root package name */
    TTAdDislikeDialog f10694e;

    /* renamed from: f  reason: collision with root package name */
    TTAdDislikeToast f10695f;

    /* renamed from: g  reason: collision with root package name */
    public AtomicBoolean f10696g;

    /* renamed from: h  reason: collision with root package name */
    public AtomicBoolean f10697h;

    /* renamed from: i  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.view.d f10698i;

    /* renamed from: j  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.view.a f10699j;

    /* renamed from: k  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.a.c f10700k;

    /* renamed from: l  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.view.b f10701l;

    /* renamed from: m  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.a.e f10702m;

    /* renamed from: n  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.a.a f10703n;

    /* renamed from: o  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.a.f f10704o;

    /* renamed from: p  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.a.b f10705p;

    /* renamed from: q  reason: collision with root package name */
    final x f10706q;

    /* renamed from: r  reason: collision with root package name */
    boolean f10707r;

    /* renamed from: s  reason: collision with root package name */
    int f10708s;

    /* renamed from: t  reason: collision with root package name */
    int f10709t;

    /* renamed from: u  reason: collision with root package name */
    protected int f10710u;

    /* renamed from: v  reason: collision with root package name */
    final AtomicBoolean f10711v;

    /* renamed from: w  reason: collision with root package name */
    final AtomicBoolean f10712w;

    /* renamed from: x  reason: collision with root package name */
    final AtomicBoolean f10713x;

    /* renamed from: y  reason: collision with root package name */
    final AtomicBoolean f10714y;

    /* renamed from: z  reason: collision with root package name */
    final AtomicBoolean f10715z;

    public TTBaseVideoActivity() {
        this.f10684a = I() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.S = null;
        this.T = 0L;
        this.U = new AtomicBoolean(false);
        this.f10696g = new AtomicBoolean(false);
        this.f10697h = new AtomicBoolean(false);
        this.f10698i = J() ? new com.bytedance.sdk.openadsdk.component.reward.view.d(this) : new com.bytedance.sdk.openadsdk.component.reward.view.c(this);
        this.f10699j = new com.bytedance.sdk.openadsdk.component.reward.view.a(this);
        this.f10700k = new com.bytedance.sdk.openadsdk.component.reward.a.c(this);
        this.f10701l = new com.bytedance.sdk.openadsdk.component.reward.view.b(this);
        this.f10702m = new com.bytedance.sdk.openadsdk.component.reward.a.e(this);
        this.f10703n = new com.bytedance.sdk.openadsdk.component.reward.a.a(this);
        this.f10704o = new com.bytedance.sdk.openadsdk.component.reward.a.f(this);
        this.f10705p = new com.bytedance.sdk.openadsdk.component.reward.a.b(this);
        this.f10706q = new x(Looper.getMainLooper(), this);
        this.f10707r = true;
        this.f10710u = 0;
        this.f10711v = new AtomicBoolean(false);
        this.f10712w = new AtomicBoolean(false);
        this.f10713x = new AtomicBoolean(false);
        this.f10714y = new AtomicBoolean(false);
        this.f10715z = new AtomicBoolean(false);
        this.A = new AtomicBoolean(false);
        this.V = false;
        this.H = false;
        this.J = -1;
        this.K = "video_player";
        this.W = false;
        this.Y = 1;
        this.f10686ab = true;
        this.N = new AtomicBoolean(false);
        this.f10687ac = new AtomicBoolean(false);
        this.f10688ad = new AtomicBoolean(false);
        this.ah = 0;
        this.P = new e() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.g.e
            public void a() {
                TTBaseVideoActivity.this.A();
            }
        };
        this.Q = new d() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.g.d
            public void a() {
                n nVar;
                if (TTBaseVideoActivity.this.isFinishing()) {
                    return;
                }
                n nVar2 = TTBaseVideoActivity.this.f10692c;
                if ((nVar2 != null && !nVar2.aG()) || (nVar = TTBaseVideoActivity.this.f10692c) == null || p.g(nVar)) {
                    return;
                }
                TTBaseVideoActivity.this.f10706q.removeMessages(800);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                tTBaseVideoActivity.f10706q.sendMessage(tTBaseVideoActivity.e(1));
            }

            @Override // com.bytedance.sdk.openadsdk.g.d
            public void a(int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.g.d
            public void b() {
            }
        };
    }

    private void M() {
        if (I()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.component.reward.b.c.a(this.f10692c)) {
            com.bytedance.sdk.openadsdk.component.reward.b.c cVar = new com.bytedance.sdk.openadsdk.component.reward.b.c(this, this.f10692c, this.Z, this.f10685aa);
            this.L = cVar;
            cVar.a(this.f10700k, this.f10698i);
            this.L.a(this.f10702m.z());
            this.L.a(this.Y);
            this.L.a(this.X);
            this.L.a(this.R);
        } else if (com.bytedance.sdk.openadsdk.component.reward.b.b.c(this.f10692c)) {
            com.bytedance.sdk.openadsdk.component.reward.b.b bVar = new com.bytedance.sdk.openadsdk.component.reward.b.b(this, this.f10692c, this.Z, this.f10685aa);
            this.L = bVar;
            bVar.a(this.f10700k, this.f10698i);
            this.L.a(this.Y);
            this.L.a(this.X);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N() {
        return this.f10692c.aw() || this.f10692c.ad() == 15 || this.f10692c.ad() == 5 || this.f10692c.ad() == 50;
    }

    private void O() {
        n nVar = this.f10692c;
        if (nVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.h.a.b e10 = com.bytedance.sdk.openadsdk.h.a.b.b().a(I() ? 7 : 8).c(String.valueOf(u.f(nVar))).e(u.h(this.f10692c));
        e10.b(this.f10704o.n()).f(this.f10704o.o());
        e10.g(this.f10692c.ac()).d(this.f10692c.Y());
        com.bytedance.sdk.openadsdk.h.b.a().f(e10);
    }

    private void P() {
        this.f10706q.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.17
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTBaseVideoActivity.this.getWindow().getDecorView().findViewById(16908335).setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        com.bytedance.sdk.openadsdk.component.reward.view.b bVar;
        com.bytedance.sdk.openadsdk.component.reward.b.a aVar = this.L;
        if (aVar != null && !aVar.c()) {
            HashMap hashMap = new HashMap();
            if (J() && (bVar = this.f10701l) != null) {
                hashMap.put("dynamic_show_type", Integer.valueOf(bVar.i()));
            }
            if (!TextUtils.isEmpty(this.D)) {
                hashMap.put("rit_scene", this.D);
            }
            View findViewById = findViewById(16908290);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", findViewById.getWidth());
                jSONObject.put("height", findViewById.getHeight());
                jSONObject.put("alpha", findViewById.getAlpha());
            } catch (Throwable unused) {
            }
            hashMap.put("root_view", jSONObject.toString());
            this.U.set(true);
            com.bytedance.sdk.openadsdk.b.e.a(this.f10691b, this.f10692c, this.f10684a, hashMap, this.S);
            K();
        } else if (a(this.f10702m.h(), false)) {
        } else {
            this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
            x();
            com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.f10702m;
            eVar.a(1 ^ eVar.B(), 4);
        }
    }

    private void R() {
        LinearLayout linearLayout = (LinearLayout) findViewById(t.e(this.f10691b, "tt_lp_new_style_container"));
        this.f10690af = linearLayout;
        v.a((View) linearLayout, 8);
        com.bytedance.sdk.openadsdk.common.c cVar = new com.bytedance.sdk.openadsdk.common.c(this, this.f10692c, "landingpage_endcard");
        this.f10689ae = cVar;
        cVar.c().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTBaseVideoActivity.this.f10698i.k().performClick();
            }
        });
        this.f10690af.addView(this.f10689ae.e(), new LinearLayout.LayoutParams(-1, -1));
        this.f10704o.a(this.f10689ae);
    }

    private void S() {
        if (this.Y == 2) {
            if (w()) {
                setRequestedOrientation(8);
                return;
            } else {
                setRequestedOrientation(0);
                return;
            }
        }
        setRequestedOrientation(1);
    }

    private void T() {
        try {
            final boolean z10 = true;
            final boolean z11 = this.f10686ab && m.h().u() == 1;
            if (!this.f10686ab || !v.c((Activity) this) || Build.VERSION.SDK_INT < 19) {
                z10 = false;
            }
            if (z10 || z11) {
                this.f10706q.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
                    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3 A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0017, B:9:0x0050, B:11:0x0073, B:13:0x0081, B:14:0x0089, B:25:0x00bd, B:27:0x00c3, B:28:0x00c6, B:30:0x00d2, B:15:0x008c, B:17:0x0094, B:19:0x00a2, B:21:0x00a6, B:22:0x00b0, B:24:0x00b4, B:7:0x0033), top: B:33:0x0000 }] */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2 A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #0 {all -> 0x00d7, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x0017, B:9:0x0050, B:11:0x0073, B:13:0x0081, B:14:0x0089, B:25:0x00bd, B:27:0x00c3, B:28:0x00c6, B:30:0x00d2, B:15:0x008c, B:17:0x0094, B:19:0x00a2, B:21:0x00a6, B:22:0x00b0, B:24:0x00b4, B:7:0x0033), top: B:33:0x0000 }] */
                    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void run() {
                        /*
                            r8 = this;
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            int r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.e(r0)     // Catch: java.lang.Throwable -> Ld7
                            r1 = 2
                            if (r0 != r1) goto L33
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> Ld7
                            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> Ld7
                            int r0 = r0.orientation     // Catch: java.lang.Throwable -> Ld7
                            if (r0 != r1) goto L33
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Ld7
                            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Ld7
                            int r0 = r0.getWidth()     // Catch: java.lang.Throwable -> Ld7
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.content.Context r2 = r2.f10691b     // Catch: java.lang.Throwable -> Ld7
                            int r2 = com.bytedance.sdk.openadsdk.utils.v.i(r2)     // Catch: java.lang.Throwable -> Ld7
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Ld7
                            goto L4e
                        L33:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Ld7
                            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Ld7
                            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> Ld7
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.content.Context r2 = r2.f10691b     // Catch: java.lang.Throwable -> Ld7
                            int r2 = com.bytedance.sdk.openadsdk.utils.v.h(r2)     // Catch: java.lang.Throwable -> Ld7
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Ld7
                        L4e:
                            if (r0 != 0) goto Ld7
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Ld7
                            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Ld7
                            int r2 = r0.getPaddingLeft()     // Catch: java.lang.Throwable -> Ld7
                            int r3 = r0.getPaddingTop()     // Catch: java.lang.Throwable -> Ld7
                            int r4 = r0.getPaddingRight()     // Catch: java.lang.Throwable -> Ld7
                            int r5 = r0.getPaddingBottom()     // Catch: java.lang.Throwable -> Ld7
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            int r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.e(r6)     // Catch: java.lang.Throwable -> Ld7
                            r7 = 1
                            if (r6 != r7) goto L8c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> Ld7
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Ld7
                            int r6 = r6.orientation     // Catch: java.lang.Throwable -> Ld7
                            if (r6 != r7) goto L8c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.content.Context r1 = r1.f10691b     // Catch: java.lang.Throwable -> Ld7
                            float r1 = com.bytedance.sdk.openadsdk.utils.v.j(r1)     // Catch: java.lang.Throwable -> Ld7
                        L89:
                            int r1 = (int) r1     // Catch: java.lang.Throwable -> Ld7
                            int r3 = r3 + r1
                            goto Lbd
                        L8c:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            int r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.e(r6)     // Catch: java.lang.Throwable -> Ld7
                            if (r6 != r1) goto Lbd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> Ld7
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Ld7
                            int r6 = r6.orientation     // Catch: java.lang.Throwable -> Ld7
                            if (r6 != r1) goto Lbd
                            boolean r1 = r2     // Catch: java.lang.Throwable -> Ld7
                            if (r1 == 0) goto Lb0
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.content.Context r1 = r1.f10691b     // Catch: java.lang.Throwable -> Ld7
                            float r1 = com.bytedance.sdk.openadsdk.utils.v.j(r1)     // Catch: java.lang.Throwable -> Ld7
                            int r1 = (int) r1     // Catch: java.lang.Throwable -> Ld7
                            int r2 = r2 + r1
                        Lb0:
                            boolean r1 = r3     // Catch: java.lang.Throwable -> Ld7
                            if (r1 == 0) goto Lbd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            android.content.Context r1 = r1.f10691b     // Catch: java.lang.Throwable -> Ld7
                            float r1 = com.bytedance.sdk.openadsdk.utils.v.j(r1)     // Catch: java.lang.Throwable -> Ld7
                            goto L89
                        Lbd:
                            boolean r1 = r0.isAttachedToWindow()     // Catch: java.lang.Throwable -> Ld7
                            if (r1 == 0) goto Lc6
                            r0.setPadding(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Ld7
                        Lc6:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch: java.lang.Throwable -> Ld7
                            float r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.f(r1)     // Catch: java.lang.Throwable -> Ld7
                            r2 = 1120403456(0x42c80000, float:100.0)
                            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                            if (r1 != 0) goto Ld7
                            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                            r0.setBackgroundColor(r1)     // Catch: java.lang.Throwable -> Ld7
                        Ld7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.AnonymousClass2.run():void");
                    }
                });
            }
            this.f10686ab = false;
        } catch (Exception unused) {
        }
    }

    private float U() {
        return v.d(this.f10691b, v.h(this.f10691b));
    }

    private float V() {
        return v.d(this.f10691b, v.i(this.f10691b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        if (this.f10711v.get() || !this.H || p.i(this.f10692c)) {
            return;
        }
        if ((!n.c(this.f10692c) && m.h().j(String.valueOf(this.f10709t)) == 1 && this.f10701l.d()) || l.c(this.f10692c)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.b.a aVar = this.L;
        if (aVar == null || aVar.c()) {
            this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
            Message obtain = Message.obtain();
            obtain.what = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
            this.f10706q.sendMessageDelayed(obtain, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
    }

    private void Y() {
        this.f10700k.a(this.f10692c.ap());
    }

    private boolean Z() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.f10711v.get();
        }
        return true;
    }

    private void aa() {
        this.f10695f.a(com.bytedance.sdk.openadsdk.core.i.f.f12352d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        this.f10695f.a(com.bytedance.sdk.openadsdk.core.i.f.f12353e);
    }

    private boolean ac() {
        if (!l.b(this.f10692c) || !this.N.get()) {
            return (this.f10711v.get() || this.f10714y.get() || p.i(this.f10692c)) ? false : true;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.f10698i;
        if (dVar != null) {
            dVar.h().setVisibility(4);
            this.f10698i.h().setVisibility(0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        try {
            Context context = this.f10691b;
            Animation loadAnimation = AnimationUtils.loadAnimation(context, t.l(context, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.14
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        TTBaseVideoActivity.this.f10698i.m();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.f10698i.a(loadAnimation);
            } else {
                this.f10698i.m();
            }
        } catch (Throwable unused) {
            this.f10698i.m();
        }
    }

    protected void A() {
    }

    protected void B() {
        if (J() && !this.V) {
            this.V = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    if (tTBaseVideoActivity.f10692c == null) {
                        return;
                    }
                    tTBaseVideoActivity.a(tTBaseVideoActivity.C());
                }
            });
        }
    }

    public float[] C() {
        float[] fArr = {getWindow().getDecorView().getWidth() - (getWindow().getDecorView().getPaddingLeft() * 2), getWindow().getDecorView().getHeight() - (getWindow().getDecorView().getPaddingTop() * 2)};
        fArr[0] = v.d(this, fArr[0]);
        fArr[1] = v.d(this, fArr[1]);
        if (fArr[0] < 10.0f || fArr[1] < 10.0f) {
            com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "get root view size error, so run backup");
            return c(this.f10710u);
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D() {
        Message message = new Message();
        message.what = DownloadResource.STATUS_BAD_REQUEST;
        if (I()) {
            f(10000);
        }
        x xVar = this.f10706q;
        if (xVar != null) {
            xVar.sendMessageDelayed(message, Constants.MIN_PROGRESS_TIME);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void E() {
        this.f10706q.removeMessages(DownloadResource.STATUS_BAD_REQUEST);
    }

    void F() {
        if (this.f10694e == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this, this.f10692c);
            this.f10694e = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.13
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                public void a(View view) {
                    TTBaseVideoActivity.this.f10714y.set(true);
                    TTBaseVideoActivity.this.X();
                    if (TTBaseVideoActivity.this.f10702m.b()) {
                        TTBaseVideoActivity.this.f10702m.o();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                public void b(View view) {
                    TTBaseVideoActivity.this.f10714y.set(false);
                    TTBaseVideoActivity.this.W();
                    if (TTBaseVideoActivity.this.f10702m.d()) {
                        TTBaseVideoActivity.this.f10702m.n();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                public void c(View view) {
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                public void a(int i10, FilterWord filterWord) {
                    if (TTBaseVideoActivity.this.f10715z.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTBaseVideoActivity.this.f10715z.set(true);
                    TTBaseVideoActivity.this.ab();
                }
            });
            ((FrameLayout) findViewById(16908290)).addView(this.f10694e);
        }
        if (this.f10695f == null) {
            this.f10695f = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f10695f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void G() {
        if (isFinishing()) {
            return;
        }
        if (this.f10715z.get()) {
            aa();
            return;
        }
        if (this.f10694e == null) {
            F();
        }
        this.f10694e.a();
    }

    protected abstract void H();

    protected abstract boolean I();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean J() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.c
    public void e() {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (com.bytedance.sdk.openadsdk.utils.m.e()) {
            v.b((Activity) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.c
    public View m() {
        com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.f10702m;
        if (eVar != null) {
            return eVar.E();
        }
        return null;
    }

    public void n() {
        if (this.ag) {
            return;
        }
        this.f10700k.d();
        this.f10698i.d(0);
    }

    protected void o() {
        if (p.i(this.f10692c)) {
            a(false);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.b.a aVar = this.L;
        if (aVar != null) {
            aVar.a(this.f10698i.h());
        }
        Q();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v.a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.4
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTBaseVideoActivity.this.isFinishing()) {
                            return;
                        }
                        TTBaseVideoActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                v.a((Activity) TTBaseVideoActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        int e10;
        com.bytedance.sdk.openadsdk.component.reward.a.b bVar;
        com.bytedance.sdk.openadsdk.component.reward.a.c cVar;
        if (m.h().h(this.f10709t) == 1) {
            if (I()) {
                if (p.i(this.f10692c)) {
                    e10 = m.h().a(String.valueOf(this.f10709t), true);
                } else {
                    e10 = m.h().f(this.f10709t);
                }
            } else if (p.i(this.f10692c)) {
                e10 = m.h().a(String.valueOf(this.f10709t), false);
            } else {
                e10 = m.h().e(this.f10709t);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.f10698i;
            if (dVar != null && dVar.j()) {
                com.bytedance.sdk.openadsdk.component.reward.view.d dVar2 = this.f10698i;
                if (dVar2 != null) {
                    dVar2.k().performClick();
                }
            } else if ((!this.f10711v.get() || p.i(this.f10692c)) && e10 != -1) {
                com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.f10702m;
                if (((eVar == null || eVar.f() < e10 * 1000) && ((bVar = this.f10705p) == null || bVar.j() - this.f10705p.k() < e10)) || (cVar = this.f10700k) == null) {
                    return;
                }
                cVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        a(getIntent());
        a(bundle);
        try {
            m.a(this);
            this.f10710u = v.d(this, v.j(this));
            requestWindowFeature(1);
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        if (bundle != null && bundle.getLong("video_current") > 0) {
            this.f10702m.b(bundle.getLong("video_current", 0L));
        }
        this.f10691b = this;
        g gVar = new g(getApplicationContext());
        this.E = gVar;
        gVar.a(this);
        this.J = this.E.g();
        getWindow().addFlags(128);
        com.bytedance.sdk.component.utils.l.b("onVolumeChanged", "onCreate >>>>>> mVolume = " + this.J);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.T > 0 && this.U.get()) {
            com.bytedance.sdk.openadsdk.b.e.a((System.currentTimeMillis() - this.T) + "", this.f10692c, this.f10684a, this.f10702m.a());
            this.T = 0L;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.b bVar = this.f10701l;
        if (bVar != null) {
            bVar.f();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.f10698i;
        if (dVar != null) {
            dVar.n();
        }
        TTAdDislikeToast tTAdDislikeToast = this.f10695f;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.b();
        }
        this.f10706q.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.reward.a.f fVar = this.f10704o;
        if (fVar != null && fVar.c() != null) {
            z.a(this.f10691b, this.f10704o.c().getWebView());
            z.a(this.f10704o.c().getWebView());
        }
        this.f10702m.c(I());
        com.bytedance.sdk.openadsdk.component.reward.b.a aVar = this.L;
        if (aVar != null && !aVar.b() && !this.f10711v.get()) {
            this.f10704o.q();
        }
        com.bytedance.sdk.openadsdk.component.reward.a.f fVar2 = this.f10704o;
        if (fVar2 != null) {
            fVar2.i();
        }
        g gVar = this.E;
        if (gVar != null) {
            gVar.f();
            this.E.a((f) null);
        }
        this.f10705p.a(getApplicationContext());
        this.f10698i.m();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.f10698i;
        if (dVar != null) {
            dVar.q();
        }
        this.H = false;
        com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "onPause mIsActivityShow=" + this.H + " mIsMute=" + this.f10707r);
        if (!this.f10714y.get()) {
            this.f10702m.i();
        }
        X();
        if (p.i(this.f10692c)) {
            this.f10706q.removeMessages(900);
            this.f10706q.removeMessages(600);
            this.f10705p.a("go_background");
        }
        this.f10704o.l();
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.H = true;
        com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "onResume mIsActivityShow=" + this.H + " mIsMute=" + this.f10707r);
        T();
        if (Z()) {
            Y();
        }
        if (p.a(this.f10692c)) {
            if (this.J == 0) {
                this.f10707r = true;
            }
            if (this.f10707r) {
                this.E.a(true);
                this.f10700k.b(true);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28 && i10 >= 24) {
            try {
                super.onResume();
            } catch (IllegalArgumentException e10) {
                com.bytedance.sdk.component.utils.l.c("TTBaseVideoActivity", "super.onResume() run fail", e10);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                } catch (Exception e11) {
                    com.bytedance.sdk.component.utils.l.c("TTBaseVideoActivity", "onResume set mCalled fail", e11);
                }
            }
        } else {
            super.onResume();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.f10698i;
        if (dVar != null) {
            dVar.o();
        }
        this.f10704o.m();
        g gVar = this.E;
        if (gVar != null) {
            gVar.a(this);
            this.E.e();
        }
        if (ac()) {
            W();
            this.f10702m.a(false, this, this.ah != 0);
        }
        this.ah++;
        if (this.f10705p.i() && p.i(this.f10692c)) {
            this.f10705p.a("return_foreground");
            a aVar = this.B;
            if ((aVar == null || !aVar.isShowing()) && this.f10705p.k() > 0) {
                Message obtain = Message.obtain();
                obtain.what = 900;
                obtain.arg1 = this.f10705p.k();
                this.f10706q.sendMessage(obtain);
            }
        }
        B();
        com.bytedance.sdk.openadsdk.component.reward.view.b bVar = this.f10701l;
        if (bVar != null) {
            bVar.g();
        }
        P();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            n nVar = this.f10692c;
            bundle.putString("material_meta", nVar != null ? nVar.ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f10693d);
            bundle.putString("video_cache_url", this.f10702m.z());
            bundle.putLong("video_current", this.f10702m.s());
            bundle.putBoolean("is_mute", this.f10707r);
            bundle.putString("rit_scene", this.D);
            bundle.putBoolean("has_show_skip_btn", this.f10712w.get());
            Double d10 = this.S;
            bundle.putString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d10 == null ? "" : String.valueOf(d10));
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f10704o.w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.f10698i;
        if (dVar != null) {
            dVar.p();
        }
        com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "onStop mIsMute=" + this.f10707r + " mLast=" + this.E.b() + " mVolume=" + this.J);
        this.f10704o.k();
        if (p.i(this.f10692c)) {
            this.f10706q.removeMessages(900);
            this.f10706q.removeMessages(600);
            this.f10705p.a("go_background");
        }
        if (this.f10707r) {
            runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    if (TTBaseVideoActivity.this.E.b() > 0) {
                        TTBaseVideoActivity.this.E.a(false);
                    }
                }
            });
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10 && this.U.get()) {
            com.bytedance.sdk.openadsdk.b.e.a((System.currentTimeMillis() - this.T) + "", this.f10692c, this.f10684a, this.f10702m.a());
            this.T = 0L;
            return;
        }
        this.T = System.currentTimeMillis();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    void p() {
        if (this.f10692c == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.b.e eVar = new com.bytedance.sdk.openadsdk.core.b.e(this, this.f10692c, this.f10684a, I() ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.19
            @Override // com.bytedance.sdk.openadsdk.core.b.e
            public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, int i10, int i11, int i12, boolean z10) {
                com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "ccr log, onRewardBarClick , x = " + f10);
                n nVar = TTBaseVideoActivity.this.f10692c;
                if (nVar != null && nVar.aw() && view != null && view.getTag() != null) {
                    a(view.getTag().toString());
                }
                HashMap hashMap = new HashMap();
                if (TTBaseVideoActivity.this.f10711v.get()) {
                    hashMap.put("click_scence", 2);
                } else if (p.i(TTBaseVideoActivity.this.f10692c)) {
                    hashMap.put("click_scence", 3);
                } else {
                    hashMap.put("click_scence", 1);
                }
                a(hashMap);
                TTBaseVideoActivity.this.onRewardBarClick(view);
                if (view.getId() == t.e(TTBaseVideoActivity.this, "tt_playable_play") && p.i(TTBaseVideoActivity.this.f10692c)) {
                    HashMap hashMap2 = new HashMap();
                    if (TTBaseVideoActivity.this.f10692c.J() != null) {
                        hashMap2.put("playable_url", TTBaseVideoActivity.this.f10692c.J().A());
                    }
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.b.e.e(tTBaseVideoActivity, tTBaseVideoActivity.f10692c, tTBaseVideoActivity.f10684a, "click_playable_download_button_loading", hashMap2);
                }
                TTBaseVideoActivity.this.f10703n.a(view, f10, f11, f12, f13, sparseArray, i10, i11, i12, new a.InterfaceC0165a() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.19.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.a.a.InterfaceC0165a
                    public void a(String str, JSONObject jSONObject) {
                        TTBaseVideoActivity.this.a(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.a.a.InterfaceC0165a
                    public void a(View view2, float f14, float f15, float f16, float f17, SparseArray<c.a> sparseArray2, int i13, int i14, int i15) {
                        TTBaseVideoActivity.this.a(view2, f14, f15, f16, f17, sparseArray2, i13, i14, i15);
                    }
                });
            }
        };
        this.R = eVar;
        eVar.a(findViewById(16908290));
        this.R.b(findViewById(t.e(m.a(), "tt_top_dislike")));
        if (!TextUtils.isEmpty(this.D)) {
            HashMap hashMap = new HashMap();
            hashMap.put("rit_scene", this.D);
            this.R.a(hashMap);
        }
        if (this.f10703n.c() != null) {
            this.R.a(this.f10703n.c());
        }
        this.f10705p.a(this.R);
        com.bytedance.sdk.openadsdk.core.b.b bVar = new com.bytedance.sdk.openadsdk.core.b.b(this, this.f10692c, this.f10684a, I() ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.20
            @Override // com.bytedance.sdk.openadsdk.core.b.b, com.bytedance.sdk.openadsdk.core.b.c
            public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
                try {
                    TTBaseVideoActivity.this.a(view, f10, f11, f12, f13, sparseArray, this.A, this.f11898y, this.f11899z);
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.l.e("TTBaseVideoActivity", "onClickReport error :" + e10.getMessage());
                }
            }
        };
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.f10698i;
        com.bytedance.sdk.openadsdk.core.b.e eVar2 = this.R;
        dVar.a(eVar2, eVar2, bVar, this.f10702m);
        this.f10699j.a(this.R);
        this.f10699j.a(this.f10692c, this.f10684a);
    }

    protected JSONObject q() {
        try {
            long p10 = this.f10702m.p();
            int q10 = this.f10702m.q();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", p10);
                jSONObject.put("percent", q10);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    boolean r() {
        n nVar = this.f10692c;
        return (nVar == null || nVar.I() == 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        HashMap hashMap = new HashMap();
        if (p.i(this.f10692c)) {
            this.f10705p.a(hashMap);
        }
        Context context = this.f10691b;
        n nVar = this.f10692c;
        String str = this.f10684a;
        if (I()) {
            hashMap = null;
        }
        com.bytedance.sdk.openadsdk.b.e.b(context, nVar, str, "click_close", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        this.f10709t = u.f(this.f10692c);
        this.f10707r = m.h().b(this.f10709t);
        this.X = this.f10692c.an();
        if (26 == Build.VERSION.SDK_INT) {
            if (this.f10691b.getResources().getConfiguration().orientation == 1) {
                this.Y = 1;
            } else {
                this.Y = 2;
            }
        } else {
            this.Y = this.f10692c.am();
        }
        if (this.Y == 2 || !v.c((Activity) this)) {
            getWindow().addFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u() {
        n nVar = this.f10692c;
        if (nVar == null) {
            finish();
            return;
        }
        setContentView(this.f10698i.a(nVar));
        this.ag = l.d(this.f10692c);
        v();
        this.f10698i.a(this.f10692c, this.f10684a, this.Y, I(), this.f10700k);
        this.f10699j.a();
        if (!this.f10692c.aw()) {
            if (this.ag) {
                R();
            }
            this.f10704o.a(this.f10692c, this.f10684a, this.Y, I());
            this.f10704o.b(this.Z, this.f10685aa);
        }
        this.f10705p.a(this.f10704o, this.f10692c, this.f10684a, this.Y);
    }

    protected void v() {
        float min;
        float max;
        int max2;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 != 26) {
            if (i11 == 27) {
                try {
                    S();
                } catch (Throwable unused) {
                }
            } else {
                S();
            }
        }
        float V = V();
        float U = U();
        if (this.Y == 2) {
            min = Math.max(V, U);
            max = Math.min(V, U);
        } else {
            min = Math.min(V, U);
            max = Math.max(V, U);
        }
        Context context = this.f10691b;
        int d10 = v.d(context, v.j(context));
        if (this.Y != 2) {
            if (v.c((Activity) this)) {
                max -= d10;
            }
        } else if (v.c((Activity) this)) {
            min -= d10;
        }
        if (I()) {
            this.Z = (int) min;
            this.f10685aa = (int) max;
            return;
        }
        int i12 = 20;
        int i13 = 0;
        if (this.Y != 2) {
            float f10 = this.X;
            if (f10 != 0.0f && f10 != 100.0f) {
                float f11 = 20;
                i10 = (int) Math.max((max - (((min - f11) - f11) / f10)) / 2.0f, 0.0f);
                i13 = i10;
                max2 = 20;
            }
            max2 = 0;
            i10 = 0;
            i12 = 0;
        } else {
            float f12 = this.X;
            if (f12 != 0.0f && f12 != 100.0f) {
                float f13 = 20;
                max2 = (int) Math.max((min - (((max - f13) - f13) * f12)) / 2.0f, 0.0f);
                i12 = max2;
                i10 = 20;
                i13 = 20;
            }
            max2 = 0;
            i10 = 0;
            i12 = 0;
        }
        float f14 = i12;
        float f15 = max2;
        this.Z = (int) ((min - f14) - f15);
        float f16 = i13;
        float f17 = i10;
        this.f10685aa = (int) ((max - f16) - f17);
        getWindow().getDecorView().setPadding(v.e(this, f14), v.e(this, f16), v.e(this, f15), v.e(this, f17));
    }

    protected boolean w() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception unused) {
            return false;
        }
    }

    protected void x() {
        this.f10702m.t();
        this.f10702m.m();
        a(false, true);
        if (I()) {
            f(10000);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y() {
        x xVar = this.f10706q;
        if (xVar != null) {
            xVar.removeMessages(900);
            this.f10706q.removeMessages(600);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z() {
        Message obtain = Message.obtain();
        obtain.what = 900;
        obtain.arg1 = this.f10705p.k();
        this.f10706q.sendMessageDelayed(obtain, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message e(int i10) {
        Message obtain = Message.obtain();
        obtain.what = 800;
        obtain.arg1 = i10;
        return obtain;
    }

    protected void b() {
        if (p.a(this.f10692c) && this.J == 0) {
            this.f10707r = true;
            this.f10700k.b(true);
        }
    }

    void c() {
        if (p.j(this.f10692c) && this.f10707r) {
            this.f10700k.b(true);
            this.E.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        this.f10700k.a();
        this.f10700k.a(I(), this.f10692c);
        if (this.f10692c.aw()) {
            this.f10700k.a(false);
        } else {
            this.f10700k.a(this.f10692c.ap());
        }
        if (p.a(this.f10692c)) {
            this.f10704o.c().setBackgroundColor(-16777216);
            this.f10704o.d().setBackgroundColor(-16777216);
            this.f10700k.c(true);
            if (p.i(this.f10692c)) {
                this.f10698i.b();
                v.a((View) this.f10704o.c(), 4);
                v.a((View) this.f10704o.d(), 0);
            }
        }
        if (l.c(this.f10692c) || l.b(this.f10692c)) {
            return;
        }
        this.f10698i.a(v.e(this.f10691b, this.Z), v.e(this.f10691b, this.f10685aa));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.c
    public void f() {
        if (!this.f10697h.getAndSet(true) || p.i(this.f10692c)) {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(this.D)) {
                hashMap = new HashMap();
                hashMap.put("rit_scene", this.D);
                View findViewById = findViewById(16908290);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", findViewById.getWidth());
                    jSONObject.put("height", findViewById.getHeight());
                    jSONObject.put("alpha", findViewById.getAlpha());
                } catch (Throwable unused) {
                }
                hashMap.put("root_view", jSONObject.toString());
            }
            if (this.U.get() && l.c(this.f10692c)) {
                return;
            }
            this.U.set(true);
            com.bytedance.sdk.openadsdk.b.e.a(this.f10691b, this.f10692c, this.f10684a, hashMap, this.S);
            K();
        }
    }

    protected String g() {
        String a10 = t.a(this, "tt_video_download_apk");
        n nVar = this.f10692c;
        if (nVar == null) {
            return a10;
        }
        if (TextUtils.isEmpty(nVar.W())) {
            return this.f10692c.L() != 4 ? t.a(this, "tt_video_mobile_go_detail") : a10;
        }
        return this.f10692c.W();
    }

    protected void h() {
        if (this.f10705p.a() && p.i(this.f10692c) && p.g(this.f10692c)) {
            this.f10706q.sendMessageDelayed(e(2), 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean i() {
        return m.h().j(String.valueOf(this.f10709t)) != 1;
    }

    protected void j() {
        this.f10699j.a(this.f10692c);
        this.f10699j.a(g());
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.c
    public void k() {
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar;
        l lVar;
        if (l.b(this.f10692c) && (dVar = this.f10698i) != null && (lVar = dVar.f11782x) != null) {
            if (lVar.c()) {
                this.f10698i.r();
                this.f10696g.set(true);
            } else {
                this.f10688ad.set(true);
                a(true, false, true);
            }
        }
        if (l.c(this.f10692c)) {
            a(true, false, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.c
    public void l() {
        com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.f10702m;
        if (eVar != null) {
            eVar.D();
        }
    }

    protected float[] c(int i10) {
        float U = U();
        float V = V();
        int i11 = this.Y;
        if ((i11 == 1) != (U > V)) {
            float f10 = U + V;
            V = f10 - V;
            U = f10 - V;
        }
        if (i11 == 1) {
            U -= i10;
        } else {
            V -= i10;
        }
        return new float[]{V, U};
    }

    void b(String str) {
        this.f10704o.a(Boolean.valueOf(I()), this.D, this.f10707r, this.P, str);
        this.f10704o.e().a(this.f10698i.k()).a(this.F).a(this.P).a(this.Q).a(new com.bytedance.sdk.openadsdk.g.b() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.16
            @Override // com.bytedance.sdk.openadsdk.g.b
            public void a(boolean z10, int i10, String str2) {
                com.bytedance.sdk.component.utils.l.b("end card load finish: ", "code=" + i10 + " msg=" + str2 + " isRenderSuc=" + z10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("loadFinish:isRenderSuc = ");
                sb2.append(z10);
                Log.i("TTBaseVideoActivity", sb2.toString());
                if (z10) {
                    TTBaseVideoActivity.this.f10705p.c();
                }
                if (!n.b(TTBaseVideoActivity.this.f10692c) || p.a(TTBaseVideoActivity.this.f10692c)) {
                    return;
                }
                com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "TimeTrackLog report from js " + z10);
                TTBaseVideoActivity.this.f10704o.a(z10, i10, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        h();
        this.f10700k.b(this.f10707r);
        b();
        if (!this.f10692c.aw()) {
            this.f10704o.h();
            String str = I() ? "reward_endcard" : "fullscreen_endcard";
            b(str);
            a(str);
        }
        j();
        if (p.i(this.f10692c)) {
            this.f10705p.e();
        }
        if (l.c(this.f10692c)) {
            this.f10706q.sendEmptyMessageDelayed(500, 100L);
        }
        this.f10708s = (int) this.f10702m.C();
        this.f10698i.a(g(), this.X == 100.0f);
        this.f10699j.c();
        p();
        H();
        M();
        o();
        n nVar = this.f10692c;
        if (nVar == null || nVar.ax() == null || this.f10692c.ax().a() == null) {
            return;
        }
        this.f10692c.ax().a().a(0L);
    }

    private void b(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, int i10, int i11, int i12) {
        HashMap hashMap;
        if (!r() || this.f10692c == null || view == null) {
            return;
        }
        if (view.getId() == t.e(this, "tt_rb_score") || view.getId() == t.e(this, "tt_comment_vertical") || view.getId() == t.e(this, "tt_reward_ad_appname") || view.getId() == t.e(this, "tt_reward_ad_icon") || view.getId() == t.e(this, "tt_video_reward_bar") || view.getId() == t.e(this, "tt_click_lower_non_content_layout") || view.getId() == t.e(this, "tt_click_upper_non_content_layout") || view.getId() == t.e(this, "tt_reward_ad_download") || view.getId() == t.e(this, "tt_video_reward_container") || view.getId() == t.e(this, "tt_reward_ad_download_backup") || view.getId() == t.e(this, "tt_reward_ad_description")) {
            if (TextUtils.isEmpty(this.D)) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                hashMap.put("rit_scene", this.D);
            }
            com.bytedance.sdk.openadsdk.b.e.a(this.f10691b, "click_other", this.f10692c, new g.a().f(f10).e(f11).d(f12).c(f13).b(System.currentTimeMillis()).a(0L).b(v.a(this.f10698i.l())).a(v.a((View) null)).c(v.c(this.f10698i.l())).d(v.c((View) null)).d(i11).e(i12).f(i10).a(sparseArray).b(h.d().b() ? 1 : 2).c(v.g(m.a())).a(v.e(m.a())).b(v.f(m.a())).a(), this.f10684a, true, (Map<String, Object>) hashMap, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i10) {
        if (this.I == null) {
            this.I = new ProgressBar(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.I.setLayoutParams(layoutParams);
            this.I.setIndeterminateDrawable(getResources().getDrawable(t.d(this, "tt_video_loading_progress_bar")));
            this.f10698i.h().addView(this.I);
        }
        this.I.setVisibility(i10);
    }

    protected void a(String str) {
        this.f10704o.a(str, new f.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.a.f.a
            public void a(WebView webView, String str2) {
                try {
                    if (p.i(TTBaseVideoActivity.this.f10692c) && !TTBaseVideoActivity.this.isFinishing() && TTBaseVideoActivity.this.f10692c.aG() && !p.g(TTBaseVideoActivity.this.f10692c)) {
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        tTBaseVideoActivity.f10706q.sendMessageDelayed(tTBaseVideoActivity.e(0), 1000L);
                    }
                } catch (Throwable unused) {
                }
                try {
                    if (TTBaseVideoActivity.this.f10704o.j() && p.i(TTBaseVideoActivity.this.f10692c)) {
                        TTBaseVideoActivity.this.f10705p.b();
                        TTBaseVideoActivity.this.f10704o.b(true);
                        TTBaseVideoActivity.this.f10704o.c(true);
                        TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                        com.bytedance.sdk.openadsdk.b.e.c(tTBaseVideoActivity2.f10691b, tTBaseVideoActivity2.f10692c, tTBaseVideoActivity2.f10684a, "py_loading_success", (JSONObject) null);
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.a.f.a
            public void a(WebView webView, String str2, Bitmap bitmap) {
                if (TTBaseVideoActivity.this.W || !p.i(TTBaseVideoActivity.this.f10692c)) {
                    return;
                }
                TTBaseVideoActivity.this.W = true;
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                tTBaseVideoActivity.f10705p.a(tTBaseVideoActivity.f10709t, tTBaseVideoActivity.f10692c, tTBaseVideoActivity.I());
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                tTBaseVideoActivity2.f10706q.sendEmptyMessageDelayed(600, tTBaseVideoActivity2.f10705p.j() * 1000);
                Message obtain = Message.obtain();
                obtain.what = 900;
                obtain.arg1 = TTBaseVideoActivity.this.f10705p.j();
                TTBaseVideoActivity.this.f10706q.sendMessage(obtain);
                TTBaseVideoActivity.this.f10705p.f();
                TTBaseVideoActivity.this.f();
                TTBaseVideoActivity.this.f10705p.h();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.a.f.a
            public void a(WebView webView, int i10) {
                try {
                    if (!p.i(TTBaseVideoActivity.this.f10692c) || !TTBaseVideoActivity.this.f10692c.aG() || TTBaseVideoActivity.this.isFinishing()) {
                        if (!TTBaseVideoActivity.this.ag || TTBaseVideoActivity.this.f10689ae == null) {
                            return;
                        }
                        TTBaseVideoActivity.this.f10689ae.a(webView, i10);
                        return;
                    }
                    TTBaseVideoActivity.this.f10705p.a(i10);
                } catch (Throwable unused) {
                }
            }
        });
        if (p.i(this.f10692c)) {
            com.bytedance.sdk.openadsdk.component.reward.a.f fVar = this.f10704o;
            fVar.a(fVar.d());
            this.f10705p.a(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.12
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str2, String str3, String str4, String str5, long j10) {
                    TTBaseVideoActivity.this.f10703n.b();
                    TTBaseVideoActivity.this.L();
                }
            });
        }
        this.f10705p.a(this.F);
        this.f10704o.a(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.15
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j10) {
                TTBaseVideoActivity.this.f10703n.b();
                TTBaseVideoActivity.this.L();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
        a(z10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10, boolean z11) {
        a(z10, z11, false);
    }

    void a(boolean z10, boolean z11, boolean z12) {
        l lVar;
        com.bytedance.sdk.openadsdk.component.reward.a.c cVar;
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.f10698i;
        if (dVar != null) {
            dVar.m();
        }
        if (z11) {
            this.f10687ac.set(true);
        }
        if (!this.f10696g.get() && (!l.b(this.f10692c) || !this.f10687ac.get() || !this.f10688ad.get())) {
            if (l.b(this.f10692c) && z12) {
                return;
            }
            if ((l.b(this.f10692c) || l.c(this.f10692c)) && (cVar = this.f10700k) != null) {
                cVar.c(false);
                n();
                return;
            }
        }
        if ((Build.VERSION.SDK_INT < 17 || !isDestroyed()) && !isFinishing()) {
            this.f10704o.s();
            this.K = "endcard";
            this.f10714y.set(false);
            this.f10715z.set(false);
            TTAdDislikeToast tTAdDislikeToast = this.f10695f;
            if (tTAdDislikeToast != null) {
                tTAdDislikeToast.a();
            }
            Y();
            if (this.f10711v.getAndSet(true)) {
                return;
            }
            if (J() && p.a(this.f10692c) && z10) {
                this.f10700k.d(true);
            }
            c();
            if (p.i(this.f10692c)) {
                return;
            }
            this.f10713x.set(z10);
            com.bytedance.sdk.openadsdk.core.widget.a aVar = this.B;
            if (aVar != null && aVar.isShowing()) {
                this.B.dismiss();
            }
            if (this.f10692c.aw()) {
                this.f10700k.d(false);
            } else {
                this.f10700k.d(p.i(this.f10692c));
            }
            this.f10700k.c(p.a(this.f10692c));
            if (J() && p.a(this.f10692c) && z10) {
                this.f10700k.d(true);
            }
            this.f10704o.t();
            com.bytedance.sdk.openadsdk.component.reward.view.d dVar2 = this.f10698i;
            if (dVar2 != null && (lVar = dVar2.f11782x) != null) {
                lVar.d();
            }
            if (!n.a(this.f10692c) && !this.f10704o.y() && (n.a(this.f10692c, this.f10704o.j(), this.f10705p.d(), this.f10704o.u()) || p.a(this.f10692c))) {
                if (!n.b(this.f10692c) && !p.a(this.f10692c)) {
                    com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "TimeTrackLog report Success from Android");
                    this.f10704o.a(true, 0, null);
                }
                this.f10704o.a(0.0f);
                this.f10698i.a(0.0f);
                this.f10704o.a(0);
                if (this.ag) {
                    v.a((View) this.f10690af, 0);
                    this.f10700k.c(8);
                    this.f10698i.d(8);
                }
                if (p.a(this.f10692c)) {
                    int au = this.f10692c.au();
                    if (p.i(this.f10692c)) {
                        au = (this.f10692c.at() + 1) * 1000;
                    }
                    if (au == -1) {
                        n();
                    } else if (au >= 0) {
                        this.f10706q.sendEmptyMessageDelayed(600, au);
                    }
                } else if (!p.a(this.f10692c)) {
                    int av = this.f10692c.av();
                    if (av == -1) {
                        n();
                    } else if (av >= 0) {
                        this.f10706q.sendEmptyMessageDelayed(600, av);
                    }
                }
                this.f10706q.sendEmptyMessageDelayed(500, 100L);
                this.f10704o.a(this.f10707r, true);
                this.f10704o.c(true);
                this.f10698i.b(8);
                this.f10704o.b(true);
                this.f10704o.e().a("prerender_page_show", (JSONObject) null);
                return;
            }
            if (!n.b(this.f10692c)) {
                com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "TimeTrackLog report 408 from backup page");
                this.f10704o.a(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
            }
            this.f10704o.v();
            this.f10704o.a(8);
            if (this.ag) {
                v.a((View) this.f10690af, 8);
                this.f10700k.c(0);
                this.f10698i.d(0);
            }
            this.f10698i.b(8);
            if (this.f10692c.aw()) {
                if (!this.f10699j.a(this.f10702m)) {
                    finish();
                }
            } else {
                this.f10699j.b();
            }
            n();
            this.f10700k.c(false);
            O();
            if (!I() && this.f10702m.b() && this.f10713x.get()) {
                this.f10702m.l();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.g.f
    public void b(int i10) {
        if (i10 > 0) {
            if (this.J > 0) {
                this.J = i10;
            } else {
                com.bytedance.sdk.component.utils.l.b("onVolumeChanged", "onVolumeChanged >>>> 变为非静音状态通知 h5");
                this.f10704o.d(false);
                this.J = i10;
                n nVar = this.f10692c;
                if (nVar != null && nVar.ax() != null && this.f10692c.ax().a() != null && this.f10702m != null) {
                    this.f10692c.ax().a().i(this.f10702m.s());
                }
            }
        } else if (this.J > 0) {
            com.bytedance.sdk.component.utils.l.b("onVolumeChanged", "onVolumeChanged >>>> 变为静音状态通知 h5");
            this.f10704o.d(true);
            this.J = i10;
            n nVar2 = this.f10692c;
            if (nVar2 != null && nVar2.ax() != null && this.f10692c.ax().a() != null && this.f10702m != null) {
                this.f10692c.ax().a().h(this.f10702m.s());
            }
        } else {
            this.J = i10;
        }
        if (!p.j(this.f10692c) || this.f10711v.get()) {
            if (p.i(this.f10692c) || p.j(this.f10692c)) {
                if (this.E.c()) {
                    com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "onVolumeChanged by SDK mIsMute=" + this.f10707r + " mVolume=" + this.J + " mLastVolume=" + this.E.b());
                    if (this.J == 0) {
                        this.f10700k.b(true);
                        this.f10702m.b(true);
                        return;
                    }
                    this.f10700k.b(false);
                    this.f10702m.b(false);
                    return;
                }
                this.E.b(-1);
                com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "onVolumeChanged by User mIsMute=" + this.f10707r + " mVolume=" + this.J + " mLastVolume=" + this.E.b());
                if (this.H) {
                    if (this.J == 0) {
                        this.f10707r = true;
                        this.f10700k.b(true);
                        this.f10702m.b(true);
                        return;
                    }
                    this.f10707r = false;
                    this.f10700k.b(false);
                    this.f10702m.b(false);
                }
            }
        }
    }

    protected void b(boolean z10) {
        if (this.f10711v.get()) {
            return;
        }
        if (!z10) {
            this.f10700k.c(false);
            this.f10700k.a(false);
            this.f10700k.d(false);
            this.f10698i.d(8);
        } else {
            this.f10700k.a(this.f10692c.ap());
            if (p.i(this.f10692c) || N()) {
                this.f10700k.c(true);
            }
            if (!N() && (!(this.L instanceof com.bytedance.sdk.openadsdk.component.reward.b.b) || !J())) {
                this.f10700k.d();
                this.f10698i.d(0);
            } else {
                this.f10700k.d(true);
            }
        }
        if (z10) {
            if (!I() && (this.X != FullRewardExpressView.f11728c || !N())) {
                this.f10698i.a(8);
                this.f10698i.b(8);
                return;
            }
            this.f10698i.a(0);
            this.f10698i.b(0);
            return;
        }
        this.f10698i.a(4);
        this.f10698i.b(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(long j10, boolean z10, final Map<String, Object> map) {
        boolean z11 = false;
        if (this.f10702m.x()) {
            if (l.c(this.f10692c)) {
                return true;
            }
            if (!z10 || !this.f10702m.y()) {
                W();
            }
            try {
                z11 = this.f10702m.a(j10, this.f10707r);
            } catch (Exception unused) {
            }
            if (z11 && !z10) {
                this.U.set(true);
                final View findViewById = findViewById(16908290);
                if (findViewById == null) {
                    findViewById = getWindow().getDecorView();
                }
                findViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.18
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TTBaseVideoActivity.this.f10697h.getAndSet(true)) {
                            return;
                        }
                        Map map2 = map;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("width", findViewById.getWidth());
                            jSONObject.put("height", findViewById.getHeight());
                            jSONObject.put("alpha", findViewById.getAlpha());
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            map2.put("root_view", jSONObject.toString());
                        } catch (Throwable unused2) {
                        }
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        com.bytedance.sdk.openadsdk.b.e.a(tTBaseVideoActivity.f10691b, tTBaseVideoActivity.f10692c, tTBaseVideoActivity.f10684a, map2, tTBaseVideoActivity.S);
                        TTBaseVideoActivity.this.K();
                    }
                });
            }
            return z11;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, int i10, int i11, int i12) {
        if (view == null) {
            return;
        }
        if (view.getId() == t.e(this, "tt_rb_score")) {
            a("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != t.e(this, "tt_comment_vertical") && view.getId() != t.e(this, "tt_reward_ad_description")) {
            if (view.getId() == t.e(this, "tt_reward_ad_appname")) {
                a("click_play_source", (JSONObject) null);
            } else if (view.getId() == t.e(this, "tt_reward_ad_icon")) {
                a("click_play_logo", (JSONObject) null);
            } else if (view.getId() != t.e(this, "tt_video_reward_bar") && view.getId() != t.e(this, "tt_click_lower_non_content_layout") && view.getId() != t.e(this, "tt_click_upper_non_content_layout")) {
                if (view.getId() == t.e(this, "tt_reward_ad_download")) {
                    a("click_start_play", q());
                } else if (view.getId() == t.e(this, "tt_video_reward_container")) {
                    a("click_video", q());
                } else if (view.getId() == t.e(this, "tt_reward_ad_download_backup") || view.getId() == t.e(this, "tt_reward_full_endcard_vast_image")) {
                    a("fallback_endcard_click", q());
                }
            } else {
                a("click_start_play_bar", q());
            }
        } else {
            a("click_play_star_nums", (JSONObject) null);
        }
        b(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, JSONObject jSONObject) {
        Context context = this.f10691b;
        n nVar = this.f10692c;
        String str2 = this.f10684a;
        if (!I()) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.b.e.a(context, nVar, str2, str, jSONObject);
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        int i10 = message.what;
        if (i10 == 300) {
            x();
            com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.f10702m;
            eVar.a(!eVar.B(), !this.f10702m.B());
            if (this.f10692c.ax() == null || this.f10692c.ax().a() == null) {
                return;
            }
            this.f10692c.ax().a().a(com.bytedance.sdk.openadsdk.core.j.a.a.GENERAL_LINEAR_AD_ERROR);
        } else if (i10 == 400) {
            this.f10702m.m();
            a(false, true);
        } else if (i10 == 500) {
            if (!p.a(this.f10692c)) {
                this.f10700k.c(false);
            }
            SSWebView c10 = this.f10704o.c();
            if (c10 != null && c10.getWebView() != null) {
                c10.i();
                c10.getWebView().resumeTimers();
            }
            if (this.f10704o.c() != null) {
                this.f10704o.a(1.0f);
                this.f10698i.a(1.0f);
            }
            if (!I() && this.f10702m.b() && this.f10713x.get()) {
                this.f10702m.l();
            }
        } else if (i10 == 600) {
            n();
        } else if (i10 != 800) {
            if (i10 == 900 && p.i(this.f10692c)) {
                int i11 = message.arg1;
                if (i11 > 0) {
                    this.f10700k.d(true);
                    int b10 = this.f10705p.b(i11);
                    if (b10 == i11) {
                        this.f10700k.a(String.valueOf(i11), (CharSequence) null);
                    } else if (b10 > 0) {
                        this.f10700k.a(String.valueOf(i11), String.format(t.a(this.f10691b, "tt_skip_ad_time_text"), Integer.valueOf(b10)));
                    } else {
                        this.f10700k.a(String.valueOf(i11), t.a(this.f10691b, "tt_txt_skip"));
                        this.f10700k.e(true);
                    }
                    Message obtain = Message.obtain();
                    obtain.what = 900;
                    obtain.arg1 = i11 - 1;
                    this.f10706q.sendMessageDelayed(obtain, 1000L);
                    this.f10705p.c(i11);
                } else {
                    this.f10700k.d(false);
                    this.N.set(true);
                    n();
                    f(I() ? 10001 : 10002);
                }
                A();
            }
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            if (this.f10692c.J() != null) {
                hashMap.put("playable_url", this.f10692c.J().A());
            }
            com.bytedance.sdk.openadsdk.b.e.e(this, this.f10692c, this.f10684a, "remove_loading_page", hashMap);
            this.f10706q.removeMessages(800);
            this.f10705p.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IListenerManager a(int i10) {
        if (this.C == null) {
            this.C = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a()).a(i10));
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.b bVar;
        this.f10701l.a(this.f10692c, new AdSlot.Builder().setCodeId(String.valueOf(u.f(this.f10692c))).setExpressViewAcceptedSize(fArr[0], fArr[1]).build(), this.f10684a, this.f10707r);
        com.bytedance.sdk.openadsdk.component.reward.a.c cVar = this.f10700k;
        if (cVar != null && (bVar = this.f10701l) != null) {
            cVar.a(bVar.a());
        }
        this.f10701l.a(new j() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.8
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.j
            public void a(boolean z10) {
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.f10707r != z10) {
                    tTBaseVideoActivity.f10700k.c();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.j
            public void b() {
                com.bytedance.sdk.openadsdk.component.reward.view.d dVar = TTBaseVideoActivity.this.f10698i;
                if (dVar == null || dVar.k() == null) {
                    return;
                }
                TTBaseVideoActivity.this.f10698i.k().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.j
            public long c() {
                return TTBaseVideoActivity.this.f10702m.f();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.j
            public int d() {
                if (TTBaseVideoActivity.this.f10701l.c()) {
                    return 4;
                }
                if (TTBaseVideoActivity.this.f10701l.d()) {
                    return 5;
                }
                if (TTBaseVideoActivity.this.f10702m.e()) {
                    return 1;
                }
                if (TTBaseVideoActivity.this.f10702m.b()) {
                    return 2;
                }
                TTBaseVideoActivity.this.f10702m.d();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.j
            public void e() {
                TTBaseVideoActivity.this.G();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.j
            public void a() {
                TTBaseVideoActivity.this.f10700k.b();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.j
            public void b(int i10) {
                TTBaseVideoActivity.this.O = i10;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.j
            public void a(int i10) {
                boolean z10 = false;
                if (i10 != 1) {
                    if (i10 == 2) {
                        TTBaseVideoActivity.this.f10702m.A();
                        return;
                    } else if (i10 == 3) {
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        tTBaseVideoActivity.f10702m.a((tTBaseVideoActivity.f10711v.get() || TTBaseVideoActivity.this.f10714y.get()) ? true : true, TTBaseVideoActivity.this);
                        return;
                    } else if (i10 == 4) {
                        TTBaseVideoActivity.this.f10702m.k();
                        return;
                    } else if (i10 != 5) {
                        return;
                    }
                }
                if (TTBaseVideoActivity.this.f10702m.b() || TTBaseVideoActivity.this.f10702m.d()) {
                    return;
                }
                TTBaseVideoActivity.this.a(0L, false);
            }
        });
        this.f10701l.a(new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.9
            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdClicked(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdShow(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderFail(View view, String str, int i10) {
                TTBaseVideoActivity.this.f10704o.a(true);
                TTBaseVideoActivity.this.f10704o.b();
                com.bytedance.sdk.component.utils.l.b("TTBaseVideoActivity", "onRenderFail、、、code:" + i10);
                TTBaseVideoActivity.this.f10701l.e().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TTBaseVideoActivity.this.a(false);
                    }
                });
                TTBaseVideoActivity.this.ad();
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderSuccess(View view, float f10, float f11) {
                if (p.i(TTBaseVideoActivity.this.f10692c)) {
                    return;
                }
                if (TTBaseVideoActivity.this.f10701l.h()) {
                    TTBaseVideoActivity.this.b(true);
                }
                TTBaseVideoActivity.this.d(8);
                TTBaseVideoActivity.this.f10704o.a(true);
                TTBaseVideoActivity.this.f10704o.b();
                if (TTBaseVideoActivity.this.f10701l.h()) {
                    TTBaseVideoActivity.this.f10701l.b().setBackgroundColor(-16777216);
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.b.a aVar = tTBaseVideoActivity.L;
                    if (aVar != null) {
                        aVar.a(tTBaseVideoActivity.f10698i.h());
                    }
                } else if (TTBaseVideoActivity.this.f10692c.J() != null && TTBaseVideoActivity.this.N()) {
                    TTBaseVideoActivity.this.M = true;
                }
                TTBaseVideoActivity.this.Q();
                TTBaseVideoActivity.this.ad();
            }
        });
        Context context = this.f10691b;
        n nVar = this.f10692c;
        String str = this.f10684a;
        com.bytedance.sdk.openadsdk.core.nativeexpress.f fVar = new com.bytedance.sdk.openadsdk.core.nativeexpress.f(context, nVar, str, u.a(str)) { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.10
            @Override // com.bytedance.sdk.openadsdk.core.b.b, com.bytedance.sdk.openadsdk.core.b.c
            public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
                super.a(view, f10, f11, f12, f13, sparseArray, z10);
                TTBaseVideoActivity.this.onRewardBarClick(view);
            }
        };
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.D)) {
            hashMap.put("rit_scene", this.D);
        }
        if (p.i(this.f10692c)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        fVar.a(hashMap);
        Context context2 = this.f10691b;
        n nVar2 = this.f10692c;
        String str2 = this.f10684a;
        com.bytedance.sdk.openadsdk.core.nativeexpress.e eVar = new com.bytedance.sdk.openadsdk.core.nativeexpress.e(context2, nVar2, str2, u.a(str2)) { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.11
            @Override // com.bytedance.sdk.openadsdk.core.b.a, com.bytedance.sdk.openadsdk.core.b.b, com.bytedance.sdk.openadsdk.core.b.c
            public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
                super.a(view, f10, f11, f12, f13, sparseArray, z10);
                if (a(view, z10)) {
                    TTBaseVideoActivity.this.onRewardBarClick(view);
                }
            }
        };
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(this.D)) {
            hashMap2.put("rit_scene", this.D);
        }
        if (p.i(this.f10692c)) {
            hashMap2.put("click_scence", 3);
        } else {
            hashMap2.put("click_scence", 1);
        }
        eVar.a(hashMap2);
        this.f10701l.a(fVar, eVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f10698i.h().addView(this.f10701l.a(), layoutParams);
        if (!this.f10701l.h()) {
            b(false);
        }
        this.f10701l.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Intent intent) {
        if (intent != null) {
            this.f10698i.b(intent.getBooleanExtra("show_download_bar", true));
            this.D = intent.getStringExtra("rit_scene");
            this.f10702m.a(intent.getStringExtra("video_cache_url"));
            this.f10693d = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                this.S = Double.valueOf(Double.parseDouble(stringExtra));
            } catch (Throwable unused) {
            }
        }
    }

    protected void a(Bundle bundle) {
        if (bundle != null) {
            this.f10693d = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
            this.f10702m.a(bundle.getString("video_cache_url"));
            this.f10707r = bundle.getBoolean("is_mute");
            this.D = bundle.getString("rit_scene");
            try {
                String string = bundle.getString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                this.S = Double.valueOf(Double.parseDouble(string));
            } catch (Throwable unused) {
            }
        }
    }
}
