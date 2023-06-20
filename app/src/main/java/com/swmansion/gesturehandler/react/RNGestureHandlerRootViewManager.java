package com.swmansion.gesturehandler.react;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import java.util.Map;

@o6.a(name = RNGestureHandlerRootViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class RNGestureHandlerRootViewManager extends ViewGroupManager<h> {
    public static final String REACT_CLASS = "GestureHandlerRootView";

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return h6.e.e("onGestureHandlerEvent", h6.e.d("registrationName", "onGestureHandlerEvent"), "onGestureHandlerStateChange", h6.e.d("registrationName", "onGestureHandlerStateChange"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(n0 n0Var) {
        return new h(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(h hVar) {
        hVar.B();
    }
}
