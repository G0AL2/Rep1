package com.google.ads.mediation.applovin;

import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: AppLovinRewardItem.java */
/* loaded from: classes2.dex */
public final class b implements RewardItem {

    /* renamed from: a  reason: collision with root package name */
    private final int f20476a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20477b;

    public b(int i10, String str) {
        this.f20476a = i10;
        this.f20477b = str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.f20476a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return this.f20477b;
    }
}
