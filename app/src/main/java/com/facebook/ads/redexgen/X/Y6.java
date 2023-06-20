package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class Y6 extends C7A<C07216e> {
    public Y6(long j10, @Nullable AnonymousClass78 anonymousClass78, C07216e c07216e) {
        super(j10, anonymousClass78, c07216e, AnonymousClass79.A0B);
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        return A07().A03();
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        return A07().A04(jSONObject);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.biometric.model.SensorSignalRawValue> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final boolean A0A(C7A<C07216e> c7a) {
        return A07().A05(c7a.A07());
    }
}
