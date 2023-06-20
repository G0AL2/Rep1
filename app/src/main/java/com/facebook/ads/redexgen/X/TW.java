package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class TW extends RelativeLayout implements InterfaceC1111Mr {
    public static byte[] A0D;
    public static String[] A0E = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;
    @Nullable
    public C1081Ll A01;
    @Nullable
    public PR A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass19 A05;
    public final MF A06;
    public final InterfaceC1110Mq A07;
    public final C1653dJ A08;
    public final C1400Xy A09;
    public final InterfaceC1028Jh A0A;
    public final C1036Jp A0B;
    public final AbstractC1109Mp A0C;

    public static String A0L(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0D = new byte[]{88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 90, 95, 72, 21, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, 21, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, 21, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0a();

    @ToolbarActionView$ToolbarActionMode
    public abstract int getCloseButtonStyle();

    static {
        A0O();
    }

    public TW(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1110Mq interfaceC1110Mq, C1653dJ c1653dJ) {
        super(c1400Xy);
        this.A04 = false;
        this.A03 = false;
        this.A09 = c1400Xy;
        this.A0A = interfaceC1028Jh;
        this.A07 = interfaceC1110Mq;
        this.A06 = new MF(this);
        this.A08 = c1653dJ;
        this.A0B = new C1036Jp(this.A08.A0U(), this.A0A);
        this.A0C = new FullScreenAdToolbar(this.A09, getAudienceNetworkListener(), this.A0B, 0, this.A08.A0F());
    }

    private C1K A0K(int i10) {
        if (i10 == 1) {
            return this.A05.A01();
        }
        AnonymousClass19 anonymousClass19 = this.A05;
        if (A0E[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0E[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return anonymousClass19.A00();
    }

    private void A0M() {
        removeAllViews();
        MS.A0J(this);
    }

    private void A0N() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0X() && this.A02 == null) {
            this.A04 = true;
            this.A02 = new PP(this.A09, this.A08.A0O().A0E(), this.A08.A0R()).A08(this.A08.A0N().A01()).A0B();
            C1038Jr.A04(this.A02, this.A0B, EnumC1035Jo.A0U);
            this.A07.A3H(this, 0, layoutParams);
            this.A07.A3H(this.A02, 1, layoutParams);
            this.A02.A04(new TY(this));
            return;
        }
        this.A07.A3H(this, 0, layoutParams);
    }

    private void A0P(C1K c1k, boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0C.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0C.A04(c1k, z10);
        addView(this.A0C, layoutParams);
    }

    public final void A0S() {
        View view = this.A00;
        if (view == null || !(view instanceof AbstractC1151Of)) {
            return;
        }
        if (A0Y()) {
            ((AbstractC1151Of) this.A00).A0a();
        } else {
            ((AbstractC1151Of) this.A00).A0Z();
        }
    }

    public final void A0T(int i10) {
        this.A01 = new C1081Ll(i10, new TX(this, i10));
        this.A03 = true;
        A0S();
        this.A01.A07();
    }

    public final void A0U(View view, boolean z10, int i10) {
        this.A00 = view;
        this.A06.A05(ME.A03);
        A0M();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z10 ? 0 : this.A0C.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C1K A0K = A0K(i10);
        A0P(A0K, z10);
        MS.A0M(this, A0K.A07(false));
        if (this.A07 != null) {
            A0N();
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0E[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z10 && Build.VERSION.SDK_INT >= 19) {
                MF mf2 = this.A06;
                if (A0E[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0E[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                mf2.A05(ME.A04);
            }
        }
    }

    public final void A0V(AnonymousClass59 anonymousClass59) {
        this.A06.A04(anonymousClass59.A0H().getWindow());
        this.A05 = this.A08.A0N();
        C1B c1b = null;
        if (this.A08.A0O() != null && this.A08.A0O() != null) {
            c1b = this.A08.A0O();
        }
        this.A0C.setPageDetails(this.A08.A0R(), this.A08.A0U(), c1b != null ? c1b.A0D().A03() : 0, this.A08.A0S());
        this.A0C.setToolbarListener(new C1276Ta(this, anonymousClass59));
    }

    public final void A0W(AnonymousClass59 anonymousClass59) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new animation.Animation$AnimationListenerC1117Mx(this, this, anonymousClass59));
        startAnimation(alphaAnimation);
    }

    public final boolean A0X() {
        if (!this.A08.A0c().isEmpty()) {
            boolean A0P = this.A08.A0O().A0P();
            if (A0E[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0E[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (A0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A03;
    }

    public final boolean A0Z() {
        return this.A04;
    }

    public void ABj(boolean z10) {
        C1081Ll c1081Ll = this.A01;
        if (c1081Ll != null && c1081Ll.A05()) {
            this.A01.A06();
        }
    }

    public void AC8(boolean z10) {
        C1081Ll c1081Ll = this.A01;
        if (c1081Ll != null && !c1081Ll.A04()) {
            this.A01.A07();
        }
    }

    public InterfaceC1028Jh getAdEventManager() {
        return this.A0A;
    }

    public InterfaceC1110Mq getAudienceNetworkListener() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A06.A03();
        this.A0C.setToolbarListener(null);
        A0M();
    }

    public void setImpressionRecordingFlag(MK mk) {
        mk.A05();
        if (getAudienceNetworkListener() != null) {
            getAudienceNetworkListener().A3s(A0L(0, 47, 106));
        }
    }

    public void setListener(InterfaceC1110Mq interfaceC1110Mq) {
    }
}
