package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import com.applovin.sdk.AppLovinUserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    protected static Context f8533a;

    /* renamed from: c  reason: collision with root package name */
    private static a f8534c;
    private q A;
    private com.applovin.impl.sdk.d.c B;
    private y C;
    private s D;
    private com.applovin.impl.sdk.network.d E;
    private i F;
    private com.applovin.impl.sdk.utils.n G;
    private h H;
    private n I;
    private com.applovin.impl.sdk.a.f J;
    private u K;
    private PostbackServiceImpl L;
    private com.applovin.impl.sdk.network.f M;
    private e N;
    private com.applovin.impl.mediation.f O;
    private com.applovin.impl.mediation.e P;
    private MediationServiceImpl Q;
    private com.applovin.impl.mediation.h R;
    private com.applovin.impl.mediation.debugger.a S;
    private w T;
    private com.applovin.impl.mediation.d U;
    private com.applovin.impl.mediation.debugger.ui.testmode.b V;
    private List<MaxAdFormat> W;
    private final Object X = new Object();
    private final AtomicBoolean Y = new AtomicBoolean(true);
    private boolean Z = false;

    /* renamed from: aa  reason: collision with root package name */
    private boolean f8535aa = false;

    /* renamed from: ab  reason: collision with root package name */
    private boolean f8536ab = false;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8537ac = false;

    /* renamed from: ad  reason: collision with root package name */
    private int f8538ad = 0;

    /* renamed from: ae  reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f8539ae;

    /* renamed from: af  reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f8540af;
    private AppLovinSdkConfiguration ag;

    /* renamed from: b  reason: collision with root package name */
    protected com.applovin.impl.sdk.c.c f8541b;

    /* renamed from: d  reason: collision with root package name */
    private String f8542d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<Activity> f8543e;

    /* renamed from: f  reason: collision with root package name */
    private long f8544f;

    /* renamed from: g  reason: collision with root package name */
    private AppLovinSdkSettings f8545g;

    /* renamed from: h  reason: collision with root package name */
    private AppLovinUserSegment f8546h;

    /* renamed from: i  reason: collision with root package name */
    private AppLovinTargetingData f8547i;

    /* renamed from: j  reason: collision with root package name */
    private String f8548j;

    /* renamed from: k  reason: collision with root package name */
    private AppLovinAdServiceImpl f8549k;

    /* renamed from: l  reason: collision with root package name */
    private AppLovinNativeAdService f8550l;

    /* renamed from: m  reason: collision with root package name */
    private EventServiceImpl f8551m;

    /* renamed from: n  reason: collision with root package name */
    private UserServiceImpl f8552n;

    /* renamed from: o  reason: collision with root package name */
    private VariableServiceImpl f8553o;

    /* renamed from: p  reason: collision with root package name */
    private AppLovinSdk f8554p;

    /* renamed from: q  reason: collision with root package name */
    private v f8555q;

    /* renamed from: r  reason: collision with root package name */
    private com.applovin.impl.sdk.e.o f8556r;

    /* renamed from: s  reason: collision with root package name */
    private com.applovin.impl.sdk.network.b f8557s;

    /* renamed from: t  reason: collision with root package name */
    private com.applovin.impl.sdk.d.g f8558t;

    /* renamed from: u  reason: collision with root package name */
    private o f8559u;

    /* renamed from: v  reason: collision with root package name */
    private com.applovin.impl.sdk.c.e f8560v;

    /* renamed from: w  reason: collision with root package name */
    private l f8561w;

    /* renamed from: x  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.p f8562x;

    /* renamed from: y  reason: collision with root package name */
    private c f8563y;

    /* renamed from: z  reason: collision with root package name */
    private r f8564z;

    public static Context M() {
        return f8533a;
    }

    public static a a(Context context) {
        if (f8534c == null) {
            f8534c = new a(context);
        }
        return f8534c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        if (v.a()) {
            for (String str : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
                v.i("AppLovinSdk", str);
            }
        }
    }

    private void ao() {
        this.E.a(new d.a() { // from class: com.applovin.impl.sdk.m.5
            @Override // com.applovin.impl.sdk.network.d.a
            public void a() {
                if (v.a()) {
                    m.this.f8555q.c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                }
                synchronized (m.this.X) {
                    if (!m.this.Z) {
                        m.this.b();
                    }
                }
                m.this.E.b(this);
            }

            @Override // com.applovin.impl.sdk.network.d.a
            public void b() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MaxAdFormat> b(JSONObject jSONObject) {
        List<String> asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        for (String str : asList) {
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(str);
            if (formatFromString != null) {
                arrayList.add(formatFromString);
            }
        }
        return arrayList;
    }

    public v A() {
        return this.f8555q;
    }

    public e B() {
        return this.N;
    }

    public com.applovin.impl.mediation.f C() {
        return this.O;
    }

    public com.applovin.impl.mediation.e D() {
        return this.P;
    }

    public MediationServiceImpl E() {
        return this.Q;
    }

    public w F() {
        return this.T;
    }

    public com.applovin.impl.mediation.debugger.a G() {
        return this.S;
    }

    public com.applovin.impl.mediation.h H() {
        return this.R;
    }

    public com.applovin.impl.mediation.d I() {
        return this.U;
    }

    public com.applovin.impl.mediation.debugger.ui.testmode.b J() {
        return this.V;
    }

    public com.applovin.impl.sdk.c.c K() {
        return this.f8541b;
    }

    public Context L() {
        return f8533a;
    }

    public Activity N() {
        WeakReference<Activity> weakReference = this.f8543e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public long O() {
        return this.f8544f;
    }

    public boolean P() {
        return this.f8536ab;
    }

    public boolean Q() {
        return this.f8537ac;
    }

    public com.applovin.impl.sdk.network.b R() {
        return this.f8557s;
    }

    public com.applovin.impl.sdk.e.o S() {
        return this.f8556r;
    }

    public com.applovin.impl.sdk.d.g T() {
        return this.f8558t;
    }

    public com.applovin.impl.sdk.network.f U() {
        return this.M;
    }

    public o V() {
        return this.f8559u;
    }

    public l W() {
        return this.f8561w;
    }

    public PostbackServiceImpl X() {
        return this.L;
    }

    public AppLovinSdk Y() {
        return this.f8554p;
    }

    public c Z() {
        return this.f8563y;
    }

    public <T> T a(com.applovin.impl.sdk.c.b<T> bVar) {
        return (T) this.f8541b.a(bVar);
    }

    public <T> T a(com.applovin.impl.sdk.c.d<T> dVar) {
        return (T) b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) null);
    }

    public <T> T a(String str, T t10, Class<?> cls, SharedPreferences sharedPreferences) {
        return (T) com.applovin.impl.sdk.c.e.a(str, t10, cls, sharedPreferences);
    }

    public void a() {
        synchronized (this.X) {
            if (!this.Z && !this.f8535aa) {
                b();
            }
        }
    }

    public void a(long j10) {
        this.f8561w.a(j10);
    }

    public void a(SharedPreferences sharedPreferences) {
        this.f8560v.a(sharedPreferences);
    }

    public void a(com.applovin.impl.mediation.a.f fVar) {
        if (this.f8556r.a()) {
            return;
        }
        List<String> b10 = b(com.applovin.impl.sdk.c.a.f8165a);
        if (b10.size() <= 0 || !this.P.b().containsAll(b10)) {
            return;
        }
        if (v.a()) {
            this.f8555q.b("AppLovinSdk", "All required adapters initialized");
        }
        this.f8556r.d();
        j();
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t10) {
        this.f8560v.a(dVar, t10);
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        this.f8560v.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t10, sharedPreferences);
    }

    public void a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!d()) {
            this.f8539ae = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.m.1
                @Override // java.lang.Runnable
                public void run() {
                    sdkInitializationListener.onSdkInitialized(m.this.ag);
                }
            });
        }
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f8554p = appLovinSdk;
    }

    public void a(String str) {
        if (v.a()) {
            v.f("AppLovinSdk", "Setting plugin version: " + str);
        }
        this.f8541b.a(com.applovin.impl.sdk.c.b.dz, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0282, code lost:
        if (com.applovin.sdk.AppLovinSdk.VERSION_CODE > com.applovin.impl.sdk.utils.Utils.toVersionCode(r7)) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r7, com.applovin.sdk.AppLovinSdkSettings r8, android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.lang.String, com.applovin.sdk.AppLovinSdkSettings, android.content.Context):void");
    }

    public <T> void a(String str, T t10, SharedPreferences.Editor editor) {
        this.f8560v.a(str, (String) t10, editor);
    }

    public void a(boolean z10) {
        synchronized (this.X) {
            this.Z = false;
            this.f8535aa = z10;
        }
        if (this.f8541b == null || this.f8556r == null) {
            return;
        }
        List<String> b10 = b(com.applovin.impl.sdk.c.a.f8165a);
        if (b10.isEmpty()) {
            this.f8556r.d();
            j();
            return;
        }
        long longValue = ((Long) a(com.applovin.impl.sdk.c.a.f8166b)).longValue();
        com.applovin.impl.sdk.e.z zVar = new com.applovin.impl.sdk.e.z(this, true, new Runnable() { // from class: com.applovin.impl.sdk.m.2
            @Override // java.lang.Runnable
            public void run() {
                if (m.this.f8556r.a()) {
                    return;
                }
                if (v.a()) {
                    m.this.f8555q.b("AppLovinSdk", "Timing out adapters init...");
                }
                m.this.f8556r.d();
                m.this.j();
            }
        });
        if (v.a()) {
            v vVar = this.f8555q;
            vVar.b("AppLovinSdk", "Waiting for required adapters to init: " + b10 + " - timing out in " + longValue + "ms...");
        }
        this.f8556r.a(zVar, o.a.MEDIATION_TIMEOUT, longValue, true);
    }

    public boolean a(com.applovin.impl.sdk.c.b<String> bVar, MaxAdFormat maxAdFormat) {
        return c(bVar).contains(maxAdFormat);
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.W;
        return (list == null || list.size() <= 0 || this.W.contains(maxAdFormat)) ? false : true;
    }

    public r aa() {
        return this.f8564z;
    }

    public q ab() {
        return this.A;
    }

    public com.applovin.impl.sdk.d.c ac() {
        return this.B;
    }

    public y ad() {
        return this.C;
    }

    public s ae() {
        return this.D;
    }

    public a af() {
        return f8534c;
    }

    public i ag() {
        return this.F;
    }

    public com.applovin.impl.sdk.utils.n ah() {
        return this.G;
    }

    public h ai() {
        return this.H;
    }

    public AppLovinBroadcastManager aj() {
        return AppLovinBroadcastManager.getInstance(f8533a);
    }

    public n ak() {
        return this.I;
    }

    public com.applovin.impl.sdk.a.f al() {
        return this.J;
    }

    public u am() {
        return this.K;
    }

    public Activity an() {
        Activity a10 = a(f8533a).a();
        if (a10 != null) {
            return a10;
        }
        Activity N = N();
        if (N != null) {
            return N;
        }
        return null;
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t10) {
        return (T) this.f8560v.b(dVar, t10);
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        return (T) this.f8560v.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<T>>) dVar, (com.applovin.impl.sdk.c.d<T>) t10, sharedPreferences);
    }

    public List<String> b(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.f8541b.b(bVar);
    }

    public void b() {
        synchronized (this.X) {
            this.Z = true;
            S().c();
            int i10 = this.f8538ad + 1;
            this.f8538ad = i10;
            S().a(new com.applovin.impl.sdk.e.i(i10, this, new i.a() { // from class: com.applovin.impl.sdk.m.3
                @Override // com.applovin.impl.sdk.e.i.a
                public void a(JSONObject jSONObject) {
                    boolean z10 = jSONObject.length() > 0;
                    com.applovin.impl.sdk.utils.h.d(jSONObject, m.this);
                    com.applovin.impl.sdk.utils.h.c(jSONObject, m.this);
                    f.a(m.this);
                    com.applovin.impl.sdk.utils.h.e(jSONObject, m.this);
                    com.applovin.impl.sdk.utils.h.a(jSONObject, z10, m.this);
                    com.applovin.impl.mediation.d.b.a(jSONObject, m.this);
                    com.applovin.impl.mediation.d.b.b(jSONObject, m.this);
                    m.this.G().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
                    m mVar = m.this;
                    mVar.W = mVar.b(jSONObject);
                    com.applovin.impl.sdk.utils.h.f(jSONObject, m.this);
                    m.this.J().a(jSONObject);
                    m.this.a(jSONObject);
                    m.this.S().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.n(m.this));
                }
            }), o.a.MAIN, ((Integer) a(com.applovin.impl.sdk.c.b.dV)).intValue());
        }
    }

    public <T> void b(com.applovin.impl.sdk.c.d<T> dVar) {
        this.f8560v.a(dVar);
    }

    public void b(String str) {
        if (v.a()) {
            v vVar = this.f8555q;
            vVar.b("AppLovinSdk", "Setting user id: " + str);
        }
        if (StringUtils.isValidString(str) && str.length() > Utils.kilobytesToByes(8)) {
            v.i("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + Utils.kilobytesToByes(8) + " maximum)");
        }
        this.f8562x.a(str);
    }

    public List<MaxAdFormat> c(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.f8541b.c(bVar);
    }

    public void c(String str) {
        this.f8548j = str;
        b(com.applovin.impl.sdk.c.d.A);
    }

    public boolean c() {
        boolean z10;
        synchronized (this.X) {
            z10 = this.Z;
        }
        return z10;
    }

    public boolean d() {
        boolean z10;
        synchronized (this.X) {
            z10 = this.f8535aa;
        }
        return z10;
    }

    public boolean e() {
        return "HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(z());
    }

    public boolean f() {
        return StringUtils.containsIgnoreCase(t(), "max");
    }

    public boolean g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    public void h() {
        String str = (String) this.f8560v.b(com.applovin.impl.sdk.c.d.f8233c, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE >= Utils.toVersionCode(str) || !v.a()) {
                return;
            }
            v.i("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
        }
    }

    public void i() {
        this.F.a();
    }

    public void j() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.f8539ae;
        if (sdkInitializationListener != null) {
            if (d()) {
                this.f8539ae = null;
                this.f8540af = null;
                this.P.a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else if (this.f8540af == sdkInitializationListener) {
                return;
            } else {
                this.P.a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) a(com.applovin.impl.sdk.c.b.aj)).booleanValue()) {
                    this.f8539ae = null;
                } else {
                    this.f8540af = sdkInitializationListener;
                }
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.m.4
                @Override // java.lang.Runnable
                public void run() {
                    if (v.a()) {
                        m.this.f8555q.b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                    }
                    sdkInitializationListener.onSdkInitialized(m.this.ag);
                }
            }, Math.max(0L, ((Long) a(com.applovin.impl.sdk.c.b.ak)).longValue()));
        }
    }

    public void k() {
        if (v.a()) {
            v.i("AppLovinSdk", "Resetting SDK state...");
        }
        com.applovin.impl.sdk.d.g gVar = this.f8558t;
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f8324g;
        long b10 = gVar.b(fVar);
        this.f8541b.c();
        this.f8541b.a();
        this.f8558t.a();
        this.f8558t.b(fVar, b10 + 1);
        if (this.Y.compareAndSet(true, false)) {
            b();
        } else {
            this.Y.set(true);
        }
    }

    public void l() {
        this.S.c();
    }

    public String m() {
        return this.f8562x.a();
    }

    public String n() {
        return this.f8562x.b();
    }

    public String o() {
        return this.f8562x.c();
    }

    public AppLovinSdkSettings p() {
        return this.f8545g;
    }

    public AppLovinUserSegment q() {
        return this.f8546h;
    }

    public AppLovinTargetingDataImpl r() {
        return (AppLovinTargetingDataImpl) this.f8547i;
    }

    public AppLovinSdkConfiguration s() {
        return this.ag;
    }

    public String t() {
        String str = (String) a(com.applovin.impl.sdk.c.d.A);
        return StringUtils.isValidString(str) ? str : this.f8548j;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f8542d + "', enabled=" + this.f8535aa + ", isFirstSession=" + this.f8536ab + '}';
    }

    public AppLovinAdServiceImpl u() {
        return this.f8549k;
    }

    public AppLovinNativeAdService v() {
        return this.f8550l;
    }

    public AppLovinEventService w() {
        return this.f8551m;
    }

    public AppLovinUserService x() {
        return this.f8552n;
    }

    public VariableServiceImpl y() {
        return this.f8553o;
    }

    public String z() {
        return this.f8542d;
    }
}
