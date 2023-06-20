package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YE<T> extends C7A<AnonymousClass71> {
    public static byte[] A00;
    public static String[] A01 = {"FFbUiuFwozfA0TvCJPANz8giqJj3Ey6e", "FdrdBbAzaIA4fvIQziUETi0i5pzm7d41", "y8Q9G33rxS5LLrNXiYcm9QLiBdw97p1I", "zt8", "kKbJCUSdm2baWh6S7cWsva6nWBGnb0Bq", "lZC5QmFNV9qqPs7G4jyYJaaKbEwmE4", "OkQ3tI89WJ1Nk7Gpl9REz34W9wj5LbGl", "vzboBPdl2BbWH2MdrrRCAvv17E0LNPzE"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-73};
        String[] strArr = A01;
        if (strArr[0].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A01[2] = "4uyIqP7n4WtKVi9Rm5fO0ecCuIXu1zOj";
        A00 = bArr;
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YE != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    public YE(long j10, @Nullable AnonymousClass78 anonymousClass78, AnonymousClass71 anonymousClass71) {
        super(j10, anonymousClass78, anonymousClass71, AnonymousClass79.A03);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YE != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        return ((AnonymousClass71) A07()).AEp();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YE != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        return jSONObject.put(A00(0, 1, 25), ((AnonymousClass71) A07()).AFA());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.model.signal_value.ICustomObjectSignalValueDef> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YE != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final boolean A0A(C7A<AnonymousClass71> c7a) {
        if (A07() == null || c7a.A07() == null) {
            return A07() == null && c7a.A07() == null;
        }
        return ((AnonymousClass71) A07()).A8S(c7a.A07());
    }
}
