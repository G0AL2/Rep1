package com.bytedance.sdk.openadsdk.core.e;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.d.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.c;

/* compiled from: LandingPageModel.java */
/* loaded from: classes.dex */
public class l {
    private LinearLayout A;
    private View B;
    private ImageView C;
    private View D;
    private long E;
    private Activity G;
    private String H;
    private r3.c I;
    private com.bytedance.sdk.openadsdk.b.n J;

    /* renamed from: a  reason: collision with root package name */
    ImageView f12120a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f12121b;

    /* renamed from: c  reason: collision with root package name */
    TextView f12122c;

    /* renamed from: d  reason: collision with root package name */
    FrameLayout f12123d;

    /* renamed from: e  reason: collision with root package name */
    TextView f12124e;

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f12125f;

    /* renamed from: g  reason: collision with root package name */
    n f12126g;

    /* renamed from: h  reason: collision with root package name */
    FrameLayout f12127h;

    /* renamed from: i  reason: collision with root package name */
    ObjectAnimator f12128i;

    /* renamed from: j  reason: collision with root package name */
    ObjectAnimator f12129j;

    /* renamed from: k  reason: collision with root package name */
    ObjectAnimator f12130k;

    /* renamed from: l  reason: collision with root package name */
    ObjectAnimator f12131l;

    /* renamed from: m  reason: collision with root package name */
    ObjectAnimator f12132m;

    /* renamed from: n  reason: collision with root package name */
    c.a f12133n;

    /* renamed from: o  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.b.a f12134o;

    /* renamed from: p  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.b.b f12135p;

    /* renamed from: q  reason: collision with root package name */
    private View f12136q;

    /* renamed from: r  reason: collision with root package name */
    private View f12137r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f12138s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f12139t;

    /* renamed from: u  reason: collision with root package name */
    private TTRoundRectImageView f12140u;

    /* renamed from: v  reason: collision with root package name */
    private TextView f12141v;

    /* renamed from: w  reason: collision with root package name */
    private w f12142w;

    /* renamed from: x  reason: collision with root package name */
    private SSWebView f12143x;

    /* renamed from: y  reason: collision with root package name */
    private FrameLayout f12144y;

    /* renamed from: z  reason: collision with root package name */
    private AnimatorSet f12145z;
    private AtomicBoolean F = new AtomicBoolean(false);
    private AtomicBoolean K = new AtomicBoolean(false);
    private boolean L = false;

