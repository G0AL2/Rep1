package com.ironsource.mediationsdk.model;

/* loaded from: classes3.dex */
public class InterstitialPlacement {

    /* renamed from: a  reason: collision with root package name */
    private int f27190a;

    /* renamed from: b  reason: collision with root package name */
    private String f27191b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27192c;

    /* renamed from: d  reason: collision with root package name */
    private k f27193d;

    public InterstitialPlacement(int i10, String str, boolean z10, k kVar) {
        this.f27190a = i10;
        this.f27191b = str;
        this.f27192c = z10;
        this.f27193d = kVar;
    }

    public k getPlacementAvailabilitySettings() {
        return this.f27193d;
    }

    public int getPlacementId() {
        return this.f27190a;
    }

    public String getPlacementName() {
        return this.f27191b;
    }

    public boolean isDefault() {
        return this.f27192c;
    }

    public String toString() {
        return "placement name: " + this.f27191b;
    }
}
