package com.unity3d.scar.adapter.v1920.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.g;

/* compiled from: ScarInterstitialAd.java */
/* loaded from: classes3.dex */
public class a extends rd.a {

    /* renamed from: e  reason: collision with root package name */
    private InterstitialAd f28517e;

    /* renamed from: f  reason: collision with root package name */
    private b f28518f;

    public a(Context context, sd.b bVar, od.c cVar, com.unity3d.scar.adapter.common.d dVar, g gVar) {
        super(context, cVar, bVar, dVar);
        InterstitialAd interstitialAd = new InterstitialAd(this.f36564a);
        this.f28517e = interstitialAd;
        interstitialAd.setAdUnitId(this.f36565b.b());
        this.f28518f = new b(this.f28517e, gVar);
    }

    @Override // od.a
    public void a(Activity activity) {
        if (this.f28517e.isLoaded()) {
            this.f28517e.show();
        } else {
            this.f36567d.handleError(com.unity3d.scar.adapter.common.b.a(this.f36565b));
        }
    }

    @Override // rd.a
    public void c(od.b bVar, AdRequest adRequest) {
        this.f28517e.setAdListener(this.f28518f.c());
        this.f28518f.d(bVar);
        this.f28517e.loadAd(adRequest);
    }
}
