package u4;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: ScalingUtils.java */
/* loaded from: classes.dex */
public class q {

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public static abstract class a implements b {
        @Override // u4.q.b
        public Matrix a(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11) {
            b(matrix, rect, i10, i11, f10, f11, rect.width() / i10, rect.height() / i11);
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13);
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f37547a = k.f37561g;

        /* renamed from: b  reason: collision with root package name */
        public static final b f37548b;

        /* renamed from: c  reason: collision with root package name */
        public static final b f37549c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f37550d;

        /* renamed from: e  reason: collision with root package name */
        public static final b f37551e;

        /* renamed from: f  reason: collision with root package name */
        public static final b f37552f;

        static {
            b bVar = j.f37560g;
            b bVar2 = l.f37562g;
            b bVar3 = i.f37559g;
            f37548b = g.f37557g;
            b bVar4 = h.f37558g;
            f37549c = c.f37553g;
            f37550d = e.f37555g;
            f37551e = d.f37554g;
            f37552f = m.f37563g;
            b bVar5 = f.f37556g;
        }

        Matrix a(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11);
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class c extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37553g = new c();

        private c() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i10) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i11) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class d extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37554g = new d();

        private d() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float height;
            float f14;
            if (f13 > f12) {
                f14 = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
                height = rect.top;
                f12 = f13;
            } else {
                height = ((rect.height() - (i11 * f12)) * 0.5f) + rect.top;
                f14 = rect.left;
            }
            matrix.setScale(f12, f12);
            matrix.postTranslate((int) (f14 + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class e extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37555g = new e();

        private e() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(Math.min(f12, f13), 1.0f);
            float width = rect.left + ((rect.width() - (i10 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i11 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class f extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37556g = new f();

        private f() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(f12, f13);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + (rect.height() - (i11 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class g extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37557g = new g();

        private g() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(f12, f13);
            float width = rect.left + ((rect.width() - (i10 * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i11 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class h extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37558g = new h();

        private h() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(f12, f13);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + (rect.width() - (i10 * min)) + 0.5f), (int) (rect.top + (rect.height() - (i11 * min)) + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class i extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37559g = new i();

        private i() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float min = Math.min(f12, f13);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class j extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37560g = new j();

        private j() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float height = rect.top + ((rect.height() - (i11 * f12)) * 0.5f);
            matrix.setScale(f12, f12);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (height + 0.5f));
        }

        public String toString() {
            return "fit_x";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class k extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37561g = new k();

        private k() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            matrix.setScale(f12, f13);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class l extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37562g = new l();

        private l() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            matrix.setScale(f13, f13);
            matrix.postTranslate((int) (rect.left + ((rect.width() - (i10 * f13)) * 0.5f) + 0.5f), (int) (rect.top + 0.5f));
        }

        public String toString() {
            return "fit_y";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    private static class m extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final b f37563g = new m();

        private m() {
        }

        @Override // u4.q.a
        public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
            float f14;
            float max;
            if (f13 > f12) {
                float f15 = i10 * f13;
                f14 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f10 * f15), 0.0f), rect.width() - f15);
                max = rect.top;
                f12 = f13;
            } else {
                f14 = rect.left;
                float f16 = i11 * f12;
                max = Math.max(Math.min((rect.height() * 0.5f) - (f11 * f16), 0.0f), rect.height() - f16) + rect.top;
            }
            matrix.setScale(f12, f12);
            matrix.postTranslate((int) (f14 + 0.5f), (int) (max + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* compiled from: ScalingUtils.java */
    /* loaded from: classes.dex */
    public interface n {
        Object getState();
    }

    public static p a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof p) {
            return (p) drawable;
        }
        if (drawable instanceof u4.c) {
            return a(((u4.c) drawable).r());
        }
        if (drawable instanceof u4.a) {
            u4.a aVar = (u4.a) drawable;
            int f10 = aVar.f();
            for (int i10 = 0; i10 < f10; i10++) {
                p a10 = a(aVar.b(i10));
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return null;
    }
}
