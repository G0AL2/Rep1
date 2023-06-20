package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* compiled from: ReactClippingViewGroupHelper.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final Rect f15979a = new Rect();

    public static void a(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof u) {
            u uVar = (u) parent;
            if (uVar.getRemoveClippedSubviews()) {
                Rect rect2 = f15979a;
                uVar.g(rect2);
                if (!rect2.intersect(view.getLeft(), view.getTop() + ((int) view.getTranslationY()), view.getRight(), view.getBottom() + ((int) view.getTranslationY()))) {
                    rect.setEmpty();
                    return;
                }
                rect2.offset(-view.getLeft(), -view.getTop());
                rect2.offset(-((int) view.getTranslationX()), -((int) view.getTranslationY()));
                rect2.offset(view.getScrollX(), view.getScrollY());
                rect.set(rect2);
                return;
            }
        }
        view.getDrawingRect(rect);
    }
}
