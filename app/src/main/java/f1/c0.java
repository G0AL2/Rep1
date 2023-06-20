package f1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final i0 f29962a;

    /* renamed from: b  reason: collision with root package name */
    static final Property<View, Float> f29963b;

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            c0.g(view, f10.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return androidx.core.view.z.u(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            androidx.core.view.z.x0(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f29962a = new h0();
        } else if (i10 >= 23) {
            f29962a = new g0();
        } else if (i10 >= 22) {
            f29962a = new f0();
        } else if (i10 >= 21) {
            f29962a = new e0();
        } else if (i10 >= 19) {
            f29962a = new d0();
        } else {
            f29962a = new i0();
        }
        f29963b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        f29962a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new a0(view);
        }
        return z.e(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return f29962a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new l0(view);
        }
        return new k0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        f29962a.d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, int i10, int i11, int i12, int i13) {
        f29962a.e(view, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, float f10) {
        f29962a.f(view, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view, int i10) {
        f29962a.g(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, Matrix matrix) {
        f29962a.h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, Matrix matrix) {
        f29962a.i(view, matrix);
    }
}
