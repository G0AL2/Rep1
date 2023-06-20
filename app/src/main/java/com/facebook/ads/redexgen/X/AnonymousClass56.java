package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.56 */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass56 {
    public static byte[] A04;
    public static String[] A05 = {"3Lm1xoiqmVz", "7", "e", "S", "b9tO4", "WiIyJoqu6MmGONLqJ4ol82uO906afJVw", "5gKa3hz9VQf", "ZFmxpCIwvmg"};
    public final Intent A00;
    public final AnonymousClass59 A01;
    public final C1400Xy A02;
    public final InterfaceC1028Jh A03;

    public static String A0O(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A04 = new byte[]{51, 54, 13, 54, 51, 38, 51, 13, 48, 39, 60, 54, 62, 55, 18, 29, 8, 21, 10, 25, 61, 24, 56, 29, 8, 29, 62, 9, 18, 24, 16, 25, 73, 94, 76, 90, 73, 95, 94, 95, 109, 82, 95, 94, 84, 122, 95, Byte.MAX_VALUE, 90, 79, 90, 121, 78, 85, 95, 87, 94, 69, 90, 87, 86, 92, 108, 71, 90, 94, 86, 108, 67, 92, 95, 95, 90, 93, 84, 108, 90, 93, 71, 86, 65, 69, 82, 95};
    }

    static {
        A0P();
    }

    public AnonymousClass56(AnonymousClass59 anonymousClass59, Intent intent, InterfaceC1028Jh interfaceC1028Jh, C1400Xy c1400Xy) {
        this.A01 = anonymousClass59;
        this.A00 = intent;
        this.A03 = interfaceC1028Jh;
        this.A02 = c1400Xy;
    }

    private C1653dJ A00() {
        return (C1653dJ) this.A00.getSerializableExtra(A0O(0, 14, 29));
    }

    public InterfaceC1111Mr A02() {
        AnonymousClass59 anonymousClass59 = this.A01;
        return new C1278Td(anonymousClass59, this.A02, this.A03, new C1570bs(anonymousClass59));
    }

    public InterfaceC1111Mr A03() {
        return new A2(this.A02, this.A03, new C1570bs(this.A01), A00(), new TL(), 1);
    }

    public InterfaceC1111Mr A04() {
        return new A2(this.A02, this.A03, new C1570bs(this.A01), (C1649dF) this.A00.getSerializableExtra(A0O(32, 25, 116)), new TK(), 0);
    }

    public InterfaceC1111Mr A05() {
        AnonymousClass18 anonymousClass18 = (AnonymousClass18) this.A00.getSerializableExtra(A0O(14, 18, 51));
        if (anonymousClass18 == null) {
            return null;
        }
        String A0Z = anonymousClass18.A0Z();
        String[] strArr = A05;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "1M84Q";
        strArr2[6] = "leaDHdAWfWg";
        PA A02 = PB.A02(A0Z);
        if (A02 == null) {
            return null;
        }
        return new C1251Sb(this.A02, new C1570bs(this.A01), A02);
    }

    public InterfaceC1111Mr A06() {
        if (JR.A21(this.A02)) {
            C1400Xy c1400Xy = this.A02;
            return new C8L(c1400Xy, this.A03, new C7U(c1400Xy), new C1570bs(this.A01), A00());
        }
        C1400Xy c1400Xy2 = this.A02;
        return new C8K(c1400Xy2, this.A03, new C7U(c1400Xy2), new C1570bs(this.A01), A00());
    }

    public InterfaceC1111Mr A07() {
        return new C9D(this.A02, new TL(), this.A03, A00(), new C7U(this.A02), new C1570bs(this.A01));
    }

    public InterfaceC1111Mr A08() {
        return new TO(this.A02, this.A03, new C1570bs(this.A01), A00(), null, new TL());
    }

    public InterfaceC1111Mr A09() {
        return new C8N(this.A02, new TL(), this.A03, A00(), new C7U(this.A02), new C1570bs(this.A01));
    }

    public InterfaceC1111Mr A0A() {
        return new C8N(this.A02, new TK(), this.A03, (C1649dF) this.A00.getSerializableExtra(A0O(32, 25, 116)), new C7U(this.A02), new F7(this.A01));
    }

    public InterfaceC1111Mr A0B() {
        C1649dF c1649dF = (C1649dF) this.A00.getSerializableExtra(A0O(32, 25, 116));
        return new TO(this.A02, this.A03, new F7(this.A01), c1649dF, c1649dF.A0a(), new TK());
    }

    public InterfaceC1111Mr A0C(RelativeLayout relativeLayout) {
        TM tm = new TM(this.A02, new C1569br(this), this.A03, new C1570bs(this.A01));
        tm.A05(relativeLayout);
        tm.A04(this.A00.getIntExtra(A0O(57, 27, 124), 200));
        MS.A0M(relativeLayout, -16777216);
        return tm;
    }
}
