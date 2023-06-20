package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: a  reason: collision with root package name */
    protected Context f1008a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f1009b;

    /* renamed from: c  reason: collision with root package name */
    protected e f1010c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f1011d;

    /* renamed from: e  reason: collision with root package name */
    private j.a f1012e;

    /* renamed from: f  reason: collision with root package name */
    private int f1013f;

    /* renamed from: g  reason: collision with root package name */
    private int f1014g;

    /* renamed from: h  reason: collision with root package name */
    protected k f1015h;

    public a(Context context, int i10, int i11) {
        this.f1008a = context;
        this.f1011d = LayoutInflater.from(context);
        this.f1013f = i10;
        this.f1014g = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1015h).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f1012e;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1012e = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        j.a aVar = this.f1012e;
        m mVar2 = mVar;
        if (aVar != null) {
            if (mVar == null) {
                mVar2 = this.f1010c;
            }
            return aVar.c(mVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f1015h;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f1010c;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.f1010c.E();
            int size = E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = E.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n10 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n10.setPressed(false);
                        n10.jumpDrawablesToCurrentState();
                    }
                    if (n10 != childAt) {
                        a(n10, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f1009b = context;
        LayoutInflater.from(context);
        this.f1010c = eVar;
    }

    public abstract void j(g gVar, k.a aVar);

    public k.a k(ViewGroup viewGroup) {
        return (k.a) this.f1011d.inflate(this.f1014g, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f1012e;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a k10;
        if (view instanceof k.a) {
            k10 = (k.a) view;
        } else {
            k10 = k(viewGroup);
        }
        j(gVar, k10);
        return (View) k10;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f1015h == null) {
            k kVar = (k) this.f1011d.inflate(this.f1013f, viewGroup, false);
            this.f1015h = kVar;
            kVar.a(this.f1010c);
            f(true);
        }
        return this.f1015h;
    }

    public void p(int i10) {
    }

    public abstract boolean q(int i10, g gVar);
}
