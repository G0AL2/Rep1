package com.ironsource.mediationsdk.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.inmobi.media.jh;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import qe.k;

/* loaded from: classes3.dex */
public abstract class b {
    private com.ironsource.mediationsdk.a.a H;
    private int[] J;
    private p L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26674a;

    /* renamed from: d  reason: collision with root package name */
    com.ironsource.b.a f26677d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<c> f26678e;

    /* renamed from: g  reason: collision with root package name */
    int f26680g;

    /* renamed from: h  reason: collision with root package name */
    String f26681h;

    /* renamed from: i  reason: collision with root package name */
    Context f26682i;

    /* renamed from: l  reason: collision with root package name */
    int[] f26685l;

    /* renamed from: m  reason: collision with root package name */
    int[] f26686m;

    /* renamed from: n  reason: collision with root package name */
    int[] f26687n;

    /* renamed from: q  reason: collision with root package name */
    int f26690q;

    /* renamed from: r  reason: collision with root package name */
    String f26691r;

    /* renamed from: s  reason: collision with root package name */
    String f26692s;

    /* renamed from: t  reason: collision with root package name */
    Set<Integer> f26693t;

    /* renamed from: u  reason: collision with root package name */
    HandlerThreadC0341b f26694u;

    /* renamed from: v  reason: collision with root package name */
    public IronSourceSegment f26695v;

    /* renamed from: w  reason: collision with root package name */
    private int f26696w = 1;

    /* renamed from: x  reason: collision with root package name */
    private int f26697x = 100;

    /* renamed from: y  reason: collision with root package name */
    private int f26698y = jh.DEFAULT_BITMAP_TIMEOUT;

    /* renamed from: z  reason: collision with root package name */
    private int f26699z = 90000;
    private int A = IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
    private int B = 5;
    private String C = "supersonic_sdk.db";
    private String D = IronSourceConstants.EVENTS_PROVIDER;
    private String E = "placement";
    private final String F = "abt";
    private final String G = "mt";

    /* renamed from: b  reason: collision with root package name */
    boolean f26675b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26676c = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f26679f = true;

    /* renamed from: j  reason: collision with root package name */
    int f26683j = 100;
    private int I = jh.DEFAULT_BITMAP_TIMEOUT;

    /* renamed from: k  reason: collision with root package name */
    int f26684k = 1;
    private Map<String, String> K = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    Map<String, String> f26688o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    public String f26689p = "";
    private final Object M = new Object();

    /* loaded from: classes3.dex */
    public enum a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        BANNER(8);
        

        /* renamed from: f  reason: collision with root package name */
        int f26714f;

        a(int i10) {
            this.f26714f = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class HandlerThreadC0341b extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        Handler f26715a;

        HandlerThreadC0341b(String str) {
            super(str);
        }

        final void a(Runnable runnable) {
            this.f26715a.post(runnable);
        }
    }

