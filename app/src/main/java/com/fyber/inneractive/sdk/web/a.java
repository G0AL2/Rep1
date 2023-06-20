package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.f0;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.c;
import com.fyber.inneractive.sdk.web.d;
import com.fyber.inneractive.sdk.web.o;
import com.fyber.inneractive.sdk.web.u;
import com.iab.omid.library.fyber.ScriptInjector;

/* loaded from: classes2.dex */
public abstract class a<L extends u> implements com.fyber.inneractive.sdk.web.b, f0.e, c.a, o.a {

    /* renamed from: b  reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.c f20365b;

    /* renamed from: c  reason: collision with root package name */
    public m f20366c;

    /* renamed from: d  reason: collision with root package name */
    public n f20367d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20368e;

    /* renamed from: f  reason: collision with root package name */
    public f f20369f;

    /* renamed from: g  reason: collision with root package name */
    public L f20370g;

    /* renamed from: j  reason: collision with root package name */
    public boolean f20373j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f20374k;

    /* renamed from: l  reason: collision with root package name */
    public e f20375l;

    /* renamed from: o  reason: collision with root package name */
    public Runnable f20378o;

    /* renamed from: p  reason: collision with root package name */
    public long f20379p;

    /* renamed from: q  reason: collision with root package name */
    public long f20380q;

    /* renamed from: r  reason: collision with root package name */
    public AsyncTask<Void, Void, String> f20381r;

    /* renamed from: s  reason: collision with root package name */
    public String f20382s;

    /* renamed from: t  reason: collision with root package name */
    public String f20383t;

    /* renamed from: u  reason: collision with root package name */
    public InneractiveAdRequest f20384u;

    /* renamed from: v  reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.j f20385v;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20364a = false;

    /* renamed from: h  reason: collision with root package name */
    public float f20371h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    public Rect f20372i = new Rect();

    /* renamed from: n  reason: collision with root package name */
    public final Runnable f20377n = new RunnableC0273a();

    /* renamed from: m  reason: collision with root package name */
    public final Runnable f20376m = new b();

    /* renamed from: com.fyber.inneractive.sdk.web.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0273a implements Runnable {
        public RunnableC0273a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAlog.d("Removing clicked state after timeout", new Object[0]);
            a.this.d();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f20374k) {
                IAlog.a("No user web action detected for : %s blocking.", aVar.f20375l);
                a aVar2 = a.this;
                String c10 = aVar2.f20375l.c();
                String a10 = a.this.f20375l.a();
                L l10 = aVar2.f20370g;
                if (l10 != null) {
                    l10.a(c10, a10);
                }
                int i10 = IAlog.f20222a;
                IAlog.a(1, null, "AD_AUTO_CLICK_DETECTED", new Object[0]);
                a.this.f20375l.b();
                a.this.d();
            } else {
                IAlog.a("User web action detected for: %s", aVar.f20375l);
                a.this.f20375l.d();
            }
            a.this.f20375l = null;
        }
    }

    /* loaded from: classes2.dex */
    public class c extends AsyncTask<Void, Void, String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20388a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f20389b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f20390c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f20391d;

        public c(String str, String str2, String str3, String str4) {
            this.f20388a = str;
            this.f20389b = str2;
            this.f20390c = str3;
            this.f20391d = str4;
        }

