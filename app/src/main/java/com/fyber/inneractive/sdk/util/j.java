package com.fyber.inneractive.sdk.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class j<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Queue<T> f20290a = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    public a<T> f20291b;

    /* loaded from: classes2.dex */
    public interface a<TT> {
        TT a();
    }

    public j(int i10, a<T> aVar) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20290a.offer(aVar.a());
        }
        this.f20291b = aVar;
    }

    public T a() {
        T poll = this.f20290a.poll();
        return poll == null ? this.f20291b.a() : poll;
    }
}
