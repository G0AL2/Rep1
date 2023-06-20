package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class AB extends AbstractC1261Sl {
    @Nullable
    public N8 A00;
    @Nullable
    public InterfaceC1164Os A01;
    @Nullable
    public C1174Pc A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    @Nullable
    public RelativeLayout A06;
    public SB A07;
    public final C1400Xy A08;
    public final N6 A09;
    public final AbstractC1093Lz A0A;
    public final AbstractC1079Lj A0B;
    public final L4 A0C;
    public final AbstractC1049Kc A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C1155Oj A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (Lr.A00 * 0.0f);
    public static final int A0M = (int) (Lr.A00 * 9.0f);
    public static final int A0K = (int) (Lr.A00 * 9.0f);

    public AB(C1155Oj c1155Oj, boolean z10, String str, SB sb2) {
        super(c1155Oj, z10);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new AH(this);
        this.A09 = new AF(this);
        this.A0B = new AE(this);
        this.A0A = new AD(this);
        this.A0C = new AC(this);
        this.A0I = c1155Oj;
        this.A07 = sb2;
        this.A0E = str;
        this.A08 = c1155Oj.A05();
        setGravity(17);
        int i10 = A0L;
        setPadding(i10, 0, i10, i10);
        MS.A0M(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A8o(this.A02.getSimpleVideoView());
            if (JR.A1Y(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AFG(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (!A0i() || !this.A05) {
            boolean A0i = A0i();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (A0i || !this.A04) {
                return;
            }
        }
        this.A01.AA3();
    }

    private void A03(@Nullable View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        MS.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final void A0e() {
        C1174Pc c1174Pc;
        if (A0i() && (c1174Pc = this.A02) != null) {
            c1174Pc.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final void A0f() {
        if (A0i()) {
            A0g();
            C1174Pc c1174Pc = this.A02;
            if (c1174Pc != null) {
                c1174Pc.A05(Q6.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final void A0g() {
        C1174Pc c1174Pc;
        float volume = this.A07.A0P().getVolume();
        if (A0i() && (c1174Pc = this.A02) != null && volume != c1174Pc.getVolume()) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final boolean A0h() {
        C1174Pc c1174Pc;
        return A0i() && (c1174Pc = this.A02) != null && c1174Pc.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final boolean A0i() {
        return this.A03;
    }

    public final void A0j(Map<String, String> map) {
        C1174Pc c1174Pc = this.A02;
        if (c1174Pc != null) {
            c1174Pc.A02();
            if (A0i()) {
                this.A02.A04(getAdEventManager(), this.A0E, map);
            }
        }
    }

    @Nullable
    public final C1174Pc getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i10 = 0;
        boolean z10 = getResources().getConfiguration().orientation == 1;
        if (z10) {
            i10 = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        this.A0H.set(A0L, 0.0f, getWidth() - A0L, getHeight() - A0L);
        if (z10) {
            i10 = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        N8 n82 = this.A00;
        if (n82 != null) {
            n82.setVisibility(0);
            new T3(this.A00, this.A08).A04().A06(new C1274Sy(this, null)).A07(str);
        }
        C1174Pc c1174Pc = this.A02;
        if (c1174Pc != null) {
            c1174Pc.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z10) {
        this.A03 = z10;
    }

    public void setOnAssetsLoadedListener(InterfaceC1164Os interfaceC1164Os) {
        this.A01 = interfaceC1164Os;
    }

    public void setUpImageView(C1400Xy c1400Xy) {
        this.A00 = new N8(c1400Xy);
        A04(this.A00);
    }

    public void setUpMediaContainer(C1400Xy c1400Xy) {
        this.A06 = new RelativeLayout(c1400Xy);
        A04(this.A06);
        N8 n82 = this.A00;
        if (n82 != null) {
            this.A06.addView(n82);
            A03(this.A00);
        }
        C1174Pc c1174Pc = this.A02;
        if (c1174Pc != null) {
            this.A06.addView(c1174Pc);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1400Xy c1400Xy) {
        this.A02 = new C1174Pc(c1400Xy, new C1036Jp(this.A0E, getAdEventManager()));
        A04(this.A02);
    }

    private void setUpView(C1400Xy c1400Xy) {
        setUpImageView(c1400Xy);
        setUpVideoView(c1400Xy);
        setUpMediaContainer(c1400Xy);
    }

    public void setVideoPlaceholderUrl(String str) {
        C1174Pc c1174Pc = this.A02;
        if (c1174Pc != null) {
            c1174Pc.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        N8 n82 = this.A00;
        if (n82 != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            n82.setVisibility(8);
        }
        C1174Pc c1174Pc = this.A02;
        if (c1174Pc != null) {
            c1174Pc.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
