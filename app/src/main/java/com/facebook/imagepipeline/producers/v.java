package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;

/* compiled from: ExperimentalThreadHandoffProducerQueueImpl.java */
/* loaded from: classes.dex */
public class v implements z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f15141a;

    public v(Executor executor) {
        this.f15141a = (Executor) y3.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(Runnable runnable) {
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void b(Runnable runnable) {
        this.f15141a.execute(runnable);
    }
}
