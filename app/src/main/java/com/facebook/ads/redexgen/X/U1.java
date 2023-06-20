package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class U1 implements R3 {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C1053Kh A01;
    public final /* synthetic */ C1055Kk A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, 98, 97, 99, 104, 104, 105, 54, 19, 66, 65, 30, 18, 18, 66, 18, 1, 24, 4, 5, 14, 51, 40, 46, 59, 63, 34, 36, 37, 113, 107, 108, 90, 77, 73, 90, 77, 31, 90, 77, 77, 80, 77, 31, 80, 92, 92, 74, 77, 77, 90, 91, 75, 125, 106, 110, 125, 106, 56, 106, 125, 104, 116, 113, 125, 124, 56, 107, 109, 123, 123, 125, 107, 107, 126, 109, 116, 116, 97, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public U1(C1055Kk c1055Kk, C1053Kh c1053Kh, long j10) {
        this.A02 = c1055Kk;
        this.A01 = c1053Kh;
        this.A00 = j10;
    }

    private final void A02(RF rf) {
        C1400Xy c1400Xy;
        long j10;
        C1400Xy c1400Xy2;
        long j11;
        C1056Kl c1056Kl;
        C1400Xy c1400Xy3;
        C1400Xy c1400Xy4;
        long j12;
        Kg.A06(this.A01);
        try {
            R1 A00 = rf.A00();
            if (A00 != null) {
                String errorMsg = A00.A5p();
                c1056Kl = this.A02.A05;
                c1400Xy3 = this.A02.A04;
                C1058Kn A06 = c1056Kl.A06(c1400Xy3, errorMsg, this.A00);
                if (A06.A01() == EnumC1057Km.A03) {
                    C1298Tx c1298Tx = (C1298Tx) A06;
                    String finalErrMessage = c1298Tx.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1298Tx.A03(), AdErrorType.ERROR_MESSAGE);
                    if (finalErrMessage != null) {
                        errorMsg = finalErrMessage;
                    }
                    c1400Xy4 = this.A02.A04;
                    C0R A0D = c1400Xy4.A0D();
                    j12 = this.A02.A00;
                    A0D.A2j(MJ.A01(j12), adErrorTypeFromCode.getErrorCode(), errorMsg, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(KH.A01(adErrorTypeFromCode, errorMsg));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = rf.getMessage();
            c1400Xy2 = this.A02.A04;
            C0R A0D2 = c1400Xy2.A0D();
            j11 = this.A02.A00;
            A0D2.A2j(MJ.A01(j11), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
            this.A02.A0D(KH.A01(adErrorType, message));
        } catch (JSONException e10) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String message2 = rf.getMessage();
            c1400Xy = this.A02.A04;
            C0R A0D3 = c1400Xy.A0D();
            j10 = this.A02.A00;
            long A01 = MJ.A01(j10);
            int errorCode = adErrorType2.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String errorMessage = A00(16, 15, 65);
            sb2.append(errorMessage);
            String errorMessage2 = e10.getMessage();
            sb2.append(errorMessage2);
            A0D3.A2j(A01, errorCode, sb2.toString(), adErrorType2.isPublicError());
            this.A02.A0D(KH.A01(adErrorType2, message2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.R3
    public final void AAM(R1 r12) {
        KV.A05(A00(79, 10, 46), A00(52, 27, 18), A00(8, 8, 45));
        if (r12 != null) {
            String A5p = r12.A5p();
            Kg.A06(this.A01);
            this.A02.A0N(A5p, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.R3
    public final void AAj(Exception exc) {
        C1400Xy c1400Xy;
        long j10;
        KV.A05(A00(89, 7, 58), A00(31, 21, 53), A00(0, 8, 90));
        if (RF.class.equals(exc.getClass())) {
            A02((RF) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String message = exc.getMessage();
        c1400Xy = this.A02.A04;
        C0R A0D = c1400Xy.A0D();
        j10 = this.A02.A00;
        A0D.A2j(MJ.A01(j10), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
        this.A02.A0D(KH.A01(adErrorType, message));
    }
}
