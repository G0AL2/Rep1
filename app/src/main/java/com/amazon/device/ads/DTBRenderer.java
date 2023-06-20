package com.amazon.device.ads;

import android.app.Activity;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public class DTBRenderer {
    private static final String LOG_TAG = "DTBRenderer";
    Activity activity;
    String adUnitId;
    protected DTBAdResponse dtbAdResponse;
    protected boolean showOnLoad = false;

    DTBRenderer(String str, Activity activity, DTBAdResponse dTBAdResponse) {
        this.adUnitId = str;
        this.dtbAdResponse = dTBAdResponse;
        this.activity = activity;
    }

    protected EventDistributor getEventDistributer() {
        return AdRegistration.getEventDistributer();
    }

    public DTBAdSize getSize() {
        try {
            DTBAdResponse dTBAdResponse = this.dtbAdResponse;
            if (dTBAdResponse != null) {
                List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
                if (dTBAds.size() > 0) {
                    return dTBAds.get(0);
                }
                return null;
            }
            return null;
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute getSize method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getSize method", e10);
            return null;
        }
    }

    public boolean isShowOnLoad() {
        return this.showOnLoad;
    }

    public void onCustomBannerFailure(View view) {
    }

    public void onCustomBannerSuccess(View view) {
    }
}
