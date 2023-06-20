package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Xr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1393Xr implements InterfaceC07708l {
    public static byte[] A04;
    public static String[] A05 = {"D3PJ2GNcgNGI4MtKfCaHjqEOfdHoPcVQ", "EJL0aGmI3i0Imoz4UWgpTxwTxGm9WRxT", "tfWCUNw0WGkvc5ldnWfg2BDK3aY0ceq2", "VYnzwe", "FWw4Dif8pFGferaZg4Cc6MDYh6zRU5", "BYQArfMrHiqwTG3fAjpcYjBOCFZN2nO4", "ZJiZak5asVL", "k4pPkd4ODWsyAa7ylPFb6IMORyuDH4"};
    public Context A00;
    public final InterfaceC07698k A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    @Nullable
    public C07678i A01 = A00();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{107, Byte.MAX_VALUE, 96, 112, 124, 106, 123, 123, 102, 97, 104, 124, 112, 100, 106, 118};
    }

    static {
        A03();
    }

    public C1393Xr(Context context, InterfaceC07698k interfaceC07698k) {
        this.A00 = context;
        this.A02 = interfaceC07698k;
    }

    @Nullable
    private C07678i A00() {
        return C07678i.A00(C1063Kt.A00(this.A00).getString(A01(0, 16, 81), null));
    }

    private void A02() {
        this.A02.A9b(new C1394Xs(this));
    }

    public final void A04(@Nullable String[] strArr, @Nullable Integer num, @Nullable Integer num2) {
        C07678i c07678i = new C07678i(strArr, num, num2);
        if (c07678i.equals(this.A01)) {
            return;
        }
        this.A01 = c07678i;
        this.A03.set(true);
        SharedPreferences A00 = C1063Kt.A00(this.A00);
        if (A05[2].charAt(16) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "txsFPtaRD11LyA3dzoyK5U0Vbdrctz";
        strArr2[4] = "NLpqiEYsaOJ6LGl2A1qehjxsg53G43";
        A00.edit().putString(A01(0, 16, 81), this.A01.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07708l
    @Nullable
    public final C07678i A6K() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07708l
    public final boolean A8d() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0X = JR.A0X(this.A00);
        String A07 = this.A01.A07();
        for (String str : A0X) {
            if (A07.contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07708l
    public final boolean AEm() {
        A02();
        return this.A03.getAndSet(false);
    }
}
