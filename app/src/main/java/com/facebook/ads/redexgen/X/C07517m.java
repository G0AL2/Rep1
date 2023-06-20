package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.7m  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07517m extends NQ {
    public static String[] A04 = {"t7nWMgaAgPrF08nCpsue0KJ0bXYxildh", "6KdtKMmtzfHYFwbGu3Z1Ir1zVfPvm0mZ", "4a3tRJ2Sc2HJRD7iGLBoGFg5dIAFXATk", "UpueiF5Mlf4qFrRwKkN0oaj1wZcm2sVE", "2I2trXzlQyfCpDc0SWIB9I9l1xDqUCt2", "pVCp6f81Bxfp7pGgyLuO3QWY2ZOI1Rz7", "JWrnXr9CYPwxDsxVPLOhiB9OxQPOAEin", "O346HS8RGmqKBjl58VTWQBGWIRLrpgc9"};
    public final ImageView A00;
    public final C1400Xy A01;
    public final AbstractC07859c<AnonymousClass88> A02;
    public final AbstractC07859c<C1092Ly> A03;

    public C07517m(C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A03 = new KN(this);
        this.A02 = new C1034Jn(this);
        this.A01 = c1400Xy;
        this.A00 = new ImageView(c1400Xy);
        this.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
        MS.A0M(this.A00, -16777216);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.A00.layout(0, 0, i12 - i10, i13 - i11);
    }

    public void setImage(@Nullable String str) {
        setImage(str, null);
    }

    public void setImage(@Nullable String str, @Nullable OF of2) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        T3 A042 = new T3(this.A00, this.A01).A04();
        if (of2 != null) {
            A042.A06(of2);
        }
        A042.A07(str);
        String[] strArr = A04;
        if (strArr[0].charAt(21) == strArr[6].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "kA5c9xFlh2VnhKEqDnwhhyQ6vC8xp51l";
        strArr2[6] = "v6NK46wFN1tyoiPUrV3jpTAezqYTXUDI";
    }
}
