package com.facebook.react.uimanager;

import android.view.View;

/* loaded from: classes.dex */
public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, j> {
    @Override // com.facebook.react.uimanager.ViewManager
    public Class<j> getShadowNodeClass() {
        return j.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t10, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createShadowNodeInstance() {
        return new j();
    }
}
