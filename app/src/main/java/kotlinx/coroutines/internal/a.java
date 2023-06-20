package kotlinx.coroutines.internal;

/* compiled from: ArrayQueue.kt */
/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f33490a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private int f33491b;

    /* renamed from: c  reason: collision with root package name */
    private int f33492c;

    private final void b() {
        Object[] objArr = this.f33490a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        fe.k.f(objArr, objArr2, 0, this.f33491b, 0, 10, null);
        Object[] objArr3 = this.f33490a;
        int length2 = objArr3.length;
        int i10 = this.f33491b;
        fe.k.f(objArr3, objArr2, length2 - i10, 0, i10, 4, null);
        this.f33490a = objArr2;
        this.f33491b = 0;
        this.f33492c = length;
    }

    public final void a(T t10) {
        qe.k.g(t10, "element");
        Object[] objArr = this.f33490a;
        int i10 = this.f33492c;
        objArr[i10] = t10;
        int length = (objArr.length - 1) & (i10 + 1);
        this.f33492c = length;
        if (length == this.f33491b) {
            b();
        }
    }

    public final boolean c() {
        return this.f33491b == this.f33492c;
    }

    public final T d() {
        int i10 = this.f33491b;
        if (i10 == this.f33492c) {
            return null;
        }
        Object[] objArr = this.f33490a;
        T t10 = (T) objArr[i10];
        objArr[i10] = null;
        this.f33491b = (i10 + 1) & (objArr.length - 1);
        if (t10 != null) {
            return t10;
        }
        throw new ee.r("null cannot be cast to non-null type T");
    }
}
