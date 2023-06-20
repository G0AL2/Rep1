package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.k;
import java.util.List;

/* compiled from: NativeExpressAdListenerAdapter.java */
/* loaded from: classes.dex */
public class f implements TTAdNative.NativeExpressAdListener {

    /* renamed from: a  reason: collision with root package name */
    TTAdNative.NativeExpressAdListener f11851a;

    public f(TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        this.f11851a = nativeExpressAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener, com.bytedance.sdk.openadsdk.common.b
    public void onError(final int i10, final String str) {
        if (this.f11851a == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11851a.onError(i10, str);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.f.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.f11851a.onError(i10, str);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
    public void onNativeExpressAdLoad(final List<TTNativeExpressAd> list) {
        if (this.f11851a == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11851a.onNativeExpressAdLoad(list);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.f.2
                @Override // java.lang.Runnable
                public void run() {
                    f.this.f11851a.onNativeExpressAdLoad(list);
                }
            });
        }
    }
}
