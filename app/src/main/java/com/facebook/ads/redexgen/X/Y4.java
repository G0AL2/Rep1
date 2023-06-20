package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class Y4 extends C7A<C07236g> {
    public Y4(long j10, @Nullable AnonymousClass78 anonymousClass78, C07236g c07236g) {
        super(j10, anonymousClass78, c07236g, AnonymousClass79.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        return A07().A09();
    }

    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject jSONObject) throws JSONException {
        return A07().A0A(jSONObject);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.biometric.model.TouchSignalRawValue> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final boolean A0A(C7A<C07236g> c7a) {
        return A07().A0B(c7a.A07());
    }
}
