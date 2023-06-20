package com.ironsource.mediationsdk.model;

/* loaded from: classes3.dex */
public class Placement {

    /* renamed from: a  reason: collision with root package name */
    private int f27208a;

    /* renamed from: b  reason: collision with root package name */
    private String f27209b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27210c;

    /* renamed from: d  reason: collision with root package name */
    private String f27211d;

    /* renamed from: e  reason: collision with root package name */
    private int f27212e;

    /* renamed from: f  reason: collision with root package name */
    private k f27213f;

    public Placement(int i10, String str, boolean z10, String str2, int i11, k kVar) {
        this.f27208a = i10;
        this.f27209b = str;
        this.f27210c = z10;
        this.f27211d = str2;
        this.f27212e = i11;
        this.f27213f = kVar;
    }

    public Placement(InterstitialPlacement interstitialPlacement) {
        this.f27208a = interstitialPlacement.getPlacementId();
        this.f27209b = interstitialPlacement.getPlacementName();
        this.f27210c = interstitialPlacement.isDefault();
        this.f27213f = interstitialPlacement.getPlacementAvailabilitySettings();
    }

    public k getPlacementAvailabilitySettings() {
        return this.f27213f;
    }

    public int getPlacementId() {
        return this.f27208a;
    }

    public String getPlacementName() {
        return this.f27209b;
    }

    public int getRewardAmount() {
        return this.f27212e;
    }

    public String getRewardName() {
        return this.f27211d;
    }

    public boolean isDefault() {
        return this.f27210c;
    }

    public String toString() {
        return "placement name: " + this.f27209b + ", reward name: " + this.f27211d + " , amount: " + this.f27212e;
    }
}
