package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.mraid.a0;
import com.fyber.inneractive.sdk.mraid.v;
import com.fyber.inneractive.sdk.mraid.x;
import com.fyber.inneractive.sdk.mraid.y;
import com.fyber.inneractive.sdk.network.i0;
import com.fyber.inneractive.sdk.network.m0;
import com.fyber.inneractive.sdk.ui.IAcloseButton;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.f0;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.util.r0;
import com.fyber.inneractive.sdk.web.a;
import com.fyber.inneractive.sdk.web.d.f;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class d<T extends f> extends com.fyber.inneractive.sdk.web.a<T> {
    public static final String[] X = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    public final h A;
    public g B;
    public ViewGroup C;
    public com.fyber.inneractive.sdk.web.c D;
    public boolean E;
    public int F;
    public d<T>.i G;
    public IAcloseButton H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public Orientation Q;
    public int R;
    public FrameLayout S;
    public FrameLayout T;
    public RelativeLayout U;
    public int V;
    public int W;

    /* renamed from: w  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.measurement.a f20404w;

    /* renamed from: x  reason: collision with root package name */
    public a.InterfaceC0237a f20405x;

    /* renamed from: y  reason: collision with root package name */
    public a0 f20406y;

    /* renamed from: z  reason: collision with root package name */
    public final EnumC0274d f20407z;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.f();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 == 4 && d.this.h()) {
                IAlog.d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
                d.this.f();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements com.fyber.inneractive.sdk.network.u<String> {
        public c() {
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(String str, Exception exc, boolean z10) {
            String str2 = str;
            if (exc == null && !TextUtils.isEmpty(str2)) {
                d dVar = d.this;
                if (dVar.g() != null) {
                    e eVar = new e(dVar, str2, null);
                    MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(dVar.g().getApplicationContext(), eVar);
                    eVar.f20415b = mediaScannerConnection;
                    mediaScannerConnection.connect();
                    return;
                }
                return;
            }
            com.fyber.inneractive.sdk.util.n.f20310b.post(new com.fyber.inneractive.sdk.web.j(this));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0274d {
        ENABLED,
        DISABLED
    }

    /* loaded from: classes2.dex */
    public class e implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a  reason: collision with root package name */
        public final String f20414a;

        /* renamed from: b  reason: collision with root package name */
        public MediaScannerConnection f20415b;

        public e(d dVar, String str, String str2) {
            this.f20414a = str;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.f20415b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.f20414a, null);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.f20415b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface f extends u {
        void a(InneractiveUnitController.AdDisplayError adDisplayError);

        void a(d dVar);

        void a(d dVar, a0 a0Var);

        void a(d dVar, boolean z10);

        void a(d dVar, boolean z10, Orientation orientation);

        boolean a(String str);

        void b();

        void b(d dVar);
    }

    /* loaded from: classes2.dex */
    public enum g {
        INLINE,
        INTERSTITIAL
    }

    /* loaded from: classes2.dex */
    public enum h {
        ALWAYS_VISIBLE,
        ALWAYS_HIDDEN,
        AD_CONTROLLED
    }

    /* loaded from: classes2.dex */
    public class i extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public Context f20423a;

        /* renamed from: b  reason: collision with root package name */
        public int f20424b = -1;

        public i() {
        }

        public void a() {
            try {
                d dVar = d.this;
                dVar.getClass();
                IAlog.a("%sunregister screen broadcast receiver called", IAlog.a(dVar));
                if (this.f20423a != null) {
                    d dVar2 = d.this;
                    dVar2.getClass();
                    IAlog.a("%sunregistering broadcast receiver", IAlog.a(dVar2));
                    this.f20423a.unregisterReceiver(this);
                    this.f20423a = null;
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int rotation;
            if ((this.f20423a != null) && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) && (rotation = ((WindowManager) com.fyber.inneractive.sdk.util.l.f20301a.getSystemService("window")).getDefaultDisplay().getRotation()) != this.f20424b) {
                this.f20424b = rotation;
                d dVar = d.this;
                com.fyber.inneractive.sdk.web.c cVar = dVar.f20365b;
                if (cVar != null) {
                    cVar.getViewTreeObserver().addOnPreDrawListener(new com.fyber.inneractive.sdk.web.e(dVar, context));
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class j implements a.e {

        /* renamed from: a  reason: collision with root package name */
        public com.fyber.inneractive.sdk.mraid.a f20426a;

        public j(d dVar, com.fyber.inneractive.sdk.mraid.a aVar, p0 p0Var) {
            this.f20426a = aVar;
        }

        @Override // com.fyber.inneractive.sdk.web.a.e
        public String a() {
            return this.f20426a.c();
        }

        @Override // com.fyber.inneractive.sdk.web.a.e
        public void b() {
            com.fyber.inneractive.sdk.mraid.a aVar = this.f20426a;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.web.a.e
        public String c() {
            return this.f20426a.f17488a;
        }

        @Override // com.fyber.inneractive.sdk.web.a.e
        public void d() {
            this.f20426a.a();
        }

        public String toString() {
            return "action = " + this.f20426a.f17488a + " url = " + this.f20426a.c();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class k implements f {
        @Override // com.fyber.inneractive.sdk.web.u
        public void a(boolean z10) {
        }
    }

    public d(Context context, boolean z10, boolean z11, g gVar, EnumC0274d enumC0274d, h hVar, com.fyber.inneractive.sdk.measurement.a aVar) {
        super(context, z10, z11);
        this.f20405x = null;
        this.f20406y = a0.HIDDEN;
        this.E = false;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = Orientation.NONE;
        this.f20404w = aVar;
        this.B = gVar;
        this.f20407z = enumC0274d;
        this.A = hVar;
    }

    public void a(com.fyber.inneractive.sdk.mraid.f fVar, String str) {
        String str2 = fVar.f17503a;
        com.fyber.inneractive.sdk.web.c cVar = this.f20365b;
        if (cVar != null) {
            cVar.a("window.mraidbridge.fireErrorEvent('" + str2 + "', '" + str + "');");
        }
    }

    public abstract boolean a(String str, p0 p0Var);

    @Override // com.fyber.inneractive.sdk.web.a
    public void b() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        com.fyber.inneractive.sdk.config.global.s sVar;
        com.fyber.inneractive.sdk.config.global.features.d dVar;
        WebSettings settings = this.f20365b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.J.f16882r && com.fyber.inneractive.sdk.util.r.a() && Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        if (this.f20368e && Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        com.fyber.inneractive.sdk.web.c cVar = this.f20365b;
        cVar.setHorizontalScrollBarEnabled(false);
        cVar.setHorizontalScrollbarOverlay(false);
        cVar.setVerticalScrollBarEnabled(false);
        cVar.setVerticalScrollbarOverlay(false);
        cVar.getSettings().setSupportZoom(false);
        com.fyber.inneractive.sdk.web.c cVar2 = this.f20365b;
        cVar2.getClass();
        if (Build.VERSION.SDK_INT < 18) {
            try {
                cVar2.getSettings().setPluginState(WebSettings.PluginState.ON);
            } catch (Exception unused) {
                IAlog.a("Failed to modify WebView plugin state.", new Object[0]);
            }
        }
        this.f20365b.setFocusable(true);
        this.f20365b.setBackgroundColor(0);
        m mVar = new m();
        this.f20366c = mVar;
        this.f20365b.setWebChromeClient(mVar);
        com.fyber.inneractive.sdk.flow.j jVar = this.f20385v;
        if (jVar == null || (sVar = jVar.f17241c) == null || (dVar = (com.fyber.inneractive.sdk.config.global.features.d) sVar.a(com.fyber.inneractive.sdk.config.global.features.d.class)) == null) {
            z10 = false;
            i10 = 500;
            i11 = 500;
            i12 = 2;
        } else {
            boolean a10 = dVar.a("agg_res", false);
            Integer b10 = dVar.b("agg_res_ct");
            int max = Math.max(b10 != null ? b10.intValue() : 500, 50);
            Integer b11 = dVar.b("agg_res_rt");
            int max2 = Math.max(b11 != null ? b11.intValue() : 500, 50);
            Integer b12 = dVar.b("agg_res_retries");
            i11 = max2;
            i12 = Math.max(b12 != null ? b12.intValue() : 2, 1);
            z10 = a10;
            i10 = max;
        }
        n nVar = new n(this, z10, i10, i11, i12);
        this.f20367d = nVar;
        this.f20365b.setWebViewClient(nVar);
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        } catch (Exception unused2) {
            IAlog.a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f20365b.setListener(this);
        this.f20406y = a0.LOADING;
        Context g10 = g();
        this.F = g10 instanceof Activity ? ((Activity) g10).getRequestedOrientation() : -1;
        this.T = new FrameLayout(g());
        this.U = new RelativeLayout(g());
        FrameLayout frameLayout = new FrameLayout(g());
        frameLayout.setBackgroundColor(-858993460);
        this.S = frameLayout;
        a(g10, false);
        this.f20365b.setOnKeyListener(new b());
    }

    public final Date c(String str) {
        Date date = null;
        int i10 = 0;
        while (true) {
            String[] strArr = X;
            if (i10 >= strArr.length) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i10], Locale.getDefault()).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
            i10++;
        }
        return date;
    }

    public final void d(boolean z10) {
        try {
            Activity activity = (Activity) g();
            if (activity != null) {
                if (z10 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                    activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
                } else {
                    activity.setRequestedOrientation(this.F);
                }
            }
        } catch (Exception unused) {
            IAlog.a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    public void f() {
        this.E = false;
        a0 a0Var = this.f20406y;
        a0 a0Var2 = a0.EXPANDED;
        if (a0Var != a0Var2 && a0Var != a0.RESIZED) {
            if (a0Var == a0.DEFAULT) {
                com.fyber.inneractive.sdk.web.c cVar = this.f20365b;
                if (cVar != null) {
                    cVar.setVisibility(4);
                }
                a0 a0Var3 = a0.HIDDEN;
                this.f20406y = a0Var3;
                a(new y(a0Var3));
            }
        } else {
            c(false);
            com.fyber.inneractive.sdk.web.c cVar2 = this.f20365b;
            if (cVar2 != null) {
                a0 a0Var4 = this.f20406y;
                if (a0Var4 == a0Var2) {
                    j();
                    ViewGroup viewGroup = (ViewGroup) this.S.getParent();
                    if (viewGroup != null) {
                        viewGroup.addView(this.f20365b, this.R, new FrameLayout.LayoutParams(this.V, this.W, 17));
                        viewGroup.removeView(this.S);
                        viewGroup.invalidate();
                        this.f20365b.requestLayout();
                    }
                    this.O = this.V;
                    this.P = this.W;
                } else if (a0Var4 == a0.RESIZED) {
                    this.O = this.V;
                    this.P = this.W;
                    cVar2.setLayoutParams(new FrameLayout.LayoutParams(this.V, this.W, 17));
                }
            }
            this.f20406y = a0.DEFAULT;
            d(false);
            a(new y(this.f20406y));
        }
        L l10 = this.f20370g;
        if (l10 != 0) {
            ((f) l10).a(this, this.f20406y);
        }
    }

    public final Context g() {
        com.fyber.inneractive.sdk.web.c cVar = this.f20365b;
        if (cVar != null) {
            return cVar.getContext();
        }
        return null;
    }

    public boolean h() {
        return this.f20406y == a0.EXPANDED;
    }

    public boolean i() {
        return this.f20406y == a0.RESIZED;
    }

    public final void j() {
        FrameLayout frameLayout = this.T;
        if (frameLayout == null || this.U == null) {
            return;
        }
        frameLayout.removeAllViewsInLayout();
        this.U.removeAllViewsInLayout();
        ViewGroup viewGroup = this.C;
        if (viewGroup != null) {
            viewGroup.removeView(this.U);
        }
    }

    public void k() {
        com.fyber.inneractive.sdk.measurement.f fVar;
        AdSession adSession;
        a.InterfaceC0237a interfaceC0237a = this.f20405x;
        if (interfaceC0237a == null || (adSession = (fVar = (com.fyber.inneractive.sdk.measurement.f) interfaceC0237a).f17334b) == null) {
            return;
        }
        try {
            adSession.finish();
        } catch (Throwable th) {
            fVar.a(th);
        }
        com.fyber.inneractive.sdk.util.n.f20310b.postDelayed(new com.fyber.inneractive.sdk.measurement.e(fVar), Constants.MIN_PROGRESS_TIME);
        fVar.f17334b = null;
        fVar.f17335c = null;
    }

    public void setAdDefaultSize(int i10, int i11) {
        this.V = i10;
        this.W = i11;
        this.O = i10;
        this.P = i11;
    }

    public void setOrientationProperties(boolean z10, String str) {
        if (DtbDeviceDataRetriever.ORIENTATION_PORTRAIT.equals(str)) {
            this.Q = Orientation.PORTRAIT;
        } else if (DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE.equals(str)) {
            this.Q = Orientation.LANDSCAPE;
        } else {
            this.Q = Orientation.NONE;
        }
        L l10 = this.f20370g;
        if (l10 != 0) {
            ((f) l10).a(this, z10, this.Q);
        }
    }

    public void setResizeProperties() {
    }

    public void c(boolean z10) {
        if (this.C == null) {
            return;
        }
        if (z10) {
            int b10 = com.fyber.inneractive.sdk.util.l.b(35);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b10, b10);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.rightMargin = com.fyber.inneractive.sdk.util.l.b(10);
            layoutParams.topMargin = com.fyber.inneractive.sdk.util.l.b(10);
            if (this.H == null) {
                IAcloseButton iAcloseButton = new IAcloseButton(g(), b10, true);
                this.H = iAcloseButton;
                iAcloseButton.setOnClickListener(new a());
            }
            com.fyber.inneractive.sdk.util.s.a(this.H);
            this.U.addView(this.H, layoutParams);
        } else {
            this.U.removeView(this.H);
        }
        L l10 = this.f20370g;
        if (l10 != 0) {
            ((f) l10).a(this, z10);
        }
        this.I = !z10;
    }

    @Override // com.fyber.inneractive.sdk.web.a
    public void a(boolean z10) {
        Handler handler = com.fyber.inneractive.sdk.util.n.f20310b;
        handler.post(new com.fyber.inneractive.sdk.web.g(this));
        com.fyber.inneractive.sdk.web.c cVar = this.D;
        if (cVar != null && cVar.getParent() != null && (this.D.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.D.getParent()).removeView(this.D);
            this.D = null;
        }
        j();
        this.f20364a = false;
        AsyncTask<Void, Void, String> asyncTask = this.f20381r;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        com.fyber.inneractive.sdk.web.c cVar2 = this.f20365b;
        if (cVar2 != null) {
            f0.d.f20270a.a(cVar2);
            com.fyber.inneractive.sdk.util.s.a(this.f20365b);
            this.f20365b.setWebChromeClient(null);
            this.f20365b.setWebViewClient(null);
            if (((IAmraidWebViewController) this).f20405x == null) {
                this.f20365b.destroy();
            }
        }
        n nVar = this.f20367d;
        if (nVar != null) {
            nVar.f20440e = null;
        }
        Runnable runnable = this.f20377n;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f20376m;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
        this.f20370g = null;
        if (!z10) {
            this.f20369f = null;
        }
        this.f20365b = null;
        this.f20366c = null;
        this.f20367d = null;
        this.f20385v = null;
        this.f20384u = null;
    }

    public boolean a(WebView webView, String str) {
        p0 lastClickedLocation;
        com.fyber.inneractive.sdk.web.c cVar;
        IAlog.a("%shandle url for: %s webView = %s", IAlog.a(this), str, webView);
        a0 a0Var = this.f20406y;
        a0 a0Var2 = a0.EXPANDED;
        if (a0Var == a0Var2 && !TextUtils.isEmpty(str) && webView.equals(this.D) && !this.E) {
            this.E = true;
            return false;
        }
        IAlog.a("%shandleUrl called with: %s", IAlog.a(this), str);
        if (this.f20365b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        if (r0.a(str)) {
            this.f20365b.loadUrl("chrome://crash");
        } else {
            if (this.f20406y == a0Var2 && (cVar = this.D) != null) {
                lastClickedLocation = cVar.getLastClickedLocation();
            } else {
                com.fyber.inneractive.sdk.web.c cVar2 = this.f20365b;
                lastClickedLocation = cVar2 != null ? cVar2.getLastClickedLocation() : p0.a();
            }
            if (!a(str, lastClickedLocation)) {
                a(new a.g(str, lastClickedLocation));
            }
        }
        return true;
    }

    public final void a(Context context, boolean z10) {
        int i10;
        int i11;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.J = displayMetrics.density;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i11 = rect.top;
            i10 = window.findViewById(16908290).getTop() - i11;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i12 = displayMetrics.widthPixels;
        int i13 = displayMetrics.heightPixels;
        double d10 = i12;
        double d11 = 160.0d / displayMetrics.densityDpi;
        int i14 = (int) (d10 * d11);
        int i15 = (int) (i13 * d11);
        int i16 = (i13 - i11) - i10;
        if (this.f20365b.getScaleX() != 1.0f && this.f20365b.getScaleY() != 1.0f) {
            i14 = this.f20365b.getWidthDp();
            i15 = this.f20365b.getHeightDp();
            int b10 = (com.fyber.inneractive.sdk.util.l.b(this.f20365b.getHeightDp()) - i11) - i10;
            this.M = this.K;
            this.N = (int) (b10 * (160.0d / displayMetrics.densityDpi));
        } else {
            double d12 = 160.0d / displayMetrics.densityDpi;
            this.M = (int) (d10 * d12);
            this.N = (int) (i16 * d12);
        }
        if (this.K == i14 && this.L == i15) {
            return;
        }
        this.K = i14;
        this.L = i15;
        if (z10) {
            a(new x(i14, i15));
            a(new v(this.M, this.N));
            a(new com.fyber.inneractive.sdk.mraid.u(0, 0, this.M, this.N));
            int i17 = this.O;
            if (i17 > 0 && this.P > 0) {
                a(new com.fyber.inneractive.sdk.mraid.s(com.fyber.inneractive.sdk.util.l.c(i17), com.fyber.inneractive.sdk.util.l.c(this.P)));
                return;
            }
            com.fyber.inneractive.sdk.web.c cVar = this.f20365b;
            if (cVar == null || cVar.getWidth() <= 0 || this.f20365b.getHeight() <= 0) {
                return;
            }
            a(new com.fyber.inneractive.sdk.mraid.s(com.fyber.inneractive.sdk.util.l.c(this.f20365b.getWidth()), com.fyber.inneractive.sdk.util.l.c(this.f20365b.getHeight())));
        }
    }

    public void b(boolean z10) {
        this.I = z10;
        L l10 = this.f20370g;
        if (l10 != 0) {
            ((f) l10).a(this, z10);
        }
    }

    public void b(String str) {
        com.fyber.inneractive.sdk.web.c cVar = this.f20365b;
        if (cVar != null) {
            cVar.a("window.mraidbridge.nativeCallComplete('" + str + "');");
        }
    }

    public final Map<String, Object> a(Map<String, String> map) throws Exception {
        String str;
        HashMap hashMap = new HashMap();
        if (map.containsKey("description") && map.containsKey("start")) {
            hashMap.put("title", map.get("description"));
            if (map.containsKey("start") && map.get("start") != null) {
                Date c10 = c(map.get("start"));
                if (c10 != null) {
                    hashMap.put("beginTime", Long.valueOf(c10.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        Date c11 = c(map.get("end"));
                        if (c11 != null) {
                            hashMap.put("endTime", Long.valueOf(c11.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey("location")) {
                        hashMap.put("eventLocation", map.get("location"));
                    }
                    if (map.containsKey("summary")) {
                        hashMap.put("description", map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        hashMap.put("availability", Integer.valueOf("transparent".equals(map.get("transparency")) ? 1 : 0));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (map.containsKey("frequency")) {
                        String str2 = map.get("frequency");
                        int parseInt = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
                        if ("daily".equals(str2)) {
                            sb2.append("FREQ=DAILY;");
                            if (parseInt != -1) {
                                sb2.append("INTERVAL=" + parseInt + ";");
                            }
                        } else {
                            if ("weekly".equals(str2)) {
                                sb2.append("FREQ=WEEKLY;");
                                if (parseInt != -1) {
                                    sb2.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInWeek")) {
                                    StringBuilder sb3 = new StringBuilder();
                                    boolean[] zArr = new boolean[7];
                                    String[] split = map.get("daysInWeek").split(",");
                                    for (String str3 : split) {
                                        int parseInt2 = Integer.parseInt(str3);
                                        if (parseInt2 == 7) {
                                            parseInt2 = 0;
                                        }
                                        if (!zArr[parseInt2]) {
                                            StringBuilder sb4 = new StringBuilder();
                                            switch (parseInt2) {
                                                case 0:
                                                    str = "SU";
                                                    break;
                                                case 1:
                                                    str = "MO";
                                                    break;
                                                case 2:
                                                    str = "TU";
                                                    break;
                                                case 3:
                                                    str = "WE";
                                                    break;
                                                case 4:
                                                    str = "TH";
                                                    break;
                                                case 5:
                                                    str = "FR";
                                                    break;
                                                case 6:
                                                    str = "SA";
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException("invalid day of week " + parseInt2);
                                            }
                                            sb4.append(str);
                                            sb4.append(",");
                                            sb3.append(sb4.toString());
                                            zArr[parseInt2] = true;
                                        }
                                    }
                                    if (split.length != 0) {
                                        sb3.deleteCharAt(sb3.length() - 1);
                                        String sb5 = sb3.toString();
                                        if (sb5 == null) {
                                            throw new IllegalArgumentException("invalid ");
                                        }
                                        sb2.append("BYDAY=" + sb5 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                                    }
                                }
                            } else if ("monthly".equals(str2)) {
                                sb2.append("FREQ=MONTHLY;");
                                if (parseInt != -1) {
                                    sb2.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInMonth")) {
                                    StringBuilder sb6 = new StringBuilder();
                                    boolean[] zArr2 = new boolean[63];
                                    String[] split2 = map.get("daysInMonth").split(",");
                                    for (String str4 : split2) {
                                        int parseInt3 = Integer.parseInt(str4);
                                        int i10 = parseInt3 + 31;
                                        if (!zArr2[i10]) {
                                            StringBuilder sb7 = new StringBuilder();
                                            if (parseInt3 != 0 && parseInt3 >= -31 && parseInt3 <= 31) {
                                                sb7.append("" + parseInt3);
                                                sb7.append(",");
                                                sb6.append(sb7.toString());
                                                zArr2[i10] = true;
                                            } else {
                                                throw new IllegalArgumentException("invalid day of month " + parseInt3);
                                            }
                                        }
                                    }
                                    if (split2.length != 0) {
                                        sb6.deleteCharAt(sb6.length() - 1);
                                        String sb8 = sb6.toString();
                                        if (sb8 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        sb2.append("BYMONTHDAY=" + sb8 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                            }
                        }
                    }
                    String sb9 = sb2.toString();
                    if (!TextUtils.isEmpty(sb9)) {
                        hashMap.put("rrule", sb9);
                    }
                    return hashMap;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new IllegalArgumentException("Missing start and description fields");
    }

    public final void a(String str) {
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        i0 i0Var = new i0(new c(), str);
        IAConfigManager.J.f16884t.f17705a.offer(i0Var);
        i0Var.a(m0.QUEUED);
    }

    public void a(com.fyber.inneractive.sdk.mraid.t tVar) {
        if (this.f20365b != null) {
            String str = "{" + tVar.toString() + "}";
            this.f20365b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.d("Fire changes: %s", str);
        }
    }

    public final Map<String, String> a(URI uri) throws UnsupportedEncodingException {
        String[] split;
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split("&")) {
                int indexOf = str.indexOf("=");
                linkedHashMap.put(indexOf > 0 ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i10 = indexOf + 1)) ? null : URLDecoder.decode(str.substring(i10), "UTF-8"));
            }
        }
        return linkedHashMap;
    }
}
