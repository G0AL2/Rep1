package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import ha.g;

/* compiled from: ViewUtilsLollipop.java */
/* loaded from: classes2.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f22025a = {16843848};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, float f10) {
        int integer = view.getResources().getInteger(g.f31219a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{16842766, ha.b.f31153x, -ha.b.f31154y}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray k10 = com.google.android.material.internal.g.k(context, attributeSet, f22025a, i10, i11, new int[0]);
        try {
            if (k10.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, k10.getResourceId(0, 0)));
            }
        } finally {
            k10.recycle();
        }
    }
}
