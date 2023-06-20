package com.chartboost.sdk.Events;

/* loaded from: classes.dex */
public class ChartboostClickError extends ChartboostError {
    public final Code code;

    /* loaded from: classes.dex */
    public enum Code {
        URI_INVALID(0),
        URI_UNRECOGNIZED(1),
        INTERNAL(3);
        
        private final int errorCode;

        Code(int i10) {
            this.errorCode = i10;
        }

        public int getErrorCode() {
            return this.errorCode;
        }
    }

    public ChartboostClickError(Code code) {
        super(0);
        this.code = code;
    }
}
