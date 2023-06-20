package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class A3 extends AbstractC1261Sl {
    public RelativeLayout A00;
    public N8 A01;
    public InterfaceC1164Os A02;
    public SB A03;
    public C1174Pc A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C1400Xy A0B;
    public final N6 A0C;
    public final AbstractC1093Lz A0D;
    public final AbstractC1079Lj A0E;
    public final L4 A0F;
    public final AbstractC1049Kc A0G;
    public final String A0H;
    public static final int A0J = (int) (Lr.A00 * 1.0f);
    public static final int A0K = (int) (Lr.A00 * 4.0f);
    public static final int A0I = (int) (Lr.A00 * 6.0f);

    public abstract void A0j(C1400Xy c1400Xy);

    public A3(C1155Oj c1155Oj, boolean z10, String str, SB sb2) {
        super(c1155Oj, z10);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new A8(this);
        this.A0C = new A7(this);
        this.A0E = new A6(this);
        this.A0D = new A5(this);
        this.A0F = new A4(this);
        this.A03 = sb2;
        this.A0H = str;
        this.A0B = c1155Oj.A05();
        setGravity(17);
        int i10 = A0J;
        setPadding(i10, 0, i10, i10);
        MS.A0M(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(-16777216);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A02 == null) {
            return;
        }
        if ((A0i() && this.A07) || (!A0i() && this.A06)) {
            this.A02.AA3();
        }
    }

    private void A02(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        MS.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Of
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final void A0e() {
        if (A0i()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final void A0f() {
        if (A0i()) {
            A0g();
            this.A04.A05(Q6.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final void A0g() {
        float volume = this.A03.A0P().getVolume();
        if (A0i() && volume != this.A04.getVolume()) {
            this.A04.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final boolean A0h() {
        return A0i() && this.A04.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261Sl
    public final boolean A0i() {
        return this.A05;
    }

    public final void A0k(Map<String, String> map) {
        this.A04.A02();
        if (A0i()) {
            this.A04.A04(getAdEventManager(), this.A0H, map);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C1174Pc getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i10 = A0I;
        path.addRoundRect(rectF, i10, i10, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0J, 0.0f, getWidth() - A0J, getHeight() - A0J);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i11 = A0K;
        path2.addRoundRect(rectF2, i11, i11, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A01(str, str2, null, true, false);
    }

    public void setCTAInfo(C1L c1l, Map<String, String> map) {
        getCtaButton().setCta(c1l, this.A0H, map);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new T3(this.A01, this.A0B).A04().A06(new C1260Sk(this, null)).A07(str);
    }

    public void setIsVideo(boolean z10) {
        this.A05 = z10;
    }

    public void setOnAssetsLoadedListener(InterfaceC1164Os interfaceC1164Os) {
        this.A02 = interfaceC1164Os;
    }

    public void setUpImageView(C1400Xy c1400Xy) {
        this.A01 = new N8(c1400Xy);
        A02(this.A01);
    }

    public void setUpMediaContainer(C1400Xy c1400Xy) {
        this.A00 = new RelativeLayout(c1400Xy);
        A02(this.A00);
    }

    public void setUpVideoView(C1400Xy c1400Xy) {
        this.A04 = new C1174Pc(c1400Xy, new C1036Jp(this.A0H, getAdEventManager()));
        A02(this.A04);
    }

    private void setUpView(C1400Xy c1400Xy) {
        setUpImageView(c1400Xy);
        setUpVideoView(c1400Xy);
        setUpMediaContainer(c1400Xy);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A0j(c1400Xy);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}
