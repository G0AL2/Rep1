package com.bytedance.sdk.openadsdk.j;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: PlayablePlugin.java */
/* loaded from: classes.dex */
public class g {
    private WeakReference<View> A;
    private e B;
    private com.bytedance.sdk.openadsdk.j.a C;
    private c D;
    private String H;
    private String I;
    private String J;
    private JSONObject L;
    private String M;
    private JSONObject N;
    private float O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private String Z;

    /* renamed from: aa  reason: collision with root package name */
    private boolean f13392aa;

    /* renamed from: ab  reason: collision with root package name */
    private boolean f13393ab;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f13394ac;

    /* renamed from: ad  reason: collision with root package name */
    private boolean f13395ad;

    /* renamed from: ae  reason: collision with root package name */
    private String f13396ae;

    /* renamed from: af  reason: collision with root package name */
    private String f13397af;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f13398b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f13399c;

    /* renamed from: e  reason: collision with root package name */
    private TimerTask f13401e;

    /* renamed from: f  reason: collision with root package name */
    private b f13402f;

    /* renamed from: y  reason: collision with root package name */
    private Context f13421y;

    /* renamed from: z  reason: collision with root package name */
    private WebView f13422z;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f13391a = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private Timer f13400d = new Timer();

    /* renamed from: g  reason: collision with root package name */
    private boolean f13403g = true;

