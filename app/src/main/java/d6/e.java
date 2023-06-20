package d6;

import android.graphics.Matrix;

/* compiled from: JpegTranscoderUtils.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final y3.f<Integer> f29086a = y3.f.a(2, 7, 4, 5);

    public static int a(int i10) {
        return Math.max(1, 8 / i10);
    }

    public static float b(q5.e eVar, int i10, int i11) {
        if (eVar == null) {
            return 1.0f;
        }
        float f10 = i10;
        float f11 = i11;
        float max = Math.max(eVar.f35945a / f10, eVar.f35946b / f11);
        float f12 = eVar.f35947c;
        if (f10 * max > f12) {
            max = f12 / f10;
        }
        return f11 * max > f12 ? f12 / f11 : max;
    }

    private static int c(w5.e eVar) {
        int O = eVar.O();
        if (O == 90 || O == 180 || O == 270) {
            return eVar.O();
        }
        return 0;
    }

    public static int d(q5.f fVar, w5.e eVar) {
        int w10 = eVar.w();
        y3.f<Integer> fVar2 = f29086a;
        int indexOf = fVar2.indexOf(Integer.valueOf(w10));
        if (indexOf >= 0) {
            return fVar2.get((indexOf + ((fVar.g() ? 0 : fVar.e()) / 90)) % fVar2.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int e(q5.f fVar, w5.e eVar) {
        if (fVar.f()) {
            int c10 = c(eVar);
            return fVar.g() ? c10 : (c10 + fVar.e()) % 360;
        }
        return 0;
    }

    public static int f(q5.f fVar, q5.e eVar, w5.e eVar2, boolean z10) {
        if (z10 && eVar != null) {
            int e10 = e(fVar, eVar2);
            boolean z11 = false;
            int d10 = f29086a.contains(Integer.valueOf(eVar2.w())) ? d(fVar, eVar2) : 0;
            z11 = (e10 == 90 || e10 == 270 || d10 == 5 || d10 == 7) ? true : true;
            int k10 = k(b(eVar, z11 ? eVar2.z() : eVar2.Z(), z11 ? eVar2.Z() : eVar2.z()), eVar.f35948d);
            if (k10 > 8) {
                return 8;
            }
            if (k10 < 1) {
                return 1;
            }
            return k10;
        }
        return 8;
    }

    public static Matrix g(w5.e eVar, q5.f fVar) {
        if (f29086a.contains(Integer.valueOf(eVar.w()))) {
            return h(d(fVar, eVar));
        }
        int e10 = e(fVar, eVar);
        if (e10 != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate(e10);
            return matrix;
        }
        return null;
    }

    private static Matrix h(int i10) {
        Matrix matrix = new Matrix();
        if (i10 == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i10 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i10 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i10 != 5) {
            return null;
        } else {
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static boolean i(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static boolean j(int i10) {
        return i10 >= 0 && i10 <= 270 && i10 % 90 == 0;
    }

    public static int k(float f10, float f11) {
        return (int) (f11 + (f10 * 8.0f));
    }
}
