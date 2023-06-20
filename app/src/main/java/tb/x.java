package tb;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazySet.java */
/* loaded from: classes3.dex */
public class x<T> implements sc.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f37311b = null;

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<sc.b<T>> f37310a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection<sc.b<T>> collection) {
        this.f37310a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x<?> b(Collection<sc.b<?>> collection) {
        return new x<>((Set) collection);
    }

    private synchronized void d() {
        for (sc.b<T> bVar : this.f37310a) {
            this.f37311b.add(bVar.get());
        }
        this.f37310a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(sc.b<T> bVar) {
        if (this.f37311b == null) {
            this.f37310a.add(bVar);
        } else {
            this.f37311b.add(bVar.get());
        }
    }

    @Override // sc.b
    /* renamed from: c */
    public Set<T> get() {
        if (this.f37311b == null) {
            synchronized (this) {
                if (this.f37311b == null) {
                    this.f37311b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f37311b);
    }
}
