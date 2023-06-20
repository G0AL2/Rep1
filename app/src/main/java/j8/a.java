package j8;

import android.util.Pair;
import j8.j3;

/* compiled from: AbstractConcatenatedTimeline.java */
/* loaded from: classes2.dex */
public abstract class a extends j3 {

    /* renamed from: b  reason: collision with root package name */
    private final int f32209b;

    /* renamed from: c  reason: collision with root package name */
    private final i9.q0 f32210c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f32211d;

    public a(boolean z10, i9.q0 q0Var) {
        this.f32211d = z10;
        this.f32210c = q0Var;
        this.f32209b = q0Var.b();
    }

    private int B(int i10, boolean z10) {
        if (z10) {
            return this.f32210c.e(i10);
        }
        if (i10 < this.f32209b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int C(int i10, boolean z10) {
        if (z10) {
            return this.f32210c.d(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    protected abstract int A(int i10);

    protected abstract j3 D(int i10);

    @Override // j8.j3
    public int a(boolean z10) {
        if (this.f32209b == 0) {
            return -1;
        }
        if (this.f32211d) {
            z10 = false;
        }
        int h10 = z10 ? this.f32210c.h() : 0;
        while (D(h10).q()) {
            h10 = B(h10, z10);
            if (h10 == -1) {
                return -1;
            }
        }
        return A(h10) + D(h10).a(z10);
    }

    @Override // j8.j3
    public final int b(Object obj) {
        int b10;
        if (obj instanceof Pair) {
            Object w10 = w(obj);
            Object v10 = v(obj);
            int s10 = s(w10);
            if (s10 == -1 || (b10 = D(s10).b(v10)) == -1) {
                return -1;
            }
            return z(s10) + b10;
        }
        return -1;
    }

    @Override // j8.j3
    public int c(boolean z10) {
        int i10 = this.f32209b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f32211d) {
            z10 = false;
        }
        int f10 = z10 ? this.f32210c.f() : i10 - 1;
        while (D(f10).q()) {
            f10 = C(f10, z10);
            if (f10 == -1) {
                return -1;
            }
        }
        return A(f10) + D(f10).c(z10);
    }

    @Override // j8.j3
    public int e(int i10, int i11, boolean z10) {
        if (this.f32211d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A = A(u10);
        int e10 = D(u10).e(i10 - A, i11 != 2 ? i11 : 0, z10);
        if (e10 != -1) {
            return A + e10;
        }
        int B = B(u10, z10);
        while (B != -1 && D(B).q()) {
            B = B(B, z10);
        }
        if (B != -1) {
            return A(B) + D(B).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // j8.j3
    public final j3.b g(int i10, j3.b bVar, boolean z10) {
        int t10 = t(i10);
        int A = A(t10);
        D(t10).g(i10 - z(t10), bVar, z10);
        bVar.f32510c += A;
        if (z10) {
            bVar.f32509b = y(x(t10), ea.a.e(bVar.f32509b));
        }
        return bVar;
    }

    @Override // j8.j3
    public final j3.b h(Object obj, j3.b bVar) {
        Object w10 = w(obj);
        Object v10 = v(obj);
        int s10 = s(w10);
        int A = A(s10);
        D(s10).h(v10, bVar);
        bVar.f32510c += A;
        bVar.f32509b = obj;
        return bVar;
    }

    @Override // j8.j3
    public int l(int i10, int i11, boolean z10) {
        if (this.f32211d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A = A(u10);
        int l10 = D(u10).l(i10 - A, i11 != 2 ? i11 : 0, z10);
        if (l10 != -1) {
            return A + l10;
        }
        int C = C(u10, z10);
        while (C != -1 && D(C).q()) {
            C = C(C, z10);
        }
        if (C != -1) {
            return A(C) + D(C).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // j8.j3
    public final Object m(int i10) {
        int t10 = t(i10);
        return y(x(t10), D(t10).m(i10 - z(t10)));
    }

    @Override // j8.j3
    public final j3.c o(int i10, j3.c cVar, long j10) {
        int u10 = u(i10);
        int A = A(u10);
        int z10 = z(u10);
        D(u10).o(i10 - A, cVar, j10);
        Object x10 = x(u10);
        if (!j3.c.f32515r.equals(cVar.f32519a)) {
            x10 = y(x10, cVar.f32519a);
        }
        cVar.f32519a = x10;
        cVar.f32533o += z10;
        cVar.f32534p += z10;
        return cVar;
    }

    protected abstract int s(Object obj);

    protected abstract int t(int i10);

    protected abstract int u(int i10);

    protected abstract Object x(int i10);

    protected abstract int z(int i10);
}
