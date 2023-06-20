package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.b;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.e.d;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.c;
import org.json.JSONArray;
import org.json.JSONObject;
import r3.c;

/* loaded from: classes.dex */
public class TTVideoLandingPageActivity extends Activity implements d {
    protected ViewStub A;
    protected Button B;
    protected ProgressBar C;
    protected c D;
    protected String F;
    protected int K;
    protected com.bytedance.sdk.openadsdk.multipro.b.a L;
    protected n M;
    protected String P;

    /* renamed from: a  reason: collision with root package name */
    protected SSWebView f10867a;

    /* renamed from: b  reason: collision with root package name */
    protected ImageView f10868b;

    /* renamed from: c  reason: collision with root package name */
    protected ImageView f10869c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f10870d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f10871e;

    /* renamed from: f  reason: collision with root package name */
    protected int f10872f;

    /* renamed from: g  reason: collision with root package name */
    protected String f10873g;

    /* renamed from: h  reason: collision with root package name */
    protected String f10874h;

    /* renamed from: i  reason: collision with root package name */
    protected w f10875i;

    /* renamed from: j  reason: collision with root package name */
    protected int f10876j;

    /* renamed from: k  reason: collision with root package name */
    protected RelativeLayout f10877k;

    /* renamed from: l  reason: collision with root package name */
    protected FrameLayout f10878l;

    /* renamed from: n  reason: collision with root package name */
    protected NativeVideoTsView f10880n;

    /* renamed from: o  reason: collision with root package name */
    protected long f10881o;

    /* renamed from: p  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.e.n f10882p;

    /* renamed from: v  reason: collision with root package name */
    protected RelativeLayout f10888v;

    /* renamed from: w  reason: collision with root package name */
    protected TextView f10889w;

    /* renamed from: x  reason: collision with root package name */
    protected RoundImageView f10890x;

    /* renamed from: y  reason: collision with root package name */
    protected TextView f10891y;

    /* renamed from: z  reason: collision with root package name */
    protected TextView f10892z;

    /* renamed from: m  reason: collision with root package name */
    protected int f10879m = -1;

    /* renamed from: q  reason: collision with root package name */
    protected int f10883q = 0;

    /* renamed from: r  reason: collision with root package name */
    protected int f10884r = 0;

    /* renamed from: s  reason: collision with root package name */
    protected int f10885s = 0;

    /* renamed from: t  reason: collision with root package name */
    protected int f10886t = 0;

