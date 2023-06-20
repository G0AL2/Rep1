package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Libraries.CBLogging;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class m1 {

    /* renamed from: h */
    private static final HashMap<String, LinkedList<com.chartboost.sdk.Tracking.d>> f14193h = new HashMap<>();

    /* renamed from: i */
    private static final HashMap<String, LinkedList<com.chartboost.sdk.Tracking.d>> f14194i = new HashMap<>();

    /* renamed from: j */
    private static final HashMap<String, LinkedList<com.chartboost.sdk.Tracking.d>> f14195j = new HashMap<>();

    /* renamed from: k */
    private static final HashMap<String, LinkedList<com.chartboost.sdk.Tracking.d>> f14196k = new HashMap<>();

    /* renamed from: a */
    private final Context f14197a;

    /* renamed from: b */
    private final l1 f14198b;

    /* renamed from: c */
    private final com.chartboost.sdk.Networking.b f14199c;

    /* renamed from: d */
    private final l2 f14200d;

    /* renamed from: e */
    private final ScheduledExecutorService f14201e;

    /* renamed from: f */
    private final HashMap<String, w2> f14202f = new HashMap<>();

    /* renamed from: g */
    private y2 f14203g;

    public m1(Context context, l1 l1Var, com.chartboost.sdk.Networking.b bVar, l2 l2Var, ScheduledExecutorService scheduledExecutorService, y2 y2Var) {
        this.f14197a = context;
        this.f14198b = l1Var;
        this.f14199c = bVar;
        this.f14200d = l2Var;
        this.f14201e = scheduledExecutorService;
        this.f14203g = y2Var;
    }

    public static /* synthetic */ void a(m1 m1Var, y2 y2Var, com.chartboost.sdk.Tracking.d dVar) {
        m1Var.b(y2Var, dVar);
    }

    private boolean c(com.chartboost.sdk.Tracking.d dVar) {
        if (a(dVar.f())) {
            String a10 = dVar.a();
            String d10 = dVar.d();
            LinkedList<com.chartboost.sdk.Tracking.d> c10 = c(a10, d10);
            if (c10 == null) {
                c10 = new LinkedList<>();
            }
            c10.add(dVar);
            a(a10, d10, c10);
            return true;
        }
        return false;
    }

    public static void d(com.chartboost.sdk.Tracking.d dVar) {
        m1 b10 = b();
        if (b10 != null) {
            b10.e(dVar);
        }
    }

    public void a(y2 y2Var) {
        this.f14203g = y2Var;
    }

    public void b(String str, String str2) {
        if (IronSourceConstants.INTERSTITIAL_AD_UNIT.equals(str)) {
            f14193h.remove(str2);
        } else if ("Rewarded".equals(str)) {
            f14194i.remove(str2);
        } else if (IronSourceConstants.BANNER_AD_UNIT.equals(str)) {
            f14195j.remove(str2);
        } else {
            f14196k.remove(str2);
        }
    }

    public com.chartboost.sdk.Tracking.d e(com.chartboost.sdk.Tracking.d dVar) {
        if (dVar == null) {
            return null;
        }
        if (this.f14203g.d()) {
            com.chartboost.sdk.Tracking.d b10 = this.f14198b.b(dVar);
            if (this.f14197a != null && b10 != null) {
                b(b10);
            }
            return b10;
        }
        return dVar;
    }

    public void a(w2 w2Var) {
        HashMap<String, w2> hashMap = this.f14202f;
        hashMap.put(w2Var.d() + w2Var.c(), w2Var);
    }

    private boolean a(String str) {
        return "cache_start".equals(str) || "show_start".equals(str);
    }

    private float a(com.chartboost.sdk.Tracking.d dVar) {
        if (dVar.b()) {
            try {
                LinkedList<com.chartboost.sdk.Tracking.d> c10 = c(dVar.a(), dVar.d());
                com.chartboost.sdk.Tracking.d remove = c10 != null ? c10.remove() : null;
                if (remove != null) {
                    return ((float) (dVar.g() - remove.g())) / 1000.0f;
                }
                return 0.0f;
            } catch (Exception unused) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    private void b(com.chartboost.sdk.Tracking.d dVar) {
        if (c(dVar)) {
            return;
        }
        HashMap<String, w2> hashMap = this.f14202f;
        w2 w2Var = hashMap.get(dVar.d() + dVar.a());
        if (w2Var != null) {
            dVar.a(w2Var);
        }
        dVar.a(a(dVar));
        a(this.f14203g, dVar);
        CBLogging.a("EventTracker", "Event: " + dVar.toString());
    }

    private LinkedList<com.chartboost.sdk.Tracking.d> c(String str, String str2) {
        if (IronSourceConstants.INTERSTITIAL_AD_UNIT.equals(str)) {
            return f14193h.get(str2);
        }
        if ("Rewarded".equals(str)) {
            return f14194i.get(str2);
        }
        if (IronSourceConstants.BANNER_AD_UNIT.equals(str)) {
            return f14195j.get(str2);
        }
        return f14196k.get(str2);
    }

    private void a(String str, String str2, LinkedList<com.chartboost.sdk.Tracking.d> linkedList) {
        if (IronSourceConstants.INTERSTITIAL_AD_UNIT.equals(str)) {
            f14193h.put(str2, linkedList);
        } else if ("Rewarded".equals(str)) {
            f14194i.put(str2, linkedList);
        } else if (IronSourceConstants.BANNER_AD_UNIT.equals(str)) {
            f14195j.put(str2, linkedList);
        } else {
            f14196k.put(str2, linkedList);
        }
    }

    public /* synthetic */ void b(y2 y2Var, com.chartboost.sdk.Tracking.d dVar) {
        String a10 = y2Var != null ? y2Var.a() : "";
        if (this.f14199c == null || a10.length() <= 0) {
            return;
        }
        this.f14199c.a(new z2(a10, dVar, a()));
    }

    private void a(final y2 y2Var, final com.chartboost.sdk.Tracking.d dVar) {
        ScheduledExecutorService scheduledExecutorService;
        if (this.f14200d == null || this.f14197a == null || dVar == null || (scheduledExecutorService = this.f14201e) == null) {
            return;
        }
        scheduledExecutorService.execute(new Runnable() { // from class: com.chartboost.sdk.impl.z3
            @Override // java.lang.Runnable
            public final void run() {
                m1.a(m1.this, y2Var, dVar);
            }
        });
    }

    public static void b(w2 w2Var) {
        m1 b10 = b();
        if (b10 != null) {
            b10.a(w2Var);
        }
    }

    private k1 a() {
        return k1.a(this.f14197a, this.f14200d.e(), this.f14200d.j(), this.f14200d.c());
    }

    private static m1 b() {
        try {
            return com.chartboost.sdk.f.d();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(String str, String str2) {
        m1 b10 = b();
        if (b10 != null) {
            b10.b(str, str2);
        }
    }
}
