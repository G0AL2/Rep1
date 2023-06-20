package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import java.util.Map;
import java.util.UUID;

/* compiled from: ErrorStateDrmSession.java */
/* loaded from: classes2.dex */
public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    private final j.a f21119a;

    public o(j.a aVar) {
        this.f21119a = (j.a) ea.a.e(aVar);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void a(k.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void b(k.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final UUID c() {
        return j8.h.f32425a;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public boolean d() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public m8.b e() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public Map<String, String> f() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public boolean g(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public j.a getError() {
        return this.f21119a;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public int getState() {
        return 1;
    }
}
