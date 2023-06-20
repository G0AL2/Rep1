package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Ld  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1073Ld {
    public static AdError A00(KH kh) {
        if (kh.A03().isPublicError()) {
            return new AdError(kh.A03().getErrorCode(), kh.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
