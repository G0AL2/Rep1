package com.chartboost.sdk.Events;

/* loaded from: classes.dex */
public class ChartboostShowError extends ChartboostError {
    public final Code code;
    public boolean shouldRetry;

    /* loaded from: classes.dex */
    public enum Code {
        INTERNAL(0),
        SESSION_NOT_STARTED(7),
        AD_ALREADY_VISIBLE(8),
        INTERNET_UNAVAILABLE(25),
        PRESENTATION_FAILURE(33),
        NO_CACHED_AD(34),
        BANNER_DISABLED(36),
        BANNER_VIEW_IS_DETACHED(37),
        BANNER_SIZE_WAS_NOT_SUCCESSFULLY_SET(38);
        
        private final int errorCode;

        Code(int i10) {
            this.errorCode = i10;
        }

        public int getErrorCode() {
            return this.errorCode;
        }
    }

    public ChartboostShowError(Code code, boolean z10) {
        super(2);
        this.code = code;
        this.shouldRetry = z10;
    }
}
