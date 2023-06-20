package com.unity3d.scar.adapter.v1920.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.h;

/* compiled from: ScarRewardedAd.java */
/* loaded from: classes3.dex */
public class c extends rd.a {

    /* renamed from: e  reason: collision with root package name */
    private RewardedAd f28523e;

    /* renamed from: f  reason: collision with root package name */
    private d f28524f;

    public c(Context context, sd.b bVar, od.c cVar, com.unity3d.scar.adapter.common.d dVar, h hVar) {
        super(context, cVar, bVar, dVar);
        RewardedAd rewardedAd = new RewardedAd(this.f36564a, this.f36565b.b());
        this.f28523e = rewardedAd;
        this.f28524f = new d(rewardedAd, hVar);
    }

    @Override // od.a
    public void a(Activity activity) {
        if (this.f28523e.isLoaded()) {
            this.f28523e.show(activity, this.f28524f.a());
        } else {
            this.f36567d.handleError(com.unity3d.scar.adapter.common.b.a(this.f36565b));
        }
    }

    @Override // rd.a
    public void c(od.b bVar, AdRequest adRequest) {
        this.f28524f.c(bVar);
        this.f28523e.loadAd(adRequest, this.f28524f.b());
    }
}
