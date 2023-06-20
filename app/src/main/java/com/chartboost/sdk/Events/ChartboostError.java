package com.chartboost.sdk.Events;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class ChartboostError {
    public final int actionType;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Type {
        public static final int CACHE = 1;
        public static final int CLICK = 0;
        public static final int SHOW = 2;
    }

    public ChartboostError(int i10) {
        this.actionType = i10;
    }
}
