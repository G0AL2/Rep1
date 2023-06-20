package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.n0;
import com.facebook.react.views.view.ReactClippingViewManager;
import g7.c;

@o6.a(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<c> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(n0 n0Var) {
        return new c(n0Var);
    }
}
