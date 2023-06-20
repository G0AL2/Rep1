package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.z0;
import ha.l;

/* compiled from: ThemeEnforcement.java */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f22505a = {ha.b.f31139j};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f22506b = {ha.b.f31140k};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f22507c = {16842752, ha.b.C};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f22508d = {ha.b.f31148s};

    public static void a(Context context) {
        e(context, f22505a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.R3, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(l.T3, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(ha.b.f31145p, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f22506b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.R3, i10, i11);
        if (!obtainStyledAttributes.getBoolean(l.U3, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z10 = g(context, attributeSet, iArr, i10, i11, iArr2);
        } else {
            z10 = obtainStyledAttributes.getResourceId(l.S3, -1) != -1;
        }
        obtainStyledAttributes.recycle();
        if (!z10) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static Context f(Context context, AttributeSet attributeSet, int i10, int i11) {
        int j10 = j(context, attributeSet, i10, i11);
        if (j10 != 0) {
            if ((context instanceof i.d) && ((i.d) context).c() == j10) {
                return context;
            }
            i.d dVar = new i.d(context, j10);
            int i12 = i(dVar, attributeSet);
            return i12 != 0 ? new i.d(dVar, i12) : dVar;
        }
        return context;
    }

    private static boolean g(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int i12 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i12, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static boolean h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!obtainStyledAttributes.hasValue(i10)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static int i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f22507c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int j(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f22508d, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static TypedArray k(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static z0 l(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return z0.v(context, attributeSet, iArr, i10, i11);
    }
}
