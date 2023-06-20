package com.chartboost.sdk.Tracking;

import com.chartboost.sdk.Tracking.d;

/* loaded from: classes.dex */
public class c extends d {
    public c(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
        a(d.a.INFO);
        if ("cache_finish_success".equals(str) || "cache_finish_failure".equals(str) || "show_finish_success".equals(str) || "show_finish_failure".equals(str)) {
            a(true);
        }
    }
}
