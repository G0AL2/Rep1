package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.AbstractC1109Mp;
import com.facebook.ads.redexgen.X.C05921b;
import com.facebook.ads.redexgen.X.C1036Jp;
import com.facebook.ads.redexgen.X.C1107Mn;
import com.facebook.ads.redexgen.X.C1400Xy;
import com.facebook.ads.redexgen.X.C1K;
import com.facebook.ads.redexgen.X.C1U;
import com.facebook.ads.redexgen.X.InterfaceC1108Mo;
import com.facebook.ads.redexgen.X.InterfaceC1110Mq;
import com.facebook.ads.redexgen.X.Lr;
import com.facebook.ads.redexgen.X.MS;
import com.facebook.ads.redexgen.X.NA;
import com.facebook.ads.redexgen.X.PZ;
import com.facebook.ads.redexgen.X.View$OnClickListenerC1114Mu;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC1109Mp {
    public static byte[] A07;
    public static String[] A08 = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    @Nullable
    public InterfaceC1108Mo A00;
    public final RelativeLayout A01;
    public final C1036Jp A02;
    public final C1107Mn A03;
    public final InterfaceC1110Mq A04;
    public final NA A05;
    public final PZ A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-26, 15, 18, 22, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74};
    }

    static {
        A03();
        A09 = (int) (Lr.A00 * 10.0f);
        A0D = (int) (Lr.A00 * 16.0f);
        int i10 = A0D;
        int i11 = A09;
        A0B = i10 - i11;
        A0C = (i10 * 2) - i11;
        A0A = (int) (Lr.A00 * 4.0f);
    }

    public FullScreenAdToolbar(C1400Xy c1400Xy, InterfaceC1110Mq interfaceC1110Mq, C1036Jp c1036Jp, @ToolbarActionView$ToolbarActionMode int i10, int i11) {
        super(c1400Xy);
        this.A04 = interfaceC1110Mq;
        this.A02 = c1036Jp;
        setGravity(16);
        this.A05 = new NA(c1400Xy, i10);
        this.A05.setContentDescription(A02(0, 8, 50));
        this.A05.setActionClickListener(new View$OnClickListenerC1114Mu(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i12 = A0B;
        layoutParams.setMargins(i12, i12, A0C, i12);
        addView(this.A05, layoutParams);
        this.A01 = new RelativeLayout(c1400Xy);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A06 = new PZ(c1400Xy);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.A06.setLayoutParams(layoutParams3);
        this.A01.addView(this.A06);
        addView(this.A01, layoutParams2);
        this.A03 = new C1107Mn(c1400Xy, i11);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        int i13 = A0D;
        layoutParams4.setMargins(0, i13 / 2, i13 / 2, i13 / 2);
        addView(this.A03, layoutParams4);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public final void A04(C1K c1k, boolean z10) {
        int A04 = c1k.A04(z10);
        this.A06.A01(c1k.A0A(z10), A04);
        this.A03.setIconColors(A04);
        this.A03.setContentDescription(A02(8, 9, 117));
        this.A05.setColors(A04);
        if (z10) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            MS.A0S(this, gradientDrawable);
            MS.A0Q(this.A03, 0, -16777216, A0A);
            return;
        }
        MS.A0M(this, 0);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public final boolean A05() {
        return this.A05.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public int getToolbarHeight() {
        return AbstractC1109Mp.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public void setAdReportingVisible(boolean z10) {
        this.A03.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public void setPageDetails(C1U c1u, String str, int i10, C05921b c05921b) {
        this.A05.setInitialUnskippableSeconds(i10);
        this.A06.setPageDetails(c1u);
        this.A03.setAdDetails(c1u, str, this.A02, this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public void setPageDetailsVisible(boolean z10) {
        this.A01.removeAllViews();
        if (z10) {
            RelativeLayout relativeLayout = this.A01;
            PZ pz = this.A06;
            if (A08[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(pz);
        }
        NA na2 = this.A05;
        String[] strArr2 = A08;
        if (strArr2[2].length() == strArr2[3].length()) {
            na2.setToolbarMessageEnabled(!z10);
            return;
        }
        A08[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
        na2.setToolbarMessageEnabled(!z10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public void setProgress(float f10) {
        this.A05.setProgress(f10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public void setProgressSpinnerInvisible(boolean z10) {
        this.A05.setProgressSpinnerInvisible(z10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public void setToolbarActionMessage(String str) {
        this.A05.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i10) {
        this.A05.setToolbarActionMode(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1109Mp
    public void setToolbarListener(InterfaceC1108Mo interfaceC1108Mo) {
        this.A00 = interfaceC1108Mo;
    }
}
