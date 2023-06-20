package com.fyber.inneractive.sdk.network;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public enum p {
    EVENT_READY_ON_CLIENT(41),
    /* JADX INFO: Fake field, exist only in values array */
    VAST_EVENT_PLAYED_FOR_2_SECONDS(42),
    VAST_EVENT_COMPANION_CLICKED(43),
    VAST_MEDIA_LOAD_RETRY_ATTEMPTED(44),
    OMID_VAST_DETECTION(50),
    VAST_COMPANION_DISPLAYED(71),
    VAST_EVENT_COMPANION_FILTERED(72),
    NUMBER_OF_COMPANIONS(73),
    VAST_COMPANION_LOAD_ATTEMPT(74),
    VAST_DEFAULT_COMPANION_DISPLAYED(76),
    MRAID_VIDEO_DETECTED(61),
    MRAID_CUSTOM_CLOSE_DETECTED(391),
    INTERSTITIAL_VIEW_TIME(392),
    FAIL_SAFE_ACTIVATED(393),
    USER_SKIP_ACTION_LATENCY(394),
    USER_CLOSE_ACTION_LATENCY(395),
    EXTERNAL_BROWSER_OPENED(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD),
    IA_PUBLISHER_REQUESTED_SHOW(804),
    IA_AD_FAILURE_DATA(850),
    FYBER_SUCCESS_CLICK(990),
    METRIC_MEASUREMENTS_EVENT(60),
    /* JADX INFO: Fake field, exist only in values array */
    IA_AMAZON_ID(669),
    CAUGHT_EXCEPTION(998),
    IA_UNCAUGHT_EXCEPTION(androidx.room.k0.MAX_BIND_PARAMETER_CNT),
    FIRST_OPENED(10);
    

    /* renamed from: a  reason: collision with root package name */
    public int f17677a;

    p(int i10) {
        this.f17677a = i10;
    }
}
