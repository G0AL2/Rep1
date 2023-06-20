package com.google.ads.mediation.chartboost;

import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: ChartboostReward.java */
/* loaded from: classes2.dex */
public class d implements RewardItem {

    /* renamed from: a  reason: collision with root package name */
    private final int f20493a;

    public d(int i10) {
        this.f20493a = i10;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.f20493a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return "";
    }
}
