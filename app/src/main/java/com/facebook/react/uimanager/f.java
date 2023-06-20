package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;

/* compiled from: GuardedFrameCallback.java */
/* loaded from: classes.dex */
public abstract class f extends a.AbstractC0209a {

    /* renamed from: b  reason: collision with root package name */
    private final ReactContext f15850b;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(ReactContext reactContext) {
        this.f15850b = reactContext;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0209a
    public final void a(long j10) {
        try {
            c(j10);
        } catch (RuntimeException e10) {
            this.f15850b.handleException(e10);
        }
    }

    protected abstract void c(long j10);
}
