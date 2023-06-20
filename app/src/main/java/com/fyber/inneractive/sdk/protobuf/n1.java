package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n1 {

    /* renamed from: f  reason: collision with root package name */
    public static final n1 f19962f = new n1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f19963a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f19964b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f19965c;

    /* renamed from: d  reason: collision with root package name */
    public int f19966d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f19967e;

    public n1() {
        this(0, new int[8], new Object[8], true);
    }

    public static n1 a(n1 n1Var, n1 n1Var2) {
        int i10 = n1Var.f19963a + n1Var2.f19963a;
        int[] copyOf = Arrays.copyOf(n1Var.f19964b, i10);
        System.arraycopy(n1Var2.f19964b, 0, copyOf, n1Var.f19963a, n1Var2.f19963a);
        Object[] copyOf2 = Arrays.copyOf(n1Var.f19965c, i10);
        System.arraycopy(n1Var2.f19965c, 0, copyOf2, n1Var.f19963a, n1Var2.f19963a);
        return new n1(i10, copyOf, copyOf2, true);
    }

    public static n1 c() {
        return new n1(0, new int[8], new Object[8], true);
    }

    public int b() {
        int e10;
        int i10 = this.f19966d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f19963a; i12++) {
            int i13 = this.f19964b[i12];
            int i14 = t1.f20010a;
            int i15 = i13 >>> 3;
            int i16 = i13 & 7;
            if (i16 == 0) {
                e10 = l.e(i15, ((Long) this.f19965c[i12]).longValue());
            } else if (i16 == 1) {
                e10 = l.a(i15, ((Long) this.f19965c[i12]).longValue());
            } else if (i16 == 2) {
                e10 = l.a(i15, (i) this.f19965c[i12]);
            } else if (i16 == 3) {
                e10 = (l.b(i15) * 2) + ((n1) this.f19965c[i12]).b();
            } else if (i16 == 5) {
                e10 = l.b(i15, ((Integer) this.f19965c[i12]).intValue());
            } else {
                throw new IllegalStateException(a0.d());
            }
            i11 += e10;
        }
        this.f19966d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof n1)) {
            n1 n1Var = (n1) obj;
            int i10 = this.f19963a;
            if (i10 == n1Var.f19963a) {
                int[] iArr = this.f19964b;
                int[] iArr2 = n1Var.f19964b;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        z10 = true;
                        break;
                    } else if (iArr[i11] != iArr2[i11]) {
                        z10 = false;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z10) {
                    Object[] objArr = this.f19965c;
                    Object[] objArr2 = n1Var.f19965c;
                    int i12 = this.f19963a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            z11 = true;
                            break;
                        } else if (!objArr[i13].equals(objArr2[i13])) {
                            z11 = false;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (z11) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f19963a;
        int i11 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f19964b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f19965c;
        int i16 = this.f19963a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public n1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f19966d = -1;
        this.f19963a = i10;
        this.f19964b = iArr;
        this.f19965c = objArr;
        this.f19967e = z10;
    }

    public void a() {
        if (!this.f19967e) {
            throw new UnsupportedOperationException();
        }
    }

    public void a(u1 u1Var) throws IOException {
        if (this.f19963a == 0) {
            return;
        }
        u1Var.getClass();
        for (int i10 = 0; i10 < this.f19963a; i10++) {
            a(this.f19964b[i10], this.f19965c[i10], u1Var);
        }
    }

    public static void a(int i10, Object obj, u1 u1Var) throws IOException {
        int i11 = t1.f20010a;
        int i12 = i10 >>> 3;
        int i13 = i10 & 7;
        if (i13 == 0) {
            ((m) u1Var).f19956a.g(i12, ((Long) obj).longValue());
        } else if (i13 == 1) {
            ((m) u1Var).f19956a.f(i12, ((Long) obj).longValue());
        } else if (i13 == 2) {
            ((m) u1Var).f19956a.b(i12, (i) obj);
        } else if (i13 != 3) {
            if (i13 == 5) {
                ((m) u1Var).f19956a.g(i12, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(a0.d());
        } else {
            m mVar = (m) u1Var;
            mVar.f19956a.i(i12, 3);
            ((n1) obj).a(u1Var);
            mVar.f19956a.i(i12, 4);
        }
    }

    public void a(int i10, Object obj) {
        a();
        int i11 = this.f19963a;
        int[] iArr = this.f19964b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f19964b = Arrays.copyOf(iArr, i12);
            this.f19965c = Arrays.copyOf(this.f19965c, i12);
        }
        int[] iArr2 = this.f19964b;
        int i13 = this.f19963a;
        iArr2[i13] = i10;
        this.f19965c[i13] = obj;
        this.f19963a = i13 + 1;
    }

    public boolean a(int i10, j jVar) throws IOException {
        int t10;
        a();
        int i11 = t1.f20010a;
        int i12 = i10 >>> 3;
        int i13 = i10 & 7;
        if (i13 == 0) {
            a(i10, Long.valueOf(jVar.l()));
            return true;
        } else if (i13 == 1) {
            a(i10, Long.valueOf(jVar.i()));
            return true;
        } else if (i13 == 2) {
            a(i10, jVar.e());
            return true;
        } else if (i13 != 3) {
            if (i13 != 4) {
                if (i13 == 5) {
                    a(i10, Integer.valueOf(jVar.h()));
                    return true;
                }
                throw a0.d();
            }
            return false;
        } else {
            n1 n1Var = new n1(0, new int[8], new Object[8], true);
            do {
                t10 = jVar.t();
                if (t10 == 0) {
                    break;
                }
            } while (n1Var.a(t10, jVar));
            jVar.a(t1.a(i12, 4));
            a(i10, n1Var);
            return true;
        }
    }
}