    private ArrayList<c> a(ArrayList<c> arrayList, ArrayList<c> arrayList2, int i10) {
        ArrayList<c> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new Comparator<c>() { // from class: com.ironsource.mediationsdk.a.b.4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(c cVar, c cVar2) {
                    return cVar.b() >= cVar2.b() ? 1 : -1;
                }
            });
            if (arrayList4.size() <= i10) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i10));
                this.f26677d.a(arrayList4.subList(i10, arrayList4.size()), this.f26692s);
            }
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("CombinedEventList exception: " + e10.getMessage());
        }
        return arrayList3;
    }

    static /* synthetic */ void a(b bVar) {
        synchronized (bVar.M) {
            bVar.f26677d.a(bVar.f26678e, bVar.f26692s);
            bVar.f26678e.clear();
        }
    }

    static /* synthetic */ void a(b bVar, c cVar, String str) {
        JSONObject d10 = cVar.d();
        if (d10 == null || !d10.has(str)) {
            return;
        }
        try {
            String optString = d10.optString(str, null);
            if (optString != null) {
                cVar.a(str, optString.substring(0, Math.min(optString.length(), (int) IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES)));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(String str) {
        com.ironsource.mediationsdk.a.a aVar = this.H;
        if (aVar == null || !aVar.c().equals(str)) {
            this.H = c.a(str, this.f26690q);
        }
    }

    public static void a(Map<String, Object> map, int i10, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i10));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    static boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ArrayList<c> a10;
        this.f26675b = false;
        synchronized (this.M) {
            a10 = a(this.f26678e, this.f26677d.a(this.f26692s), this.I);
            if (a10.size() > 0) {
                this.f26678e.clear();
                this.f26677d.b(this.f26692s);
            }
        }
        if (a10.size() > 0) {
            this.f26680g = 0;
            JSONObject b10 = com.ironsource.mediationsdk.sdk.f.a().b();
            try {
                try {
                    IronSourceSegment ironSourceSegment = this.f26695v;
                    if (ironSourceSegment != null) {
                        if (ironSourceSegment.getAge() > 0) {
                            b10.put("age", this.f26695v.getAge());
                        }
                        if (!TextUtils.isEmpty(this.f26695v.getGender())) {
                            b10.put(IronSourceSegment.GENDER, this.f26695v.getGender());
                        }
                        if (this.f26695v.getLevel() > 0) {
                            b10.put(IronSourceSegment.LEVEL, this.f26695v.getLevel());
                        }
                        if (this.f26695v.getIsPaying() != null) {
                            b10.put(IronSourceSegment.PAYING, this.f26695v.getIsPaying().get());
                        }
                        if (this.f26695v.getIapt() > 0.0d) {
                            b10.put(IronSourceSegment.IAPT, this.f26695v.getIapt());
                        }
                        if (this.f26695v.getUcd() > 0) {
                            b10.put(IronSourceSegment.USER_CREATION_DATE, this.f26695v.getUcd());
                        }
                    }
                    p pVar = this.L;
                    if (pVar != null) {
                        String str = pVar.f27293b;
                        if (!TextUtils.isEmpty(str)) {
                            b10.put("segmentId", str);
                        }
                        JSONObject jSONObject = this.L.f27294c;
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            b10.put(next, jSONObject.get(next));
                        }
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                String str2 = this.f26689p;
                if (!TextUtils.isEmpty(str2)) {
                    b10.put("abt", str2);
                }
                String str3 = J.a().f26343o;
                if (!TextUtils.isEmpty(str3)) {
                    b10.put("mt", str3);
                }
                Map<String, String> map = this.K;
                if (!map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!b10.has(entry.getKey())) {
                            b10.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                com.ironsource.environment.b.b bVar = new com.ironsource.environment.b.b();
                JSONObject a11 = bVar.f26129b.a(bVar.f26128a);
                k.e(a11, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
                Iterator<String> keys2 = a11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    b10.put(next2, a11.get(next2));
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            String a12 = this.H.a(a10, b10);
            if (TextUtils.isEmpty(a12)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                a(a10);
                return;
            }
            if (this.f26676c) {
                try {
                    a12 = Base64.encodeToString(a.AnonymousClass1.b(a12), 0);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            com.ironsource.environment.e.c.f26160a.c(new com.ironsource.b.b(new com.ironsource.b.c() { // from class: com.ironsource.mediationsdk.a.b.3
                @Override // com.ironsource.b.c
                public final synchronized void a(final ArrayList<c> arrayList, final boolean z10) {
                    b.this.f26694u.a(new Runnable() { // from class: com.ironsource.mediationsdk.a.b.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (!z10) {
                                IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                                b.this.a(arrayList);
                                return;
                            }
                            b bVar2 = b.this;
                            ArrayList<c> a13 = bVar2.f26677d.a(bVar2.f26692s);
                            b.this.f26680g = a13.size() + b.this.f26678e.size();
                        }
                    });
                }
            }, a12, this.H.a(), a10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int e(int i10) {
        a aVar;
        int i11 = a.NOT_SUPPORTED.f26714f;
        if (i10 == 15 || (i10 >= 300 && i10 < 400)) {
            aVar = a.OFFERWALL;
        } else if ((i10 >= 1000 && i10 < 2000) || (i10 >= 91000 && i10 < 92000)) {
            aVar = a.REWARDED_VIDEO;
        } else if ((i10 >= 2000 && i10 < 3000) || (i10 >= 92000 && i10 < 93000)) {
            aVar = a.INTERSTITIAL;
        } else if ((i10 < 3000 || i10 >= 4000) && (i10 < 93000 || i10 >= 94000)) {
            return i11;
        } else {
            aVar = a.BANNER;
        }
        return aVar.f26714f;
    }

    synchronized int a(c cVar) {
        return cVar.a() + 90000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f26678e = new ArrayList<>();
        this.f26680g = 0;
        this.H = c.a(this.f26691r, this.f26690q);
        HandlerThreadC0341b handlerThreadC0341b = new HandlerThreadC0341b(this.f26692s + "EventThread");
        this.f26694u = handlerThreadC0341b;
        handlerThreadC0341b.start();
        HandlerThreadC0341b handlerThreadC0341b2 = this.f26694u;
        handlerThreadC0341b2.f26715a = new Handler(handlerThreadC0341b2.getLooper());
        this.f26681h = IronSourceUtils.getSessionId();
        this.f26693t = new HashSet();
        b();
    }

    public final void a(int i10) {
        if (i10 > 0) {
            this.f26684k = i10;
        }
    }

    public final synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f26692s, this.f26691r);
        this.f26691r = defaultEventsFormatterType;
        a(defaultEventsFormatterType);
        this.H.f26668c = IronSourceUtils.getDefaultEventsURL(context, this.f26692s, null);
        this.f26677d = com.ironsource.b.a.a(context, "supersonic_sdk.db", 5);
        this.f26694u.a(new Runnable() { // from class: com.ironsource.mediationsdk.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        });
        this.f26685l = IronSourceUtils.getDefaultOptOutEvents(context, this.f26692s);
        this.f26686m = IronSourceUtils.getDefaultOptInEvents(context, this.f26692s);
        this.f26687n = IronSourceUtils.getDefaultTriggerEvents(context, this.f26692s);
        this.J = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f26692s);
        this.f26695v = ironSourceSegment;
        this.f26682i = context;
    }

    public final synchronized void a(p pVar) {
        this.L = pVar;
    }

    public final void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.ironsource.mediationsdk.a.a aVar = this.H;
        if (aVar != null) {
            aVar.f26668c = str;
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.f26692s, str);
    }

    protected void a(ArrayList<c> arrayList) {
        if (arrayList != null) {
            synchronized (this.M) {
                this.f26677d.a(arrayList, this.f26692s);
                this.f26680g = this.f26677d.a(this.f26692s).size() + this.f26678e.size();
            }
        }
    }

    public final void a(Map<String, String> map) {
        this.K.putAll(map);
    }

    public final void a(int[] iArr, Context context) {
        this.f26685l = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f26692s, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i10, int[] iArr) {
        if (a(iArr)) {
            for (int i11 : iArr) {
                if (i10 == i11) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    synchronized boolean a(String str, c cVar) {
        if (str.equalsIgnoreCase("none")) {
            return a(this.J) ? a(cVar.a(), this.J) : this.f26693t.contains(Integer.valueOf(cVar.a()));
        }
        return false;
    }

    protected void b() {
    }

    public final void b(int i10) {
        if (i10 > 0) {
            this.f26683j = i10;
        }
    }

    public final synchronized void b(final c cVar) {
        this.f26694u.a(new Runnable() { // from class: com.ironsource.mediationsdk.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                c cVar2 = cVar;
                if (cVar2 != null) {
                    b bVar = b.this;
                    if (bVar.f26679f) {
                        cVar2.a("eventSessionId", bVar.f26681h);
                        String connectionType = IronSourceUtils.getConnectionType(b.this.f26682i);
                        if (b.this.g(cVar)) {
                            cVar.a("connectionType", connectionType);
                        }
                        if (b.this.a(connectionType, cVar)) {
                            c cVar3 = cVar;
                            cVar3.a(b.this.a(cVar3));
                        }
                        int e10 = b.e(cVar.a());
                        if (e10 != a.NOT_SUPPORTED.f26714f) {
                            cVar.a("adUnit", Integer.valueOf(e10));
                        }
                        b.a(b.this, cVar, IronSourceConstants.EVENTS_ERROR_REASON);
                        b.a(b.this, cVar, IronSourceConstants.EVENTS_EXT1);
                        if (!b.this.f26688o.isEmpty()) {
                            for (Map.Entry<String, String> entry : b.this.f26688o.entrySet()) {
                                if (!cVar.d().has(entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                                    cVar.a(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        b bVar2 = b.this;
                        c cVar4 = cVar;
                        boolean z10 = false;
                        if (cVar4 != null ? b.a(bVar2.f26685l) ? !bVar2.a(cVar4.a(), bVar2.f26685l) : b.a(bVar2.f26686m) ? bVar2.a(cVar4.a(), bVar2.f26686m) : true : false) {
                            if (b.this.f(cVar)) {
                                JSONObject d10 = cVar.d();
                                if (!(d10 == null ? false : d10.has(IronSourceConstants.KEY_SESSION_DEPTH))) {
                                    cVar.a(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b.this.e(cVar)));
                                }
                            }
                            if (!TextUtils.isEmpty(b.this.d(cVar.a())) && b.this.c(cVar)) {
                                c cVar5 = cVar;
                                cVar5.a("placement", b.this.d(cVar5.a()));
                            }
                            long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(b.this.f26682i);
                            if (firstSessionTimestamp != -1) {
                                cVar.a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, Long.valueOf(firstSessionTimestamp));
                            }
                            try {
                                IronLog.EVENT.verbose(("{\"eventId\":" + cVar.a() + ",\"timestamp\":" + cVar.b() + "," + cVar.c().substring(1)).replace(",", "\n"));
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                            b.this.f26678e.add(cVar);
                            b.this.f26680g++;
                        }
                        boolean a10 = b.a(b.this.f26687n) ? b.this.a(cVar.a(), b.this.f26687n) : b.this.d(cVar);
                        b bVar3 = b.this;
                        if (!bVar3.f26675b && a10) {
                            bVar3.f26675b = true;
                        }
                        if (bVar3.f26677d != null) {
                            if ((bVar3.f26680g >= bVar3.f26683j || bVar3.f26675b) && bVar3.f26674a) {
                                bVar3.d();
                                return;
                            }
                            ArrayList<c> arrayList = bVar3.f26678e;
                            if (arrayList != null && arrayList.size() >= bVar3.f26684k) {
                                z10 = true;
                            }
                            if (z10 || a10) {
                                b.a(b.this);
                            }
                        }
                    }
                }
            }
        });
    }

    public final void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26691r = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.f26692s, str);
        a(str);
    }

    public final void b(Map<String, String> map) {
        this.f26688o.putAll(map);
    }

    public final void b(int[] iArr, Context context) {
        this.f26686m = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f26692s, iArr);
    }

    public final void c() {
        d();
    }

    public final void c(int i10) {
        if (i10 > 0) {
            this.I = i10;
        }
    }

    public final void c(int[] iArr, Context context) {
        this.f26687n = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f26692s, iArr);
    }

    protected abstract boolean c(c cVar);

    protected abstract String d(int i10);

    public final void d(int[] iArr, Context context) {
        this.J = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f26692s, iArr);
    }

    protected abstract boolean d(c cVar);

    protected abstract int e(c cVar);

    protected boolean f(c cVar) {
        return (cVar.a() == 14 || cVar.a() == 114 || cVar.a() == 514 || cVar.a() == 140 || cVar.a() == 40 || cVar.a() == 41 || cVar.a() == 50 || cVar.a() == 51 || cVar.a() == 52) ? false : true;
    }

    protected boolean g(c cVar) {
        return (cVar.a() == 40 || cVar.a() == 41 || cVar.a() == 50 || cVar.a() == 51 || cVar.a() == 52) ? false : true;
    }
}
