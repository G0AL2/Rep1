package com.unity3d.services.core.request.metrics;

import java.util.Map;

/* loaded from: classes3.dex */
public class SDKMetricSender implements ISDKMetricSender {
    @Override // com.unity3d.services.core.request.metrics.ISDKMetricSender
    public void sendSDKMetricEvent(SDKMetricEvents sDKMetricEvents) {
        ISDKMetrics sDKMetrics;
        if (sDKMetricEvents == null || (sDKMetrics = SDKMetrics.getInstance()) == null) {
            return;
        }
        sDKMetrics.sendEvent(sDKMetricEvents.toString());
    }

    @Override // com.unity3d.services.core.request.metrics.ISDKMetricSender
    public void sendSDKMetricEventWithTag(SDKMetricEvents sDKMetricEvents, Map<String, String> map) {
        ISDKMetrics sDKMetrics;
        if (sDKMetricEvents == null || (sDKMetrics = SDKMetrics.getInstance()) == null) {
            return;
        }
        sDKMetrics.sendEvent(sDKMetricEvents.toString(), map);
    }
}
