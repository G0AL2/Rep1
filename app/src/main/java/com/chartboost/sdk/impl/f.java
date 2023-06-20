package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.chartboost.sdk.ChartboostBanner;
import com.chartboost.sdk.Events.BannerErrorMap;
import com.chartboost.sdk.Events.ChartboostError;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.ShowParamsModel;
import com.chartboost.sdk.b;
import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.s0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f implements g {
    private final Map<String, Long> A;
    private final Map<String, Integer> B;
    ScheduledFuture<?> C;
    private final long D;
    private final long E;
    private final String[] F;

    /* renamed from: a */
    public final ScheduledExecutorService f13966a;

    /* renamed from: b */
    private final j1 f13967b;

    /* renamed from: c */
    public final p1 f13968c;

    /* renamed from: d */
    private final com.chartboost.sdk.Networking.b f13969d;

    /* renamed from: e */
    private final r0 f13970e;

    /* renamed from: f */
    private final l2 f13971f;

    /* renamed from: g */
    private final AtomicReference<com.chartboost.sdk.Model.e> f13972g;

    /* renamed from: h */
    private final SharedPreferences f13973h;

    /* renamed from: i */
    final u2 f13974i;

    /* renamed from: j */
    final Handler f13975j;

    /* renamed from: k */
    final com.chartboost.sdk.b f13976k;

    /* renamed from: l */
    private final v0 f13977l;

    /* renamed from: m */
    private final com.chartboost.sdk.c f13978m;

    /* renamed from: n */
    private final x0 f13979n;

    /* renamed from: o */
    final com.chartboost.sdk.impl.c f13980o;

    /* renamed from: p */
    protected ChartboostBanner f13981p;

    /* renamed from: q */
    private final p2 f13982q;

    /* renamed from: r */
    private final Context f13983r;

    /* renamed from: s */
    private final h f13984s;

    /* renamed from: t */
    private final u0 f13985t;

    /* renamed from: u */
    int f13986u = 0;

    /* renamed from: v */
    private int f13987v;

    /* renamed from: w */
    private boolean f13988w;

    /* renamed from: x */
    final Map<String, n> f13989x;

    /* renamed from: y */
    final SortedSet<n> f13990y;

    /* renamed from: z */
    final SortedSet<n> f13991z;

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        public final int f13997a;

        /* renamed from: b */
        final String f13998b;

        /* renamed from: c */
        final n f13999c;

        /* renamed from: d */
        final com.chartboost.sdk.Model.c f14000d;

        /* renamed from: e */
        final CBError.CBImpressionError f14001e;

        public b(int i10, String str, n nVar, com.chartboost.sdk.Model.c cVar, CBError.CBImpressionError cBImpressionError) {
            f.this = r1;
            this.f13997a = i10;
            this.f13998b = str;
            this.f13999c = nVar;
            this.f14000d = cVar;
            this.f14001e = cBImpressionError;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (f.this) {
                    int i10 = this.f13997a;
                    if (i10 != 0) {
                        switch (i10) {
                            case 2:
                                f fVar = f.this;
                                fVar.C = null;
                                fVar.f();
                                break;
                            case 3:
                                f.this.c(this.f13998b);
                                break;
                            case 4:
                                f.this.i(this.f13998b);
                                break;
                            case 5:
                                f.this.a(this.f13999c, this.f14000d);
                                break;
                            case 6:
                                f.this.b(this.f13999c, this.f14001e);
                                break;
                            case 7:
                                f.this.i(this.f13999c);
                                break;
                            case 8:
                                f.this.e(this.f13998b);
                                break;
                        }
                    } else {
                        f.this.b();
                    }
                }
            } catch (Exception e10) {
                CBLogging.b("AdUnitManager", e10.toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        protected com.chartboost.sdk.Model.c f14003a;

        /* renamed from: b */
        protected CBError.CBImpressionError f14004b;

        public c(com.chartboost.sdk.Model.c cVar, CBError.CBImpressionError cBImpressionError) {
            this.f14003a = cVar;
            this.f14004b = cBImpressionError;
        }
    }

    public f(Context context, com.chartboost.sdk.impl.c cVar, ScheduledExecutorService scheduledExecutorService, j1 j1Var, p1 p1Var, com.chartboost.sdk.Networking.b bVar, r0 r0Var, l2 l2Var, AtomicReference<com.chartboost.sdk.Model.e> atomicReference, SharedPreferences sharedPreferences, u2 u2Var, Handler handler, com.chartboost.sdk.b bVar2, v0 v0Var, com.chartboost.sdk.c cVar2, x0 x0Var, p2 p2Var, h hVar, u0 u0Var) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.D = timeUnit.toNanos(1L);
        this.E = timeUnit.toNanos(1L);
        this.F = new String[]{"ASKED_TO_CACHE", "ASKED_TO_SHOW", "REQUESTING_TO_CACHE", "REQUESTING_TO_SHOW", "DOWNLOADING_TO_CACHE", "DOWNLOADING_TO_SHOW", "READY", "ASKING_UI_TO_SHOW_AD", "DONE"};
        this.f13983r = context;
        this.f13966a = scheduledExecutorService;
        this.f13967b = j1Var;
        this.f13968c = p1Var;
        this.f13969d = bVar;
        this.f13970e = r0Var;
        this.f13971f = l2Var;
        this.f13972g = atomicReference;
        this.f13973h = sharedPreferences;
        this.f13974i = u2Var;
        this.f13975j = handler;
        this.f13976k = bVar2;
        this.f13977l = v0Var;
        this.f13978m = cVar2;
        this.f13979n = x0Var;
        this.f13980o = cVar;
        this.f13982q = p2Var;
        this.f13984s = hVar;
        if (hVar != null) {
            hVar.a(this);
        }
        this.f13985t = u0Var;
        this.f13987v = 1;
        this.f13989x = new HashMap();
        this.f13991z = new TreeSet();
        this.f13990y = new TreeSet();
        this.A = new HashMap();
        this.B = new HashMap();
        this.f13988w = false;
    }

    public static /* synthetic */ void a(f fVar, n nVar, boolean z10, int i10, int i11) {
        fVar.a(nVar, z10, i10, i11);
    }

    private boolean a(SortedSet<n> sortedSet, int i10, int i11, int i12) {
        Iterator<n> it = sortedSet.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (next.f14207c == i10 && next.f14208d == null) {
                if (h(next.f14206b)) {
                    continue;
                } else if (!this.f13980o.b(next.f14206b)) {
                    next.f14207c = 8;
                    b(next);
                    this.f13989x.remove(next.f14206b);
                    it.remove();
                } else {
                    next.f14207c = i11;
                    it.remove();
                    a(next, i12);
                    return true;
                }
            } else {
                it.remove();
            }
        }
        return false;
    }

    private void d() {
        Long l10;
        if (this.f13986u == 1) {
            long b10 = this.f13974i.b();
            l10 = null;
            for (Map.Entry<String, Long> entry : this.A.entrySet()) {
                if (this.f13989x.get(entry.getKey()) != null) {
                    long max = Math.max(this.D, entry.getValue().longValue() - b10);
                    if (l10 == null || max < l10.longValue()) {
                        l10 = Long.valueOf(max);
                    }
                }
            }
        } else {
            l10 = null;
        }
        if (l10 != null && this.C != null) {
            if (Math.abs(l10.longValue() - this.C.getDelay(TimeUnit.NANOSECONDS)) <= this.D) {
                return;
            }
        }
        ScheduledFuture<?> scheduledFuture = this.C;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.C = null;
        }
        if (l10 != null) {
            this.C = this.f13966a.schedule(new b(2, null, null, null, null), l10.longValue(), TimeUnit.NANOSECONDS);
        }
    }

    private void e(final n nVar) {
        if (nVar == null || nVar.f14208d == null) {
            return;
        }
        int i10 = nVar.f14207c;
        if (i10 == 5 || i10 == 4) {
            int i11 = i10 == 5 ? 1 : 2;
            if (nVar.f14210f <= i11) {
                return;
            }
            o oVar = new o() { // from class: com.chartboost.sdk.impl.q3
                @Override // com.chartboost.sdk.impl.o
                public final void a(boolean z10, int i12, int i13) {
                    f.a(f.this, nVar, z10, i12, i13);
                }
            };
            nVar.f14210f = i11;
            this.f13967b.a(i11, nVar.f14208d.f13660a, new AtomicInteger(), (o) o1.a().a(oVar), this.f13980o.f13935b);
        }
    }

    private boolean h(String str) {
        return this.A.containsKey(str);
    }

    private void k(n nVar) {
        this.f13989x.remove(nVar.f14206b);
        b(nVar);
        nVar.f14207c = 8;
        nVar.f14208d = null;
    }

    private void l(n nVar) {
        if (!this.f13970e.e()) {
            c(nVar, CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        c c10 = c(nVar);
        a(nVar, c10.f14003a, c10.f14004b);
    }

    void b() {
        if (this.f13986u == 0) {
            this.f13986u = 1;
            f();
        }
    }

    public void c(String str) {
        if (e()) {
            com.chartboost.sdk.impl.c cVar = this.f13980o;
            Objects.requireNonNull(cVar);
            this.f13975j.postDelayed(new c.a(4, str, CBError.CBImpressionError.FIRST_SESSION_INTERSTITIALS_DISABLED, null, false, ""), this.E);
            return;
        }
        n nVar = this.f13989x.get(str);
        if (nVar != null && nVar.f14207c == 6 && !a(nVar.f14208d)) {
            this.f13989x.remove(str);
            b(nVar);
            nVar = null;
        }
        if (nVar == null) {
            int i10 = this.f13987v;
            this.f13987v = i10 + 1;
            nVar = new n(i10, str, 0);
            this.f13989x.put(str, nVar);
            this.f13990y.add(nVar);
        }
        if (!this.f13970e.e()) {
            c(nVar, CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_CACHE);
            return;
        }
        if (!nVar.f14217m) {
            nVar.f14217m = true;
            m1.d(new com.chartboost.sdk.Tracking.c("cache_start", "", this.f13980o.f13935b, str));
        }
        nVar.f14209e = true;
        if (nVar.f14211g == null) {
            nVar.f14211g = Long.valueOf(this.f13974i.b());
        }
        int i11 = nVar.f14207c;
        if (i11 == 6 || i11 == 7) {
            com.chartboost.sdk.Model.a aVar = nVar.f14208d;
            String str2 = aVar != null ? aVar.f13666g : "";
            Handler handler = this.f13975j;
            com.chartboost.sdk.impl.c cVar2 = this.f13980o;
            Objects.requireNonNull(cVar2);
            handler.post(new c.a(0, str, null, null, true, str2));
        }
        f();
    }

    void f() {
        if (this.f13988w) {
            return;
        }
        try {
            this.f13988w = true;
            c();
            if (this.f13986u == 1 && !a(this.f13991z, 1, 3, 1)) {
                a(this.f13990y, 0, 2, 2);
            }
            d();
        } finally {
            this.f13988w = false;
        }
    }

    public synchronized n g(String str) {
        return this.f13989x.get(str);
    }

    void i(String str) {
        if (e()) {
            com.chartboost.sdk.impl.c cVar = this.f13980o;
            Objects.requireNonNull(cVar);
            this.f13975j.postDelayed(new c.a(4, str, CBError.CBImpressionError.FIRST_SESSION_INTERSTITIALS_DISABLED, null, true, ""), this.E);
            return;
        }
        n nVar = this.f13989x.get(str);
        if (nVar == null) {
            m1.d(new com.chartboost.sdk.Tracking.c("cache_start", "", this.f13980o.f13935b, str));
            int i10 = this.f13987v;
            this.f13987v = i10 + 1;
            nVar = new n(i10, str, 1);
            this.f13989x.put(str, nVar);
            this.f13991z.add(nVar);
        }
        if (!this.f13970e.e()) {
            c(nVar, CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        if (!nVar.f14218n) {
            nVar.f14218n = true;
            m1.d(new com.chartboost.sdk.Tracking.c("show_start", "", this.f13980o.f13935b, str));
        }
        if (nVar.f14212h == null) {
            nVar.f14212h = Long.valueOf(this.f13974i.b());
        }
        int i11 = nVar.f14207c;
        if (i11 == 0) {
            this.f13990y.remove(nVar);
            this.f13991z.add(nVar);
            nVar.f14207c = 1;
        } else if (i11 == 2) {
            nVar.f14207c = 3;
        } else if (i11 == 4) {
            nVar.f14207c = 5;
            e(nVar);
        } else if (i11 == 6) {
            h hVar = this.f13984s;
            if (hVar != null && hVar.a(nVar.f14208d)) {
                this.f13984s.b(nVar);
            } else {
                l(nVar);
            }
        }
        f();
    }

    public void j(n nVar) {
        h hVar;
        if (nVar == null || (hVar = this.f13984s) == null || !hVar.a(nVar.f14208d)) {
            return;
        }
        this.f13984s.c(nVar);
    }

    private void g(n nVar) {
        CBError.CBImpressionError cBImpressionError = CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE;
        d(nVar, cBImpressionError);
        e(nVar, cBImpressionError);
        k(nVar);
        d(nVar);
    }

    private void h(n nVar) {
        int i10 = nVar.f14207c;
        long b10 = this.f13974i.b();
        Long l10 = nVar.f14211g;
        if (l10 != null) {
            TimeUnit.NANOSECONDS.toMillis(b10 - l10.longValue());
        }
        Long l11 = nVar.f14212h;
        if (l11 != null) {
            TimeUnit.NANOSECONDS.toMillis(b10 - l11.longValue());
        }
        nVar.f14207c = 6;
        if (nVar.f14209e) {
            com.chartboost.sdk.Model.a aVar = nVar.f14208d;
            String str = aVar != null ? aVar.f13666g : "";
            Handler handler = this.f13975j;
            com.chartboost.sdk.impl.c cVar = this.f13980o;
            Objects.requireNonNull(cVar);
            handler.post(new c.a(0, nVar.f14206b, null, null, false, str));
        } else {
            m1.d(new com.chartboost.sdk.Tracking.c("cache_on_show_finish_success", "", this.f13980o.f13935b, nVar.f14206b));
        }
        h hVar = this.f13984s;
        if (hVar != null && hVar.a(nVar.f14208d)) {
            nVar.f14207c = i10;
            this.f13984s.b(nVar);
        } else if (i10 == 5) {
            l(nVar);
        }
    }

    /* renamed from: b */
    public synchronized void a(n nVar, boolean z10, int i10, int i11) {
        int i12 = nVar.f14207c;
        if (i12 == 4 || i12 == 5) {
            if (z10) {
                h(nVar);
            } else {
                g(nVar);
            }
        }
        f();
    }

    private String b(com.chartboost.sdk.Model.a aVar, File file, String str) {
        return c(aVar, file, str);
    }

    private void e(n nVar, CBError.CBImpressionError cBImpressionError) {
        String str;
        c(nVar, cBImpressionError);
        if (cBImpressionError == CBError.CBImpressionError.NO_AD_FOUND || nVar == null) {
            return;
        }
        com.chartboost.sdk.Model.a aVar = nVar.f14208d;
        String str2 = aVar != null ? aVar.f13663d : null;
        int i10 = nVar.f14207c;
        String str3 = (i10 == 0 || i10 == 2 || i10 == 4) ? "cache" : "show";
        if (i10 >= 0) {
            String[] strArr = this.F;
            if (i10 < strArr.length) {
                str = strArr[i10];
                CBLogging.b("AdUnitManager", "reportError: adTypeTraits.name: " + this.f13980o.f13935b + " reason: " + str3 + " format: web error: " + cBImpressionError.toString() + " adId: " + str2 + " appRequest.location: " + nVar.f14206b + " stateName: " + str);
            }
        }
        str = "Unknown state: " + nVar.f14207c;
        CBLogging.b("AdUnitManager", "reportError: adTypeTraits.name: " + this.f13980o.f13935b + " reason: " + str3 + " format: web error: " + cBImpressionError.toString() + " adId: " + str2 + " appRequest.location: " + nVar.f14206b + " stateName: " + str);
    }

    void b(n nVar, CBError.CBImpressionError cBImpressionError) {
        e(nVar, cBImpressionError);
        if (nVar == null || nVar.f14207c != 7) {
            return;
        }
        if (cBImpressionError == CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE) {
            nVar.f14207c = 6;
            nVar.f14212h = null;
            nVar.f14213i = null;
            return;
        }
        d(nVar);
        k(nVar);
        f();
    }

    public synchronized com.chartboost.sdk.Model.a f(String str) {
        int i10;
        n nVar = this.f13989x.get(str);
        if (nVar == null || !((i10 = nVar.f14207c) == 6 || i10 == 7)) {
            return null;
        }
        return nVar.f14208d;
    }

    private void f(n nVar) {
        e(nVar);
        f();
    }

    /* loaded from: classes.dex */
    public class a implements s0.a {

        /* renamed from: a */
        final /* synthetic */ n f13992a;

        /* renamed from: b */
        final /* synthetic */ long f13993b;

        /* renamed from: c */
        final /* synthetic */ boolean f13994c;

        /* renamed from: d */
        final /* synthetic */ boolean f13995d;

        a(n nVar, long j10, boolean z10, boolean z11) {
            f.this = r1;
            this.f13992a = nVar;
            this.f13993b = j10;
            this.f13994c = z10;
            this.f13995d = z11;
        }

        @Override // com.chartboost.sdk.impl.s0.a
        public void a(s0 s0Var, JSONObject jSONObject) {
            com.chartboost.sdk.Model.a aVar;
            try {
                n nVar = this.f13992a;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                nVar.f14214j = Integer.valueOf((int) timeUnit.toMillis(f.this.f13974i.b() - this.f13993b));
                this.f13992a.f14215k = Integer.valueOf((int) timeUnit.toMillis(s0Var.f14235g));
                this.f13992a.f14216l = Integer.valueOf((int) timeUnit.toMillis(s0Var.f14236h));
                if (this.f13994c) {
                    aVar = new y1(f.this.f13980o.f13934a, jSONObject);
                } else if (this.f13995d) {
                    aVar = new com.chartboost.sdk.Model.a(jSONObject);
                } else {
                    n nVar2 = this.f13992a;
                    m1.d(new com.chartboost.sdk.Tracking.a("NATIVE", "Unknown", nVar2.f14208d.f13677r, nVar2.f14206b));
                    aVar = null;
                }
                f.this.a(this.f13992a, aVar);
            } catch (JSONException e10) {
                String str = this.f13992a.f14206b;
                f.this.a(str, (com.chartboost.sdk.Model.a) null);
                m1.d(new com.chartboost.sdk.Tracking.a("cache_get_response_parsing_error", e10.toString(), f.this.f13980o.f13935b, str));
                CBLogging.b("AdUnitManager", "sendAdGetRequest.onSuccess: " + e10.toString());
                f.this.a(this.f13992a, new CBError(CBError.b.UNEXPECTED_RESPONSE, "Response conversion failure"));
            }
        }

        @Override // com.chartboost.sdk.impl.s0.a
        public void a(s0 s0Var, CBError cBError) {
            f.this.a(this.f13992a.f14206b, (com.chartboost.sdk.Model.a) null);
            m1.d(new com.chartboost.sdk.Tracking.b("cache_request_error", cBError.getErrorDesc(), f.this.f13980o.f13935b, this.f13992a.f14206b));
            f.this.a(this.f13992a, cBError);
        }
    }

    public synchronized boolean a(String str, y1 y1Var) {
        int i10 = this.f13987v;
        this.f13987v = i10 + 1;
        n nVar = new n(i10, str, 6);
        nVar.f14208d = y1Var;
        this.f13989x.put(str, nVar);
        this.f13990y.add(nVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.chartboost.sdk.Model.a r5) {
        /*
            r4 = this;
            com.chartboost.sdk.impl.p1 r0 = r4.f13968c
            r1 = 0
            if (r0 == 0) goto L52
            if (r5 != 0) goto L8
            goto L52
        L8:
            java.util.Map<java.lang.String, com.chartboost.sdk.Model.b> r5 = r5.f13660a
            com.chartboost.sdk.impl.q1 r0 = r0.a()
            if (r0 == 0) goto L52
            if (r5 != 0) goto L13
            goto L52
        L13:
            java.io.File r0 = r0.f14269a
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L1d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r5.next()
            com.chartboost.sdk.Model.b r2 = (com.chartboost.sdk.Model.b) r2
            if (r2 == 0) goto L4f
            java.io.File r3 = r2.a(r0)
            if (r3 == 0) goto L37
            boolean r3 = r3.exists()
            if (r3 != 0) goto L1d
        L37:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Asset does not exist: "
            r5.append(r0)
            java.lang.String r0 = r2.f13682b
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "AdUnitManager"
            com.chartboost.sdk.Libraries.CBLogging.b(r0, r5)
        L4f:
            return r1
        L50:
            r5 = 1
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.f.a(com.chartboost.sdk.Model.a):boolean");
    }

    private void b(n nVar, com.chartboost.sdk.Model.c cVar) {
        String str = nVar.f14208d.f13663d;
        String str2 = nVar.f14206b;
        int a10 = a(cVar);
        this.f13969d.a(new r2(this.f13980o.f13937d, this.f13971f, new ShowParamsModel(str, str2, a10), new o2(this, str2)));
    }

    void e(String str) {
        n nVar = this.f13989x.get(str);
        if (nVar == null || nVar.f14207c != 6) {
            return;
        }
        k(nVar);
        f();
    }

    private void d(n nVar, CBError.CBImpressionError cBImpressionError) {
        if (nVar == null || nVar.f14209e) {
            return;
        }
        m1.d(new com.chartboost.sdk.Tracking.c("cache_on_show_finish_failure", cBImpressionError != null ? cBImpressionError.name() : "Unknown impression error", this.f13980o.f13935b, nVar.f14206b));
    }

    private void d(n nVar) {
        com.chartboost.sdk.Model.e eVar = this.f13972g.get();
        long j10 = eVar.f13714e;
        int i10 = eVar.f13715f;
        Integer num = this.B.get(nVar.f14206b);
        if (num == null) {
            num = 0;
        }
        Integer valueOf = Integer.valueOf(Math.min(num.intValue(), i10));
        this.B.put(nVar.f14206b, Integer.valueOf(valueOf.intValue() + 1));
        this.A.put(nVar.f14206b, Long.valueOf(this.f13974i.b() + TimeUnit.MILLISECONDS.toNanos(j10 << valueOf.intValue())));
    }

    private boolean e() {
        p2 p2Var;
        return this.f13980o.f13934a == 0 && !com.chartboost.sdk.g.f13890o && (p2Var = this.f13982q) != null && p2Var.c() == 1;
    }

    private void c() {
        long b10 = this.f13974i.b();
        Iterator<Long> it = this.A.values().iterator();
        while (it.hasNext()) {
            if (b10 - it.next().longValue() >= 0) {
                it.remove();
            }
        }
    }

    private void b(n nVar) {
        String str;
        String str2 = "";
        if (nVar != null) {
            str = nVar.f14206b;
            com.chartboost.sdk.Model.a aVar = nVar.f14208d;
            if (aVar != null) {
                str2 = aVar.f13677r;
            }
        } else {
            str = "";
        }
        m1.a(str2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.chartboost.sdk.impl.d2] */
    private void a(n nVar, int i10) {
        a1 a1Var;
        try {
            com.chartboost.sdk.Model.e eVar = this.f13972g.get();
            boolean z10 = this.f13980o.f13934a == 2;
            a aVar = new a(nVar, this.f13974i.b(), z10, eVar.f13720k);
            boolean z11 = nVar.f14207c == 2;
            int b10 = this.f13982q.b(this.f13980o.f13934a);
            if (z10) {
                a1Var = new d2(this.f13983r, new w1("https://da.chartboost.com", this.f13980o.f13936c, this.f13971f, i10, aVar), new com.chartboost.sdk.impl.b(this.f13980o.f13934a, Integer.valueOf(this.f13981p.getBannerHeight()), Integer.valueOf(this.f13981p.getBannerWidth()), nVar.f14206b, b10));
            } else {
                a1 a1Var2 = new a1(String.format(this.f13980o.f13936c, eVar.f13725p), this.f13971f, i10, aVar);
                a1Var2.a("cache_assets", this.f13968c.f(), 0);
                a1Var2.a("location", nVar.f14206b, 0);
                a1Var2.a("imp_depth", Integer.valueOf(b10), 0);
                a1Var2.a("cache", Boolean.valueOf(z11), 0);
                a1Var2.f14299m = true;
                a1Var = a1Var2;
            }
            a1Var.f14237i = 1;
            this.f13986u = 2;
            this.f13969d.a(a1Var);
        } catch (Exception e10) {
            CBLogging.b("AdUnitManager", "sendAdGetRequest: " + e10.toString());
            a(nVar, new CBError(CBError.b.MISCELLANEOUS, "error sending ad-get request"));
        }
    }

    void i(n nVar) {
        if (nVar.f14207c == 7) {
            nVar.f14207c = 6;
            nVar.f14212h = null;
            nVar.f14213i = null;
            m1.d(new com.chartboost.sdk.Tracking.c("show_finish_failure", CBError.CBImpressionError.USER_CANCELLATION.name(), nVar.f14208d.f13677r, nVar.f14206b));
        }
    }

    private c c(n nVar) {
        CBError.CBImpressionError cBImpressionError;
        String str;
        com.chartboost.sdk.Model.c cVar = null;
        try {
            com.chartboost.sdk.Model.a aVar = nVar.f14208d;
            File file = this.f13968c.a().f14269a;
            if (aVar == null) {
                CBLogging.b("AdUnitManager", "AdUnit not found");
                cBImpressionError = CBError.CBImpressionError.PENDING_IMPRESSION_ERROR;
            } else {
                cBImpressionError = null;
            }
            if (cBImpressionError == null) {
                cBImpressionError = a(aVar, file, nVar.f14206b);
            }
            if (cBImpressionError == null) {
                str = b(aVar, file, nVar.f14206b);
                cBImpressionError = d(str);
            } else {
                str = null;
            }
            if (cBImpressionError == null) {
                cVar = a(nVar, str);
            }
        } catch (Exception e10) {
            CBLogging.b("AdUnitManager", "showReady: " + e10.toString());
            cBImpressionError = CBError.CBImpressionError.INTERNAL;
        }
        return new c(cVar, cBImpressionError);
    }

    private CBError.CBImpressionError d(String str) {
        if (str == null) {
            return CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW;
        }
        return null;
    }

    private String c(com.chartboost.sdk.Model.a aVar, File file, String str) {
        com.chartboost.sdk.Model.b bVar = aVar.f13679t;
        if (bVar == null) {
            CBLogging.b("AdUnitManager", "AdUnit does not have a template body");
            return null;
        }
        File a10 = bVar.a(file);
        HashMap hashMap = new HashMap(aVar.f13661b);
        if (!TextUtils.isEmpty(aVar.f13667h) && !TextUtils.isEmpty(aVar.f13668i)) {
            hashMap.put("{% native_video_player %}", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        } else {
            hashMap.put("{% native_video_player %}", "false");
        }
        for (Map.Entry<String, com.chartboost.sdk.Model.b> entry : aVar.f13660a.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().f13682b);
        }
        try {
            return t2.a(a10, hashMap, this.f13980o.f13935b, str);
        } catch (Exception e10) {
            CBLogging.b("AdUnitManager", "loadTemplateHtml: " + e10.toString());
            return null;
        }
    }

    synchronized void a(n nVar, com.chartboost.sdk.Model.a aVar) {
        a(nVar.f14206b, aVar);
        this.f13986u = 1;
        nVar.f14207c = nVar.f14207c == 2 ? 4 : 5;
        nVar.f14208d = aVar;
        f(nVar);
    }

    private void c(n nVar, CBError.CBImpressionError cBImpressionError) {
        String str;
        ChartboostError mapImpressionErrorToBannerCacheError;
        com.chartboost.sdk.Model.a aVar;
        String str2 = "cache";
        String str3 = "";
        if (nVar != null) {
            String str4 = nVar.f14206b;
            int i10 = nVar.f14207c;
            if (i10 != 0 && i10 != 2 && i10 != 4) {
                str2 = "show";
            }
            str = str4;
        } else {
            str = "";
        }
        boolean equals = "show".equals(str2);
        if (nVar != null && (aVar = nVar.f14208d) != null) {
            str3 = aVar.f13666g;
        }
        String str5 = str3;
        com.chartboost.sdk.impl.c cVar = this.f13980o;
        if (cVar.f13934a == 2) {
            if (equals) {
                mapImpressionErrorToBannerCacheError = BannerErrorMap.mapImpressionErrorToBannerShowError(cBImpressionError);
            } else {
                mapImpressionErrorToBannerCacheError = BannerErrorMap.mapImpressionErrorToBannerCacheError(cBImpressionError);
            }
            ChartboostError chartboostError = mapImpressionErrorToBannerCacheError;
            int a10 = a(chartboostError);
            Handler handler = this.f13975j;
            com.chartboost.sdk.impl.c cVar2 = this.f13980o;
            Objects.requireNonNull(cVar2);
            handler.post(new c.a(a10, str, null, chartboostError, equals, str5));
            return;
        }
        this.f13975j.post(new c.a(4, str, cBImpressionError, null, equals, str5));
    }

    protected void a(String str, com.chartboost.sdk.Model.a aVar) {
        String str2;
        String str3;
        String str4;
        if (aVar != null) {
            String str5 = aVar.f13666g;
            String str6 = aVar.f13665f;
            str4 = aVar.f13676q;
            str2 = str5;
            str3 = str6;
        } else {
            str2 = "";
            str3 = str2;
            str4 = str3;
        }
        m1.b(new w2(str, this.f13980o.f13935b, str2, str3, str4));
    }

    synchronized void a(n nVar, CBError cBError) {
        if (this.f13986u == 0) {
            return;
        }
        this.f13986u = 1;
        CBError.CBImpressionError a10 = a(cBError);
        d(nVar, a10);
        e(nVar, a10);
        k(nVar);
        d(nVar);
        f();
    }

    private CBError.CBImpressionError a(CBError cBError) {
        CBError.CBImpressionError cBImpressionError = CBError.CBImpressionError.INTERNAL;
        return (cBError == null || cBError.getImpressionError() == null) ? cBImpressionError : cBError.getImpressionError();
    }

    private void a(n nVar, com.chartboost.sdk.Model.c cVar, CBError.CBImpressionError cBImpressionError) {
        if (cBImpressionError == null) {
            nVar.f14207c = 7;
            com.chartboost.sdk.b bVar = this.f13976k;
            Objects.requireNonNull(bVar);
            b.a aVar = new b.a(10);
            aVar.f13790c = cVar;
            this.f13974i.b();
            this.f13975j.post(aVar);
            return;
        }
        e(nVar, cBImpressionError);
        k(nVar);
    }

    private CBError.CBImpressionError a(com.chartboost.sdk.Model.a aVar, File file, String str) {
        CBError.CBImpressionError cBImpressionError = null;
        for (com.chartboost.sdk.Model.b bVar : aVar.f13660a.values()) {
            File a10 = bVar.a(file);
            if (a10 == null || !a10.exists()) {
                CBLogging.b("AdUnitManager", "Asset does not exist: " + bVar.f13682b);
                cBImpressionError = CBError.CBImpressionError.ASSET_MISSING;
                m1.d(new com.chartboost.sdk.Tracking.a("show_unavailable_asset_error", bVar.f13682b, this.f13980o.f13935b, str));
            }
        }
        return cBImpressionError;
    }

    private com.chartboost.sdk.Model.c a(n nVar, String str) {
        h hVar = this.f13984s;
        return new com.chartboost.sdk.Model.c(this.f13983r, nVar.f14208d, new e(this, nVar), this.f13968c, this.f13969d, this.f13971f, this.f13973h, this.f13975j, this.f13976k, this.f13977l, this.f13978m, this.f13979n, this.f13980o, nVar.f14206b, str, this.f13981p, hVar != null ? hVar.a() : null, this.f13985t);
    }

    private int a(ChartboostError chartboostError) {
        if (chartboostError != null) {
            return chartboostError.actionType == 1 ? 6 : 7;
        }
        return 4;
    }

    void a(n nVar, com.chartboost.sdk.Model.c cVar) {
        if (nVar.f14207c == 7) {
            if (nVar.f14212h != null && nVar.f14213i == null) {
                nVar.f14213i = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(this.f13974i.b() - nVar.f14212h.longValue()));
            }
            this.B.remove(nVar.f14206b);
            Handler handler = this.f13975j;
            com.chartboost.sdk.impl.c cVar2 = this.f13980o;
            Objects.requireNonNull(cVar2);
            handler.post(new c.a(5, nVar.f14206b, null, null, true, nVar.f14208d.f13666g));
            b(nVar, cVar);
            k(nVar);
            f();
        }
    }

    private int a(com.chartboost.sdk.Model.c cVar) {
        if (cVar != null) {
            com.chartboost.sdk.d k10 = cVar.k();
            if (k10 instanceof g3) {
                return ((g3) k10).N();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.chartboost.sdk.impl.g
    public void a(n nVar) {
        l(nVar);
    }

    @Override // com.chartboost.sdk.impl.g
    public void a(n nVar, CBError.CBImpressionError cBImpressionError) {
        b(nVar, cBImpressionError);
    }
}
