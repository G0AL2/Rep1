package com.chartboost.sdk.Events;

/* loaded from: classes.dex */
public class ChartboostCacheError extends ChartboostError {
    public final Code code;

    /* loaded from: classes.dex */
    public enum Code {
        INTERNAL(0),
        INTERNET_UNAVAILABLE(1),
        NETWORK_FAILURE(5),
        NO_AD_FOUND(6),
        SESSION_NOT_STARTED(7),
        ASSET_DOWNLOAD_FAILURE(16),
        BANNER_DISABLED(36),
        BANNER_VIEW_IS_DETACHED(37);
        
        private final int errorCode;

        Code(int i10) {
            this.errorCode = i10;
        }

        public int getErrorCode() {
            return this.errorCode;
        }
    }

    public ChartboostCacheError(Code code) {
        super(1);
        this.code = code;
    }
}
