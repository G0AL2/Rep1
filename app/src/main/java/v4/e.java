package v4;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import u4.g;
import u4.j;
import u4.k;
import u4.l;
import u4.m;
import u4.o;
import u4.p;
import u4.q;
import v4.d;

/* compiled from: WrappingUtils.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Drawable f37811a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            k kVar = new k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            b(kVar, dVar);
            return kVar;
        } else if (drawable instanceof NinePatchDrawable) {
            o oVar = new o((NinePatchDrawable) drawable);
            b(oVar, dVar);
            return oVar;
        } else if ((drawable instanceof ColorDrawable) && Build.VERSION.SDK_INT >= 11) {
            l a10 = l.a((ColorDrawable) drawable);
            b(a10, dVar);
            return a10;
        } else {
            z3.a.I("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    static void b(j jVar, d dVar) {
        jVar.d(dVar.i());
        jVar.s(dVar.d());
        jVar.b(dVar.b(), dVar.c());
        jVar.i(dVar.g());
        jVar.n(dVar.k());
        jVar.m(dVar.h());
    }

    static u4.c c(u4.c cVar) {
        while (true) {
            Drawable r10 = cVar.r();
            if (r10 == cVar || !(r10 instanceof u4.c)) {
                break;
            }
            cVar = (u4.c) r10;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable d(Drawable drawable, d dVar, Resources resources) {
        try {
            if (c6.b.d()) {
                c6.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && dVar != null && dVar.j() == d.a.BITMAP_ONLY) {
                if (drawable instanceof g) {
                    u4.c c10 = c((g) drawable);
                    c10.h(a(c10.h(f37811a), dVar, resources));
                    return drawable;
                }
                Drawable a10 = a(drawable, dVar, resources);
                if (c6.b.d()) {
                    c6.b.b();
                }
                return a10;
            }
            if (c6.b.d()) {
                c6.b.b();
            }
            return drawable;
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable e(Drawable drawable, d dVar) {
        try {
            if (c6.b.d()) {
                c6.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && dVar != null && dVar.j() == d.a.OVERLAY_COLOR) {
                m mVar = new m(drawable);
                b(mVar, dVar);
                mVar.x(dVar.f());
                return mVar;
            }
            if (c6.b.d()) {
                c6.b.b();
            }
            return drawable;
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable f(Drawable drawable, q.b bVar) {
        return g(drawable, bVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable g(Drawable drawable, q.b bVar, PointF pointF) {
        if (c6.b.d()) {
            c6.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable != null && bVar != null) {
            p pVar = new p(drawable, bVar);
            if (pointF != null) {
                pVar.A(pointF);
            }
            if (c6.b.d()) {
                c6.b.b();
            }
            return pVar;
        }
        if (c6.b.d()) {
            c6.b.b();
        }
        return drawable;
    }

    static void h(j jVar) {
        jVar.d(false);
        jVar.j(0.0f);
        jVar.b(0, 0.0f);
        jVar.i(0.0f);
        jVar.n(false);
        jVar.m(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(u4.c cVar, d dVar, Resources resources) {
        u4.c c10 = c(cVar);
        Drawable r10 = c10.r();
        if (dVar != null && dVar.j() == d.a.BITMAP_ONLY) {
            if (r10 instanceof j) {
                b((j) r10, dVar);
            } else if (r10 != null) {
                c10.h(f37811a);
                c10.h(a(r10, dVar, resources));
            }
        } else if (r10 instanceof j) {
            h((j) r10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(u4.c cVar, d dVar) {
        Drawable r10 = cVar.r();
        if (dVar != null && dVar.j() == d.a.OVERLAY_COLOR) {
            if (r10 instanceof m) {
                m mVar = (m) r10;
                b(mVar, dVar);
                mVar.x(dVar.f());
                return;
            }
            cVar.h(e(cVar.h(f37811a), dVar));
        } else if (r10 instanceof m) {
            Drawable drawable = f37811a;
            cVar.h(((m) r10).u(drawable));
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p k(u4.c cVar, q.b bVar) {
        Drawable f10 = f(cVar.h(f37811a), bVar);
        cVar.h(f10);
        y3.k.h(f10, "Parent has no child drawable!");
        return (p) f10;
    }
}
