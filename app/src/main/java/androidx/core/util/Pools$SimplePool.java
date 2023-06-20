package androidx.core.util;

import h0.e;

/* loaded from: classes.dex */
public class Pools$SimplePool<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f2637a;

    /* renamed from: b  reason: collision with root package name */
    private int f2638b;

    public Pools$SimplePool(int i10) {
        if (i10 > 0) {
            this.f2637a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t10) {
        for (int i10 = 0; i10 < this.f2638b; i10++) {
            if (this.f2637a[i10] == t10) {
                return true;
            }
        }
        return false;
    }

    @Override // h0.e
    public boolean a(T t10) {
        if (!c(t10)) {
            int i10 = this.f2638b;
            Object[] objArr = this.f2637a;
            if (i10 < objArr.length) {
                objArr[i10] = t10;
                this.f2638b = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // h0.e
    public T b() {
        int i10 = this.f2638b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f2637a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f2638b = i10 - 1;
            return t10;
        }
        return null;
    }
}
