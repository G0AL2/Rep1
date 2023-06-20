package com.chartboost.sdk.impl;

import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostShowError;

/* loaded from: classes.dex */
public interface f0 {
    void a(String str, String str2, ChartboostCacheError chartboostCacheError);

    void a(String str, String str2, ChartboostClickError chartboostClickError);

    void a(String str, String str2, ChartboostShowError chartboostShowError);

    void b(String str, String str2, ChartboostCacheError chartboostCacheError);

    void b(String str, String str2, ChartboostShowError chartboostShowError);
}
