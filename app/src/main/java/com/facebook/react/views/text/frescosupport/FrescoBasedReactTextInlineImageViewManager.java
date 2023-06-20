package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.n0;
import m4.c;
import o6.a;
import r4.b;

@a(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, h7.a> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final b mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(n0 n0Var) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<h7.a> getShadowNodeClass() {
        return h7.a.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    public FrescoBasedReactTextInlineImageViewManager(b bVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h7.a createShadowNodeInstance() {
        b bVar = this.mDraweeControllerBuilder;
        if (bVar == null) {
            bVar = c.g();
        }
        return new h7.a(bVar, this.mCallerContext);
    }
}
