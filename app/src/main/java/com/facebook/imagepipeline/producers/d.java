package com.facebook.imagepipeline.producers;

import b6.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: BaseProducerContext.java */
/* loaded from: classes.dex */
public class d implements p0 {

    /* renamed from: n  reason: collision with root package name */
    public static final Set<String> f14922n = y3.h.a("id", "uri_source");

    /* renamed from: a  reason: collision with root package name */
    private final b6.b f14923a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14924b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14925c;

    /* renamed from: d  reason: collision with root package name */
    private final r0 f14926d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f14927e;

    /* renamed from: f  reason: collision with root package name */
    private final b.c f14928f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f14929g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14930h;

    /* renamed from: i  reason: collision with root package name */
    private q5.d f14931i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14932j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14933k;

    /* renamed from: l  reason: collision with root package name */
    private final List<q0> f14934l;

    /* renamed from: m  reason: collision with root package name */
    private final r5.j f14935m;

    public d(b6.b bVar, String str, r0 r0Var, Object obj, b.c cVar, boolean z10, boolean z11, q5.d dVar, r5.j jVar) {
        this(bVar, str, null, r0Var, obj, cVar, z10, z11, dVar, jVar);
    }

    public static void q(List<q0> list) {
        if (list == null) {
            return;
        }
        for (q0 q0Var : list) {
            q0Var.b();
        }
    }

    public static void r(List<q0> list) {
        if (list == null) {
            return;
        }
        for (q0 q0Var : list) {
            q0Var.a();
        }
    }

    public static void s(List<q0> list) {
        if (list == null) {
            return;
        }
        for (q0 q0Var : list) {
            q0Var.d();
        }
    }

    public static void t(List<q0> list) {
        if (list == null) {
            return;
        }
        for (q0 q0Var : list) {
            q0Var.c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public Object a() {
        return this.f14927e;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void b(String str, Object obj) {
        if (f14922n.contains(str)) {
            return;
        }
        this.f14929g.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void c(q0 q0Var) {
        boolean z10;
        synchronized (this) {
            this.f14934l.add(q0Var);
            z10 = this.f14933k;
        }
        if (z10) {
            q0Var.b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public r5.j d() {
        return this.f14935m;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void e(String str, String str2) {
        this.f14929g.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
        this.f14929g.put("origin_sub", str2);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public String f() {
        return this.f14925c;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void g(String str) {
        e(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public Map<String, Object> getExtras() {
        return this.f14929g;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public String getId() {
        return this.f14924b;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public r0 h() {
        return this.f14926d;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized boolean i() {
        return this.f14932j;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized q5.d j() {
        return this.f14931i;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public b6.b k() {
        return this.f14923a;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void l(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            b(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized boolean m() {
        return this.f14930h;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public <T> T n(String str) {
        return (T) this.f14929g.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public b.c o() {
        return this.f14928f;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void p(w5.f fVar) {
    }

    public void u() {
        q(v());
    }

    public synchronized List<q0> v() {
        if (this.f14933k) {
            return null;
        }
        this.f14933k = true;
        return new ArrayList(this.f14934l);
    }

    public synchronized List<q0> w(boolean z10) {
        if (z10 == this.f14932j) {
            return null;
        }
        this.f14932j = z10;
        return new ArrayList(this.f14934l);
    }

    public synchronized List<q0> x(boolean z10) {
        if (z10 == this.f14930h) {
            return null;
        }
        this.f14930h = z10;
        return new ArrayList(this.f14934l);
    }

    public synchronized List<q0> y(q5.d dVar) {
        if (dVar == this.f14931i) {
            return null;
        }
        this.f14931i = dVar;
        return new ArrayList(this.f14934l);
    }

    public d(b6.b bVar, String str, String str2, r0 r0Var, Object obj, b.c cVar, boolean z10, boolean z11, q5.d dVar, r5.j jVar) {
        w5.f fVar = w5.f.NOT_SET;
        this.f14923a = bVar;
        this.f14924b = str;
        HashMap hashMap = new HashMap();
        this.f14929g = hashMap;
        hashMap.put("id", str);
        hashMap.put("uri_source", bVar == null ? "null-request" : bVar.q());
        this.f14925c = str2;
        this.f14926d = r0Var;
        this.f14927e = obj;
        this.f14928f = cVar;
        this.f14930h = z10;
        this.f14931i = dVar;
        this.f14932j = z11;
        this.f14933k = false;
        this.f14934l = new ArrayList();
        this.f14935m = jVar;
    }
}
