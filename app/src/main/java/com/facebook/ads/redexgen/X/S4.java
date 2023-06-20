package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class S4 implements InterfaceC1164Os {
    public static String[] A02 = {"z07VqEjGvJ", "HVUavbLQzawZdZVBJZvs2mdfMmVurwko", "OXCJr9QWCT6iNhGP7b2SKXpA8jzUGtxO", "XfWPaMhvYm", "d0mI5Otk4DkPTVLBqA06pYB2qhxVYO4x", "4lS6eLthtLYEvbxsvILcFz16jeQVP", "9TNy9PrFUeRgfy9Rk5pKZK4U", "r8zM3TRfMT7OJmVxj71ND5jlCBdKG"};
    public final /* synthetic */ C1172Pa A00;
    public final /* synthetic */ S3 A01;

    public S4(S3 s32, C1172Pa c1172Pa) {
        this.A01 = s32;
        this.A00 = c1172Pa;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1164Os
    public final void AA3() {
        C1220Qw c1220Qw;
        C1220Qw c1220Qw2;
        C1220Qw c1220Qw3;
        if (this.A00.A02() == 0) {
            c1220Qw3 = this.A01.A01;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "rJocaZsUv9";
            strArr2[6] = "3nzpDtzjz9tePwbisyAfJiul";
            c1220Qw3.A0U();
        }
        c1220Qw = this.A01.A02;
        if (c1220Qw != null) {
            c1220Qw2 = this.A01.A02;
            c1220Qw2.A0U();
        }
    }
}
