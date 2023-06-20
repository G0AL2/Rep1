package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.s;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.q;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.c;
import ea.n0;
import i9.j0;
import j8.c3;
import j8.m2;
import j8.x1;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    protected boolean A;
    protected long B;
    protected int C;
    protected boolean D;
    protected boolean E;
    private final com.applovin.impl.adview.activity.a.c F;
    private final a G;
    private final Handler H;
    private final boolean I;
    private long J;
    private final AtomicBoolean K;
    private final AtomicBoolean L;
    private long M;
    private long N;

    /* renamed from: s  reason: collision with root package name */
    protected final com.google.android.exoplayer2.ui.d f6922s;

    /* renamed from: t  reason: collision with root package name */
    protected final c3 f6923t;

    /* renamed from: u  reason: collision with root package name */
    protected final com.applovin.impl.adview.a f6924u;

    /* renamed from: v  reason: collision with root package name */
    protected final m f6925v;

    /* renamed from: w  reason: collision with root package name */
    protected final ImageView f6926w;

    /* renamed from: x  reason: collision with root package name */
    protected final t f6927x;

    /* renamed from: y  reason: collision with root package name */
    protected final ProgressBar f6928y;

    /* renamed from: z  reason: collision with root package name */
    protected final j f6929z;

    /* loaded from: classes.dex */
    private class a implements u.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.u.a
        public void a(t tVar) {
            if (v.a()) {
                e.this.f6871c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            e.this.a(tVar.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.u.a
        public void b(t tVar) {
            if (v.a()) {
                e.this.f6871c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            e.this.h();
        }

        @Override // com.applovin.impl.adview.u.a
        public void c(t tVar) {
            if (v.a()) {
                e.this.f6871c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            e.this.c();
        }
    }

    /* loaded from: classes.dex */
    private class b implements AppLovinTouchToClickListener.OnClickListener, Player.EventListener, c.e {
        private b() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            e.this.a(pointF);
        }

        public void onPlaybackStateChanged(int i10) {
            if (v.a()) {
                v vVar = e.this.f6871c;
                vVar.b("AppLovinFullscreenActivity", "Player state changed to state " + i10 + " and will play when ready: " + e.this.f6923t.E());
            }
            if (i10 == 2) {
                e.this.v();
                e.this.f6872d.g();
            } else if (i10 != 3) {
                if (i10 == 4) {
                    if (v.a()) {
                        e.this.f6871c.b("AppLovinFullscreenActivity", "Video completed");
                    }
                    e eVar = e.this;
                    eVar.E = true;
                    eVar.y();
                }
            } else {
                e eVar2 = e.this;
                eVar2.f6923t.setVolume(!eVar2.A ? 1 : 0);
                e eVar3 = e.this;
                eVar3.c(eVar3.f6923t.getDuration());
                e.this.u();
                if (v.a()) {
                    v vVar2 = e.this.f6871c;
                    vVar2.b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + e.this.f6923t);
                }
                e.this.f6929z.a();
                e eVar4 = e.this;
                if (eVar4.f6925v != null) {
                    eVar4.A();
                }
                e.this.w();
                if (e.this.f6885q.c()) {
                    e.this.e();
                }
            }
        }

        public void onPlayerError(m2 m2Var) {
            e eVar = e.this;
            eVar.c("Video view error (" + m2Var + ")");
            e.this.h();
        }

        @Override // com.google.android.exoplayer2.ui.c.e
        public void onVisibilityChange(int i10) {
            if (i10 == 0) {
                e.this.f6922s.u();
            }
        }
    }

    /* loaded from: classes.dex */
    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = e.this;
            if (view == eVar.f6925v) {
                if (!eVar.s()) {
                    e.this.c();
                    return;
                }
                e.this.e();
                e.this.p();
                e.this.f6885q.b();
            } else if (view == eVar.f6926w) {
                eVar.x();
            } else if (v.a()) {
                v vVar = e.this.f6871c;
                vVar.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public e(com.applovin.impl.sdk.ad.e eVar, Activity activity, com.applovin.impl.sdk.m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.F = new com.applovin.impl.adview.activity.a.c(this.f6869a, this.f6873e, this.f6870b);
        a aVar = new a();
        this.G = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.H = handler;
        j jVar = new j(handler, this.f6870b);
        this.f6929z = jVar;
        boolean f10 = this.f6869a.f();
        this.I = f10;
        this.A = Utils.isVideoMutedInitially(this.f6870b);
        this.J = -1L;
        this.K = new AtomicBoolean();
        this.L = new AtomicBoolean();
        this.M = -2L;
        this.N = 0L;
        if (!eVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        c cVar = new c();
        if (eVar.q() >= 0) {
            m mVar2 = new m(eVar.w(), activity);
            this.f6925v = mVar2;
            mVar2.setVisibility(8);
            mVar2.setOnClickListener(cVar);
        } else {
            this.f6925v = null;
        }
        if (a(this.A, mVar)) {
            ImageView imageView = new ImageView(activity);
            this.f6926w = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(cVar);
            d(this.A);
        } else {
            this.f6926w = null;
        }
        String B = eVar.B();
        if (StringUtils.isValidString(B)) {
            u uVar = new u(mVar);
            uVar.a(new WeakReference<>(aVar));
            t tVar = new t(uVar, activity);
            this.f6927x = tVar;
            tVar.a(B);
        } else {
            this.f6927x = null;
        }
        if (f10) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cB)).intValue(), 16842874);
            this.f6924u = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.f6924u = null;
        }
        if (eVar.O()) {
            ProgressBar progressBar = new ProgressBar(activity, null, 16842872);
            this.f6928y = progressBar;
            progressBar.setMax(10000);
            progressBar.setPadding(0, 0, 0, 0);
            if (com.applovin.impl.sdk.utils.g.d()) {
                progressBar.setProgressTintList(ColorStateList.valueOf(eVar.P()));
            }
            jVar.a("PROGRESS_BAR", ((Long) mVar.a(com.applovin.impl.sdk.c.b.cy)).longValue(), new j.a() { // from class: com.applovin.impl.adview.activity.b.e.1
                @Override // com.applovin.impl.adview.j.a
                public void a() {
                    e eVar2 = e.this;
                    if (eVar2.D) {
                        eVar2.f6928y.setVisibility(8);
                        return;
                    }
                    e eVar3 = e.this;
                    eVar3.f6928y.setProgress((int) ((((float) eVar2.f6923t.getCurrentPosition()) / ((float) eVar3.B)) * 10000.0f));
                }

                @Override // com.applovin.impl.adview.j.a
                public boolean b() {
                    return !e.this.D;
                }
            });
        } else {
            this.f6928y = null;
        }
        c3 a10 = new c3.a(activity).a();
        this.f6923t = a10;
        b bVar = new b();
        a10.addListener(bVar);
        a10.U(0);
        com.google.android.exoplayer2.ui.d dVar = new com.google.android.exoplayer2.ui.d(activity);
        this.f6922s = dVar;
        dVar.u();
        dVar.setControllerVisibilityListener(bVar);
        dVar.setPlayer(a10);
        dVar.setOnTouchListener(new AppLovinTouchToClickListener(mVar, com.applovin.impl.sdk.c.b.aM, activity, bVar));
        z();
    }

    private void E() {
        t tVar;
        s C = this.f6869a.C();
        if (C == null || !C.e() || this.D || (tVar = this.f6927x) == null) {
            return;
        }
        final boolean z10 = tVar.getVisibility() == 4;
        final long f10 = C.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.5
            @Override // java.lang.Runnable
            public void run() {
                if (z10) {
                    q.a(e.this.f6927x, f10, (Runnable) null);
                } else {
                    q.b(e.this.f6927x, f10, null);
                }
            }
        });
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

    protected void A() {
        if (this.L.compareAndSet(false, true)) {
            a(this.f6925v, this.f6869a.q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.4
                @Override // java.lang.Runnable
                public void run() {
                    e.this.M = -1L;
                    e.this.N = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    protected void B() {
        this.C = D();
        this.f6923t.m(false);
    }

    protected void C() {
        if (this.D) {
            if (v.a()) {
                this.f6871c.d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f6870b.ad().a()) {
            if (v.a()) {
                this.f6871c.d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else {
            long j10 = this.J;
            if (j10 < 0) {
                if (v.a()) {
                    v vVar = this.f6871c;
                    vVar.b("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.f6923t.isPlaying());
                    return;
                }
                return;
            }
            if (v.a()) {
                v vVar2 = this.f6871c;
                vVar2.b("AppLovinFullscreenActivity", "Resuming video at position " + j10 + "ms for MediaPlayer: " + this.f6923t);
            }
            this.f6923t.m(true);
            this.f6929z.a();
            this.J = -1L;
            if (this.f6923t.isPlaying()) {
                return;
            }
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int D() {
        c3 c3Var = this.f6923t;
        if (c3Var == null) {
            return 0;
        }
        long currentPosition = c3Var.getCurrentPosition();
        if (this.E) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.B)) * 100.0f) : this.C;
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.6
            @Override // java.lang.Runnable
            public void run() {
                e.this.C();
            }
        }, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(PointF pointF) {
        if (!this.f6869a.D()) {
            E();
            return;
        }
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Clicking through video");
        }
        Uri k10 = this.f6869a.k();
        if (k10 != null) {
            AppLovinAdView appLovinAdView = this.f6874f;
            this.f6870b.u().trackAndLaunchVideoClick(this.f6869a, k10, pointF, this, appLovinAdView != null ? appLovinAdView.getContext() : this.f6870b.L());
            com.applovin.impl.sdk.utils.j.a(this.f6882n, this.f6869a);
            this.f6872d.b();
            this.f6879k++;
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.F.a(this.f6926w, this.f6925v, this.f6927x, this.f6924u, this.f6928y, this.f6922s, this.f6874f, viewGroup);
        this.f6923t.m(true);
        if (this.f6869a.am()) {
            this.f6885q.a(this.f6869a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a(250L);
                }
            });
        }
        if (this.I) {
            v();
        }
        this.f6874f.renderAd(this.f6869a);
        this.f6872d.b(this.I ? 1L : 0L);
        if (this.f6925v != null) {
            this.f6870b.S().a(new z(this.f6870b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e.this.A();
                }
            }), o.a.MAIN, this.f6869a.r(), true);
        }
        super.b(this.A);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        c();
    }

    public void c() {
        this.M = SystemClock.elapsedRealtime() - this.N;
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.M + "ms");
        }
        this.f6872d.f();
        this.f6878j++;
        if (this.f6869a.x()) {
            h();
        } else {
            y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(long j10) {
        this.B = j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str) {
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f6869a);
        }
        if (this.K.compareAndSet(false, true)) {
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f6883o;
            if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.g) {
                ((com.applovin.impl.sdk.ad.g) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            h();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void c(boolean z10) {
        super.c(z10);
        if (z10) {
            a(0L);
        } else if (this.D) {
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    protected void d(boolean z10) {
        if (com.applovin.impl.sdk.utils.g.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f6873e.getDrawable(z10 ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f6926w.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f6926w.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z10 ? this.f6869a.aC() : this.f6869a.aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f6926w.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
        v vVar;
        String str;
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.f6923t.isPlaying()) {
            this.J = this.f6923t.getCurrentPosition();
            this.f6923t.m(false);
            this.f6929z.c();
            if (!v.a()) {
                return;
            }
            vVar = this.f6871c;
            str = "Paused video at position " + this.J + "ms";
        } else if (!v.a()) {
            return;
        } else {
            vVar = this.f6871c;
            str = "Nothing to pause";
        }
        vVar.b("AppLovinFullscreenActivity", str);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        this.f6929z.b();
        this.H.removeCallbacksAndMessages(null);
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void k() {
        this.f6923t.release();
        if (this.I) {
            AppLovinCommunicator.getInstance(this.f6873e).unsubscribe(this, "video_caching_failed");
        }
        super.k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void m() {
        super.a(D(), this.I, r(), this.M);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j10 = messageData.getLong("ad_id");
            if (((Boolean) this.f6870b.a(com.applovin.impl.sdk.c.b.eM)).booleanValue() && j10 == this.f6869a.getAdIdNumber() && this.I) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i10 >= 200 && i10 < 300) || this.E || this.f6923t.isPlaying()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        return this.f6869a != null && D() >= this.f6869a.Q();
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
                long j10 = this.B;
                long j11 = j10 > 0 ? 0 + j10 : 0L;
                if (aVar.af() && ((l10 = (int) ((com.applovin.impl.sdk.ad.a) this.f6869a).l()) > 0 || (l10 = (int) aVar.s()) > 0)) {
                    j11 += TimeUnit.SECONDS.toMillis(l10);
                }
                ae2 = (long) (j11 * (this.f6869a.ae() / 100.0d));
            }
            b(ae2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.7
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = e.this.f6924u;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.8
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = e.this.f6924u;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x() {
        boolean z10 = !this.A ? 1 : 0;
        this.A = z10;
        this.f6923t.setVolume(!z10 ? 1 : 0);
        d(this.A);
        a(this.A, 0L);
    }

    public void y() {
        B();
        this.F.a(this.f6875g, this.f6874f);
        a("javascript:al_onPoststitialShow(" + this.f6878j + "," + this.f6879k + ");", this.f6869a.S());
        if (this.f6875g != null) {
            int i10 = (this.f6869a.s() > 0L ? 1 : (this.f6869a.s() == 0L ? 0 : -1));
            m mVar = this.f6875g;
            if (i10 >= 0) {
                a(mVar, this.f6869a.s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.9
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.f6877i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                mVar.setVisibility(0);
            }
        }
        this.D = true;
    }

    protected void z() {
        a(!this.I);
        Activity activity = this.f6873e;
        j0 b10 = new j0.b(new da.u(activity, n0.o0(activity, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).b(x1.d(this.f6869a.h()));
        this.f6923t.setVolume(!this.A ? 1 : 0);
        this.f6923t.q0(b10);
        this.f6923t.a();
        this.f6923t.m(false);
    }
}
