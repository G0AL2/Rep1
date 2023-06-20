package com.bytedance.sdk.openadsdk.core.j;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.j.b.a;
import com.bytedance.sdk.openadsdk.core.j.b.b;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoTrackers.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: m  reason: collision with root package name */
    private a f12480m;

    /* renamed from: o  reason: collision with root package name */
    private long f12482o;

    /* renamed from: p  reason: collision with root package name */
    private n f12483p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12484q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12485r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f12486s;

    /* renamed from: t  reason: collision with root package name */
    private String f12487t;

    /* renamed from: a  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12468a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12469b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12470c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12471d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12472e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12473f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12474g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12475h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12476i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.c> f12477j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.b> f12478k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.j.b.a> f12479l = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f12481n = new AtomicBoolean(false);

    public d(a aVar) {
        this.f12480m = aVar;
    }

    public void a(com.bytedance.sdk.openadsdk.core.j.a.a aVar) {
        a(-1L, this.f12468a, aVar);
    }

    public void b(long j10) {
        a(j10, this.f12470c, null);
    }

    public void c(long j10) {
        a(j10, this.f12471d, null);
    }

    public void d(long j10) {
        a(j10, this.f12472e, null);
    }

    public void e(long j10) {
        a(j10, this.f12473f, null);
    }

    public void f(long j10) {
        a(j10, this.f12474g, null);
    }

    public void g(long j10) {
        a(j10, this.f12475h, null);
    }

    public void h(long j10) {
        a(j10, this.f12476i, null);
    }

    public void i(long j10) {
        a(j10, this.f12477j, null);
    }

    public void j(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12468a.addAll(list);
    }

    public void k(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12476i.addAll(list);
    }

    public void l(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12477j.addAll(list);
    }

    private void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", str);
            e.b(m.a(), this.f12483p, this.f12487t, "vast_play_track", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void a(long j10) {
        if (this.f12481n.compareAndSet(false, true)) {
            a(j10, this.f12469b, null);
        }
    }

    public void c(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12471d.addAll(list);
    }

    public void d(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12472e.addAll(list);
    }

    public void e(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12473f.addAll(list);
    }

    public void f(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12474g.addAll(list);
    }

    public void g(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12475h.addAll(list);
    }

    public void h(List<com.bytedance.sdk.openadsdk.core.j.b.b> list) {
        this.f12478k.addAll(list);
        Collections.sort(this.f12478k);
    }

    public void i(List<com.bytedance.sdk.openadsdk.core.j.b.a> list) {
        this.f12479l.addAll(list);
        Collections.sort(this.f12479l);
    }

    private JSONArray c() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.core.j.b.a aVar : this.f12479l) {
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public void a(long j10, long j11) {
        if (System.currentTimeMillis() - this.f12482o >= 1000 && j10 >= 0 && j11 > 0) {
            this.f12482o = System.currentTimeMillis();
            float f10 = ((float) j10) / ((float) j11);
            a(j10, a(j10, f10), null);
            if (f10 >= 0.25f && !this.f12484q) {
                b("firstQuartile");
                this.f12484q = true;
            } else if (f10 >= 0.5f && !this.f12485r) {
                b("midpoint");
                this.f12485r = true;
            } else if (f10 < 0.75f || this.f12486s) {
            } else {
                b("thirdQuartile");
                this.f12486s = true;
            }
        }
    }

    public void b(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12470c.addAll(list);
    }

    private JSONArray b() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.core.j.b.b bVar : this.f12478k) {
            jSONArray.put(bVar.b());
        }
        return jSONArray;
    }

    private void a(long j10, List<com.bytedance.sdk.openadsdk.core.j.b.c> list, com.bytedance.sdk.openadsdk.core.j.a.a aVar) {
        a aVar2 = this.f12480m;
        com.bytedance.sdk.openadsdk.core.j.b.c.b(list, aVar, j10, aVar2 != null ? aVar2.g() : null);
    }

    public List<com.bytedance.sdk.openadsdk.core.j.b.c> a(long j10, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f12478k.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.j.b.b bVar = this.f12478k.get(i10);
            if (bVar.a(f10)) {
                arrayList.add(bVar);
            }
        }
        for (int i11 = 0; i11 < this.f12479l.size(); i11++) {
            com.bytedance.sdk.openadsdk.core.j.b.a aVar = this.f12479l.get(i11);
            if (aVar.a(j10)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public void a(List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        this.f12469b.addAll(list);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12468a));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12469b));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12470c));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12471d));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12472e));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12473f));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12474g));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12475h));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12476i));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.j.b.c.b(this.f12477j));
        jSONObject.put("fractionalTrackers", b());
        jSONObject.put("absoluteTrackers", c());
        return jSONObject;
    }

    public void a(JSONObject jSONObject) {
        j(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("errorTrackers")));
        a(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("impressionTrackers")));
        b(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("pauseTrackers"), true));
        c(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("resumeTrackers"), true));
        d(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("completeTrackers")));
        e(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("closeTrackers")));
        f(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("skipTrackers")));
        g(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("clickTrackers")));
        k(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("muteTrackers"), true));
        l(com.bytedance.sdk.openadsdk.core.j.b.c.a(jSONObject.optJSONArray("unMuteTrackers"), true));
        h(com.bytedance.sdk.openadsdk.core.j.b.c.b(jSONObject.optJSONArray("fractionalTrackers")));
        i(com.bytedance.sdk.openadsdk.core.j.b.c.c(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void a(n nVar) {
        this.f12483p = nVar;
    }

    public void a(String str) {
        this.f12487t = str;
    }

    public void a(String str, long j10) {
        if (TextUtils.isEmpty(str) || j10 < 0) {
            return;
        }
        i(Collections.singletonList(new a.C0171a(str, j10).a()));
    }

    public void a(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < 0.0f) {
            return;
        }
        h(Collections.singletonList(new b.a(str, f10).a()));
    }

    public void a(d dVar) {
        j(dVar.f12468a);
        a(dVar.f12469b);
        b(dVar.f12470c);
        c(dVar.f12471d);
        d(dVar.f12472e);
        e(dVar.f12473f);
        f(dVar.f12474g);
        g(dVar.f12475h);
        k(dVar.f12476i);
        l(dVar.f12477j);
        h(dVar.f12478k);
        i(dVar.f12479l);
    }
}
