package i9;

import android.util.SparseArray;

/* compiled from: SpannedData.java */
/* loaded from: classes2.dex */
final class u0<V> {

    /* renamed from: c  reason: collision with root package name */
    private final ea.g<V> f31835c;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<V> f31834b = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    private int f31833a = -1;

    public u0(ea.g<V> gVar) {
        this.f31835c = gVar;
    }

    public void a(int i10, V v10) {
        if (this.f31833a == -1) {
            ea.a.f(this.f31834b.size() == 0);
            this.f31833a = 0;
        }
        if (this.f31834b.size() > 0) {
            SparseArray<V> sparseArray = this.f31834b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            ea.a.a(i10 >= keyAt);
            if (keyAt == i10) {
                SparseArray<V> sparseArray2 = this.f31834b;
                this.f31835c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f31834b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f31834b.size(); i10++) {
            this.f31835c.accept(this.f31834b.valueAt(i10));
        }
        this.f31833a = -1;
        this.f31834b.clear();
    }

    public void c(int i10) {
        for (int size = this.f31834b.size() - 1; size >= 0 && i10 < this.f31834b.keyAt(size); size--) {
            this.f31835c.accept(this.f31834b.valueAt(size));
            this.f31834b.removeAt(size);
        }
        this.f31833a = this.f31834b.size() > 0 ? Math.min(this.f31833a, this.f31834b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f31834b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f31834b.keyAt(i12)) {
                return;
            }
            this.f31835c.accept(this.f31834b.valueAt(i11));
            this.f31834b.removeAt(i11);
            int i13 = this.f31833a;
            if (i13 > 0) {
                this.f31833a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V e(int i10) {
        if (this.f31833a == -1) {
            this.f31833a = 0;
        }
        while (true) {
            int i11 = this.f31833a;
            if (i11 <= 0 || i10 >= this.f31834b.keyAt(i11)) {
                break;
            }
            this.f31833a--;
        }
        while (this.f31833a < this.f31834b.size() - 1 && i10 >= this.f31834b.keyAt(this.f31833a + 1)) {
            this.f31833a++;
        }
        return this.f31834b.valueAt(this.f31833a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f31834b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f31834b.size() == 0;
    }
}
