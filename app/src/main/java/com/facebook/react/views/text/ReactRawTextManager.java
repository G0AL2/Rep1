package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.n0;

@o6.a(name = ReactRawTextManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactRawTextManager extends ViewManager<View, i> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends i> getShadowNodeClass() {
        return i.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new i();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(n0 n0Var) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }
}
