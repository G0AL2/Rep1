package com.chartboost.sdk.Model;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.g;
import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.f2;
import com.chartboost.sdk.impl.g3;
import com.chartboost.sdk.impl.h3;
import com.chartboost.sdk.impl.j3;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.l2;
import com.chartboost.sdk.impl.m1;
import com.chartboost.sdk.impl.p1;
import com.chartboost.sdk.impl.s0;
import com.chartboost.sdk.impl.u0;
import com.chartboost.sdk.impl.v0;
import com.chartboost.sdk.impl.x0;
import com.chartboost.sdk.impl.z0;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    public boolean B;
    public boolean D;

    /* renamed from: a  reason: collision with root package name */
    public int f13684a;

    /* renamed from: b  reason: collision with root package name */
    public int f13685b;

    /* renamed from: c  reason: collision with root package name */
    public final com.chartboost.sdk.impl.c f13686c;

    /* renamed from: d  reason: collision with root package name */
    public final p1 f13687d;

    /* renamed from: e  reason: collision with root package name */
    public final com.chartboost.sdk.Networking.b f13688e;

    /* renamed from: f  reason: collision with root package name */
    public final l2 f13689f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f13690g;

    /* renamed from: h  reason: collision with root package name */
    public final com.chartboost.sdk.b f13691h;

    /* renamed from: i  reason: collision with root package name */
    public final v0 f13692i;

    /* renamed from: j  reason: collision with root package name */
    public final com.chartboost.sdk.c f13693j;

    /* renamed from: k  reason: collision with root package name */
    public final d f13694k;

    /* renamed from: l  reason: collision with root package name */
    public final String f13695l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13696m;

    /* renamed from: o  reason: collision with root package name */
    public final String f13698o;

    /* renamed from: p  reason: collision with root package name */
    public final a f13699p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f13700q;

    /* renamed from: r  reason: collision with root package name */
    private com.chartboost.sdk.d f13701r;

    /* renamed from: s  reason: collision with root package name */
    private final WeakReference<RelativeLayout> f13702s;

    /* renamed from: t  reason: collision with root package name */
    private final Boolean f13703t;

    /* renamed from: u  reason: collision with root package name */
    private final Context f13704u;

    /* renamed from: v  reason: collision with root package name */
    public s0 f13705v;

    /* renamed from: w  reason: collision with root package name */
    public f2 f13706w;

    /* renamed from: x  reason: collision with root package name */
    public h3 f13707x;

    /* renamed from: y  reason: collision with root package name */
    private u0 f13708y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f13709z;

    /* renamed from: n  reason: collision with root package name */
    private Boolean f13697n = null;
    public boolean A = false;
    public boolean C = false;

    public c(Context context, a aVar, d dVar, p1 p1Var, com.chartboost.sdk.Networking.b bVar, l2 l2Var, SharedPreferences sharedPreferences, Handler handler, com.chartboost.sdk.b bVar2, v0 v0Var, com.chartboost.sdk.c cVar, x0 x0Var, com.chartboost.sdk.impl.c cVar2, String str, String str2, RelativeLayout relativeLayout, h3 h3Var, u0 u0Var) {
        this.D = false;
        this.f13704u = context;
        this.f13699p = aVar;
        this.f13686c = cVar2;
        this.f13687d = p1Var;
        this.f13688e = bVar;
        this.f13689f = l2Var;
        this.f13690g = handler;
        this.f13691h = bVar2;
        this.f13692i = v0Var;
        this.f13693j = cVar;
        this.f13694k = dVar;
        this.f13702s = new WeakReference<>(relativeLayout);
        this.f13703t = Boolean.valueOf(cVar2.f13934a == 2);
        this.f13685b = 0;
        this.f13709z = false;
        this.B = false;
        this.D = true;
        this.f13684a = 4;
        this.f13695l = str;
        this.f13698o = str2;
        this.f13696m = false;
        this.f13707x = h3Var;
        this.f13708y = u0Var;
    }

    private void A() {
        this.f13684a = 2;
        this.f13696m = false;
    }

    private void B() {
        String str = this.f13699p.f13667h;
        if (str != null && str.length() > 0) {
            this.f13701r = new g3(this.f13704u, this, this.f13690g, this.f13691h, this.f13693j, this.f13687d, this.f13708y, this.f13707x, this.f13699p.f13668i);
        } else {
            this.f13701r = new z0(this.f13704u, this, this.f13687d, this.f13688e, this.f13690g, this.f13691h, this.f13693j, this.f13708y);
        }
    }

    private void c() {
        com.chartboost.sdk.c d10;
        if (this.f13685b != 2 || (d10 = this.f13691h.d()) == null) {
            return;
        }
        d10.a(this);
    }

    private boolean h() {
        return this.f13697n.booleanValue();
    }

    private boolean l() {
        return this.f13697n != null;
    }

    private void y() {
        int i10 = this.f13686c.f13934a;
        if (i10 == 0) {
            z();
        } else if (i10 == 1) {
            A();
        } else if (i10 != 2) {
        } else {
            this.f13684a = 3;
        }
    }

    private void z() {
        if (this.f13699p.f13676q.equals(DownloadResource.TYPE_VIDEO)) {
            this.f13684a = 1;
            this.f13696m = false;
            return;
        }
        this.f13684a = 0;
    }

    public boolean C() {
        com.chartboost.sdk.d dVar = this.f13701r;
        if (dVar != null) {
            dVar.J();
            if (this.f13701r.t() != null) {
                return true;
            }
        } else {
            CBLogging.b("CBImpression", "reinitializing -- no view protocol exists!!");
        }
        CBLogging.c("CBImpression", "reinitializing -- view not yet created");
        return false;
    }

    public void D() {
        s0 s0Var = new s0("https://live.chartboost.com", "/api/video-complete", this.f13689f, 2, null);
        s0Var.a("location", this.f13695l);
        s0Var.a("reward", Integer.valueOf(this.f13699p.f13670k));
        s0Var.a("currency-name", this.f13699p.f13669j);
        s0Var.a("ad_id", d());
        s0Var.a("force_close", Boolean.FALSE);
        if (!this.f13699p.f13664e.isEmpty()) {
            s0Var.a("cgn", this.f13699p.f13664e);
        }
        com.chartboost.sdk.d k10 = j() != null ? k() : null;
        if (k10 != null) {
            float s10 = k10.s();
            float r10 = k10.r();
            CBLogging.a(c.class.getSimpleName(), String.format(Locale.US, "TotalDuration: %f PlaybackTime: %f", Float.valueOf(r10), Float.valueOf(s10)));
            float f10 = r10 / 1000.0f;
            s0Var.a("total_time", Float.valueOf(f10));
            if (s10 <= 0.0f) {
                s0Var.a("playback_time", Float.valueOf(f10));
            } else {
                s0Var.a("playback_time", Float.valueOf(s10 / 1000.0f));
            }
        }
        this.f13688e.a(s0Var);
    }

    public boolean E() {
        return this.f13696m;
    }

    public void F() {
        this.f13694k.c(this);
    }

    public boolean G() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(org.json.JSONObject r6, java.lang.Boolean r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L8
            boolean r7 = r7.booleanValue()
            r5.f13696m = r7
        L8:
            int r7 = r5.f13685b
            r0 = 2
            r1 = 0
            if (r7 != r0) goto L57
            boolean r7 = r5.A
            if (r7 == 0) goto L13
            goto L57
        L13:
            com.chartboost.sdk.Model.a r7 = r5.f13699p
            java.lang.String r0 = r7.f13672m
            java.lang.String r7 = r7.f13671l
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L43
            com.chartboost.sdk.impl.v0 r2 = r5.f13692i     // Catch: java.lang.Exception -> L35
            android.content.Context r3 = r5.f13704u     // Catch: java.lang.Exception -> L35
            boolean r2 = r2.a(r3, r7)     // Catch: java.lang.Exception -> L35
            if (r2 == 0) goto L30
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L2e
            r5.f13697n = r0     // Catch: java.lang.Exception -> L2e
            goto L42
        L2e:
            r0 = move-exception
            goto L39
        L30:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L35
            r5.f13697n = r7     // Catch: java.lang.Exception -> L35
            goto L43
        L35:
            r7 = move-exception
            r4 = r0
            r0 = r7
            r7 = r4
        L39:
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "CBImpression onClick"
            com.chartboost.sdk.Libraries.CBLogging.b(r2, r0)
        L42:
            r0 = r7
        L43:
            boolean r7 = r5.B
            if (r7 == 0) goto L48
            return r1
        L48:
            r7 = 1
            r5.B = r7
            r5.D = r1
            boolean r1 = r5.f13696m
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.a(r0, r6, r1)
            return r7
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.Model.c.a(org.json.JSONObject, java.lang.Boolean):boolean");
    }

    public void b(String str, JSONObject jSONObject, Boolean bool) {
        a(str, jSONObject, bool);
    }

    public String d() {
        return this.f13699p.f13663d;
    }

    public com.chartboost.sdk.impl.c e() {
        return this.f13686c;
    }

    public RelativeLayout f() {
        return this.f13702s.get();
    }

    public String g() {
        return this.f13695l;
    }

    public Boolean i() {
        return this.f13703t;
    }

    public j3 j() {
        com.chartboost.sdk.d dVar = this.f13701r;
        if (dVar != null) {
            return dVar.t();
        }
        return null;
    }

    public com.chartboost.sdk.d k() {
        return this.f13701r;
    }

    public void m() {
        com.chartboost.sdk.impl.c cVar;
        com.chartboost.sdk.impl.a aVar = g.f13879d;
        if (aVar == null || (cVar = this.f13686c) == null) {
            return;
        }
        int i10 = cVar.f13934a;
        if (i10 == 0) {
            aVar.didCompleteInterstitial(this.f13695l);
        } else if (i10 == 1) {
            aVar.didCompleteRewardedVideo(this.f13695l, this.f13699p.f13670k);
        }
    }

    public void n() {
        this.A = true;
    }

    public void o() {
        Runnable runnable = this.f13700q;
        if (runnable != null) {
            runnable.run();
            this.f13700q = null;
        }
        this.A = false;
    }

    public boolean p() {
        com.chartboost.sdk.d dVar = this.f13701r;
        if (dVar != null) {
            return dVar.y();
        }
        return false;
    }

    public void q() {
        this.D = true;
        this.f13691h.a(this);
        this.f13694k.a(this);
    }

    public void r() {
        d dVar = this.f13694k;
        if (dVar != null) {
            dVar.b(this);
        } else {
            m1.d(new com.chartboost.sdk.Tracking.a("show_null_callback_mgr_error", "", this.f13686c.f13935b, this.f13695l));
        }
    }

    public void s() {
        com.chartboost.sdk.d dVar = this.f13701r;
        if (dVar == null || dVar.t() == null) {
            return;
        }
        this.f13701r.t().setVisibility(8);
    }

    public void t() {
        com.chartboost.sdk.d dVar = this.f13701r;
        if (dVar == null || this.C) {
            return;
        }
        this.C = true;
        dVar.B();
    }

    public void u() {
    }

    public void v() {
        this.B = false;
        com.chartboost.sdk.d dVar = this.f13701r;
        if (dVar == null || !this.C) {
            return;
        }
        this.C = false;
        dVar.C();
    }

    public void w() {
        this.B = false;
    }

    public boolean x() {
        this.f13685b = 0;
        y();
        B();
        return this.f13701r.G();
    }

    public void b() {
        a();
        if (this.f13709z) {
            this.f13701r = null;
            CBLogging.c("CBImpression", "Destroying the view and view data");
        }
    }

    public void a(CBError.CBImpressionError cBImpressionError) {
        this.f13694k.a(this, cBImpressionError);
    }

    public void a() {
        f2 f2Var = this.f13706w;
        if (f2Var != null) {
            f2Var.a();
            try {
                com.chartboost.sdk.d dVar = this.f13701r;
                if (dVar != null && dVar.t() != null && this.f13701r.t().getParent() != null) {
                    this.f13706w.removeView(this.f13701r.t());
                }
            } catch (Exception e10) {
                CBLogging.a("CBImpression", "Exception raised while cleaning up views", e10);
            }
            this.f13706w = null;
        }
        com.chartboost.sdk.d dVar2 = this.f13701r;
        if (dVar2 != null && this.f13684a != 3) {
            dVar2.f();
        }
        CBLogging.c("CBImpression", "Destroying the view");
    }

    public CBError.CBImpressionError a(RelativeLayout relativeLayout) {
        try {
            if (this.f13701r != null) {
                if (i().booleanValue()) {
                    return this.f13701r.a(relativeLayout);
                }
                return this.f13701r.K();
            }
        } catch (Exception e10) {
            CBLogging.b("CBImpression", "tryCreatingView: " + e10.toString());
        }
        return CBError.CBImpressionError.ERROR_CREATING_VIEW;
    }

    public void a(Runnable runnable) {
        this.f13700q = runnable;
    }

    void a(String str, JSONObject jSONObject, Boolean bool) {
        if (bool != null) {
            this.f13696m = bool.booleanValue();
        }
        Handler handler = this.f13690g;
        com.chartboost.sdk.impl.c cVar = this.f13686c;
        Objects.requireNonNull(cVar);
        handler.post(new c.a(1, this.f13695l, null, null, true, this.f13699p.f13666g));
        if (E()) {
            c();
        }
        if (a(str)) {
            this.f13705v = a(jSONObject);
            this.f13692i.a(this.f13704u, this, str, null);
            return;
        }
        m1.d(new com.chartboost.sdk.Tracking.a("click_invalid_url_error", str, this.f13686c.f13935b, this.f13695l));
        this.f13692i.a(this, false, str, CBError.CBClickError.URI_INVALID, null);
    }

    private boolean a(String str) {
        return !l.b().a(str);
    }

    private s0 a(JSONObject jSONObject) {
        return a(new s0("https://live.chartboost.com", "/api/click", this.f13689f, 2, null), jSONObject);
    }

    private s0 a(s0 s0Var, JSONObject jSONObject) {
        if (!this.f13699p.f13663d.isEmpty()) {
            s0Var.a("ad_id", this.f13699p.f13663d);
        }
        if (!this.f13699p.f13673n.isEmpty()) {
            s0Var.a("to", this.f13699p.f13673n);
        }
        if (!this.f13699p.f13664e.isEmpty()) {
            s0Var.a("cgn", this.f13699p.f13664e);
        }
        if (!this.f13699p.f13665f.isEmpty()) {
            s0Var.a("creative", this.f13699p.f13665f);
        }
        int i10 = this.f13684a;
        if (i10 == 1 || i10 == 2) {
            com.chartboost.sdk.d k10 = j() != null ? k() : null;
            if (k10 != null) {
                float s10 = k10.s();
                float r10 = k10.r();
                CBLogging.a(c.class.getSimpleName(), String.format(Locale.US, "TotalDuration: %f PlaybackTime: %f", Float.valueOf(r10), Float.valueOf(s10)));
                float f10 = r10 / 1000.0f;
                s0Var.a("total_time", Float.valueOf(f10));
                if (s10 <= 0.0f) {
                    s0Var.a("playback_time", Float.valueOf(f10));
                } else {
                    s0Var.a("playback_time", Float.valueOf(s10 / 1000.0f));
                }
            }
        } else if (i10 == 3) {
            s0Var.a("creative", "");
        }
        if (jSONObject != null) {
            s0Var.a("click_coordinates", jSONObject);
        }
        s0Var.a("location", this.f13695l);
        if (l()) {
            s0Var.a("retarget_reinstall", Boolean.valueOf(h()));
        }
        return s0Var;
    }
}
