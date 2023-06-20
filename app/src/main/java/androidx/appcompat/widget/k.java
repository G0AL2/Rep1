package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.o0;

/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    private static final PorterDuff.Mode f1560b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static k f1561c;

    /* renamed from: a  reason: collision with root package name */
    private o0 f1562a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public class a implements o0.f {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f1563a = {d.e.R, d.e.P, d.e.f28705a};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1564b = {d.e.f28719o, d.e.B, d.e.f28724t, d.e.f28720p, d.e.f28721q, d.e.f28723s, d.e.f28722r};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f1565c = {d.e.O, d.e.Q, d.e.f28715k, d.e.K, d.e.L, d.e.M, d.e.N};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f1566d = {d.e.f28727w, d.e.f28713i, d.e.f28726v};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f1567e = {d.e.J, d.e.S};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f1568f = {d.e.f28707c, d.e.f28711g, d.e.f28708d, d.e.f28712h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = u0.c(context, d.a.f28677w);
            return new ColorStateList(new int[][]{u0.f1735b, u0.f1737d, u0.f1736c, u0.f1739f}, new int[]{u0.b(context, d.a.f28675u), z.a.c(c10, i10), z.a.c(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, u0.c(context, d.a.f28674t));
        }

        private ColorStateList j(Context context) {
            return h(context, u0.c(context, d.a.f28675u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = d.a.f28679y;
            ColorStateList e10 = u0.e(context, i10);
            if (e10 != null && e10.isStateful()) {
                iArr[0] = u0.f1735b;
                iArr2[0] = e10.getColorForState(iArr[0], 0);
                iArr[1] = u0.f1738e;
                iArr2[1] = u0.c(context, d.a.f28676v);
                iArr[2] = u0.f1739f;
                iArr2[2] = e10.getDefaultColor();
            } else {
                iArr[0] = u0.f1735b;
                iArr2[0] = u0.b(context, i10);
                iArr[1] = u0.f1738e;
                iArr2[1] = u0.c(context, d.a.f28676v);
                iArr[2] = u0.f1739f;
                iArr2[2] = u0.c(context, i10);
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(o0 o0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable j10 = o0Var.j(context, d.e.F);
            Drawable j11 = o0Var.j(context, d.e.G);
            if ((j10 instanceof BitmapDrawable) && j10.getIntrinsicWidth() == dimensionPixelSize && j10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j10;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j10.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j11 instanceof BitmapDrawable) && j11.getIntrinsicWidth() == dimensionPixelSize && j11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (g0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = k.f1560b;
            }
            drawable.setColorFilter(k.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.o0.f
        public Drawable a(o0 o0Var, Context context, int i10) {
            if (i10 == d.e.f28714j) {
                return new LayerDrawable(new Drawable[]{o0Var.j(context, d.e.f28713i), o0Var.j(context, d.e.f28715k)});
            }
            if (i10 == d.e.f28729y) {
                return l(o0Var, context, d.d.f28698i);
            }
            if (i10 == d.e.f28728x) {
                return l(o0Var, context, d.d.f28699j);
            }
            if (i10 == d.e.f28730z) {
                return l(o0Var, context, d.d.f28700k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.o0.f
        public ColorStateList b(Context context, int i10) {
            if (i10 == d.e.f28717m) {
                return e.a.a(context, d.c.f28686e);
            }
            if (i10 == d.e.I) {
                return e.a.a(context, d.c.f28689h);
            }
            if (i10 == d.e.H) {
                return k(context);
            }
            if (i10 == d.e.f28710f) {
                return j(context);
            }
            if (i10 == d.e.f28706b) {
                return g(context);
            }
            if (i10 == d.e.f28709e) {
                return i(context);
            }
            if (i10 != d.e.D && i10 != d.e.E) {
                if (f(this.f1564b, i10)) {
                    return u0.e(context, d.a.f28678x);
                }
                if (f(this.f1567e, i10)) {
                    return e.a.a(context, d.c.f28685d);
                }
                if (f(this.f1568f, i10)) {
                    return e.a.a(context, d.c.f28684c);
                }
                if (i10 == d.e.A) {
                    return e.a.a(context, d.c.f28687f);
                }
                return null;
            }
            return e.a.a(context, d.c.f28688g);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.o0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.k.a()
                int[] r1 = r6.f1563a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = d.a.f28678x
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f1565c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = d.a.f28676v
                goto L14
            L22:
                int[] r1 = r6.f1566d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = d.e.f28725u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = d.e.f28716l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.g0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.u0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.k.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.o0.f
        public PorterDuff.Mode d(int i10) {
            if (i10 == d.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.o0.f
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == d.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = d.a.f28678x;
                m(findDrawableByLayerId, u0.c(context, i11), k.f1560b);
                m(layerDrawable.findDrawableByLayerId(16908303), u0.c(context, i11), k.f1560b);
                m(layerDrawable.findDrawableByLayerId(16908301), u0.c(context, d.a.f28676v), k.f1560b);
                return true;
            } else if (i10 == d.e.f28729y || i10 == d.e.f28728x || i10 == d.e.f28730z) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), u0.b(context, d.a.f28678x), k.f1560b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = d.a.f28676v;
                m(findDrawableByLayerId2, u0.c(context, i12), k.f1560b);
                m(layerDrawable2.findDrawableByLayerId(16908301), u0.c(context, i12), k.f1560b);
                return true;
            } else {
                return false;
            }
        }
    }

    public static synchronized k b() {
        k kVar;
        synchronized (k.class) {
            if (f1561c == null) {
                h();
            }
            kVar = f1561c;
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (k.class) {
            l10 = o0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void h() {
        synchronized (k.class) {
            if (f1561c == null) {
                k kVar = new k();
                f1561c = kVar;
                kVar.f1562a = o0.h();
                f1561c.f1562a.u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Drawable drawable, x0 x0Var, int[] iArr) {
        o0.w(drawable, x0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1562a.j(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1562a.k(context, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1562a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1562a.s(context);
    }
}
