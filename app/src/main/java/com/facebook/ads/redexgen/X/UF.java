package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class UF extends AbstractC1219Qv {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1670da A01;
    public final /* synthetic */ UB A02;
    public final /* synthetic */ boolean A03;

    public UF(UB ub2, View view, boolean z10, C1670da c1670da) {
        this.A02 = ub2;
        this.A00 = view;
        this.A03 = z10;
        this.A01 = c1670da;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1219Qv
    public final void A00() {
        KF kf2;
        kf2 = this.A02.A0e;
        kf2.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1219Qv
    public final void A01() {
        KF kf2;
        kf2 = this.A02.A0e;
        kf2.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1219Qv
    public final void A02() {
        KF kf2;
        KF kf3;
        C1400Xy c1400Xy;
        C1220Qw c1220Qw;
        WeakReference weakReference;
        MK mk;
        KF kf4;
        C1661dR c1661dR;
        View view;
        View view2;
        C1661dR c1661dR2;
        View view3;
        C1661dR c1661dR3;
        View view4;
        C1661dR c1661dR4;
        K8 k82;
        C1661dR c1661dR5;
        boolean z10;
        C1661dR c1661dR6;
        boolean z11;
        C1661dR c1661dR7;
        boolean z12;
        C1661dR c1661dR8;
        boolean A0p;
        C1661dR c1661dR9;
        EnumC05900z enumC05900z;
        C1661dR c1661dR10;
        boolean z13;
        C1661dR c1661dR11;
        NativeAdLayout nativeAdLayout;
        C1661dR c1661dR12;
        String str;
        C1661dR c1661dR13;
        C1661dR c1661dR14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        C1220Qw c1220Qw2;
        Drawable loadedNativeBannerIconDrawable;
        C1220Qw c1220Qw3;
        KF kf5;
        C1220Qw c1220Qw4;
        KF kf6;
        kf2 = this.A02.A0e;
        kf2.A0B();
        if (JR.A1V(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof Q3) && !((Q3) adContentsView).A02()) {
                    c1220Qw4 = this.A02.A0R;
                    c1220Qw4.A0T();
                    kf6 = this.A02.A0e;
                    kf6.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            loadedNativeBannerIconDrawable = this.A02.A01;
            if (loadedNativeBannerIconDrawable == null) {
                c1220Qw3 = this.A02.A0R;
                c1220Qw3.A0T();
                kf5 = this.A02.A0e;
                kf5.A07();
                return;
            }
            UB.A0e(loadedNativeBannerIconDrawable, imageView);
        }
        kf3 = this.A02.A0e;
        c1400Xy = this.A02.A0c;
        kf3.A0C(c1400Xy, this.A01.A0G());
        c1220Qw = this.A02.A0R;
        if (c1220Qw != null) {
            c1220Qw2 = this.A02.A0R;
            c1220Qw2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((AbstractC1219Qv) weakReference3.get()).A02();
            }
        }
        mk = this.A02.A0f;
        if (mk.A07()) {
            kf4 = this.A02.A0e;
            kf4.A04();
            return;
        }
        this.A02.A0b();
        c1661dR = this.A02.A09;
        if (c1661dR != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c1661dR2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c1661dR2.A08(view3);
                    c1661dR3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c1661dR3.A07(view4);
                    c1661dR4 = this.A02.A09;
                    k82 = this.A02.A0I;
                    c1661dR4.A0B(k82);
                    c1661dR5 = this.A02.A09;
                    z10 = this.A02.A0W;
                    c1661dR5.A0E(z10);
                    c1661dR6 = this.A02.A09;
                    z11 = this.A02.A0Z;
                    c1661dR6.A0I(z11);
                    c1661dR7 = this.A02.A09;
                    z12 = this.A02.A0Y;
                    c1661dR7.A0H(z12);
                    c1661dR8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c1661dR8.A0F(A0p);
                    c1661dR9 = this.A02.A09;
                    enumC05900z = this.A02.A08;
                    c1661dR9.A09(enumC05900z);
                    c1661dR10 = this.A02.A09;
                    z13 = this.A02.A0X;
                    c1661dR10.A0G(z13);
                    c1661dR11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c1661dR11.A0A(NO.A00(nativeAdLayout));
                    c1661dR12 = this.A02.A09;
                    str = this.A02.A0S;
                    c1661dR12.A0C(str);
                    c1661dR13 = this.A02.A09;
                    c1661dR13.A0J(this.A03);
                    c1661dR14 = this.A02.A09;
                    c1661dR14.A02();
                }
            }
        }
    }
}
