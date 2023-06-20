package com.inmobi.media;

import android.os.SystemClock;

/* compiled from: AdNetworkClient.java */
/* loaded from: classes3.dex */
public final class cl {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24932a = "cl";

    /* renamed from: b  reason: collision with root package name */
    private cm f24933b;

    public cl(cm cmVar) {
        this.f24933b = cmVar;
    }

    public final cn a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            gy a10 = new ha(this.f24933b).a();
            cn cnVar = new cn(this.f24933b, a10);
            try {
                iv.a().a(this.f24933b.g());
                iv.a().b(a10.d());
                if (a10.a()) {
                    return cnVar;
                }
                iv.a().c(SystemClock.elapsedRealtime() - elapsedRealtime);
                return cnVar;
            } catch (Exception unused) {
                return cnVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
