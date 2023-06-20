package com.unity3d.scar.adapter.v1920.scarads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.h;

/* compiled from: ScarRewardedAdListener.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private RewardedAdLoadCallback f28525a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    private RewardedAdCallback f28526b = new b(this);

    /* compiled from: ScarRewardedAdListener.java */
    /* loaded from: classes3.dex */
    class a extends RewardedAdLoadCallback {
        a(d dVar) {
        }
    }

    /* compiled from: ScarRewardedAdListener.java */
    /* loaded from: classes3.dex */
    class b extends RewardedAdCallback {
        b(d dVar) {
        }
    }

    public d(RewardedAd rewardedAd, h hVar) {
    }

    public RewardedAdCallback a() {
        return this.f28526b;
    }

    public RewardedAdLoadCallback b() {
        return this.f28525a;
    }

    public void c(od.b bVar) {
    }
}
