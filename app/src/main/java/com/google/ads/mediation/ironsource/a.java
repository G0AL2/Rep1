package com.google.ads.mediation.ironsource;

import android.os.Handler;
import android.os.Looper;

/* compiled from: IronSourceAdapterUtils.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static final String f20691a = IronSourceMediationAdapter.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f20692b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Runnable runnable) {
        synchronized (a.class) {
            if (f20692b == null) {
                f20692b = new Handler(Looper.getMainLooper());
            }
            f20692b.post(runnable);
        }
    }
}
