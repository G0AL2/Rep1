package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1673dd<NativeViewabilityLogger> implements InterfaceC05780n {
    public static byte[] A0G;
    public static String[] A0H = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0I;
    public InterfaceC05860v A00;
    public C1662dS A01;
    @Nullable
    public C1655dL A02;
    public C0904El A03;
    @Nullable
    public InterfaceC1028Jh A04;
    @Nullable
    @DoNotStrip
    public O9 A06;
    @Nullable
    public T5 A07;
    @Nullable
    public A1 A08;
    @DoNotStrip
    public AbstractC1219Qv A09;
    @Nullable
    public C1220Qw A0A;
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public MK A05 = new MK();
    public Boolean A0B = false;

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 19);
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0G = new byte[]{-28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -29, -30, -17, -17, -26, -13, -81, -28, -19, -22, -28, -20, -26, -27, -24, -39, -20, -24, -93, -36, -24, -31, -32, -68, -69, -83, 116, Byte.MAX_VALUE};
    }

    static {
        A0A();
        A0I = C1673dd.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A09() {
        C1655dL c1655dL;
        if (this.A00 != null && this.A08 != null && (c1655dL = this.A02) != null && c1655dL.A0r()) {
            this.A00.AAD(this, this.A08);
        }
        if (this.A00 != null && this.A0D) {
            boolean z10 = this.A0E;
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            A0H[2] = "DQYu3GBVfiN4Ml";
            if (z10 || !this.A0F) {
                this.A00.AAD(this, this.A07);
            }
        }
        this.A03.A0D().A3X(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0B(int i10, C9I c9i) {
        InterfaceC1171Oz nativeDSLListener = new C1676dg(this);
        this.A08 = new A1(this.A03, this.A04, nativeDSLListener, this.A02, A08(0, 31, 110), 2, this.A05);
        this.A09 = new C1675df(this);
        this.A0A = new C1220Qw(this.A08, c9i.A04(), c9i.A09(), true, new WeakReference(this.A09), this.A03);
        this.A0A.A0W(this.A02.A0H());
        this.A0A.A0X(this.A02.A0I());
        this.A08.setVisibility(0);
        this.A03.getResources();
        this.A08.setLayoutParams(new LinearLayout.LayoutParams(-1, i10));
        this.A08.AF2();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0E(C9I c9i, C06071q c06071q) {
        C1664dU A00 = C1664dU.A00(c06071q.A03());
        this.A0C = A00.A65();
        if (C05750j.A03(this.A03, A00, this.A04)) {
            this.A03.A0D().A41();
            this.A00.ABC(this, KH.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A06 = new C0943Fy(this, A00);
        this.A07 = new T5(this.A03, new WeakReference(this.A06), c9i.A04(), A65());
        this.A07.A0G(c9i.A07(), c9i.A08());
        C1674de c1674de = new C1674de(this);
        C0904El c0904El = this.A03;
        InterfaceC1028Jh interfaceC1028Jh = this.A04;
        T5 t52 = this.A07;
        this.A01 = new C1662dS(c0904El, interfaceC1028Jh, t52, t52.getViewabilityChecker(), c1674de);
        this.A01.A08(A00);
        this.A07.loadDataWithBaseURL(OC.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 97), A08(40, 5, 52), null);
        this.A0D = true;
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(KK kk, C9I c9i) {
        if (this.A02 == null || this.A04 == null) {
            return;
        }
        int A02 = (int) (kk.A02() * Resources.getSystem().getDisplayMetrics().density);
        if (!(JR.A1U(this.A03) && C06985g.A0A(this.A02.A0d()))) {
            A0B(A02, c9i);
        } else {
            new C06985g(new C7U(this.A03), this.A02.A0d(), this.A02.A0Y(), this.A02.A0Z(), true, new C1678di(this, A02, c9i, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public final void A0I(C0904El c0904El, InterfaceC1028Jh interfaceC1028Jh, KK kk, InterfaceC05860v interfaceC05860v, C06071q c06071q) {
        c0904El.A0D().A3W();
        this.A03 = c0904El;
        this.A04 = interfaceC1028Jh;
        this.A00 = interfaceC05860v;
        this.A0F = JR.A18(this.A03.getApplicationContext());
        C9I A01 = c06071q.A01();
        this.A02 = C1655dL.A01(c06071q.A03(), this.A03);
        if (this.A02.A0r()) {
            A0F(kk, A01);
        } else {
            A0E(A01, c06071q);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC05780n
    public final String A65() {
        return this.A0C;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC05780n
    public final AdPlacementType A7B() {
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC05780n
    public final void onDestroy() {
        this.A03.A0D().A3U(this.A07 != null);
        T5 t52 = this.A07;
        if (t52 != null) {
            t52.destroy();
            this.A07 = null;
            this.A06 = null;
        }
    }
}
