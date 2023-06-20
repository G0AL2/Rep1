package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class InitializeEventsMetricSender implements IInitializeEventsMetricSender, IInitializationListener {
    private static InitializeEventsMetricSender _instance;
    private Map<String, String> _metricTags;
    private long _startTime = 0;
    private long _configStartTime = 0;
    private boolean _initMetricSent = false;
    private boolean _tokenMetricSent = false;

    private InitializeEventsMetricSender() {
        InitializationNotificationCenter.getInstance().addListener(this);
    }

    public static IInitializeEventsMetricSender getInstance() {
        if (_instance == null) {
            _instance = new InitializeEventsMetricSender();
        }
        return _instance;
    }

    private void sendTokenAvailabilityMetricWithConfig(boolean z10) {
        Metric newTokenAvailabilityLatencyWebview;
        if (this._startTime == 0) {
            DeviceLog.debug("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        Long valueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
        Map<String, String> metricTags = getMetricTags();
        if (z10) {
            newTokenAvailabilityLatencyWebview = TSIMetric.newTokenAvailabilityLatencyConfig(valueOf, metricTags);
        } else {
            newTokenAvailabilityLatencyWebview = TSIMetric.newTokenAvailabilityLatencyWebview(valueOf, metricTags);
        }
        sendMetric(newTokenAvailabilityLatencyWebview);
    }

    private void sendTokenResolutionRequestMetricIfNeeded() {
        if (this._configStartTime == 0) {
            DeviceLog.debug("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(TSIMetric.newTokenResolutionRequestLatency(tokenDuration(), getMetricTags()));
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didConfigRequestStart() {
        this._configStartTime = System.nanoTime();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didInitStart() {
        this._startTime = System.nanoTime();
        sendMetric(TSIMetric.newInitStarted(getMetricTags()));
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long duration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Map<String, String> getMetricTags() {
        Map<String, String> map = this._metricTags;
        return map != null ? map : new HashMap();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long initializationStartTimeStamp() {
        return Long.valueOf(this._startTime);
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitializationFailed(String str, int i10) {
        sdkInitializeFailed(str);
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitialized() {
        sdkDidInitialize();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkDidInitialize() {
        if (this._startTime == 0) {
            DeviceLog.debug("sdkDidInitialize called before didInitStart, skipping metric");
            return;
        }
        if (!this._initMetricSent) {
            sendMetric(TSIMetric.newInitTimeSuccess(duration(), getMetricTags()));
            this._initMetricSent = true;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkInitializeFailed(String str) {
        if (this._startTime == 0) {
            DeviceLog.debug("sdkInitializeFailed called before didInitStart, skipping metric");
            return;
        }
        if (!this._initMetricSent) {
            sendMetric(TSIMetric.newInitTimeFailure(duration(), getMetricTags()));
            this._initMetricSent = true;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkTokenDidBecomeAvailableWithConfig(boolean z10) {
        if (!this._tokenMetricSent) {
            sendTokenAvailabilityMetricWithConfig(z10);
            if (z10) {
                sendTokenResolutionRequestMetricIfNeeded();
            }
            this._tokenMetricSent = true;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void sendMetric(Metric metric) {
        SDKMetrics.getInstance().sendMetric(metric);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void setMetricTags(Map<String, String> map) {
        this._metricTags = map;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long tokenDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._configStartTime));
    }
}
