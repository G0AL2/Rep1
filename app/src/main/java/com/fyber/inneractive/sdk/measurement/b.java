package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f17327a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f17328b;

    public b(d dVar, Context context) {
        this.f17328b = dVar;
        this.f17327a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Omid.activate(this.f17327a);
            this.f17328b.f17331c = Partner.createPartner("Fyber", InneractiveAdManager.getVersion());
            d.a(this.f17328b, this.f17327a);
            IAlog.a("OMID SDK was activated - version %s", Omid.getVersion());
        } catch (Throwable th) {
            IAlog.a("Failed starting omsdk with exception %s", th.getLocalizedMessage());
            this.f17328b.getClass();
            r.a(th.getClass().getSimpleName(), String.format("%s - %s", "OpenMeasurementMeasurer", th.getMessage()), null, null);
        }
    }
}
