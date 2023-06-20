package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class A2 extends FrameLayout implements InterfaceC1111Mr, SW {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public AnonymousClass57 A00;
    @Nullable
    public AnonymousClass59 A01;
    @Nullable
    public PK A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass18 A06;
    public final C1400Xy A07;
    public final InterfaceC1028Jh A08;
    public final C1036Jp A09;
    public final MF A0A;
    public final MK A0B;
    public final InterfaceC1110Mq A0C;
    public final NI A0D;
    @Nullable
    public final P2 A0E;
    public final PA A0F;
    @DoNotStrip
    public final AbstractC1219Qv A0G;
    public final C1220Qw A0H;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, 11, 4, 12, 17, 8, 7, 2, 4, 7, -95, -90, -97, -89, -84, -93, -94, -99, -97, -94, -99, -89, -84, -94, -93, -74, -107, -102, -109, -101, -96, -105, -106, -111, -109, -106, -111, -90, -95, -90, -109, -98, -115, -110, -117, -109, -104, -113, -114, -119, -98, -109, -105, -113, -119, -99, -102, -113, -104, -98};
    }

    static {
        A0D();
    }

    public A2(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1110Mq interfaceC1110Mq, AnonymousClass18 anonymousClass18, NI ni, @DynamicWebViewController$AdFormatType int i10) {
        super(c1400Xy);
        this.A00 = new C1259Sj(this);
        this.A0G = new C1258Si(this);
        this.A03 = true;
        this.A07 = c1400Xy;
        this.A08 = interfaceC1028Jh;
        this.A0C = interfaceC1110Mq;
        this.A06 = anonymousClass18;
        this.A0D = ni;
        PA A02 = PB.A02(anonymousClass18.A0Z());
        if (A02 == null) {
            this.A0F = new PA(this.A07, anonymousClass18, interfaceC1028Jh, i10);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new C1257Sh(this));
        MS.A0G(1003, this.A0F.A0O());
        if (this.A06.A0o()) {
            C1400Xy c1400Xy2 = this.A07;
            this.A0E = new P2(c1400Xy2, this.A08, this.A06, new C7U(c1400Xy2), this.A09, this.A0C, this.A0D, new C1256Sg(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new View$OnTouchListenerC1170Oy(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C1220Qw(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0H());
        this.A0H.A0X(this.A06.A0I());
        this.A0F.A0e(this.A0H);
        this.A0A = new MF(this);
        this.A0A.A05(ME.A03);
        setBackgroundColor(0);
        if (JR.A1I(c1400Xy)) {
            c1400Xy.A09().AFR(mediaView, anonymousClass18.A0U(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A0q = anonymousClass18.A0q();
            String A0B = A0B(68, 18, 1);
            String A0B2 = A0B(36, 16, 21);
            String A0B3 = A0B(52, 16, 9);
            String A0B4 = A0B(26, 10, 122);
            if (!A0q) {
                if (C1071Lb.A05(anonymousClass18.A0X())) {
                    jSONObject.put(A0B4, true);
                    jSONObject.put(A0B3, 2);
                    jSONObject.put(A0B2, 1);
                    jSONObject.put(A0B, this.A06.A0L());
                }
            } else {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 0);
                jSONObject.put(A0B, this.A06.A0L());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            PA preloadedDynamicWebViewController = this.A0F;
            preloadedDynamicWebViewController.A0M().A04(C07828z.A15, A0B(0, 26, 58));
        }
    }

    private void A0C() {
        PR A0B = new PP(this.A07, this.A06.A0O().A0E(), this.A06.A0R()).A08(this.A06.A0N().A01()).A0B();
        addView(A0B, new FrameLayout.LayoutParams(-1, -1));
        A0B.A04(new C1254Se(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0D().A4w();
            this.A0F.A0X();
        } else {
            this.A07.A0D().A4x();
            if (this.A0F.A0k()) {
                AF2();
                C1400Xy c1400Xy = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[5] = "8j5uXfZ95rl8UwGJAIvPTgfy7qu4v9pG";
                if (JR.A1I(c1400Xy)) {
                    this.A07.A09().AAT();
                }
            }
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0p()) {
            this.A0A.A05(ME.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new ON(this.A07, this.A0D.A64(), this.A0H, this.A0B, this.A08, this.A0C).A08(this.A06.A0U(), str, new HashMap());
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A7w() {
        A0F(this.A06.A0O().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A7x(String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A81() {
        this.A0C.A3s(this.A0D.A5a());
        new C1189Pr(this.A07, this.A0D, this.A06.A0a(), this.A0C).A05();
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A8h() {
        new Handler(Looper.getMainLooper()).post(new C1255Sf(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void A8n(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        PA.A0B().incrementAndGet();
        anonymousClass59.A0K(this.A00);
        this.A01 = anonymousClass59;
        A0E();
        if (this.A06.A0O().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AAr() {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AAv() {
        P2 p22 = this.A0E;
        if (p22 != null) {
            p22.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ABZ(boolean z10) {
        P2 p22 = this.A0E;
        if (p22 != null) {
            p22.A0R(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void ABj(boolean z10) {
        P2 p22 = this.A0E;
        if (p22 != null) {
            p22.A0S(z10);
        }
        if (z10) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AC8(boolean z10) {
        P2 p22 = this.A0E;
        if (p22 != null) {
            p22.A0T(z10);
        }
        boolean z11 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z11) {
            this.A03 = false;
        } else if (z10) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ACK() {
        P2 p22 = this.A0E;
        if (p22 != null) {
            p22.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ACn(boolean z10) {
        P2 p22 = this.A0E;
        if (p22 != null) {
            p22.A0U(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ACp(boolean z10) {
        P2 p22 = this.A0E;
        if (p22 != null) {
            p22.A0V(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AD2(String str) {
        String A0b = this.A06.A0b(str);
        if (A0b == null) {
            return;
        }
        LZ.A0E(new LZ(), this.A07, C1070La.A00(A0b), this.A06.A0U());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AF2() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void close() {
        AnonymousClass59 anonymousClass59 = this.A01;
        if (anonymousClass59 == null) {
            return;
        }
        anonymousClass59.finish(4);
    }

    private ViewGroup getMediaView() {
        P2 p22 = this.A0E;
        return p22 != null ? p22 : this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void onDestroy() {
        if (JR.A1I(this.A07)) {
            this.A07.A09().AFF(getMediaView());
        }
        P2 p22 = this.A0E;
        if (p22 != null) {
            p22.A0O();
        }
        this.A0A.A03();
        this.A08.A8v(this.A06.A0U(), new OG().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        PB.A04(this.A06.A0Z());
        PA.A0B().decrementAndGet();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1110Mq interfaceC1110Mq) {
    }

    public void setRtfActionsJavascriptListener(PK pk) {
        this.A02 = pk;
    }
}
