package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f17245a;

    public k(l lVar) {
        this.f17245a = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l lVar = this.f17245a;
        lVar.getClass();
        IAlog.a("%sRe-enabling clicks, grace period has passed", IAlog.a(lVar));
        this.f17245a.f17254i = true;
        this.f17245a.f17255j = null;
    }
}
