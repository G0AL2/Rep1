package com.unity3d.services.core.configuration;

import com.unity3d.services.core.request.metrics.Metric;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IInitializeEventsMetricSender {
    void didConfigRequestStart();

    void didInitStart();

    Long duration();

    Map<String, String> getMetricTags();

    Long initializationStartTimeStamp();

    void sdkDidInitialize();

    void sdkInitializeFailed(String str);

    void sdkTokenDidBecomeAvailableWithConfig(boolean z10);

    void sendMetric(Metric metric);

    void setMetricTags(Map<String, String> map);

    Long tokenDuration();
}
