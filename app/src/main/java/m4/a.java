package m4;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import u4.i;

/* compiled from: DefaultDrawableFactory.java */
/* loaded from: classes.dex */
public class a implements v5.a {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f34210a;

    /* renamed from: b  reason: collision with root package name */
    private final v5.a f34211b;

    public a(Resources resources, v5.a aVar) {
        this.f34210a = resources;
        this.f34211b = aVar;
    }

    private static boolean c(w5.d dVar) {
        return (dVar.A() == 1 || dVar.A() == 0) ? false : true;
    }

    private static boolean d(w5.d dVar) {
        return (dVar.C() == 0 || dVar.C() == -1) ? false : true;
    }

    @Override // v5.a
    public Drawable a(w5.c cVar) {
        try {
            if (c6.b.d()) {
                c6.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (cVar instanceof w5.d) {
                w5.d dVar = (w5.d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f34210a, dVar.l());
                if (d(dVar) || c(dVar)) {
                    i iVar = new i(bitmapDrawable, dVar.C(), dVar.A());
                    if (c6.b.d()) {
                        c6.b.b();
                    }
                    return iVar;
                }
                return bitmapDrawable;
            }
            v5.a aVar = this.f34211b;
            if (aVar != null && aVar.b(cVar)) {
                Drawable a10 = this.f34211b.a(cVar);
                if (c6.b.d()) {
                    c6.b.b();
                }
                return a10;
            }
            if (c6.b.d()) {
                c6.b.b();
            }
            return null;
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    @Override // v5.a
    public boolean b(w5.c cVar) {
        return true;
    }
}
