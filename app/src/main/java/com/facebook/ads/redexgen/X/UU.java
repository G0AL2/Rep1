package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UU implements R3 {
    public static byte[] A01;
    public static String[] A02 = {"XEdsDf1ZbmPdObC9OTEW2z8", "P58GYLlTlw8ULSmid4", "Mge4MDnEmweXwYPX4YofvB", "Ml9Qgu3DLJEhAVMYvCD1k2vZQtwOfhBB", "E1ltw8QxIeAvk6pflmFLXm8YnaEq6i", "JKuYCHjaj2TXENBLxEiyXLq9QhlooG47", "FRLGU9mx00WiiljPewQioxO6UtPhxOrA", "0cr7cMD0TGsotYn7hqiGPP2awzQMRhBn"};
    public final /* synthetic */ C8U A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 117;
            String[] strArr = A02;
            if (strArr[3].charAt(0) == strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "sKECfnlovjgTE3hUnC6hiyxfwSx6iZYU";
            strArr2[6] = "FWGh7KUlNSgjRKrBTTVWdRGVuB2lw617";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-12, 18, 31, -40, 37, -47, 21, 26, 36, 33, 18, 37, 20, 25, -47, 20, 32, 38, 31, 37, 22, 35, 36, -33, 1, 38, 48, 45, 30, 49, 32, 37, 34, 33, -35, 32, 44, 50, 43, 49, 34, 47, 48, -21, -35, 15, 34, 48, 45, 44, 43, 48, 34, -9, -35};
    }

    static {
        A01();
    }

    public UU(C8U c8u) {
        this.A00 = c8u;
    }

    @Override // com.facebook.ads.redexgen.X.R3
    public final void AAM(R1 r12) {
        if (this.A00.A03().A8P() && r12 != null) {
            String str = A00(24, 31, 72) + r12.A5p();
        }
    }

    @Override // com.facebook.ads.redexgen.X.R3
    public final void AAj(Exception exc) {
        if (this.A00.A03().A8P()) {
            Log.e(C1039Js.A00(), A00(0, 24, 60), exc);
        }
    }
}
