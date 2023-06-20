package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final m f7779a;

    /* renamed from: b  reason: collision with root package name */
    private final v f7780b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f7781c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final JSONArray f7782d = new JSONArray();

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet<String> f7783e = new LinkedHashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final Object f7784f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private List<com.applovin.impl.mediation.a.f> f7785g;

    public e(m mVar) {
        this.f7779a = mVar;
        this.f7780b = mVar.A();
    }

    private List<com.applovin.impl.mediation.a.f> a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new com.applovin.impl.mediation.a.f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f7779a));
        }
        return arrayList;
    }

    public void a(Activity activity) {
        if (this.f7781c.compareAndSet(false, true)) {
            String str = (String) this.f7779a.a(com.applovin.impl.sdk.c.d.f8255y);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<com.applovin.impl.mediation.a.f> a10 = a(JsonUtils.getJSONArray(jSONObject, this.f7779a.J().a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f7785g = a10;
                    this.f7779a.S().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.c.a(a10, activity, this.f7779a));
                } catch (JSONException e10) {
                    if (v.a()) {
                        this.f7780b.b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e10);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.applovin.impl.mediation.a.f fVar, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z10;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f7784f) {
            z10 = !a(fVar);
            if (z10) {
                this.f7783e.add(fVar.K());
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", fVar.K());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f7782d.put(jSONObject);
            }
        }
        if (z10) {
            this.f7779a.a(fVar);
            this.f7779a.E().processAdapterInitializationPostback(fVar, j10, initializationStatus, str);
            this.f7779a.ag().a(initializationStatus, fVar.K());
        }
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity) {
        a(fVar, activity, null);
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity, Runnable runnable) {
        List<com.applovin.impl.mediation.a.f> list;
        if (this.f7779a.J().a() && (list = this.f7785g) != null) {
            Iterator<com.applovin.impl.mediation.a.f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                com.applovin.impl.mediation.a.f next = it.next();
                if (next.K().equals(fVar.K())) {
                    fVar = next;
                    break;
                }
            }
        }
        if (fVar == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        g a10 = this.f7779a.C().a(fVar);
        if (a10 == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (v.a()) {
            v vVar = this.f7780b;
            vVar.c("MediationAdapterInitializationManager", "Initializing adapter " + fVar);
        }
        a10.a(MaxAdapterParametersImpl.a(fVar), activity, runnable);
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        this.f7779a.ag().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }

    public boolean a() {
        return this.f7781c.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(com.applovin.impl.mediation.a.f fVar) {
        boolean contains;
        synchronized (this.f7784f) {
            contains = this.f7783e.contains(fVar.K());
        }
        return contains;
    }

    public LinkedHashSet<String> b() {
        LinkedHashSet<String> linkedHashSet;
        synchronized (this.f7784f) {
            linkedHashSet = this.f7783e;
        }
        return linkedHashSet;
    }

    public JSONArray c() {
        JSONArray jSONArray;
        synchronized (this.f7784f) {
            jSONArray = this.f7782d;
        }
        return jSONArray;
    }
}
