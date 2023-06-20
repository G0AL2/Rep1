package com.ironsource.environment.e;

import android.os.Handler;
import android.os.HandlerThread;
import qe.k;

/* loaded from: classes3.dex */
public final class b extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    private Handler f26156a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str);
        k.f(str, "name");
    }

    public final void a() {
        this.f26156a = new Handler(getLooper());
    }

    public final void a(Runnable runnable, long j10) {
        k.f(runnable, "task");
        Handler handler = this.f26156a;
        if (handler != null) {
            handler.postDelayed(runnable, j10);
        }
    }
}
