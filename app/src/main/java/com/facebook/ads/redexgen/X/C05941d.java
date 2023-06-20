package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05941d {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    @Nullable
    public C7U A00;
    public OH A01 = OH.A06;
    @Nullable
    @DoNotStrip
    public PA A02;
    public final C1653dJ A03;
    public final InterfaceC05931c A04;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -53, -48, -42, -57, -44, -43, -42, -53, -42, -53, -61, -50};
    }

    static {
        A07();
    }

    public C05941d(C1400Xy c1400Xy, C06071q c06071q, InterfaceC05931c interfaceC05931c, @Nullable String str) {
        this.A03 = A02(c1400Xy, c06071q, str, c06071q.A03());
        this.A04 = interfaceC05931c;
    }

    @Nullable
    private AdError A00(C1400Xy c1400Xy) {
        if (this.A03.A0c().isEmpty()) {
            c1400Xy.A06().A8y(A06(62, 3, 18), C07828z.A0Z, new AnonymousClass90(A06(5, 43, 6)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static C1653dJ A02(C1400Xy c1400Xy, C06071q c06071q, @Nullable String str, JSONObject jSONObject) {
        C1653dJ adDataBundle = C1653dJ.A01(jSONObject, c1400Xy);
        adDataBundle.A0i(str);
        C9I A01 = c06071q.A01();
        if (A01 != null) {
            adDataBundle.A0e(A01.A06());
        }
        return adDataBundle;
    }

    private C7U A04(C1400Xy c1400Xy) {
        C7U c7u = this.A00;
        return c7u != null ? c7u : new C7U(c1400Xy);
    }

    private void A08(C1400Xy c1400Xy) {
        C1W A062 = this.A03.A0O().A0D().A06();
        A0A(A062 != null ? A062.A0A() : OH.A06);
        C1644dA c1644dA = new C1644dA(this);
        C7U c7u = new C7U(c1400Xy);
        boolean z10 = JR.A1U(c1400Xy) && C06985g.A0A(this.A03.A0d());
        String[] strArr = A06;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "rsw451NGt86";
        strArr2[2] = "Yd4DtCWl7E1Fg10XBidxjBNo2K";
        if (z10) {
            C06985g c06985g = new C06985g(c7u, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z10, new C1643d9(this));
            C1036Jp funnelLoggingHandler = new C1036Jp(this.A03.A0U(), c1400Xy.A08());
            c7u.A0d(funnelLoggingHandler);
            c06985g.A0B();
            return;
        }
        C1653dJ c1653dJ = this.A03;
        String[] strArr3 = A06;
        if (strArr3[1].charAt(24) != strArr3[0].charAt(24)) {
            C06041n.A02(c1400Xy, c1653dJ, true, c1644dA);
            return;
        }
        String[] strArr4 = A06;
        strArr4[6] = "NvwaqOE8NtZ";
        strArr4[2] = "Mi75BUZiVIPk9FHJPOQQgiG4jh";
        C06041n.A02(c1400Xy, c1653dJ, true, c1644dA);
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x00c9 */
    /* JADX WARN: Incorrect condition in loop: B:21:0x0112 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(com.facebook.ads.redexgen.X.C1400Xy r21, java.util.EnumSet<com.facebook.ads.CacheFlag> r22) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05941d.A09(com.facebook.ads.redexgen.X.Xy, java.util.EnumSet):void");
    }

    private void A0A(OH oh) {
        this.A01 = oh;
    }

    public final AnonymousClass18 A0B() {
        return this.A03;
    }

    public final EnumC1061Kq A0C() {
        if (this.A03.A0r()) {
            return EnumC1061Kq.A03;
        }
        int size = this.A03.A0c().size();
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (size > 1) {
                return EnumC1061Kq.A07;
            }
            if (this.A03.A0O().A0D().A06() != null) {
                EnumC1061Kq enumC1061Kq = EnumC1061Kq.A09;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return enumC1061Kq;
                }
            } else if (A0I()) {
                EnumC1061Kq enumC1061Kq2 = EnumC1061Kq.A0A;
                String[] strArr3 = A06;
                if (strArr3[6].length() != strArr3[2].length()) {
                    A06[3] = "JH";
                    return enumC1061Kq2;
                }
                throw new RuntimeException();
            } else {
                EnumC1061Kq enumC1061Kq3 = EnumC1061Kq.A08;
                if (A06[3].length() == 32) {
                    A06[3] = "ySAy4b6nQ";
                    return enumC1061Kq3;
                }
                String[] strArr4 = A06;
                strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                return enumC1061Kq3;
            }
        }
        throw new RuntimeException();
    }

    public final OH A0D() {
        return this.A01;
    }

    public final String A0E() {
        return this.A03.A0U();
    }

    public final void A0F() {
        this.A04.AFH();
    }

    public final void A0G(Intent intent, RewardData rewardData, String str) {
        this.A03.A0g(rewardData);
        this.A03.A0k(str);
        intent.putExtra(A06(48, 14, 94), this.A03);
    }

    public final void A0H(C1400Xy c1400Xy, EnumSet<CacheFlag> enumSet) {
        AdError A00 = A00(c1400Xy);
        if (A00 != null) {
            this.A04.A9u(A00);
            return;
        }
        this.A04.ADj();
        if (A0C() == EnumC1061Kq.A09) {
            A08(c1400Xy);
        } else {
            A09(c1400Xy, enumSet);
        }
    }

    public final boolean A0I() {
        return !TextUtils.isEmpty(this.A03.A0O().A0D().A08());
    }

    public final boolean A0J() {
        return this.A03.A0o();
    }
}
