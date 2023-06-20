package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* compiled from: ThreadHandoffProducerQueueImpl.java */
/* loaded from: classes.dex */
public class a1 implements z0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14903a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Deque<Runnable> f14904b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f14905c;

    public a1(Executor executor) {
        this.f14905c = (Executor) y3.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public synchronized void a(Runnable runnable) {
        this.f14904b.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public synchronized void b(Runnable runnable) {
        if (this.f14903a) {
            this.f14904b.add(runnable);
        } else {
            this.f14905c.execute(runnable);
        }
    }
}
