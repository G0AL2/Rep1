package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UI implements C7M {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ C1670da A00;
    public final /* synthetic */ UB A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 14, 25, 33, 24, 22, 25, 11, 14, -54, 11, -54, 23, 15, 14, 19, 11, -40};
    }

    static {
        A01();
    }

    public UI(UB ub2, C1670da c1670da, boolean z10) {
        this.A01 = ub2;
        this.A00 = c1670da;
        this.A02 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        C1400Xy c1400Xy;
        long j10;
        UA ua2;
        UA ua3;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 110);
        c1400Xy = this.A01.A0c;
        C0R A0D = c1400Xy.A0D();
        j10 = this.A01.A00;
        A0D.A2a(MJ.A01(j10), adErrorType.getErrorCode(), A00);
        ua2 = this.A01.A0G;
        if (ua2 != null) {
            UB ub2 = this.A01;
            String[] strArr = A04;
            String str = strArr[4];
            String errorMessage = strArr[7];
            if (str.length() != errorMessage.length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            ua3 = ub2.A0G;
            ua3.AAi(KH.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        UA ua2;
        EnumC1046Jz enumC1046Jz;
        C1400Xy c1400Xy;
        UA ua3;
        C1400Xy c1400Xy2;
        boolean A0q;
        UA ua4;
        FO fo;
        FO fo2;
        UB ub2 = this.A01;
        ub2.A0a = this.A00;
        if (this.A02) {
            fo = ub2.A0A;
            if (fo != null) {
                fo2 = this.A01.A0A;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "vb7V14ygc";
                strArr2[7] = "eJXYUqUMt";
                fo2.A0F();
            }
        }
        ua2 = this.A01.A0G;
        if (ua2 != null) {
            enumC1046Jz = this.A01.A0E;
            if (enumC1046Jz.equals(EnumC1046Jz.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    ua4 = this.A01.A0G;
                    ua4.ABT();
                }
            }
            if (this.A02) {
                c1400Xy = this.A01.A0c;
                if (!JR.A1C(c1400Xy) || this.A01.A0z() == null || !this.A01.A0z().A0r()) {
                    ua3 = this.A01.A0G;
                    ua3.A9w();
                    return;
                }
                UB ub3 = this.A01;
                c1400Xy2 = ub3.A0c;
                ub3.A0M = PB.A01(c1400Xy2, this.A01.A0z(), 4, new UJ(this));
            }
        }
    }
}
