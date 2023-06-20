package com.bytedance.sdk.openadsdk.component.reward;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* compiled from: RewardFullProxyListener.java */
/* loaded from: classes.dex */
public class f implements TTAdNative.FullScreenVideoAdListener, TTAdNative.RewardVideoAdListener {

    /* renamed from: a  reason: collision with root package name */
    final TTAdNative.RewardVideoAdListener f11606a;

    /* renamed from: b  reason: collision with root package name */
    final TTAdNative.FullScreenVideoAdListener f11607b;

    public f(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f11606a = rewardVideoAdListener;
        this.f11607b = null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener, com.bytedance.sdk.openadsdk.common.b
    public void onError(final int i10, final String str) {
        if (this.f11606a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.f.1
                @Override // java.lang.Runnable
                public void run() {
                    TTAdNative.RewardVideoAdListener rewardVideoAdListener = f.this.f11606a;
                    if (rewardVideoAdListener != null) {
                        rewardVideoAdListener.onError(i10, str);
                    }
                }
            });
        }
        if (this.f11607b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.f.2
                @Override // java.lang.Runnable
                public void run() {
                    TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener = f.this.f11607b;
                    if (fullScreenVideoAdListener != null) {
                        fullScreenVideoAdListener.onError(i10, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f11607b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.f.3
                @Override // java.lang.Runnable
                public void run() {
                    TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener = f.this.f11607b;
                    if (fullScreenVideoAdListener != null) {
                        fullScreenVideoAdListener.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
    public void onFullScreenVideoCached() {
        if (this.f11607b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.f.4
                @Override // java.lang.Runnable
                public void run() {
                    TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener = f.this.f11607b;
                    if (fullScreenVideoAdListener != null) {
                        fullScreenVideoAdListener.onFullScreenVideoCached();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f11606a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.f.5
                @Override // java.lang.Runnable
                public void run() {
                    TTAdNative.RewardVideoAdListener rewardVideoAdListener = f.this.f11606a;
                    if (rewardVideoAdListener != null) {
                        rewardVideoAdListener.onRewardVideoAdLoad(tTRewardVideoAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onRewardVideoCached() {
        if (this.f11606a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.f.6
                @Override // java.lang.Runnable
                public void run() {
                    TTAdNative.RewardVideoAdListener rewardVideoAdListener = f.this.f11606a;
                    if (rewardVideoAdListener != null) {
                        rewardVideoAdListener.onRewardVideoCached();
                    }
                }
            });
        }
    }

    public f(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f11606a = null;
        this.f11607b = fullScreenVideoAdListener;
    }
}
