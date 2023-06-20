package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: AspectRatioMeasure.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: AspectRatioMeasure.java */
    /* renamed from: com.facebook.drawee.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0193a {

        /* renamed from: a  reason: collision with root package name */
        public int f14507a;

        /* renamed from: b  reason: collision with root package name */
        public int f14508b;
    }

    private static boolean a(int i10) {
        return i10 == 0 || i10 == -2;
    }

    public static void b(C0193a c0193a, float f10, ViewGroup.LayoutParams layoutParams, int i10, int i11) {
        if (f10 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0193a.f14508b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0193a.f14507a) - i10) / f10) + i11), c0193a.f14508b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0193a.f14507a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0193a.f14508b) - i11) * f10) + i10), c0193a.f14507a), 1073741824);
        }
    }
}
