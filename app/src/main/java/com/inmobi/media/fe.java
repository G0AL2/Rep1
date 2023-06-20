package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: NativeRootContainerLayout.java */
/* loaded from: classes3.dex */
public final class fe extends ez {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<n> f25384a;

    public fe(Context context) {
        super(context);
    }

    public final n getNativeStrandAd() {
        return this.f25384a.get();
    }

    public final void setNativeStrandAd(n nVar) {
        this.f25384a = new WeakReference<>(nVar);
    }
}
