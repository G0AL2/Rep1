package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f17939a;

    public l(k kVar) {
        this.f17939a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        k kVar = this.f17939a;
        kVar.f17923j = null;
        kVar.p();
    }
}
