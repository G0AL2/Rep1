package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;

/* compiled from: DefaultRunnableScheduler.java */
/* loaded from: classes.dex */
public class d implements androidx.work.s {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f4542a = e0.d.a(Looper.getMainLooper());

    @Override // androidx.work.s
    public void a(Runnable runnable) {
        this.f4542a.removeCallbacks(runnable);
    }

    @Override // androidx.work.s
    public void b(long j10, Runnable runnable) {
        this.f4542a.postDelayed(runnable, j10);
    }
}
