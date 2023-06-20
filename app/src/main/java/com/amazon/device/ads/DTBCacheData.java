package com.amazon.device.ads;

import java.util.Date;

/* loaded from: classes.dex */
public class DTBCacheData {
    private static long ADMOB_AUTO_REFRESH_TIME_LIMIT_MS = 30000;
    private DTBAdRequest cachingLoader;
    private DTBAdResponse cachingResponse;
    private String requestId;
    private boolean isBidRequestFailed = false;
    private long responseTimeStamp = new Date().getTime();

    public DTBCacheData(String str, DTBAdRequest dTBAdRequest) {
        this.requestId = str;
        this.cachingLoader = dTBAdRequest;
    }

    public void addResponse(DTBAdResponse dTBAdResponse) {
        this.cachingResponse = dTBAdResponse;
        this.responseTimeStamp = new Date().getTime();
    }

    public DTBAdResponse getAdResponse() {
        if (new Date().getTime() - this.responseTimeStamp <= ADMOB_AUTO_REFRESH_TIME_LIMIT_MS) {
            return this.cachingResponse;
        }
        this.cachingResponse = null;
        return null;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public long getResponseTimeStamp() {
        return this.responseTimeStamp;
    }

    public boolean isBidRequestFailed() {
        return this.isBidRequestFailed;
    }

    public void setBidRequestFailed(boolean z10) {
        this.isBidRequestFailed = z10;
    }

    public void updateResponse(DTBAdResponse dTBAdResponse) {
        this.cachingResponse = dTBAdResponse;
    }
}
