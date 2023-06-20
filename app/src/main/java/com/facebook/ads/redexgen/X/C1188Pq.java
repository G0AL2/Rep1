package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Pq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1188Pq {
    public final AnonymousClass19 A00;
    public final C1I A01;
    public final C1M A02;
    public final C1U A03;
    public final C1400Xy A04;
    public final C1036Jp A05;
    public static String[] A06 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A09 = (int) (Lr.A00 * 4.0f);
    public static final int A07 = (int) (Lr.A00 * 72.0f);
    public static final int A08 = (int) (Lr.A00 * 8.0f);

    public C1188Pq(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, AnonymousClass18 anonymousClass18) {
        this.A04 = c1400Xy;
        this.A05 = new C1036Jp(anonymousClass18.A0U(), interfaceC1028Jh);
        this.A00 = anonymousClass18.A0N();
        this.A01 = anonymousClass18.A0O().A0E();
        this.A03 = anonymousClass18.A0R();
        this.A02 = anonymousClass18.A0O().A0G();
    }

    private View A00() {
        F9 f92 = new F9(this.A04);
        f92.setLayoutManager(new C1588cB(this.A04, 0, false));
        f92.setAdapter(new C1245Rv(this.A04, this.A02.A00(), A09));
        return f92;
    }

    private View A01(@Nullable T1 t12) {
        C1148Oc c1148Oc = new C1148Oc(this.A04, this.A00.A01(), true, false, false);
        c1148Oc.A01(this.A01.A06(), this.A01.A01(), null, false, true);
        c1148Oc.setAlignment(17);
        OW ow = new OW(this.A04);
        MS.A0M(ow, 0);
        ow.setRadius(50);
        new T3(ow, this.A04).A04().A07(this.A03.A01());
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i10 = A07;
        linearLayout.addView(ow, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = A08;
        layoutParams.setMargins(0, i11, 0, i11);
        linearLayout.addView(c1148Oc, layoutParams);
        if (t12 != null) {
            MS.A0J(t12);
            linearLayout.addView(t12, layoutParams);
            if (TextUtils.isEmpty(t12.getText())) {
                MS.A0H(t12);
            }
        }
        return linearLayout;
    }

    private final EnumC1187Pp A02() {
        if (!this.A02.A00().isEmpty()) {
            return EnumC1187Pp.A04;
        }
        EnumC1187Pp enumC1187Pp = EnumC1187Pp.A03;
        String[] strArr = A06;
        if (strArr[3].charAt(8) != strArr[7].charAt(8)) {
            A06[4] = "qwlEjiYhEcV8j1J";
            return enumC1187Pp;
        }
        throw new RuntimeException();
    }

    public final Pair<EnumC1187Pp, View> A03(@Nullable T1 t12) {
        View A00;
        EnumC1187Pp A02 = A02();
        if (C1186Po.A00[A02.ordinal()] != 1) {
            A00 = A01(t12);
        } else {
            A00 = A00();
        }
        C1038Jr.A04(A00, this.A05, EnumC1035Jo.A0S);
        return new Pair<>(A02, A00);
    }
}
