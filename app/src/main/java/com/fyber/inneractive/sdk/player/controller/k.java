package com.fyber.inneractive.sdk.player.controller;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.player.controller.s;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p0;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k<ListenerT extends s> implements com.fyber.inneractive.sdk.player.controller.b<ListenerT>, g.f, g.e, com.fyber.inneractive.sdk.player.ui.h {

    /* renamed from: a  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.c f17914a;

    /* renamed from: b  reason: collision with root package name */
    public z f17915b;

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.s f17916c;

    /* renamed from: d  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.i f17917d;

    /* renamed from: e  reason: collision with root package name */
    public g.InterfaceC0243g f17918e;

    /* renamed from: f  reason: collision with root package name */
    public int f17919f;

    /* renamed from: g  reason: collision with root package name */
    public ListenerT f17920g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17921h;

    /* renamed from: i  reason: collision with root package name */
    public float f17922i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f17923j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17924k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f17925l;

    /* renamed from: m  reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f17926m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f17927n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f17928o;

    /* renamed from: p  reason: collision with root package name */
    public Bitmap f17929p;

    /* renamed from: q  reason: collision with root package name */
    public AsyncTask<?, ?, ?> f17930q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f17931r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f17932s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f17933t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f17934u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f17935v;

    /* renamed from: w  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.e f17936w;

    /* renamed from: x  reason: collision with root package name */
    public Skip f17937x;

    /* loaded from: classes.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a(k kVar) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AsyncTask<Integer, Void, Bitmap> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public Bitmap doInBackground(Integer[] numArr) {
            Integer[] numArr2 = numArr;
            int intValue = numArr2[0].intValue();
            int intValue2 = numArr2[1].intValue();
            k.this.getClass();
            Application application = com.fyber.inneractive.sdk.util.l.f20301a;
            Bitmap bitmap = null;
            if (application != null && application.getResources() != null && application.getResources().getDisplayMetrics() != null) {
                DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
                try {
                    bitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                    if (bitmap != null) {
                        bitmap.setDensity(displayMetrics.densityDpi);
                    }
                } catch (Throwable unused) {
                }
            }
            return bitmap;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            super.onPostExecute(bitmap2);
            k kVar = k.this;
            kVar.f17929p = bitmap2;
            kVar.f17930q = null;
        }
    }

    public k(com.fyber.inneractive.sdk.player.c cVar, com.fyber.inneractive.sdk.player.ui.i iVar, z zVar, com.fyber.inneractive.sdk.config.global.s sVar, boolean z10) {
        this(cVar, iVar, zVar, sVar, z10, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(ListenerT listenert) {
        this.f17920g = listenert;
    }

    public abstract void a(p0 p0Var);

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(Exception exc) {
    }

    public void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
        if ((r2 != null && r2.getVisibility() == 0 && r0.f19779o.isEnabled()) == false) goto L22;
     */
    @Override // com.fyber.inneractive.sdk.player.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.c r0 = r5.f17914a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r5.f17921h
            r3 = 1
            if (r2 != 0) goto L50
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f17724b
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L50
            com.fyber.inneractive.sdk.player.ui.i r0 = r5.f17917d
            if (r0 == 0) goto L2f
            android.widget.TextView r2 = r0.f19779o
            if (r2 == 0) goto L2c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L2c
            android.widget.TextView r0 = r0.f19779o
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 != 0) goto L50
        L2f:
            com.fyber.inneractive.sdk.player.c r0 = r5.f17914a
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f17724b
            int r0 = r0.d()
            com.fyber.inneractive.sdk.player.c r2 = r5.f17914a
            r4 = r2
            com.fyber.inneractive.sdk.player.f r4 = (com.fyber.inneractive.sdk.player.f) r4
            com.fyber.inneractive.sdk.config.z r4 = r4.A
            int r2 = com.fyber.inneractive.sdk.player.c.a(r2)
            boolean r0 = com.fyber.inneractive.sdk.player.c.a(r0, r4, r2)
            if (r0 == 0) goto L51
            boolean r0 = r5.f17921h
            if (r0 != 0) goto L51
            int r0 = r5.f17919f
            if (r0 != 0) goto L51
        L50:
            r1 = 1
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.k.c():boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void d(boolean z10) {
        IAlog.a("%sinitUI", IAlog.a(this));
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || cVar.f17724b == null) {
            return;
        }
        this.f17917d.setUnitConfig(this.f17915b);
        com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
        int h10 = this.f17914a.f17724b.h();
        int g10 = this.f17914a.f17724b.g();
        boolean z11 = this.f17927n;
        iVar.f19781q = h10;
        iVar.f19782r = g10;
        iVar.f19783s = z11;
        if (this.f17914a.f17724b.h() > 0 && this.f17914a.f17724b.g() > 0) {
            a(this.f17914a.f17724b.h(), this.f17914a.f17724b.g());
        }
        if (w()) {
            this.f17919f = n();
        } else {
            this.f17917d.d(false);
        }
        if (!z10) {
            a(this.f17914a.f17724b.c());
            a(this.f17914a.f17724b.f17891e, false);
        }
        z();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void destroy() {
        g gVar;
        Application application;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f17926m;
        if (activityLifecycleCallbacks != null && (application = com.fyber.inneractive.sdk.util.l.f20301a) != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        IAlog.a("%sdestroy called", IAlog.a(this));
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar != null && (gVar = cVar.f17724b) != null) {
            List<g.f> list = gVar.f17888b;
            if (list != null) {
                list.remove(this);
            }
            List<g.e> list2 = this.f17914a.f17724b.f17889c;
            if (list2 != null) {
                list2.remove(this);
            }
        }
        j();
        h();
        AsyncTask<?, ?, ?> asyncTask = this.f17930q;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.f17920g = null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void e() {
        if (this.f17931r && !this.f17925l) {
            this.f17925l = true;
            this.f17917d.b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void e(boolean z10) {
    }

    public void f(boolean z10) {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar != null && (gVar = cVar.f17724b) != null) {
            gVar.b(z10);
        }
        this.f17917d.setMuteButtonState(true);
    }

    public void g() {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || (gVar = cVar.f17724b) == null) {
            return;
        }
        List<g.f> list = gVar.f17888b;
        if (list != null && !list.contains(this)) {
            gVar.f17888b.add(this);
        }
        g gVar2 = this.f17914a.f17724b;
        List<g.e> list2 = gVar2.f17889c;
        if (list2 == null || list2.contains(this)) {
            return;
        }
        gVar2.f17889c.add(this);
    }

    public void h(boolean z10) {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar != null) {
            if (!cVar.f17733k) {
                y();
            } else if (z10 && (gVar = cVar.f17724b) != null) {
                gVar.a(0, true);
            } else {
                cVar.g();
            }
        }
    }

    public void i(boolean z10) {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar != null && (gVar = cVar.f17724b) != null) {
            gVar.d(z10);
        }
        this.f17917d.setMuteButtonState(false);
    }

    public void j() {
        Bitmap g10;
        if (this.f17936w != null) {
            IAlog.a("%sdestroyTextureView", IAlog.a(this));
            if (!(this.f17929p != null) || (g10 = g(false)) == null) {
                return;
            }
            this.f17917d.setLastFrameBitmap(g10);
            this.f17917d.b(true);
        }
    }

    public void k() {
        if (w()) {
            com.fyber.inneractive.sdk.config.global.s sVar = this.f17916c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.b bVar = sVar != null ? (com.fyber.inneractive.sdk.config.global.features.b) sVar.a(com.fyber.inneractive.sdk.config.global.features.b.class) : null;
            if (bVar != null) {
                bVar.e(IAConfigManager.J.f16880p);
                com.fyber.inneractive.sdk.model.vast.a aVar = bVar.f16951e;
                if (aVar != null && aVar.f17385d) {
                    str = aVar.f17383b;
                }
            }
            if (str != null) {
                this.f17917d.setSkipText(str);
            } else {
                com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
                iVar.setSkipText(iVar.getContext().getString(R.string.ia_video_skip_text));
            }
            TextView textView = this.f17917d.f19779o;
            if (textView != null) {
                textView.setEnabled(true);
            }
            this.f17919f = 0;
            ListenerT listenert = this.f17920g;
            if (listenert != null) {
                listenert.e();
            }
        }
    }

    public abstract int l();

    public final float m() {
        try {
            return ((AudioManager) this.f17917d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    public abstract int n();

    public boolean o() {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || (gVar = cVar.f17724b) == null) {
            return false;
        }
        return gVar.i() || m() == 0.0f;
    }

    public abstract void p();

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void pauseVideo() {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || (gVar = cVar.f17724b) == null) {
            return;
        }
        if (gVar.f17891e != com.fyber.inneractive.sdk.player.enums.b.Paused) {
            IAlog.a("%spauseVideo %s", IAlog.a(this), this.f17917d);
            TextureView textureView = this.f17914a.f17724b.f17896j;
            if (textureView == null || textureView.getParent() == null || !textureView.getParent().equals(this.f17917d.getTextureHost())) {
                return;
            }
            this.f17914a.f17724b.k();
            return;
        }
        IAlog.a("%spauseVideo called in bad state! %s", IAlog.a(this), this.f17914a.f17724b.f17891e);
    }

    public void q() {
        if (this.f17917d.d()) {
            return;
        }
        this.f17917d.a(false);
        h();
        y();
        this.f17924k = false;
        this.f17921h = true;
    }

    public abstract void r();

    public void s() {
        h();
        this.f17917d.a(false);
        y();
    }

    public abstract void t();

    public void u() {
    }

    public void v() {
        g gVar;
        this.f17917d.a(false);
        this.f17917d.c(false);
        com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
        com.fyber.inneractive.sdk.player.ui.b bVar = new com.fyber.inneractive.sdk.player.ui.b();
        bVar.f19755b = false;
        iVar.a(new com.fyber.inneractive.sdk.player.ui.a(bVar));
        IAsmoothProgressBar iAsmoothProgressBar = this.f17917d.f19786v;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(0);
        }
        ImageView imageView = this.f17917d.f19784t;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        TextView textView = this.f17917d.f19778n;
        if (textView != null) {
            textView.setVisibility(0);
        }
        h();
        if (this.f17914a != null && w() && !this.f17921h) {
            int d10 = this.f17914a.f17724b.d();
            com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
            if (com.fyber.inneractive.sdk.player.c.a(d10, ((com.fyber.inneractive.sdk.player.f) cVar).A, com.fyber.inneractive.sdk.player.c.a(cVar))) {
                if (this.f17919f <= 0) {
                    this.f17917d.d(true);
                    k();
                } else {
                    com.fyber.inneractive.sdk.player.c cVar2 = this.f17914a;
                    if (cVar2 != null && (gVar = cVar2.f17724b) != null) {
                        if (this.f17919f >= gVar.d() / 1000) {
                            this.f17917d.d(false);
                        }
                    }
                    if (!this.f17932s) {
                        this.f17917d.d(true);
                        c(this.f17919f);
                        this.f17932s = true;
                    }
                }
            }
        }
        ListenerT listenert = this.f17920g;
        if (listenert != null && !this.f17924k) {
            this.f17924k = true;
            listenert.l();
        }
        this.f17928o = false;
        this.f17933t = false;
    }

    public abstract boolean w();

    public void x() {
        boolean z10;
        com.fyber.inneractive.sdk.config.global.s sVar = this.f17916c;
        String str = null;
        com.fyber.inneractive.sdk.config.global.features.j jVar = sVar != null ? (com.fyber.inneractive.sdk.config.global.features.j) sVar.a(com.fyber.inneractive.sdk.config.global.features.j.class) : null;
        com.fyber.inneractive.sdk.config.global.s sVar2 = this.f17916c;
        com.fyber.inneractive.sdk.config.global.features.b bVar = sVar2 != null ? (com.fyber.inneractive.sdk.config.global.features.b) sVar2.a(com.fyber.inneractive.sdk.config.global.features.b.class) : null;
        boolean z11 = true;
        if (jVar != null) {
            z11 = jVar.a("show_cta", true);
            z10 = jVar.c();
        } else {
            z10 = false;
        }
        if (bVar != null) {
            bVar.e(IAConfigManager.J.f16880p);
            com.fyber.inneractive.sdk.model.vast.a aVar = bVar.f16951e;
            if (aVar != null && aVar.f17385d) {
                str = aVar.f17382a;
            }
        }
        this.f17917d.a(z11, z10, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y() {
        /*
            Method dump skipped, instructions count: 693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.k.y():void");
    }

    public void z() {
        com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
        if (iVar.f19784t != null) {
            iVar.setMuteButtonState(o());
        }
    }

    public k(com.fyber.inneractive.sdk.player.c cVar, com.fyber.inneractive.sdk.player.ui.i iVar, z zVar, com.fyber.inneractive.sdk.config.global.s sVar, boolean z10, Skip skip) {
        this.f17919f = 0;
        this.f17921h = false;
        this.f17922i = -0.1f;
        this.f17925l = false;
        this.f17928o = false;
        this.f17929p = null;
        this.f17930q = null;
        this.f17931r = false;
        this.f17932s = false;
        this.f17933t = false;
        this.f17934u = false;
        this.f17935v = false;
        this.f17937x = null;
        this.f17937x = skip;
        this.f17914a = cVar;
        this.f17915b = zVar;
        this.f17916c = sVar;
        this.f17917d = iVar;
        this.f17927n = z10;
        iVar.setListener(this);
        g();
        new GestureDetector(iVar.getContext(), new a(this));
    }

    public final void a(int i10, int i11) {
        Bitmap bitmap = this.f17929p;
        if (!(bitmap != null && bitmap.getWidth() == i10 && this.f17929p.getHeight() == i11) && i11 > 0 && i10 > 0) {
            AsyncTask<?, ?, ?> asyncTask = this.f17930q;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            this.f17929p = null;
            b bVar = new b();
            this.f17930q = bVar;
            bVar.executeOnExecutor(com.fyber.inneractive.sdk.util.n.f20309a, Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void f() {
        com.fyber.inneractive.sdk.player.ui.e eVar;
        com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
        if (iVar != null) {
            iVar.g();
        }
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar != null && cVar.f17724b != null && (eVar = this.f17936w) != null) {
            eVar.invalidate();
            this.f17936w.requestLayout();
        }
        com.fyber.inneractive.sdk.player.ui.i iVar2 = this.f17917d;
        if (iVar2 != null) {
            iVar2.invalidate();
            this.f17917d.requestLayout();
        }
    }

    public boolean i() {
        g gVar;
        g gVar2;
        com.fyber.inneractive.sdk.player.ui.e eVar;
        TextureView textureView;
        com.fyber.inneractive.sdk.measurement.g gVar3;
        if (this.f17936w == null) {
            com.fyber.inneractive.sdk.player.ui.e eVar2 = new com.fyber.inneractive.sdk.player.ui.e(this.f17917d);
            this.f17936w = eVar2;
            com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
            if (cVar != null && (gVar3 = cVar.f17731i) != null) {
                View[] trackingFriendlyView = this.f17917d.getTrackingFriendlyView();
                AdSession adSession = gVar3.f17339a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(eVar2);
                    } catch (Throwable th) {
                        gVar3.a(th);
                    }
                }
                if (gVar3.f17339a != null && trackingFriendlyView != null) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                gVar3.f17339a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                            } catch (Throwable th2) {
                                gVar3.a(th2);
                            }
                        }
                    }
                }
            }
        }
        IAlog.a("%sconnectToTextureView called %s", IAlog.a(this), this.f17917d.getTextureHost());
        if (this.f17936w != null && this.f17917d.getTextureHost().equals(this.f17936w.getParent())) {
            IAlog.a("%sconnectToTextureView called but already connected", IAlog.a(this));
        } else {
            com.fyber.inneractive.sdk.player.c cVar2 = this.f17914a;
            if (cVar2 != null && (gVar2 = cVar2.f17724b) != null && (textureView = gVar2.f17896j) != (eVar = this.f17936w)) {
                if (textureView != null) {
                    textureView.setSurfaceTextureListener(null);
                }
                gVar2.f17896j = eVar;
                if (gVar2.f17899m == null) {
                    gVar2.f17899m = new f(gVar2);
                }
                eVar.setSurfaceTextureListener(gVar2.f17899m);
                if (gVar2.f17897k != null) {
                    IAlog.a("%scalling setSurfaceTexture with cached texture", IAlog.a(gVar2));
                    if (gVar2.f17896j.getSurfaceTexture() != null && gVar2.f17896j.getSurfaceTexture().equals(gVar2.f17897k)) {
                        IAlog.a("%scalling setSurfaceTexture with cached texture failed", IAlog.a(gVar2));
                    } else {
                        IAlog.a("%scalling setSurfaceTexture with cached texture success", IAlog.a(gVar2));
                        gVar2.f17896j.setSurfaceTexture(gVar2.f17897k);
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.e eVar3 = this.f17936w;
            if (eVar3 != null) {
                eVar3.setId(R.id.inn_texture_view);
            }
            IAlog.a("%supdateView adding texture to parent", IAlog.a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = 17;
            if (this.f17936w.getParent() == null) {
                this.f17917d.getTextureHost().addView(this.f17936w, layoutParams);
            }
            this.f17925l = false;
            p pVar = new p(this);
            this.f17918e = pVar;
            com.fyber.inneractive.sdk.player.c cVar3 = this.f17914a;
            if (cVar3 != null && (gVar = cVar3.f17724b) != null) {
                gVar.f17890d = pVar;
            }
        }
        return true;
    }

    public final void h() {
        Runnable runnable = this.f17923j;
        if (runnable != null) {
            this.f17917d.removeCallbacks(runnable);
            this.f17923j = null;
        }
    }

    public final void a(String str) {
        a0 a0Var;
        d0 d0Var = IAConfigManager.J.f16888x;
        z zVar = this.f17915b;
        if (zVar == null || (a0Var = ((y) zVar).f17077f) == null) {
            return;
        }
        d0Var.a(a0Var.f16908j, "LAST_VAST_CLICKED_TYPE", str);
    }

    public Bitmap g(boolean z10) {
        com.fyber.inneractive.sdk.player.c cVar;
        g gVar;
        if (this.f17929p != null && (cVar = this.f17914a) != null && (gVar = cVar.f17724b) != null) {
            if (this.f17928o) {
                return cVar.f17734l;
            }
            TextureView textureView = gVar.f17896j;
            Object[] objArr = new Object[3];
            objArr[0] = IAlog.a(this);
            objArr[1] = textureView;
            objArr[2] = Boolean.valueOf(textureView != null && textureView.isAvailable());
            IAlog.a("%sSave snapshot entered: tv = %s avail = %s", objArr);
            if (textureView != null && textureView.isAvailable()) {
                try {
                    IAlog.d("creating bitmap on object - %s", this.f17929p);
                    Bitmap bitmap = textureView.getBitmap(this.f17929p);
                    if (this.f17917d.getVideoWidth() > 0 && this.f17917d.getVideoHeight() > 0) {
                        this.f17929p = null;
                        a(this.f17917d.getVideoWidth(), this.f17917d.getVideoHeight());
                    }
                    if (z10) {
                        com.fyber.inneractive.sdk.util.c cVar2 = new com.fyber.inneractive.sdk.util.c();
                        cVar2.f20239c = 20;
                        cVar2.f20240d = 1;
                        cVar2.f20237a = bitmap.getWidth();
                        cVar2.f20238b = bitmap.getHeight();
                        this.f17914a.a(com.fyber.inneractive.sdk.util.b.a(this.f17917d.getContext(), bitmap, cVar2));
                        this.f17928o = true;
                    } else {
                        this.f17914a.a(bitmap);
                    }
                    IAlog.d("%ssave snapshot succeeded", IAlog.a(this));
                    return this.f17914a.f17734l;
                } catch (Exception unused) {
                    IAlog.d("%ssave snapshot failed with exception", IAlog.a(this));
                }
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void c(boolean z10) {
        com.fyber.inneractive.sdk.player.c cVar;
        g gVar;
        a0 a0Var;
        ListenerT listenert;
        g gVar2;
        z zVar;
        a0 a0Var2;
        this.f17933t = true;
        d0 d0Var = IAConfigManager.J.f16888x;
        if (z10 && d0Var != null && (zVar = this.f17915b) != null && (a0Var2 = ((y) zVar).f17077f) != null) {
            d0Var.a(a0Var2.f16908j, "LAST_VAST_SKIPED", "1");
        }
        com.fyber.inneractive.sdk.player.c cVar2 = this.f17914a;
        if (cVar2 != null && (gVar2 = cVar2.f17724b) != null) {
            gVar2.m();
            this.f17914a.f17724b.k();
            com.fyber.inneractive.sdk.measurement.g gVar3 = this.f17914a.f17731i;
            if (gVar3 != null && gVar3.f17341c != null) {
                IAlog.a("%s skipped", "OMVideo");
                try {
                    gVar3.f17341c.skipped();
                } catch (Throwable th) {
                    gVar3.a(th);
                }
            }
        }
        if (!this.f17917d.d()) {
            this.f17917d.a(false);
            h();
            y();
            this.f17924k = false;
            this.f17921h = true;
            z zVar2 = this.f17915b;
            if (zVar2 != null && (a0Var = ((y) zVar2).f17077f) != null && a0Var.f16908j == UnitDisplayType.REWARDED && (listenert = this.f17920g) != null) {
                listenert.onCompleted();
            }
        }
        if (this.f17920g != null && (this.f17919f <= 0 || this.f17921h || ((cVar = this.f17914a) != null && (gVar = cVar.f17724b) != null && gVar.f17891e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed)))) {
            this.f17920g.a(z10);
        }
        j();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%sonPlayerStateChanged with %s", IAlog.a(this), bVar);
        a(bVar, true);
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z10) {
        ListenerT listenert;
        int ordinal = bVar.ordinal();
        if (ordinal == 2) {
            if (this.f17931r) {
                this.f17917d.b(true);
                y();
                u();
            }
        } else if (ordinal != 3) {
            switch (ordinal) {
                case 6:
                    if (this.f17931r) {
                        v();
                        return;
                    }
                    return;
                case 7:
                    s();
                    return;
                case 8:
                    if (!this.f17931r || this.f17935v) {
                        return;
                    }
                    this.f17935v = true;
                    q();
                    if (!z10 || (listenert = this.f17920g) == null) {
                        return;
                    }
                    listenert.onCompleted();
                    return;
                case 9:
                    if (this.f17931r) {
                        c(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (this.f17931r) {
            this.f17917d.a(true);
            this.f17917d.c(false);
            Runnable runnable = this.f17923j;
            if (runnable == null) {
                if (runnable == null) {
                    this.f17923j = new l(this);
                }
                int l10 = l();
                IAlog.a("%s Starting buffering timeout with %d", IAlog.a(this), Integer.valueOf(l10));
                this.f17917d.postDelayed(this.f17923j, l10);
            }
        }
    }

    public void d() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        j();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.e
    public void a(int i10) {
        int i11;
        z zVar;
        a0 a0Var;
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || cVar.f17724b == null) {
            return;
        }
        float m10 = m();
        com.fyber.inneractive.sdk.player.c cVar2 = this.f17914a;
        if (cVar2 != null && (gVar = cVar2.f17724b) != null && gVar.j()) {
            float f10 = this.f17922i;
            if (m10 != f10) {
                int i12 = (m10 > 0.0f ? 1 : (m10 == 0.0f ? 0 : -1));
                if (i12 > 0 && f10 >= 0.0f && o()) {
                    i(true);
                } else if (i12 == 0 && !o()) {
                    f(true);
                }
            }
            z();
        }
        this.f17922i = m10;
        int d10 = this.f17914a.f17724b.d();
        int c10 = this.f17914a.f17724b.c();
        int i13 = c10 / 1000;
        int i14 = d10 / 1000;
        int i15 = i14 - i13;
        if (i15 < 0 || (!this.f17914a.f17724b.j() && c10 == d10)) {
            i15 = 0;
        }
        com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
        if (iVar.f19778n == null && iVar.f19786v == null) {
            return;
        }
        iVar.setRemainingTime(Integer.toString(i15));
        if (this.f17919f < i14) {
            if (w()) {
                int d11 = this.f17914a.f17724b.d();
                com.fyber.inneractive.sdk.player.c cVar3 = this.f17914a;
                if (com.fyber.inneractive.sdk.player.c.a(d11, ((com.fyber.inneractive.sdk.player.f) cVar3).A, com.fyber.inneractive.sdk.player.c.a(cVar3)) && !this.f17921h) {
                    int i16 = this.f17919f;
                    if (i13 < i16) {
                        c(i16 - i13);
                    } else {
                        this.f17919f = 0;
                        k();
                    }
                    this.f17917d.d(true);
                }
            }
            this.f17917d.d(false);
        } else {
            this.f17917d.d(false);
        }
        if (this.f17914a.f17724b.f17891e != com.fyber.inneractive.sdk.player.enums.b.Paused) {
            com.fyber.inneractive.sdk.player.ui.i iVar2 = this.f17917d;
            if (iVar2.f19786v != null) {
                Runnable runnable = iVar2.E;
                if (runnable != null) {
                    iVar2.removeCallbacks(runnable);
                    iVar2.E = null;
                }
                int i17 = i14 * 1000;
                iVar2.f19786v.setMax(i17);
                int i18 = i17 - (i15 * 1000);
                int i19 = i18 + 1000;
                iVar2.D = i19;
                int i20 = i18 + 200;
                if (i19 > 0 && i19 <= i17) {
                    int i21 = iVar2.C;
                    if (i20 < i21 && i21 > 0) {
                        iVar2.f19786v.setProgress(i19);
                    } else {
                        iVar2.C = i20;
                        iVar2.f19786v.setProgress(i20);
                        com.fyber.inneractive.sdk.player.ui.k kVar = new com.fyber.inneractive.sdk.player.ui.k(iVar2);
                        iVar2.E = kVar;
                        iVar2.postDelayed(kVar, 200L);
                    }
                }
            }
            com.fyber.inneractive.sdk.config.h hVar = IAConfigManager.J.f16886v.f16987b;
            String num = Integer.toString(30);
            if (hVar.f16984a.containsKey("max_rv_tsec")) {
                num = hVar.f16984a.get("max_rv_tsec");
            }
            try {
                i11 = Integer.parseInt(num);
            } catch (Throwable unused) {
                i11 = 30;
            }
            int i22 = i11 >= 1 ? i11 : 30;
            if (i14 > i22 && i13 > i22 && (zVar = this.f17915b) != null && (a0Var = ((y) zVar).f17077f) != null && a0Var.f16908j == UnitDisplayType.REWARDED) {
                k();
                this.f17917d.d(true);
            }
        }
        ListenerT listenert = this.f17920g;
        if (listenert != null) {
            listenert.onProgress(d10, c10);
        }
    }

    public final void c(int i10) {
        if (this.f17917d != null) {
            com.fyber.inneractive.sdk.config.global.s sVar = this.f17916c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.b bVar = sVar != null ? (com.fyber.inneractive.sdk.config.global.features.b) sVar.a(com.fyber.inneractive.sdk.config.global.features.b.class) : null;
            if (bVar != null) {
                bVar.e(IAConfigManager.J.f16880p);
                com.fyber.inneractive.sdk.model.vast.a aVar = bVar.f16951e;
                if (aVar != null && aVar.f17385d) {
                    str = aVar.f17384c;
                }
            }
            if (str != null) {
                this.f17917d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i10)));
                return;
            }
            com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
            iVar.setSkipText(iVar.getContext().getString(R.string.ia_video_before_skip_format, Integer.valueOf(i10)));
        }
    }

    public void a(boolean z10) {
        com.fyber.inneractive.sdk.player.c cVar;
        g gVar;
        com.fyber.inneractive.sdk.player.ui.i iVar;
        Application application;
        if (this.f17931r == z10 || (cVar = this.f17914a) == null || cVar.f17724b == null) {
            return;
        }
        IAlog.a("%sonVisibilityChanged: %s my video view is%s", IAlog.a(this), Boolean.valueOf(z10), this.f17917d);
        if (z10) {
            this.f17931r = true;
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f17914a.f17724b.f17891e;
            if (!bVar.equals(com.fyber.inneractive.sdk.player.enums.b.Completed) && !this.f17917d.d()) {
                if (!bVar.equals(com.fyber.inneractive.sdk.player.enums.b.Error)) {
                    if (!bVar.equals(com.fyber.inneractive.sdk.player.enums.b.Idle)) {
                        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                            v();
                        }
                        com.fyber.inneractive.sdk.player.c cVar2 = this.f17914a;
                        if (!cVar2.f17739q) {
                            com.fyber.inneractive.sdk.player.f fVar = (com.fyber.inneractive.sdk.player.f) cVar2;
                            fVar.a(fVar.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.EVENT_CREATIVE_VIEW);
                            cVar2.f17739q = true;
                        }
                        i();
                        if (this.f17926m != null || (application = com.fyber.inneractive.sdk.util.l.f20301a) == null) {
                            return;
                        }
                        m mVar = new m(this);
                        this.f17926m = mVar;
                        application.registerActivityLifecycleCallbacks(mVar);
                        return;
                    }
                    this.f17914a.getClass();
                }
                c(false);
                return;
            }
            if (!this.f17935v) {
                this.f17935v = true;
                q();
                ListenerT listenert = this.f17920g;
                if (listenert != null) {
                    listenert.onCompleted();
                }
            }
            com.fyber.inneractive.sdk.player.ui.i iVar2 = this.f17917d;
            if (iVar2 == null || iVar2.F == null) {
                return;
            }
            IAlog.a("Autoclick resumed", new Object[0]);
            iVar2.F.b();
            return;
        }
        this.f17931r = false;
        com.fyber.inneractive.sdk.player.c cVar3 = this.f17914a;
        if (cVar3 != null && (gVar = cVar3.f17724b) != null && gVar.f17890d.equals(this.f17918e)) {
            IAlog.a("%sonVisibilityChanged pausing video", IAlog.a(this));
            pauseVideo();
            if (this.f17914a.f17724b.f17891e == com.fyber.inneractive.sdk.player.enums.b.Completed || ((iVar = this.f17917d) != null && iVar.d())) {
                com.fyber.inneractive.sdk.player.ui.i iVar3 = this.f17917d;
                if (iVar3.F != null) {
                    IAlog.a("Autoclick paused", new Object[0]);
                    iVar3.F.a();
                }
            }
        }
        j();
    }

    public void a(int i10, p0 p0Var) {
        IAlog.a("onClicked called with %d", Integer.valueOf(i10));
        switch (i10) {
            case 1:
                if (o()) {
                    i(true);
                    com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
                    if (cVar != null) {
                        com.fyber.inneractive.sdk.player.f fVar = (com.fyber.inneractive.sdk.player.f) cVar;
                        fVar.a(fVar.f19689x, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.q.EVENT_UNMUTE);
                    }
                } else {
                    f(true);
                    com.fyber.inneractive.sdk.player.c cVar2 = this.f17914a;
                    if (cVar2 != null) {
                        com.fyber.inneractive.sdk.player.f fVar2 = (com.fyber.inneractive.sdk.player.f) cVar2;
                        fVar2.a(fVar2.f19689x, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.q.EVENT_MUTE);
                    }
                }
                z();
                return;
            case 2:
                t();
                return;
            case 3:
                a("1");
                a(false, VideoClickOrigin.CTA, p0Var);
                return;
            case 4:
                a("2");
                com.fyber.inneractive.sdk.player.c cVar3 = this.f17914a;
                String str = null;
                com.fyber.inneractive.sdk.model.vast.c f10 = cVar3 != null ? cVar3.f() : null;
                if (f10 != null && f10.f17395a == com.fyber.inneractive.sdk.model.vast.g.Static) {
                    str = f10.f17401g;
                    com.fyber.inneractive.sdk.player.c cVar4 = this.f17914a;
                    if (cVar4 != null) {
                        cVar4.a(f10, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.q.EVENT_CLICK);
                    }
                }
                com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
                if (iVar != null) {
                    iVar.e();
                    iVar.G = true;
                }
                ListenerT listenert = this.f17920g;
                if (listenert != null) {
                    listenert.a(str, p0Var);
                    return;
                }
                return;
            case 5:
                r();
                return;
            case 6:
                c(true);
                return;
            case 7:
                a(p0Var);
                return;
            case 8:
                a("2");
                a(true, VideoClickOrigin.COMPANION, p0Var);
                return;
            case 9:
                com.fyber.inneractive.sdk.player.c cVar5 = this.f17914a;
                if (cVar5 == null || this.f17917d.f19771h) {
                    return;
                }
                cVar5.f17733k = true;
                h(false);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r5.f20243a != com.fyber.inneractive.sdk.util.d0.c.f20246a) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(boolean r5, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r6, com.fyber.inneractive.sdk.util.p0 r7) {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.ui.i r0 = r4.f17917d
            r1 = 1
            if (r0 == 0) goto La
            r0.e()
            r0.G = r1
        La:
            ListenerT extends com.fyber.inneractive.sdk.player.controller.s r0 = r4.f17920g
            r2 = 0
            if (r0 == 0) goto L78
            if (r5 == 0) goto L32
            com.fyber.inneractive.sdk.player.c r5 = r4.f17914a
            if (r5 == 0) goto L78
            com.fyber.inneractive.sdk.player.f r5 = (com.fyber.inneractive.sdk.player.f) r5
            com.fyber.inneractive.sdk.model.vast.b r5 = r5.f19689x
            if (r5 == 0) goto L1e
            java.lang.String r5 = r5.f17387b
            goto L1f
        L1e:
            r5 = 0
        L1f:
            r0.a(r5, r7)
            com.fyber.inneractive.sdk.player.c r5 = r4.f17914a
            com.fyber.inneractive.sdk.model.vast.q[] r7 = new com.fyber.inneractive.sdk.model.vast.q[r1]
            com.fyber.inneractive.sdk.model.vast.q r0 = com.fyber.inneractive.sdk.model.vast.q.EVENT_CLICK
            r7[r2] = r0
            com.fyber.inneractive.sdk.player.f r5 = (com.fyber.inneractive.sdk.player.f) r5
            com.fyber.inneractive.sdk.model.vast.b r0 = r5.f19689x
            r5.a(r0, r6, r7)
            goto L78
        L32:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r5 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r6 != r5) goto L39
            com.fyber.inneractive.sdk.util.e r5 = com.fyber.inneractive.sdk.util.e.VIDEO_CLICK
            goto L3b
        L39:
            com.fyber.inneractive.sdk.util.e r5 = com.fyber.inneractive.sdk.util.e.VIDEO_CTA
        L3b:
            com.fyber.inneractive.sdk.util.d0$a r5 = r0.a(r7, r5)
            com.fyber.inneractive.sdk.player.c r7 = r4.f17914a
            if (r7 == 0) goto L71
            com.fyber.inneractive.sdk.model.vast.q[] r0 = new com.fyber.inneractive.sdk.model.vast.q[r1]
            com.fyber.inneractive.sdk.model.vast.q r3 = com.fyber.inneractive.sdk.model.vast.q.EVENT_CLICK
            r0[r2] = r3
            com.fyber.inneractive.sdk.player.f r7 = (com.fyber.inneractive.sdk.player.f) r7
            com.fyber.inneractive.sdk.model.vast.b r3 = r7.f19689x
            r7.a(r3, r6, r0)
            com.fyber.inneractive.sdk.player.c r7 = r4.f17914a
            com.fyber.inneractive.sdk.measurement.g r7 = r7.f17731i
            if (r7 == 0) goto L71
            com.iab.omid.library.fyber.adsession.media.MediaEvents r0 = r7.f17341c
            if (r0 == 0) goto L71
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = "OMVideo"
            r0[r2] = r3
            java.lang.String r3 = "%s click"
            com.fyber.inneractive.sdk.util.IAlog.a(r3, r0)
            com.iab.omid.library.fyber.adsession.media.MediaEvents r0 = r7.f17341c     // Catch: java.lang.Throwable -> L6d
            com.iab.omid.library.fyber.adsession.media.InteractionType r3 = com.iab.omid.library.fyber.adsession.media.InteractionType.CLICK     // Catch: java.lang.Throwable -> L6d
            r0.adUserInteraction(r3)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L6d:
            r0 = move-exception
            r7.a(r0)
        L71:
            com.fyber.inneractive.sdk.util.d0$c r5 = r5.f20243a
            com.fyber.inneractive.sdk.util.d0$c r7 = com.fyber.inneractive.sdk.util.d0.c.FAILED
            if (r5 == r7) goto L78
            goto L79
        L78:
            r1 = 0
        L79:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r5 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r6 != r5) goto L82
            java.lang.String r5 = "3"
            r4.a(r5)
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.k.a(boolean, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin, com.fyber.inneractive.sdk.util.p0):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(Bitmap bitmap) {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || (gVar = cVar.f17724b) == null || gVar.f17891e == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            return;
        }
        this.f17917d.a(cVar.f17733k);
        this.f17917d.b(true);
        this.f17917d.setLastFrameBitmap(bitmap);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(long j10) {
        View view;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        View c10 = cVar != null ? cVar.c() : null;
        com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
        boolean z10 = c10 == null;
        ObjectAnimator objectAnimator = iVar.H;
        if (objectAnimator != null) {
            if (objectAnimator.getDuration() <= j10) {
                ViewGroup viewGroup = iVar.f19789y;
                if (viewGroup != null) {
                    iVar.a((View) viewGroup.getParent(), 4);
                }
                iVar.H.start();
                iVar.H.addListener(new com.fyber.inneractive.sdk.player.ui.j(iVar));
            } else {
                iVar.I = true;
                iVar.H = null;
                ViewGroup viewGroup2 = iVar.f19789y;
                if (viewGroup2 != null && viewGroup2.getParent() != null) {
                    ((View) iVar.f19789y.getParent()).setOnTouchListener(null);
                }
            }
            if (z10 && (view = iVar.f19788x) != null) {
                view.setVisibility(0);
                return;
            }
            ViewGroup viewGroup3 = iVar.f19789y;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
        }
    }
}
