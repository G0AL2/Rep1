package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6554a = true;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6555b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6556c = false;

    /* renamed from: d  reason: collision with root package name */
    private static int f6557d = 1;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f6558e = false;

    /* renamed from: f  reason: collision with root package name */
    private static long f6559f = -1;

    /* renamed from: z  reason: collision with root package name */
    private static volatile b f6560z;
    private int B;

    /* renamed from: g  reason: collision with root package name */
    private Application f6561g;

    /* renamed from: h  reason: collision with root package name */
    private Context f6562h;

    /* renamed from: n  reason: collision with root package name */
    private String f6568n;

    /* renamed from: o  reason: collision with root package name */
    private long f6569o;

    /* renamed from: p  reason: collision with root package name */
    private String f6570p;

    /* renamed from: q  reason: collision with root package name */
    private long f6571q;

    /* renamed from: r  reason: collision with root package name */
    private String f6572r;

    /* renamed from: s  reason: collision with root package name */
    private long f6573s;

    /* renamed from: t  reason: collision with root package name */
    private String f6574t;

    /* renamed from: u  reason: collision with root package name */
    private long f6575u;

    /* renamed from: v  reason: collision with root package name */
    private String f6576v;

    /* renamed from: w  reason: collision with root package name */
    private long f6577w;

    /* renamed from: i  reason: collision with root package name */
    private List<String> f6563i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private List<Long> f6564j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private List<String> f6565k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private List<Long> f6566l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private LinkedList<a> f6567m = new LinkedList<>();

    /* renamed from: x  reason: collision with root package name */
    private boolean f6578x = false;

    /* renamed from: y  reason: collision with root package name */
    private long f6579y = -1;
    private int A = 50;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f6581a;

        /* renamed from: b  reason: collision with root package name */
        String f6582b;

        /* renamed from: c  reason: collision with root package name */
        long f6583c;

        a(String str, String str2, long j10) {
            this.f6582b = str2;
            this.f6583c = j10;
            this.f6581a = str;
        }

        public String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f6583c)) + " : " + this.f6581a + ' ' + this.f6582b;
        }
    }

    private b(Application application) {
        this.f6562h = application;
        this.f6561g = application;
        try {
            m();
        } catch (Throwable unused) {
        }
    }

    private a a(String str, String str2, long j10) {
        a aVar;
        if (this.f6567m.size() >= this.A) {
            aVar = this.f6567m.poll();
            if (aVar != null) {
                this.f6567m.add(aVar);
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            a aVar2 = new a(str, str2, j10);
            this.f6567m.add(aVar2);
            return aVar2;
        }
        return aVar;
    }

    private JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void a() {
        f6558e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j10, String str2) {
        try {
            a a10 = a(str, str2, j10);
            a10.f6582b = str2;
            a10.f6581a = str;
            a10.f6583c = j10;
        } catch (Throwable unused) {
        }
    }

    public static int b() {
        int i10 = f6557d;
        return i10 == 1 ? f6558e ? 2 : 1 : i10;
    }

    public static long c() {
        return f6559f;
    }

    public static b d() {
        if (f6560z == null) {
            synchronized (b.class) {
                if (f6560z == null) {
                    f6560z = new b(com.apm.insight.h.h());
                }
            }
        }
        return f6560z;
    }

    static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    private void m() {
        if (Build.VERSION.SDK_INT < 14 || this.f6561g == null) {
            return;
        }
        this.f6561g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                b.this.f6568n = activity.getClass().getName();
                b.this.f6569o = System.currentTimeMillis();
                boolean unused = b.f6555b = bundle != null;
                boolean unused2 = b.f6556c = true;
                b.this.f6563i.add(b.this.f6568n);
                b.this.f6564j.add(Long.valueOf(b.this.f6569o));
                b bVar = b.this;
                bVar.a(bVar.f6568n, b.this.f6569o, "onCreate");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                String name = activity.getClass().getName();
                int indexOf = b.this.f6563i.indexOf(name);
                if (indexOf > -1 && indexOf < b.this.f6563i.size()) {
                    b.this.f6563i.remove(indexOf);
                    b.this.f6564j.remove(indexOf);
                }
                b.this.f6565k.add(name);
                long currentTimeMillis = System.currentTimeMillis();
                b.this.f6566l.add(Long.valueOf(currentTimeMillis));
                b.this.a(name, currentTimeMillis, "onDestroy");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                b.this.f6574t = activity.getClass().getName();
                b.this.f6575u = System.currentTimeMillis();
                b.l(b.this);
                if (b.this.B != 0) {
                    if (b.this.B < 0) {
                        b.this.B = 0;
                    }
                    b bVar = b.this;
                    bVar.a(bVar.f6574t, b.this.f6575u, "onPause");
                }
                b.this.f6578x = false;
                boolean unused = b.f6556c = false;
                b.this.f6579y = SystemClock.uptimeMillis();
                b bVar2 = b.this;
                bVar2.a(bVar2.f6574t, b.this.f6575u, "onPause");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                b.this.f6572r = activity.getClass().getName();
                b.this.f6573s = System.currentTimeMillis();
                b.g(b.this);
                if (!b.this.f6578x) {
                    if (b.f6554a) {
                        boolean unused = b.f6554a = false;
                        int unused2 = b.f6557d = 1;
                        long unused3 = b.f6559f = b.this.f6573s;
                    }
                    if (!b.this.f6572r.equals(b.this.f6574t)) {
                        return;
                    }
                    if (b.f6556c && !b.f6555b) {
                        int unused4 = b.f6557d = 4;
                        long unused5 = b.f6559f = b.this.f6573s;
                        return;
                    } else if (!b.f6556c) {
                        int unused6 = b.f6557d = 3;
                        long unused7 = b.f6559f = b.this.f6573s;
                        return;
                    }
                }
                b.this.f6578x = true;
                b bVar = b.this;
                bVar.a(bVar.f6572r, b.this.f6573s, "onResume");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                b.this.f6570p = activity.getClass().getName();
                b.this.f6571q = System.currentTimeMillis();
                b bVar = b.this;
                bVar.a(bVar.f6570p, b.this.f6571q, "onStart");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                b.this.f6576v = activity.getClass().getName();
                b.this.f6577w = System.currentTimeMillis();
                b bVar = b.this;
                bVar.a(bVar.f6576v, b.this.f6577w, "onStop");
            }
        });
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f6563i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f6563i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f6563i.get(i10), this.f6564j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f6565k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f6565k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f6565k.get(i10), this.f6566l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public long e() {
        return SystemClock.uptimeMillis() - this.f6579y;
    }

    public boolean f() {
        return this.f6578x;
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", a(this.f6568n, this.f6569o));
            jSONObject.put("last_start_activity", a(this.f6570p, this.f6571q));
            jSONObject.put("last_resume_activity", a(this.f6572r, this.f6573s));
            jSONObject.put("last_pause_activity", a(this.f6574t, this.f6575u));
            jSONObject.put("last_stop_activity", a(this.f6576v, this.f6577w));
            jSONObject.put("alive_activities", n());
            jSONObject.put("finish_activities", o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String h() {
        return String.valueOf(this.f6572r);
    }

    public JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f6567m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }
}
