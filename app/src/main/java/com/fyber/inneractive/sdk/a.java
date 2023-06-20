package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class a<T> extends com.fyber.inneractive.sdk.dv.a<T> {

    /* renamed from: j  reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.interstitial.a f16669j;

    public a(z zVar, s sVar, f fVar) {
        super(zVar, sVar, fVar);
        this.f16669j = null;
    }

    public abstract void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity);

    public void f() {
        try {
            new q.a(p.EVENT_READY_ON_CLIENT, this.f17239a, (f) this.f17240b, (JSONArray) null).a((String) null);
        } catch (Exception unused) {
        }
    }
}
