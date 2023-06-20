package com.ironsource.mediationsdk.c;

import com.ironsource.mediationsdk.logger.IronLog;
import qe.k;

/* loaded from: classes3.dex */
public final class a {
    static {
        new a();
    }

    private a() {
    }

    public static final boolean a(Object obj, String str) {
        k.f(str, "errorMessage");
        if (obj != null) {
            return true;
        }
        IronLog.API.error(str);
        return false;
    }
}
