package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1024Jd {
    public double A00;
    public EnumC1030Jj A01;
    public EnumC1031Jk A02;
    public String A03;
    public String A04;
    @Nullable
    public Map<String, String> A05;
    public boolean A06;

    public final C1024Jd A00(double d10) {
        this.A00 = d10;
        return this;
    }

    public final C1024Jd A01(EnumC1030Jj enumC1030Jj) {
        this.A01 = enumC1030Jj;
        return this;
    }

    public final C1024Jd A02(EnumC1031Jk enumC1031Jk) {
        this.A02 = enumC1031Jk;
        return this;
    }

    public final C1024Jd A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C1024Jd A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C1024Jd A05(@Nullable Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C1024Jd A06(boolean z10) {
        this.A06 = z10;
        return this;
    }

    public final C1025Je A07(C8U c8u) {
        return new C1025Je(c8u, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
