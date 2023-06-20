package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.z;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    private int f22731a;

    /* loaded from: classes3.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f22732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f22733b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ra.a f22734c;

        a(View view, int i10, ra.a aVar) {
            this.f22732a = view;
            this.f22733b = i10;
            this.f22734c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f22732a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f22731a == this.f22733b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                ra.a aVar = this.f22734c;
                expandableBehavior.H((View) aVar, this.f22732a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f22731a = 0;
    }

    private boolean F(boolean z10) {
        if (!z10) {
            return this.f22731a == 1;
        }
        int i10 = this.f22731a;
        return i10 == 0 || i10 == 2;
    }

    protected ra.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r10 = coordinatorLayout.r(view);
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = r10.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (ra.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ra.a aVar = (ra.a) view2;
        if (F(aVar.a())) {
            this.f22731a = aVar.a() ? 1 : 2;
            return H((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        ra.a G;
        if (z.U(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i11 = G.a() ? 1 : 2;
        this.f22731a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22731a = 0;
    }
}
