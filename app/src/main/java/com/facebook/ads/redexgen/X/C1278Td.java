package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;

@TargetApi(19)
/* renamed from: com.facebook.ads.redexgen.X.Td  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1278Td implements InterfaceC1111Mr {
    public static byte[] A0C;
    public static String[] A0D = {"VjNTozFJBHBTAbZvfj55MfAwGP9LBSf6", "Pq0aBOwFzXTv3d8c4kUbGJ29Dl7JaeBe", "6Jh9GB1FdSmhvo4jirjJmKwQUVM2B32M", "TGGBgusTs1FvyAgmLwAY3Gsc6eBuJSRW", "x90wDNv6CtBtNBa5WCDyDNAaFj8t5cCY", "GDNjvFSJPJLifqCEdIwxfegvvEeKItWd", "ZGbO0A4ZRQBBFZeQfXm02pkO19XETszh", "zRbEM6nv1u3uOOYe"};
    public static final String A0E;
    public long A00;
    public String A02;
    public String A03;
    public final AnonymousClass59 A07;
    public final InterfaceC1028Jh A08;
    public final C1138Ns A09;
    public final C1139Nt A0A;
    public final TE A0B;
    public final AnonymousClass57 A06 = new C1281Tg(this);
    public boolean A05 = true;
    public long A01 = -1;
    public boolean A04 = true;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0D;
            if (strArr[1].charAt(18) == strArr[4].charAt(18)) {
                throw new RuntimeException();
            }
            A0D[7] = "WrA4t0RN";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 62);
            i13++;
        }
    }

    public static void A04() {
        A0C = new byte[]{114, -120, -120, -107, -120, -84, -41, -43, -120, -85, -41, -42, -36, -51, -42, -36, -120, -76, -41, -55, -52, -51, -52, -120, -68, -47, -43, -51, -94, -120, -70, -48, -48, -35, -48, -4, 31, 17, 20, -48, -10, 25, 30, 25, 35, 24, -48, 4, 25, 29, 21, -22, -48, -98, -76, -76, -63, -76, -32, 3, -11, -8, -76, -25, 8, -11, 6, 8, -76, -24, -3, 1, -7, -50, -76, -101, -79, -79, -66, -79, -29, -10, 4, 1, 0, -1, 4, -10, -79, -42, -1, -11, -79, -27, -6, -2, -10, -53, -79, -57, -35, -35, -22, -35, 16, 32, 47, 44, 41, 41, -35, 15, 34, 30, 33, 54, -35, 17, 38, 42, 34, -9, -35, -112, -90, -90, -77, -90, -39, -21, -7, -7, -17, -11, -12, -90, -52, -17, -12, -17, -7, -18, -90, -38, -17, -13, -21, -64, -90, -116, 92, 114, 114, Byte.MAX_VALUE, 114, -102, -77, -64, -74, -66, -73, -60, 114, -90, -69, -65, -73, -116, 114, -90, -42, -45, -37, -41, -55, -42, -124, -41, -55, -41, -41, -51, -45, -46, -124, -56, -59, -40, -59, -124, -48, -45, -53, -53, -55, -56, -124, -92, -124, -58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 9, 25, 22, 30, 26, 12, 25, -4, -7, -13, 24, 33, 30, 26, 35, 41, 9, 36, 32, 26, 35, -54, -61, -48, -58, -50, -57, -44, -74, -53, -49, -57};
    }

    static {
        A04();
        A0E = C1278Td.class.getSimpleName();
    }

    public C1278Td(AnonymousClass59 anonymousClass59, C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1110Mq interfaceC1110Mq) {
        TE te2;
        this.A07 = anonymousClass59;
        this.A08 = interfaceC1028Jh;
        int i10 = (int) (Lr.A00 * 2.0f);
        C1280Tf c1280Tf = new C1280Tf(this, interfaceC1110Mq);
        if (c1400Xy.A0C() == null) {
            c1400Xy.A0D().A88();
        }
        if (JS.A02(c1400Xy) || c1400Xy.A0C() == null) {
            te2 = new TE(c1400Xy, c1280Tf);
        } else {
            te2 = new TE(c1400Xy, c1400Xy.A0C(), c1280Tf);
        }
        this.A0B = te2;
        this.A09 = new C1138Ns(c1400Xy, this.A0B);
        this.A09.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A09.setListener(new C1279Te(this, anonymousClass59));
        interfaceC1110Mq.A3I(this.A09, layoutParams);
        this.A0B.setBrowserNavigationListener(this.A09.getBrowserNavigationListener());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A09.getId());
        layoutParams2.addRule(12);
        interfaceC1110Mq.A3I(this.A0B, layoutParams2);
        this.A0A = new C1139Nt(c1400Xy, null, 16842872);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, i10);
        layoutParams3.addRule(3, this.A09.getId());
        this.A0A.setProgress(0);
        interfaceC1110Mq.A3I(this.A0A, layoutParams3);
        anonymousClass59.A0K(this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void A8n(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String A03 = A03(231, 11, 36);
        String A032 = A03(220, 11, 119);
        String A033 = A03(210, 10, 105);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(A033);
            this.A03 = intent.getStringExtra(A032);
            String[] strArr = A0D;
            if (strArr[0].charAt(28) != strArr[2].charAt(28)) {
                throw new RuntimeException();
            }
            A0D[5] = "h34ynCyxETZN0C4DuHOjqZ0ETc7IsjOt";
            this.A00 = intent.getLongExtra(A03, -1L);
        } else {
            this.A02 = bundle.getString(A033);
            this.A03 = bundle.getString(A032);
            this.A00 = bundle.getLong(A03, -1L);
        }
        String str = this.A02;
        if (str == null) {
            str = A03(DownloadResource.STATUS_DEVICE_NOT_FOUND_ERROR, 11, 39);
        }
        this.A09.setUrl(str);
        this.A0B.loadUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void ABj(boolean z10) {
        C1142Nw A07;
        this.A0B.onPause();
        if (this.A04) {
            this.A04 = false;
            this.A08.A8t(this.A03, new C1141Nv(this.A0B.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0B.getResponseEndMs()).A00(this.A0B.getDomContentLoadedMs()).A05(this.A0B.getScrollReadyMs()).A02(this.A0B.getLoadFinishMs()).A06(System.currentTimeMillis()).A07().A02());
            if (BuildConfigApi.isDebug()) {
                String str = A03(169, 30, 38) + System.currentTimeMillis() + A03(149, 20, 20) + A07.A01 + A03(53, 22, 86) + A07.A03 + A03(75, 24, 83) + A07.A04 + A03(0, 30, 42) + A07.A00 + A03(99, 24, 127) + A07.A05 + A03(30, 23, 114) + A07.A02 + A03(123, 26, 72) + A07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AC8(boolean z10) {
        this.A0B.onResume();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void AEI(Bundle bundle) {
        bundle.putString(A03(210, 10, 105), this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Mr
    public final void onDestroy() {
        this.A07.A0L(this.A06);
        OC.A03(this.A0B);
        this.A0B.destroy();
    }
}
