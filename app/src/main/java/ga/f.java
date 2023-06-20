package ga;

import ea.a0;
import ea.n0;
import ea.z;
import ga.e;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: ProjectionDecoder.java */
/* loaded from: classes2.dex */
final class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList<e.a> arrayList;
        a0 a0Var = new a0(bArr);
        try {
            arrayList = c(a0Var) ? f(a0Var) : e(a0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                return null;
            }
            return new e(arrayList.get(0), arrayList.get(1), i10);
        }
        return new e(arrayList.get(0), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(a0 a0Var) {
        a0Var.Q(4);
        int n10 = a0Var.n();
        a0Var.P(0);
        return n10 == 1886547818;
    }

    private static e.a d(a0 a0Var) {
        int n10 = a0Var.n();
        if (n10 > 10000) {
            return null;
        }
        float[] fArr = new float[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            fArr[i10] = a0Var.m();
        }
        int n11 = a0Var.n();
        if (n11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(n10 * 2.0d) / log);
        z zVar = new z(a0Var.d());
        int i11 = 8;
        zVar.p(a0Var.e() * 8);
        float[] fArr2 = new float[n11 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < n11) {
            int i15 = 0;
            while (i15 < i12) {
                int b10 = iArr[i15] + b(zVar.h(ceil));
                if (b10 >= n10 || b10 < 0) {
                    return null;
                }
                fArr2[i14] = fArr[b10];
                iArr[i15] = b10;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        zVar.p((zVar.e() + 7) & (-8));
        int i16 = 32;
        int h10 = zVar.h(32);
        e.b[] bVarArr = new e.b[h10];
        int i17 = 0;
        while (i17 < h10) {
            int h11 = zVar.h(i11);
            int h12 = zVar.h(i11);
            int h13 = zVar.h(i16);
            if (h13 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(n11 * d10) / log);
            float[] fArr3 = new float[h13 * 3];
            float[] fArr4 = new float[h13 * 2];
            int i18 = 0;
            for (int i19 = 0; i19 < h13; i19++) {
                i18 += b(zVar.h(ceil2));
                if (i18 < 0 || i18 >= n11) {
                    return null;
                }
                int i20 = i19 * 3;
                int i21 = i18 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i19 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
            }
            bVarArr[i17] = new e.b(h11, fArr3, fArr4, h12);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList<e.a> e(a0 a0Var) {
        if (a0Var.D() != 0) {
            return null;
        }
        a0Var.Q(7);
        int n10 = a0Var.n();
        if (n10 == 1684433976) {
            a0 a0Var2 = new a0();
            Inflater inflater = new Inflater(true);
            try {
                if (!n0.r0(a0Var, a0Var2, inflater)) {
                    return null;
                }
                inflater.end();
                a0Var = a0Var2;
            } finally {
                inflater.end();
            }
        } else if (n10 != 1918990112) {
            return null;
        }
        return g(a0Var);
    }

    private static ArrayList<e.a> f(a0 a0Var) {
        int n10;
        a0Var.Q(8);
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        while (e10 < f10 && (n10 = a0Var.n() + e10) > e10 && n10 <= f10) {
            int n11 = a0Var.n();
            if (n11 != 2037673328 && n11 != 1836279920) {
                a0Var.P(n10);
                e10 = n10;
            } else {
                a0Var.O(n10);
                return e(a0Var);
            }
        }
        return null;
    }

    private static ArrayList<e.a> g(a0 a0Var) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        while (e10 < f10) {
            int n10 = a0Var.n() + e10;
            if (n10 <= e10 || n10 > f10) {
                return null;
            }
            if (a0Var.n() == 1835365224) {
                e.a d10 = d(a0Var);
                if (d10 == null) {
                    return null;
                }
                arrayList.add(d10);
            }
            a0Var.P(n10);
            e10 = n10;
        }
        return arrayList;
    }
}
