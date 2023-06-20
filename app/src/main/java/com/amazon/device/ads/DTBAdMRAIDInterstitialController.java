package com.amazon.device.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class DTBAdMRAIDInterstitialController extends DTBAdMRAIDController implements DTBAdViewDisplayListener {
    DTBAdInterstitialListener interstitialListener;
    boolean pageDisplayed;
    boolean pageLoaded;

    public DTBAdMRAIDInterstitialController(DTBAdView dTBAdView, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(dTBAdView);
        this.pageLoaded = false;
        this.pageDisplayed = false;
        this.interstitialListener = dTBAdInterstitialListener;
    }

    /* renamed from: cleanOnCloseHandler */
    public void lambda$executeClose$0(Activity activity) {
        DTBAdView dTBAdView = this.adView;
        if (dTBAdView != null) {
            dTBAdView.setWebViewClient(null);
            DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
            if (dTBAdInterstitialListener != null) {
                dTBAdInterstitialListener.onAdClosed(this.adView);
                if (!DtbCommonUtils.isNullOrEmpty(this.adView.getDtbAdInterstitialId())) {
                    DTBAdInterstitial.dtbAdInterstitialCache.remove(this.adView.getDtbAdInterstitialId());
                }
            }
            getAdView().cleanup();
        }
        activity.finish();
    }

    public static /* synthetic */ void e(DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController) {
        dTBAdMRAIDInterstitialController.lambda$onAdLeftApplication$2();
    }

    private void executeClose(String str) {
        commandCompleted(str);
        setState(MraidStateType.HIDDEN);
        fireViewableChange(false);
        final DTBInterstitialActivity recentInterstitialActivity = DTBInterstitialActivity.getRecentInterstitialActivity();
        if (recentInterstitialActivity != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.y
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDInterstitialController.f(DTBAdMRAIDInterstitialController.this, recentInterstitialActivity);
                }
            });
        }
    }

    public static /* synthetic */ void f(DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController, Activity activity) {
        dTBAdMRAIDInterstitialController.lambda$executeClose$0(activity);
    }

    public static /* synthetic */ void g(DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController) {
        dTBAdMRAIDInterstitialController.lambda$onAdClicked$1();
    }

    public /* synthetic */ void lambda$onAdClicked$1() {
        this.interstitialListener.onAdClicked(this.adView);
    }

    public /* synthetic */ void lambda$onAdLeftApplication$2() {
        this.interstitialListener.onAdLeftApplication(this.adView);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void expand(Map<String, Object> map) {
        fireErrorEvent("expand", "invalid placement type for interstitial ");
        commandCompleted("expand");
    }

    public DTBAdInterstitialListener getInterstitialListener() {
        return this.interstitialListener;
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected String getPlacementType() {
        return "interstitial";
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void impressionFired() {
        this.interstitialListener.onImpressionFired(this.adView);
        super.impressionFired();
    }

    void initializeOnLoadAndDisplay() throws JSONException {
        if (this.pageLoaded && this.pageDisplayed) {
            prepareMraid();
        } else {
            createLoadReport();
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
        ActivityMonitor.getInstance().setActivityListener(null);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
        ActivityMonitor.getInstance().setActivityListener(null);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdClicked() {
        if (this.interstitialListener != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.x
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDInterstitialController.g(DTBAdMRAIDInterstitialController.this);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLeftApplication() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.w
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDInterstitialController.e(DTBAdMRAIDInterstitialController.this);
            }
        });
        ActivityMonitor.getInstance().setActivityListener(this);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdOpened(DTBAdView dTBAdView) {
        DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
        if (dTBAdInterstitialListener != null) {
            dTBAdInterstitialListener.onAdOpen(this.adView);
        }
    }

    @Override // com.amazon.device.ads.DTBAdViewDisplayListener
    public void onInitialDisplay() {
        this.pageDisplayed = true;
        try {
            initializeOnLoadAndDisplay();
        } catch (JSONException e10) {
            DtbLog.error("JSON exception:" + e10.getMessage());
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onMRAIDClose() {
        executeClose("close");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onMRAIDUnload() {
        executeClose("unload");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onPageLoad() {
        this.pageLoaded = true;
        try {
            initializeOnLoadAndDisplay();
            DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
            if (dTBAdInterstitialListener != null) {
                dTBAdInterstitialListener.onAdLoaded(this.adView);
            }
        } catch (JSONException e10) {
            DtbLog.error("Error:" + e10.getMessage());
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onResize(Map<String, Object> map) {
        fireErrorEvent("resize", "invalid placement type");
        commandCompleted("resize");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    void passLoadError() {
        this.interstitialListener.onAdFailed(this.adView);
        if (DtbCommonUtils.isNullOrEmpty(this.adView.getDtbAdInterstitialId())) {
            return;
        }
        DTBAdInterstitial.dtbAdInterstitialCache.remove(this.adView.getDtbAdInterstitialId());
    }

    public void setInterstitialListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        this.interstitialListener = dTBAdInterstitialListener;
    }
}
