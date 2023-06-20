package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import java.util.Arrays;
import java.util.HashMap;

@SuppressLint({"ViewConstructor"})
/* loaded from: assets/audience_network.dex */
public final class A1 extends FrameLayout implements SW {
    public static byte[] A0A;
    public static String[] A0B = {"gR8VXB3ia", "OJTiurBFiCqcREvzh7o4PkhSqDGudpIq", "iaBHwIBC1utH6CwOSIC2yyAu4ZYXfJ61", "YdU4", "YcTfP9iPeB3iMp", "vsmHP1kkKyGC9kag", "2EZKw0n31g6TC4", "KAWIkc2sX"};
    public C1220Qw A00;
    @DynamicWebViewController$AdFormatType
    public final int A01;
    public final AnonymousClass18 A02;
    public final C1400Xy A03;
    public final InterfaceC1028Jh A04;
    public final MK A05;
    public final InterfaceC1171Oz A06;
    public final PA A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{118, 84, 91, 18, 65, 21, 70, 65, 84, 71, 65, 21, 116, 64, 81, 92, 80, 91, 86, 80, 123, 80, 65, 66, 90, 71, 94, 116, 86, 65, 92, 67, 92, 65, 76, 27, 21, 120, 84, 94, 80, 21, 70, 64, 71, 80, 21, 65, 93, 84, 65, 21, 92, 65, 18, 70, 21, 92, 91, 21, 76, 90, 64, 71, 21, 116, 91, 81, 71, 90, 92, 81, 120, 84, 91, 92, 83, 80, 70, 65, 27, 77, 88, 89, 21, 83, 92, 89, 80, 27, 30, 26, 25, 45, 60, 49, 61, 54, 59, 61, 22, 61, 44, 47, 55, 42, 51, 54, 57, 8, 54, 52, 35, 62, 33, 62, 35, 46, 64, 79, 90, 71, 88, 75, 111, 74, 106, 79, 90, 79, 108, 91, 64, 74, 66, 75, 47, 48, 60, 46, 13, 32, 41, 60};
    }

    static {
        A02();
    }

    public A1(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i10) {
        this(c1400Xy, interfaceC1028Jh, null, anonymousClass18, str, i10, null);
    }

    public A1(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1171Oz interfaceC1171Oz, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i10, MK mk) {
        super(c1400Xy);
        this.A03 = c1400Xy;
        this.A04 = interfaceC1028Jh;
        this.A02 = anonymousClass18;
        this.A08 = str;
        this.A06 = interfaceC1171Oz;
        this.A01 = i10;
        if (this.A01 == 3) {
            this.A07 = new PA(this.A03, anonymousClass18, interfaceC1028Jh, i10);
            this.A09 = false;
        } else {
            PA A02 = PB.A02(anonymousClass18.A0Z());
            if (A02 != null) {
                this.A07 = A02;
                this.A09 = true;
            } else {
                this.A07 = new PA(this.A03, anonymousClass18, interfaceC1028Jh, i10);
                PB.A03(anonymousClass18, this.A07);
                this.A09 = false;
            }
        }
        if (mk != null) {
            this.A05 = mk;
            this.A07.A0Z(mk);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C1253Sd(this));
        this.A07.A0a(interfaceC1171Oz);
        EnumC1090Lw.A04(this, EnumC1090Lw.A0A);
        if (JR.A1I(c1400Xy)) {
            c1400Xy.A09().AFR(this.A07.A0O(), anonymousClass18.A0U(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0D().A4w();
            this.A07.A0X();
        } else {
            this.A03.A0D().A4x();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "EW3rEVX7vA8fzU";
            strArr2[4] = "ztAtYR2DvpL08d";
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    InterfaceC1171Oz interfaceC1171Oz = this.A06;
                    if (interfaceC1171Oz != null) {
                        interfaceC1171Oz.AAf(this);
                    }
                    if (JR.A1I(this.A03)) {
                        this.A03.A09().AAT();
                    }
                } else {
                    AF2();
                }
            }
        }
        A08();
    }

    private final void A04() {
        PA.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AnonymousClass18 anonymousClass18) {
        intent.putExtra(A01(136, 8, 40), EnumC1061Kq.A04);
        intent.putExtra(A01(118, 18, 95), anonymousClass18);
        intent.addFlags(268435456);
    }

    @SuppressLint({"CatchGeneralException"})
    private final void A06(AnonymousClass18 anonymousClass18) {
        AdActivityIntent A04 = LN.A04(this.A03);
        A05(A04, anonymousClass18);
        try {
            LN.A09(this.A03, A04);
        } catch (Exception e10) {
            this.A03.A06().A8y(A01(107, 11, 38), C07828z.A0D, new AnonymousClass90(e10));
            Log.e(A01(90, 17, 41), A01(0, 90, 68), e10);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new ON(this.A03, this.A08, this.A00, this.A05, this.A04).A08(this.A02.A0U(), str, new HashMap());
    }

    public final void A08() {
        MS.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A7w() {
        A07(this.A02.A0O().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A7x(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A81() {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A8h() {
        new Handler(Looper.getMainLooper()).post(new C1252Sc(this));
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AAr() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AAv() {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ABZ(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ACK() {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ACn(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ACp(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AD2(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AF2() {
        InterfaceC1171Oz interfaceC1171Oz = this.A06;
        if (interfaceC1171Oz != null) {
            interfaceC1171Oz.AAf(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void close() {
    }

    public InterfaceC1028Jh getAdEventManager() {
        return this.A04;
    }

    public PA getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C1220Qw c1220Qw) {
        this.A00 = c1220Qw;
        this.A07.A0e(c1220Qw);
    }
}
