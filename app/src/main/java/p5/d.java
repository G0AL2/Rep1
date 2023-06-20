package p5;

import java.util.LinkedHashSet;

/* compiled from: BoundedLinkedHashSet.java */
/* loaded from: classes.dex */
public class d<E> {

    /* renamed from: a  reason: collision with root package name */
    private int f35521a;

    /* renamed from: b  reason: collision with root package name */
    private LinkedHashSet<E> f35522b;

    public d(int i10) {
        this.f35522b = new LinkedHashSet<>(i10);
        this.f35521a = i10;
    }

    public synchronized boolean a(E e10) {
        if (this.f35522b.size() == this.f35521a) {
            LinkedHashSet<E> linkedHashSet = this.f35522b;
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
        this.f35522b.remove(e10);
        return this.f35522b.add(e10);
    }

    public synchronized boolean b(E e10) {
        return this.f35522b.contains(e10);
    }
}
