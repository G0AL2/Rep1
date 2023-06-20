package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.core.k;

/* compiled from: FullScreenVideoAdListenerAdapter.java */
/* loaded from: classes.dex */
public class d implements TTAdNative.FullScreenVideoAdListener {

    /* renamed from: a  reason: collision with root package name */
    TTAdNative.FullScreenVideoAdListener f11838a;

    public d(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f11838a = fullScreenVideoAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener, com.bytedance.sdk.openadsdk.common.b
    public void onError(final int i10, final String str) {
        if (this.f11838a == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11838a.onError(i10, str);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.f11838a.onError(i10, str);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f11838a == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11838a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.d.2
                @Override // java.lang.Runnable
                public void run() {
                    d.this.f11838a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
    public void onFullScreenVideoCached() {
        if (this.f11838a == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11838a.onFullScreenVideoCached();
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.d.3
                @Override // java.lang.Runnable
                public void run() {
                    d.this.f11838a.onFullScreenVideoCached();
                }
            });
        }
    }
}
