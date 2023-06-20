package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* compiled from: SingleAppData.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static t f12739a;

    /* renamed from: b  reason: collision with root package name */
    private m3.c f12740b;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f12742d;

    /* renamed from: e  reason: collision with root package name */
    private TTRewardVideoAd.RewardAdInteractionListener f12743e;

    /* renamed from: f  reason: collision with root package name */
    private r3.c f12744f;

    /* renamed from: g  reason: collision with root package name */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f12745g;

    /* renamed from: h  reason: collision with root package name */
    private TTAppOpenAd.AppOpenAdInteractionListener f12746h;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12741c = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12747i = false;

    private t() {
    }

    public static t a() {
        if (f12739a == null) {
            f12739a = new t();
        }
        return f12739a;
    }

    public boolean b() {
        return this.f12741c;
    }

    public com.bytedance.sdk.openadsdk.core.e.n c() {
        return this.f12742d;
    }

    public TTRewardVideoAd.RewardAdInteractionListener d() {
        return this.f12743e;
    }

    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener e() {
        return this.f12745g;
    }

    public TTAppOpenAd.AppOpenAdInteractionListener f() {
        return this.f12746h;
    }

    public r3.c g() {
        return this.f12744f;
    }

    public void h() {
        this.f12740b = null;
        this.f12742d = null;
        this.f12743e = null;
        this.f12745g = null;
        this.f12746h = null;
        this.f12744f = null;
        this.f12747i = false;
        this.f12741c = true;
    }

    public void b(boolean z10) {
        this.f12747i = z10;
    }

    public void a(boolean z10) {
        this.f12741c = z10;
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        this.f12742d = nVar;
    }

    public void a(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f12745g = fullScreenVideoAdInteractionListener;
    }

    public void a(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f12743e = rewardAdInteractionListener;
    }

    public void a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f12746h = appOpenAdInteractionListener;
    }

    public void a(r3.c cVar) {
        this.f12744f = cVar;
    }
}
