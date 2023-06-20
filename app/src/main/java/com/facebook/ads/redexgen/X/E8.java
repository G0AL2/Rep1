package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class E8 {
    public final String A00;
    public final boolean A01;

    public E8(String str, boolean z10) {
        this.A00 = str;
        this.A01 = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != E8.class) {
            return false;
        }
        E8 e82 = (E8) obj;
        return TextUtils.equals(this.A00, e82.A00) && this.A01 == e82.A01;
    }

    public final int hashCode() {
        int i10 = 1 * 31;
        String str = this.A00;
        int result = str == null ? 0 : str.hashCode();
        int result2 = (i10 + result) * 31;
        int result3 = this.A01 ? 1231 : 1237;
        return result2 + result3;
    }
}
