package h6;

/* compiled from: ClearableSynchronizedPool.java */
/* loaded from: classes.dex */
public class a<T> implements h0.e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f31104a;

    /* renamed from: b  reason: collision with root package name */
    private int f31105b = 0;

    public a(int i10) {
        this.f31104a = new Object[i10];
    }

    @Override // h0.e
    public synchronized boolean a(T t10) {
        int i10 = this.f31105b;
        Object[] objArr = this.f31104a;
        if (i10 == objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f31105b = i10 + 1;
        return true;
    }

    @Override // h0.e
    public synchronized T b() {
        int i10 = this.f31105b;
        if (i10 == 0) {
            return null;
        }
        int i11 = i10 - 1;
        this.f31105b = i11;
        Object[] objArr = this.f31104a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        return t10;
    }

    public synchronized void c() {
        for (int i10 = 0; i10 < this.f31105b; i10++) {
            this.f31104a[i10] = null;
        }
        this.f31105b = 0;
    }
}
