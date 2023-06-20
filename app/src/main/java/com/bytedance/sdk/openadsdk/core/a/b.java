package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.core.k;

/* compiled from: AppOpenAdListenerAdapter.java */
/* loaded from: classes.dex */
public class b implements TTAdNative.AppOpenAdListener {

    /* renamed from: a  reason: collision with root package name */
    private final TTAdNative.AppOpenAdListener f11826a;

    public b(TTAdNative.AppOpenAdListener appOpenAdListener) {
        this.f11826a = appOpenAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.AppOpenAdListener
    public void onAppOpenAdLoaded(final TTAppOpenAd tTAppOpenAd) {
        if (this.f11826a == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11826a.onAppOpenAdLoaded(tTAppOpenAd);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f11826a.onAppOpenAdLoaded(tTAppOpenAd);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.AppOpenAdListener, com.bytedance.sdk.openadsdk.common.b
    public void onError(final int i10, final String str) {
        if (this.f11826a == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11826a.onError(i10, str);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f11826a.onError(i10, str);
                }
            });
        }
    }
}
