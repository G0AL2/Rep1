package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalendarStyle.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final a f22272a;

    /* renamed from: b  reason: collision with root package name */
    final a f22273b;

    /* renamed from: c  reason: collision with root package name */
    final a f22274c;

    /* renamed from: d  reason: collision with root package name */
    final a f22275d;

    /* renamed from: e  reason: collision with root package name */
    final a f22276e;

    /* renamed from: f  reason: collision with root package name */
    final a f22277f;

    /* renamed from: g  reason: collision with root package name */
    final a f22278g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f22279h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ua.b.c(context, ha.b.f31147r, e.class.getCanonicalName()), ha.l.f31284d1);
        this.f22272a = a.a(context, obtainStyledAttributes.getResourceId(ha.l.f31299g1, 0));
        this.f22278g = a.a(context, obtainStyledAttributes.getResourceId(ha.l.f31289e1, 0));
        this.f22273b = a.a(context, obtainStyledAttributes.getResourceId(ha.l.f31294f1, 0));
        this.f22274c = a.a(context, obtainStyledAttributes.getResourceId(ha.l.f31304h1, 0));
        ColorStateList a10 = ua.c.a(context, obtainStyledAttributes, ha.l.f31309i1);
        this.f22275d = a.a(context, obtainStyledAttributes.getResourceId(ha.l.f31319k1, 0));
        this.f22276e = a.a(context, obtainStyledAttributes.getResourceId(ha.l.f31314j1, 0));
        this.f22277f = a.a(context, obtainStyledAttributes.getResourceId(ha.l.f31324l1, 0));
        Paint paint = new Paint();
        this.f22279h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
