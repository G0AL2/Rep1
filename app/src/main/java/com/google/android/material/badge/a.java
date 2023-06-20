package com.google.android.material.badge;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: BadgeUtils.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f22052a;

    static {
        f22052a = Build.VERSION.SDK_INT < 18;
    }

    public static void a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        c(badgeDrawable, view, frameLayout);
        if (f22052a) {
            frameLayout.setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void b(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        if (badgeDrawable == null) {
            return;
        }
        if (f22052a) {
            frameLayout.setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void c(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f22052a ? frameLayout : view).getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.t(view, frameLayout);
    }

    public static void d(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
