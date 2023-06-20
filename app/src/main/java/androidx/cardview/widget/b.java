package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardViewApi21Impl.java */
/* loaded from: classes.dex */
public class b implements e {
    private f o(d dVar) {
        return (f) dVar.d();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, float f10) {
        o(dVar).h(f10);
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return o(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, float f10) {
        dVar.g().setElevation(f10);
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return o(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList e(d dVar) {
        return o(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar) {
        n(dVar, d(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        dVar.b(new f(colorStateList, f10));
        View g10 = dVar.g();
        g10.setClipToOutline(true);
        g10.setElevation(f11);
        n(dVar, f12);
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return dVar.g().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
        n(dVar, d(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void k() {
    }

    @Override // androidx.cardview.widget.e
    public float l(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar, ColorStateList colorStateList) {
        o(dVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, float f10) {
        o(dVar).g(f10, dVar.c(), dVar.f());
        p(dVar);
    }

    public void p(d dVar) {
        if (!dVar.c()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float d10 = d(dVar);
        float b10 = b(dVar);
        int ceil = (int) Math.ceil(g.c(d10, b10, dVar.f()));
        int ceil2 = (int) Math.ceil(g.d(d10, b10, dVar.f()));
        dVar.a(ceil, ceil2, ceil, ceil2);
    }
}
