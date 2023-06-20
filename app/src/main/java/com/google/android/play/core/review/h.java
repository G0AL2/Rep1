package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import gb.p;

/* loaded from: classes3.dex */
class h<T> extends cb.c {

    /* renamed from: a  reason: collision with root package name */
    final cb.e f23124a;

    /* renamed from: b  reason: collision with root package name */
    final p<T> f23125b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j f23126c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(j jVar, cb.e eVar, p<T> pVar) {
        this.f23126c = jVar;
        this.f23124a = eVar;
        this.f23125b = pVar;
    }

    @Override // cb.d
    public void a(Bundle bundle) throws RemoteException {
        this.f23126c.f23128a.b();
        this.f23124a.f("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
