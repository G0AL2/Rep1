package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0 f17712a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f17713b;

    public x(w wVar, b0 b0Var) {
        this.f17713b = wVar;
        this.f17712a = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        IAlog.a("retrying network request", new Object[0]);
        this.f17713b.c(this.f17712a);
    }
}
