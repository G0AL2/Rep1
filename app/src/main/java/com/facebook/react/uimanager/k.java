package com.facebook.react.uimanager;

import java.lang.reflect.Array;

/* compiled from: MatrixMathHelper.java */
/* loaded from: classes.dex */
public class k {

    /* compiled from: MatrixMathHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        double[] f15869a = new double[4];

        /* renamed from: b  reason: collision with root package name */
        double[] f15870b = new double[3];

        /* renamed from: c  reason: collision with root package name */
        double[] f15871c = new double[3];

        /* renamed from: d  reason: collision with root package name */
        double[] f15872d = new double[3];

        /* renamed from: e  reason: collision with root package name */
        double[] f15873e = new double[3];

        private static void b(double[] dArr) {
            for (int i10 = 0; i10 < dArr.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        public void a() {
            b(this.f15869a);
            b(this.f15870b);
            b(this.f15871c);
            b(this.f15872d);
            b(this.f15873e);
        }
    }

    public static void a(double[] dArr, double d10) {
        dArr[11] = (-1.0d) / d10;
    }

    public static void b(double[] dArr, double d10) {
        dArr[5] = Math.cos(d10);
        dArr[6] = Math.sin(d10);
        dArr[9] = -Math.sin(d10);
        dArr[10] = Math.cos(d10);
    }

    public static void c(double[] dArr, double d10) {
        dArr[0] = Math.cos(d10);
        dArr[2] = -Math.sin(d10);
        dArr[8] = Math.sin(d10);
        dArr[10] = Math.cos(d10);
    }

    public static void d(double[] dArr, double d10) {
        dArr[0] = Math.cos(d10);
        dArr[1] = Math.sin(d10);
        dArr[4] = -Math.sin(d10);
        dArr[5] = Math.cos(d10);
    }

    public static void e(double[] dArr, double d10) {
        dArr[0] = d10;
    }

    public static void f(double[] dArr, double d10) {
        dArr[5] = d10;
    }

    public static void g(double[] dArr, double d10) {
        dArr[4] = Math.tan(d10);
    }

    public static void h(double[] dArr, double d10) {
        dArr[1] = Math.tan(d10);
    }

    public static void i(double[] dArr, double d10, double d11) {
        dArr[12] = d10;
        dArr[13] = d11;
    }

    public static void j(double[] dArr, double d10, double d11, double d12) {
        dArr[12] = d10;
        dArr[13] = d11;
        dArr[14] = d12;
    }

    public static void k(double[] dArr, a aVar) {
        f6.a.a(dArr.length == 16);
        double[] dArr2 = aVar.f15869a;
        double[] dArr3 = aVar.f15870b;
        double[] dArr4 = aVar.f15871c;
        double[] dArr5 = aVar.f15872d;
        double[] dArr6 = aVar.f15873e;
        if (o(dArr[15])) {
            return;
        }
        double[][] dArr7 = (double[][]) Array.newInstance(double.class, 4, 4);
        double[] dArr8 = new double[16];
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                int i12 = (i10 * 4) + i11;
                double d10 = dArr[i12] / dArr[15];
                dArr7[i10][i11] = d10;
                if (i11 == 3) {
                    d10 = 0.0d;
                }
                dArr8[i12] = d10;
            }
        }
        dArr8[15] = 1.0d;
        if (o(m(dArr8))) {
            return;
        }
        if (o(dArr7[0][3]) && o(dArr7[1][3]) && o(dArr7[2][3])) {
            dArr2[2] = 0.0d;
            dArr2[1] = 0.0d;
            dArr2[0] = 0.0d;
            dArr2[3] = 1.0d;
        } else {
            q(new double[]{dArr7[0][3], dArr7[1][3], dArr7[2][3], dArr7[3][3]}, t(n(dArr8)), dArr2);
        }
        for (int i13 = 0; i13 < 3; i13++) {
            dArr5[i13] = dArr7[3][i13];
        }
        double[][] dArr9 = (double[][]) Array.newInstance(double.class, 3, 3);
        for (int i14 = 0; i14 < 3; i14++) {
            dArr9[i14][0] = dArr7[i14][0];
            dArr9[i14][1] = dArr7[i14][1];
            dArr9[i14][2] = dArr7[i14][2];
        }
        dArr3[0] = x(dArr9[0]);
        dArr9[0] = y(dArr9[0], dArr3[0]);
        dArr4[0] = w(dArr9[0], dArr9[1]);
        dArr9[1] = u(dArr9[1], dArr9[0], 1.0d, -dArr4[0]);
        dArr3[1] = x(dArr9[1]);
        dArr9[1] = y(dArr9[1], dArr3[1]);
        dArr4[0] = dArr4[0] / dArr3[1];
        dArr4[1] = w(dArr9[0], dArr9[2]);
        dArr9[2] = u(dArr9[2], dArr9[0], 1.0d, -dArr4[1]);
        dArr4[2] = w(dArr9[1], dArr9[2]);
        dArr9[2] = u(dArr9[2], dArr9[1], 1.0d, -dArr4[2]);
        dArr3[2] = x(dArr9[2]);
        dArr9[2] = y(dArr9[2], dArr3[2]);
        dArr4[1] = dArr4[1] / dArr3[2];
        dArr4[2] = dArr4[2] / dArr3[2];
        if (w(dArr9[0], v(dArr9[1], dArr9[2])) < 0.0d) {
            for (int i15 = 0; i15 < 3; i15++) {
                dArr3[i15] = dArr3[i15] * (-1.0d);
                double[] dArr10 = dArr9[i15];
                dArr10[0] = dArr10[0] * (-1.0d);
                double[] dArr11 = dArr9[i15];
                dArr11[1] = dArr11[1] * (-1.0d);
                double[] dArr12 = dArr9[i15];
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        dArr6[0] = s((-Math.atan2(dArr9[2][1], dArr9[2][2])) * 57.29577951308232d);
        dArr6[1] = s((-Math.atan2(-dArr9[2][0], Math.sqrt((dArr9[2][1] * dArr9[2][1]) + (dArr9[2][2] * dArr9[2][2])))) * 57.29577951308232d);
        dArr6[2] = s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    public static double l(double d10) {
        return (d10 * 3.141592653589793d) / 180.0d;
    }

    public static double m(double[] dArr) {
        double d10 = dArr[0];
        double d11 = dArr[1];
        double d12 = dArr[2];
        double d13 = dArr[3];
        double d14 = dArr[4];
        double d15 = dArr[5];
        double d16 = dArr[6];
        double d17 = dArr[7];
        double d18 = dArr[8];
        double d19 = dArr[9];
        double d20 = dArr[10];
        double d21 = dArr[11];
        double d22 = dArr[12];
        double d23 = dArr[13];
        double d24 = dArr[14];
        double d25 = dArr[15];
        double d26 = d13 * d16;
        double d27 = d12 * d17;
        double d28 = d13 * d15;
        double d29 = d11 * d17;
        double d30 = d12 * d15;
        double d31 = d11 * d16;
        double d32 = d13 * d14;
        double d33 = d17 * d10;
        double d34 = d12 * d14;
        double d35 = d16 * d10;
        double d36 = d11 * d14;
        double d37 = d10 * d15;
        return ((((((((((((((((((((((((d26 * d19) * d22) - ((d27 * d19) * d22)) - ((d28 * d20) * d22)) + ((d29 * d20) * d22)) + ((d30 * d21) * d22)) - ((d31 * d21) * d22)) - ((d26 * d18) * d23)) + ((d27 * d18) * d23)) + ((d32 * d20) * d23)) - ((d33 * d20) * d23)) - ((d34 * d21) * d23)) + ((d35 * d21) * d23)) + ((d28 * d18) * d24)) - ((d29 * d18) * d24)) - ((d32 * d19) * d24)) + ((d33 * d19) * d24)) + ((d36 * d21) * d24)) - ((d21 * d37) * d24)) - ((d30 * d18) * d25)) + ((d31 * d18) * d25)) + ((d34 * d19) * d25)) - ((d35 * d19) * d25)) - ((d36 * d20) * d25)) + (d37 * d20 * d25);
    }

    public static double[] n(double[] dArr) {
        double m10 = m(dArr);
        if (o(m10)) {
            return dArr;
        }
        double d10 = dArr[0];
        double d11 = dArr[1];
        double d12 = dArr[2];
        double d13 = dArr[3];
        double d14 = dArr[4];
        double d15 = dArr[5];
        double d16 = dArr[6];
        double d17 = dArr[7];
        double d18 = dArr[8];
        double d19 = dArr[9];
        double d20 = dArr[10];
        double d21 = dArr[11];
        double d22 = dArr[12];
        double d23 = dArr[13];
        double d24 = dArr[14];
        double d25 = dArr[15];
        double d26 = d16 * d21;
        double d27 = d17 * d20;
        double d28 = d17 * d19;
        double d29 = d15 * d21;
        double d30 = d16 * d19;
        double d31 = ((((d26 * d23) - (d27 * d23)) + (d28 * d24)) - (d29 * d24)) - (d30 * d25);
        double d32 = d15 * d20;
        double d33 = d13 * d20;
        double d34 = d12 * d21;
        double d35 = d13 * d19;
        double d36 = d11 * d21;
        double d37 = d12 * d19;
        double d38 = (((d33 * d23) - (d34 * d23)) - (d35 * d24)) + (d36 * d24) + (d37 * d25);
        double d39 = d11 * d20;
        double d40 = d12 * d17;
        double d41 = d13 * d16;
        double d42 = d13 * d15;
        double d43 = d11 * d17;
        double d44 = d12 * d15;
        double d45 = d11 * d16;
        double d46 = (d27 * d22) - (d26 * d22);
        double d47 = d17 * d18;
        double d48 = d14 * d21;
        double d49 = d16 * d18;
        double d50 = (d46 - (d47 * d24)) + (d48 * d24) + (d49 * d25);
        double d51 = d14 * d20;
        double d52 = (d34 * d22) - (d33 * d22);
        double d53 = d13 * d18;
        double d54 = d10 * d21;
        double d55 = d12 * d18;
        double d56 = d10 * d20;
        double d57 = d13 * d14;
        double d58 = d17 * d10;
        double d59 = d12 * d14;
        double d60 = d16 * d10;
        double d61 = d15 * d18;
        double d62 = ((((d29 * d22) - (d28 * d22)) + (d47 * d23)) - (d48 * d23)) - (d61 * d25);
        double d63 = d14 * d19;
        double d64 = d11 * d18;
        double d65 = d10 * d19;
        double d66 = d11 * d14;
        double d67 = d10 * d15;
        return new double[]{(d31 + (d32 * d25)) / m10, (d38 - (d39 * d25)) / m10, ((((((d40 * d23) - (d41 * d23)) + (d42 * d24)) - (d43 * d24)) - (d44 * d25)) + (d45 * d25)) / m10, ((((((d41 * d19) - (d40 * d19)) - (d42 * d20)) + (d43 * d20)) + (d44 * d21)) - (d45 * d21)) / m10, (d50 - (d51 * d25)) / m10, ((((d52 + (d53 * d24)) - (d54 * d24)) - (d55 * d25)) + (d56 * d25)) / m10, ((((((d41 * d22) - (d40 * d22)) - (d57 * d24)) + (d58 * d24)) + (d59 * d25)) - (d60 * d25)) / m10, ((((((d40 * d18) - (d41 * d18)) + (d57 * d20)) - (d58 * d20)) - (d59 * d21)) + (d60 * d21)) / m10, (d62 + (d63 * d25)) / m10, ((((((d35 * d22) - (d36 * d22)) - (d53 * d23)) + (d54 * d23)) + (d64 * d25)) - (d65 * d25)) / m10, ((((((d43 * d22) - (d42 * d22)) + (d57 * d23)) - (d58 * d23)) - (d66 * d25)) + (d25 * d67)) / m10, ((((((d42 * d18) - (d43 * d18)) - (d57 * d19)) + (d58 * d19)) + (d66 * d21)) - (d21 * d67)) / m10, ((((((d30 * d22) - (d32 * d22)) - (d49 * d23)) + (d51 * d23)) + (d61 * d24)) - (d63 * d24)) / m10, ((((((d39 * d22) - (d37 * d22)) + (d55 * d23)) - (d56 * d23)) - (d64 * d24)) + (d65 * d24)) / m10, ((((((d44 * d22) - (d22 * d45)) - (d59 * d23)) + (d23 * d60)) + (d66 * d24)) - (d24 * d67)) / m10, ((((((d45 * d18) - (d44 * d18)) + (d59 * d19)) - (d60 * d19)) - (d66 * d20)) + (d67 * d20)) / m10};
    }

    private static boolean o(double d10) {
        return !Double.isNaN(d10) && Math.abs(d10) < 1.0E-5d;
    }

    public static void p(double[] dArr, double[] dArr2, double[] dArr3) {
        double d10 = dArr2[0];
        double d11 = dArr2[1];
        double d12 = dArr2[2];
        double d13 = dArr2[3];
        double d14 = dArr2[4];
        double d15 = dArr2[5];
        double d16 = dArr2[6];
        double d17 = dArr2[7];
        double d18 = dArr2[8];
        double d19 = dArr2[9];
        double d20 = dArr2[10];
        double d21 = dArr2[11];
        double d22 = dArr2[12];
        double d23 = dArr2[13];
        double d24 = dArr2[14];
        double d25 = dArr2[15];
        double d26 = dArr3[0];
        double d27 = dArr3[1];
        double d28 = dArr3[2];
        double d29 = dArr3[3];
        dArr[0] = (d26 * d10) + (d27 * d14) + (d28 * d18) + (d29 * d22);
        dArr[1] = (d26 * d11) + (d27 * d15) + (d28 * d19) + (d29 * d23);
        dArr[2] = (d26 * d12) + (d27 * d16) + (d28 * d20) + (d29 * d24);
        dArr[3] = (d26 * d13) + (d27 * d17) + (d28 * d21) + (d29 * d25);
        double d30 = dArr3[4];
        double d31 = dArr3[5];
        double d32 = dArr3[6];
        double d33 = dArr3[7];
        dArr[4] = (d30 * d10) + (d31 * d14) + (d32 * d18) + (d33 * d22);
        dArr[5] = (d30 * d11) + (d31 * d15) + (d32 * d19) + (d33 * d23);
        dArr[6] = (d30 * d12) + (d31 * d16) + (d32 * d20) + (d33 * d24);
        dArr[7] = (d30 * d13) + (d31 * d17) + (d32 * d21) + (d33 * d25);
        double d34 = dArr3[8];
        double d35 = dArr3[9];
        double d36 = dArr3[10];
        double d37 = dArr3[11];
        dArr[8] = (d34 * d10) + (d35 * d14) + (d36 * d18) + (d37 * d22);
        dArr[9] = (d34 * d11) + (d35 * d15) + (d36 * d19) + (d37 * d23);
        dArr[10] = (d34 * d12) + (d35 * d16) + (d36 * d20) + (d37 * d24);
        dArr[11] = (d34 * d13) + (d35 * d17) + (d36 * d21) + (d37 * d25);
        double d38 = dArr3[12];
        double d39 = dArr3[13];
        double d40 = dArr3[14];
        double d41 = dArr3[15];
        dArr[12] = (d10 * d38) + (d14 * d39) + (d18 * d40) + (d22 * d41);
        dArr[13] = (d11 * d38) + (d15 * d39) + (d19 * d40) + (d23 * d41);
        dArr[14] = (d12 * d38) + (d16 * d39) + (d20 * d40) + (d24 * d41);
        dArr[15] = (d38 * d13) + (d39 * d17) + (d40 * d21) + (d41 * d25);
    }

    public static void q(double[] dArr, double[] dArr2, double[] dArr3) {
        double d10 = dArr[0];
        double d11 = dArr[1];
        double d12 = dArr[2];
        double d13 = dArr[3];
        dArr3[0] = (dArr2[0] * d10) + (dArr2[4] * d11) + (dArr2[8] * d12) + (dArr2[12] * d13);
        dArr3[1] = (dArr2[1] * d10) + (dArr2[5] * d11) + (dArr2[9] * d12) + (dArr2[13] * d13);
        dArr3[2] = (dArr2[2] * d10) + (dArr2[6] * d11) + (dArr2[10] * d12) + (dArr2[14] * d13);
        dArr3[3] = (d10 * dArr2[3]) + (d11 * dArr2[7]) + (d12 * dArr2[11]) + (d13 * dArr2[15]);
    }

    public static void r(double[] dArr) {
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[11] = 0.0d;
        dArr[9] = 0.0d;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[15] = 1.0d;
        dArr[10] = 1.0d;
        dArr[5] = 1.0d;
        dArr[0] = 1.0d;
    }

    public static double s(double d10) {
        return Math.round(d10 * 1000.0d) * 0.001d;
    }

    public static double[] t(double[] dArr) {
        return new double[]{dArr[0], dArr[4], dArr[8], dArr[12], dArr[1], dArr[5], dArr[9], dArr[13], dArr[2], dArr[6], dArr[10], dArr[14], dArr[3], dArr[7], dArr[11], dArr[15]};
    }

    public static double[] u(double[] dArr, double[] dArr2, double d10, double d11) {
        return new double[]{(dArr[0] * d10) + (dArr2[0] * d11), (dArr[1] * d10) + (dArr2[1] * d11), (d10 * dArr[2]) + (d11 * dArr2[2])};
    }

    public static double[] v(double[] dArr, double[] dArr2) {
        return new double[]{(dArr[1] * dArr2[2]) - (dArr[2] * dArr2[1]), (dArr[2] * dArr2[0]) - (dArr[0] * dArr2[2]), (dArr[0] * dArr2[1]) - (dArr[1] * dArr2[0])};
    }

    public static double w(double[] dArr, double[] dArr2) {
        return (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    public static double x(double[] dArr) {
        return Math.sqrt((dArr[0] * dArr[0]) + (dArr[1] * dArr[1]) + (dArr[2] * dArr[2]));
    }

    public static double[] y(double[] dArr, double d10) {
        if (o(d10)) {
            d10 = x(dArr);
        }
        double d11 = 1.0d / d10;
        return new double[]{dArr[0] * d11, dArr[1] * d11, dArr[2] * d11};
    }
}
