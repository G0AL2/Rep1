package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class g extends com.applovin.impl.adview.activity.b.a implements com.applovin.impl.adview.g {
    private AtomicBoolean A;
    private boolean B;
    private long C;
    private long D;

    /* renamed from: s  reason: collision with root package name */
    private final com.applovin.impl.adview.activity.a.d f6968s;

    /* renamed from: t  reason: collision with root package name */
    private final m f6969t;

    /* renamed from: u  reason: collision with root package name */
    private final ImageView f6970u;

    /* renamed from: v  reason: collision with root package name */
    private final com.applovin.impl.adview.a f6971v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f6972w;

    /* renamed from: x  reason: collision with root package name */
    private double f6973x;

    /* renamed from: y  reason: collision with root package name */
    private double f6974y;

    /* renamed from: z  reason: collision with root package name */
    private AtomicBoolean f6975z;

    /* loaded from: classes.dex */
    private class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == g.this.f6969t) {
                if (!g.this.s()) {
                    g.this.v();
                    return;
                }
                g.this.p();
                g.this.f6885q.b();
            } else if (view == g.this.f6970u) {
                g.this.x();
            } else if (v.a()) {
                v vVar = g.this.f6871c;
                vVar.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public g(com.applovin.impl.sdk.ad.e eVar, Activity activity, com.applovin.impl.sdk.m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f6968s = new com.applovin.impl.adview.activity.a.d(this.f6869a, this.f6873e, this.f6870b);
        boolean f10 = this.f6869a.f();
        this.f6972w = f10;
        this.f6975z = new AtomicBoolean();
        this.A = new AtomicBoolean();
        this.B = Utils.isVideoMutedInitially(this.f6870b);
        this.C = -2L;
        this.D = 0L;
        a aVar = new a();
        if (eVar.q() >= 0) {
            m mVar2 = new m(eVar.w(), activity);
            this.f6969t = mVar2;
            mVar2.setVisibility(8);
            mVar2.setOnClickListener(aVar);
        } else {
            this.f6969t = null;
        }
        if (a(this.B, mVar)) {
            ImageView imageView = new ImageView(activity);
            this.f6970u = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(aVar);
            d(this.B);
        } else {
            this.f6970u = null;
        }
        if (!f10) {
            this.f6971v = null;
            return;
        }
        com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cB)).intValue(), 16842874);
        this.f6971v = aVar2;
        aVar2.setColor(Color.parseColor("#75FFFFFF"));
        aVar2.setBackgroundColor(Color.parseColor("#00000000"));
        aVar2.setVisibility(8);
    }

    private static boolean a(boolean z10, com.applovin.impl.sdk.m mVar) {
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cq)).booleanValue()) {
            if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cr)).booleanValue() || z10) {
                return true;
            }
            return ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.ct)).booleanValue();
        }
        return false;
    }

    private void d(boolean z10) {
        if (com.applovin.impl.sdk.utils.g.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f6873e.getDrawable(z10 ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f6970u.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f6970u.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z10 ? this.f6869a.aC() : this.f6869a.aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f6970u.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.A.compareAndSet(false, true)) {
            a(this.f6969t, this.f6869a.q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.3
                @Override // java.lang.Runnable
                public void run() {
                    g.this.C = -1L;
                    g.this.D = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.adview.g
    public void a(double d10) {
        b("javascript:al_setVideoMuted(" + this.B + ");");
        com.applovin.impl.adview.a aVar = this.f6971v;
        if (aVar != null) {
            aVar.b();
        }
        if (this.f6969t != null) {
            y();
        }
        this.f6874f.getController().m();
        this.f6974y = d10;
        u();
        if (this.f6869a.am()) {
            this.f6885q.a(this.f6869a, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.f6968s.a(this.f6970u, this.f6969t, this.f6875g, this.f6971v, this.f6874f, viewGroup);
        this.f6874f.getController().a(this);
        a(false);
        com.applovin.impl.adview.a aVar = this.f6971v;
        if (aVar != null) {
            aVar.a();
        }
        this.f6874f.renderAd(this.f6869a);
        if (this.f6969t != null) {
            this.f6870b.S().a(new z(this.f6870b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.y();
                }
            }), o.a.MAIN, this.f6869a.r(), true);
        }
        this.f6870b.S().a(new z(this.f6870b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.2
            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                m mVar = gVar.f6875g;
                com.applovin.impl.sdk.a.b o10 = gVar.f6869a.o();
                if (mVar == null) {
                    o10.a(g.this.f6874f);
                    return;
                }
                g gVar2 = g.this;
                o10.a(gVar2.f6874f, Collections.singletonList(new com.applovin.impl.sdk.a.d(gVar2.f6875g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            }
        }), o.a.MAIN, 500L);
        super.b(this.B);
    }

    @Override // com.applovin.impl.adview.g
    public void a_() {
        w();
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        v();
    }

    @Override // com.applovin.impl.adview.g
    public void b(double d10) {
        this.f6973x = d10;
    }

    @Override // com.applovin.impl.adview.g
    public void b_() {
        com.applovin.impl.adview.a aVar = this.f6971v;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.impl.adview.g
    public void c() {
        com.applovin.impl.adview.a aVar = this.f6971v;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void m() {
        super.a((int) this.f6973x, this.f6972w, r(), this.C);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean r() {
        return this.f6973x >= ((double) this.f6869a.Q());
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean s() {
        return t() && !r();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void u() {
        long ae2;
        int l10;
        if (this.f6869a.ad() >= 0 || this.f6869a.ae() >= 0) {
            int i10 = (this.f6869a.ad() > 0L ? 1 : (this.f6869a.ad() == 0L ? 0 : -1));
            com.applovin.impl.sdk.ad.e eVar = this.f6869a;
            if (i10 >= 0) {
                ae2 = eVar.ad();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                double d10 = this.f6974y;
                long millis = d10 > 0.0d ? 0 + TimeUnit.SECONDS.toMillis((long) d10) : 0L;
                if (aVar.af() && ((l10 = (int) ((com.applovin.impl.sdk.ad.a) this.f6869a).l()) > 0 || (l10 = (int) aVar.s()) > 0)) {
                    millis += TimeUnit.SECONDS.toMillis(l10);
                }
                ae2 = (long) (millis * (this.f6869a.ae() / 100.0d));
            }
            b(ae2);
        }
    }

    public void v() {
        this.C = SystemClock.elapsedRealtime() - this.D;
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.C + "ms");
        }
        this.f6872d.f();
        this.f6878j++;
        if (this.f6869a.x()) {
            h();
        } else {
            w();
        }
    }

    public void w() {
        if (this.f6975z.compareAndSet(false, true)) {
            if (v.a()) {
                this.f6871c.b("AppLovinFullscreenActivity", "Showing postitial...");
            }
            b("javascript:al_showPostitial();");
            m mVar = this.f6969t;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ImageView imageView = this.f6970u;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.applovin.impl.adview.a aVar = this.f6971v;
            if (aVar != null) {
                aVar.b();
            }
            if (this.f6875g != null) {
                if (this.f6869a.s() >= 0) {
                    a(this.f6875g, this.f6869a.s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.4
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.f6877i = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.f6875g.setVisibility(0);
                }
            }
            this.f6874f.getController().n();
        }
    }

    protected void x() {
        this.B = !this.B;
        b("javascript:al_setVideoMuted(" + this.B + ");");
        d(this.B);
        a(this.B, 0L);
    }
}
