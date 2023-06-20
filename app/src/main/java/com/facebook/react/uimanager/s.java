package com.facebook.react.uimanager;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Locale;

/* compiled from: PointerEvents.java */
/* loaded from: classes.dex */
public enum s {
    NONE,
    BOX_NONE,
    BOX_ONLY,
    AUTO;

    public static boolean a(s sVar) {
        return sVar == AUTO || sVar == BOX_ONLY;
    }

    public static boolean b(s sVar) {
        return sVar == AUTO || sVar == BOX_NONE;
    }

    public static s c(String str) {
        if (str == null) {
            return AUTO;
        }
        return valueOf(str.toUpperCase(Locale.US).replace(Constants.FILENAME_SEQUENCE_SEPARATOR, "_"));
    }
}
