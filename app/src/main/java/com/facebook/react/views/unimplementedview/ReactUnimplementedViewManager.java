package com.facebook.react.views.unimplementedview;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;

@o6.a(name = ReactUnimplementedViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactUnimplementedViewManager extends ViewGroupManager<a> {
    public static final String REACT_CLASS = "UnimplementedNativeView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @w6.a(name = "name")
    public void setName(a aVar, String str) {
        aVar.setName(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(n0 n0Var) {
        return new a(n0Var);
    }
}
