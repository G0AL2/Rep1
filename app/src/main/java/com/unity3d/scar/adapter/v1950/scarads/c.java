package com.unity3d.scar.adapter.v1950.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.h;

/* compiled from: ScarRewardedAd.java */
/* loaded from: classes3.dex */
public class c extends ud.a {

    /* renamed from: e  reason: collision with root package name */
    private RewardedAd f28533e;

    /* renamed from: f  reason: collision with root package name */
    private d f28534f;

    public c(Context context, vd.b bVar, od.c cVar, com.unity3d.scar.adapter.common.d dVar, h hVar) {
        super(context, cVar, bVar, dVar);
        RewardedAd rewardedAd = new RewardedAd(this.f37710a, this.f37711b.b());
        this.f28533e = rewardedAd;
        this.f28534f = new d(rewardedAd, hVar);
    }

    @Override // od.a
    public void a(Activity activity) {
        if (this.f28533e.isLoaded()) {
            this.f28533e.show(activity, this.f28534f.a());
        } else {
            this.f37713d.handleError(com.unity3d.scar.adapter.common.b.a(this.f37711b));
        }
    }

    @Override // ud.a
    public void c(od.b bVar, AdRequest adRequest) {
        this.f28534f.c(bVar);
        this.f28533e.loadAd(adRequest, this.f28534f.b());
    }
}
