package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a  reason: collision with root package name */
    private final String f7170a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7171b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f7170a = str;
        this.f7171b = i10;
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f7171b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f7170a;
    }

    public String toString() {
        return "MaxReward{amount=" + this.f7171b + ", label=" + this.f7170a + "}";
    }
}
