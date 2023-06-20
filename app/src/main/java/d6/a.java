package d6;

import y3.k;

/* compiled from: DownsampleUtil.java */
/* loaded from: classes.dex */
public class a {
    public static float a(q5.f fVar, q5.e eVar, w5.e eVar2) {
        k.b(Boolean.valueOf(w5.e.m0(eVar2)));
        if (eVar == null || eVar.f35946b <= 0 || eVar.f35945a <= 0 || eVar2.Z() == 0 || eVar2.z() == 0) {
            return 1.0f;
        }
        int d10 = d(fVar, eVar2);
        boolean z10 = d10 == 90 || d10 == 270;
        int z11 = z10 ? eVar2.z() : eVar2.Z();
        int Z = z10 ? eVar2.Z() : eVar2.z();
        float f10 = eVar.f35945a / z11;
        float f11 = eVar.f35946b / Z;
        float max = Math.max(f10, f11);
        z3.a.B("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(eVar.f35945a), Integer.valueOf(eVar.f35946b), Integer.valueOf(z11), Integer.valueOf(Z), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(max));
        return max;
    }

    public static int b(q5.f fVar, q5.e eVar, w5.e eVar2, int i10) {
        int e10;
        if (w5.e.m0(eVar2)) {
            float a10 = a(fVar, eVar, eVar2);
            if (eVar2.A() == com.facebook.imageformat.b.f14800a) {
                e10 = f(a10);
            } else {
                e10 = e(a10);
            }
            int max = Math.max(eVar2.z(), eVar2.Z());
            float f10 = eVar != null ? eVar.f35947c : i10;
            while (max / e10 > f10) {
                e10 = eVar2.A() == com.facebook.imageformat.b.f14800a ? e10 * 2 : e10 + 1;
            }
            return e10;
        }
        return 1;
    }

    public static int c(w5.e eVar, int i10, int i11) {
        int T = eVar.T();
        while ((((eVar.Z() * eVar.z()) * i10) / T) / T > i11) {
            T *= 2;
        }
        return T;
    }

    private static int d(q5.f fVar, w5.e eVar) {
        boolean z10 = false;
        if (fVar.g()) {
            int O = eVar.O();
            k.b(Boolean.valueOf((O == 0 || O == 90 || O == 180 || O == 270) ? true : true));
            return O;
        }
        return 0;
    }

    public static int e(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            double d10 = i10;
            if ((1.0d / d10) + ((1.0d / (Math.pow(d10, 2.0d) - d10)) * 0.3333333432674408d) <= f10) {
                return i10 - 1;
            }
            i10++;
        }
    }

    public static int f(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            int i11 = i10 * 2;
            double d10 = 1.0d / i11;
            if (d10 + (0.3333333432674408d * d10) <= f10) {
                return i10;
            }
            i10 = i11;
        }
    }
}
