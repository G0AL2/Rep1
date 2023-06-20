package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.m0;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: b  reason: collision with root package name */
    public String f17330b;

    /* renamed from: c  reason: collision with root package name */
    public Partner f17331c;

    public static void a(d dVar, Context context) {
        dVar.getClass();
        f0 f0Var = new f0(new c(dVar), context, new com.fyber.inneractive.sdk.cache.c(String.format("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/%s.js", Omid.getVersion()), "omid-latest.js"));
        IAConfigManager.J.f16884t.f17705a.offer(f0Var);
        f0Var.a(m0.QUEUED);
    }
}
