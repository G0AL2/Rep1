package com.fyber.inneractive.sdk.renderers;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b0;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.web.d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public class g extends com.fyber.inneractive.sdk.flow.l<u, InneractiveAdViewEventsListener> implements com.fyber.inneractive.sdk.interfaces.b, b0.b {

    /* renamed from: l  reason: collision with root package name */
    public InneractiveAdViewUnitController f20100l;

    /* renamed from: m  reason: collision with root package name */
    public IAmraidWebViewController f20101m;

    /* renamed from: n  reason: collision with root package name */
    public d.f f20102n;

    /* renamed from: p  reason: collision with root package name */
    public ViewGroup f20104p;

    /* renamed from: q  reason: collision with root package name */
    public FrameLayout f20105q;

    /* renamed from: s  reason: collision with root package name */
    public Runnable f20107s;

    /* renamed from: y  reason: collision with root package name */
    public b f20113y;

    /* renamed from: k  reason: collision with root package name */
    public long f20099k = 0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f20103o = false;

    /* renamed from: r  reason: collision with root package name */
    public long f20106r = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f20108t = 0;

    /* renamed from: u  reason: collision with root package name */
    public long f20109u = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f20110v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f20111w = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f20112x = false;

    /* loaded from: classes2.dex */
    public static class a extends FrameLayout {

        /* renamed from: a  reason: collision with root package name */
        public final float f20114a;

        public a(Context context, float f10) {
            super(context);
            this.f20114a = f10;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            int i12;
            View.MeasureSpec.getMode(i10);
            int mode = View.MeasureSpec.getMode(i11);
            if (mode != 0 && (mode != Integer.MIN_VALUE || View.MeasureSpec.getSize(i11) <= 0)) {
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                i12 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int size3 = View.MeasureSpec.getSize(i10);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                float f10 = this.f20114a;
                if (f10 != 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size3 * f10), 1073741824);
                }
                i12 = makeMeasureSpec;
            }
            super.onMeasure(i12, i11);
        }
    }

    public final void E() {
        if (this.f20107s != null) {
            IAlog.a("%scancelling refreen runnable", IAlog.a(this));
            com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(this.f20107s);
            this.f20107s = null;
        }
    }

    public final void F() {
        b bVar = this.f20113y;
        if (bVar != null) {
            bVar.c();
        }
        if (this.f20101m != null) {
            E();
            AdContent adcontent = this.f17247b;
            if (adcontent != 0) {
                ((u) adcontent).a();
            }
            this.f20101m = null;
            this.f17247b = null;
            ViewGroup viewGroup = this.f20104p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f20105q);
            }
        }
        this.f20110v = false;
    }

    public final int G() {
        r rVar;
        int intValue;
        int i10 = this.f20108t;
        if (i10 == -1) {
            IAlog.a("%sreturning disable value for banner refresh", IAlog.a(this));
            return 0;
        }
        if (i10 > 0) {
            IAlog.a("%sreturning overriden refresh interval = %d", IAlog.a(this), Integer.valueOf(this.f20108t));
            intValue = this.f20108t;
        } else {
            z zVar = this.f17246a.getAdContent().f17242d;
            if (zVar != null && (rVar = ((y) zVar).f17074c) != null) {
                Integer num = rVar.f17017a;
                IAlog.a("%sreturning refreshConfig = %d", IAlog.a(this), num);
                if (num != null) {
                    intValue = num.intValue();
                }
            }
            IAlog.a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.a(this));
            return 0;
        }
        return intValue * 1000;
    }

    public final void H() {
        IAmraidWebViewController iAmraidWebViewController = this.f20101m;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f20365b == null) {
            return;
        }
        IAlog.a("%srefreshing ad", IAlog.a(this));
        if (!this.f20101m.h() || this.f20101m.i()) {
            this.f20106r = 0L;
            this.f20100l.refreshAd();
        }
    }

    public final void I() {
        com.fyber.inneractive.sdk.web.c cVar;
        IAmraidWebViewController iAmraidWebViewController = this.f20101m;
        if (iAmraidWebViewController == null || (cVar = iAmraidWebViewController.f20365b) == null || !cVar.getIsVisible() || this.f20106r == 0 || this.f20101m.h() || this.f20101m.i()) {
            return;
        }
        if (!this.f20111w) {
            if (this.f20099k < System.currentTimeMillis() - this.f20106r) {
                this.f20109u = 1L;
            } else {
                this.f20109u = this.f20099k - (System.currentTimeMillis() - this.f20106r);
            }
        }
        IAlog.a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.a(this), Long.valueOf(this.f20109u));
        a(this.f20109u, false);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
    }

    @Override // com.fyber.inneractive.sdk.util.b0.b
    public void b(boolean z10) {
        IAlog.a("%sgot onLockScreenStateChanged with: %s", IAlog.a(this), Boolean.valueOf(z10));
        if (z10) {
            d(false);
            b bVar = this.f20113y;
            if (bVar == null || !bVar.f20090h) {
                return;
            }
            bVar.c();
            return;
        }
        I();
        b bVar2 = this.f20113y;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f20101m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.h() || this.f20101m.i()) ? false : true;
        }
        return true;
    }

    public final void d(boolean z10) {
        if (this.f20107s != null) {
            this.f20111w = z10;
            E();
            this.f20109u = this.f20099k - (System.currentTimeMillis() - this.f20106r);
            IAlog.a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.a(this), Long.valueOf(this.f20109u), Long.valueOf(this.f20099k));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        E();
        F();
        this.f20102n = null;
        b0.a.f20236a.f20232a.remove(this);
        Runnable runnable = this.f20107s;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int f() {
        return this.f20101m.O;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void n() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int p() {
        return this.f20101m.P;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void q() {
        com.fyber.inneractive.sdk.web.c cVar;
        IAlog.a("%sgot onAdRefreshFailed", IAlog.a(this));
        IAmraidWebViewController iAmraidWebViewController = this.f20101m;
        if (iAmraidWebViewController == null || (cVar = iAmraidWebViewController.f20365b) == null) {
            return;
        }
        if (cVar.getIsVisible() && !b0.a.f20236a.f20233b && !this.f20101m.h() && !this.f20101m.i()) {
            IAlog.a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.a(this));
            long G = G();
            this.f20099k = G;
            if (G != 0) {
                a(10000L, false);
                return;
            }
            return;
        }
        IAlog.a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.a(this));
        this.f20109u = 1L;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void t() {
        b bVar = this.f20113y;
        if (bVar != null) {
            bVar.c();
        }
        FrameLayout frameLayout = this.f20105q;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f20104p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f20104p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.l
    public int w() {
        IAmraidWebViewController iAmraidWebViewController = this.f20101m;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.f20365b != null && iAmraidWebViewController.h()) {
                return com.fyber.inneractive.sdk.util.l.c(this.f20101m.f20365b.getHeight());
            }
            return com.fyber.inneractive.sdk.util.l.c(this.f20101m.P);
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.l
    public int x() {
        IAmraidWebViewController iAmraidWebViewController = this.f20101m;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.f20365b != null && iAmraidWebViewController.h()) {
                return com.fyber.inneractive.sdk.util.l.c(this.f20101m.f20365b.getWidth());
            }
            return com.fyber.inneractive.sdk.util.l.c(this.f20101m.O);
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(com.fyber.inneractive.sdk.flow.j jVar) {
        return jVar instanceof u;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(ViewGroup viewGroup) {
        Application application;
        boolean z10;
        r rVar;
        UnitDisplayType unitDisplayType;
        InneractiveAdSpot inneractiveAdSpot = this.f17246a;
        if (inneractiveAdSpot == null) {
            IAlog.e("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f20103o = false;
        this.f17251f = false;
        if (viewGroup != null) {
            this.f20104p = viewGroup;
            this.f20100l = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.f20112x) {
            F();
            if (this.f17246a.getAdContent() instanceof u) {
                this.f17247b = (u) this.f17246a.getAdContent();
                this.f17250e = false;
                C();
            } else {
                IAlog.e("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f17246a.getAdContent());
                return;
            }
        }
        Object obj = this.f17247b;
        IAmraidWebViewController iAmraidWebViewController = obj != null ? ((u) obj).f17297g : null;
        this.f20101m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.f20102n == null) {
                this.f20102n = new e(this);
            }
            iAmraidWebViewController.setListener(this.f20102n);
            u uVar = (u) this.f17247b;
            InneractiveAdRequest inneractiveAdRequest = uVar.f17239a;
            z zVar = uVar.f17242d;
            if (zVar != null && (rVar = ((y) zVar).f17074c) != null && (unitDisplayType = rVar.f17018b) != null && unitDisplayType.isFullscreenUnit()) {
                a aVar = new a(this.f20104p.getContext(), 1.5f);
                this.f20105q = aVar;
                this.f20101m.a(aVar, new ViewGroup.LayoutParams(-1, -1));
                this.f20104p.addView(this.f20105q, new ViewGroup.LayoutParams(-2, -2));
            } else {
                this.f20105q = new a(this.f20104p.getContext(), 0.0f);
                u uVar2 = (u) this.f17247b;
                com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) uVar2.f17240b;
                q0 a10 = a(fVar.f20164e, fVar.f20165f, uVar2.f17242d);
                this.f20101m.setAdDefaultSize(a10.f20323a, a10.f20324b);
                IAmraidWebViewController iAmraidWebViewController2 = this.f20101m;
                com.fyber.inneractive.sdk.web.c cVar = iAmraidWebViewController2.f20365b;
                if (cVar == null && (application = com.fyber.inneractive.sdk.util.l.f20301a) != null) {
                    if (!this.f20112x) {
                        this.f20112x = true;
                        iAmraidWebViewController2.f20365b = new com.fyber.inneractive.sdk.web.c(application);
                        try {
                            iAmraidWebViewController2.b();
                            iAmraidWebViewController2.f20365b.loadDataWithBaseURL(iAmraidWebViewController2.f20382s, iAmraidWebViewController2.f20383t, "text/html", "utf-8", null);
                            iAmraidWebViewController2.e();
                            z10 = true;
                        } catch (Throwable unused) {
                            z10 = false;
                        }
                        if (!z10) {
                            a(a10);
                        }
                    } else {
                        a(a10);
                    }
                } else {
                    ViewParent parent = cVar != null ? cVar.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(cVar);
                    }
                    this.f20101m.a(this.f20105q, new FrameLayout.LayoutParams(a10.f20323a, a10.f20324b, 17));
                    this.f20104p.addView(this.f20105q, new ViewGroup.LayoutParams(-2, -2));
                }
            }
            AdContent adcontent = this.f17247b;
            com.fyber.inneractive.sdk.response.f fVar2 = adcontent != 0 ? (com.fyber.inneractive.sdk.response.f) ((u) adcontent).f17240b : null;
            if (fVar2 != null) {
                b bVar = new b(fVar2, this.f20105q, new d(this));
                this.f20113y = bVar;
                bVar.f20091i = false;
                bVar.f20087e = 1;
                bVar.f20088f = 0.0f;
                int i10 = fVar2.f20179t;
                if (i10 >= 1) {
                    bVar.f20087e = Math.min(i10, 100);
                }
                float f10 = fVar2.f20180u;
                if (f10 >= -1.0f) {
                    bVar.f20088f = f10;
                }
                if (bVar.f20088f >= 0.0f) {
                    IAlog.a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    bVar.f20086d = 0.0f;
                    bVar.f20089g = System.currentTimeMillis();
                    bVar.f20090h = true;
                    bVar.a();
                }
            }
        } else {
            IAlog.e("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", obj);
        }
        b0 b0Var = b0.a.f20236a;
        if (b0Var.f20232a.contains(this)) {
            return;
        }
        b0Var.f20232a.add(this);
    }

    public final void a(long j10, boolean z10) {
        IAmraidWebViewController iAmraidWebViewController;
        com.fyber.inneractive.sdk.web.c cVar;
        if (!TextUtils.isEmpty(this.f17246a.getMediationNameString()) || j10 == 0 || (this.f17246a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.f20108t == -1 || (iAmraidWebViewController = this.f20101m) == null || (cVar = iAmraidWebViewController.f20365b) == null) {
            return;
        }
        if (!cVar.getIsVisible()) {
            IAlog.a("%sstartRefreshTimer called but ad is not visible", IAlog.a(this));
            return;
        }
        this.f20106r = System.currentTimeMillis();
        this.f20099k = z10 ? this.f20099k : j10;
        IAlog.a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.a(this), Long.valueOf(j10), Long.valueOf(this.f20099k));
        if (j10 > 1) {
            Runnable runnable = this.f20107s;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable);
            }
            E();
            f fVar = new f(this);
            this.f20107s = fVar;
            com.fyber.inneractive.sdk.util.n.f20310b.postDelayed(fVar, j10);
            return;
        }
        H();
    }

    public static q0 a(int i10, int i11, z zVar) {
        int a10;
        int a11;
        r rVar;
        IAlog.a("View layout params: response width and height: %d, %d", Integer.valueOf(i10), Integer.valueOf(i11));
        if (i10 > 0 && i11 > 0) {
            a10 = com.fyber.inneractive.sdk.util.l.a(i10);
            a11 = com.fyber.inneractive.sdk.util.l.a(i11);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (zVar != null && (rVar = ((y) zVar).f17074c) != null) {
                unitDisplayType = rVar.f17018b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                a10 = com.fyber.inneractive.sdk.util.l.a((float) ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                a11 = com.fyber.inneractive.sdk.util.l.a((float) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
            } else if (com.fyber.inneractive.sdk.util.k.o()) {
                a10 = com.fyber.inneractive.sdk.util.l.a(728);
                a11 = com.fyber.inneractive.sdk.util.l.a(90);
            } else {
                a10 = com.fyber.inneractive.sdk.util.l.a(320);
                a11 = com.fyber.inneractive.sdk.util.l.a(50);
            }
        }
        IAlog.d("View layout params: final scaled width and height: %d, %d", Integer.valueOf(a10), Integer.valueOf(a11));
        return new q0(a10, a11);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(View view) {
        return view.equals(this.f20104p);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(int i10) {
        this.f20108t = i10;
    }

    public final void a(q0 q0Var) {
        FrameLayout frameLayout = new FrameLayout(this.f20104p.getContext());
        frameLayout.setBackgroundResource(R.color.blank_background);
        this.f20104p.removeAllViews();
        this.f20104p.addView(frameLayout, new FrameLayout.LayoutParams(q0Var.f20323a, q0Var.f20324b, 17));
    }
}
