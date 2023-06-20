package com.applovin.impl.adview.activity.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
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
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class f extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    protected long A;
    protected boolean B;
    private final com.applovin.impl.adview.activity.a.c C;
    private MediaPlayer D;
    private final b E;
    private final a F;
    private final Handler G;
    private final boolean H;
    private int I;
    private int J;
    private boolean K;
    private final AtomicBoolean L;
    private final AtomicBoolean M;
    private long N;
    private long O;

    /* renamed from: s  reason: collision with root package name */
    protected final AppLovinVideoView f6944s;

    /* renamed from: t  reason: collision with root package name */
    protected final com.applovin.impl.adview.a f6945t;

    /* renamed from: u  reason: collision with root package name */
    protected final m f6946u;

    /* renamed from: v  reason: collision with root package name */
    protected final ImageView f6947v;

    /* renamed from: w  reason: collision with root package name */
    protected final t f6948w;

    /* renamed from: x  reason: collision with root package name */
    protected final ProgressBar f6949x;

    /* renamed from: y  reason: collision with root package name */
    protected final j f6950y;

    /* renamed from: z  reason: collision with root package name */
    protected boolean f6951z;

    /* loaded from: classes.dex */
    private class a implements u.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.u.a
        public void a(t tVar) {
            if (v.a()) {
                f.this.f6871c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            f.this.a(tVar.getAndClearLastClickLocation());
        }

        @Override // com.applovin.impl.adview.u.a
        public void b(t tVar) {
            if (v.a()) {
                f.this.f6871c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            f.this.h();
        }

        @Override // com.applovin.impl.adview.u.a
        public void c(t tVar) {
            if (v.a()) {
                f.this.f6871c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            f.this.c();
        }
    }

    /* loaded from: classes.dex */
    private class b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            f.this.a(pointF);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (v.a()) {
                f.this.f6871c.b("AppLovinFullscreenActivity", "Video completed");
            }
            f.this.K = true;
            f.this.y();
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            f fVar = f.this;
            fVar.c("Video view error (" + i10 + "," + i11 + ")");
            f.this.f6944s.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            if (v.a()) {
                v vVar = f.this.f6871c;
                vVar.b("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i10 + ", " + i11 + ")");
            }
            if (i10 == 701) {
                f.this.v();
                f.this.f6872d.g();
                return false;
            } else if (i10 != 3) {
                if (i10 == 702) {
                    f.this.w();
                    return false;
                }
                return false;
            } else {
                f.this.f6950y.a();
                f fVar = f.this;
                if (fVar.f6946u != null) {
                    fVar.A();
                }
                f.this.w();
                if (f.this.f6885q.c()) {
                    f.this.e();
                    return false;
                }
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            f.this.D = mediaPlayer;
            mediaPlayer.setOnInfoListener(f.this.E);
            mediaPlayer.setOnErrorListener(f.this.E);
            float f10 = !f.this.f6951z ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            f.this.c(mediaPlayer.getDuration());
            f.this.u();
            if (v.a()) {
                f.this.f6871c.b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + f.this.D);
            }
        }
    }

    /* loaded from: classes.dex */
    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f fVar = f.this;
            if (view == fVar.f6946u) {
                if (!fVar.s()) {
                    f.this.c();
                    return;
                }
                f.this.e();
                f.this.p();
                f.this.f6885q.b();
            } else if (view == fVar.f6947v) {
                fVar.x();
            } else if (v.a()) {
                v vVar = f.this.f6871c;
                vVar.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public f(com.applovin.impl.sdk.ad.e eVar, Activity activity, com.applovin.impl.sdk.m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.C = new com.applovin.impl.adview.activity.a.c(this.f6869a, this.f6873e, this.f6870b);
        b bVar = new b();
        this.E = bVar;
        a aVar = new a();
        this.F = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.G = handler;
        j jVar = new j(handler, this.f6870b);
        this.f6950y = jVar;
        boolean f10 = this.f6869a.f();
        this.H = f10;
        this.f6951z = Utils.isVideoMutedInitially(this.f6870b);
        this.J = -1;
        this.L = new AtomicBoolean();
        this.M = new AtomicBoolean();
        this.N = -2L;
        this.O = 0L;
        if (!eVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.f6944s = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(bVar);
        appLovinVideoView.setOnCompletionListener(bVar);
        appLovinVideoView.setOnErrorListener(bVar);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(mVar, com.applovin.impl.sdk.c.b.aM, activity, bVar));
        c cVar = new c();
        if (eVar.q() >= 0) {
            m mVar2 = new m(eVar.w(), activity);
            this.f6946u = mVar2;
            mVar2.setVisibility(8);
            mVar2.setOnClickListener(cVar);
        } else {
            this.f6946u = null;
        }
        if (a(this.f6951z, mVar)) {
            ImageView imageView = new ImageView(activity);
            this.f6947v = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(cVar);
            e(this.f6951z);
        } else {
            this.f6947v = null;
        }
        String B = eVar.B();
        if (StringUtils.isValidString(B)) {
            u uVar = new u(mVar);
            uVar.a(new WeakReference<>(aVar));
            t tVar = new t(uVar, activity);
            this.f6948w = tVar;
            tVar.a(B);
        } else {
            this.f6948w = null;
        }
        if (f10) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cB)).intValue(), 16842874);
            this.f6945t = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.f6945t = null;
        }
        if (!eVar.O()) {
            this.f6949x = null;
            return;
        }
        ProgressBar progressBar = new ProgressBar(activity, null, 16842872);
        this.f6949x = progressBar;
        progressBar.setMax(10000);
        progressBar.setPadding(0, 0, 0, 0);
        if (com.applovin.impl.sdk.utils.g.d()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(eVar.P()));
        }
        jVar.a("PROGRESS_BAR", ((Long) mVar.a(com.applovin.impl.sdk.c.b.cy)).longValue(), new j.a() { // from class: com.applovin.impl.adview.activity.b.f.1
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                f fVar = f.this;
                if (fVar.B) {
                    fVar.f6949x.setVisibility(8);
                    return;
                }
                f fVar2 = f.this;
                fVar2.f6949x.setProgress((int) ((fVar.f6944s.getCurrentPosition() / ((float) fVar2.A)) * 10000.0f));
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !f.this.B;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.M.compareAndSet(false, true)) {
            a(this.f6946u, this.f6869a.q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.5
                @Override // java.lang.Runnable
                public void run() {
                    f.this.N = -1L;
                    f.this.O = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    private void B() {
        t tVar;
        s C = this.f6869a.C();
        if (C == null || !C.e() || this.B || (tVar = this.f6948w) == null) {
            return;
        }
        final boolean z10 = tVar.getVisibility() == 4;
        final long f10 = C.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.6
            @Override // java.lang.Runnable
            public void run() {
                if (z10) {
                    q.a(f.this.f6948w, f10, (Runnable) null);
                } else {
                    q.b(f.this.f6948w, f10, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.B) {
            if (v.a()) {
                this.f6871c.d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f6870b.ad().a()) {
            if (v.a()) {
                this.f6871c.d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else if (this.J < 0) {
            if (v.a()) {
                this.f6871c.b("AppLovinFullscreenActivity", "Invalid last video position");
            }
        } else {
            if (v.a()) {
                v vVar = this.f6871c;
                vVar.b("AppLovinFullscreenActivity", "Resuming video at position " + this.J + "ms for MediaPlayer: " + this.D);
            }
            this.f6944s.seekTo(this.J);
            this.f6944s.start();
            this.f6950y.a();
            this.J = -1;
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8
                @Override // java.lang.Runnable
                public void run() {
                    com.applovin.impl.adview.a aVar = f.this.f6945t;
                    if (aVar != null) {
                        aVar.a();
                        f.this.a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                f.this.f6945t.b();
                            }
                        }, Constants.MIN_PROGRESS_TIME);
                    }
                }
            }, 250L);
        }
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
        this.I = z();
        if (z10) {
            this.f6944s.pause();
        } else {
            this.f6944s.stopPlayback();
        }
    }

    private void e(boolean z10) {
        if (com.applovin.impl.sdk.utils.g.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f6873e.getDrawable(z10 ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f6947v.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f6947v.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z10 ? this.f6869a.aC() : this.f6869a.aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f6947v.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.7
            @Override // java.lang.Runnable
            public void run() {
                f.this.C();
            }
        }, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(PointF pointF) {
        if (!this.f6869a.D()) {
            B();
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
        String str;
        this.C.a(this.f6947v, this.f6946u, this.f6948w, this.f6945t, this.f6949x, this.f6944s, this.f6874f, viewGroup);
        if (com.applovin.impl.sdk.utils.g.g() && (str = this.f6870b.p().getExtraParameters().get("audio_focus_request")) != null) {
            this.f6944s.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        a(!this.H);
        this.f6944s.setVideoURI(this.f6869a.h());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f6869a.am()) {
            this.f6885q.a(this.f6869a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.3
                @Override // java.lang.Runnable
                public void run() {
                    f.this.a(250L);
                }
            });
        }
        this.f6944s.start();
        if (this.H) {
            v();
        }
        this.f6874f.renderAd(this.f6869a);
        this.f6872d.b(this.H ? 1L : 0L);
        if (this.f6946u != null) {
            this.f6870b.S().a(new z(this.f6870b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.4
                @Override // java.lang.Runnable
                public void run() {
                    f.this.A();
                }
            }), o.a.MAIN, this.f6869a.r(), true);
        }
        super.b(this.f6951z);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        c();
    }

    public void c() {
        this.N = SystemClock.elapsedRealtime() - this.O;
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.N + "ms");
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
        this.A = j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str) {
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f6869a);
        }
        if (this.L.compareAndSet(false, true)) {
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
        } else if (this.B) {
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Pausing video");
        }
        this.J = this.f6944s.getCurrentPosition();
        this.f6944s.pause();
        this.f6950y.c();
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.b("AppLovinFullscreenActivity", "Paused video at position " + this.J + "ms");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        this.f6950y.b();
        this.G.removeCallbacksAndMessages(null);
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    @SuppressLint({"LongLogTag"})
    public void k() {
        if (v.a()) {
            this.f6871c.c("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.H) {
                AppLovinCommunicator.getInstance(this.f6873e).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f6944s;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.f6944s.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.D;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            Log.e("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void m() {
        super.a(z(), this.H, r(), this.N);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j10 = messageData.getLong("ad_id");
            if (((Boolean) this.f6870b.a(com.applovin.impl.sdk.c.b.eM)).booleanValue() && j10 == this.f6869a.getAdIdNumber() && this.H) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i10 >= 200 && i10 < 300) || this.K || this.f6944s.isPlaying()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        return z() >= this.f6869a.Q();
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
                long j10 = this.A;
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
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.9
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = f.this.f6945t;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.10
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = f.this.f6945t;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x() {
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = !this.f6951z ? 0 : 1;
            mediaPlayer.setVolume(f10, f10);
            boolean z10 = this.f6951z ? false : true;
            this.f6951z = z10;
            e(z10);
            a(this.f6951z, 0L);
        } catch (Throwable unused) {
        }
    }

    public void y() {
        if (v.a()) {
            this.f6871c.b("AppLovinFullscreenActivity", "Showing postitial...");
        }
        d(this.f6869a.aJ());
        this.C.a(this.f6875g, this.f6874f);
        a("javascript:al_onPoststitialShow(" + this.f6878j + "," + this.f6879k + ");", this.f6869a.S());
        if (this.f6875g != null) {
            int i10 = (this.f6869a.s() > 0L ? 1 : (this.f6869a.s() == 0L ? 0 : -1));
            m mVar = this.f6875g;
            if (i10 >= 0) {
                a(mVar, this.f6869a.s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.2
                    @Override // java.lang.Runnable
                    public void run() {
                        f.this.f6877i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                mVar.setVisibility(0);
            }
        }
        this.B = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int z() {
        long currentPosition = this.f6944s.getCurrentPosition();
        if (this.K) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.A)) * 100.0f) : this.I;
    }
}
