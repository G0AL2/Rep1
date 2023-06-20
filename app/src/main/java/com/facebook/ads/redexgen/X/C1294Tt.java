package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1294Tt extends L8 {
    public static byte[] A01;
    public static String[] A02 = {"562InPUOhACtlwCEtN", "R5lwX4z8RDFVh5E8umVQyGbxSoVGO", "CYUCoKvLVtAS439EMb", "ChKnavF9Nqo0oetaNymcfBGaHAWTYXo2", "g5ZzVDftJQYE4wszTnHA7JY3RdMW3", "1hyLjyvULyVtl4OO", "Eld6CqAd7cnvJnvbiWS", "Re88eRXq7VTIVsZrXxwUq3yVYBRsOkYZ"};
    public final /* synthetic */ Context A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, -123, -123, 98, 126, -125, 104, 121, Byte.MIN_VALUE, 107, 122, -121, -120, 126, -124, -125};
    }

    static {
        A02();
    }

    public C1294Tt(Context context) {
        this.A00 = context;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        int A022;
        if (C1078Li.A02 == EnumC1077Lh.A02) {
            return;
        }
        SharedPreferences A00 = C1063Kt.A00(this.A00);
        String A002 = A00(0, 16, 10);
        int returnMinSdkVersion = A00.getInt(A002, -1);
        if (returnMinSdkVersion != -1) {
            int unused = C1078Li.A00 = returnMinSdkVersion;
            C1078Li.A02 = EnumC1077Lh.A02;
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A022 = C1078Li.A03(this.A00);
        } else {
            A022 = C1078Li.A02(this.A00);
        }
        int unused2 = C1078Li.A00 = A022;
        if (A02[7].charAt(31) == 71) {
            throw new RuntimeException();
        }
        A02[3] = "Y4NBnL2AiN9ppE2ANDhRNdYoO8WQhPKC";
        A00.edit().putInt(A002, A022).commit();
        C1078Li.A02 = EnumC1077Lh.A02;
    }
}
