package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class DTBAdMRAIDExpandedController extends DTBAdMRAIDController {
    static final String LOG_TAG = "DTBAdMRAIDExpandedController";
    private DTBAdMRAIDBannerController masterController;

    public DTBAdMRAIDExpandedController(DTBAdView dTBAdView) {
        super(dTBAdView);
    }

    public static /* synthetic */ boolean e(DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController, View view, MotionEvent motionEvent) {
        return dTBAdMRAIDExpandedController.lambda$addCloseIndicator$0(view, motionEvent);
    }

    public /* synthetic */ boolean lambda$addCloseIndicator$0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            closeExpandedPartTwo();
            return true;
        }
        return false;
    }

    public void addCloseIndicator() {
        addCloseIndicator(new View.OnTouchListener() { // from class: com.amazon.device.ads.v
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DTBAdMRAIDExpandedController.e(DTBAdMRAIDExpandedController.this, view, motionEvent);
            }
        });
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void closeExpandedPartTwo() {
        DTBAdMRAIDBannerController findControllerByIndex;
        DTBAdActivity dTBAdActivity = (DTBAdActivity) DTBAdUtil.getActivity(getAdView());
        Intent intent = dTBAdActivity.getIntent();
        if (intent != null && (findControllerByIndex = DTBAdMRAIDBannerController.findControllerByIndex(intent.getIntExtra("cntrl_index", -1))) != null) {
            findControllerByIndex.closeExpandedPartTwo();
        }
        dTBAdActivity.straightFinish();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void expand(Map<String, Object> map) {
        fireErrorEvent("expand", "Expanded View does not allow expand");
        commandCompleted("expand");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected MraidStateType getInitialStateType() {
        return MraidStateType.EXPANDED;
    }

    protected void layoutCloseIndicator() {
        ViewGroup rootView = DTBAdUtil.getRootView(getAdView());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(50), DTBAdUtil.sizeToDevicePixels(50));
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 0;
        rootView.addView(this.closeIndicatorRegion, layoutParams);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLeftApplication() {
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onMRAIDClose() {
        closeExpandedPartTwo();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onPageLoad() {
        try {
            prepareMraid();
        } catch (JSONException e10) {
            DtbLog.error("Error:" + e10.getMessage());
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onResize(Map<String, Object> map) {
        fireErrorEvent("resize", "Expanded View does not allow resize");
        commandCompleted("resize");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    void passLoadError() {
        DTBAdMRAIDBannerController dTBAdMRAIDBannerController = this.masterController;
        if (dTBAdMRAIDBannerController != null) {
            dTBAdMRAIDBannerController.passLoadError();
        }
    }

    public void setMasterController(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        this.masterController = dTBAdMRAIDBannerController;
    }

    @SuppressLint({"ResourceType"})
    void addCloseIndicator(View.OnTouchListener onTouchListener) {
        createContentIndicator();
        layoutCloseIndicator();
        setCloseIndicatorContent(onTouchListener);
    }
}
