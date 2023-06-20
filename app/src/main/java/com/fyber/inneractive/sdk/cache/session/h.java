package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* loaded from: classes.dex */
public class h extends PriorityQueue<e> {

    /* renamed from: a  reason: collision with root package name */
    public int f16864a;

    public h(int i10) {
        super(1, new i());
        this.f16864a = i10;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    /* renamed from: a */
    public boolean add(e eVar) {
        boolean add = super.add(eVar);
        if (super.size() > this.f16864a) {
            poll();
        }
        return add;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractCollection, java.util.Collection
    public int size() {
        return super.size();
    }
}
