package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TM implements InterfaceC1111Mr {
    public static byte[] A0C;
    public int A00;
    public C1195Px A01;
    public AnonymousClass89 A02;
    public final C1400Xy A03;
    public final InterfaceC1028Jh A04;
    public final InterfaceC1110Mq A05;
    public final ND A06;
    public final QK A07;
    public final AbstractC1079Lj A0B = new C0816Ai(this);
    public final AbstractC1093Lz A0A = new AN(this);
    public final N6 A08 = new AL(this);
    public final N4 A09 = new AK(this);

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0C = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, 24, 11, 6, 7, 17, -11, 7, 7, 13, -10, 11, 15, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public TM(C1400Xy c1400Xy, ND nd2, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1110Mq interfaceC1110Mq) {
        this.A03 = c1400Xy;
        this.A04 = interfaceC1028Jh;
        this.A06 = nd2;
        this.A07 = new QK(c1400Xy);
        this.A07.A0c(new C07577u(c1400Xy));
        this.A07.getEventBus().A03(this.A0B, this.A0A, this.A08, this.A09);
        this.A05 = interfaceC1110Mq;
        this.A07.setIsFullScreen(true);
        this.A07.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC1110Mq.A3I(this.A07, layoutParams);
        C1113Mt c1113Mt = new C1113Mt(c1400Xy);
        c1113Mt.setOnClickListener(new NB(this));
        interfaceC1110Mq.A3I(c1113Mt, c1113Mt.getDefaultLayoutParams());
    }

    public final void A04(int i10) {
        this.A07.setVideoProgressReportIntervalMs(i10);
    }

    public final void A05(View view) {
        this.A07.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void A8n(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            PY py = new PY(this.A03, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i10 = (int) (16.0f * Lr.A00);
            layoutParams.setMargins(i10, i10, i10, i10);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            py.setOnClickListener(new NC(this));
            this.A05.A3I(py, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 124), 0);
        C1400Xy c1400Xy = this.A03;
        InterfaceC1028Jh interfaceC1028Jh = this.A04;
        QK qk = this.A07;
        String A02 = A02(8, 11, 102);
        this.A02 = new AnonymousClass89(c1400Xy, interfaceC1028Jh, qk, intent.getStringExtra(A02), intent.getBundleExtra(A02(58, 11, 1)));
        if (JR.A1J(this.A03)) {
            this.A01 = new C1195Px(this.A03, this.A04, this.A07, intent.getStringExtra(A02), null);
        } else {
            this.A01 = null;
        }
        this.A07.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A07.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i11 = this.A00;
        if (i11 > 0) {
            this.A07.A0Y(i11);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A07.A0b(Q6.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void ABj(boolean z10) {
        this.A05.A3t(A02(37, 21, 27), new MQ());
        this.A07.A0W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AC8(boolean z10) {
        this.A05.A3t(A02(37, 21, 27), new ML());
        if (!this.A07.A0j()) {
            this.A07.A0b(Q6.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void onDestroy() {
        this.A05.A3t(A02(37, 21, 27), new L1(this.A00, this.A07.getCurrentPositionInMillis()));
        this.A02.A0d(this.A07.getCurrentPositionInMillis());
        C1195Px c1195Px = this.A01;
        if (c1195Px != null) {
            c1195Px.A09();
        }
        this.A07.A0Z(1);
        this.A07.A0V();
    }
}
