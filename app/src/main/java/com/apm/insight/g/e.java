package com.apm.insight.g;

import com.apm.insight.h;
import com.apm.insight.l.r;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public class e {
    public static boolean a(long j10) {
        if (r.a(2)) {
            return true;
        }
        if (r.a((int) IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES)) {
            return false;
        }
        return (com.apm.insight.runtime.a.b.c() == -1 || j10 - com.apm.insight.runtime.a.b.c() <= h.i().getLaunchCrashInterval()) && !(h.m() && h.p() == 0);
    }
}
