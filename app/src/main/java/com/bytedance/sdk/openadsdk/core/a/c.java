package com.bytedance.sdk.openadsdk.core.a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.k;
import java.util.List;

/* compiled from: FeedAdListenerAdapter.java */
/* loaded from: classes.dex */
public class c implements TTAdNative.FeedAdListener {

    /* renamed from: a  reason: collision with root package name */
    private TTAdNative.FeedAdListener f11832a;

    public c(TTAdNative.FeedAdListener feedAdListener) {
        this.f11832a = null;
        this.f11832a = feedAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener, com.bytedance.sdk.openadsdk.common.b
    public void onError(final int i10, final String str) {
        if (this.f11832a == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11832a.onError(i10, str);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.f11832a.onError(i10, str);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener
    public void onFeedAdLoad(final List<TTFeedAd> list) {
        if (this.f11832a == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11832a.onFeedAdLoad(list);
        } else {
            k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.c.2
                @Override // java.lang.Runnable
                public void run() {
                    c.this.f11832a.onFeedAdLoad(list);
                }
            });
        }
    }
}
