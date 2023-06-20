package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class G0 extends AbstractC1684dp {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = G0.class.getSimpleName();
    }

    public G0(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str, Uri uri, Map<String, String> map, @Nullable C05770m c05770m, boolean z10) {
        super(c1400Xy, interfaceC1028Jh, str, c05770m, z10);
        this.A00 = uri;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05710f
    @Nullable
    public final EnumC05700e A0A() {
        if (A0F(this.A00)) {
            return null;
        }
        try {
            LZ.A0A(new LZ(), ((AbstractC05710f) this).A00, C1070La.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC05710f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            return EnumC05700e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1684dp
    public final void A0D() {
        EnumC05700e enumC05700e = null;
        if (((AbstractC1684dp) this).A02) {
            enumC05700e = A0A();
        }
        A0E(this.A01, enumC05700e);
    }
}
