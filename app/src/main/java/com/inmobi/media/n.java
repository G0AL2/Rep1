package com.inmobi.media;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.eg;
import com.inmobi.media.eu;
import com.inmobi.media.j;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: NativeAdContainer.java */
/* loaded from: classes3.dex */
public class n implements Application.ActivityLifecycleCallbacks, j {

    /* renamed from: x  reason: collision with root package name */
    private static final String f25895x = n.class.getSimpleName();
    private fc B;
    private n D;
    private n G;
    private s H;
    private hq J;

    /* renamed from: a  reason: collision with root package name */
    protected bx f25896a;

    /* renamed from: b  reason: collision with root package name */
    fq f25897b;

    /* renamed from: c  reason: collision with root package name */
    public final String f25898c;

    /* renamed from: d  reason: collision with root package name */
    public final long f25899d;

    /* renamed from: e  reason: collision with root package name */
    public final String f25900e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f25901f;

    /* renamed from: g  reason: collision with root package name */
    protected Set<du> f25902g;

    /* renamed from: h  reason: collision with root package name */
    protected dw f25903h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f25904i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f25905j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f25906k;

    /* renamed from: l  reason: collision with root package name */
    public n f25907l;

    /* renamed from: m  reason: collision with root package name */
    protected c f25908m;

    /* renamed from: o  reason: collision with root package name */
    WeakReference<Activity> f25910o;

    /* renamed from: t  reason: collision with root package name */
    public q f25915t;

    /* renamed from: u  reason: collision with root package name */
    public q f25916u;

    /* renamed from: v  reason: collision with root package name */
    public byte f25917v;

    /* renamed from: y  reason: collision with root package name */
    private byte f25919y;

    /* renamed from: z  reason: collision with root package name */
    private Set<Integer> f25920z = new HashSet();
    private List<bt> A = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    protected WeakReference<Context> f25909n = new WeakReference<>(null);
    private int C = -1;

    /* renamed from: p  reason: collision with root package name */
    boolean f25911p = false;

    /* renamed from: q  reason: collision with root package name */
    public int f25912q = 0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f25913r = false;
    private bt E = null;
    private String F = null;

    /* renamed from: s  reason: collision with root package name */
    Intent f25914s = null;
    private final j.a I = new j.a() { // from class: com.inmobi.media.n.1
        @Override // com.inmobi.media.j.a
        public final void a() {
            String unused = n.f25895x;
            c e10 = n.this.e();
            if (e10 != null) {
                e10.a();
            }
        }

        @Override // com.inmobi.media.j.a
        public final void b(Object obj) {
            c e10 = n.this.e();
            if (e10 != null) {
                e10.f();
            }
        }

        @Override // com.inmobi.media.j.a
        public final void a(Object obj) {
            c e10;
            if (n.this.l() == null || (e10 = n.this.e()) == null) {
                return;
            }
            e10.b();
        }
    };
    private af<n> K = new af<n>(this) { // from class: com.inmobi.media.n.3
        @Override // com.inmobi.media.af
        public final void a() {
            n nVar = n.this;
            if (!nVar.f25905j && nVar.getPlacementType() == 0 && n.this.f25896a.f24851c) {
                String unused = n.f25895x;
                n.a(n.this);
            }
        }
    };

    /* renamed from: w  reason: collision with root package name */
    public final eg.a f25918w = new eg.a() { // from class: com.inmobi.media.n.5
        @Override // com.inmobi.media.eg.a
        public final void a(View view, boolean z10) {
            n.this.a(z10);
        }
    };
    private final f L = new f() { // from class: com.inmobi.media.n.6
        @Override // com.inmobi.media.f
        public final void a(String str) {
            Context context = n.this.f25909n.get();
            if (context != null && hs.a(str)) {
                InMobiAdActivity.a((q) null);
                InMobiAdActivity.a(n.this.t());
                Intent intent = new Intent(context, InMobiAdActivity.class);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
                intent.putExtra("placementId", n.this.f25899d);
                intent.putExtra("creativeId", n.this.f25900e);
                intent.putExtra("impressionId", n.this.f25898c);
                intent.putExtra("allowAutoRedirection", n.this.f25901f);
                ho.a(context, intent);
            }
        }

        @Override // com.inmobi.media.f
        public final void b() {
            c e10 = n.this.e();
            if (e10 != null) {
                e10.f();
            }
        }

        @Override // com.inmobi.media.f
        public final void a() {
            c e10 = n.this.e();
            if (e10 != null) {
                e10.b();
            }
        }
    };

