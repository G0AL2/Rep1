package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.WebRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MetricSender implements ISDKMetrics {
    private final String _metricEndpoint;
    private final ExecutorService _executorService = Executors.newSingleThreadExecutor();
    private final MetricCommonTags _commonTags = new MetricCommonTags(Device.getNetworkCountryISO(), MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID, SdkProperties.getVersionName(), Device.getOsVersion());

    public MetricSender(String str) {
        this._metricEndpoint = str;
    }

    @Override // com.unity3d.services.core.request.metrics.ISDKMetrics
    public String getMetricEndPoint() {
        return this._metricEndpoint;
    }

    @Override // com.unity3d.services.core.request.metrics.ISDKMetrics
    public void sendEvent(String str) {
        sendEvent(str, null);
    }

    @Override // com.unity3d.services.core.request.metrics.ISDKMetrics
    public void sendMetric(Metric metric) {
        sendMetrics(new ArrayList(Collections.singletonList(metric)));
    }

    @Override // com.unity3d.services.core.request.metrics.ISDKMetrics
    public void sendMetrics(final List<Metric> list) {
        if (list != null && list.size() > 0) {
            if (TextUtils.isEmpty(this._metricEndpoint)) {
                DeviceLog.debug("Metrics: " + list + " was not sent to null or empty endpoint: " + this._metricEndpoint);
                return;
            } else if (this._executorService.isShutdown()) {
                DeviceLog.debug("Metrics " + list + " was not sent due to misconfiguration");
                return;
            } else {
                this._executorService.submit(new Runnable() { // from class: com.unity3d.services.core.request.metrics.MetricSender.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String jSONObject = new JSONObject(new MetricsContainer(MetricSender.this._commonTags, list).asMap()).toString();
                            WebRequest webRequest = new WebRequest(MetricSender.this._metricEndpoint, "POST", null);
                            webRequest.setBody(jSONObject);
                            webRequest.makeRequest();
                            if (webRequest.getResponseCode() / 100 == 2) {
                                DeviceLog.debug("Metric " + list + " sent to " + MetricSender.this._metricEndpoint);
                            } else {
                                DeviceLog.debug("Metric " + list + " failed to send with response code: " + webRequest.getResponseCode());
                            }
                        } catch (Exception e10) {
                            DeviceLog.debug("Metric " + list + " failed to send from exception: " + e10.getMessage());
                        }
                    }
                });
                return;
            }
        }
        DeviceLog.debug("Metrics event not send due to being null or empty");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void shutdown() {
        this._executorService.shutdown();
    }

    @Override // com.unity3d.services.core.request.metrics.ISDKMetrics
    public void sendEvent(String str, Map<String, String> map) {
        if (str != null && !str.isEmpty()) {
            sendEvent(str, null, map);
            return;
        }
        DeviceLog.debug("Metric event not sent due to being null or empty: " + str);
    }

    @Override // com.unity3d.services.core.request.metrics.ISDKMetrics
    public void sendEvent(String str, String str2, Map<String, String> map) {
        sendMetrics(new ArrayList(Collections.singletonList(new Metric(str, str2, map))));
    }
}
