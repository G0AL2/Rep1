package com.chartboost.sdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.f2;
import com.chartboost.sdk.impl.l3;
import com.chartboost.sdk.impl.m1;
import com.chartboost.sdk.impl.r0;
import com.chartboost.sdk.impl.v2;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final f f13780a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f13781b;

    /* renamed from: c  reason: collision with root package name */
    public final c f13782c;

    /* renamed from: d  reason: collision with root package name */
    CBImpressionActivity f13783d = null;

    /* renamed from: e  reason: collision with root package name */
    com.chartboost.sdk.Model.c f13784e = null;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13785f = false;

    /* renamed from: g  reason: collision with root package name */
    private l3 f13786g;

    /* renamed from: h  reason: collision with root package name */
    private Context f13787h;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f13788a;

        /* renamed from: b  reason: collision with root package name */
        Activity f13789b = null;

        /* renamed from: c  reason: collision with root package name */
        public com.chartboost.sdk.Model.c f13790c = null;

        public a(int i10) {
            this.f13788a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                switch (this.f13788a) {
                    case 7:
                        b.this.c();
                        break;
                    case 9:
                        b.this.e(this.f13790c);
                        break;
                    case 10:
                        if (this.f13790c.x()) {
                            this.f13790c.k().J();
                            break;
                        }
                        break;
                    case 11:
                        c d10 = b.this.d();
                        com.chartboost.sdk.Model.c cVar = this.f13790c;
                        if (cVar.f13685b == 2 && d10 != null) {
                            d10.a(cVar);
                            break;
                        }
                        break;
                    case 12:
                        this.f13790c.o();
                        break;
                    case 13:
                        b.this.f13782c.a(this.f13790c, this.f13789b);
                        break;
                    case 14:
                        b.this.f13782c.e(this.f13790c);
                        break;
                }
            } catch (Exception e10) {
                CBLogging.b("CBUIManager", "run (" + this.f13788a + "): " + e10.toString());
            }
        }
    }

    public b(Context context, r0 r0Var, f fVar, Handler handler, c cVar) {
        this.f13787h = context;
        this.f13780a = fVar;
        this.f13781b = handler;
        this.f13782c = cVar;
    }

    private void c(com.chartboost.sdk.Model.c cVar) {
        this.f13782c.d(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(CBImpressionActivity cBImpressionActivity) {
        v2.a("CBUIManager.setImpressionActivity", cBImpressionActivity);
        if (this.f13783d == null) {
            this.f13783d = cBImpressionActivity;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l3 b(Activity activity) {
        l3 l3Var = this.f13786g;
        if (l3Var == null || l3Var.f14174a != activity.hashCode()) {
            this.f13786g = new l3(activity);
        }
        return this.f13786g;
    }

    public c d() {
        if (e() == null) {
            return null;
        }
        return this.f13782c;
    }

    public Activity e() {
        return this.f13783d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.chartboost.sdk.Model.c f() {
        c d10 = d();
        f2 a10 = d10 == null ? null : d10.a();
        if (a10 == null || !a10.d()) {
            return null;
        }
        return a10.c();
    }

    public boolean g() {
        return f() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        v2.a("CBUIManager.onBackPressedCallback");
        if (com.chartboost.sdk.a.a() && this.f13785f) {
            this.f13785f = false;
            i();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        v2.a("CBUIManager.onBackPressedImpl");
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        v2.a("CBUIManager.onCreateImpl");
        m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        v2.a("CBUIManager.onPauseImpl", (String) null);
        com.chartboost.sdk.Model.c f10 = f();
        if (f10 != null) {
            f10.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        v2.a("CBUIManager.onResumeImpl", (String) null);
        com.chartboost.sdk.Model.c f10 = f();
        if (f10 != null) {
            f10.v();
        }
    }

    void m() {
        v2.a("CBUIManager.onStop");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Activity activity) {
        com.chartboost.sdk.Model.c cVar;
        v2.a("CBUIManager.onDestroyImpl", activity);
        com.chartboost.sdk.Model.c f10 = f();
        if (f10 == null && activity == this.f13783d && (cVar = this.f13784e) != null) {
            f10 = cVar;
        }
        c d10 = d();
        if (d10 != null && f10 != null) {
            d10.e(f10);
        }
        this.f13784e = null;
    }

    public void e(com.chartboost.sdk.Model.c cVar) {
        Intent intent = new Intent(this.f13787h, CBImpressionActivity.class);
        intent.putExtra("isChartboost", true);
        intent.addFlags(268435456);
        try {
            this.f13787h.startActivity(intent);
            this.f13785f = true;
        } catch (ActivityNotFoundException unused) {
            CBLogging.b("CBUIManager", "Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions.");
            this.f13784e = null;
            cVar.a(CBError.CBImpressionError.ACTIVITY_MISSING_IN_MANIFEST);
        }
    }

    private void d(com.chartboost.sdk.Model.c cVar) {
        if (g()) {
            cVar.a(CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE);
        } else if (this.f13783d != null) {
            this.f13782c.b(cVar);
        } else {
            com.chartboost.sdk.Model.c cVar2 = this.f13784e;
            if (cVar2 != null && cVar2 != cVar) {
                cVar.a(CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE);
                return;
            }
            this.f13784e = cVar;
            com.chartboost.sdk.impl.a aVar = g.f13879d;
            if (aVar != null) {
                int i10 = cVar.f13684a;
                if (i10 == 1 || i10 == 2) {
                    aVar.willDisplayVideo(cVar.f13695l);
                } else if (i10 == 0) {
                    aVar.willDisplayInterstitial(cVar.f13695l);
                }
            }
            if (g.f13880e != null) {
                a aVar2 = new a(9);
                aVar2.f13790c = cVar;
                this.f13781b.postDelayed(aVar2, 1);
                return;
            }
            e(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        v2.a("CBUIManager.clearImpressionActivity");
        this.f13783d = null;
    }

    public void b(com.chartboost.sdk.Model.c cVar) {
        v2.a("CBUIManager.queueDisplayView", cVar);
        if (cVar.i().booleanValue()) {
            c(cVar);
        } else {
            d(cVar);
        }
    }

    private boolean a(Activity activity) {
        return this.f13783d == activity;
    }

    public void a(com.chartboost.sdk.Model.c cVar) {
        int i10 = cVar.f13685b;
        if (i10 == 2) {
            c d10 = d();
            if (d10 != null) {
                d10.a(cVar);
            }
        } else if (i10 == 1) {
            c d11 = d();
            if (d11 != null) {
                d11.e(cVar);
            }
            m1.d(new com.chartboost.sdk.Tracking.a("show_close_before_template_show_error", "", cVar.f13686c.f13935b, cVar.f13695l));
        }
    }

    private boolean b() {
        v2.a("CBUIManager.closeImpressionImpl");
        com.chartboost.sdk.Model.c f10 = f();
        if (f10 == null || f10.f13685b != 2) {
            return false;
        }
        if (f10.p()) {
            return true;
        }
        f.e(new a(7));
        return true;
    }

    boolean c() {
        com.chartboost.sdk.Model.c f10 = f();
        if (f10 == null) {
            return false;
        }
        f10.D = true;
        a(f10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Activity activity) {
        v2.a("CBUIManager.onStopImpl", b(activity));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000b, code lost:
        if (r1 != 3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean a(android.app.Activity r4, com.chartboost.sdk.Model.c r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 == 0) goto L49
            int r1 = r5.f13685b
            if (r1 == r0) goto L46
            r2 = 2
            if (r1 == r2) goto Le
            r4 = 3
            if (r1 == r4) goto L46
            goto L49
        Le:
            boolean r1 = r5.C()
            if (r1 != 0) goto L49
            com.chartboost.sdk.Chartboost$CBFramework r1 = com.chartboost.sdk.g.f13880e
            if (r1 == 0) goto L24
            boolean r1 = r1.doesWrapperUseCustomBackgroundingBehavior()
            if (r1 == 0) goto L24
            boolean r4 = r4 instanceof com.chartboost.sdk.CBImpressionActivity
            if (r4 != 0) goto L24
            r4 = 0
            return r4
        L24:
            com.chartboost.sdk.c r4 = r3.d()
            if (r4 == 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error onActivityStart "
            r1.append(r2)
            int r2 = r5.f13685b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CBUIManager"
            com.chartboost.sdk.Libraries.CBLogging.b(r2, r1)
            r4.e(r5)
            goto L49
        L46:
            r3.b(r5)
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.b.a(android.app.Activity, com.chartboost.sdk.Model.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Activity activity) {
        v2.a("CBUIManager.onStartImpl", activity);
        if (activity instanceof CBImpressionActivity) {
            a((CBImpressionActivity) activity);
        }
        Chartboost.CBFramework cBFramework = g.f13880e;
        boolean z10 = cBFramework != null && cBFramework.doesWrapperUseCustomBackgroundingBehavior();
        if (activity != null) {
            if (z10 || a(activity)) {
                if (activity instanceof CBImpressionActivity) {
                    this.f13785f = false;
                }
                if (a(activity, this.f13784e)) {
                    this.f13784e = null;
                }
                this.f13780a.a(activity);
                com.chartboost.sdk.Model.c f10 = f();
                if (f10 != null) {
                    f10.w();
                }
            }
        }
    }
}
