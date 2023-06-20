package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture.java */
/* loaded from: classes3.dex */
public interface c<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
