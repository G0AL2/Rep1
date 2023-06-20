package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* loaded from: classes2.dex */
public class g {
    public static boolean a(UnitDisplayType unitDisplayType, com.fyber.inneractive.sdk.config.h hVar) {
        return !unitDisplayType.isFullscreenUnit() || hVar.a("use_fraud_detection_fullscreen", true);
    }
}
