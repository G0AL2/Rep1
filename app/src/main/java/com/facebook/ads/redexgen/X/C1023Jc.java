package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Jc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1023Jc {
    public static String[] A04 = {"VLi8WrXKJp9LAfXNm4uZETrUUakGZ0WJ", "E0EVlIE69utJBkpy2DAhge3Hway87PLR", "qesF58zlzdTn3lZrcRPwRcXAd51VIYsw", "DEhD", "3RGnWFLj1o7mNylLhDHkdliNsrvaqEmP", "q3CsqlllThy2l0WXj26QCfAwDyJHO8xz", "YGqlmSv0HhFp83FTVTLuq2K4C5WSoxDU", "sGX8UiLG8Isc3yhet7ELjp1Y4Ecy5PZh"};
    public JZ A01 = JZ.A02;
    public EnumC1021Ja A02 = EnumC1021Ja.A07;
    public EnumC1022Jb A03 = EnumC1022Jb.A02;
    public JY A00 = JY.A02;

    public final void A00() {
        this.A00 = JY.A03;
    }

    public final void A01() {
        this.A02 = EnumC1021Ja.A05;
    }

    public final void A02() {
        this.A02 = EnumC1021Ja.A06;
    }

    public final void A03() {
        this.A03 = EnumC1022Jb.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC1021Ja.A07 && this.A02 != EnumC1021Ja.A03) {
            EnumC1021Ja enumC1021Ja = this.A02;
            if (A04[4].charAt(28) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[7] = "MUDNUnKN31103IrO48BPEmRZSZgb6Srw";
            strArr[2] = "6QfhYTpMJgBL3pE6aQQCkQeTlukRlAkO";
            if (enumC1021Ja != EnumC1021Ja.A06) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC1021Ja.A07 || this.A02 == EnumC1021Ja.A03;
    }

    public final boolean A06() {
        return this.A03 == EnumC1022Jb.A03;
    }

    public final boolean A07() {
        return this.A00 == JY.A03;
    }
}
