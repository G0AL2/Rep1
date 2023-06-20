package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: DelayProducer.java */
/* loaded from: classes.dex */
public class o implements o0<c4.a<w5.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<c4.a<w5.c>> f15083a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f15084b;

    /* compiled from: DelayProducer.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f15085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f15086b;

        a(l lVar, p0 p0Var) {
            this.f15085a = lVar;
            this.f15086b = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f15083a.b(this.f15085a, this.f15086b);
        }
    }

    public o(o0<c4.a<w5.c>> o0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f15083a = o0Var;
        this.f15084b = scheduledExecutorService;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<c4.a<w5.c>> lVar, p0 p0Var) {
        b6.b k10 = p0Var.k();
        ScheduledExecutorService scheduledExecutorService = this.f15084b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new a(lVar, p0Var), k10.c(), TimeUnit.MILLISECONDS);
        } else {
            this.f15083a.b(lVar, p0Var);
        }
    }
}
