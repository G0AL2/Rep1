package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.8K  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8K extends TW {
    public static byte[] A0E;
    public static String[] A0F = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;
    @Nullable
    public LinearLayout A02;
    public C1653dJ A03;
    public C7U A04;
    @Nullable
    public C2M A05;
    @Nullable
    public OV A06;
    public SB A07;
    @DoNotStrip
    public AbstractC1219Qv A08;
    public C1220Qw A09;
    public String A0A;
    public List<C1172Pa> A0B;
    public final C1400Xy A0C;
    public final MK A0D;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0F;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
            i13++;
        }
    }

    public static void A09() {
        A0E = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114};
    }

    static {
        A09();
        A0G = (int) (Lr.A00 * 48.0f);
        A0H = (int) (Lr.A00 * 8.0f);
        A0I = (int) (Lr.A00 * 8.0f);
        A0K = (int) (Lr.A00 * 56.0f);
        A0J = (int) (Lr.A00 * 12.0f);
    }

    public C8K(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, C7U c7u, InterfaceC1110Mq interfaceC1110Mq, C1653dJ c1653dJ) {
        super(c1400Xy, interfaceC1028Jh, interfaceC1110Mq, c1653dJ);
        this.A0D = new MK();
        this.A04 = c7u;
        this.A0C = c1400Xy;
    }

    private final void A0A() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2M c2m = this.A05;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A05 = null;
        }
        OV ov = this.A06;
        if (ov != null) {
            ov.removeAllViews();
            this.A06 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x011f, code lost:
        if (r5 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0121, code lost:
        r4.A0C.A09().AFP(r4.A05, ((com.facebook.ads.redexgen.X.TW) r4).A08.A0U(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0132, code lost:
        r4.A0U(r4.A02, false, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0137, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
        if (r5 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0B(int r18, @androidx.annotation.Nullable android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C8K.A0B(int, android.os.Bundle):void");
    }

    private void A0C(C1653dJ c1653dJ) {
        this.A03 = c1653dJ;
        this.A0A = this.A03.A0U();
        this.A00 = this.A03.A0H();
        this.A01 = this.A03.A0I();
        List<C1B> A0c = this.A03.A0c();
        this.A0B = new ArrayList(A0c.size());
        for (int i10 = 0; i10 < A0c.size(); i10++) {
            this.A0B.add(new C1172Pa(i10, A0c.size(), A0c.get(i10)));
        }
    }

    private void A0D(SB sb2) {
        new FA().A0G(this.A05);
        sb2.A0Z(new S0(this));
        this.A06 = new OV(this.A0C, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.TW
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void A8n(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        A0V(anonymousClass59);
        A0C((C1653dJ) intent.getSerializableExtra(A07(0, 14, 93)));
        A0B(anonymousClass59.A0H().getResources().getConfiguration().orientation, bundle);
        anonymousClass59.A0K(new C1249Rz(this, anonymousClass59));
        int A03 = super.A08.A0O().A0D().A03();
        if (A03 > 0) {
            A0T(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW, com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void ABj(boolean z10) {
        super.ABj(z10);
        SB sb2 = this.A07;
        if (sb2 != null) {
            sb2.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW, com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AC8(boolean z10) {
        super.AC8(z10);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AEI(Bundle bundle) {
        SB sb2 = this.A07;
        if (sb2 != null) {
            sb2.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AEI(bundle);
        A0A();
        A0B(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.TW, com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void onDestroy() {
        super.onDestroy();
        if (JR.A1I(this.A0C)) {
            this.A0C.A09().AFF(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0A.A8v(this.A0A, new OG().A03(this.A09).A02(this.A0D).A05());
        }
        A0A();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0D.A06(this.A0C, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
