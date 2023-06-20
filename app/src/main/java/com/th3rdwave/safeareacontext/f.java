package com.th3rdwave.safeareacontext;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* compiled from: SafeAreaUtils.java */
/* loaded from: classes3.dex */
class f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(ViewGroup viewGroup, View view) {
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            return new c(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static a b(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            return new a(rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom()), rootWindowInsets.getSystemWindowInsetLeft());
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return new a(rect.top, view.getWidth() - rect.right, view.getHeight() - rect.bottom, rect.left);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(View view) {
        View rootView;
        a b10;
        if (view.getHeight() == 0 || (b10 = b((rootView = view.getRootView()))) == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        b10.f28446a = Math.max(b10.f28446a - rect.top, 0.0f);
        b10.f28449d = Math.max(b10.f28449d - rect.left, 0.0f);
        b10.f28448c = Math.max(((rect.top + view.getHeight()) + b10.f28448c) - rootView.getHeight(), 0.0f);
        b10.f28447b = Math.max(((rect.left + view.getWidth()) + b10.f28447b) - rootView.getWidth(), 0.0f);
        return b10;
    }
}
