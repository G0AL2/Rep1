package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.i;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.bannerexpress.a;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.x;
import com.bytedance.sdk.openadsdk.core.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeExpressView extends FrameLayout implements com.bytedance.sdk.component.adexpress.b.g, com.bytedance.sdk.component.adexpress.b.n, com.bytedance.sdk.component.adexpress.dynamic.c, j {

    /* renamed from: p  reason: collision with root package name */
    public static int f12557p = 500;
    private u A;
    private String B;
    private a.InterfaceC0169a C;
    private AtomicBoolean D;
    private b E;
    private final ViewTreeObserver.OnScrollChangedListener F;
    private final Runnable G;
    private final Runnable H;
    private final Runnable I;
    private ThemeStatusBroadcastReceiver J;
    private o K;
    private i.a L;
    private List<com.bytedance.sdk.component.adexpress.b.i> M;
    private com.bytedance.sdk.component.adexpress.b.o N;
    private com.bytedance.sdk.component.adexpress.b.e O;
    private com.bytedance.sdk.component.adexpress.b.h P;
    private com.bytedance.sdk.component.adexpress.b.l Q;
    private SparseArray<c.a> R;
    private float S;
    private float T;
    private float U;
    private float V;
    private long W;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12558a;

    /* renamed from: b  reason: collision with root package name */
    private int f12559b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.dislike.b f12560c;

    /* renamed from: d  reason: collision with root package name */
    private TTDislikeDialogAbstract f12561d;

    /* renamed from: e  reason: collision with root package name */
    private TTNativeExpressAd.ExpressAdInteractionListener f12562e;

    /* renamed from: f  reason: collision with root package name */
    protected final Context f12563f;

    /* renamed from: g  reason: collision with root package name */
    protected String f12564g;

    /* renamed from: h  reason: collision with root package name */
    protected AdSlot f12565h;

    /* renamed from: i  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.e.n f12566i;

    /* renamed from: j  reason: collision with root package name */
    protected TTNativeExpressAd.ExpressVideoAdListener f12567j;

    /* renamed from: k  reason: collision with root package name */
    protected FrameLayout f12568k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f12569l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f12570m;

    /* renamed from: n  reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.b.c f12571n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f12572o;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12573q;

    /* renamed from: r  reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.b.j f12574r;

    /* renamed from: s  reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.b.b f12575s;

    /* renamed from: t  reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.b.d<? extends View> f12576t;

    /* renamed from: u  reason: collision with root package name */
    private e f12577u;

    /* renamed from: v  reason: collision with root package name */
    private f f12578v;

    /* renamed from: w  reason: collision with root package name */
    private final AtomicBoolean f12579w;

    /* renamed from: x  reason: collision with root package name */
    private String f12580x;

    /* renamed from: y  reason: collision with root package name */
    private float f12581y;

    /* renamed from: z  reason: collision with root package name */
    private float f12582z;

    public NativeExpressView(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot, String str) {
        super(context);
        this.f12558a = true;
        this.f12559b = 0;
        this.f12564g = "embeded_ad";
        this.f12579w = new AtomicBoolean(false);
        this.f12580x = null;
        this.f12570m = false;
        this.f12572o = false;
        this.f12573q = false;
        this.f12574r = new com.bytedance.sdk.openadsdk.b.j();
        this.D = new AtomicBoolean(false);
        this.F = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                NativeExpressView.this.s();
                NativeExpressView nativeExpressView = NativeExpressView.this;
                nativeExpressView.removeCallbacks(nativeExpressView.G);
                NativeExpressView nativeExpressView2 = NativeExpressView.this;
                nativeExpressView2.postDelayed(nativeExpressView2.G, 500L);
            }
        };
        this.G = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (x.a(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.d(nativeExpressView.getVisibility());
                    return;
                }
                NativeExpressView.this.d(8);
            }
        };
        this.H = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.d(0);
            }
        };
        this.I = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.d(8);
            }
        };
        this.R = new SparseArray<>();
        this.S = -1.0f;
        this.T = -1.0f;
        this.U = -1.0f;
        this.V = -1.0f;
        this.W = 0L;
        this.f12564g = str;
        this.f12563f = context;
        this.f12566i = nVar;
        this.f12565h = adSlot;
        this.f12573q = false;
        g();
    }

    private int getAdSlotType() {
        String str = this.f12564g;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c10 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1912999166:
                if (str.equals("draw_ad")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 7;
            case 2:
                return 3;
            case 3:
                return 8;
            case 4:
                return 2;
            case 5:
                return 9;
            default:
                return 5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
        if (com.bytedance.sdk.openadsdk.core.m.h().j(r9.f12580x) == 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() {
        /*
            r9 = this;
            float r0 = r9.f12581y
            float r1 = r9.f12582z
            boolean r2 = r9.f12570m
            com.bytedance.sdk.openadsdk.core.e.n r3 = r9.f12566i
            org.json.JSONObject r0 = com.bytedance.sdk.openadsdk.core.nativeexpress.a.a.a(r0, r1, r2, r3)
            com.bytedance.sdk.openadsdk.b.u r1 = new com.bytedance.sdk.openadsdk.b.u
            java.lang.String r2 = r9.f12564g
            com.bytedance.sdk.openadsdk.core.e.n r3 = r9.f12566i
            r4 = 1
            r1.<init>(r4, r2, r3)
            r9.A = r1
            com.bytedance.sdk.openadsdk.core.nativeexpress.i r2 = new com.bytedance.sdk.openadsdk.core.nativeexpress.i
            java.lang.String r3 = r9.f12564g
            com.bytedance.sdk.openadsdk.core.e.n r5 = r9.f12566i
            java.lang.String r6 = r9.f12580x
            r2.<init>(r1, r3, r5, r6)
            r9.P = r2
            r1 = 0
            r2 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L55
            com.bytedance.sdk.openadsdk.core.e.n r6 = r9.f12566i     // Catch: java.lang.Exception -> L55
            com.bytedance.sdk.openadsdk.core.e.n$a r6 = r6.G()     // Catch: java.lang.Exception -> L55
            java.lang.String r6 = r6.g()     // Catch: java.lang.Exception -> L55
            r5.<init>(r6)     // Catch: java.lang.Exception -> L55
            java.lang.String r6 = "render_delay_time"
            long r5 = r5.optLong(r6)     // Catch: java.lang.Exception -> L55
            com.bytedance.sdk.openadsdk.core.e.n r7 = r9.f12566i     // Catch: java.lang.Exception -> L56
            boolean r7 = com.bytedance.sdk.openadsdk.core.e.n.c(r7)     // Catch: java.lang.Exception -> L56
            if (r7 != 0) goto L52
            com.bytedance.sdk.openadsdk.core.i.f r7 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch: java.lang.Exception -> L56
            java.lang.String r8 = r9.f12580x     // Catch: java.lang.Exception -> L56
            int r7 = r7.j(r8)     // Catch: java.lang.Exception -> L56
            if (r7 != r4) goto L52
            goto L53
        L52:
            r4 = 0
        L53:
            r1 = r4
            goto L56
        L55:
            r5 = r2
        L56:
            long r2 = java.lang.Math.max(r5, r2)
            r4 = 10000(0x2710, double:4.9407E-320)
            long r2 = java.lang.Math.min(r2, r4)
            com.bytedance.sdk.component.adexpress.b.l$a r4 = new com.bytedance.sdk.component.adexpress.b.l$a
            r4.<init>()
            java.lang.String r5 = r9.f12564g
            com.bytedance.sdk.component.adexpress.b.l$a r4 = r4.a(r5)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r9.f12566i
            java.lang.String r5 = r5.Y()
            com.bytedance.sdk.component.adexpress.b.l$a r4 = r4.b(r5)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r9.f12566i
            java.lang.String r5 = com.bytedance.sdk.openadsdk.utils.u.i(r5)
            com.bytedance.sdk.component.adexpress.b.l$a r4 = r4.c(r5)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r9.f12566i
            java.lang.String r5 = r5.ac()
            com.bytedance.sdk.component.adexpress.b.l$a r4 = r4.d(r5)
            com.bytedance.sdk.component.adexpress.b.l$a r0 = r4.a(r0)
            com.bytedance.sdk.component.adexpress.b.h r4 = r9.P
            com.bytedance.sdk.component.adexpress.b.l$a r0 = r0.a(r4)
            com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.m.h()
            int r4 = r4.m()
            com.bytedance.sdk.component.adexpress.b.l$a r0 = r0.a(r4)
            com.bytedance.sdk.openadsdk.core.e.n r4 = r9.f12566i
            boolean r4 = r4.ap()
            com.bytedance.sdk.component.adexpress.b.l$a r0 = r0.a(r4)
            com.bytedance.sdk.openadsdk.core.e.n r4 = r9.f12566i
            int r4 = r4.t()
            com.bytedance.sdk.component.adexpress.b.l$a r0 = r0.b(r4)
            com.bytedance.sdk.component.adexpress.b.l$a r0 = r0.a(r2)
            com.bytedance.sdk.openadsdk.core.e.n r2 = r9.f12566i
            int r2 = r2.L()
            com.bytedance.sdk.component.adexpress.b.l$a r0 = r0.c(r2)
            com.bytedance.sdk.openadsdk.core.e.n r2 = r9.f12566i
            java.util.Map r2 = com.bytedance.sdk.openadsdk.core.nativeexpress.a.a.b(r2)
            com.bytedance.sdk.component.adexpress.b.l$a r0 = r0.a(r2)
            com.bytedance.sdk.component.adexpress.b.l$a r0 = r0.b(r1)
            com.bytedance.sdk.component.adexpress.b.l r0 = r0.a()
            r9.Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.h():void");
    }

    private void o() {
        if (w()) {
            p();
            return;
        }
        try {
            q();
            o oVar = new o(this.f12563f, this.Q, this.J, this.A, this.f12566i);
            this.K = oVar;
            com.bytedance.sdk.component.adexpress.b.o oVar2 = new com.bytedance.sdk.component.adexpress.b.o(this.f12563f, this.Q, oVar, this);
            this.N = oVar2;
            this.M.add(oVar2);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.l.c("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
        }
        com.bytedance.sdk.component.adexpress.b.e eVar = new com.bytedance.sdk.component.adexpress.b.e(this.f12563f, this.Q, new l(this, this.J, this.Q));
        this.O = eVar;
        this.M.add(eVar);
        this.L = new com.bytedance.sdk.component.adexpress.b.k(this.M, this.P);
    }

    private void p() {
        this.f12559b = this.f12566i.q();
        try {
            q();
            r();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.l.c("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
        }
        boolean z10 = this.f12566i.r() == 1;
        this.f12558a = z10;
        if (z10) {
            com.bytedance.sdk.component.adexpress.b.e eVar = new com.bytedance.sdk.component.adexpress.b.e(this.f12563f, this.Q, new l(this, this.J, this.Q));
            this.O = eVar;
            this.M.add(eVar);
        }
        this.L = new com.bytedance.sdk.component.adexpress.b.k(this.M, this.P);
    }

    private void q() {
        if (TTAdSdk.isInitSuccess()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.k.b();
    }

    private void r() {
        com.bytedance.sdk.openadsdk.core.c.b.a aVar = new com.bytedance.sdk.openadsdk.core.c.b.a();
        int i10 = this.f12559b;
        if (i10 == 1) {
            com.bytedance.sdk.component.adexpress.b.b bVar = new com.bytedance.sdk.component.adexpress.b.b(this.f12563f, this.Q, this.J, this.f12573q, new com.bytedance.sdk.component.adexpress.dynamic.c.f(this.f12563f, com.bytedance.sdk.openadsdk.core.c.a.a(this.Q, this.f12566i)), this, aVar);
            this.f12575s = bVar;
            this.M.add(bVar);
        } else if (i10 == 2) {
            com.bytedance.sdk.component.adexpress.dynamic.c.f fVar = new com.bytedance.sdk.component.adexpress.dynamic.c.f(this.f12563f, com.bytedance.sdk.openadsdk.core.c.a.a(this.Q, this.f12566i));
            o oVar = new o(this.f12563f, this.Q, this.J, this.A, this.f12566i);
            this.K = oVar;
            this.N = new com.bytedance.sdk.component.adexpress.b.o(this.f12563f, this.Q, oVar, this);
            this.f12575s = new com.bytedance.sdk.component.adexpress.b.b(this.f12563f, this.Q, this.J, this.f12573q, fVar, this, aVar);
            this.M.add(this.N);
            this.M.add(this.f12575s);
        } else if (i10 != 3) {
            o oVar2 = new o(this.f12563f, this.Q, this.J, this.A, this.f12566i);
            this.K = oVar2;
            com.bytedance.sdk.component.adexpress.b.o oVar3 = new com.bytedance.sdk.component.adexpress.b.o(this.f12563f, this.Q, oVar2, this);
            this.N = oVar3;
            this.M.add(oVar3);
        } else {
            com.bytedance.sdk.component.adexpress.b.b bVar2 = new com.bytedance.sdk.component.adexpress.b.b(this.f12563f, this.Q, this.J, this.f12573q, new com.bytedance.sdk.component.adexpress.dynamic.c.h(), this, aVar);
            this.f12575s = bVar2;
            this.M.add(bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.5
            @Override // java.lang.Runnable
            public void run() {
                if (NativeExpressView.this.D.get()) {
                    NativeExpressView.this.f12574r.a(System.currentTimeMillis(), x.a(NativeExpressView.this));
                }
            }
        });
    }

    private boolean t() {
        return com.bytedance.sdk.openadsdk.core.e.n.c(this.f12566i);
    }

    private void u() {
        List<com.bytedance.sdk.component.adexpress.b.i> list = this.M;
        if (list == null) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.b.i iVar : list) {
            if (iVar != null) {
                iVar.b();
            }
        }
    }

    private void v() {
        List<com.bytedance.sdk.component.adexpress.b.i> list = this.M;
        if (list == null) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.b.i iVar : list) {
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    private boolean w() {
        return TextUtils.equals(this.f12564g, "fullscreen_interstitial_ad") || TextUtils.equals(this.f12564g, "rewarded_video") || o.b(this.f12564g);
    }

    public void a() {
    }

    public void a(int i10) {
    }

    public void a(boolean z10) {
    }

    @Override // com.bytedance.sdk.component.adexpress.b.n
    public void a_(int i10) {
        com.bytedance.sdk.component.adexpress.b.h hVar = this.P;
        if (hVar != null) {
            if (!this.f12558a) {
                hVar.f();
            }
            this.P.g();
            ((i) this.P).i();
        }
        TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = this.f12562e;
        if (expressAdInteractionListener != null) {
            expressAdInteractionListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.g.a(i10), i10);
        }
    }

    public void b() {
    }

    public void b(int i10) {
    }

    public long c() {
        return 0L;
    }

    public int d() {
        return 0;
    }

    public void d(int i10) {
        com.bytedance.sdk.component.adexpress.b.d<? extends View> dVar = this.f12576t;
        if (dVar == null || !(dVar instanceof o)) {
            return;
        }
        ((o) dVar).a(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        e eVar = this.f12577u;
        if (eVar != null) {
            eVar.b(motionEvent.getDeviceId());
            this.f12577u.a(motionEvent.getSource());
            this.f12577u.c(motionEvent.getToolType(0));
        }
        f fVar = this.f12578v;
        if (fVar != null) {
            fVar.b(motionEvent.getDeviceId());
            this.f12578v.a(motionEvent.getSource());
            this.f12578v.c(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = motionEvent.getRawX();
            this.T = motionEvent.getRawY();
            this.W = System.currentTimeMillis();
            i10 = 0;
        } else if (actionMasked == 1) {
            i10 = 3;
        } else if (actionMasked != 2) {
            i10 = actionMasked != 3 ? -1 : 4;
        } else {
            this.U += Math.abs(motionEvent.getX() - this.S);
            this.V += Math.abs(motionEvent.getY() - this.T);
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
            i10 = (System.currentTimeMillis() - this.W <= 200 || (this.U <= 8.0f && this.V <= 8.0f)) ? 2 : 1;
        }
        SparseArray<c.a> sparseArray = this.R;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new c.a(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c
    public void f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        this.J = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.f12565h;
        if (adSlot != null) {
            this.f12581y = adSlot.getExpressViewAcceptedWidth();
            this.f12582z = this.f12565h.getExpressViewAcceptedHeight();
            this.f12580x = this.f12565h.getCodeId();
        }
        setBackgroundColor(0);
        if (this.f12566i.ay()) {
            this.E = new b(this.f12563f, this, this.f12566i);
            return;
        }
        h();
        this.M = new ArrayList();
        o();
        com.bytedance.sdk.component.adexpress.b.o oVar = this.N;
        if (oVar != null) {
            this.K = (o) oVar.d();
        }
    }

    public com.bytedance.sdk.openadsdk.b.j getAdShowTime() {
        return this.f12574r;
    }

    public e getClickCreativeListener() {
        return this.f12577u;
    }

    public f getClickListener() {
        return this.f12578v;
    }

    public String getClosedListenerKey() {
        return this.B;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.b.d<? extends View> dVar = this.f12576t;
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.f12582z).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.f12581y).intValue();
    }

    public w getJsObject() {
        o oVar = this.K;
        if (oVar != null) {
            return oVar.p();
        }
        return null;
    }

    public SSWebView getWebView() {
        o oVar = this.K;
        if (oVar == null) {
            return null;
        }
        return oVar.a();
    }

    public void i() {
        com.bytedance.sdk.component.adexpress.b.d<? extends View> dVar = this.f12576t;
        if (!(dVar instanceof o) || dVar == null) {
            return;
        }
        ((o) dVar).j();
    }

    public void j() {
        if (this.f12566i.ay()) {
            b bVar = this.E;
            if (bVar == null) {
                a_(106);
                return;
            }
            bVar.a((com.bytedance.sdk.component.adexpress.b.n) this);
            this.E.a();
            return;
        }
        this.A.a();
        i.a aVar = this.L;
        if (aVar != null) {
            aVar.a(this);
        }
        this.L.a();
    }

    public void k() {
        o oVar = this.K;
        if (oVar == null || oVar.e() == null) {
            return;
        }
        this.K.f();
    }

    public void l() {
        try {
            b bVar = this.E;
            if (bVar != null) {
                bVar.b();
            }
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.b.i> list = this.M;
            if (list != null) {
                for (com.bytedance.sdk.component.adexpress.b.i iVar : list) {
                    iVar.a();
                }
            }
            this.f12560c = null;
            this.f12561d = null;
            this.f12565h = null;
            this.f12566i = null;
            this.f12562e = null;
            this.f12577u = null;
            this.f12571n = null;
            this.f12578v = null;
            this.f12567j = null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.c("NativeExpressView", "detach error", th);
        }
    }

    public void m() {
        try {
            FrameLayout frameLayout = this.f12568k;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.f12568k);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.a("NativeExpressView", "backupDestroy remove video container error", th);
        }
    }

    public boolean n() {
        com.bytedance.sdk.component.adexpress.b.d<? extends View> dVar = this.f12576t;
        return dVar != null && dVar.c() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
        u();
        com.bytedance.sdk.component.utils.l.e("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.F);
        com.bytedance.sdk.openadsdk.core.h.d().a(this.B, this.C);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.F);
        com.bytedance.sdk.openadsdk.core.h.d().f(this.B);
        v();
        com.bytedance.sdk.component.utils.l.e("webviewpool", "onDetachedFromWindow===");
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.l.e("webviewpool", "onFinishTemporaryDetach+++");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        s();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.l.e("webviewpool", "onStartTemporaryDetach===");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z10 ? getVisibility() : 8);
        }
        s();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        removeCallbacks(this.I);
        removeCallbacks(this.H);
        if (i10 == 0) {
            postDelayed(this.H, 50L);
        } else {
            postDelayed(this.I, 50L);
        }
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.b.c cVar) {
        this.f12571n = cVar;
        com.bytedance.sdk.component.adexpress.b.e eVar = this.O;
        if (eVar != null) {
            eVar.a(cVar);
        }
    }

    public void setBannerClickClosedListener(a.InterfaceC0169a interfaceC0169a) {
        this.C = interfaceC0169a;
    }

    public void setClickCreativeListener(e eVar) {
        this.f12577u = eVar;
    }

    public void setClickListener(f fVar) {
        this.f12578v = fVar;
    }

    public void setClosedListenerKey(String str) {
        this.B = str;
        b bVar = this.E;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.dislike.b bVar) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.b.d<? extends View> dVar = this.f12576t;
        if (dVar != null && (dVar instanceof l) && (backupView = (BackupView) dVar.e()) != null) {
            backupView.setDislikeInner(bVar);
        }
        b bVar2 = this.E;
        if (bVar2 != null) {
            bVar2.a(bVar);
        }
        this.f12560c = bVar;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f12562e = expressAdInteractionListener;
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.b.d<? extends View> dVar = this.f12576t;
        if (dVar != null && (dVar instanceof l) && (backupView = (BackupView) dVar.e()) != null) {
            backupView.setDislikeOuter(tTDislikeDialogAbstract);
        }
        b bVar = this.E;
        if (bVar != null) {
            bVar.a(tTDislikeDialogAbstract);
        }
        this.f12561d = tTDislikeDialogAbstract;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c
    public void setSoundMute(boolean z10) {
        this.f12573q = z10;
        com.bytedance.sdk.component.adexpress.b.b bVar = this.f12575s;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        this.f12575s.d().setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c
    public void setTimeUpdate(int i10) {
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f12567j = expressVideoAdListener;
    }

    public void a(View view, int i10, com.bytedance.sdk.component.adexpress.b bVar) {
        View view2;
        if (i10 == -1 || bVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (p.i(this.f12566i)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.e.j jVar = (com.bytedance.sdk.openadsdk.core.e.j) bVar;
        e eVar = this.f12577u;
        if (eVar != null) {
            eVar.d(getDynamicShowType());
            this.f12577u.a(hashMap);
        }
        f fVar = this.f12578v;
        if (fVar != null) {
            fVar.d(getDynamicShowType());
            this.f12578v.a(hashMap);
        }
        float f10 = jVar.f12082a;
        float f11 = jVar.f12083b;
        float f12 = jVar.f12084c;
        float f13 = jVar.f12085d;
        boolean z10 = jVar.f12096o;
        SparseArray<c.a> sparseArray = jVar.f12095n;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.R;
        }
        SparseArray<c.a> sparseArray2 = sparseArray;
        String str = jVar.f12092k;
        if (view == null) {
            view2 = this;
        } else {
            r5 = view != this ? a(view) : null;
            view2 = view;
        }
        jVar.f12093l = i10;
        if (r5 != null && jVar.f12094m == null) {
            jVar.f12094m = r5;
        }
        switch (i10) {
            case 1:
                FrameLayout frameLayout = this.f12568k;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.e.n nVar = this.f12566i;
                if (nVar == null || nVar.h() != 1 || z10) {
                    f fVar2 = this.f12578v;
                    if (fVar2 != null) {
                        fVar2.a(jVar);
                        this.f12578v.a(str);
                        this.f12578v.a(view2, f10, f11, f12, f13, sparseArray2, z10);
                    }
                    TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = this.f12562e;
                    if (expressAdInteractionListener != null) {
                        expressAdInteractionListener.onAdClicked(this, this.f12566i.L());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (jVar.f12097p > 0) {
                    y.a(true);
                }
                e eVar2 = this.f12577u;
                if (eVar2 != null) {
                    eVar2.a(jVar);
                    this.f12577u.a(str);
                    this.f12577u.a(view2, f10, f11, f12, f13, sparseArray2, z10);
                }
                TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener2 = this.f12562e;
                if (expressAdInteractionListener2 != null) {
                    expressAdInteractionListener2.onAdClicked(this, this.f12566i.L());
                }
                y.a(false);
                return;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f12561d;
                if (tTDislikeDialogAbstract != null) {
                    tTDislikeDialogAbstract.show();
                    return;
                }
                com.bytedance.sdk.openadsdk.dislike.b bVar2 = this.f12560c;
                if (bVar2 != null) {
                    bVar2.showDislikeDialog();
                    return;
                } else {
                    TTDelegateActivity.a(this.f12566i, this.B);
                    return;
                }
            case 4:
                FrameLayout frameLayout2 = this.f12568k;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.e.n nVar2 = this.f12566i;
                if (nVar2 == null || nVar2.h() != 1 || z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Creativity....mAdType=");
                    sb2.append(this.f12564g);
                    sb2.append(",!mVideoPause=");
                    sb2.append(!this.f12569l);
                    sb2.append("，isAutoPlay=");
                    sb2.append(com.bytedance.sdk.openadsdk.utils.u.j(this.f12566i));
                    com.bytedance.sdk.component.utils.l.b("ClickCreativeListener", sb2.toString());
                    if ("embeded_ad".equals(this.f12564g) && t() && !this.f12569l && com.bytedance.sdk.openadsdk.utils.u.j(this.f12566i)) {
                        com.bytedance.sdk.component.utils.l.b("ClickCreativeListener", "Creative....");
                        e eVar3 = this.f12577u;
                        if (eVar3 != null) {
                            eVar3.a(jVar);
                            this.f12577u.a(str);
                            this.f12577u.a(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                    } else {
                        com.bytedance.sdk.component.utils.l.b("ClickCreativeListener", "normal....");
                        f fVar3 = this.f12578v;
                        if (fVar3 != null) {
                            fVar3.a(jVar);
                            this.f12578v.a(str);
                            this.f12578v.a(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                    }
                    TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener3 = this.f12562e;
                    if (expressAdInteractionListener3 != null) {
                        expressAdInteractionListener3.onAdClicked(this, this.f12566i.L());
                        return;
                    }
                    return;
                }
                return;
            case 5:
                a(!this.f12573q);
                return;
            case 6:
                a();
                return;
            case 7:
                TTWebsiteActivity.a(this.f12563f, this.f12566i, this.f12564g);
                return;
            default:
                return;
        }
    }

    protected void b(int i10, int i11) {
        int f10;
        if (TextUtils.equals(this.f12564g, "fullscreen_interstitial_ad")) {
            f10 = com.bytedance.sdk.openadsdk.core.m.h().e(Integer.valueOf(this.f12580x).intValue());
        } else if (!TextUtils.equals(this.f12564g, "rewarded_video")) {
            return;
        } else {
            f10 = com.bytedance.sdk.openadsdk.core.m.h().f(this.f12580x);
        }
        if (f10 < 0) {
            f10 = 5;
        }
        int i12 = (i11 >= f10 || d() == 5) ? 1 : 0;
        int i13 = i11 <= f10 ? f10 - i11 : 0;
        com.bytedance.sdk.component.adexpress.b.b bVar = this.f12575s;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        this.f12575s.d().a(String.valueOf(i10), i12, i13);
    }

    public NativeExpressView(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot, String str, boolean z10) {
        super(context);
        this.f12558a = true;
        this.f12559b = 0;
        this.f12564g = "embeded_ad";
        this.f12579w = new AtomicBoolean(false);
        this.f12580x = null;
        this.f12570m = false;
        this.f12572o = false;
        this.f12573q = false;
        this.f12574r = new com.bytedance.sdk.openadsdk.b.j();
        this.D = new AtomicBoolean(false);
        this.F = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                NativeExpressView.this.s();
                NativeExpressView nativeExpressView = NativeExpressView.this;
                nativeExpressView.removeCallbacks(nativeExpressView.G);
                NativeExpressView nativeExpressView2 = NativeExpressView.this;
                nativeExpressView2.postDelayed(nativeExpressView2.G, 500L);
            }
        };
        this.G = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (x.a(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.d(nativeExpressView.getVisibility());
                    return;
                }
                NativeExpressView.this.d(8);
            }
        };
        this.H = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.d(0);
            }
        };
        this.I = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.d(8);
            }
        };
        this.R = new SparseArray<>();
        this.S = -1.0f;
        this.T = -1.0f;
        this.U = -1.0f;
        this.V = -1.0f;
        this.W = 0L;
        this.f12564g = str;
        this.f12563f = context;
        this.f12566i = nVar;
        this.f12565h = adSlot;
        this.f12573q = z10;
        g();
    }

    public static JSONObject a(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(com.bytedance.sdk.component.adexpress.b.d<? extends View> dVar, com.bytedance.sdk.component.adexpress.b.m mVar) {
        this.D.set(true);
        this.f12576t = dVar;
        if (dVar.c() == 3 && this.f12566i.f() == 1) {
            this.f12566i.b(0);
        }
        if (dVar.c() == 2 || dVar.c() == 0 || dVar.c() == 3) {
            View e10 = dVar.e();
            if (e10.getParent() != null) {
                ((ViewGroup) e10.getParent()).removeView(e10);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                arrayList.add(getChildAt(i10));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof SSWebView) {
                    removeView((View) arrayList.get(i11));
                }
            }
            addView(dVar.e());
        }
        com.bytedance.sdk.component.adexpress.b.h hVar = this.P;
        if (hVar != null) {
            ((i) hVar).i();
        }
        TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = this.f12562e;
        if (expressAdInteractionListener != null) {
            expressAdInteractionListener.onRenderSuccess(this, (float) mVar.b(), (float) mVar.c());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c
    public void a(CharSequence charSequence, int i10, int i11) {
        b(Integer.parseInt(String.valueOf(charSequence)), i10);
    }
}
