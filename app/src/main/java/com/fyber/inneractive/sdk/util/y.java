package com.fyber.inneractive.sdk.util;

/* loaded from: classes2.dex */
public class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f20355a;

    public y(z zVar) {
        this.f20355a = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20355a.getClass();
        IAlog.a("%sSampling timeout reached! unregistering location request listeners", "Location Manager: ");
        z zVar = this.f20355a;
        zVar.a(zVar.f20361f);
        z zVar2 = this.f20355a;
        zVar2.a(zVar2.f20360e);
        z zVar3 = this.f20355a;
        zVar3.f20361f = null;
        zVar3.f20360e = null;
    }
}
