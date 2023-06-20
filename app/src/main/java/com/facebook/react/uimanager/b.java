package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: BaseViewManagerInterface.java */
/* loaded from: classes.dex */
public interface b<T extends View> {
    void setAccessibilityActions(T t10, ReadableArray readableArray);

    void setAccessibilityHint(T t10, String str);

    void setAccessibilityLabel(T t10, String str);

    void setAccessibilityLabelledBy(T t10, Dynamic dynamic);

    void setAccessibilityLiveRegion(T t10, String str);

    void setAccessibilityRole(T t10, String str);

    void setBackgroundColor(T t10, int i10);

    void setBorderBottomLeftRadius(T t10, float f10);

    void setBorderBottomRightRadius(T t10, float f10);

    void setBorderRadius(T t10, float f10);

    void setBorderTopLeftRadius(T t10, float f10);

    void setBorderTopRightRadius(T t10, float f10);

    void setElevation(T t10, float f10);

    void setImportantForAccessibility(T t10, String str);

    void setNativeId(T t10, String str);

    void setOpacity(T t10, float f10);

    void setRenderToHardwareTexture(T t10, boolean z10);

    void setRotation(T t10, float f10);

    void setScaleX(T t10, float f10);

    void setScaleY(T t10, float f10);

    void setShadowColor(T t10, int i10);

    void setTestId(T t10, String str);

    void setTransform(T t10, ReadableArray readableArray);

    void setTranslateX(T t10, float f10);

    void setTranslateY(T t10, float f10);

    void setViewState(T t10, ReadableMap readableMap);

    void setZIndex(T t10, float f10);
}
