package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* compiled from: RootViewUtil.java */
/* loaded from: classes.dex */
public class j0 {
    public static i0 a(View view) {
        while (!(view instanceof i0)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            f6.a.a(parent instanceof View);
            view = (View) parent;
        }
        return (i0) view;
    }

    public static Point b(View view) {
        view.getLocationInWindow(r0);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = {iArr[0] - rect.left, iArr[1] - rect.top};
        return new Point(iArr[0], iArr[1]);
    }
}
