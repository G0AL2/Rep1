package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes2.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private d f22015a;

    /* renamed from: b  reason: collision with root package name */
    private int f22016b;

    /* renamed from: c  reason: collision with root package name */
    private int f22017c;

    public c() {
        this.f22016b = 0;
        this.f22017c = 0;
    }

    public int E() {
        d dVar = this.f22015a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.I(v10, i10);
    }

    public boolean G(int i10) {
        d dVar = this.f22015a;
        if (dVar != null) {
            return dVar.e(i10);
        }
        this.f22016b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        F(coordinatorLayout, v10, i10);
        if (this.f22015a == null) {
            this.f22015a = new d(v10);
        }
        this.f22015a.c();
        this.f22015a.a();
        int i11 = this.f22016b;
        if (i11 != 0) {
            this.f22015a.e(i11);
            this.f22016b = 0;
        }
        int i12 = this.f22017c;
        if (i12 != 0) {
            this.f22015a.d(i12);
            this.f22017c = 0;
            return true;
        }
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22016b = 0;
        this.f22017c = 0;
    }
}
