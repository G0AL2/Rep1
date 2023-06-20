package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class w extends y {
    /* JADX INFO: Access modifiers changed from: protected */
    public w(String str, com.applovin.impl.sdk.m mVar) {
        super(str, mVar);
    }

    private JSONObject a(com.applovin.impl.sdk.b.c cVar) {
        JSONObject i10 = i();
        JsonUtils.putString(i10, IronSourceConstants.EVENTS_RESULT, cVar.b());
        Map<String, String> a10 = cVar.a();
        if (a10 != null) {
            JsonUtils.putJSONObject(i10, "params", new JSONObject(a10));
        }
        return i10;
    }

    protected abstract com.applovin.impl.sdk.b.c b();

    protected abstract void b(JSONObject jSONObject);

    protected abstract void c();

    @Override // com.applovin.impl.sdk.e.y
    protected int h() {
        return ((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.bt)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.b.c b10 = b();
        if (b10 == null) {
            if (com.applovin.impl.sdk.v.a()) {
                d("Pending reward not found");
            }
            c();
            return;
        }
        if (com.applovin.impl.sdk.v.a()) {
            a("Reporting pending reward: " + b10 + "...");
        }
        a(a(b10), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.w.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                w.this.a(i10);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                w.this.b(jSONObject);
            }
        });
    }
}
