package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Of  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1151Of extends RelativeLayout {
    public static final int A08 = (int) (Lr.A00 * 16.0f);
    public static final int A09 = (int) (Lr.A00 * 28.0f);
    public C1K A00;
    public boolean A01;
    public boolean A02;
    public final C1400Xy A03;
    public final InterfaceC1028Jh A04;
    public final T1 A05;
    public final C1148Oc A06;
    public final C1155Oj A07;

    public abstract boolean A0c();

    public AbstractC1151Of(C1155Oj c1155Oj, boolean z10) {
        super(c1155Oj.A05());
        C1K A00;
        this.A01 = false;
        this.A07 = c1155Oj;
        this.A03 = c1155Oj.A05();
        this.A04 = c1155Oj.A06();
        if (c1155Oj.A00() == 1) {
            A00 = c1155Oj.A04().A0N().A01();
        } else {
            A00 = c1155Oj.A04().A0N().A00();
        }
        this.A00 = A00;
        this.A02 = z10;
        this.A05 = new T1(c1155Oj.A05(), c1155Oj.A04().A0T(), this.A00, c1155Oj.A04().A0O().A0F().A06(), c1155Oj.A06(), c1155Oj.A09(), c1155Oj.A0B(), c1155Oj.A07());
        this.A05.setRoundedCornersEnabled(A00());
        this.A05.setViewShowsOverMedia(A0B());
        MS.A0G(1001, this.A05);
        this.A06 = new C1148Oc(this.A03, this.A00, this.A02, A01(), A02());
        MS.A0K(this.A06);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public void A09(AnonymousClass88 anonymousClass88) {
        this.A01 = true;
    }

    public void A0A(AnonymousClass84 anonymousClass84) {
    }

    public boolean A0B() {
        return true;
    }

    public void A0W() {
    }

    public void A0X() {
    }

    public void A0Y() {
    }

    public void A0Z() {
    }

    public void A0a() {
    }

    public void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        this.A06.A01(c1b.A0E().A05(), c1b.A0E().A01(), null, false, !A0c() && d10 > 0.0d && d10 < 1.0d);
        this.A05.setCta(c1b.A0F(), str, new HashMap());
    }

    public boolean A0d(boolean z10) {
        return false;
    }

    public C1400Xy getAdContextWrapper() {
        return this.A03;
    }

    public InterfaceC1028Jh getAdEventManager() {
        return this.A04;
    }

    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    public C1K getColors() {
        return this.A00;
    }

    public T1 getCtaButton() {
        return this.A05;
    }

    public C1148Oc getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1K A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A07.A04().A0N().A01();
        } else {
            A00 = this.A07.A04().A0N().A00();
        }
        this.A00 = A00;
        this.A05.setViewShowsOverMedia(A0B());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A00(this.A00, this.A02);
    }
}
