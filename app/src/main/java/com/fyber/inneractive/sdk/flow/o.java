package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17275a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InneractiveAdRequest f17276b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.response.e f17277c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m f17278d;

    public o(m mVar, String str, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this.f17278d = mVar;
        this.f17275a = str;
        this.f17276b = inneractiveAdRequest;
        this.f17277c = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IAlog.a("Firing Event 803 - Stack trace - %s", this.f17275a);
        com.fyber.inneractive.sdk.network.o oVar = com.fyber.inneractive.sdk.network.o.IA_AD_DESTROYED_WITHOUT_SHOW;
        InneractiveAdRequest inneractiveAdRequest = this.f17276b;
        com.fyber.inneractive.sdk.response.e eVar = this.f17277c;
        m mVar = this.f17278d;
        JSONArray a10 = com.fyber.inneractive.sdk.config.global.s.a(mVar.f17265h, mVar.f17262e);
        q.a aVar = new q.a(eVar);
        aVar.f17682b = oVar;
        aVar.f17681a = inneractiveAdRequest;
        aVar.f17684d = a10;
        JSONObject jSONObject = new JSONObject();
        String str = this.f17275a;
        try {
            jSONObject.put("stack_trace", str);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "stack_trace", str);
        }
        aVar.f17686f.put(jSONObject);
        aVar.a((String) null);
    }
}