        @Override // android.os.AsyncTask
        public String doInBackground(Void[] voidArr) {
            long currentTimeMillis = System.currentTimeMillis();
            a aVar = a.this;
            String str = this.f20388a;
            String str2 = this.f20389b;
            String str3 = this.f20390c;
            IAmraidWebViewController iAmraidWebViewController = (IAmraidWebViewController) aVar;
            iAmraidWebViewController.getClass();
            System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder();
            String str4 = null;
            if (TextUtils.isEmpty(str)) {
                IAlog.a("loadHtml called with an empty HTML!", new Object[0]);
            } else {
                sb2.append("<html><head>");
                sb2.append("<link rel=\"icon\" href=\"data:,\">");
                if (iAmraidWebViewController.Y) {
                    String c10 = com.fyber.inneractive.sdk.util.l.c("ia_js_load_monitor.txt");
                    if (!TextUtils.isEmpty(c10)) {
                        sb2.append(c10);
                    }
                }
                sb2.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager = IAConfigManager.J;
                boolean a10 = iAConfigManager.f16886v.f16987b.a("use_js_inline", false);
                if (a10 && iAConfigManager.F.f16826b != null) {
                    sb2.append("<script type=\"text/javascript\">");
                    sb2.append(iAConfigManager.F.f16826b);
                    sb2.append("</script>");
                } else {
                    sb2.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js\"></script>");
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb2.append(str2);
                }
                sb2.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script>");
                sb2.append("</head>");
                sb2.append("<style>body{text-align:center !important;margin:0;padding:0;}");
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append(str3);
                }
                sb2.append("</style>");
                sb2.append("<body id=\"iaBody\">");
                if (iAmraidWebViewController.f20207c0) {
                    d.g gVar = iAmraidWebViewController.B;
                    if (gVar != null && gVar.equals(d.g.INTERSTITIAL)) {
                        if (a10 && iAConfigManager.F.f16827c != null) {
                            sb2.append("<style type=\"text/css\">");
                            sb2.append(iAConfigManager.F.f16827c);
                            sb2.append("</style>");
                        } else {
                            sb2.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                        }
                        if (a10 && iAConfigManager.F.f16828d != null) {
                            sb2.append("<script type=\"text/javascript\">");
                            sb2.append(iAConfigManager.F.f16828d);
                            sb2.append("</script>");
                        } else {
                            sb2.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                        }
                    }
                }
                String c11 = com.fyber.inneractive.sdk.util.l.c("ia_mraid_bridge.txt");
                if (!TextUtils.isEmpty(c11)) {
                    sb2.append("<div id='iaScriptBr' style='display:none;'>");
                    sb2.append(c11);
                    sb2.append("</div>");
                    if (IAlog.f20222a >= 2) {
                        sb2.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb2.append(str);
                sb2.append("</body></html>");
                com.fyber.inneractive.sdk.measurement.a aVar2 = iAmraidWebViewController.f20404w;
                if (aVar2 != null) {
                    str4 = sb2.toString();
                    com.fyber.inneractive.sdk.measurement.d dVar = (com.fyber.inneractive.sdk.measurement.d) aVar2;
                    if (!TextUtils.isEmpty(dVar.f17330b)) {
                        str4 = ScriptInjector.injectScriptContentIntoHtml(dVar.f17330b, str4);
                    }
                } else {
                    str4 = sb2.toString();
                }
            }
            a aVar3 = a.this;
            aVar3.getClass();
            IAlog.a("%sbuild html string took %d msec", IAlog.a(aVar3), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return str4;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            String str2 = str;
            String str3 = com.fyber.inneractive.sdk.util.r.a() ? "http://" : "https://";
            if (!TextUtils.isEmpty(str2) && !isCancelled()) {
                a.this.f20381r = null;
                if (!TextUtils.isEmpty(this.f20391d)) {
                    a aVar = a.this;
                    aVar.f20382s = str3 + this.f20391d;
                } else {
                    a aVar2 = a.this;
                    aVar2.f20382s = str3 + "wv.inner-active.mobi/";
                }
                a aVar3 = a.this;
                com.fyber.inneractive.sdk.web.c cVar = aVar3.f20365b;
                if (cVar != null) {
                    cVar.loadDataWithBaseURL(aVar3.f20382s, str2, "text/html", "utf-8", null);
                    a.this.f20383t = str2;
                    return;
                }
                InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
                f fVar = aVar3.f20369f;
                if (fVar != null) {
                    fVar.a(aVar3, inneractiveErrorCode);
                }
                aVar3.a(true);
            } else if (isCancelled()) {
            } else {
                a aVar4 = a.this;
                InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.SDK_INTERNAL_ERROR;
                f fVar2 = aVar4.f20369f;
                if (fVar2 != null) {
                    fVar2.a(aVar4, inneractiveErrorCode2);
                }
                aVar4.a(true);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            AsyncTask<Void, Void, String> asyncTask = aVar.f20381r;
            if (asyncTask != null) {
                asyncTask.cancel(true);
                aVar.f20381r = null;
            }
            IAlog.a("%sonLoadTimeout after %d msec", IAlog.a(aVar), Long.valueOf(aVar.f20379p));
            aVar.a(InneractiveErrorCode.LOAD_TIMEOUT);
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        String a();

        void b();

        String c();

        void d();
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(a aVar);

        void a(a aVar, InneractiveErrorCode inneractiveErrorCode);
    }

    /* loaded from: classes2.dex */
    public class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public String f20394a;

        /* renamed from: b  reason: collision with root package name */
        public p0 f20395b;

        public g(String str, p0 p0Var) {
            this.f20395b = p0Var;
            this.f20394a = str;
        }

        @Override // com.fyber.inneractive.sdk.web.a.e
        public String a() {
            return null;
        }

        @Override // com.fyber.inneractive.sdk.web.a.e
        public void b() {
        }

        @Override // com.fyber.inneractive.sdk.web.a.e
        public String c() {
            return "open";
        }

        @Override // com.fyber.inneractive.sdk.web.a.e
        public void d() {
            a aVar = a.this;
            String str = this.f20394a;
            p0 p0Var = this.f20395b;
            L l10 = aVar.f20370g;
            if (l10 != null) {
                d0.c cVar = l10.a(str, p0Var).f20243a;
            }
        }

        public String toString() {
            return "action: open url: " + this.f20394a;
        }
    }

    public a(Context context, boolean z10, boolean z11) {
        this.f20374k = z10;
        this.f20365b = a(context);
        this.f20368e = z11;
    }

    public void a(String str, String str2, String str3, String str4, f fVar, long j10) {
        this.f20369f = fVar;
        this.f20379p = j10;
        try {
            b();
            c cVar = new c(str2, str3, str4, str);
            this.f20381r = cVar;
            cVar.executeOnExecutor(com.fyber.inneractive.sdk.util.n.f20309a, new Void[0]);
            e();
        } catch (Throwable unused) {
            a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
    }

    public abstract void a(boolean z10);

    public abstract void b();

    public void c() {
        this.f20365b.setTapListener(this);
    }

    public void d() {
        IAlog.a("IAWebViewController resetClick()", new Object[0]);
        Runnable runnable = this.f20377n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f20376m;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable2);
        }
        this.f20373j = false;
    }

