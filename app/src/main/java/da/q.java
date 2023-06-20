package da;

import da.b;
import java.util.Arrays;

/* compiled from: DefaultAllocator.java */
/* loaded from: classes2.dex */
public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29247a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29248b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f29249c;

    /* renamed from: d  reason: collision with root package name */
    private int f29250d;

    /* renamed from: e  reason: collision with root package name */
    private int f29251e;

    /* renamed from: f  reason: collision with root package name */
    private int f29252f;

    /* renamed from: g  reason: collision with root package name */
    private a[] f29253g;

    public q(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // da.b
    public synchronized a a() {
        a aVar;
        this.f29251e++;
        int i10 = this.f29252f;
        if (i10 > 0) {
            a[] aVarArr = this.f29253g;
            int i11 = i10 - 1;
            this.f29252f = i11;
            aVar = (a) ea.a.e(aVarArr[i11]);
            this.f29253g[this.f29252f] = null;
        } else {
            aVar = new a(new byte[this.f29248b], 0);
            int i12 = this.f29251e;
            a[] aVarArr2 = this.f29253g;
            if (i12 > aVarArr2.length) {
                this.f29253g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    @Override // da.b
    public synchronized void b(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f29253g;
            int i10 = this.f29252f;
            this.f29252f = i10 + 1;
            aVarArr[i10] = aVar.a();
            this.f29251e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override // da.b
    public synchronized int c() {
        return this.f29251e * this.f29248b;
    }

    @Override // da.b
    public synchronized void d(a aVar) {
        a[] aVarArr = this.f29253g;
        int i10 = this.f29252f;
        this.f29252f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f29251e--;
        notifyAll();
    }

    @Override // da.b
    public synchronized void e() {
        int i10 = 0;
        int max = Math.max(0, ea.n0.l(this.f29250d, this.f29248b) - this.f29251e);
        int i11 = this.f29252f;
        if (max >= i11) {
            return;
        }
        if (this.f29249c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) ea.a.e(this.f29253g[i10]);
                if (aVar.f29118a == this.f29249c) {
                    i10++;
                } else {
                    a aVar2 = (a) ea.a.e(this.f29253g[i12]);
                    if (aVar2.f29118a != this.f29249c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f29253g;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f29252f) {
                return;
            }
        }
        Arrays.fill(this.f29253g, max, this.f29252f, (Object) null);
        this.f29252f = max;
    }

    @Override // da.b
    public int f() {
        return this.f29248b;
    }

    public synchronized void g() {
        if (this.f29247a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f29250d;
        this.f29250d = i10;
        if (z10) {
            e();
        }
    }

    public q(boolean z10, int i10, int i11) {
        ea.a.a(i10 > 0);
        ea.a.a(i11 >= 0);
        this.f29247a = z10;
        this.f29248b = i10;
        this.f29252f = i11;
        this.f29253g = new a[i11 + 100];
        if (i11 > 0) {
            this.f29249c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f29253g[i12] = new a(this.f29249c, i12 * i10);
            }
            return;
        }
        this.f29249c = null;
    }
}
