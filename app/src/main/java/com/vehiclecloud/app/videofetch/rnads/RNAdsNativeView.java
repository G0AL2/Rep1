package com.vehiclecloud.app.videofetch.rnads;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.bridge.ReactApplicationContext;
import com.vehiclecloud.app.videofetch.rnads.RNAdsNativeAdLoader;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class RNAdsNativeView extends LinearLayout {
    boolean mActive;
    private final RNAdsNativeAdLoader mAdLoader;
    String mAdUnitId;
    RNAdsNativeAdLoader.RNAdsNativeManager mAdsNativeManager;
    int mHeight;
    String mScreen;
    int mWidth;
    private final Runnable measureAndLayout;

    public RNAdsNativeView(ReactApplicationContext reactApplicationContext, RNAdsNativeAdLoader rNAdsNativeAdLoader) {
        super(reactApplicationContext);
        this.measureAndLayout = new Runnable() { // from class: com.vehiclecloud.app.videofetch.rnads.a
            @Override // java.lang.Runnable
            public final void run() {
                RNAdsNativeView.a(RNAdsNativeView.this);
            }
        };
        this.mAdLoader = rNAdsNativeAdLoader;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public static /* synthetic */ void a(RNAdsNativeView rNAdsNativeView) {
        rNAdsNativeView.lambda$new$0();
    }

    public /* synthetic */ void lambda$new$0() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    private void loadAd() {
        if (this.mScreen == null || this.mAdUnitId == null || this.mWidth == 0 || this.mHeight == 0 || this.mAdsNativeManager != null) {
            return;
        }
        this.mAdLoader.getLoaderAndBind(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setActive(true);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setActive(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }

    public void setActive(boolean z10) {
        this.mActive = z10;
        RNAdsNativeAdLoader.RNAdsNativeManager rNAdsNativeManager = this.mAdsNativeManager;
        if (rNAdsNativeManager != null) {
            rNAdsNativeManager.updateActive(z10);
        }
    }

    public void setHeight(int i10) {
        boolean z10 = this.mHeight == 0;
        this.mHeight = i10;
        if (z10) {
            loadAd();
        }
    }

    public void setScreen(String str) {
        this.mScreen = str;
        loadAd();
    }

    public void setUnitId(String str) {
        this.mAdUnitId = str;
        loadAd();
    }

    public void setWidth(int i10) {
        boolean z10 = this.mWidth == 0;
        this.mWidth = i10;
        if (z10) {
            loadAd();
        }
    }
}