    /* renamed from: h  reason: collision with root package name */
    private Set<String> f13404h = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));

    /* renamed from: i  reason: collision with root package name */
    private String f13405i = null;

    /* renamed from: j  reason: collision with root package name */
    private String f13406j = "embeded_ad";

    /* renamed from: k  reason: collision with root package name */
    private boolean f13407k = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f13408l = true;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13409m = true;

    /* renamed from: n  reason: collision with root package name */
    private long f13410n = 10;

    /* renamed from: o  reason: collision with root package name */
    private long f13411o = 10;

    /* renamed from: p  reason: collision with root package name */
    private long f13412p = 0;

    /* renamed from: q  reason: collision with root package name */
    private long f13413q = 0;

    /* renamed from: r  reason: collision with root package name */
    private long f13414r = -1;

    /* renamed from: s  reason: collision with root package name */
    private long f13415s = -1;

    /* renamed from: t  reason: collision with root package name */
    private long f13416t = -1;

    /* renamed from: u  reason: collision with root package name */
    private long f13417u = -1;

    /* renamed from: v  reason: collision with root package name */
    private int f13418v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f13419w = 0;
    private int E = 0;
    private int F = 0;
    private JSONObject G = new JSONObject();
    private Map<String, String> K = new HashMap();
    private boolean ag = false;
    private ViewTreeObserver.OnGlobalLayoutListener ah = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.j.g.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                View view = (View) g.this.A.get();
                if (view == null) {
                    return;
                }
                g.this.b(view);
            } catch (Throwable th) {
                f.a("PlayablePlugin", "onSizeChanged error", th);
            }
        }
    };

    /* renamed from: x  reason: collision with root package name */
    private a f13420x = a.MAIN;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlayablePlugin.java */
    /* renamed from: com.bytedance.sdk.openadsdk.j.g$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 extends TimerTask {
        AnonymousClass4() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            g.this.f13391a.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.j.g.4.1
                @Override // java.lang.Runnable
                public void run() {
                    if (Build.VERSION.SDK_INT < 19 || g.this.f13422z == null) {
                        return;
                    }
                    g.this.f13422z.evaluateJavascript("javascript:playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.j.g.4.1.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: a */
                        public void onReceiveValue(String str) {
                            if (g.this.f13402f != null) {
                                g.this.f13402f.a(System.currentTimeMillis());
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlayablePlugin.java */
    /* loaded from: classes.dex */
    public enum a {
        MAIN,
        RIFLE
    }

    private g(Context context, WebView webView, c cVar, com.bytedance.sdk.openadsdk.j.a aVar) {
        this.f13422z = webView;
        h.a(webView);
        a(webView);
        a(context, cVar, aVar);
        x();
    }

    static /* synthetic */ int h(g gVar) {
        int i10 = gVar.f13418v;
        gVar.f13418v = i10 + 1;
        return i10;
    }

    private void x() {
        this.f13402f = new b(this);
        this.f13398b = new Runnable() { // from class: com.bytedance.sdk.openadsdk.j.g.2
            @Override // java.lang.Runnable
            public void run() {
                if (g.this.f13408l) {
                    g.this.f13408l = false;
                    g.this.f13391a.removeCallbacks(g.this.f13399c);
                    g.this.a(2, "容器加载超时");
                }
            }
        };
        this.f13399c = new Runnable() { // from class: com.bytedance.sdk.openadsdk.j.g.3
            @Override // java.lang.Runnable
            public void run() {
                if (g.this.f13408l) {
                    g.this.f13408l = false;
                    g.this.f13391a.removeCallbacks(g.this.f13398b);
                    g.this.a(3, "JSSDK加载超时");
                }
            }
        };
        this.f13401e = new AnonymousClass4();
    }

    private boolean y() {
        String str = this.M;
        if (str != null) {
            return str.contains("/union-fe/playable/") || this.M.contains("/union-fe-sg/playable/") || this.M.contains("/union-fe-i18n/playable/");
        }
        return false;
    }

    public boolean i() {
        return this.f13393ab;
    }

    public Set<String> j() {
        return this.B.a();
    }

    public d k() {
        return this.C.a();
    }

    public com.bytedance.sdk.openadsdk.j.a l() {
        return this.C;
    }

    public JSONObject m() {
        return this.G;
    }

    public JSONObject n() {
        return this.L;
    }

    public JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.O);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.P);
            jSONObject2.put("height", this.Q);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.S);
            jSONObject3.put("y", this.R);
            jSONObject3.put("width", this.T);
            jSONObject3.put("height", this.U);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.W);
            jSONObject4.put("y", this.V);
            jSONObject4.put("width", this.X);
            jSONObject4.put("height", this.Y);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public void p() {
        this.C.b();
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
        this.f13391a.removeCallbacks(this.f13398b);
        this.f13391a.removeCallbacks(this.f13399c);
    }

    public void t() {
        f.a("Playable_CrashMonitor", "-- 检测到页面卡顿超过2s  需要上报");
        d("PL_sdk_page_stuck", null);
        Timer timer = this.f13400d;
        if (timer != null) {
            timer.cancel();
        }
    }

    public void u() {
        this.O = 0.0f;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
    }

    public void v() {
        if (this.ag) {
            return;
        }
        this.ag = true;
        this.f13413q = 0L;
        u();
        try {
            View view = this.A.get();
            if (view != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this.ah);
                } else {
                    view.getViewTreeObserver().removeGlobalOnLayoutListener(this.ah);
                }
            }
        } catch (Throwable unused) {
        }
        try {
            this.B.b();
        } catch (Throwable unused2) {
        }
        try {
            Timer timer = this.f13400d;
            if (timer != null) {
                timer.cancel();
            }
            b bVar = this.f13402f;
            if (bVar != null) {
                bVar.a();
                this.f13402f = null;
            }
        } catch (Throwable th) {
            f.a("Playable_CrashMonitor", "发生crash -- " + th);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_all_times", this.f13418v);
            jSONObject.put("playable_hit_times", this.f13419w);
            d("PL_sdk_preload_times", jSONObject);
        } catch (Throwable unused3) {
        }
        try {
            if (this.f13414r != -1) {
                long currentTimeMillis = System.currentTimeMillis() - this.f13414r;
                f.a("PlayablePlugin", "playable show time +" + currentTimeMillis);
                this.f13412p = this.f13412p + currentTimeMillis;
                this.f13414r = -1L;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playable_user_play_duration", this.f13412p);
            d("PL_sdk_user_play_duration", jSONObject2);
        } catch (Throwable unused4) {
        }
    }

    public String w() {
        return "function playable_callJS(){return \"Android调用了JS的callJS方法\";}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.E == view.getWidth() && this.F == view.getHeight()) {
                return;
            }
            this.E = view.getWidth();
            this.F = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.E);
            jSONObject.put("height", this.F);
            a("resize", jSONObject);
            this.G = jSONObject;
        } catch (Throwable th) {
            f.a("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public JSONObject c() {
        return this.N;
    }

    public String d() {
        return this.I;
    }

    public String e() {
        return this.H;
    }

    public String f() {
        return this.J;
    }

    public String g() {
        return this.Z;
    }

    public boolean h() {
        return this.f13392aa;
    }

    public void i(String str) {
        this.f13391a.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.j.g.6
            @Override // java.lang.Runnable
            public void run() {
                g.h(g.this);
            }
        });
    }

    public g c(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.N = jSONObject;
        } catch (Throwable th) {
            f.a("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public g d(String str) {
        this.J = str;
        return this;
    }

    public g e(String str) {
        this.Z = str;
        return this;
    }

    public g f(String str) {
        if (str != null) {
            try {
                int indexOf = str.indexOf("?");
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                }
            } catch (Throwable unused) {
            }
        }
        this.M = str;
        return this;
    }

    public void g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f13416t = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j10 = this.f13415s;
            jSONObject.put("playable_page_show_duration", j10 != -1 ? this.f13416t - j10 : 0L);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        d("PL_sdk_html_load_start", jSONObject);
        if (this.f13407k && this.f13420x == a.MAIN) {
            this.f13391a.postDelayed(this.f13398b, this.f13410n * 1000);
            this.f13391a.postDelayed(this.f13399c, this.f13411o * 1000);
            this.f13407k = false;
        }
    }

    public void h(String str) {
        b bVar;
        JSONObject jSONObject = new JSONObject();
        try {
            this.f13417u = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j10 = this.f13416t;
            jSONObject.put("playable_html_load_start_duration", j10 != -1 ? this.f13417u - j10 : 0L);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "reportUrlLoadFinish error", th);
        }
        d("PL_sdk_html_load_finish", jSONObject);
        this.f13391a.removeCallbacks(this.f13398b);
        if (Build.VERSION.SDK_INT >= 19 && this.f13403g) {
            this.f13403g = false;
            this.f13422z.evaluateJavascript(w(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.j.g.5
                @Override // android.webkit.ValueCallback
                /* renamed from: a */
                public void onReceiveValue(String str2) {
                    f.a("Playable_CrashMonitor", "加载注入js=" + str2);
                }
            });
        }
        try {
            if (this.f13420x == a.MAIN && this.f13409m && (bVar = this.f13402f) != null) {
                this.f13409m = false;
                bVar.a(System.currentTimeMillis());
                this.f13400d.schedule(this.f13401e, 0L, 1500L);
                this.f13402f.a(1000);
            }
        } catch (Throwable th2) {
            f.a("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    private void a(Context context, c cVar, com.bytedance.sdk.openadsdk.j.a aVar) {
        this.f13405i = UUID.randomUUID().toString();
        this.f13421y = context;
        this.B = new e(this);
        this.C = aVar;
        this.D = cVar;
    }

    private void d(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.f13393ab);
            jSONObject.put("playable_session_id", this.f13405i);
            a aVar = this.f13420x;
            a aVar2 = a.MAIN;
            if (aVar == aVar2) {
                jSONObject.put("playable_url", this.M);
            } else {
                jSONObject.put("playable_url", b(this.f13396ae, this.f13397af));
            }
            jSONObject.put("playable_is_prerender", this.f13395ad);
            jSONObject.put("playable_render_type", this.f13420x.ordinal());
            jSONObject.put("playable_sdk_version", "5.2.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.f13406j);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.L.opt("cid"));
            jSONObject2.put("log_extra", this.L.opt("log_extra"));
            if (this.C != null) {
                if (this.f13420x == aVar2 && y()) {
                    f.a("PlayablePlugin", "reportEvent by ActionProxy");
                    this.C.a("playable_track", jSONObject2);
                    this.C.c(jSONObject);
                    return;
                } else if (this.f13420x != aVar2) {
                    f.a("PlayablePlugin", "reportEvent by ActionProxy");
                    this.C.a("playable_track", jSONObject2);
                    this.C.c(jSONObject);
                    return;
                } else {
                    f.a("PlayablePlugin", "reportEvent error no not playable url");
                    return;
                }
            }
            f.a("PlayablePlugin", "reportEvent error no impl");
        } catch (Throwable th) {
            f.a("PlayablePlugin", "reportEvent error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(JSONObject jSONObject) {
        this.C.f(jSONObject);
    }

    public g c(boolean z10) {
        this.f13394ac = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.f13394ac);
            a("change_playable_click", jSONObject);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public void a(View view) {
        if (view == null) {
            return;
        }
        try {
            this.A = new WeakReference<>(view);
            b(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.ah);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public Map<String, String> b() {
        return this.K;
    }

    public g b(String str) {
        this.I = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(JSONObject jSONObject) {
        this.C.d(jSONObject);
    }

    public Context a() {
        return this.f13421y;
    }

    public g b(boolean z10) {
        if (this.f13393ab == z10) {
            return this;
        }
        this.f13393ab = z10;
        d(z10 ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", null);
        if (this.f13415s == -1 && this.f13393ab) {
            this.f13415s = System.currentTimeMillis();
            d("PL_sdk_page_show", null);
        }
        if (this.f13393ab) {
            this.f13414r = System.currentTimeMillis();
        } else if (this.f13414r != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f13414r;
            f.a("PlayablePlugin", "playable show time +" + currentTimeMillis);
            this.f13412p = this.f13412p + currentTimeMillis;
            this.f13414r = -1L;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", this.f13393ab);
            a("viewableChange", jSONObject);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "setViewable error", th);
        }
        return this;
    }

    public JSONObject c(String str, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        if (f.a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PlayablePlugin JSB-REQ [");
            sb2.append(str);
            sb2.append("] ");
            sb2.append(jSONObject != null ? jSONObject.toString() : "");
            f.a("PlayablePlugin", sb2.toString());
        }
        JSONObject a10 = this.B.a(str, jSONObject);
        if (f.a()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("PlayablePlugin JSB-RSP [");
            sb3.append(str);
            sb3.append("] time:");
            sb3.append(System.currentTimeMillis() - currentTimeMillis);
            sb3.append(" ");
            sb3.append(a10 != null ? a10.toString() : "");
            f.a("PlayablePlugin", sb3.toString());
        }
        return a10;
    }

    public g a(String str, String str2) {
        this.K.put(str, str2);
        return this;
    }

    public g a(String str) {
        this.H = str;
        return this;
    }

    public g a(boolean z10) {
        this.f13392aa = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.f13392aa);
            a("volumeChange", jSONObject);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    public void a(String str, JSONObject jSONObject) {
        if (f.a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CALL JS [");
            sb2.append(str);
            sb2.append("] ");
            sb2.append(jSONObject != null ? jSONObject.toString() : "");
            f.a("PlayablePlugin", sb2.toString());
        }
        c cVar = this.D;
        if (cVar != null) {
            cVar.a(str, jSONObject);
        }
    }

    public g a(JSONObject jSONObject) {
        this.L = jSONObject;
        return this;
    }

    protected void a(int i10, String str) {
        b(i10, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "reportRenderFatal error", th);
        }
        d("PL_sdk_global_faild", jSONObject);
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optBoolean("success", true) || !this.f13408l) {
            return;
        }
        this.f13408l = false;
        this.f13391a.removeCallbacks(this.f13398b);
        this.f13391a.removeCallbacks(this.f13399c);
        a(4, "素材渲染失败");
    }

    public void a(int i10, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
            jSONObject.put("description", str);
            jSONObject.put("failingUrl", str2);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "onWebReceivedError error", th);
        }
        d("PL_sdk_html_load_error", jSONObject);
        if (this.f13408l) {
            this.f13408l = false;
            this.f13391a.removeCallbacks(this.f13398b);
            this.f13391a.removeCallbacks(this.f13399c);
            a(1, "容器加载失败");
        }
    }

    private void b(int i10, String str) {
        if (this.C == null || !y()) {
            return;
        }
        this.C.a(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(JSONObject jSONObject) {
        this.C.e(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d(str, jSONObject);
    }

    private String b(String str, String str2) {
        return String.format("rubeex://playable-lynx?accessKey=%1s&groupId=%2s&cardId=main", str, str2);
    }

    public void a(boolean z10, String str, int i10) {
        if (z10) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
                jSONObject.put("failingUrl", str);
            } catch (Throwable th) {
                f.a("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            d("PL_sdk_html_load_error", jSONObject);
            if (this.f13408l) {
                this.f13408l = false;
                this.f13391a.removeCallbacks(this.f13398b);
                this.f13391a.removeCallbacks(this.f13399c);
                a(1, "容器加载失败");
            }
        }
    }

    public static g a(Context context, WebView webView, c cVar, com.bytedance.sdk.openadsdk.j.a aVar) {
        if (webView == null || cVar == null || aVar == null) {
            return null;
        }
        return new g(context, webView, cVar, aVar);
    }
}
