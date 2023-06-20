package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class U3 extends L8 {
    public static byte[] A02;
    public static String[] A03 = {"jAsZfZwQ15YE1xm95Uum6vWOaDH1Az8A", "fi77qJmjg5Rwb", "EORDPJJatEjTyV", "9q4WoxWSHvvys", "ZnqFv4LDFQ916SUcrxzb43hFVVFJOLFp", "nu1Fhr1q5Uq1RKDrD4GP42DLl0Uj", "wJhiR1cxoop1phUk5wYOXEGX7ooerIC3", "cvoiCCK"};
    public final /* synthetic */ C1053Kh A00;
    public final /* synthetic */ C1055Kk A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    static {
        A02();
    }

    public U3(C1055Kk c1055Kk, C1053Kh c1053Kh) {
        this.A01 = c1055Kk;
        this.A00 = c1053Kh;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C1400Xy c1400Xy;
        C1400Xy c1400Xy2;
        C1400Xy c1400Xy3;
        C1400Xy c1400Xy4;
        C1400Xy c1400Xy5;
        long j10;
        C1400Xy c1400Xy6;
        String str;
        Map<? extends String, ? extends String> map;
        R3 A032;
        C1400Xy c1400Xy7;
        C1400Xy c1400Xy8;
        C1400Xy c1400Xy9;
        C1400Xy c1400Xy10;
        long j11;
        c1400Xy = this.A01.A04;
        if (MH.A00(c1400Xy) != MG.A07) {
            c1400Xy2 = this.A01.A04;
            AnonymousClass98.A08(c1400Xy2);
            c1400Xy3 = this.A01.A04;
            C07105s.A07(c1400Xy3);
            C1053Kh c1053Kh = this.A00;
            C9U A00 = C9U.A00();
            c1400Xy4 = this.A01.A04;
            boolean z10 = true;
            Map<String, String> A08 = c1053Kh.A08(A00.A01(c1400Xy4, true).A6W());
            this.A01.A02 = A08;
            try {
                c1400Xy7 = this.A01.A04;
                PackageManager packageManager = c1400Xy7.getPackageManager();
                if (packageManager != null) {
                    String A002 = A00(1, 12, 113);
                    StringBuilder sb2 = new StringBuilder();
                    c1400Xy8 = this.A01.A04;
                    sb2.append(c1400Xy8.getPackageName());
                    sb2.append(A00(0, 1, 93));
                    c1400Xy9 = this.A01.A04;
                    sb2.append(packageManager.getInstallerPackageName(c1400Xy9.getPackageName()));
                    A08.put(A002, new String(Base64.encode(sb2.toString().getBytes(), 2)));
                }
            } catch (Exception unused) {
            }
            try {
                if (this.A00.A05() != KM.A03 && this.A00.A05() != KM.A05 && this.A00.A05() != KM.A04 && this.A00.A05() != null) {
                    z10 = false;
                }
                c1400Xy6 = this.A01.A04;
                R2 A022 = RK.A02(z10, c1400Xy6);
                str = this.A01.A06;
                RG rg = new RG();
                map = this.A01.A02;
                byte[] A082 = rg.A05(map).A08();
                A032 = this.A01.A03(MJ.A00(), this.A00);
                A022.ADC(str, A082, A032);
                return;
            } catch (Exception e10) {
                AdErrorType adErrorType = AdErrorType.AD_REQUEST_FAILED;
                String message = e10.getMessage();
                c1400Xy5 = this.A01.A04;
                C0R A0D = c1400Xy5.A0D();
                String errorMessage = A03[5];
                if (errorMessage.length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "KP51TgwZ8p9oo";
                strArr[2] = "i0Q8y5VFLDaPT7";
                j10 = this.A01.A00;
                A0D.A2j(MJ.A01(j10), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
                this.A01.A0D(KH.A01(adErrorType, message));
                return;
            }
        }
        this.A01.A09();
        AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
        String A003 = A00(13, 21, 92);
        c1400Xy10 = this.A01.A04;
        C0R A0D2 = c1400Xy10.A0D();
        j11 = this.A01.A00;
        A0D2.A2j(MJ.A01(j11), adErrorType2.getErrorCode(), A003, adErrorType2.isPublicError());
        this.A01.A0D(new KH(adErrorType2, A003));
    }
}
