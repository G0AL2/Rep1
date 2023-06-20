package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public final class KH {
    public final AdErrorType A00;
    public final String A01;

    public KH(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public KH(AdErrorType adErrorType, @Nullable String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static KH A00(AdErrorType adErrorType) {
        return new KH(adErrorType, (String) null);
    }

    public static KH A01(AdErrorType adErrorType, @Nullable String str) {
        return new KH(adErrorType, str);
    }

    public static KH A02(KI ki) {
        return new KH(ki.A00(), ki.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
