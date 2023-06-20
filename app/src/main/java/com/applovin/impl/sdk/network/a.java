package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.m;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f8625a;

    /* renamed from: c  reason: collision with root package name */
    private final c<JSONObject> f8626c;

    public a(String str, c<JSONObject> cVar, m mVar) {
        super("CommunicatorRequestTask:" + str, mVar);
        this.f8625a = str;
        this.f8626c = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8349b.S().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(this.f8626c, this.f8349b, g()) { // from class: com.applovin.impl.sdk.network.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                this.f8349b.ag().a(a.this.f8625a, a.this.f8626c.a(), i10, jSONObject, str, false);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                this.f8349b.ag().a(a.this.f8625a, a.this.f8626c.a(), i10, jSONObject, null, true);
            }
        });
    }
}
