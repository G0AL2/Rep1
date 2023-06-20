package com.unity3d.scar.adapter.v1950.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.g;

/* compiled from: ScarInterstitialAd.java */
/* loaded from: classes3.dex */
public class a extends ud.a {

    /* renamed from: e  reason: collision with root package name */
    private InterstitialAd f28527e;

    /* renamed from: f  reason: collision with root package name */
    private b f28528f;

    public a(Context context, vd.b bVar, od.c cVar, com.unity3d.scar.adapter.common.d dVar, g gVar) {
        super(context, cVar, bVar, dVar);
        InterstitialAd interstitialAd = new InterstitialAd(this.f37710a);
        this.f28527e = interstitialAd;
        interstitialAd.setAdUnitId(this.f37711b.b());
        this.f28528f = new b(this.f28527e, gVar);
    }

    @Override // od.a
    public void a(Activity activity) {
        if (this.f28527e.isLoaded()) {
            this.f28527e.show();
        } else {
            this.f37713d.handleError(com.unity3d.scar.adapter.common.b.a(this.f37711b));
        }
    }

    @Override // ud.a
    public void c(od.b bVar, AdRequest adRequest) {
        this.f28527e.setAdListener(this.f28528f.c());
        this.f28528f.d(bVar);
        this.f28527e.loadAd(adRequest);
    }
}
