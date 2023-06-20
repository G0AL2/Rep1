package com.vehiclecloud.app.videofetch.unit;

import android.os.Bundle;

/* loaded from: classes3.dex */
public class AnalyticsParamsBuilder {
    private final Bundle params = new Bundle();

    public Bundle build() {
        return this.params;
    }

    public AnalyticsParamsBuilder d(String str, double d10) {
        this.params.putDouble(str, d10);
        return this;
    }

    public AnalyticsParamsBuilder i(String str, int i10) {
        this.params.putInt(str, i10);
        return this;
    }

    public AnalyticsParamsBuilder l(String str, long j10) {
        this.params.putLong(str, j10);
        return this;
    }

    public AnalyticsParamsBuilder str(String str, String str2) {
        this.params.putString(str, str(str2));
        return this;
    }

    public static String str(String str) {
        return str == null ? "" : str.length() < 80 ? str : str.substring(str.length() - 80);
    }

    public AnalyticsParamsBuilder d(String str, Double d10, double d11) {
        Bundle bundle = this.params;
        if (d10 != null) {
            d11 = d10.doubleValue();
        }
        bundle.putDouble(str, d11);
        return this;
    }

    public AnalyticsParamsBuilder i(String str, Integer num, int i10) {
        Bundle bundle = this.params;
        if (num != null) {
            i10 = num.intValue();
        }
        bundle.putInt(str, i10);
        return this;
    }

    public AnalyticsParamsBuilder l(String str, Long l10, long j10) {
        Bundle bundle = this.params;
        if (l10 != null) {
            j10 = l10.longValue();
        }
        bundle.putLong(str, j10);
        return this;
    }
}
