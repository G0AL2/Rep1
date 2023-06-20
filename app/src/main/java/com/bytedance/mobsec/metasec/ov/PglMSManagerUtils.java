package com.bytedance.mobsec.metasec.ov;

import android.content.Context;
import ms.bd.o.Pgl.l0;

/* loaded from: classes.dex */
public final class PglMSManagerUtils {
    private PglMSManagerUtils() {
    }

    public static synchronized PglMSManager get(String str) {
        PglMSManager pglMSManager;
        synchronized (PglMSManagerUtils.class) {
            l0.pgla a10 = l0.a(str);
            pglMSManager = a10 != null ? new PglMSManager(a10) : null;
        }
        return pglMSManager;
    }

    public static synchronized boolean init(Context context, PglMSConfig pglMSConfig) {
        boolean a10;
        synchronized (PglMSManagerUtils.class) {
            a10 = l0.a(context, pglMSConfig.a(), "Pglmetasec_ov", "ms_sensor_ov");
        }
        return a10;
    }

    public static String versionInfo() {
        return l0.a();
    }
}
