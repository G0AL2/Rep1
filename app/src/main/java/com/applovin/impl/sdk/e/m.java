package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f8390a;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public m(com.applovin.impl.sdk.m mVar, a aVar) {
        super("TaskFetchVariables", mVar);
        this.f8390a = aVar;
    }

    private Map<String, String> a() {
        return Utils.stringifyObjectMap(this.f8349b.V().a(null, false, false));
    }

    @Override // java.lang.Runnable
    public void run() {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f8349b).a(com.applovin.impl.sdk.utils.h.k(this.f8349b)).c(com.applovin.impl.sdk.utils.h.l(this.f8349b)).a(a()).b("GET").a((c.a) new JSONObject()).b(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.f8214dc)).intValue()).a(), this.f8349b) { // from class: com.applovin.impl.sdk.e.m.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                if (com.applovin.impl.sdk.v.a()) {
                    d("Unable to fetch variables: server returned " + i10);
                    com.applovin.impl.sdk.v.i("AppLovinVariableService", "Failed to load variables.");
                }
                m.this.f8390a.a();
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                com.applovin.impl.sdk.utils.h.d(jSONObject, this.f8349b);
                com.applovin.impl.sdk.utils.h.c(jSONObject, this.f8349b);
                com.applovin.impl.sdk.utils.h.f(jSONObject, this.f8349b);
                com.applovin.impl.sdk.utils.h.e(jSONObject, this.f8349b);
                m.this.f8390a.a();
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.aX);
        uVar.b(com.applovin.impl.sdk.c.b.aY);
        this.f8349b.S().a((com.applovin.impl.sdk.e.a) uVar);
    }
}
