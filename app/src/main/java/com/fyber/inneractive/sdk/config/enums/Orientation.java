package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum Orientation {
    LANDSCAPE(DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE, false),
    PORTRAIT(DtbDeviceDataRetriever.ORIENTATION_PORTRAIT, false),
    USER("user", true),
    NONE("none", true);
    
    private static final Map<String, Orientation> CONSTANTS = new HashMap();
    public boolean allowOrientationChange;
    private final String value;

    static {
        Orientation[] values;
        for (Orientation orientation : values()) {
            CONSTANTS.put(orientation.value, orientation);
        }
    }

    Orientation(String str, boolean z10) {
        this.value = str;
        this.allowOrientationChange = z10;
    }

    public static Orientation fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }
}
