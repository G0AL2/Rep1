package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f20430a;

    public g(d dVar) {
        this.f20430a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            d dVar = this.f20430a;
            if (dVar.G != null) {
                IAlog.a("%sunregistering orientation broadcast receiver", IAlog.a(dVar));
                this.f20430a.G.a();
            }
        } catch (IllegalArgumentException e10) {
            if (e10.getMessage() != null && !e10.getMessage().contains("Receiver not registered")) {
                throw e10;
            }
        }
        this.f20430a.G = null;
    }
}
