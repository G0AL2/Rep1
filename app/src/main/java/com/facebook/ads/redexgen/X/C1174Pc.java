package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1174Pc extends FrameLayout {
    public static final int A08 = (int) (Lr.A00 * 16.0f);
    public C0817Aj A00;
    @Nullable
    public C1195Px A01;
    @Nullable
    public AnonymousClass89 A02;
    public KS A03;
    public C07517m A04;
    public C07326p A05;
    public final C1400Xy A06;
    public final C1036Jp A07;

    public C1174Pc(C1400Xy c1400Xy, C1036Jp c1036Jp) {
        super(c1400Xy);
        this.A07 = c1036Jp;
        this.A06 = c1400Xy;
        setUpView(c1400Xy);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        C1195Px c1195Px = this.A01;
        if (c1195Px != null) {
            c1195Px.A0A();
            this.A01 = null;
        }
        AnonymousClass89 anonymousClass89 = this.A02;
        if (anonymousClass89 != null) {
            anonymousClass89.A0g();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC07859c abstractC07859c) {
        this.A00.getEventBus().A05(abstractC07859c);
    }

    public final void A04(InterfaceC1028Jh interfaceC1028Jh, String str, Map<String, String> extraParams) {
        A02();
        this.A02 = new AnonymousClass89(this.A06, interfaceC1028Jh, this.A00, str, extraParams);
        if (JR.A1J(this.A06)) {
            this.A01 = new C1195Px(this.A06, interfaceC1028Jh, this.A00, str, extraParams);
        } else {
            this.A01 = null;
        }
    }

    public final void A05(Q6 q62) {
        this.A00.A0b(q62, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public QK getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1400Xy c1400Xy) {
        this.A00.A0X();
        this.A04 = new C07517m(c1400Xy);
        this.A00.A0c(this.A04);
        this.A03 = new KS(c1400Xy, this.A07);
        this.A00.A0c(new C07577u(c1400Xy));
        this.A00.A0c(this.A03);
        this.A05 = new C07326p(c1400Xy, true, this.A07);
        this.A00.A0c(this.A05);
        this.A00.A0c(new KT(this.A05, QJ.A03, true, true));
        if (!this.A00.A0g() && !JR.A21(c1400Xy)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i10 = A08;
        layoutParams.setMargins(i10, i10, i10, i10);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C1400Xy c1400Xy) {
        this.A00 = new C0817Aj(c1400Xy);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        MS.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new View$OnClickListenerC1173Pb(this));
    }

    private void setUpView(C1400Xy c1400Xy) {
        setUpVideo(c1400Xy);
        setUpPlugins(c1400Xy);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f10) {
        this.A00.setVolume(f10);
        this.A03.A09();
    }
}
