package com.amazon.device.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class DTBAdInterstitial {
    private static final String LOG_TAG = "DTBAdInterstitial";
    static Map<String, DTBAdInterstitial> dtbAdInterstitialCache = new HashMap();
    static DTBAdInterstitial theRecent;
    DTBAdView adView;
    private Context context;
    private String dtbAdIntersitialId;

    public DTBAdInterstitial(Context context, DTBAdInterstitialListener dTBAdInterstitialListener) {
        try {
            this.context = context;
            this.adView = new DTBAdView(context, dTBAdInterstitialListener);
            theRecent = this;
            String uuid = UUID.randomUUID().toString();
            this.dtbAdIntersitialId = uuid;
            dtbAdInterstitialCache.put(uuid, this);
            this.adView.setInterstitialId(this.dtbAdIntersitialId);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdInterstitial class");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to initialize DTBAdInterstitial class", e10);
        }
    }

    private DTBAdMRAIDInterstitialController getInterstitialController() {
        return (DTBAdMRAIDInterstitialController) this.adView.getController();
    }

    private DTBAdInterstitialListener getInterstitialListener() {
        return getInterstitialController().getInterstitialListener();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBAdInterstitial getRecent() {
        return theRecent;
    }

    public static int getWidth(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getWidth method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getWidth method", e10);
            return 0;
        }
    }

    public void fetchAd(Map<String, Object> map) {
        this.adView.fetchAd(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DTBAdView getAdView() {
        return this.adView;
    }

    void onAdClosed() {
        DTBAdInterstitialListener interstitialListener = getInterstitialListener();
        if (interstitialListener != null) {
            interstitialListener.onAdClosed(this.adView);
        }
    }

    void setListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        getInterstitialController().setInterstitialListener(dTBAdInterstitialListener);
    }

    public void show() {
        try {
            Intent intent = new Intent(this.context, DTBInterstitialActivity.class);
            if (AdRegistration.getCustomDictionary() != null && AdRegistration.getCustomDictionary().containsKey("mediationName") && AdRegistration.getCustomDictionary().get("mediationName").equals(DTBAdNetwork.MAX.toString())) {
                intent.putExtra("DTBAdInterstitialID", this.dtbAdIntersitialId);
            }
            this.context.startActivity(intent);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute show method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute show method", e10);
        }
    }

    public void fetchAd(Bundle bundle) {
        try {
            this.adView.fetchAd(bundle.getString(DTBAdView.BID_HTML, ""), bundle);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with bundle argument");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute fetchAd method with extraData argument", e10);
        }
    }

    public void fetchAd(String str) {
        try {
            this.adView.fetchAd(str);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with bundle argument");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute fetchAd method with adHtml argument", e10);
        }
    }

    public void fetchAd(String str, Bundle bundle) {
        try {
            this.adView.fetchAd(str, bundle);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with adHtml and bundle argument");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute fetchAd method with adHtml and  bundle argument", e10);
        }
    }
}
