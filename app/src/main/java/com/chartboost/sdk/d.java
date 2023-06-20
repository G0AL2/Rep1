package com.chartboost.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.b;
import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.impl.f2;
import com.chartboost.sdk.impl.h1;
import com.chartboost.sdk.impl.j3;
import com.chartboost.sdk.impl.k3;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.m1;
import com.chartboost.sdk.impl.n0;
import com.chartboost.sdk.impl.o0;
import com.chartboost.sdk.impl.p1;
import com.chartboost.sdk.impl.u0;
import com.chartboost.sdk.impl.y0;
import java.io.File;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d {
    public final com.chartboost.sdk.Model.c C;
    protected int D;
    protected final Context O;
    private final p1 P;
    private final com.chartboost.sdk.c Q;
    private final com.chartboost.sdk.Networking.b R;
    protected final u0 S;

    /* renamed from: a */
    public final Handler f13801a;

    /* renamed from: b */
    public final com.chartboost.sdk.b f13802b;

    /* renamed from: d */
    private boolean f13804d;

    /* renamed from: e */
    public String f13805e;

    /* renamed from: c */
    public boolean f13803c = false;

    /* renamed from: f */
    public String f13806f = null;

    /* renamed from: g */
    public String f13807g = null;

    /* renamed from: h */
    public long f13808h = 0;

    /* renamed from: i */
    public long f13809i = 0;

    /* renamed from: j */
    public boolean f13810j = false;

    /* renamed from: k */
    public int f13811k = 0;

    /* renamed from: l */
    public int f13812l = 0;

    /* renamed from: m */
    private int f13813m = 0;

    /* renamed from: n */
    private int f13814n = 0;

    /* renamed from: o */
    private int f13815o = 0;

    /* renamed from: p */
    public int f13816p = 0;

    /* renamed from: q */
    public int f13817q = 0;

    /* renamed from: r */
    public int f13818r = 0;

    /* renamed from: s */
    public int f13819s = 0;

    /* renamed from: t */
    public int f13820t = 0;

    /* renamed from: u */
    public int f13821u = 0;

    /* renamed from: v */
    public int f13822v = 0;

    /* renamed from: w */
    public int f13823w = 0;

    /* renamed from: x */
    public int f13824x = -1;

    /* renamed from: y */
    public boolean f13825y = true;

    /* renamed from: z */
    private int f13826z = -1;
    public int A = 0;
    private int E = 1;
    private int F = 1;
    private int G = 1;
    private int H = 1;
    private float I = 0.0f;
    private float J = 0.0f;
    private boolean K = false;
    public final Map<View, Runnable> L = new IdentityHashMap();
    protected boolean M = true;
    protected boolean N = true;
    protected h1 T = new c();
    protected k3 U = new C0188d();
    private j3 B = null;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ j3 f13827a;

        a(j3 j3Var) {
            d.this = r1;
            this.f13827a = j3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            y0 y0Var = this.f13827a.f14097b;
            u0 u0Var = d.this.S;
            if (u0Var == null || y0Var == null) {
                return;
            }
            u0Var.b(y0Var);
            this.f13827a.f14097b.onResume();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ j3 f13829a;

        b(j3 j3Var) {
            d.this = r1;
            this.f13829a = j3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            y0 y0Var = this.f13829a.f14097b;
            u0 u0Var = d.this.S;
            if (u0Var == null || y0Var == null) {
                return;
            }
            u0Var.a(y0Var);
            this.f13829a.f14097b.onPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements h1 {
        c() {
            d.this = r1;
        }

        @Override // com.chartboost.sdk.impl.h1
        public void a(String str) {
            d.this.c(str);
        }

        @Override // com.chartboost.sdk.impl.h1
        public void b() {
            d.this.f13808h = System.currentTimeMillis();
            d dVar = d.this;
            Context context = dVar.O;
            if (context instanceof Activity) {
                dVar.f13824x = ((Activity) context).getRequestedOrientation();
            } else {
                dVar.f13824x = -1;
            }
        }

        @Override // com.chartboost.sdk.impl.h1
        public void c() {
            d.this.A();
        }

        @Override // com.chartboost.sdk.impl.h1
        public void a() {
            d.this.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.chartboost.sdk.d$d */
    /* loaded from: classes.dex */
    public class C0188d implements k3 {
        C0188d() {
            d.this = r1;
        }

        @Override // com.chartboost.sdk.impl.k3
        public void a(int i10) {
            if (d.this.M && CBUtility.b(i10)) {
                d.this.D = i10;
            } else if (d.this.N && CBUtility.a(i10)) {
                d.this.D = i10;
            }
        }

        @Override // com.chartboost.sdk.impl.k3
        public void onDetachedFromWindow() {
            synchronized (d.this.L) {
                for (Runnable runnable : d.this.L.values()) {
                    d.this.f13801a.removeCallbacks(runnable);
                }
                d.this.L.clear();
            }
        }
    }

    public d(Context context, com.chartboost.sdk.Model.c cVar, Handler handler, com.chartboost.sdk.b bVar, p1 p1Var, com.chartboost.sdk.c cVar2, com.chartboost.sdk.Networking.b bVar2, u0 u0Var) {
        this.O = context;
        this.f13801a = handler;
        this.f13802b = bVar;
        this.C = cVar;
        this.P = p1Var;
        this.Q = cVar2;
        this.R = bVar2;
        this.S = u0Var;
        CBUtility.a(context);
        this.f13804d = false;
    }

    public static /* synthetic */ void a(d dVar) {
        dVar.x();
    }

    private Map<String, List<String>> l() {
        com.chartboost.sdk.Model.a aVar;
        com.chartboost.sdk.Model.c cVar = this.C;
        if (cVar == null || (aVar = cVar.f13699p) == null) {
            return null;
        }
        return aVar.f13674o;
    }

    private com.chartboost.sdk.Model.c m() {
        f2 a10;
        com.chartboost.sdk.c cVar = this.Q;
        if (cVar == null || (a10 = cVar.a()) == null) {
            return null;
        }
        return a10.c();
    }

    private void w() {
        if (this.H <= 1) {
            this.C.D();
            this.H++;
        }
    }

    public /* synthetic */ void x() {
        if (this.f13810j) {
            return;
        }
        CBLogging.a("CBViewProtocol", "Webview seems to be taking more time loading the html content, so closing the view.");
        m1.d(new com.chartboost.sdk.Tracking.a("show_timeout_error", "", i(), n()));
        a(CBError.CBImpressionError.WEB_VIEW_PAGE_LOAD_TIMEOUT);
    }

    public void A() {
        Context context;
        this.f13810j = true;
        this.f13809i = System.currentTimeMillis();
        CBLogging.a("CBViewProtocol", "Total web view load response time " + ((this.f13809i - this.f13808h) / 1000));
        j3 j3Var = this.B;
        if (j3Var == null || (context = j3Var.getContext()) == null) {
            return;
        }
        b(context);
        a(context);
        d();
    }

    public void B() {
        this.f13803c = true;
        j3 t10 = t();
        if (t10 == null || t10.f14097b == null) {
            return;
        }
        this.f13801a.post(new b(t10));
    }

    public void C() {
        if (this.f13803c) {
            this.f13803c = false;
        }
        j3 t10 = t();
        if (t10 != null && (t10.f14096a == null || CBUtility.a(this.O) != t10.f14096a.intValue())) {
            t10.a(false, this.C);
        }
        if (t10 == null || t10.f14097b == null) {
            return;
        }
        this.f13801a.post(new a(t10));
    }

    public void D() {
        if (this.F <= 1) {
            w();
            this.F++;
        }
    }

    public void E() {
        com.chartboost.sdk.Model.c cVar = this.C;
        if (cVar.f13685b == 2 && !this.K) {
            cVar.F();
            this.K = true;
        }
        a(this.C);
    }

    public void F() {
        if (this.E <= 1) {
            this.C.u();
            u();
            w();
            this.E++;
        }
    }

    public boolean G() {
        File file = this.P.a().f14269a;
        if (file == null) {
            CBLogging.b("CBViewProtocol", "External Storage path is unavailable or media not mounted");
            a(CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW);
            return false;
        }
        this.f13807g = "file://" + file.getAbsolutePath() + "/";
        if (l.b().a(this.C.f13699p.f13662c)) {
            CBLogging.b("CBViewProtocol", "Invalid adId being passed in the response");
            a(CBError.CBImpressionError.ERROR_DISPLAYING_VIEW);
            return false;
        }
        String str = this.C.f13698o;
        if (str == null) {
            CBLogging.b("CBViewProtocol", "No html data found in memory");
            a(CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW);
            return false;
        }
        this.f13806f = str;
        return true;
    }

    public void H() {
        this.f13801a.postDelayed(new Runnable() { // from class: com.chartboost.sdk.h
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this);
            }
        }, 15000L);
    }

    public void I() {
        Activity e10 = this.f13802b.e();
        if (e10 == null || CBUtility.a(e10)) {
            return;
        }
        int requestedOrientation = e10.getRequestedOrientation();
        int i10 = this.f13824x;
        if (requestedOrientation != i10) {
            e10.setRequestedOrientation(i10);
        }
        this.f13825y = true;
        this.f13826z = -1;
    }

    public void J() {
        h();
    }

    public CBError.CBImpressionError K() {
        Activity e10 = this.f13802b.e();
        if (e10 == null) {
            this.B = null;
            return CBError.CBImpressionError.NO_HOST_ACTIVITY;
        } else if (!this.N && !this.M) {
            return CBError.CBImpressionError.WRONG_ORIENTATION;
        } else {
            if (this.B == null) {
                this.B = a(e10, (e3) null);
            }
            return null;
        }
    }

    public CBError.CBImpressionError a(RelativeLayout relativeLayout) {
        if (this.B == null) {
            if (relativeLayout != null && relativeLayout.getContext() != null) {
                this.B = a(relativeLayout.getContext(), (e3) null);
            } else {
                return CBError.CBImpressionError.ERROR_CREATING_VIEW;
            }
        }
        return null;
    }

    public abstract j3 a(Context context, e3 e3Var);

    public void b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f13811k = displayMetrics.widthPixels;
        this.f13812l = displayMetrics.heightPixels;
    }

    public String c(int i10) {
        return i10 != -1 ? i10 != 0 ? i10 != 1 ? "error" : DtbDeviceDataRetriever.ORIENTATION_PORTRAIT : DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE : "none";
    }

    public void c(String str) {
        m1.d(new com.chartboost.sdk.Tracking.a("show_webview_error", str, i(), n()));
        CBLogging.b("CBViewProtocol", str);
        this.f13810j = true;
        a(CBError.CBImpressionError.WEB_VIEW_CLIENT_RECEIVED_ERROR);
    }

    public void d() {
        j3 t10 = t();
        if (t10 != null && this.f13810j) {
            int[] iArr = new int[2];
            t10.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1] - this.f13815o;
            int width = t10.getWidth();
            int height = t10.getHeight();
            this.f13816p = i10;
            this.f13817q = i11;
            int i12 = width + i10;
            this.f13818r = i12;
            int i13 = height + i11;
            this.f13819s = i13;
            this.f13820t = i10;
            this.f13821u = i11;
            this.f13822v = i12;
            this.f13823w = i13;
            return;
        }
        this.f13820t = this.f13816p;
        this.f13821u = this.f13817q;
        this.f13822v = this.f13818r;
        this.f13823w = this.f13819s;
    }

    public void e() {
        if (this.f13804d) {
            return;
        }
        this.f13804d = true;
        this.C.q();
        I();
    }

    public void f() {
        synchronized (this.L) {
            for (Runnable runnable : this.L.values()) {
                this.f13801a.removeCallbacks(runnable);
            }
            this.L.clear();
        }
        j3 t10 = t();
        if (t10 != null) {
            if (t10.f14097b != null) {
                CBLogging.a("CBViewProtocol", "Destroying the webview object and cleaning up the references");
                t10.f14097b.destroy();
                t10.f14097b = null;
            }
            if (t10.f14098c != null) {
                t10.f14098c = null;
            }
            if (t10.f14099d != null) {
                t10.f14099d = null;
            }
        }
        g();
    }

    public void g() {
        j3 j3Var = this.B;
        if (j3Var != null) {
            j3Var.a();
        }
        this.B = null;
    }

    protected void h() {
        this.C.r();
    }

    public String i() {
        com.chartboost.sdk.impl.c cVar;
        com.chartboost.sdk.Model.c m10 = m();
        return (m10 == null || (cVar = m10.f13686c) == null) ? "" : cVar.f13935b;
    }

    public String j() {
        d();
        return n0.a(n0.a("x", Integer.valueOf(this.f13820t)), n0.a("y", Integer.valueOf(this.f13821u)), n0.a("width", Integer.valueOf(this.f13822v)), n0.a("height", Integer.valueOf(this.f13823w))).toString();
    }

    public String k() {
        d();
        return n0.a(n0.a("x", Integer.valueOf(this.f13816p)), n0.a("y", Integer.valueOf(this.f13817q)), n0.a("width", Integer.valueOf(this.f13818r)), n0.a("height", Integer.valueOf(this.f13819s))).toString();
    }

    public String n() {
        com.chartboost.sdk.Model.c m10 = m();
        return m10 != null ? m10.f13695l : "";
    }

    public String o() {
        return n0.a(n0.a("width", Integer.valueOf(this.f13813m)), n0.a("height", Integer.valueOf(this.f13814n))).toString();
    }

    public String p() {
        return n0.a(n0.a("allowOrientationChange", Boolean.valueOf(this.f13825y)), n0.a("forceOrientation", c(this.f13826z))).toString();
    }

    public String q() {
        return n0.a(n0.a("width", Integer.valueOf(this.f13811k)), n0.a("height", Integer.valueOf(this.f13812l))).toString();
    }

    public float r() {
        return this.I;
    }

    public float s() {
        return this.J;
    }

    public j3 t() {
        return this.B;
    }

    public void u() {
        if (this.G <= 1) {
            this.C.m();
            this.G++;
        }
    }

    public void v() {
        com.chartboost.sdk.Model.c cVar;
        com.chartboost.sdk.impl.c cVar2;
        if (!this.K || (cVar = this.C) == null || (cVar2 = cVar.f13686c) == null || cVar2.f13934a != 1) {
            return;
        }
        u();
    }

    public boolean y() {
        if (this.A == 2 && this.C.f13686c.f13934a == 1) {
            return true;
        }
        f();
        e();
        return true;
    }

    public abstract void z();

    public void h(String str) {
        if (l.b().a(str)) {
            str = "Unknown Webview warning message";
        }
        CBLogging.e("CBViewProtocol", "Webview warning occurred closing the webview" + str);
    }

    public void b(float f10) {
        this.I = f10;
    }

    public void g(String str) {
        List<String> list;
        Map<String, List<String>> l10 = l();
        if (l10 == null || TextUtils.isEmpty(str) || (list = l10.get(str)) == null) {
            return;
        }
        for (String str2 : list) {
            e(str2);
        }
    }

    private void e(String str) {
        if (str != null && !str.isEmpty() && this.R != null) {
            this.R.a(new o0("GET", str, 2, null));
            CBLogging.a("CBViewProtocol", "###### Sending VAST Tracking Event: " + str);
            return;
        }
        CBLogging.a("CBViewProtocol", "###### Sending VAST Tracking Event Failed: " + str);
    }

    public void a(CBError.CBImpressionError cBImpressionError) {
        this.C.a(cBImpressionError);
    }

    public void b(String str) {
        c(str);
        if (l.b().a(str)) {
            str = "Unknown Webview error";
        }
        CBLogging.b("CBViewProtocol", "Webview error occurred closing the webview" + str);
        a(CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW);
        e();
    }

    public boolean a(JSONObject jSONObject, Boolean bool) {
        return this.C.a(jSONObject, bool);
    }

    public void a(String str, JSONObject jSONObject, Boolean bool) {
        this.C.b(str, jSONObject, bool);
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            this.f13815o = a(window);
            if (this.f13811k == 0 || this.f13812l == 0) {
                b(context);
            }
            int width = rect.width();
            int i10 = this.f13812l - this.f13815o;
            if (width == this.f13813m && i10 == this.f13814n) {
                return;
            }
            this.f13813m = width;
            this.f13814n = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0028, code lost:
        if (r0.getResources().getConfiguration().orientation == 1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r3 = this;
            com.chartboost.sdk.b r0 = r3.f13802b
            android.app.Activity r0 = r0.e()
            if (r0 == 0) goto L2f
            boolean r1 = com.chartboost.sdk.Libraries.CBUtility.a(r0)
            if (r1 == 0) goto Lf
            goto L2f
        Lf:
            int r1 = r3.f13826z
            r2 = 1
            if (r1 != r2) goto L15
            goto L2c
        L15:
            if (r1 != 0) goto L18
            goto L2b
        L18:
            boolean r1 = r3.f13825y
            if (r1 == 0) goto L1e
            r2 = -1
            goto L2c
        L1e:
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 != r2) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            r0.setRequestedOrientation(r2)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.d.c():void");
    }

    public void f(String str) {
        CBLogging.a("CBWebViewProtocol sendWebViewEvents", this.C.d() + " message: " + str);
    }

    int a(Window window) {
        return window.findViewById(16908290).getTop();
    }

    public int d(String str) {
        if (str.equals(DtbDeviceDataRetriever.ORIENTATION_PORTRAIT)) {
            return 1;
        }
        return str.equals(DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE) ? 0 : -1;
    }

    public void a(JSONObject jSONObject) {
        this.f13825y = jSONObject.optBoolean("allowOrientationChange", this.f13825y);
        this.f13826z = d(jSONObject.optString("forceOrientation", c(this.f13826z)));
        c();
    }

    public void d(int i10) {
        this.A = i10;
    }

    public void a(float f10) {
        this.J = f10;
    }

    private void a(com.chartboost.sdk.Model.c cVar) {
        if (cVar == null || cVar.f13686c.f13934a != 2) {
            return;
        }
        com.chartboost.sdk.b bVar = this.f13802b;
        Objects.requireNonNull(bVar);
        b.a aVar = new b.a(14);
        aVar.f13790c = cVar;
        this.f13801a.post(aVar);
    }
}
