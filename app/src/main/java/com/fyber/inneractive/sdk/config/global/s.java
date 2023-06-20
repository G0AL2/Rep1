package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class s {

    /* renamed from: c  reason: collision with root package name */
    public Map<Class, com.fyber.inneractive.sdk.config.global.features.e> f16982c;

    /* renamed from: d  reason: collision with root package name */
    public JSONArray f16983d;

    /* renamed from: b  reason: collision with root package name */
    public String f16981b = "";

    /* renamed from: a  reason: collision with root package name */
    public final r f16980a = new r();

    public s() {
        e();
        Map<Class, com.fyber.inneractive.sdk.config.global.features.e> a10 = a();
        this.f16982c = a10;
        IAlog.a("%s: created. Supported features: %s", "SupportedFeaturesProvider", a10);
    }

    public static s b() {
        return new s();
    }

    public Map<Class, com.fyber.inneractive.sdk.config.global.features.e> a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Class, com.fyber.inneractive.sdk.config.global.features.e> entry : this.f16982c.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().b());
        }
        return hashMap;
    }

    public JSONArray c() {
        if (this.f16983d == null) {
            JSONArray a10 = g.a(this.f16982c, false);
            this.f16983d = a10;
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a10);
        }
        return this.f16983d;
    }

    public JSONArray d() {
        JSONArray a10 = g.a(this.f16982c, true);
        IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a10);
        return a10;
    }

    public void e() {
        this.f16980a.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.j.class, new com.fyber.inneractive.sdk.config.global.features.j());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.b.class, new com.fyber.inneractive.sdk.config.global.features.b());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.a.class, new com.fyber.inneractive.sdk.config.global.features.a());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.h.class, new com.fyber.inneractive.sdk.config.global.features.h());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.d.class, new com.fyber.inneractive.sdk.config.global.features.d());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.g.class, new com.fyber.inneractive.sdk.config.global.features.g());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.c.class, new com.fyber.inneractive.sdk.config.global.features.c());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.i.class, new com.fyber.inneractive.sdk.config.global.features.i());
        hashMap.put(com.fyber.inneractive.sdk.config.global.features.f.class, new com.fyber.inneractive.sdk.config.global.features.f());
        this.f16982c = hashMap;
        this.f16983d = null;
    }

    public void a(e eVar) {
        for (com.fyber.inneractive.sdk.config.global.features.e eVar2 : this.f16982c.values()) {
            List<b> list = eVar2.f16953c;
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = list.get(size);
                List<d> list2 = bVar.f16943d;
                if (list2 != null) {
                    Iterator<d> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        d next = it.next();
                        if (next.a(eVar)) {
                            eVar2.f16953c.remove(bVar);
                            eVar2.f16954d.remove(bVar.f16940a);
                            this.f16983d = null;
                            IAlog.a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.f16940a, next);
                            break;
                        }
                    }
                }
            }
        }
    }

    public <T extends com.fyber.inneractive.sdk.config.global.features.e> T a(Class<T> cls) {
        if (this.f16982c.containsKey(cls)) {
            return (T) this.f16982c.get(cls);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.global.s.a(java.lang.String):void");
    }

    public static JSONArray a(com.fyber.inneractive.sdk.flow.d dVar, com.fyber.inneractive.sdk.flow.j<?> jVar) {
        s sVar;
        s sVar2;
        if (dVar == null || (sVar2 = dVar.f17208f) == null) {
            if (jVar == null || (sVar = jVar.f17241c) == null) {
                return null;
            }
            return sVar.c();
        }
        return sVar2.c();
    }
}
