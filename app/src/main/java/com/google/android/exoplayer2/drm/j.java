package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.k;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* compiled from: DrmSession.java */
/* loaded from: classes2.dex */
public interface j {

    /* compiled from: DrmSession.java */
    /* loaded from: classes2.dex */
    public static class a extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f21111a;

        public a(Throwable th, int i10) {
            super(th);
            this.f21111a = i10;
        }
    }

    void a(k.a aVar);

    void b(k.a aVar);

    UUID c();

    boolean d();

    m8.b e();

    Map<String, String> f();

    boolean g(String str);

    a getError();

    int getState();
}
