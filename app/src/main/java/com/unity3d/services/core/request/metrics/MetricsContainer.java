package com.unity3d.services.core.request.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class MetricsContainer {
    private static final String METRICS_CONTAINER = "m";
    private static final String METRICS_CONTAINER_TAGS = "t";
    private final MetricCommonTags _commonTags;
    private final List<Metric> _metrics;

    public MetricsContainer(MetricCommonTags metricCommonTags, List<Metric> list) {
        this._commonTags = metricCommonTags;
        this._metrics = list;
    }

    public Map<String, Object> asMap() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Metric metric : this._metrics) {
            arrayList.add(metric.asMap());
        }
        hashMap.put("m", arrayList);
        hashMap.put(METRICS_CONTAINER_TAGS, this._commonTags.asMap());
        return hashMap;
    }
}
