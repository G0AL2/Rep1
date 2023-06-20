package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class ON {
    public static byte[] A09;
    public static String[] A0A = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", "", "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};
    @Nullable
    public OM A00;
    public boolean A01;
    public boolean A02;
    public final C1400Xy A03;
    public final InterfaceC1028Jh A04;
    public final MK A05;
    public final InterfaceC1110Mq A06;
    @Nullable
    public final C1220Qw A07;
    public final String A08;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, 63, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, 23, 82, 79, 82, 84, 66, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    static {
        A02();
    }

    public ON(C1400Xy c1400Xy, String str, @Nullable C1220Qw c1220Qw, MK mk, InterfaceC1028Jh interfaceC1028Jh) {
        this.A01 = true;
        this.A03 = c1400Xy;
        this.A08 = str;
        this.A07 = c1220Qw;
        this.A05 = mk;
        this.A04 = interfaceC1028Jh;
        this.A06 = new T2(this);
    }

    public ON(C1400Xy c1400Xy, String str, @Nullable C1220Qw c1220Qw, MK mk, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1110Mq interfaceC1110Mq) {
        this.A01 = true;
        this.A03 = c1400Xy;
        this.A08 = str;
        this.A07 = c1220Qw;
        this.A05 = mk;
        this.A04 = interfaceC1028Jh;
        this.A06 = interfaceC1110Mq;
    }

    public static void A03(C1400Xy c1400Xy, @Nullable C1220Qw c1220Qw, MK mk, InterfaceC1028Jh interfaceC1028Jh, C1L c1l, String str) {
        AbstractC05710f A01 = C05720g.A01(c1400Xy, interfaceC1028Jh, str, C1070La.A00(c1l.A05()), new OG().A03(c1220Qw).A02(mk).A05(), false, false);
        if (A01 != null) {
            A01.A0A();
        }
    }

    private void A05(String str, String str2, Map<String, String> map) {
        this.A04.A9O(str, map);
        Lq.A00(new OK(this, map, str, str2), new OL(this, str, map), ActivityUtils.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String A01 = A01(0, 22, 52);
        try {
            AbstractC05710f A012 = C05720g.A01(this.A03, this.A04, str, C1070La.A00(str2), new OG(map).A03(this.A07).A02(this.A05).A05(), this.A01, this.A02);
            if (A012 != null) {
                A012.A0C();
            }
            if (this.A00 != null) {
                this.A00.AAR();
            }
            this.A06.A3s(this.A08);
        } catch (ActivityNotFoundException e10) {
            Log.e(A01, A01(44, 20, 100) + str2, e10);
        } catch (Exception e11) {
            String[] strArr = A0A;
            if (strArr[0].length() != strArr[6].length()) {
                A0A[5] = "";
                Log.e(A01, A01(22, 22, 95), e11);
                return;
            }
            throw new RuntimeException();
        }
    }

    public final void A07(OM om) {
        this.A00 = om;
    }

    public final void A08(String str, String str2, Map<String, String> map) {
        new C1036Jp(str, this.A04).A02(EnumC1035Jo.A0J, null);
        if (this.A05.A09(this.A03)) {
            this.A04.A8u(str, map);
        } else if (JR.A14(this.A03)) {
            A05(str, str2, map);
        } else {
            A06(str, str2, map);
        }
    }

    public final void A09(boolean z10) {
        this.A02 = z10;
    }

    public final void A0A(boolean z10) {
        this.A01 = z10;
    }
}
