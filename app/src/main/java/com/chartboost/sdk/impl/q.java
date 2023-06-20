package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class q implements Comparable<q> {

    /* renamed from: a  reason: collision with root package name */
    private final u2 f14257a;

    /* renamed from: b  reason: collision with root package name */
    final int f14258b;

    /* renamed from: c  reason: collision with root package name */
    final String f14259c;

    /* renamed from: d  reason: collision with root package name */
    final String f14260d;

    /* renamed from: e  reason: collision with root package name */
    final String f14261e;

    /* renamed from: f  reason: collision with root package name */
    final String f14262f;

    /* renamed from: g  reason: collision with root package name */
    final AtomicInteger f14263g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<o> f14264h;

    /* renamed from: i  reason: collision with root package name */
    private final long f14265i;

    /* renamed from: j  reason: collision with root package name */
    final AtomicInteger f14266j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(u2 u2Var, int i10, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference<o> atomicReference, long j10, AtomicInteger atomicInteger2, String str4) {
        this.f14257a = u2Var;
        this.f14258b = i10;
        this.f14259c = str;
        this.f14260d = str2;
        this.f14261e = str3;
        this.f14263g = atomicInteger;
        this.f14264h = atomicReference;
        this.f14265i = j10;
        this.f14266j = atomicInteger2;
        this.f14262f = str4;
        atomicInteger.incrementAndGet();
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(q qVar) {
        return this.f14258b - qVar.f14258b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Executor executor, boolean z10) {
        o andSet;
        if ((this.f14263g.decrementAndGet() == 0 || !z10) && (andSet = this.f14264h.getAndSet(null)) != null) {
            executor.execute(new p(andSet, z10, (int) TimeUnit.NANOSECONDS.toMillis(this.f14257a.b() - this.f14265i), this.f14266j.get()));
        }
    }
}
