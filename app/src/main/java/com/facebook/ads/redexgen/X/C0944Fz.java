package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0944Fz extends AbstractC1684dp {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0944Fz.class.getSimpleName();
    }

    public C0944Fz(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str, Uri uri, Map<String, String> map, @Nullable C05770m c05770m, boolean z10) {
        super(c1400Xy, interfaceC1028Jh, str, c05770m, z10);
        this.A00 = uri;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05710f
    @Nullable
    public final EnumC05700e A0A() {
        try {
            LZ.A09(new LZ(), ((AbstractC05710f) this).A00, C1070La.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC05710f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
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
