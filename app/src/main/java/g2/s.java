package g2;

import android.graphics.Color;
import android.graphics.PointF;
import h2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
class s {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30513a = c.a.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonUtils.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30514a;

        static {
            int[] iArr = new int[c.b.values().length];
            f30514a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30514a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30514a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(h2.c cVar, float f10) throws IOException {
        cVar.b();
        float w10 = (float) cVar.w();
        float w11 = (float) cVar.w();
        while (cVar.L() != c.b.END_ARRAY) {
            cVar.Z();
        }
        cVar.e();
        return new PointF(w10 * f10, w11 * f10);
    }

    private static PointF b(h2.c cVar, float f10) throws IOException {
        float w10 = (float) cVar.w();
        float w11 = (float) cVar.w();
        while (cVar.l()) {
            cVar.Z();
        }
        return new PointF(w10 * f10, w11 * f10);
    }

    private static PointF c(h2.c cVar, float f10) throws IOException {
        cVar.d();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (cVar.l()) {
            int T = cVar.T(f30513a);
            if (T == 0) {
                f11 = g(cVar);
            } else if (T != 1) {
                cVar.U();
                cVar.Z();
            } else {
                f12 = g(cVar);
            }
        }
        cVar.h();
        return new PointF(f11 * f10, f12 * f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(h2.c cVar) throws IOException {
        cVar.b();
        int w10 = (int) (cVar.w() * 255.0d);
        int w11 = (int) (cVar.w() * 255.0d);
        int w12 = (int) (cVar.w() * 255.0d);
        while (cVar.l()) {
            cVar.Z();
        }
        cVar.e();
        return Color.argb(255, w10, w11, w12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF e(h2.c cVar, float f10) throws IOException {
        int i10 = a.f30514a[cVar.L().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return c(cVar, f10);
                }
                throw new IllegalArgumentException("Unknown point starts with " + cVar.L());
            }
            return a(cVar, f10);
        }
        return b(cVar, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> f(h2.c cVar, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.L() == c.b.BEGIN_ARRAY) {
            cVar.b();
            arrayList.add(e(cVar, f10));
            cVar.e();
        }
        cVar.e();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(h2.c cVar) throws IOException {
        c.b L = cVar.L();
        int i10 = a.f30514a[L.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                cVar.b();
                float w10 = (float) cVar.w();
                while (cVar.l()) {
                    cVar.Z();
                }
                cVar.e();
                return w10;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + L);
        }
        return (float) cVar.w();
    }
}
