package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YA extends C7A<Integer> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{82};
    }

    public YA(long j10, @Nullable AnonymousClass78 anonymousClass78, int i10) {
        super(j10, anonymousClass78, Integer.valueOf(i10), AnonymousClass79.A06);
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        return 4;
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 20), A07());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.lang.Integer> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final boolean A0A(C7A<Integer> c7a) {
        return A07().equals(c7a.A07());
    }
}
