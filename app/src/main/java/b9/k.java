package b9;

import java.util.NoSuchElementException;

/* compiled from: IntArrayQueue.java */
/* loaded from: classes2.dex */
final class k {

    /* renamed from: a  reason: collision with root package name */
    private int f4939a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f4940b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f4941c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f4942d;

    /* renamed from: e  reason: collision with root package name */
    private int f4943e;

    public k() {
        int[] iArr = new int[16];
        this.f4942d = iArr;
        this.f4943e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f4942d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i10 = this.f4939a;
            int i11 = length2 - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f4942d, 0, iArr2, i11, i10);
            this.f4939a = 0;
            this.f4940b = this.f4941c - 1;
            this.f4942d = iArr2;
            this.f4943e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i10) {
        if (this.f4941c == this.f4942d.length) {
            c();
        }
        int i11 = (this.f4940b + 1) & this.f4943e;
        this.f4940b = i11;
        this.f4942d[i11] = i10;
        this.f4941c++;
    }

    public void b() {
        this.f4939a = 0;
        this.f4940b = -1;
        this.f4941c = 0;
    }

    public boolean d() {
        return this.f4941c == 0;
    }

    public int e() {
        int i10 = this.f4941c;
        if (i10 != 0) {
            int[] iArr = this.f4942d;
            int i11 = this.f4939a;
            int i12 = iArr[i11];
            this.f4939a = (i11 + 1) & this.f4943e;
            this.f4941c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
