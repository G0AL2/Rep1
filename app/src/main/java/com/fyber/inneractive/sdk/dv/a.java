package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.flow.j;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes.dex */
public abstract class a<T> extends j<f> {

    /* renamed from: g  reason: collision with root package name */
    public d f17081g;

    /* renamed from: h  reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.banner.b f17082h;

    /* renamed from: i  reason: collision with root package name */
    public T f17083i;

    public a(z zVar, s sVar, f fVar) {
        super(zVar, sVar);
        a((a<T>) fVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public void a() {
        this.f17081g = null;
        this.f17083i = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public f c() {
        return (f) this.f17240b;
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean e() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean isVideoAd() {
        return false;
    }

    public void a(AdRequest adRequest, d dVar) {
        this.f17081g = dVar;
    }
}
