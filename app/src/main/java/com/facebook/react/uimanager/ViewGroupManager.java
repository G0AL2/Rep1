package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, j> implements g {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i10) {
        mZIndexHash.put(view, Integer.valueOf(i10));
    }

    public void addView(T t10, View view, int i10) {
        t10.addView(view, i10);
    }

    public void addViews(T t10, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            addView(t10, list.get(i10), i10);
        }
    }

    public View getChildAt(T t10, int i10) {
        return t10.getChildAt(i10);
    }

    public int getChildCount(T t10) {
        return t10.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends j> getShadowNodeClass() {
        return j.class;
    }

    @Override // com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void removeAllViews(T t10) {
        UiThreadUtil.assertOnUiThread();
        for (int childCount = getChildCount(t10) - 1; childCount >= 0; childCount--) {
            removeViewAt(t10, childCount);
        }
    }

    public void removeView(T t10, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i10 = 0; i10 < getChildCount(t10); i10++) {
            if (getChildAt(t10, i10) == view) {
                removeViewAt(t10, i10);
                return;
            }
        }
    }

    public void removeViewAt(T t10, int i10) {
        UiThreadUtil.assertOnUiThread();
        t10.removeViewAt(i10);
    }

    public boolean shouldPromoteGrandchildren() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        updateExtraData((ViewGroupManager<T>) ((ViewGroup) view), obj);
    }

    public void updateExtraData(T t10, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createShadowNodeInstance() {
        return new j();
    }
}
