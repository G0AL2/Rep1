package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: ViewGroupDrawingOrderHelper.java */
/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f16080a;

    /* renamed from: b  reason: collision with root package name */
    private int f16081b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int[] f16082c;

    /* compiled from: ViewGroupDrawingOrderHelper.java */
    /* loaded from: classes.dex */
    class a implements Comparator<View> {
        a(z0 z0Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            if (viewZIndex == null) {
                viewZIndex = r0;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            return viewZIndex.intValue() - (viewZIndex2 != null ? viewZIndex2 : 0).intValue();
        }
    }

    public z0(ViewGroup viewGroup) {
        this.f16080a = viewGroup;
    }

    public int a(int i10, int i11) {
        if (this.f16082c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(this.f16080a.getChildAt(i12));
            }
            Collections.sort(arrayList, new a(this));
            this.f16082c = new int[i10];
            for (int i13 = 0; i13 < i10; i13++) {
                this.f16082c[i13] = this.f16080a.indexOfChild((View) arrayList.get(i13));
            }
        }
        return this.f16082c[i11];
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f16081b++;
        }
        this.f16082c = null;
    }

    public void c(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f16081b--;
        }
        this.f16082c = null;
    }

    public boolean d() {
        return this.f16081b > 0;
    }

    public void e() {
        this.f16081b = 0;
        for (int i10 = 0; i10 < this.f16080a.getChildCount(); i10++) {
            if (ViewGroupManager.getViewZIndex(this.f16080a.getChildAt(i10)) != null) {
                this.f16081b++;
            }
        }
        this.f16082c = null;
    }
}
