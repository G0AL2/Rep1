package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class SimpleSettableFuture<T> implements Future<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f15345a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    private T f15346b;

    /* renamed from: c  reason: collision with root package name */
    private Exception f15347c;

    private void b() {
        if (this.f15345a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public T c() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public void d(T t10) {
        b();
        this.f15346b = t10;
        this.f15345a.countDown();
    }

    public void e(Exception exc) {
        b();
        this.f15347c = exc;
        this.f15345a.countDown();
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        this.f15345a.await();
        if (this.f15347c == null) {
            return this.f15346b;
        }
        throw new ExecutionException(this.f15347c);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f15345a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.f15345a.await(j10, timeUnit)) {
            if (this.f15347c == null) {
                return this.f15346b;
            }
            throw new ExecutionException(this.f15347c);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
