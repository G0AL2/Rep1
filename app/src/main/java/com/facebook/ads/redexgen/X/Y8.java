package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class Y8 extends C7A<Long> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-41};
    }

    public Y8(long j10, @Nullable AnonymousClass78 anonymousClass78, long j11) {
        super(j10, anonymousClass78, Long.valueOf(j11), AnonymousClass79.A09);
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        return 8;
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 53), A07());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.lang.Long> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final boolean A0A(C7A<Long> c7a) {
        return A07().equals(c7a.A07());
    }
}
