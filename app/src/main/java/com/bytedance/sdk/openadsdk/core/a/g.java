package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.core.k;

/* compiled from: RewardVideoAdListenerAdapter.java */
/* loaded from: classes.dex */
public class g implements TTAdNative.RewardVideoAdListener {

    /* renamed from: a  reason: collision with root package name */
    private TTAdNative.RewardVideoAdListener f11857a;

    public g(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f11857a = rewardVideoAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener, com.bytedance.sdk.openadsdk.common.b
    public void onError(final int i10, final String str) {
        if (this.f11857a == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11857a.onError(i10, str);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.g.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f11857a.onError(i10, str);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f11857a == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11857a.onRewardVideoAdLoad(tTRewardVideoAd);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.g.2
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f11857a.onRewardVideoAdLoad(tTRewardVideoAd);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onRewardVideoCached() {
        if (this.f11857a == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11857a.onRewardVideoCached();
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.g.3
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f11857a.onRewardVideoCached();
                }
            });
        }
    }
}