    /* compiled from: NativeAdContainer.java */
    /* loaded from: classes3.dex */
    final class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<n> f25933b;

        a(n nVar) {
            this.f25933b = new WeakReference<>(nVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            if (n.this.l() == null) {
                String unused = n.f25895x;
                return;
            }
            n nVar = this.f25933b.get();
            if (nVar == null || nVar.f25905j) {
                return;
            }
            try {
                bx h10 = nVar.h();
                if (n.this.l() != null && h10.f24853e.length() != 0) {
                    String unused2 = n.f25895x;
                    JSONObject b10 = h10.b();
                    if (b10 == null) {
                        return;
                    }
                    bx bxVar = new bx(n.this.getPlacementType(), b10, h10, n.this.getPlacementType() == 0, n.this.getAdConfig());
                    if (!bxVar.d()) {
                        String unused3 = n.f25895x;
                        return;
                    }
                    Activity l10 = n.this.l();
                    n nVar2 = n.this;
                    n a10 = b.a(l10, (byte) 0, bxVar, nVar2.f25898c, null, nVar2.f25897b, nVar2.f25899d, n.this.f25901f, n.this.f25900e);
                    String unused4 = n.f25895x;
                    a10.a((j) nVar);
                    a10.f25915t = nVar.f25915t;
                    nVar.G = a10;
                    return;
                }
                String unused5 = n.f25895x;
            } catch (Exception e10) {
                String unused6 = n.f25895x;
                gg.a().a(new hg(e10));
            }
        }
    }

    /* compiled from: NativeAdContainer.java */
    /* loaded from: classes3.dex */
    public static final class b {
        public static n a(Context context, byte b10, bx bxVar, String str, Set<du> set, fq fqVar, long j10, boolean z10, String str2) {
            if (bxVar.e().contains("VIDEO")) {
                return new o(context, b10, bxVar, str, set, fqVar, j10, z10, str2);
            }
            return new n(context, b10, bxVar, str, set, fqVar, j10, z10, str2);
        }
    }

