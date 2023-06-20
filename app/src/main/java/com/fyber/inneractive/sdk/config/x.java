package com.fyber.inneractive.sdk.config;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class x implements Iterable<y> {

    /* renamed from: a  reason: collision with root package name */
    public List<y> f17070a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f17071b = true;

    @Override // java.lang.Iterable
    public Iterator<y> iterator() {
        return this.f17070a.iterator();
    }
}
