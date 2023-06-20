package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* loaded from: classes2.dex */
public class e0 {
    public static boolean a(UnitDisplayType unitDisplayType) {
        return UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || UnitDisplayType.REWARDED.equals(unitDisplayType) || UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }
}
