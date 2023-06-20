package com.vehiclecloud.app.videofetch.rndownloader.lib;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.unit.AnalyticsParamsBuilder;

/* loaded from: classes3.dex */
public class Analytics {
    private final FirebaseAnalytics analytics;

    /* loaded from: classes3.dex */
    public interface Event {
        public static final String DOWNLOAD_FAILED = "downloadVideoFailed";
        public static final String DOWNLOAD_SUCCEED = "downloadVideoSucceed";
    }

    public Analytics(Context context) {
        this.analytics = FirebaseAnalytics.getInstance(context);
    }

    private String hostOf(String str) {
        if (str == null || !str.startsWith("http")) {
            return str;
        }
        try {
            String host = Uri.parse(str).getHost();
            if (host == null) {
                return null;
            }
            return host.replace(".", "_");
        } catch (Exception unused) {
            return null;
        }
    }

    public void logEvent(String str, DownloadResource downloadResource) {
        this.analytics.b(str, new AnalyticsParamsBuilder().str("fileType", downloadResource.type).i("retryTimes", downloadResource.retryTimes).l("time", System.currentTimeMillis()).str(Analytics.Param.TARGET, downloadResource.trigger).i("status", downloadResource.status).build());
    }
}
