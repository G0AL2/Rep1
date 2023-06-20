package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private int f2717a;

    /* renamed from: b  reason: collision with root package name */
    private int f2718b;

    public r(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2717a | this.f2718b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f2718b = i10;
        } else {
            this.f2717a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f2718b = 0;
        } else {
            this.f2717a = 0;
        }
    }
}
