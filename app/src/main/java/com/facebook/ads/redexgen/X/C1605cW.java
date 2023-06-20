package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.cW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1605cW implements C2J {
    public final SharedPreferences A00;

    public C1605cW(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final C2I A57() {
        return new C1606cX(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final long A6u(String str, long j10) {
        return this.A00.getLong(str, j10);
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    @Nullable
    public final String A7c(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
