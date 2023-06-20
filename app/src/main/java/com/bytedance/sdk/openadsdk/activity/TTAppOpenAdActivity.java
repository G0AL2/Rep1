package com.bytedance.sdk.openadsdk.activity;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.a;
import com.bytedance.sdk.openadsdk.component.g.b;
import com.bytedance.sdk.openadsdk.component.view.ButtonFlash;
import com.bytedance.sdk.openadsdk.component.view.a;
import com.bytedance.sdk.openadsdk.core.b.b;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.p;
import com.bytedance.sdk.openadsdk.utils.g;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTAppOpenAdActivity extends Activity implements x.a {
    private static TTAppOpenAd.AppOpenAdInteractionListener F;
    private int A;
    private String B;
    private n C;
    private IListenerManager D;
    private TTAppOpenAd.AppOpenAdInteractionListener E;
    private int G;

    /* renamed from: a  reason: collision with root package name */
    TTAdDislikeDialog f10646a;

    /* renamed from: b  reason: collision with root package name */
    TTAdDislikeToast f10647b;

    /* renamed from: i  reason: collision with root package name */
    private RelativeLayout f10654i;

    /* renamed from: j  reason: collision with root package name */
    private FrameLayout f10655j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f10656k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f10657l;

    /* renamed from: m  reason: collision with root package name */
    private ButtonFlash f10658m;

    /* renamed from: o  reason: collision with root package name */
    private ValueAnimator f10660o;

    /* renamed from: p  reason: collision with root package name */
    private b f10661p;

    /* renamed from: q  reason: collision with root package name */
    private long f10662q;

    /* renamed from: r  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.a.b f10663r;

    /* renamed from: t  reason: collision with root package name */
    private float f10665t;

    /* renamed from: u  reason: collision with root package name */
    private float f10666u;

    /* renamed from: v  reason: collision with root package name */
    private ImageView f10667v;

    /* renamed from: x  reason: collision with root package name */
    private j f10669x;

    /* renamed from: z  reason: collision with root package name */
    private boolean f10671z;

    /* renamed from: h  reason: collision with root package name */
    private final String f10653h = "open_ad";

    /* renamed from: n  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.e.b f10659n = new com.bytedance.sdk.openadsdk.component.e.b();

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f10648c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f10649d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    protected boolean f10650e = false;

    /* renamed from: f  reason: collision with root package name */
    protected final AtomicBoolean f10651f = new AtomicBoolean(false);

    /* renamed from: s  reason: collision with root package name */
    private final a f10664s = new a();

    /* renamed from: w  reason: collision with root package name */
    private long f10668w = 0;

    /* renamed from: y  reason: collision with root package name */
    private AtomicBoolean f10670y = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    protected final x f10652g = new x(Looper.getMainLooper(), this);

    private void o() {
        if (this.f10671z) {
            this.f10652g.sendEmptyMessageDelayed(100, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.f10652g.removeMessages(100);
    }

    private void q() {
        this.f10647b.a(f.f12352d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.f10647b.a(f.f12353e);
    }

    private void s() {
        try {
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.9
                @Override // java.lang.Runnable
                public void run() {
                    TTAppOpenAdActivity.this.f10669x = new j();
                    TTAppOpenAdActivity.this.f10669x.a(System.currentTimeMillis(), 1.0f);
                    TTAppOpenAdActivity.this.f10668w = System.currentTimeMillis();
                    if (TTAppOpenAdActivity.this.f10660o != null && !TTAppOpenAdActivity.this.f10660o.isStarted()) {
                        TTAppOpenAdActivity.this.f10660o.start();
                    }
                    if (!com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        if (TTAppOpenAdActivity.this.E != null) {
                            TTAppOpenAdActivity.this.E.onAdShow();
                        }
                    } else {
                        TTAppOpenAdActivity.this.a("onAdShow");
                    }
                    View findViewById = TTAppOpenAdActivity.this.findViewById(16908290);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("width", findViewById.getWidth());
                        jSONObject.put("height", findViewById.getHeight());
                        jSONObject.put("alpha", findViewById.getAlpha());
                        HashMap hashMap = new HashMap();
                        hashMap.put("root_view", jSONObject.toString());
                        hashMap.put("ad_root", Integer.valueOf(TTAppOpenAdActivity.this.G));
                        hashMap.put("openad_creative_type", TTAppOpenAdActivity.this.f10671z ? "video_normal_ad" : "image_normal_ad");
                        if (a.c() == null) {
                            hashMap.put("appicon_acquirefail", "1");
                        }
                        e.a(m.a(), TTAppOpenAdActivity.this.C, "open_ad", hashMap, (Double) null);
                        TTAppOpenAdActivity.this.f10670y.set(true);
                    } catch (JSONException unused) {
                        TTAppOpenAdActivity.this.finish();
                    }
                }
            });
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            a("onAdSkip");
            return;
        }
        TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener = this.E;
        if (appOpenAdInteractionListener != null) {
            appOpenAdInteractionListener.onAdSkip();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v.a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                v.a((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.component.e.b bVar;
        if (m.h().h(this.A) == 1) {
            if (this.f10659n.d() < m.h().i(this.A) * 1000 || (bVar = this.f10659n) == null) {
                return;
            }
            bVar.c();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b(bundle)) {
            if (!TTAdSdk.isInitSuccess()) {
                finish();
            }
            this.f10671z = n.c(this.C);
            f();
            g();
            h();
            i();
            j();
            k();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f10671z) {
            com.bytedance.sdk.openadsdk.component.c.a.a(this.C, this.f10662q, this.f10659n.e(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.c.a.a(this.C, -1L, this.f10659n.e(), false);
        }
        if (this.f10668w > 0 && this.f10670y.get()) {
            e.a((System.currentTimeMillis() - this.f10668w) + "", this.C, "open_ad", this.f10669x);
            this.f10668w = 0L;
        }
        ButtonFlash buttonFlash = this.f10658m;
        if (buttonFlash != null) {
            buttonFlash.a();
        }
        b bVar = this.f10661p;
        if (bVar != null) {
            bVar.f();
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            a("recycleRes");
        }
        ValueAnimator valueAnimator = this.f10660o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        F = null;
        this.E = null;
        TTAdDislikeDialog tTAdDislikeDialog = this.f10646a;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.setCallback(null);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f10650e = false;
        c();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f10650e = true;
        if (this.f10651f.getAndSet(true)) {
            b();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            n nVar = this.C;
            bundle.putString("material_meta", nVar != null ? nVar.ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.B);
            bundle.putInt(FullscreenAdService.DATA_KEY_AD_SOURCE, this.G);
        } catch (Throwable unused) {
        }
        F = this.E;
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10 && this.f10670y.get()) {
            if (this.f10668w > 0) {
                e.a((System.currentTimeMillis() - this.f10668w) + "", this.C, "open_ad", this.f10669x);
            }
            this.f10668w = 0L;
            return;
        }
        this.f10668w = System.currentTimeMillis();
    }

    private void f() {
        int f10 = t.f(this, "tt_app_open_view");
        int d10 = this.C.d();
        if (d10 == 2) {
            f10 = t.f(this, "tt_app_open_view2");
        } else if (d10 == 3) {
            f10 = t.f(this, "tt_app_open_view3");
        }
        setContentView(f10);
    }

    private void g() {
        int min;
        int max;
        int am = this.C.am();
        if (this.C.d() == 3) {
            am = 2;
        }
        if (am == 2) {
            if (e()) {
                setRequestedOrientation(8);
            } else {
                setRequestedOrientation(0);
            }
        } else {
            setRequestedOrientation(1);
        }
        int i10 = v.i(getApplicationContext());
        int h10 = v.h(getApplicationContext());
        if (am == 2) {
            min = Math.max(i10, h10);
            max = Math.min(i10, h10);
        } else {
            min = Math.min(i10, h10);
            max = Math.max(i10, h10);
        }
        this.f10665t = max;
        this.f10666u = min;
        float j10 = v.j(getApplicationContext());
        if (v.c((Activity) this)) {
            if (am == 1) {
                this.f10665t -= j10;
            } else if (am == 2) {
                this.f10666u -= j10;
            }
        }
    }

    private void h() {
        this.f10654i = (RelativeLayout) findViewById(t.e(this, "tt_open_ad_container"));
        this.f10667v = (ImageView) findViewById(t.e(this, "tt_open_ad_back_image"));
        this.f10655j = (FrameLayout) findViewById(t.e(this, "tt_open_ad_video_container"));
        this.f10656k = (ImageView) findViewById(t.e(this, "tt_open_ad_image"));
        this.f10658m = (ButtonFlash) findViewById(t.e(this, "tt_open_ad_click_button"));
        this.f10657l = (TextView) findViewById(t.e(this, "tt_ad_logo"));
        this.f10664s.a(this);
        this.f10659n.a(this);
    }

    private void i() {
        this.f10664s.a(this.C, this.f10666u, this.f10665t);
    }

    private void j() {
        this.f10657l.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                    TTWebsiteActivity.a(tTAppOpenAdActivity, tTAppOpenAdActivity.C, "open_ad");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.f10659n.a(new com.bytedance.sdk.openadsdk.component.e.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.e.a
            public void a(View view) {
                p.c(TTAppOpenAdActivity.this.A);
                TTAppOpenAdActivity.this.t();
                if (TTAppOpenAdActivity.this.f10661p != null) {
                    TTAppOpenAdActivity.this.f10661p.a(4);
                }
                com.bytedance.sdk.openadsdk.component.c.a.a(TTAppOpenAdActivity.this.C, TTAppOpenAdActivity.this.f10659n.d(), TTAppOpenAdActivity.this.f10659n.f(), TTAppOpenAdActivity.this.f10659n.e());
                TTAppOpenAdActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.component.e.a
            public void b(View view) {
                TTAppOpenAdActivity.this.a();
            }

            @Override // com.bytedance.sdk.openadsdk.component.e.a
            public void a() {
                if (!com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    if (TTAppOpenAdActivity.this.E != null) {
                        TTAppOpenAdActivity.this.E.onAdCountdownToZero();
                    }
                } else {
                    TTAppOpenAdActivity.this.a("onAdTimeOver");
                }
                TTAppOpenAdActivity.this.finish();
            }
        });
        com.bytedance.sdk.openadsdk.component.a.b bVar = new com.bytedance.sdk.openadsdk.component.a.b(this.C, this);
        this.f10663r = bVar;
        bVar.a(new b.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.b.b.a
            public void a(View view, int i10) {
                if (!com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    if (TTAppOpenAdActivity.this.E != null) {
                        TTAppOpenAdActivity.this.E.onAdClicked();
                        return;
                    }
                    return;
                }
                TTAppOpenAdActivity.this.a("onAdClicked");
            }
        });
        com.bytedance.sdk.openadsdk.component.a.a a10 = this.f10663r.a();
        if (this.C.c() == 1) {
            this.f10654i.setOnClickListener(a10);
            this.f10654i.setOnTouchListener(a10);
        }
        this.f10658m.setOnClickListener(a10);
        this.f10658m.setOnTouchListener(a10);
    }

    private void k() {
        this.f10664s.a();
        this.f10658m.setText(this.C.W());
        this.f10659n.b(m.h().i(this.A));
        if (this.f10671z) {
            a(0);
            b(8);
            this.f10659n.a((float) this.C.J().r());
            this.f10660o = this.f10659n.b();
            this.f10659n.a(0);
            m();
            return;
        }
        int j10 = m.h().j(this.A);
        a(8);
        b(0);
        this.f10659n.a(j10);
        this.f10660o = this.f10659n.b();
        this.f10659n.a(0);
        l();
    }

    private void l() {
        s();
        k kVar = this.C.P().get(0);
        g.a(new com.bytedance.sdk.openadsdk.i.a(kVar.a(), kVar.g()), kVar.b(), kVar.c(), new g.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
            @Override // com.bytedance.sdk.openadsdk.utils.g.a
            public void a() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.g.a
            public void a(com.bytedance.sdk.openadsdk.i.a.b bVar) {
                if (bVar.c()) {
                    TTAppOpenAdActivity.this.a(bVar);
                    TTAppOpenAdActivity.this.a(bVar.a());
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.g.a
            public void b() {
            }
        }, com.bytedance.sdk.openadsdk.component.f.a.b(TextUtils.isEmpty(kVar.g()) ? com.bytedance.sdk.component.utils.e.a(kVar.a()) : kVar.g(), this.A).getParent());
    }

    private void m() {
        boolean z10;
        s();
        com.bytedance.sdk.openadsdk.component.g.b bVar = new com.bytedance.sdk.openadsdk.component.g.b(this);
        this.f10661p = bVar;
        bVar.a(this.f10655j, this.C);
        this.f10661p.a(new c.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // m3.c.a
            public void a(long j10, int i10) {
                l.b("TTAppOpenAdActivity", "onComplete");
            }

            @Override // m3.c.a
            public void b(long j10, int i10) {
                l.b("TTAppOpenAdActivity", "onError");
                TTAppOpenAdActivity.this.t();
                TTAppOpenAdActivity.this.finish();
            }

            @Override // m3.c.a
            public void a() {
                l.b("TTAppOpenAdActivity", "onTimeOut");
                TTAppOpenAdActivity.this.t();
                TTAppOpenAdActivity.this.finish();
            }

            @Override // m3.c.a
            public void a(long j10, long j11) {
                TTAppOpenAdActivity.this.f10662q = j10;
                TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                if (!tTAppOpenAdActivity.f10650e && tTAppOpenAdActivity.f10661p.b()) {
                    TTAppOpenAdActivity.this.f10661p.d();
                }
                TTAppOpenAdActivity.this.p();
            }
        });
        try {
            z10 = this.f10661p.a();
        } catch (Throwable th) {
            l.e("TTAppOpenAdActivity", "ttAppOpenAd playVideo error: " + th.getMessage());
            z10 = false;
        }
        if (z10) {
            o();
        } else {
            finish();
        }
        com.bytedance.sdk.openadsdk.component.a.a(this.C, new a.d() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // com.bytedance.sdk.openadsdk.component.a.d
            public void a() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.a.d
            public void a(Bitmap bitmap) {
                TTAppOpenAdActivity.this.a(bitmap);
            }
        });
    }

    private void n() {
        if (this.f10646a == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this, this.C);
            this.f10646a = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.8
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                public void a(View view) {
                    TTAppOpenAdActivity.this.f10648c.set(true);
                    TTAppOpenAdActivity.this.c();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                public void b(View view) {
                    TTAppOpenAdActivity.this.f10648c.set(false);
                    TTAppOpenAdActivity.this.b();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                public void c(View view) {
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.a
                public void a(int i10, FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.f10649d.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.f10649d.set(true);
                    TTAppOpenAdActivity.this.r();
                }
            });
        }
        ((FrameLayout) findViewById(16908290)).addView(this.f10646a);
        if (this.f10647b == null) {
            this.f10647b = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f10647b);
        }
    }

    void c() {
        if (this.f10671z) {
            if (this.f10661p.b()) {
                this.f10661p.d();
            }
            p();
        }
        ValueAnimator valueAnimator = this.f10660o;
        if (valueAnimator == null || Build.VERSION.SDK_INT < 19) {
            return;
        }
        valueAnimator.pause();
    }

    protected IListenerManager d() {
        if (this.D == null) {
            this.D = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a()).a(7));
        }
        return this.D;
    }

    protected boolean e() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception unused) {
            return false;
        }
    }

    void b(int i10) {
        v.a((View) this.f10656k, i10);
    }

    void b() {
        if (this.f10671z) {
            if (this.f10661p.c()) {
                this.f10661p.e();
            }
            o();
        }
        ValueAnimator valueAnimator = this.f10660o;
        if (valueAnimator == null || Build.VERSION.SDK_INT < 19) {
            return;
        }
        valueAnimator.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        Bitmap a10;
        if (bitmap != null) {
            try {
                if (Build.VERSION.SDK_INT < 17 || (a10 = com.bytedance.sdk.component.adexpress.c.a.a(m.a(), bitmap, 25)) == null) {
                    return;
                }
                this.f10667v.setImageDrawable(new BitmapDrawable(m.a().getResources(), a10));
            } catch (Throwable unused) {
                l.e("TTAppOpenAdActivity", "bindBackGroundImage error");
            }
        }
    }

    private boolean b(Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.C = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(stringExtra));
                    } catch (Exception e10) {
                        l.c("TTAppOpenAdActivity", "initData MultiGlobalInfo throws ", e10);
                    }
                }
                this.B = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.C = com.bytedance.sdk.openadsdk.core.t.a().c();
            this.E = com.bytedance.sdk.openadsdk.core.t.a().f();
            com.bytedance.sdk.openadsdk.core.t.a().h();
        }
        a(getIntent());
        a(bundle);
        n nVar = this.C;
        if (nVar == null) {
            l.b("TTAppOpenAdActivity", "mMaterialMeta is null , no data to display ,the TTOpenAdActivity finished !!");
            finish();
            return false;
        }
        this.A = u.f(nVar);
        return true;
    }

    void a(com.bytedance.sdk.openadsdk.i.a.b bVar) {
        if (bVar.a() != null) {
            this.f10656k.setImageBitmap(bVar.a());
        } else if (this.C.P() == null || this.C.P().get(0) == null) {
        } else {
            Drawable a10 = g.a(bVar.b(), this.C.P().get(0).b());
            this.f10656k.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f10656k.setImageDrawable(a10);
        }
    }

    void a(int i10) {
        v.a((View) this.f10655j, i10);
    }

    protected void a() {
        if (isFinishing()) {
            return;
        }
        if (this.f10649d.get()) {
            q();
            return;
        }
        if (this.f10646a == null) {
            n();
        }
        this.f10646a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        com.bytedance.sdk.component.f.e.c(new com.bytedance.sdk.component.f.g("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.d().executeAppOpenAdCallback(TTAppOpenAdActivity.this.B, str);
                } catch (Throwable th) {
                    l.c("TTAppOpenAdActivity", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected void a(Intent intent) {
        if (intent != null) {
            this.G = intent.getIntExtra(FullscreenAdService.DATA_KEY_AD_SOURCE, 0);
        }
    }

    protected void a(Bundle bundle) {
        if (bundle != null) {
            if (this.E == null) {
                this.E = F;
                F = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.B = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.G = bundle.getInt(FullscreenAdService.DATA_KEY_AD_SOURCE, 0);
                this.C = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(string));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        if (message.what == 100) {
            com.bytedance.sdk.openadsdk.component.g.b bVar = this.f10661p;
            if (bVar != null) {
                bVar.a(1);
            }
            t();
            finish();
        }
    }
}
