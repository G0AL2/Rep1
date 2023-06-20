package com.facebook.react.views.view;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.g;

/* loaded from: classes.dex */
public abstract class ReactClippingViewManager<T extends g> extends ViewGroupManager<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void addView(ViewGroup viewGroup, View view, int i10) {
        addView((ReactClippingViewManager<T>) ((g) viewGroup), view, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ View getChildAt(ViewGroup viewGroup, int i10) {
        return getChildAt((ReactClippingViewManager<T>) ((g) viewGroup), i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ int getChildCount(ViewGroup viewGroup) {
        return getChildCount((ReactClippingViewManager<T>) ((g) viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void removeAllViews(ViewGroup viewGroup) {
        removeAllViews((ReactClippingViewManager<T>) ((g) viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void removeViewAt(ViewGroup viewGroup, int i10) {
        removeViewAt((ReactClippingViewManager<T>) ((g) viewGroup), i10);
    }

    @w6.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t10, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        t10.setRemoveClippedSubviews(z10);
    }

    public void addView(T t10, View view, int i10) {
        UiThreadUtil.assertOnUiThread();
        if (t10.getRemoveClippedSubviews()) {
            t10.j(view, i10);
        } else {
            t10.addView(view, i10);
        }
    }

    public View getChildAt(T t10, int i10) {
        if (t10.getRemoveClippedSubviews()) {
            return t10.n(i10);
        }
        return t10.getChildAt(i10);
    }

    public int getChildCount(T t10) {
        if (t10.getRemoveClippedSubviews()) {
            return t10.getAllChildrenCount();
        }
        return t10.getChildCount();
    }

    public void removeAllViews(T t10) {
        UiThreadUtil.assertOnUiThread();
        if (t10.getRemoveClippedSubviews()) {
            t10.p();
        } else {
            t10.removeAllViews();
        }
    }

    public void removeViewAt(T t10, int i10) {
        UiThreadUtil.assertOnUiThread();
        if (t10.getRemoveClippedSubviews()) {
            View childAt = getChildAt((ReactClippingViewManager<T>) t10, i10);
            if (childAt.getParent() != null) {
                t10.removeView(childAt);
            }
            t10.r(childAt);
            return;
        }
        t10.removeViewAt(i10);
    }
}