    public final void e() {
        IAlog.a("IAWebViewController: Starting load timeout with %d", Long.valueOf(this.f20379p));
        this.f20380q = System.currentTimeMillis();
        d dVar = new d();
        this.f20378o = dVar;
        com.fyber.inneractive.sdk.util.n.f20310b.postDelayed(dVar, this.f20379p);
    }

    public void setAdContent(com.fyber.inneractive.sdk.flow.j jVar) {
        this.f20385v = jVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f20384u = inneractiveAdRequest;
    }

    public void setListener(L l10) {
        this.f20370g = l10;
    }

    public com.fyber.inneractive.sdk.web.c a() {
        return this.f20365b;
    }

    public void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        com.fyber.inneractive.sdk.web.c cVar = this.f20365b;
        if (cVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(cVar, layoutParams);
            } else {
                viewGroup.addView(cVar);
            }
            f0.d.f20270a.a(viewGroup.getContext(), this.f20365b, this);
            this.f20365b.setTapListener(this);
        }
    }

    public com.fyber.inneractive.sdk.web.c a(Context context) {
        return new com.fyber.inneractive.sdk.web.c(context);
    }

    public final void a(InneractiveErrorCode inneractiveErrorCode) {
        f fVar = this.f20369f;
        if (fVar != null) {
            fVar.a(this, inneractiveErrorCode);
        }
        a(true);
    }

    @Override // com.fyber.inneractive.sdk.util.f0.e
    public void a(View view, float f10, Rect rect) {
        if (f10 == this.f20371h && rect.equals(this.f20372i)) {
            return;
        }
        this.f20371h = f10;
        this.f20372i.set(rect);
        com.fyber.inneractive.sdk.web.c cVar = this.f20365b;
        if (cVar != null) {
            cVar.a();
        }
    }

    public boolean a(e eVar) {
        IAlog.d("IAWebViewController Web view click detected", new Object[0]);
        if (this.f20373j) {
            IAlog.d("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            eVar.d();
            d();
            return true;
        }
        if (this.f20374k) {
            IAlog.d("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            Runnable runnable = this.f20376m;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable);
            }
            this.f20375l = null;
            this.f20375l = eVar;
            if (this.f20376m != null) {
                com.fyber.inneractive.sdk.util.n.f20310b.postDelayed(this.f20376m, IAConfigManager.J.f16886v.f16987b.a("click_timeout", 1000, 1000));
            }
        } else {
            Runnable runnable2 = this.f20376m;
            if (runnable2 != null) {
                com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable2);
            }
            this.f20375l = null;
            eVar.d();
        }
        return false;
    }
}