    /* compiled from: NativeAdContainer.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void a(Map<String, String> map);

        void a(boolean z10);

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();

        void i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Context context, byte b10, bx bxVar, String str, Set<du> set, fq fqVar, long j10, boolean z10, String str2) {
        this.f25919y = b10;
        this.f25896a = bxVar;
        this.f25898c = str;
        this.f25899d = j10;
        this.f25901f = z10;
        this.f25900e = str2;
        a((j) this);
        this.f25904i = false;
        this.f25905j = false;
        this.f25897b = fqVar;
        if (set != null) {
            this.f25902g = new HashSet(set);
        }
        this.f25896a.f24852d.f24845z = System.currentTimeMillis();
        a(context);
        this.f25917v = (byte) -1;
        this.J = hq.a();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.n.4
            @Override // java.lang.Runnable
            public final void run() {
                n.this.J.a(n.this.hashCode(), n.this.K);
            }
        });
    }

    private Context A() {
        Activity l10 = l();
        return l10 == null ? this.f25909n.get() : l10;
    }

    private void v() {
        bv a10 = this.f25896a.a(0);
        if (this.f25920z.contains(0) || a10 == null) {
            return;
        }
        a(0, a10);
    }

    private void w() {
        fc y10 = y();
        if (y10 != null) {
            y10.f25346b.a();
        }
    }

    private void x() {
        fc y10 = y();
        if (y10 != null) {
            y10.f25346b.b();
        }
    }

    private fc y() {
        dw dwVar = this.f25903h;
        fb fbVar = dwVar == null ? null : (fb) dwVar.a();
        if (fbVar != null) {
            this.B = fbVar.f25339b;
        }
        return this.B;
    }

    private void z() {
        Context context = this.f25909n.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // com.inmobi.media.j
    public final void a() {
    }

    public final void a(Context context) {
        this.f25909n = new WeakReference<>(context);
        ho.a(context, this);
    }

    @Override // com.inmobi.media.j
    public void destroy() {
        if (this.f25905j) {
            return;
        }
        this.f25905j = true;
        this.C = -1;
        n nVar = this.D;
        if (nVar != null) {
            nVar.b();
        }
        this.f25905j = true;
        this.f25908m = null;
        fc y10 = y();
        if (y10 != null) {
            eu euVar = y10.f25346b;
            for (eu.a aVar : euVar.f25292a) {
                aVar.f25300a.cancel();
            }
            euVar.f25292a.clear();
            y10.a();
        }
        this.B = null;
        this.A.clear();
        dw dwVar = this.f25903h;
        if (dwVar != null) {
            dwVar.d();
            this.f25903h.e();
        }
        z();
        this.f25909n.clear();
        WeakReference<Activity> weakReference = this.f25910o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f25896a = null;
        this.f25915t = null;
        n nVar2 = this.G;
        if (nVar2 != null) {
            nVar2.destroy();
            this.G = null;
        }
        this.J.a(hashCode());
    }

    @Override // com.inmobi.media.j
    public fq getAdConfig() {
        return this.f25897b;
    }

    @Override // com.inmobi.media.j
    public /* bridge */ /* synthetic */ Object getDataModel() {
        return this.f25896a;
    }

    @Override // com.inmobi.media.j
    public j.a getFullScreenEventsListener() {
        return this.I;
    }

    @Override // com.inmobi.media.j
    public String getMarkupType() {
        return "inmobiJson";
    }

    @Override // com.inmobi.media.j
    public byte getPlacementType() {
        return this.f25919y;
    }

    @Override // com.inmobi.media.j
    public View getVideoContainerView() {
        return null;
    }

