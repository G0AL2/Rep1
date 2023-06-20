package com.bytedance.sdk.component.f;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: TTFutureTask.java */
/* loaded from: classes.dex */
public class f<V> extends FutureTask<V> implements Comparable<f<V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f10437a;

    /* renamed from: b  reason: collision with root package name */
    private int f10438b;

    public f(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.f10437a = i10 == -1 ? 5 : i10;
        this.f10438b = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(f fVar) {
        if (a() < fVar.a()) {
            return 1;
        }
        return a() > fVar.a() ? -1 : 0;
    }

    public int a() {
        return this.f10437a;
    }

    public f(Runnable runnable, V v10, int i10, int i11) {
        super(runnable, v10);
        this.f10437a = i10 == -1 ? 5 : i10;
        this.f10438b = i11;
    }
}
