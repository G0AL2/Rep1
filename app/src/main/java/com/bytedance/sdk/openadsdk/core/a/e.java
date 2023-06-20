package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.k;
import java.util.List;

/* compiled from: NativeAdListenerAdapter.java */
/* loaded from: classes.dex */
public class e implements TTAdNative.NativeAdListener {

    /* renamed from: a  reason: collision with root package name */
    private TTAdNative.NativeAdListener f11845a;

    public e(TTAdNative.NativeAdListener nativeAdListener) {
        this.f11845a = nativeAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeAdListener, com.bytedance.sdk.openadsdk.common.b
    public void onError(final int i10, final String str) {
        if (this.f11845a == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11845a.onError(i10, str);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.f11845a.onError(i10, str);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeAdListener
    public void onNativeAdLoad(final List<TTNativeAd> list) {
        if (this.f11845a == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11845a.onNativeAdLoad(list);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.f11845a.onNativeAdLoad(list);
                }
            });
        }
    }
}
