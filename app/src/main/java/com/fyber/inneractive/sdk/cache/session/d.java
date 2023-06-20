package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, h> f16839b;

    /* renamed from: a  reason: collision with root package name */
    public f f16838a = new f();

    /* renamed from: c  reason: collision with root package name */
    public final Object f16840c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Object f16841d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public a f16842e = null;

    /* loaded from: classes.dex */
    public interface a {
        void a(d dVar, boolean z10, JSONObject jSONObject);
    }

    public d(int i10, a aVar) {
        this.f16839b = new com.fyber.inneractive.sdk.cache.session.a(this, i10);
    }

    public static JSONObject a(d dVar) {
        dVar.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", dVar.f16838a.a());
            for (Map.Entry<com.fyber.inneractive.sdk.cache.session.enums.b, h> entry : dVar.f16839b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                com.fyber.inneractive.sdk.cache.session.enums.b key = entry.getKey();
                Iterator<e> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().a(true, true));
                }
                jSONObject.put(key.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final void a(com.fyber.inneractive.sdk.cache.session.enums.b bVar, e eVar) {
        synchronized (this.f16841d) {
            h hVar = this.f16839b.get(bVar);
            if (hVar != null) {
                hVar.add(eVar);
            }
        }
    }

    public final void a(f fVar) {
        com.fyber.inneractive.sdk.cache.session.enums.b[] values;
        e eVar;
        for (com.fyber.inneractive.sdk.cache.session.enums.b bVar : com.fyber.inneractive.sdk.cache.session.enums.b.values()) {
            if (bVar != com.fyber.inneractive.sdk.cache.session.enums.b.f16858i && (eVar = fVar.f16863a.get(bVar)) != null && eVar.f16843a != 0) {
                a(bVar, eVar);
            }
        }
    }

    public int a() {
        int i10;
        com.fyber.inneractive.sdk.config.h hVar = IAConfigManager.J.f16886v.f16987b;
        String num = Integer.toString(5);
        if (hVar.f16984a.containsKey("number_of_sessions")) {
            num = hVar.f16984a.get("number_of_sessions");
        }
        try {
            i10 = Integer.parseInt(num);
        } catch (Throwable unused) {
            i10 = 5;
        }
        if (i10 < 0) {
            return 5;
        }
        return i10;
    }
}