    public l(Activity activity, n nVar, String str, FrameLayout frameLayout) {
        this.G = activity;
        this.f12126g = nVar;
        this.H = str;
        if (b(nVar)) {
            this.H = "landingpage_split_screen";
        } else if (c(nVar)) {
            this.H = "landingpage_direct";
        }
        this.f12134o = new com.bytedance.sdk.openadsdk.core.b.a(com.bytedance.sdk.openadsdk.core.m.a(), this.f12126g, this.H, u.a(str));
        this.f12135p = new com.bytedance.sdk.openadsdk.core.b.b(com.bytedance.sdk.openadsdk.core.m.a(), this.f12126g, this.H, u.a(str), true);
        this.f12127h = frameLayout;
        try {
            if (c(this.f12126g)) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "timeDown", 0, (int) (this.f12126g.a().b() * 1000));
                this.f12130k = ofInt;
                ofInt.setDuration(this.f12126g.a().b() * 1000);
                this.f12130k.setInterpolator(new LinearInterpolator());
                this.f12130k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.e.l.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        l lVar = l.this;
                        if (lVar.f12133n == null || lVar.f12126g.a() == null) {
                            return;
                        }
                        l.this.f12133n.a(((Integer) valueAnimator.getAnimatedValue()).longValue(), l.this.f12126g.a().b() * 1000);
                    }
                });
                this.f12130k.start();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.F.get()) {
            return;
        }
        n();
        this.K.set(true);
        Activity activity = this.G;
        if (activity instanceof com.bytedance.sdk.openadsdk.core.video.c.c) {
            ((com.bytedance.sdk.openadsdk.core.video.c.c) activity).k();
        }
        this.f12136q.setVisibility(8);
        this.f12137r.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12137r.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.addRule(10, 0);
        this.f12137r.setLayoutParams(layoutParams);
        if (this.f12126g.M() != null && !TextUtils.isEmpty(this.f12126g.M().a())) {
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f12126g.M().a(), this.f12140u);
        }
        this.f12138s.setText(this.f12126g.K());
        this.f12139t.setText(this.f12126g.V());
        if (this.f12141v != null) {
            b();
            this.f12141v.setClickable(true);
            this.f12141v.setOnClickListener(this.f12134o);
            this.f12141v.setOnTouchListener(this.f12134o);
        }
    }

    private void n() {
        if (c(this.f12126g)) {
            Activity activity = this.G;
            if (activity instanceof com.bytedance.sdk.openadsdk.core.video.c.c) {
                ((com.bytedance.sdk.openadsdk.core.video.c.c) activity).f();
                ((com.bytedance.sdk.openadsdk.core.video.c.c) this.G).e();
            }
        }
    }

    private void o() {
        if (c()) {
            this.B.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.C, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.f12128i = duration;
            duration.setRepeatMode(2);
            this.f12128i.setRepeatCount(-1);
            this.f12128i.start();
            this.B.setClickable(true);
            this.B.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.e.l.9
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!l.this.L) {
                        l.this.f12135p.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                        l.this.f12131l = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                        l.this.f12131l.setDuration(200L);
                        l.this.f12131l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.e.l.9.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) l.this.f12144y.getLayoutParams();
                                layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                                l.this.a((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                                l.this.f12144y.setLayoutParams(layoutParams);
                            }
                        });
                        l.this.B.performClick();
                        l.this.L = true;
                        l.this.f12131l.start();
                        l.this.B.setVisibility(8);
                        return true;
                    }
                    return false;
                }
            });
            this.B.setOnClickListener(this.f12135p);
        }
        if (!p()) {
            this.f12127h.setVisibility(8);
            this.f12121b.setVisibility(0);
            this.f12120a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f12120a.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.e.l.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Context a10 = com.bytedance.sdk.openadsdk.core.m.a();
                    l lVar = l.this;
                    com.bytedance.sdk.openadsdk.b.e.b(a10, lVar.f12126g, lVar.H);
                }
            });
            n nVar = this.f12126g;
            if (nVar != null && nVar.P() != null && this.f12126g.P().size() > 0 && this.f12126g.P().get(0) != null && !TextUtils.isEmpty(this.f12126g.P().get(0).a())) {
                com.bytedance.sdk.openadsdk.i.d.a().a(this.f12126g.P().get(0), this.f12120a);
            }
        }
        try {
            com.bytedance.sdk.openadsdk.d.a.a().a(this.f12126g.P().get(0).a()).a(t.BITMAP).a(new com.bytedance.sdk.component.d.n<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.e.l.2
                @Override // com.bytedance.sdk.component.d.n
                public void a(int i10, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.d.n
                public void a(com.bytedance.sdk.component.d.j<Bitmap> jVar) {
                    Bitmap a10;
                    try {
                        Bitmap b10 = jVar.b();
                        if (Build.VERSION.SDK_INT < 17 || (a10 = com.bytedance.sdk.component.adexpress.c.a.a(com.bytedance.sdk.openadsdk.core.m.a(), b10, 25)) == null) {
                            return;
                        }
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.m.a().getResources(), a10);
                        if (!l.this.p()) {
                            l.this.f12121b.setBackground(bitmapDrawable);
                            return;
                        }
                        l.this.f12123d.setBackground(bitmapDrawable);
                        View m10 = l.this.G instanceof com.bytedance.sdk.openadsdk.core.video.c.c ? ((com.bytedance.sdk.openadsdk.core.video.c.c) l.this.G).m() : null;
                        if (m10 == null || !(m10.getParent() instanceof View)) {
                            return;
                        }
                        ((View) m10.getParent()).setBackground(bitmapDrawable);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return n.c(this.f12126g);
    }

    private void q() {
        this.f12145z = new AnimatorSet();
        LinearLayout linearLayout = this.A;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", -9.0f, 9.0f).setDuration(300L);
            this.f12129j = duration;
            duration.setRepeatMode(2);
            this.f12129j.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f12145z.play(this.f12129j);
            for (int i10 = 1; i10 < this.A.getChildCount(); i10++) {
                float f10 = i10 % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.A.getChildAt(i10), "translationY", -f10, f10).setDuration(300L);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f12145z.start();
        }
    }

    public static boolean d(n nVar) {
        return (nVar == null || !com.bytedance.sdk.openadsdk.core.m.h().g() || !nVar.E() || b(nVar) || c(nVar)) ? false : true;
    }

    private void i() {
        SSWebView sSWebView = this.f12143x;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.a.b.a(com.bytedance.sdk.openadsdk.core.m.a()).a(false).b(false).a(this.f12143x.getWebView());
            SSWebView sSWebView2 = this.f12143x;
            if (sSWebView2 != null && sSWebView2.getWebView() != null) {
                com.bytedance.sdk.openadsdk.b.n a10 = new com.bytedance.sdk.openadsdk.b.n(com.bytedance.sdk.openadsdk.core.m.a(), this.f12126g, this.f12143x.getWebView()).a(true);
                this.J = a10;
                a10.a(this.H);
            }
            j();
            this.f12143x.setLandingPage(true);
            this.f12143x.setTag(this.H);
            this.f12143x.setMaterialMeta(this.f12126g.aC());
            this.f12143x.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(com.bytedance.sdk.openadsdk.core.m.a(), this.f12142w, this.f12126g.Y(), this.J, true) { // from class: com.bytedance.sdk.openadsdk.core.e.l.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    l.this.k();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (l.this.G instanceof com.bytedance.sdk.openadsdk.core.video.c.c) {
                        ((com.bytedance.sdk.openadsdk.core.video.c.c) l.this.G).f();
                    }
                    l.this.E = System.currentTimeMillis();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i10, String str, String str2) {
                    super.onReceivedError(webView, i10, str, str2);
                    String b10 = com.bytedance.sdk.openadsdk.core.widget.a.d.b(str2);
                    com.bytedance.sdk.openadsdk.b.n nVar = this.f13117f;
                    if (nVar != null) {
                        nVar.a(webView, i10, str, str2, com.bytedance.sdk.openadsdk.core.widget.a.d.b(str2));
                    }
                    boolean z10 = true;
                    boolean z11 = b10 != null && b10.startsWith("image");
                    z10 = (b10 == null || !b10.startsWith("mp4")) ? false : false;
                    if (z11 || z10 || l.this.F.get()) {
                        return;
                    }
                    l.this.m();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        l.this.m();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }
            });
            this.f12143x.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.f12142w, this.J) { // from class: com.bytedance.sdk.openadsdk.core.e.l.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.a.c, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (l.this.G == null || l.this.G.isFinishing() || i10 != 100) {
                        return;
                    }
                    l.this.k();
                }
            });
            if (this.I == null) {
                this.I = r3.d.a(com.bytedance.sdk.openadsdk.core.m.a(), this.f12126g, this.H);
            }
            this.f12143x.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.e.l.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                    if (l.this.I != null) {
                        l.this.I.d();
                    }
                }
            });
            SSWebView sSWebView3 = this.f12143x;
            if (sSWebView3 != null) {
                sSWebView3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.i.a(sSWebView3.getWebView(), (int) BuildConfig.VERSION_CODE));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f12143x.setMixedContentMode(0);
            }
            this.f12143x.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.e.l.7
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!l.this.L) {
                        l.this.f12135p.onTouch(view, motionEvent);
                    }
                    if (l.this.L || motionEvent.getAction() != 1) {
                        return false;
                    }
                    l.this.f12143x.getWebView().performClick();
                    l.this.L = true;
                    return false;
                }
            });
            this.f12143x.getWebView().setOnClickListener(this.f12135p);
            com.bytedance.sdk.openadsdk.b.e.a(com.bytedance.sdk.openadsdk.core.m.a(), this.f12126g, this.H);
            com.bytedance.sdk.openadsdk.utils.j.a(this.f12143x, this.f12126g.O());
        }
        if (this.f12143x != null) {
            q();
        }
    }

    private void j() {
        w wVar = new w(com.bytedance.sdk.openadsdk.core.m.a());
        this.f12142w = wVar;
        wVar.b(this.f12143x).d(this.f12126g.Y()).e(this.f12126g.ac()).a(this.f12126g).b(-1).a(this.f12126g.F()).c(this.H).f(u.i(this.f12126g)).a(this.f12143x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.F.get() || this.K.get()) {
            return;
        }
        this.F.set(true);
        com.bytedance.sdk.openadsdk.b.e.a(com.bytedance.sdk.openadsdk.core.m.a(), this.f12126g, this.H, System.currentTimeMillis() - this.E, true);
        l();
    }

    private void l() {
        this.f12125f.setVisibility(8);
        if (c(this.f12126g) || !c()) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.f12132m = ofFloat;
        ofFloat.setDuration(100L);
        this.f12132m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.e.l.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) l.this.f12144y.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                l.this.a((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                l.this.f12144y.setLayoutParams(layoutParams);
            }
        });
        this.f12132m.start();
    }

    protected void b() {
        n nVar = this.f12126g;
        if (nVar == null || TextUtils.isEmpty(nVar.W())) {
            return;
        }
        this.f12141v.setText(this.f12126g.W());
    }

    public boolean c() {
        return this.f12126g.ad() == 15 || this.f12126g.ad() == 16;
    }

    public void e() {
        SSWebView sSWebView;
        com.bytedance.sdk.openadsdk.b.n nVar = this.J;
        if (nVar != null && (sSWebView = this.f12143x) != null) {
            nVar.a(sSWebView);
        }
        ObjectAnimator objectAnimator = this.f12130k;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f12130k.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f12131l;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f12131l.cancel();
        }
        ObjectAnimator objectAnimator3 = this.f12132m;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllUpdateListeners();
            this.f12132m.cancel();
        }
        AnimatorSet animatorSet = this.f12145z;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator4 = this.f12129j;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        ObjectAnimator objectAnimator5 = this.f12128i;
        if (objectAnimator5 != null) {
            objectAnimator5.cancel();
        }
        if (this.f12143x != null) {
            z.a(com.bytedance.sdk.openadsdk.core.m.a(), this.f12143x.getWebView());
            z.a(this.f12143x.getWebView());
        }
        this.f12143x = null;
        w wVar = this.f12142w;
        if (wVar != null) {
            wVar.n();
        }
        com.bytedance.sdk.openadsdk.b.n nVar2 = this.J;
        if (nVar2 != null) {
            nVar2.f();
        }
    }

    public void f() {
        w wVar = this.f12142w;
        if (wVar != null) {
            wVar.l();
        }
        com.bytedance.sdk.openadsdk.b.n nVar = this.J;
        if (nVar != null) {
            nVar.d();
        }
    }

    public void g() {
        com.bytedance.sdk.openadsdk.b.n nVar = this.J;
        if (nVar != null) {
            nVar.e();
        }
    }

    public void h() {
        com.bytedance.sdk.openadsdk.core.t.a().b(true);
        w wVar = this.f12142w;
        if (wVar != null) {
            wVar.m();
        }
    }

    public static boolean b(n nVar) {
        return nVar.L() == 3 && nVar.f() == 6 && !p.a(nVar) && nVar.am() == 1 && (nVar.an() == 0.0f || nVar.an() == 100.0f);
    }

    public static boolean c(n nVar) {
        if (nVar != null && nVar.L() == 3 && nVar.f() == 5 && !p.a(nVar)) {
            return nVar.an() == 0.0f || nVar.an() == 100.0f;
        }
        return false;
    }

    public void a(c.a aVar) {
        this.f12133n = aVar;
    }

    public void d() {
        FrameLayout frameLayout = this.f12144y;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            this.D.setVisibility(0);
        }
    }

    public void a() {
        Activity activity = this.G;
        SSWebView sSWebView = (SSWebView) activity.findViewById(com.bytedance.sdk.component.utils.t.e(activity, "tt_reward_browser_webview_loading"));
        this.f12143x = sSWebView;
        if (sSWebView != null && !n.a(this.f12126g)) {
            this.f12143x.a();
        } else {
            v.a((View) this.f12143x, 8);
        }
        Activity activity2 = this.G;
        this.f12144y = (FrameLayout) activity2.findViewById(com.bytedance.sdk.component.utils.t.e(activity2, "tt_reward_loading_container"));
        Activity activity3 = this.G;
        this.A = (LinearLayout) activity3.findViewById(com.bytedance.sdk.component.utils.t.e(activity3, "wave_container"));
        Activity activity4 = this.G;
        this.B = activity4.findViewById(com.bytedance.sdk.component.utils.t.e(activity4, "tt_up_slide"));
        Activity activity5 = this.G;
        this.C = (ImageView) activity5.findViewById(com.bytedance.sdk.component.utils.t.e(activity5, "tt_up_slide_image"));
        Activity activity6 = this.G;
        this.D = activity6.findViewById(com.bytedance.sdk.component.utils.t.e(activity6, "tt_video_container_root"));
        Activity activity7 = this.G;
        this.f12121b = (FrameLayout) activity7.findViewById(com.bytedance.sdk.component.utils.t.e(activity7, "tt_image_reward_container"));
        Activity activity8 = this.G;
        this.f12120a = (ImageView) activity8.findViewById(com.bytedance.sdk.component.utils.t.e(activity8, "tt_image_reward"));
        Activity activity9 = this.G;
        this.f12125f = (RelativeLayout) activity9.findViewById(com.bytedance.sdk.component.utils.t.e(activity9, "tt_browser_webview_page_loading"));
        Activity activity10 = this.G;
        this.f12122c = (TextView) activity10.findViewById(com.bytedance.sdk.component.utils.t.e(activity10, "tt_loading_tip"));
        Activity activity11 = this.G;
        this.f12123d = (FrameLayout) activity11.findViewById(com.bytedance.sdk.component.utils.t.e(activity11, "tt_video_container_back"));
        Activity activity12 = this.G;
        this.f12137r = activity12.findViewById(com.bytedance.sdk.component.utils.t.e(activity12, "tt_back_container"));
        Activity activity13 = this.G;
        this.f12136q = activity13.findViewById(com.bytedance.sdk.component.utils.t.e(activity13, "tt_loading_container"));
        Activity activity14 = this.G;
        this.f12138s = (TextView) activity14.findViewById(com.bytedance.sdk.component.utils.t.e(activity14, "tt_back_container_title"));
        Activity activity15 = this.G;
        this.f12139t = (TextView) activity15.findViewById(com.bytedance.sdk.component.utils.t.e(activity15, "tt_back_container_des"));
        Activity activity16 = this.G;
        this.f12140u = (TTRoundRectImageView) activity16.findViewById(com.bytedance.sdk.component.utils.t.e(activity16, "tt_back_container_icon"));
        Activity activity17 = this.G;
        this.f12141v = (TextView) activity17.findViewById(com.bytedance.sdk.component.utils.t.e(activity17, "tt_back_container_download"));
        if (this.f12122c != null && this.f12126g.a() != null) {
            this.f12122c.setText(this.f12126g.a().c());
        }
        Activity activity18 = this.G;
        this.f12124e = (TextView) activity18.findViewById(com.bytedance.sdk.component.utils.t.e(activity18, "tt_ad_loading_logo"));
        if ((c(this.f12126g) || b(this.f12126g)) && this.f12126g.a() != null) {
            TextView textView = this.f12124e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.bytedance.sdk.openadsdk.core.k.d().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.e.l.3
                @Override // java.lang.Runnable
                public void run() {
                    if (l.this.F.get()) {
                        return;
                    }
                    Context a10 = com.bytedance.sdk.openadsdk.core.m.a();
                    l lVar = l.this;
                    com.bytedance.sdk.openadsdk.b.e.a(a10, lVar.f12126g, lVar.H, System.currentTimeMillis() - l.this.E, false);
                    l.this.m();
                }
            }, this.f12126g.a().a() * 1000);
        }
        i();
        if (b(this.f12126g)) {
            o();
            if (!c()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12144y.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.f12144y.setLayoutParams(layoutParams);
            }
        }
        if (c(this.f12126g)) {
            this.D.setVisibility(8);
        }
    }

    public static boolean a(n nVar) {
        if (nVar == null) {
            return false;
        }
        return c(nVar) || b(nVar);
    }

    public void a(float f10) {
        try {
            ((com.bytedance.sdk.openadsdk.core.video.c.c) this.G).l();
        } catch (Throwable unused) {
        }
    }
}
