package com.amazon.device.ads;

import android.view.ViewGroup;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class EventDistributor {
    private static final String LOG_TAG = "EventDistributor";

    public boolean distribute(String str, String str2, ViewGroup viewGroup, DTBAdResponse dTBAdResponse, DTBRendererObserver dTBRendererObserver, DTBRenderer dTBRenderer, Map<String, Object> map) {
        try {
            for (AdProvider adProvider : AdRegistration.getAdProviders()) {
                if (adProvider.matches(str, str2, dTBAdResponse)) {
                    adProvider.takeOwnership(viewGroup, dTBAdResponse, dTBRendererObserver, dTBRenderer, map);
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute distribute method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute distribute method", e10);
            return false;
        }
    }
}
