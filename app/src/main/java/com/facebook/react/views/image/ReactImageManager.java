package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import java.util.HashMap;
import java.util.Map;

@o6.a(name = ReactImageManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactImageManager extends SimpleViewManager<h> {
    public static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private final f mCallerContextFactory;
    private r4.b mDraweeControllerBuilder;
    private a mGlobalImageLoadListener;

    @Deprecated
    public ReactImageManager(r4.b bVar, Object obj) {
        this(bVar, (a) null, obj);
    }

    @Deprecated
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public r4.b getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = m4.c.g();
        }
        return this.mDraweeControllerBuilder;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(h6.e.h(b.g(4), h6.e.d("registrationName", "onLoadStart"), b.g(5), h6.e.d("registrationName", "onProgress"), b.g(2), h6.e.d("registrationName", "onLoad"), b.g(1), h6.e.d("registrationName", "onError"), b.g(3), h6.e.d("registrationName", "onLoadEnd")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @w6.a(name = "accessible")
    public void setAccessible(h hVar, boolean z10) {
        hVar.setFocusable(z10);
    }

    @w6.a(name = "blurRadius")
    public void setBlurRadius(h hVar, float f10) {
        hVar.setBlurRadius(f10);
    }

    @w6.a(customType = "Color", name = "borderColor")
    public void setBorderColor(h hVar, Integer num) {
        if (num == null) {
            hVar.setBorderColor(0);
        } else {
            hVar.setBorderColor(num.intValue());
        }
    }

    @w6.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(h hVar, int i10, float f10) {
        if (!com.facebook.yoga.g.a(f10)) {
            f10 = r.c(f10);
        }
        if (i10 == 0) {
            hVar.setBorderRadius(f10);
        } else {
            hVar.t(f10, i10 - 1);
        }
    }

    @w6.a(name = "borderWidth")
    public void setBorderWidth(h hVar, float f10) {
        hVar.setBorderWidth(f10);
    }

    @w6.a(name = "defaultSrc")
    public void setDefaultSource(h hVar, String str) {
        hVar.setDefaultSource(str);
    }

    @w6.a(name = "fadeDuration")
    public void setFadeDuration(h hVar, int i10) {
        hVar.setFadeDuration(i10);
    }

    @w6.a(name = "headers")
    public void setHeaders(h hVar, ReadableMap readableMap) {
        hVar.setHeaders(readableMap);
    }

    @w6.a(name = "internal_analyticTag")
    public void setInternal_AnalyticsTag(h hVar, String str) {
        f fVar = this.mCallerContextFactory;
        if (fVar != null) {
            hVar.x(fVar.a(((n0) hVar.getContext()).a(), str));
        }
    }

    @w6.a(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(h hVar, boolean z10) {
        hVar.setShouldNotifyLoadEvents(z10);
    }

    @w6.a(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(h hVar, String str) {
        hVar.setLoadingIndicatorSource(str);
    }

    @w6.a(customType = "Color", name = "overlayColor")
    public void setOverlayColor(h hVar, Integer num) {
        if (num == null) {
            hVar.setOverlayColor(0);
        } else {
            hVar.setOverlayColor(num.intValue());
        }
    }

    @w6.a(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(h hVar, boolean z10) {
        hVar.setProgressiveRenderingEnabled(z10);
    }

    @w6.a(name = "resizeMethod")
    public void setResizeMethod(h hVar, String str) {
        if (str != null && !"auto".equals(str)) {
            if ("resize".equals(str)) {
                hVar.setResizeMethod(c.RESIZE);
                return;
            } else if ("scale".equals(str)) {
                hVar.setResizeMethod(c.SCALE);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid resize method: '" + str + "'");
            }
        }
        hVar.setResizeMethod(c.AUTO);
    }

    @w6.a(name = "resizeMode")
    public void setResizeMode(h hVar, String str) {
        hVar.setScaleType(d.c(str));
        hVar.setTileMode(d.d(str));
    }

    @w6.a(name = "src")
    public void setSource(h hVar, ReadableArray readableArray) {
        hVar.setSource(readableArray);
    }

    @w6.a(customType = "Color", name = "tintColor")
    public void setTintColor(h hVar, Integer num) {
        if (num == null) {
            hVar.clearColorFilter();
        } else {
            hVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Deprecated
    public ReactImageManager(r4.b bVar, a aVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContext = obj;
        this.mCallerContextFactory = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(n0 n0Var) {
        Object callerContext;
        f fVar = this.mCallerContextFactory;
        if (fVar != null) {
            callerContext = fVar.a(n0Var.a(), null);
        } else {
            callerContext = getCallerContext();
        }
        return new h(n0Var, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, callerContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h hVar) {
        super.onAfterUpdateTransaction((ReactImageManager) hVar);
        hVar.s();
    }

    public ReactImageManager(r4.b bVar, f fVar) {
        this(bVar, (a) null, fVar);
    }

    public ReactImageManager(r4.b bVar, a aVar, f fVar) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContextFactory = fVar;
        this.mCallerContext = null;
    }

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
        this.mCallerContextFactory = null;
    }
}
