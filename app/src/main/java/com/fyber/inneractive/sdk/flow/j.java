package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.e;

/* loaded from: classes.dex */
public abstract class j<T extends com.fyber.inneractive.sdk.response.e> {

    /* renamed from: a  reason: collision with root package name */
    public InneractiveAdRequest f17239a;

    /* renamed from: b  reason: collision with root package name */
    public T f17240b;

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.s f17241c;

    /* renamed from: d  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.z f17242d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17243e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17244f = false;

    public j(com.fyber.inneractive.sdk.config.z zVar, com.fyber.inneractive.sdk.config.global.s sVar) {
        this.f17242d = zVar;
        this.f17241c = sVar;
    }

    public abstract void a();

    public void a(T t10) {
        this.f17240b = t10;
    }

    public com.fyber.inneractive.sdk.config.global.s b() {
        return this.f17241c;
    }

    public T c() {
        return this.f17240b;
    }

    public boolean d() {
        com.fyber.inneractive.sdk.config.w wVar = ((com.fyber.inneractive.sdk.config.y) this.f17242d).f17076e;
        return false;
    }

    public abstract boolean e();

    public abstract boolean isVideoAd();

    public void a(InneractiveAdRequest inneractiveAdRequest) {
        this.f17239a = inneractiveAdRequest;
    }
}
