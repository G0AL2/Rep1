package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import u4.q;

/* compiled from: ScaleTypeStartInside.java */
/* loaded from: classes.dex */
public class i extends q.a {

    /* renamed from: g  reason: collision with root package name */
    public static final q.b f16121g = new i();

    @Override // u4.q.a
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float min = Math.min(Math.min(f12, f13), 1.0f);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
    }

    public String toString() {
        return "start_inside";
    }
}
