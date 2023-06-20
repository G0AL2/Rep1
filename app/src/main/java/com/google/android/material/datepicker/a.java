package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.z;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes2.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f22266a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f22267b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f22268c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f22269d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22270e;

    /* renamed from: f  reason: collision with root package name */
    private final xa.k f22271f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, xa.k kVar, Rect rect) {
        h0.g.c(rect.left);
        h0.g.c(rect.top);
        h0.g.c(rect.right);
        h0.g.c(rect.bottom);
        this.f22266a = rect;
        this.f22267b = colorStateList2;
        this.f22268c = colorStateList;
        this.f22269d = colorStateList3;
        this.f22270e = i10;
        this.f22271f = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Context context, int i10) {
        h0.g.a(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, ha.l.f31329m1);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(ha.l.f31334n1, 0), obtainStyledAttributes.getDimensionPixelOffset(ha.l.f31344p1, 0), obtainStyledAttributes.getDimensionPixelOffset(ha.l.f31339o1, 0), obtainStyledAttributes.getDimensionPixelOffset(ha.l.f31349q1, 0));
        ColorStateList a10 = ua.c.a(context, obtainStyledAttributes, ha.l.f31354r1);
        ColorStateList a11 = ua.c.a(context, obtainStyledAttributes, ha.l.f31379w1);
        ColorStateList a12 = ua.c.a(context, obtainStyledAttributes, ha.l.f31369u1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ha.l.f31374v1, 0);
        xa.k m10 = xa.k.b(context, obtainStyledAttributes.getResourceId(ha.l.f31359s1, 0), obtainStyledAttributes.getResourceId(ha.l.f31364t1, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f22266a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f22266a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(TextView textView) {
        xa.g gVar = new xa.g();
        xa.g gVar2 = new xa.g();
        gVar.setShapeAppearanceModel(this.f22271f);
        gVar2.setShapeAppearanceModel(this.f22271f);
        gVar.U(this.f22268c);
        gVar.a0(this.f22270e, this.f22269d);
        textView.setTextColor(this.f22267b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f22267b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f22266a;
        z.u0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
