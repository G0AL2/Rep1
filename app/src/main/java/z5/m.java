package z5;

import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBucketsPoolBackend.java */
/* loaded from: classes.dex */
public abstract class m<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f40015a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final e<T> f40016b = new e<>();

    private T b(T t10) {
        if (t10 != null) {
            synchronized (this) {
                this.f40015a.remove(t10);
            }
        }
        return t10;
    }

    @Override // z5.p
    public T get(int i10) {
        return b(this.f40016b.a(i10));
    }

    @Override // z5.p
    public T pop() {
        return b(this.f40016b.f());
    }

    @Override // z5.p
    public void put(T t10) {
        boolean add;
        synchronized (this) {
            add = this.f40015a.add(t10);
        }
        if (add) {
            this.f40016b.e(a(t10), t10);
        }
    }
}
