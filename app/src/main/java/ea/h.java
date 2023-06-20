package ea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CopyOnWriteMultiset.java */
/* loaded from: classes2.dex */
public final class h<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f29674a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<E, Integer> f29675b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Set<E> f29676c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private List<E> f29677d = Collections.emptyList();

    public void a(E e10) {
        synchronized (this.f29674a) {
            ArrayList arrayList = new ArrayList(this.f29677d);
            arrayList.add(e10);
            this.f29677d = Collections.unmodifiableList(arrayList);
            Integer num = this.f29675b.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f29676c);
                hashSet.add(e10);
                this.f29676c = Collections.unmodifiableSet(hashSet);
            }
            this.f29675b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int b(E e10) {
        int intValue;
        synchronized (this.f29674a) {
            intValue = this.f29675b.containsKey(e10) ? this.f29675b.get(e10).intValue() : 0;
        }
        return intValue;
    }

    public void c(E e10) {
        synchronized (this.f29674a) {
            Integer num = this.f29675b.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f29677d);
            arrayList.remove(e10);
            this.f29677d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f29675b.remove(e10);
                HashSet hashSet = new HashSet(this.f29676c);
                hashSet.remove(e10);
                this.f29676c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f29675b.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f29674a) {
            it = this.f29677d.iterator();
        }
        return it;
    }

    public Set<E> q0() {
        Set<E> set;
        synchronized (this.f29674a) {
            set = this.f29676c;
        }
        return set;
    }
}
