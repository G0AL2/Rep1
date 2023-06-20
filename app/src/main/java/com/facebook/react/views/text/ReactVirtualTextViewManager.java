package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.n0;

@o6.a(name = ReactVirtualTextViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactVirtualTextViewManager extends BaseViewManager<View, r> {
    public static final String REACT_CLASS = "RCTVirtualText";

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(n0 n0Var) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<r> getShadowNodeClass() {
        return r.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public r createShadowNodeInstance() {
        return new r();
    }
}
