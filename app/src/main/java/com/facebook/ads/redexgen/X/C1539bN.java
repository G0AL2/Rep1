package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.bN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1539bN implements InterfaceC06995h {
    public static byte[] A02;
    public static final String A03;
    public final InterfaceC07025k A00;
    public final C7U A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, 15, 93, 35, 69, 56, 63, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, 13, -13, -8, 70, 25, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, 63, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, 12, 9, 12, 13, 21, 12};
    }

    static {
        A02();
        A03 = C1539bN.class.getSimpleName();
    }

    public C1539bN(InterfaceC07025k interfaceC07025k, C1399Xx c1399Xx) {
        this.A00 = interfaceC07025k;
        this.A00.A3D(new C1541bP(this));
        this.A01 = new C7U(c1399Xx);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A5j().size()));
        }
        for (InterfaceC07055n interfaceC07055n : this.A00.A5j()) {
            int i10 = C07015j.A00[interfaceC07055n.A7j().ordinal()];
            if (i10 == 1) {
                A04(interfaceC07055n.getUrl());
            } else if (i10 == 2) {
                A06(interfaceC07055n.getUrl());
            } else if (i10 == 3) {
                A05(interfaceC07055n.getUrl());
            }
        }
        this.A01.A0W(new C1540bO(this), new C7N(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C7S c7s = new C7S(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c7s.A01 = A00(117, 8, 90);
        this.A01.A0b(c7s);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C7Q c7q = new C7Q(str, A00(81, 36, 11), A00(125, 7, 46));
        c7q.A04 = true;
        c7q.A02 = A00(117, 8, 90);
        this.A01.A0X(c7q);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C7Q c7q = new C7Q(str, A00(81, 36, 11), A00(125, 7, 46));
        c7q.A04 = false;
        c7q.A02 = A00(117, 8, 90);
        this.A01.A0a(c7q);
    }
}
