package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;
import ms.bd.o.Pgl.c;

/* renamed from: com.facebook.ads.redexgen.X.Sw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1272Sw extends AbstractC1151Of {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public KX A00;
    @Nullable
    public C1001Ig A01;
    public IT A02;
    public final AnonymousClass18 A03;
    public final C1B A04;
    public final OJ A05;

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{9, 5, 7, 68, 12, 11, 9, 15, 8, 5, 5, 1, 68, 11, 14, 25, 68, 3, 4, 30, 15, 24, 25, 30, 3, 30, 3, 11, 6, 68, 9, 6, 3, 9, 1, 15, 14, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0B();
        A0B = (int) (Lr.A00 * 48.0f);
        A0F = (int) (Lr.A00 * 16.0f);
        A08 = (int) (Lr.A00 * 4.0f);
        A0E = (int) (Lr.A00 * 44.0f);
        A0C = (int) (Lr.A00 * 8.0f);
        A0D = (int) (Lr.A00 * 12.0f);
        A0H = (int) (Lr.A00 * 12.0f);
        A0G = (int) (Lr.A00 * 26.0f);
        A09 = C2U.A01(-1, 77);
        A0A = C2U.A01(A09, 90);
    }

    public AbstractC1272Sw(C1155Oj c1155Oj, boolean z10) {
        super(c1155Oj, z10);
        this.A03 = c1155Oj.A04();
        this.A04 = this.A03.A0O();
        this.A05 = A09(c1155Oj);
        AbstractC1109Mp A082 = c1155Oj.A08();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    private OJ A09(C1155Oj c1155Oj) {
        String A0A2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c1155Oj.A04().A0Y().equals(A0A(37, 14, 56))) {
            A0A2 = Q9.A04.A02();
        } else {
            A0A2 = A0A(0, 37, 124);
        }
        C1273Sx c1273Sx = new C1273Sx(c1155Oj.A05(), A0B, this.A04.A0E().A00() == C1G.A05, getColors(), this.A04.A0F().A06(), A0A2, c1155Oj.A06(), c1155Oj.A09(), c1155Oj.A0B(), c1155Oj.A07());
        this.A02 = new IT(c1273Sx, DownloadResource.STATUS_BAD_REQUEST, 100, 0);
        MS.A0K(c1273Sx);
        c1273Sx.A0A(c1155Oj.A00());
        addView(c1273Sx, layoutParams);
        return c1273Sx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public void A0b(C1B c1b, String str, double d10, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d10, bundle);
        this.A05.setInfo(c1b.A0E(), c1b.A0F(), str, this.A03.A0R().A01(), null);
    }

    public final int A0e(@Nullable AbstractC1109Mp abstractC1109Mp) {
        return abstractC1109Mp == null ? AbstractC1109Mp.A00 : abstractC1109Mp.getToolbarHeight();
    }

    public void A0f() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new KX(true);
            C1001Ig c1001Ig = this.A01;
            if (c1001Ig != null) {
                KX kx = this.A00;
                if (A07[0].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                A07[7] = "KTvg88bTO6HmKn15GgbH1";
                kx.A0I(c1001Ig);
            }
            C1K A01 = this.A03.A0N().A01();
            this.A00.A0I(new IV(getAdDetailsView().getCTAButton(), c.COLLECT_MODE_FINANCE, -1, A01.A09(true)));
            this.A00.A0I(new C1002Ih(getAdDetailsView().getCTAButton(), c.COLLECT_MODE_FINANCE, MS.A08(A09, A0A, A08), MS.A05(A01.A08(true), A08)));
            this.A00.A0I(new IY(expandableLayout, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, false));
            this.A00.A0H(IronSourceConstants.IS_AUCTION_FAILED);
        }
    }

    public AnonymousClass18 getAdDataBundle() {
        return this.A03;
    }

    public IT getAdDetailsAnimation() {
        return this.A02;
    }

    public OJ getAdDetailsView() {
        return this.A05;
    }

    public C1B getAdInfo() {
        return this.A04;
    }

    public KX getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0A(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z10) {
            return;
        }
        C1001Ig c1001Ig = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (c1001Ig == null) {
            this.A01 = new C1001Ig(expandableLayout, c.COLLECT_MODE_FINANCE, expandableLayout.getHeight(), 0);
            this.A00.A0I(this.A01);
            this.A00.A0G();
        }
    }
}
