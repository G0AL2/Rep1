package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.65  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass65 {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final AnonymousClass66 A00;
    public final AnonymousClass67 A01;
    public final C1399Xx A02;
    public final RR A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = AnonymousClass65.class.getSimpleName();
    }

    public AnonymousClass65(C1399Xx c1399Xx, GU gu, AnonymousClass66 anonymousClass66, AnonymousClass67 anonymousClass67) {
        this.A02 = c1399Xx;
        this.A03 = gu.A4O(RS.A06);
        this.A00 = anonymousClass66;
        this.A01 = anonymousClass67;
        this.A03.A3F(new C1533bH(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (L0.A02(this)) {
            return;
        }
        if (!this.A03.A8c()) {
            this.A02.A03().A8P();
            return;
        }
        String optString = this.A03.A6J().optString(A00(0, 9, 62));
        if (!TextUtils.isEmpty(optString)) {
            this.A00.A04(this.A02, optString);
            if (!A04 || JR.A0g(this.A02)) {
                A04 = true;
                this.A01.A07();
            }
        }
    }
}
