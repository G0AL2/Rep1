package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class UX implements InterfaceC1028Jh {
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static InterfaceC1028Jh A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1399Xx A00;
    public final InterfaceC07899g A01;
    public final InterfaceC1027Jg A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, 31};
    }

    static {
        A03();
        A05 = UX.class.getSimpleName();
        A06 = false;
    }

    public UX(C1399Xx c1399Xx) {
        InterfaceC1026Jf A00;
        this.A00 = c1399Xx;
        if (JT.A0T(c1399Xx)) {
            this.A01 = C07879e.A00(c1399Xx);
            A00 = C1033Jm.A01(c1399Xx, this.A01);
        } else {
            E5 A01 = C07879e.A01(c1399Xx);
            A00 = C1033Jm.A00(c1399Xx, A01);
            this.A01 = A01;
        }
        this.A02 = new C1301Ua(c1399Xx, A00);
        MX.A08.execute(new UZ(this));
        A04(c1399Xx);
    }

    public static synchronized InterfaceC1028Jh A01(C1399Xx c1399Xx) {
        InterfaceC1028Jh interfaceC1028Jh;
        synchronized (UX.class) {
            if (A03 == null) {
                A03 = new UX(c1399Xx);
            }
            interfaceC1028Jh = A03;
        }
        return interfaceC1028Jh;
    }

    public static synchronized void A04(C1399Xx c1399Xx) {
        synchronized (UX.class) {
            if (A06) {
                return;
            }
            c1399Xx.A02().A9t();
            A06 = true;
        }
    }

    private void A05(C1025Je c1025Je) {
        if (!c1025Je.A0A()) {
            String str = A05;
            Log.e(str, A02(7, 29, 24) + c1025Je.A06() + A02(0, 7, 55));
            return;
        }
        A06(c1025Je);
        this.A01.AFi(c1025Je, new UY(this, c1025Je));
    }

    @SuppressLint({"ThrowException"})
    private void A06(C1025Je c1025Je) {
        switch (c1025Je.A06()) {
            case A0Q:
            case A0K:
            case A07:
            case A0J:
            case A0R:
            case A0T:
            case A0U:
                AnonymousClass90 anonymousClass90 = new AnonymousClass90(new Exception(A02(36, 5, 50)));
                anonymousClass90.A03(1);
                try {
                    anonymousClass90.A05(new JSONObject().put(A02(48, 4, 107), c1025Je.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A06().A8z(A02(41, 7, 50), C07828z.A1H, anonymousClass90);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A8q(String str, Map<String, String> map) {
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A8t(String str, Map<String, String> map) {
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A8u(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A07).A06(C1038Jr.A0A(str, EnumC1035Jo.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A8v(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A08).A06(C1038Jr.A0A(str, EnumC1035Jo.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A8x(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A91(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A93(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0D).A06(C1038Jr.A0A(str, EnumC1035Jo.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A94(String str, @Nullable Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A95(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0F).A06(C1038Jr.A0A(str, EnumC1035Jo.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A96(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0K).A06(C1038Jr.A0A(str, EnumC1035Jo.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A97(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0H).A06(C1038Jr.A0A(str, EnumC1035Jo.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A99(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A0J).A06(C1038Jr.A0A(str, EnumC1035Jo.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9B(String str, Map<String, String> map, String str2, EnumC1030Jj enumC1030Jj) {
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(enumC1030Jj).A02(EnumC1031Jk.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9C(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A0L).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9G(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0N).A06(C1038Jr.A0A(str, EnumC1035Jo.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9H(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0O).A06(C1038Jr.A0A(str, EnumC1035Jo.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9J(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A0P).A06(C1038Jr.A0A(str, EnumC1035Jo.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9L(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9M(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0Q).A06(C1038Jr.A0A(str, EnumC1035Jo.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9N(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A0U).A06(C1038Jr.A0A(str, EnumC1035Jo.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9O(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A04).A02(EnumC1031Jk.A0T).A06(C1038Jr.A0A(str, EnumC1035Jo.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9P(String str, Map<String, String> map) {
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void A9R(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1024Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC1030Jj.A05).A02(EnumC1031Jk.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1028Jh
    public final void ADD(String str) {
        new RM(this.A00).execute(str);
    }
}
