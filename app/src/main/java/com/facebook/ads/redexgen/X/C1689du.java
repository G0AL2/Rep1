package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.du  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1689du implements C0R {
    public static byte[] A07;
    public static String[] A08 = {"nHMpSWMsnsV7ze4k7TMdpo8w7eAhh5yl", "NZIGXtqvLJqJvnsqDFZQPtZx", "Ad1TvQCscaWcF7stMWLl9lRlqQAvL", "Ujq4dS9mEeqxvShJwD8UISSMYbM", "6D9", "oL3lqgBhSNj2gXyheQdgS3kbnnn96fNg", "3X2AVVUyUAfxSvaFg1Rh03BQkiDduKF9", "x5OfLFoNyht1tsSSgvPC5bYcCNR"};
    public final C1687ds A00;
    public final AtomicReference<String> A05 = new AtomicReference<>();
    public final AtomicReference<String> A04 = new AtomicReference<>();
    public final AtomicReference<String> A03 = new AtomicReference<>();
    public final AtomicReference<EnumC05680c> A06 = new AtomicReference<>();
    public final UUID A01 = UUID.randomUUID();
    public final AtomicInteger A02 = new AtomicInteger(1);

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{5, 22, 13, 13, 6, 15, 60, 109, 126, 101, 101, 110, 103, 84, 120, 110, 122};
        String[] strArr = A08;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A08[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
    }

    static {
        A01();
    }

    public C1689du(C1687ds c1687ds) {
        this.A00 = c1687ds;
    }

    private void A02(int i10, String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(0, 7, 60) + C0X.A0N.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().A9D(i10, jSONObject);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    private final void A03(JSONObject jSONObject) {
        if (L0.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(7, 10, 84), this.A02.getAndIncrement());
            } catch (Throwable th) {
                String placementType = A08[2];
                if (placementType.length() != 29) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[7] = "UnqhnC2RP1s6q9DMOMPvS7zFM4J";
                strArr[3] = "fX0qBiaLsOBwY7ffp1ojH1RHxSy";
                L0.A00(th, this);
                return;
            }
        } catch (JSONException unused) {
        }
        C0X.A0E.A04(this.A01).A02(jSONObject);
        String str = this.A05.get();
        if (!TextUtils.isEmpty(str)) {
            C0X.A0Q.A04(str).A02(jSONObject);
        }
        String str2 = this.A04.get();
        if (!TextUtils.isEmpty(str2)) {
            C0X.A0P.A04(str2).A02(jSONObject);
        }
        String str3 = this.A03.get();
        if (!TextUtils.isEmpty(str3)) {
            C0X.A0O.A04(str3).A02(jSONObject);
        }
        EnumC05680c enumC05680c = this.A06.get();
        if (enumC05680c != null) {
            C0X.A0D.A04(enumC05680c).A02(jSONObject);
        }
    }

    public final void A04(C0T c0t, C0W... c0wArr) {
        if (L0.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0W c0w : c0wArr) {
                c0w.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().A90(c0t, jSONObject);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2Q(String str, int i10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0R, C0X.A0G.A04(Integer.valueOf(i10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2R(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0S, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2S(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0T, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2T(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0U, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2U(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0V, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2V(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0W, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2W(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0X, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2X() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0i, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2Y() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0v, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2Z(boolean z10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0Z, C0X.A01.A04(Boolean.valueOf(z10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2a(long j10, int i10, String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0x, C0X.A0F.A04(Integer.valueOf(i10)), C0X.A0L.A04(str), C0X.A0J.A04(Long.valueOf(j10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2b() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0z, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2c() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0y, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2d() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A10, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2e(long j10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A11, C0X.A0J.A04(Long.valueOf(j10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2f(C0Q c0q) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A25, C0X.A00.A04(c0q));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2g(String str, String str2) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A04.set(str);
            this.A03.set(str2);
            A04(C0T.A0a, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2h() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0b, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2i() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0c, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2j(long j10, int i10, @Nullable String str, boolean z10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0d, C0X.A0J.A04(Long.valueOf(j10)), C0X.A0F.A04(Integer.valueOf(i10)), C0X.A0L.A04(str), C0X.A09.A04(Boolean.valueOf(z10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2k(long j10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0e, C0X.A0J.A04(Long.valueOf(j10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2l(boolean z10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A18, C0X.A0C.A04(Boolean.valueOf(z10)));
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2m() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A19, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2n(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1D, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2o() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1E, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2p() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1F, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2q() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1G, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2r(int i10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1H, C0X.A0G.A04(Integer.valueOf(i10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2s() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1I, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2t() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1L, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2u() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1J, new C0W[0]);
        } catch (Throwable th) {
            if (A08[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            A08[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2v(int i10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1K, C0X.A0G.A04(Integer.valueOf(i10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2w() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1M, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2x(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1N, C0X.A0N.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2y() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1O, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2z() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1P, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A30() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1Q, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A31() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1R, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A32(int i10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1S, C0X.A0G.A04(Integer.valueOf(i10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A33() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1T, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A34(int i10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1U, C0X.A0G.A04(Integer.valueOf(i10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A35() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A27, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[4].length() != 3) {
                throw new RuntimeException();
            }
            A08[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A36() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A28, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A37(C0Q c0q) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A24, C0X.A00.A04(c0q));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A38(int i10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A26, C0X.A0H.A04(Integer.valueOf(i10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A39() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A29, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A3v(long j10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0g, C0X.A0J.A04(Long.valueOf(j10)));
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A08[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A3w(long j10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0h, C0X.A0J.A04(Long.valueOf(j10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A41() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0j, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4W() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0k, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4X() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0o, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4Y(boolean z10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0f, C0X.A08.A04(Boolean.valueOf(z10)));
        } catch (Throwable th) {
            if (A08[1].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4Z(int i10, String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0p, C0X.A0F.A04(Integer.valueOf(i10)), C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4a(boolean z10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0n, C0X.A03.A04(Boolean.valueOf(z10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4b() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0r, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4c() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0s, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4d() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0t, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4e() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0u, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4u() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1Y, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4v(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1Z, C0X.A0N.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4w() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1a, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4x() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1b, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4y() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1c, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4z(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1d, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A50(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1e, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A51(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1f, C0X.A0N.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A52(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1h, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A53() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1i, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A54(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1j, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A55(long j10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1k, C0X.A0J.A04(Long.valueOf(j10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A56(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1l, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A88() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1m, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A89(boolean z10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1n, C0X.A07.A04(Boolean.valueOf(z10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8A() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1o, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8B(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1p, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8C() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1q, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8D() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1r, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8E(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1s, C0X.A0M.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8w(int i10, String str) {
        if (L0.A02(this) || i10 < 11000 || i10 > 11099) {
            return;
        }
        try {
            A02(i10, str);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9c(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A12, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9d(int i10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A13, C0X.A0H.A04(Integer.valueOf(i10)));
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[4].length() != 3) {
                throw new RuntimeException();
            }
            A08[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9e() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1v, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9f() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1w, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9g() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1x, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9i() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A14, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[5].charAt(28) == 'u') {
                throw new RuntimeException();
            }
            A08[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void ADk(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A16, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void ADl() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A17, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AEh(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A05.set(str);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AEj(EnumC05680c enumC05680c) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A06.set(enumC05680c);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFN() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1B, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFO() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1V, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFS() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2A, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFT(int i10, String str) {
        if (L0.A02(this) || i10 < 12000 || i10 > 12099) {
            return;
        }
        try {
            A02(i10, str);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFU() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2B, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFV() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2C, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFW() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2D, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFX(boolean z10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2E, C0X.A02.A04(Boolean.valueOf(z10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFY() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2F, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFZ() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2G, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFa(int i10, @Nullable String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2H, C0X.A0F.A04(Integer.valueOf(i10)), C0X.A0L.A04(str));
        } catch (Throwable th) {
            if (A08[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A08[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFb(boolean z10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2I, C0X.A06.A04(Boolean.valueOf(z10)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFc() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2J, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFd(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2K, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFe(int i10, String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2L, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[7] = "5qwGvT3tjlGxlYjcZrXYRuOycIv";
            strArr[3] = "UEyDz1QZjBltnQnS2IeC3S3ns7y";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFf() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2M, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFg(int i10) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2N, C0X.A0I.A04(Integer.valueOf(i10)));
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFl(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1W, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFm(String str) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1X, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[1].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final String getId() {
        if (L0.A02(this)) {
            return null;
        }
        try {
            return this.A01.toString();
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void unregisterView() {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1A, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