    @Override // com.inmobi.media.j
    @SuppressLint({"SwitchIntDef"})
    public dw getViewableAd() {
        Context j10 = j();
        if (this.f25903h == null && j10 != null) {
            g();
            this.f25903h = new ee(j10, this, new dy(this, this.f25915t));
            Set<du> set = this.f25902g;
            if (set != null) {
                for (du duVar : set) {
                    try {
                        if (duVar.f25178a == 3) {
                            ek ekVar = (ek) duVar.f25179b.get("omidAdSession");
                            if (duVar.f25179b.containsKey("deferred")) {
                                ((Boolean) duVar.f25179b.get("deferred")).booleanValue();
                            }
                            if (ekVar != null) {
                                if (this.f25917v == 0) {
                                    this.f25903h = new eo(this, this.f25903h, ekVar);
                                } else {
                                    this.f25903h = new ep(this, this.f25903h, ekVar);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        gg.a().a(new hg(e10));
                    }
                }
            }
        }
        return this.f25903h;
    }

    boolean i() {
        return getPlacementType() == 0 && l() != null;
    }

    public final Context j() {
        return (1 == getPlacementType() || i()) ? l() : this.f25909n.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean k() {
        return this.f25904i;
    }

    public final Activity l() {
        WeakReference<Activity> weakReference = this.f25910o;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        final n i10 = i(this);
        if (i10 == null) {
            return;
        }
        c cVar = i10.f25908m;
        if (cVar != null) {
            cVar.c();
        }
        this.J.a(hashCode(), new af<n>(this) { // from class: com.inmobi.media.n.8
            @Override // com.inmobi.media.af
            public final void a() {
                if (n.this.D == null) {
                    n.a(n.this);
                }
                int a10 = InMobiAdActivity.a((j) n.this.D);
                Intent intent = new Intent(n.this.f25909n.get(), InMobiAdActivity.class);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", a10);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 201);
                n nVar = n.this;
                if (nVar.f25913r) {
                    nVar.f25914s = intent;
                } else {
                    ho.a(nVar.f25909n.get(), intent);
                }
            }

            @Override // com.inmobi.media.af
            public final void b() {
                super.b();
                c e10 = i10.e();
                if (e10 != null) {
                    e10.a();
                }
            }
        });
    }

    boolean n() {
        return false;
    }

    public final void o() {
        Map<String, String> map;
        if (n()) {
            this.f25911p = true;
            c cVar = this.f25908m;
            if (cVar == null || (map = this.f25896a.f24855g) == null) {
                return;
            }
            cVar.a(map);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        dw dwVar = this.f25903h;
        if (dwVar != null) {
            dwVar.a(activity, (byte) 2);
        }
        z();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Context A = A();
        if (A == null || !A.equals(activity)) {
            return;
        }
        p();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Context A = A();
        if (A == null || !A.equals(activity)) {
            return;
        }
        q();
    }

    public final void p() {
        this.f25906k = false;
        d(f());
        w();
        dw dwVar = this.f25903h;
        if (dwVar != null) {
            dwVar.a(A(), (byte) 0);
        }
    }

    public void q() {
        this.f25906k = true;
        c(f());
        x();
        dw dwVar = this.f25903h;
        if (dwVar != null) {
            dwVar.a(A(), (byte) 1);
        }
    }

    public final void r() {
        String str;
        bt btVar = this.E;
        if (btVar != null && (str = this.F) != null) {
            a(btVar, btVar.f24817i, str);
        } else if (this.f25914s == null || this.f25909n.get() == null) {
        } else {
            ho.a(this.f25909n.get(), this.f25914s);
        }
    }

    public final void s() {
        new a(this).start();
    }

    @Override // com.inmobi.media.j
    public void setFullScreenActivityContext(Activity activity) {
        this.f25910o = new WeakReference<>(activity);
    }

    public final s t() {
        if (this.H == null) {
            this.H = new s() { // from class: com.inmobi.media.n.2
                @Override // com.inmobi.media.s
                public final void a() {
                    c e10 = n.this.e();
                    if (e10 != null) {
                        e10.a();
                    }
                }

                @Override // com.inmobi.media.s
                public final void a_(q qVar) {
                    c e10 = n.this.e();
                    if (e10 != null) {
                        e10.b();
                    }
                }

                @Override // com.inmobi.media.s
                public final void b_(q qVar) {
                    c e10 = n.this.e();
                    if (e10 != null) {
                        e10.f();
                    }
                }

                @Override // com.inmobi.media.s
                public final jh c_() {
                    return jh.a();
                }

                @Override // com.inmobi.media.s
                public final void d_() {
                    c e10 = n.this.e();
                    if (e10 == null || n.this.getPlacementType() != 0) {
                        return;
                    }
                    e10.c();
                }

                @Override // com.inmobi.media.s
                public final void a(HashMap<Object, Object> hashMap) {
                    c e10 = n.this.e();
                    if (e10 != null) {
                        e10.e();
                    }
                }

                @Override // com.inmobi.media.s, com.inmobi.media.t
                public final void a_() {
                    c e10 = n.this.e();
                    if (e10 != null) {
                        e10.g();
                    }
                }
            };
        }
        return this.H;
    }

    private static void b(bt btVar, Map<String, String> map) {
        if (btVar == null) {
            return;
        }
        btVar.a("page_view", map);
    }

    @Override // com.inmobi.media.j
    public final boolean c() {
        return this.f25905j;
    }

    public final Context d() {
        return this.f25909n.get();
    }

    public final c e() {
        return this.f25908m;
    }

    public final View f() {
        dw dwVar = this.f25903h;
        if (dwVar == null) {
            return null;
        }
        return dwVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        Map<String, String> a10 = a(this.f25896a.f24852d);
        a((byte) 1, a10);
        a((byte) 2, a10);
    }

    public final bx h() {
        return this.f25896a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ce b(View view) {
        if (view != null) {
            return (ce) view.findViewWithTag("timerView");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void c(View view) {
        ce b10 = b(view);
        if (b10 != null) {
            b10.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(View view) {
        ValueAnimator valueAnimator;
        ce b10 = b(view);
        if (b10 == null || (valueAnimator = b10.f24904c) == null || valueAnimator.isRunning()) {
            return;
        }
        b10.f24904c.setCurrentPlayTime(b10.f24903b);
        b10.f24904c.start();
    }

    private static n i(n nVar) {
        n nVar2;
        while (nVar != null) {
            if (nVar.l() != null || nVar == (nVar2 = nVar.f25907l)) {
                return nVar;
            }
            nVar = nVar2;
        }
        return null;
    }

    public final void a(j jVar) {
        if (jVar instanceof n) {
            this.f25907l = (n) jVar;
        }
    }

    private void b(String str) {
        c cVar;
        Context context = this.f25909n.get();
        if (context == null) {
            return;
        }
        if (l() == null && (cVar = this.f25908m) != null) {
            cVar.c();
        }
        String a10 = h.a(context);
        try {
            try {
                boolean z10 = getAdConfig().cctEnabled;
                if (a10 != null && z10) {
                    new co(str, context, this.L).b();
                    return;
                }
                this.L.a(str);
            } catch (Exception unused) {
                hs.b(context, str);
            }
        } catch (URISyntaxException unused2) {
        }
    }

    public final void a(c cVar) {
        this.f25908m = cVar;
    }

    public final void c(bt btVar) {
        dm f10;
        n nVar = this.G;
        if (nVar != null && f() != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) f();
                View a10 = nVar.getViewableAd().a(null, viewGroup, false);
                if (a10 != null) {
                    viewGroup.addView(a10);
                    a10.setClickable(true);
                    nVar.w();
                    if (!(btVar instanceof cg) || (f10 = ((cg) btVar).b().f()) == null) {
                        return;
                    }
                    f10.f25127g = true;
                    return;
                }
                b();
                return;
            } catch (Exception e10) {
                b();
                gg.a().a(new hg(e10));
                return;
            }
        }
        hu.a((byte) 2, "InMobi", "Failed to show end card");
        b();
    }

    private bt a(bt btVar, bx bxVar, String str) {
        if (hs.a(this.f25909n.get(), str)) {
            return btVar;
        }
        String[] split = str.split("\\|");
        bt b10 = bxVar.b(split[0]);
        if (b10 == null) {
            return b(bxVar.f24854f, btVar);
        }
        if (b10.equals(btVar)) {
            return null;
        }
        if (1 != split.length && 2 != split.length) {
            b10.f24821m = bx.a(split[2]);
            return b10;
        }
        b10.f24821m = (byte) 1;
        return b10;
    }

    private bt b(bx bxVar, bt btVar) {
        if (bxVar == null) {
            return null;
        }
        String str = btVar.f24826r;
        String str2 = btVar.f24827s;
        bt a10 = str != null ? a(btVar, bxVar, str) : null;
        return (a10 != null || str2 == null) ? a10 : a(btVar, bxVar, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static byte a(String str) {
        char c10;
        String trim = str.toLowerCase(Locale.US).trim();
        switch (trim.hashCode()) {
            case -934641255:
                if (trim.equals("reload")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -934524953:
                if (trim.equals("replay")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 0:
                if (trim.equals("")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3127582:
                if (trim.equals("exit")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3443508:
                if (trim.equals("play")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 3532159:
                if (trim.equals("skip")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 110066619:
                if (trim.equals("fullscreen")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 2:
                return (byte) 2;
            case 3:
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 1;
            case 6:
                return (byte) 4;
            case 7:
                return (byte) 5;
            default:
                return (byte) 0;
        }
    }

    public final void a(bt btVar, boolean z10) {
        bt b10;
        dm f10;
        String str;
        bx bxVar = this.f25896a;
        if (!bxVar.f24858j || this.f25905j || (b10 = b(bxVar, btVar)) == null) {
            return;
        }
        Map<String, String> a10 = a(b10);
        b10.f24817i = btVar.f24817i;
        if ("VIDEO".equals(b10.f24810b) || b10.f24816h) {
            byte b11 = b10.f24817i;
            dw dwVar = this.f25903h;
            if (dwVar != null) {
                dwVar.a((byte) 4);
            }
            if (b11 == 0) {
                return;
            }
            String str2 = b10.f24826r;
            if (2 == b10.f24821m && (f10 = ((cg) b10).b().f()) != null && (str = f10.f25126e) != null && !str.trim().isEmpty()) {
                str2 = f10.f25126e;
            }
            if (!hs.a(A(), str2)) {
                str2 = b10.f24827s;
                if (!hs.a(A(), str2)) {
                    return;
                }
            }
            String a11 = hv.a(str2, a10);
            if (this.f25913r && !z10) {
                n i10 = i(this);
                if (i10 == null) {
                    return;
                }
                c cVar = i10.f25908m;
                if (cVar != null) {
                    if (1 == b11 && hs.a(a11)) {
                        cVar.c();
                    } else {
                        cVar.g();
                    }
                }
                this.E = b10;
                this.F = a11;
                return;
            }
            a(b10, b11, a11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(bt btVar) {
        fk fkVar;
        ValueAnimator valueAnimator;
        byte b10 = btVar.f24820l;
        if (b10 != 0) {
            if (b10 == 1) {
                try {
                    q qVar = this.f25915t;
                    if (qVar != null) {
                        qVar.d("window.imraid.broadcastEvent('close');");
                    }
                    b();
                } catch (Exception e10) {
                    hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
                    gg.a().a(new hg(e10));
                }
            } else if (b10 != 3) {
                if (b10 == 4) {
                    try {
                        if (getPlacementType() == 0) {
                            m();
                        }
                    } catch (Exception e11) {
                        hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in launching fullscreen ad");
                        gg.a().a(new hg(e11));
                    }
                } else if (b10 != 5) {
                    this.f25911p = true;
                    q qVar2 = this.f25915t;
                    if (qVar2 != null && qVar2 != null) {
                        qVar2.d("window.imraid.broadcastEvent('skip');");
                    }
                    c(f());
                    c(btVar);
                }
            } else {
                try {
                    q qVar3 = this.f25915t;
                    if (qVar3 != null) {
                        qVar3.d("window.imraid.broadcastEvent('replay');");
                    }
                    if (f() != null) {
                        View f10 = f();
                        ViewGroup viewGroup = (ViewGroup) f10.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(f10);
                        }
                    }
                    n nVar = this.f25907l;
                    ce b11 = b(nVar.f());
                    if (b11 != null && (valueAnimator = b11.f24904c) != null && valueAnimator.isRunning()) {
                        b11.f24904c.setCurrentPlayTime(b11.f24902a * 1000);
                        b11.a(1.0f);
                    }
                    if ("VIDEO".equals(btVar.f24810b) && (nVar instanceof o) && (fkVar = (fk) nVar.getVideoContainerView()) != null) {
                        fj videoView = fkVar.getVideoView();
                        cg cgVar = (cg) videoView.getTag();
                        if (cgVar != null) {
                            if (cgVar.a()) {
                                videoView.i();
                            } else {
                                videoView.h();
                            }
                        } else if (1 == getPlacementType()) {
                            videoView.i();
                        } else {
                            videoView.h();
                        }
                        a(cgVar);
                        videoView.start();
                    }
                } catch (Exception e12) {
                    hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                    gg.a().a(new hg(e12));
                }
            }
        }
    }

    public final void a(int i10, bt btVar) {
        if (this.f25920z.contains(Integer.valueOf(i10)) || this.f25905j) {
            return;
        }
        v();
        a(i10, (bv) btVar);
    }

    public final Map<String, String> a(bt btVar) {
        bx bxVar;
        HashMap hashMap = new HashMap(3);
        if (!this.f25905j && (bxVar = this.f25896a) != null) {
            hashMap.put("$LTS", String.valueOf(bxVar.f24852d.f24845z));
            bv a10 = bx.a(btVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (a10 != null) {
                long j10 = a10.f24845z;
                if (0 != j10) {
                    currentTimeMillis = j10;
                }
            }
            hashMap.put("$STS", String.valueOf(currentTimeMillis));
            hashMap.put("$TS", String.valueOf(System.currentTimeMillis()));
            hashMap.putAll(this.f25896a.a());
        }
        return hashMap;
    }

    @Override // com.inmobi.media.j
    public final void b() {
        n i10;
        fk fkVar;
        try {
            if (this.f25905j || (i10 = i(this)) == null) {
                return;
            }
            i10.o();
            InMobiAdActivity.a((Object) i10);
            if ((i10 instanceof o) && (fkVar = (fk) ((o) i10).getVideoContainerView()) != null) {
                fj videoView = fkVar.getVideoView();
                cg cgVar = (cg) videoView.getTag();
                cgVar.f24830v.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                cgVar.f24830v.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                bt btVar = cgVar.f24833y;
                if (btVar != null) {
                    ((cg) btVar).a(cgVar);
                }
                a(cgVar);
            }
            WeakReference<Activity> weakReference = i10.f25910o;
            Activity activity = weakReference == null ? null : weakReference.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).f24414b = true;
                activity.finish();
                int i11 = this.C;
                if (i11 != -1) {
                    activity.overridePendingTransition(0, i11);
                }
            }
            this.f25907l.D = null;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.n.9
                @Override // java.lang.Runnable
                public final void run() {
                    n.this.f25907l.J.a(n.this.f25907l.hashCode(), n.this.f25907l.K);
                }
            });
        } catch (Exception e10) {
            hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
            gg.a().a(new hg(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z10) {
        if (z10) {
            w();
        } else {
            x();
        }
    }

    private void a(cg cgVar) {
        dm f10 = cgVar.b().f();
        if (f10 == null || !f10.f25127g) {
            return;
        }
        for (cf cfVar : f10.a("closeEndCard")) {
            bt.a(cfVar, a((bt) cgVar));
        }
        f10.f25127g = false;
    }

    private void a(bt btVar, byte b10, String str) {
        if (1 == b10) {
            b(str);
        } else {
            a(str, btVar.f24827s, btVar);
        }
    }

    private void a(String str, String str2, bt btVar) {
        String a10;
        n i10;
        if (this.f25909n.get() == null || (a10 = hs.a(this.f25909n.get(), str, str2)) == null || (i10 = i(this)) == null) {
            return;
        }
        c cVar = i10.f25908m;
        if (cVar != null && !this.f25913r) {
            cVar.g();
        }
        if (a10.equals(str2)) {
            btVar.a("TRACKER_EVENT_TYPE_FALLBACK_URL", a(btVar));
        }
    }

    @Override // com.inmobi.media.j
    public final void a(byte b10, Map<String, String> map) {
        if (this.f25905j) {
            return;
        }
        if (b10 == 1) {
            this.f25896a.f24852d.a("load", map);
        } else if (b10 != 2) {
        } else {
            this.f25896a.f24852d.a("client_fill", map);
        }
    }

    private void a(int i10, bv bvVar) {
        if (this.f25905j) {
            return;
        }
        this.f25920z.add(Integer.valueOf(i10));
        bvVar.f24845z = System.currentTimeMillis();
        if (this.f25904i) {
            b(bvVar, a(bvVar));
        } else {
            this.A.add(bvVar);
        }
    }

    public static bt a(bx bxVar, bt btVar) {
        while (bxVar != null) {
            String str = btVar.f24818j;
            if (str != null && str.length() != 0) {
                String[] split = str.split("\\|");
                if (1 == split.length) {
                    btVar.f24820l = a(split[0]);
                    return btVar;
                }
                bt b10 = bxVar.b(split[0]);
                if (b10 == null) {
                    bxVar = bxVar.f24854f;
                } else if (b10.equals(btVar)) {
                    return null;
                } else {
                    b10.f24820l = a(split[1]);
                    return b10;
                }
            } else {
                btVar.f24820l = (byte) 0;
                return btVar;
            }
        }
        return null;
    }

    public final void a(View view, bt btVar) {
        c cVar;
        if (this.f25905j) {
            return;
        }
        v();
        bt b10 = b(this.f25896a, btVar);
        if (b10 != null) {
            Map<String, String> a10 = a(b10);
            a(b10, a10);
            if (!b10.equals(btVar)) {
                a(btVar, a10);
            }
        } else {
            a(btVar, a(btVar));
        }
        n i10 = i(this);
        if (i10 == null) {
            return;
        }
        if (!btVar.f24826r.trim().isEmpty() && (cVar = i10.f25908m) != null) {
            cVar.e();
        }
        bt a11 = a(this.f25896a, btVar);
        if (a11 != null) {
            if (view != null && "VIDEO".equals(a11.f24810b) && 5 == a11.f24820l) {
                view.setVisibility(4);
                btVar.f24832x = 4;
            }
            b(a11);
        }
    }

    public void a(View view) {
        c cVar;
        if (this.f25904i || this.f25905j) {
            return;
        }
        this.f25904i = true;
        bv bvVar = this.f25896a.f24852d;
        bvVar.a("Impression", a(bvVar));
        v();
        for (bt btVar : this.A) {
            b(btVar, a(btVar));
        }
        this.A.clear();
        this.f25903h.a((byte) 0);
        n i10 = i(this);
        if (i10 == null || (cVar = i10.f25908m) == null) {
            return;
        }
        cVar.d();
    }

    private static void a(bt btVar, Map<String, String> map) {
        if (2 == btVar.f24821m) {
            dm f10 = ((cg) btVar).b().f();
            if (f10 != null && (f10.f25126e != null || btVar.f24826r == null)) {
                if (f10.f25125d.size() > 0) {
                    for (cf cfVar : f10.a(au.CLICK_BEACON)) {
                        bt.a(cfVar, map);
                    }
                    return;
                }
                return;
            }
            btVar.a(au.CLICK_BEACON, map);
            return;
        }
        btVar.a(au.CLICK_BEACON, map);
    }

    public final void a(q qVar) {
        if (this.f25917v == 0 && this.f25916u == null && this.f25915t == null) {
            this.f25916u = qVar;
        }
    }

    static /* synthetic */ void a(n nVar) {
        JSONObject b10;
        bx bxVar = nVar.f25896a;
        if (bxVar.f24853e.length() == 0 || (b10 = bxVar.b()) == null) {
            return;
        }
        bx bxVar2 = new bx(nVar.getPlacementType(), b10, bxVar, nVar.getPlacementType() == 0, nVar.getAdConfig());
        bxVar2.f24851c = bxVar.f24851c;
        bxVar2.f24858j = bxVar.f24858j;
        Context context = nVar.f25909n.get();
        if (!bxVar2.d() || context == null) {
            return;
        }
        n a10 = b.a(context, (byte) 0, bxVar2, nVar.f25898c, nVar.f25902g, nVar.f25897b, nVar.f25899d, nVar.f25901f, nVar.f25900e);
        nVar.D = a10;
        a10.a((j) nVar);
        c cVar = nVar.f25908m;
        if (cVar != null) {
            nVar.D.f25908m = cVar;
        }
        if (bxVar.f24851c) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.n.7
                @Override // java.lang.Runnable
                public final void run() {
                    n.this.D.getViewableAd().a(null, new RelativeLayout(n.this.j()), false);
                }
            });
        }
    }
}
