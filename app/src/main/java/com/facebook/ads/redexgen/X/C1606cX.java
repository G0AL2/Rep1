package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.cX  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1606cX implements C2I {
    public final SharedPreferences.Editor A00;

    public C1606cX(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final void A3N() {
        this.A00.apply();
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final C2I ADR(String str, long j10) {
        this.A00.putLong(str, j10);
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final C2I ADS(String str, @Nullable String str2) {
        this.A00.putString(str, str2);
        return this;
    }
}