    /* renamed from: u  reason: collision with root package name */
    protected String f10887u = "ダウンロード";
    protected boolean E = false;
    protected boolean G = false;
    protected boolean H = true;
    protected boolean I = false;
    protected String J = null;
    protected AtomicBoolean N = new AtomicBoolean(true);
    protected JSONArray O = null;
    protected com.bytedance.sdk.openadsdk.core.b.a Q = null;
    private final c.b R = new c.b() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
        @Override // m3.c.b
        public void a(boolean z10) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.E = z10;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (z10) {
                v.a((View) TTVideoLandingPageActivity.this.f10867a, 8);
                v.a((View) TTVideoLandingPageActivity.this.f10877k, 8);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f10878l.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                tTVideoLandingPageActivity2.f10884r = marginLayoutParams.leftMargin;
                tTVideoLandingPageActivity2.f10883q = marginLayoutParams.topMargin;
                tTVideoLandingPageActivity2.f10885s = marginLayoutParams.width;
                tTVideoLandingPageActivity2.f10886t = marginLayoutParams.height;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                tTVideoLandingPageActivity2.f10878l.setLayoutParams(marginLayoutParams);
                return;
            }
            v.a((View) TTVideoLandingPageActivity.this.f10867a, 0);
            v.a((View) TTVideoLandingPageActivity.this.f10877k, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f10878l.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            marginLayoutParams2.width = tTVideoLandingPageActivity3.f10885s;
            marginLayoutParams2.height = tTVideoLandingPageActivity3.f10886t;
            marginLayoutParams2.leftMargin = tTVideoLandingPageActivity3.f10884r;
            marginLayoutParams2.topMargin = tTVideoLandingPageActivity3.f10883q;
            tTVideoLandingPageActivity3.f10878l.setLayoutParams(marginLayoutParams2);
        }
    };
    private boolean S = false;
    private final BroadcastReceiver T = new BroadcastReceiver() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SSWebView sSWebView;
            String str;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                int i10 = 0;
                if (!intent.getBooleanExtra("noConnectivity", false)) {
                    NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                    if (networkInfo != null) {
                        int type = networkInfo.getType();
                        if (type == 1) {
                            i10 = 4;
                        } else if (type == 0) {
                            i10 = 1;
                        }
                    } else {
                        i10 = o.c(context);
                    }
                }
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.K == 0 && i10 != 0 && (sSWebView = tTVideoLandingPageActivity.f10867a) != null && (str = tTVideoLandingPageActivity.J) != null) {
                    sSWebView.a(str);
                }
                NativeVideoTsView nativeVideoTsView = TTVideoLandingPageActivity.this.f10880n;
                if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                    if (!tTVideoLandingPageActivity2.G && tTVideoLandingPageActivity2.K != i10) {
                        ((b) tTVideoLandingPageActivity2.f10880n.getNativeVideoController()).a(context, i10);
                    }
                }
                TTVideoLandingPageActivity.this.K = i10;
            }
        }
    };

    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    private static class a extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        private Bitmap f10904a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<m3.b> f10905b;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap a10 = com.bytedance.sdk.component.adexpress.c.a.a(m.a(), this.f10904a, 25);
                if (a10 == null) {
                    return null;
                }
                return new BitmapDrawable(m.a().getResources(), a10);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        private a(Bitmap bitmap, m3.b bVar) {
            this.f10904a = bitmap;
            this.f10905b = new WeakReference<>(bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Drawable drawable) {
            WeakReference<m3.b> weakReference;
            if (drawable == null || (weakReference = this.f10905b) == null || weakReference.get() == null) {
                return;
            }
            this.f10905b.get().a(drawable);
        }
    }

    private void m() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10882p;
        if (nVar == null || nVar.L() != 4) {
            return;
        }
        this.A.setVisibility(0);
        Button button = (Button) findViewById(t.e(this, "tt_browser_download_btn"));
        this.B = button;
        if (button != null) {
            a(b());
            this.B.setOnClickListener(this.Q);
            this.B.setOnTouchListener(this.Q);
        }
    }

    private void n() {
        w wVar = new w(this);
        this.f10875i = wVar;
        wVar.b(this.f10867a).d(this.f10873g).e(this.f10874h).b(this.f10876j).a(this.f10882p).a(this.f10882p.F()).a(this.f10867a).c("landingpage_split_screen").f(u.i(this.f10882p));
    }

    private void o() {
        NativeVideoTsView nativeVideoTsView = this.f10880n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null || q()) {
            return;
        }
        this.f10880n.l();
    }

    private void p() {
        if (this.f10880n == null || q()) {
            return;
        }
        this.f10880n.l();
    }

    private boolean q() {
        NativeVideoTsView nativeVideoTsView = this.f10880n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return true;
        }
        return this.f10880n.getNativeVideoController().q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r() {
        return !TextUtils.isEmpty(this.J) && this.J.contains("__luban_sdk");
    }

    private void s() {
        if (this.f10882p == null) {
            return;
        }
        JSONArray b10 = b(this.J);
        int f10 = u.f(this.f10882p);
        int e10 = u.e(this.f10882p);
        com.bytedance.sdk.openadsdk.core.n<com.bytedance.sdk.openadsdk.b.a> f11 = m.f();
        if (b10 == null || f11 == null || f10 <= 0 || e10 <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.e.o oVar = new com.bytedance.sdk.openadsdk.core.e.o();
        oVar.f12203e = b10;
        AdSlot x10 = this.f10882p.x();
        if (x10 == null) {
            return;
        }
        x10.setAdCount(6);
        f11.a(x10, oVar, e10, new n.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(int i10, String str) {
                TTVideoLandingPageActivity.this.a(0);
            }

            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                if (aVar != null) {
                    try {
                        TTVideoLandingPageActivity.this.N.set(false);
                        TTVideoLandingPageActivity.this.f10875i.b(new JSONObject(aVar.c()));
                    } catch (Exception unused) {
                        TTVideoLandingPageActivity.this.a(0);
                    }
                }
            }
        });
    }

    protected String a() {
        return "tt_activity_videolandingpage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10882p;
        if (nVar != null && !TextUtils.isEmpty(nVar.W())) {
            this.f10887u = this.f10882p.W();
        }
        return this.f10887u;
    }

    protected String c() {
        return "tt_titlebar_close";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        this.C = (ProgressBar) findViewById(t.e(this, "tt_browser_progress"));
        this.A = (ViewStub) findViewById(t.e(this, "tt_browser_download_btn_stub"));
        this.f10867a = (SSWebView) findViewById(t.e(this, "tt_browser_webview"));
        ImageView imageView = (ImageView) findViewById(t.e(this, "tt_titlebar_back"));
        this.f10868b = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SSWebView sSWebView = TTVideoLandingPageActivity.this.f10867a;
                    if (sSWebView != null) {
                        if (!sSWebView.e()) {
                            if (TTVideoLandingPageActivity.this.r()) {
                                TTVideoLandingPageActivity.this.onBackPressed();
                                return;
                            }
                            Map<String, Object> map = null;
                            NativeVideoTsView nativeVideoTsView = TTVideoLandingPageActivity.this.f10880n;
                            if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
                                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                                map = u.a(tTVideoLandingPageActivity.f10882p, tTVideoLandingPageActivity.f10880n.getNativeVideoController().h(), TTVideoLandingPageActivity.this.f10880n.getNativeVideoController().n());
                            }
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            e.a(tTVideoLandingPageActivity2, tTVideoLandingPageActivity2.f10882p, "embeded_ad", "detail_back", tTVideoLandingPageActivity2.g(), TTVideoLandingPageActivity.this.h(), map, (j) null);
                            TTVideoLandingPageActivity.this.finish();
                            return;
                        }
                        TTVideoLandingPageActivity.this.f10867a.f();
                    }
                }
            });
        }
        NativeVideoTsView nativeVideoTsView = this.f10880n;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.setIsAutoPlay(this.I);
        }
        ImageView imageView2 = (ImageView) findViewById(t.e(this, c()));
        this.f10869c = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NativeVideoTsView nativeVideoTsView2 = TTVideoLandingPageActivity.this.f10880n;
                    if (nativeVideoTsView2 != null) {
                        Map<String, Object> map = null;
                        if (nativeVideoTsView2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            map = u.a(tTVideoLandingPageActivity.f10882p, tTVideoLandingPageActivity.f10880n.getNativeVideoController().h(), TTVideoLandingPageActivity.this.f10880n.getNativeVideoController().n());
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        e.a(tTVideoLandingPageActivity2, tTVideoLandingPageActivity2.f10882p, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.g(), TTVideoLandingPageActivity.this.h(), map, (j) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.f10870d = (TextView) findViewById(t.e(this, "tt_titlebar_title"));
        this.f10878l = (FrameLayout) findViewById(t.e(this, "tt_native_video_container"));
        this.f10877k = (RelativeLayout) findViewById(t.e(this, "tt_native_video_titlebar"));
        this.f10888v = (RelativeLayout) findViewById(t.e(this, "tt_rl_download"));
        this.f10889w = (TextView) findViewById(t.e(this, "tt_video_btn_ad_image_tv"));
        this.f10891y = (TextView) findViewById(t.e(this, "tt_video_ad_name"));
        this.f10892z = (TextView) findViewById(t.e(this, "tt_video_ad_button"));
        this.f10890x = (RoundImageView) findViewById(t.e(this, "tt_video_ad_logo_image"));
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        if (f()) {
            try {
                NativeVideoTsView nativeVideoTsView = new NativeVideoTsView(this.f10871e, this.f10882p, true, null);
                this.f10880n = nativeVideoTsView;
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.f10880n.getNativeVideoController().a(false);
                }
                if (this.G) {
                    this.f10878l.setVisibility(0);
                    this.f10878l.removeAllViews();
                    this.f10878l.addView(this.f10880n);
                    this.f10880n.b(true);
                } else {
                    if (!this.I) {
                        this.f10881o = 0L;
                    }
                    if (this.L != null && this.f10880n.getNativeVideoController() != null) {
                        this.f10880n.getNativeVideoController().b(this.L.f13519g);
                        this.f10880n.getNativeVideoController().c(this.L.f13517e);
                        this.f10880n.setIsQuiet(m.h().a(u.f(this.f10882p)));
                    }
                    if (this.f10880n.a(this.f10881o, this.H, this.G)) {
                        this.f10878l.setVisibility(0);
                        this.f10878l.removeAllViews();
                        this.f10878l.addView(this.f10880n);
                    }
                    if (this.f10880n.getNativeVideoController() != null) {
                        this.f10880n.getNativeVideoController().a(false);
                        this.f10880n.getNativeVideoController().a(this.R);
                    }
                }
                com.bytedance.sdk.openadsdk.d.a.a().a(this.f10882p.P().get(0).a()).a(com.bytedance.sdk.component.d.t.BITMAP).a(new com.bytedance.sdk.component.d.n<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                    @Override // com.bytedance.sdk.component.d.n
                    public void a(int i10, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.d.n
                    public void a(com.bytedance.sdk.component.d.j<Bitmap> jVar) {
                        try {
                            Bitmap b10 = jVar.b();
                            if (Build.VERSION.SDK_INT >= 17) {
                                new a(b10, TTVideoLandingPageActivity.this.f10880n.getNativeVideoController().o()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                this.f10880n.findViewById(t.e(this.f10871e, "tt_root_view")).setOnTouchListener(null);
                this.f10880n.findViewById(t.e(this.f10871e, "tt_root_view")).setOnClickListener(null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (this.K == 0) {
                try {
                    Toast.makeText(this, t.b(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    protected boolean f() {
        return this.f10879m == 5;
    }

    protected long g() {
        NativeVideoTsView nativeVideoTsView = this.f10880n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0L;
        }
        return this.f10880n.getNativeVideoController().j();
    }

    protected int h() {
        NativeVideoTsView nativeVideoTsView = this.f10880n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.f10880n.getNativeVideoController().l();
    }

    protected void i() {
        String K;
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10882p;
        if (nVar == null || nVar.L() != 4) {
            return;
        }
        v.a((View) this.f10888v, 0);
        if (!TextUtils.isEmpty(this.f10882p.U())) {
            K = this.f10882p.U();
        } else if (!TextUtils.isEmpty(this.f10882p.V())) {
            K = this.f10882p.V();
        } else {
            K = !TextUtils.isEmpty(this.f10882p.K()) ? this.f10882p.K() : "";
        }
        if (this.f10882p.M() != null && this.f10882p.M().a() != null) {
            v.a((View) this.f10890x, 0);
            v.a((View) this.f10889w, 4);
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f10882p.M(), this.f10890x);
        } else if (!TextUtils.isEmpty(K)) {
            v.a((View) this.f10890x, 4);
            v.a((View) this.f10889w, 0);
            this.f10889w.setText(K.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.f10882p.W())) {
            this.f10892z.setText(this.f10882p.W());
        }
        if (!TextUtils.isEmpty(K)) {
            this.f10891y.setText(K);
        }
        v.a((View) this.f10891y, 0);
        v.a((View) this.f10892z, 0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void j() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10882p;
        if (nVar == null) {
            return;
        }
        this.D = r3.d.a(this, nVar, this.F);
        com.bytedance.sdk.openadsdk.core.b.a aVar = new com.bytedance.sdk.openadsdk.core.b.a(this, this.f10882p, this.F, this.f10876j);
        this.Q = aVar;
        aVar.a(false);
        this.Q.c(true);
        this.f10892z.setOnClickListener(this.Q);
        this.f10892z.setOnTouchListener(this.Q);
        this.Q.a(this.D);
    }

    protected void k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            this.f10871e.registerReceiver(this.T, intentFilter);
        } catch (Exception unused) {
        }
    }

    protected void l() {
        try {
            this.f10871e.unregisterReceiver(this.T);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        NativeVideoTsView nativeVideoTsView;
        if (this.E && (nativeVideoTsView = this.f10880n) != null && nativeVideoTsView.getNativeVideoController() != null) {
            ((m3.a) this.f10880n.getNativeVideoController()).e(null, null);
            this.E = false;
        } else if (r() && !this.N.getAndSet(true)) {
            a(true);
            a(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            m.a(this);
        } catch (Throwable unused2) {
        }
        this.K = o.c(getApplicationContext());
        setContentView(t.f(this, a()));
        this.f10871e = this;
        Intent intent = getIntent();
        this.f10872f = intent.getIntExtra("sdk_version", 1);
        this.f10873g = intent.getStringExtra("adid");
        this.f10874h = intent.getStringExtra("log_extra");
        this.f10876j = intent.getIntExtra("source", -1);
        this.J = intent.getStringExtra(ImagesContract.URL);
        String stringExtra = intent.getStringExtra("web_title");
        this.F = intent.getStringExtra("event_tag");
        this.P = intent.getStringExtra("gecko_id");
        this.I = intent.getBooleanExtra("video_is_auto_play", true);
        if (bundle != null && bundle.getLong("video_play_position") > 0) {
            this.f10881o = bundle.getLong("video_play_position", 0L);
        }
        String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
            if (stringExtra3 != null) {
                try {
                    this.f10882p = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(stringExtra3));
                } catch (Exception unused3) {
                }
            }
            com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10882p;
            if (nVar != null) {
                this.f10879m = nVar.ad();
            }
        } else {
            com.bytedance.sdk.openadsdk.core.e.n c10 = com.bytedance.sdk.openadsdk.core.t.a().c();
            this.f10882p = c10;
            if (c10 != null) {
                this.f10879m = c10.ad();
            }
            com.bytedance.sdk.openadsdk.core.t.a().h();
        }
        if (this.f10882p == null) {
            finish();
            return;
        }
        if (stringExtra2 != null) {
            try {
                this.L = com.bytedance.sdk.openadsdk.multipro.b.a.a(new JSONObject(stringExtra2));
            } catch (Exception unused4) {
            }
            com.bytedance.sdk.openadsdk.multipro.b.a aVar = this.L;
            if (aVar != null) {
                this.f10881o = aVar.f13519g;
            }
        }
        if (bundle != null) {
            String string = bundle.getString("material_meta");
            if (this.f10882p == null) {
                try {
                    this.f10882p = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(string));
                } catch (Throwable unused5) {
                }
            }
            long j10 = bundle.getLong("video_play_position");
            bundle.getBoolean("is_complete");
            if (j10 > 0) {
                this.f10881o = j10;
            }
        }
        d();
        j();
        n();
        a(4);
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 >= 16;
        if (this.f10867a != null) {
            com.bytedance.sdk.openadsdk.core.widget.a.b.a(this.f10871e).a(z10).b(false).a(this.f10867a.getWebView());
            com.bytedance.sdk.openadsdk.b.n a10 = new com.bytedance.sdk.openadsdk.b.n(this, this.f10882p, this.f10867a.getWebView()).a(true);
            this.M = a10;
            a10.a("landingpage_split_screen");
        }
        this.f10867a.setLandingPage(true);
        this.f10867a.setTag("landingpage_split_screen");
        this.f10867a.setMaterialMeta(this.f10882p.aC());
        this.f10867a.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.f10871e, this.f10875i, this.f10873g, this.M, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.C == null || tTVideoLandingPageActivity.isFinishing()) {
                        return;
                    }
                    TTVideoLandingPageActivity.this.C.setVisibility(8);
                } catch (Throwable unused6) {
                }
            }
        });
        SSWebView sSWebView = this.f10867a;
        if (sSWebView != null) {
            sSWebView.setUserAgentString(i.a(sSWebView.getWebView(), this.f10872f));
        }
        if (i10 >= 21) {
            this.f10867a.setMixedContentMode(0);
        }
        e.a(this.f10871e, this.f10882p, "landingpage_split_screen");
        com.bytedance.sdk.openadsdk.utils.j.a(this.f10867a, this.J);
        this.f10867a.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.f10875i, this.M) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.a.c, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i11) {
                super.onProgressChanged(webView, i11);
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.C == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                if (i11 == 100 && TTVideoLandingPageActivity.this.C.isShown()) {
                    TTVideoLandingPageActivity.this.C.setVisibility(8);
                } else {
                    TTVideoLandingPageActivity.this.C.setProgress(i11);
                }
            }
        });
        this.f10867a.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
                r3.c cVar = TTVideoLandingPageActivity.this.D;
                if (cVar != null) {
                    cVar.d();
                }
            }
        });
        TextView textView = this.f10870d;
        if (textView != null) {
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = t.a(this, "tt_web_title_default");
            }
            textView.setText(stringExtra);
        }
        k();
        e();
        m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        l();
        try {
            if (getWindow() != null && (viewGroup = (ViewGroup) getWindow().getDecorView()) != null) {
                viewGroup.removeAllViews();
            }
            this.f10882p.a(false);
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f10867a;
        if (sSWebView != null) {
            z.a(this.f10871e, sSWebView.getWebView());
            z.a(this.f10867a.getWebView());
        }
        this.f10867a = null;
        w wVar = this.f10875i;
        if (wVar != null) {
            wVar.n();
        }
        NativeVideoTsView nativeVideoTsView = this.f10880n;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            this.f10880n.getNativeVideoController().f();
        }
        this.f10880n = null;
        this.f10882p = null;
        com.bytedance.sdk.openadsdk.b.n nVar = this.M;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        NativeVideoTsView nativeVideoTsView;
        NativeVideoTsView nativeVideoTsView2;
        super.onPause();
        w wVar = this.f10875i;
        if (wVar != null) {
            wVar.m();
        }
        p();
        if (this.G || ((nativeVideoTsView2 = this.f10880n) != null && nativeVideoTsView2.getNativeVideoController() != null && this.f10880n.getNativeVideoController().q())) {
            this.G = true;
            Boolean bool = Boolean.TRUE;
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_update_flag", bool);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_native_video_complete", bool);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        }
        if (this.G || (nativeVideoTsView = this.f10880n) == null || nativeVideoTsView.getNativeVideoController() == null) {
            return;
        }
        a(this.f10880n.getNativeVideoController());
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.H) {
            o();
        }
        this.H = false;
        w wVar = this.f10875i;
        if (wVar != null) {
            wVar.l();
        }
        com.bytedance.sdk.openadsdk.b.n nVar = this.M;
        if (nVar != null) {
            nVar.d();
        }
        s();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f10882p;
        bundle.putString("material_meta", nVar != null ? nVar.ar().toString() : null);
        bundle.putLong("video_play_position", this.f10881o);
        bundle.putBoolean("is_complete", this.G);
        long j10 = this.f10881o;
        NativeVideoTsView nativeVideoTsView = this.f10880n;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            j10 = this.f10880n.getNativeVideoController().g();
        }
        bundle.putLong("video_play_position", j10);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.b.n nVar = this.M;
        if (nVar != null) {
            nVar.e();
        }
    }

    private void a(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.B) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.B == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.B.setText(str);
            }
        });
    }

    private JSONArray b(String str) {
        int i10;
        JSONArray jSONArray = this.O;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.O;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?id=");
        int indexOf2 = str.indexOf("&");
        if (indexOf == -1 || indexOf2 == -1 || (i10 = indexOf + 4) >= indexOf2) {
            return null;
        }
        String substring = str.substring(i10, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(substring);
        return jSONArray2;
    }

    private void a(m3.c cVar) {
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(cVar.q()));
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(cVar.g()));
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(cVar.j() + cVar.h()));
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_duration", Long.valueOf(cVar.j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (this.f10869c == null || !r()) {
            return;
        }
        v.a((View) this.f10869c, i10);
    }

    private void a(boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z10);
            this.f10875i.a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.e.d
    public void a(boolean z10, JSONArray jSONArray) {
        if (!z10 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.O = jSONArray;
        s();
    }
}
