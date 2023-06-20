package com.fyber.inneractive.sdk.web;

/* loaded from: classes2.dex */
public class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f20445a;

    public q(r rVar) {
        this.f20445a = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f20445a.f20448a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
