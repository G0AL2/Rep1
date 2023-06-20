package com.google.ads.mediation.inmobi;

import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: InMobiRewardedAd.java */
/* loaded from: classes2.dex */
class g implements RewardItem {

    /* renamed from: a  reason: collision with root package name */
    private final String f20637a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20638b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str, int i10) {
        this.f20637a = str;
        this.f20638b = i10;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.f20638b;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return this.f20637a;
    }
}
