package com.fyber.inneractive.sdk.config.enums;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import fm.castbox.mediation.widget.AdView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum UnitDisplayType {
    INTERSTITIAL("interstitial", false),
    LANDSCAPE(DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE, true),
    MRECT("mrect", false),
    BANNER(AdView.AdType.BANNER, false),
    REWARDED(RNAdsEvents.EVENT_REWARDED, false),
    SQUARE("square", true),
    VERTICAL("vertical", true),
    DEFAULT("default", false);
    
    private static final Map<String, UnitDisplayType> CONSTANTS = new HashMap();
    private final boolean deprecated;
    private String stringValue;

    static {
        UnitDisplayType[] values;
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    UnitDisplayType(String str, boolean z10) {
        this.stringValue = str;
        this.deprecated = z10;
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = CONSTANTS.get(str);
        return unitDisplayType != null ? unitDisplayType : DEFAULT;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }

    public String value() {
        return this.stringValue;
    }
}
