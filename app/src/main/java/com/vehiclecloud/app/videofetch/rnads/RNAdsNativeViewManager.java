package com.vehiclecloud.app.videofetch.rnads;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.n0;
import com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader;
import h6.e;
import java.util.Map;

/* loaded from: classes3.dex */
public class RNAdsNativeViewManager extends SimpleViewManager<RNAdsNativeView> {
    private static final String TAG = "RNAdsNativeView";
    private final RNAdsNativeAdLoader mNativeAdLoader;

    public RNAdsNativeViewManager(RNAdsNativeAdLoader rNAdsNativeAdLoader) {
        this.mNativeAdLoader = rNAdsNativeAdLoader;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        e.b a10 = e.a();
        a10.b("onLoad", e.d("phasedRegistrationNames", e.d("bubbled", "onLoad")));
        a10.b("onError", e.d("phasedRegistrationNames", e.d("bubbled", "onError")));
        a10.b("onPress", e.d("phasedRegistrationNames", e.d("bubbled", "onPress")));
        a10.b("onImpression", e.d("phasedRegistrationNames", e.d("bubbled", "onImpression")));
        return a10.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @w6.a(name = "active")
    public void setActive(RNAdsNativeView rNAdsNativeView, boolean z10) {
        rNAdsNativeView.setActive(z10);
    }

    @w6.a(name = "height")
    public void setHeight(RNAdsNativeView rNAdsNativeView, int i10) {
        rNAdsNativeView.setHeight(i10);
    }

    @w6.a(name = "screen")
    public void setScreen(RNAdsNativeView rNAdsNativeView, String str) {
        rNAdsNativeView.setScreen(str);
    }

    @w6.a(name = "unitId")
    public void setUnitId(RNAdsNativeView rNAdsNativeView, String str) {
        rNAdsNativeView.setUnitId(str);
    }

    @w6.a(name = "width")
    public void setWidth(RNAdsNativeView rNAdsNativeView, int i10) {
        rNAdsNativeView.setWidth(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public RNAdsNativeView createViewInstance(n0 n0Var) {
        return new RNAdsNativeView(n0Var.b(), this.mNativeAdLoader);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(RNAdsNativeView rNAdsNativeView) {
        super.onDropViewInstance((RNAdsNativeViewManager) rNAdsNativeView);
        RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager = rNAdsNativeView.mAdsNativeManager;
        if (rNAdsNativeManager != null) {
            this.mNativeAdLoader.unbindAndRestoreLoader(rNAdsNativeManager);
        }
    }
}
