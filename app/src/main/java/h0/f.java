package h0;

import androidx.core.util.Pools$SimplePool;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class f<T> extends Pools$SimplePool<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f31051c;

    public f(int i10) {
        super(i10);
        this.f31051c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, h0.e
    public boolean a(T t10) {
        boolean a10;
        synchronized (this.f31051c) {
            a10 = super.a(t10);
        }
        return a10;
    }

    @Override // androidx.core.util.Pools$SimplePool, h0.e
    public T b() {
        T t10;
        synchronized (this.f31051c) {
            t10 = (T) super.b();
        }
        return t10;
    }
}
