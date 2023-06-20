package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1555bd extends C5E implements MediaViewApi, Repairable, C8S {
    public static byte[] A0E;
    public static String[] A0F = {"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    @Nullable
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C1400Xy A07;
    public C1A A08;
    public OD A09;
    @Nullable
    public A1 A0A;
    @Nullable
    public C1180Pi A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, 26, 9, 20, 14, 8, 30, 23, 91, 9, 30, 21, 31, 30, 9, 30, 9, 91, 22, 14, 8, 15, 91, 25, 30, 91, 8, 30, 15, 91, 25, 30, 29, 20, 9, 30, 91, 21, 26, 15, 18, 13, 30, 58, 31, 85, 26, 30, 29, 41, 56, 53, 57, 50, 63, 57, 18, 57, 40, 43, 51, 46, 55, 64, 100, 104, 110, 108, 41, 123, 108, 103, 109, 108, 123, 108, 123, 41, 100, 124, 122, 125, 41, 107, 108, 41, 122, 108, 125, 41, 107, 108, 111, 102, 123, 108, 41, 103, 104, 125, 96, Byte.MAX_VALUE, 108, 72, 109, 39, 96, 68, 72, 78, 76, 9, 91, 76, 71, 77, 76, 91, 76, 91, 9, 68, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, 70, 91, 76, 9, 71, 72, 93, 64, 95, 76, 107, 72, 71, 71, 76, 91, 104, 77, 7, 18, 53, 45, 58, 55, 50, 63, 123, 13, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, 117, 1, 46, 59, 38, 57, 42, 111, 14, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, 97, 11, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, 63, 56, 125, 46, 56, 41, 125, 63, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, 28, 57, 115, 26, 11, 18, 96, 108, 110, 45, 101, 98, 96, 102, 97, 108, 108, 104, 45, 98, 103, 112, 45, 109, 98, 119, 106, 117, 102, 45, 96, 111, 106, 96, 104, 102, 103, 117, 106, 103, 102, 108, 86, 113, 111, 62};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        A1 a12 = this.A0A;
        if (a12 != null) {
            a12.setVisibility(8);
            AnonymousClass38.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            View view = this.A01;
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (view != null) {
                MS.A0J(this.A08);
            }
            float f10 = Lr.A00;
            int round = Math.round(4.0f * f10);
            int round2 = Math.round(12.0f * f10);
            this.A08.setChildSpacing(round);
            this.A08.setPadding(0, round2, 0, round2);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 84));
    }

    private void A07() {
        EnumC1090Lw.A04(this.A03, EnumC1090Lw.A0A);
        EnumC1090Lw.A04(this.A09, EnumC1090Lw.A0A);
        EnumC1090Lw.A04(this.A05, EnumC1090Lw.A0A);
        EnumC1090Lw.A04(this.A01, EnumC1090Lw.A0A);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, UB ub2) {
        C1180Pi c1180Pi = this.A0B;
        if (c1180Pi != null) {
            MediaView mediaView = this.A03;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(c1180Pi);
        }
        if (!ub2.A1d()) {
            return;
        }
        String A1C = ub2.A1C();
        Context context = this.A03.getContext();
        String[] strArr3 = A0F;
        if (strArr3[5].length() != strArr3[0].length()) {
            String[] strArr4 = A0F;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        C1180Pi A01 = C1179Ph.A01(this.A07, A1C);
        if (A0F[7].charAt(21) != 'L') {
            A0F[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        } else {
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A09(this.A0B, layoutParams);
        this.A06.bringChildToFront(this.A0B);
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                MS.A0J(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(MS.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(106, 49, 6));
    }

    @TargetApi(21)
    private final void A0C(C1400Xy c1400Xy, AttributeSet attributeSet, int i10, int i11, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1400Xy, attributeSet, i10, i11));
        A0H(new OD(c1400Xy, attributeSet, i10, i11));
        this.A08 = new C1A(c1400Xy, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1400Xy, attributeSet, i10, i11));
        A07();
    }

    private final void A0D(C1400Xy c1400Xy, AttributeSet attributeSet, int i10, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1400Xy, attributeSet, i10));
        A0H(new OD(c1400Xy, attributeSet, i10));
        this.A08 = new C1A(c1400Xy, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1400Xy, attributeSet, i10));
        A07();
    }

    private final void A0E(C1400Xy c1400Xy, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1400Xy, attributeSet));
        A0H(new OD(c1400Xy, attributeSet));
        this.A08 = new C1A(c1400Xy, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1400Xy, attributeSet));
        A07();
    }

    private final void A0F(C1400Xy c1400Xy, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1400Xy));
        A0H(new OD(c1400Xy));
        this.A08 = new C1A(c1400Xy);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1400Xy));
        A07();
    }

    private void A0G(UB ub2, boolean z10, K5 k52) {
        T3 A04 = new T3(this.A02, this.A07).A04();
        if (z10) {
            A04.A06(new C1562bk(this, ub2));
        }
        A04.A07(k52.getUrl());
    }

    private void A0H(OD od2) {
        if (!this.A0D) {
            OD od3 = this.A09;
            if (od3 != null) {
                this.A03.removeView(od3);
            }
            od2.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(od2, layoutParams);
            this.A09 = od2;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 38));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> A03 = ((C5M) nativeAd.getNativeAdApi()).A03();
        if (A03 == null) {
            return false;
        }
        for (NativeAd childNativeAd : A03) {
            if (childNativeAd.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C5M) nativeAd.getNativeAdApi()).A02());
    }

    public final void A0L(NativeAd nativeAd) {
        AbstractC1657dN viewAdapter;
        C1400Xy A11 = ((UB) nativeAd.getInternalNativeAd()).A11();
        A11.A0G(this);
        this.A07.A0F(A11);
        this.A07.A0E(A11.A0D());
        this.A0D = true;
        UB A0L = UB.A0L(nativeAd.getInternalNativeAd());
        A0L.A1Q(this.A03);
        this.A02.setVisibility(8);
        this.A02.setImageDrawable(null);
        if (A0L.A0z() != null) {
            boolean A0r = A0L.A0z().A0r();
            if (A0F[7].charAt(21) != 'L') {
                String[] strArr = A0F;
                strArr[4] = "CvXrj9TTP1W52m7bIbynzmDbx8Ql";
                strArr[3] = "OGerX4RrBYJpkLXwbXTHIjvyoHPN";
                if (A0r) {
                    if (!TextUtils.isEmpty(A0L.A0z().A0O().A0D().A08())) {
                        A0L.A11().A0D().AEj(EnumC05680c.A06);
                    } else {
                        A0L.A11().A0D().AEj(EnumC05680c.A05);
                    }
                    A05();
                    this.A09.setVisibility(8);
                    this.A09.setImage(null, null);
                    this.A05.setVisibility(8);
                    this.A05.unsetNativeAd();
                    ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
                    View view = this.A01;
                    if (view != null) {
                        view.setVisibility(8);
                        View view2 = this.A01;
                        if (view2 instanceof O4) {
                            O4 o42 = (O4) view2;
                            if (A0F[1].charAt(24) != 't') {
                                String[] strArr2 = A0F;
                                strArr2[4] = "rVZQRbya12lyykx5Eq2uFJ3JGH4l";
                                strArr2[3] = "XRSLHysRpGcYp4QaXPRJ4K4uNDdg";
                                o42.A04();
                            } else {
                                o42.A04();
                            }
                        } else {
                            ((F9) view2).setAdapter(null);
                        }
                    }
                    A01(false);
                    C1560bi c1560bi = new C1560bi(this, A0L, nativeAd);
                    C1400Xy c1400Xy = this.A07;
                    this.A0A = new A1(c1400Xy, c1400Xy.A08(), c1560bi, A0L.A0z(), A04(261, 31, 44), 4, A0L.A19());
                    EnumC1090Lw.A04(this.A0A, EnumC1090Lw.A0A);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(13);
                    this.A03.addView(this.A0A, layoutParams);
                    A1 a12 = this.A0A;
                    this.A00 = a12;
                    bringChildToFront(a12);
                    this.A0A.setVisibility(0);
                    A0A(this.A0A, A0L);
                    A01(true);
                    return;
                }
            }
            throw new RuntimeException();
        }
        if (!A0I(nativeAd)) {
            if (A0J(nativeAd)) {
                A0L.A11().A0D().AEj(EnumC05680c.A09);
                A0L.A1b(this.A0C);
                this.A00 = this.A05.getMediaViewVideoRendererApi().getVideoView();
                A05();
                this.A09.setVisibility(8);
                this.A09.setImage(null, null);
                View view3 = this.A01;
                if (view3 != null) {
                    view3.setVisibility(8);
                    View view4 = this.A01;
                    if (view4 instanceof O4) {
                        ((O4) view4).A04();
                    } else {
                        ((F9) view4).setAdapter(null);
                    }
                }
                bringChildToFront(this.A05);
                this.A05.setNativeAd(nativeAd);
                ((C5L) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                this.A05.setVisibility(0);
                if (A0L.getAdCoverImage() != null) {
                    new T3(this.A03, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C1558bg(this, A0L)).A07(A0L.getAdCoverImage().getUrl());
                }
                if (BuildConfigApi.isDebug()) {
                    String str = A0G;
                    Log.i(str, A04(292, 9, 44) + ((C5M) nativeAd.getNativeAdApi()).A02());
                }
                A0A(this.A05, A0L);
                return;
            } else if (nativeAd.getAdCoverImage() == null) {
                return;
            } else {
                A0L.A11().A0D().AEj(EnumC05680c.A07);
                this.A00 = this.A09.getBodyImageView();
                A05();
                this.A05.setVisibility(8);
                this.A05.unsetNativeAd();
                ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
                View view5 = this.A01;
                if (view5 != null) {
                    view5.setVisibility(8);
                    View view6 = this.A01;
                    if (view6 instanceof O4) {
                        O4 o43 = (O4) view6;
                        String[] strArr3 = A0F;
                        if (strArr3[5].length() == strArr3[0].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0F;
                        strArr4[4] = "yqBcm6jNekaOStoZQ6HlGjXfWvjo";
                        strArr4[3] = "wDgm0JyWXySbfCdb16XoSedMN32V";
                        o43.A04();
                    } else {
                        F9 f92 = (F9) view6;
                        String[] strArr5 = A0F;
                        if (strArr5[4].length() != strArr5[3].length()) {
                            f92.setAdapter(null);
                        } else {
                            A0F[1] = "WgZqidqfP4WcIOVybwW8feV31RK292EI";
                            f92.setAdapter(null);
                        }
                    }
                }
                bringChildToFront(this.A09);
                this.A09.setVisibility(0);
                new T3(this.A09, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C1557bf(this, A0L)).A07(A0L.getAdCoverImage().getUrl());
                A0A(this.A09, A0L);
                return;
            }
        }
        A0L.A11().A0D().AEj(EnumC05680c.A03);
        boolean z10 = A0L.A17() == K8.A0B;
        if (!JR.A22(this.A07) || z10) {
            this.A01 = this.A08;
            ((C1A) this.A01).setCurrentPosition(0);
            ((C1A) this.A01).setShowTextInCarousel(z10);
            if (!z10) {
                viewAdapter = new FR((C1A) this.A01, A0L.A1H(), this.A07);
            } else {
                viewAdapter = new FX(this.A07, (C1A) this.A01, A0L.A1H(), A0L.A16());
            }
            viewAdapter.A0G(new C1559bh(this, A0L));
            ((F9) this.A01).setAdapter(viewAdapter);
        } else {
            A01(false);
            int width = this.A03.getWidth();
            for (ViewGroup viewGroup = (ViewGroup) this.A03.getParent(); width == 0 && viewGroup != null; viewGroup = (ViewGroup) viewGroup.getParent()) {
                width = viewGroup.getWidth();
            }
            MS.A0J(this.A01);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            this.A01 = new O4(this.A07);
            this.A03.addView(this.A01, layoutParams2);
            ((O4) this.A01).A05(A0L, width);
            MS.A0K(this.A01);
            A01(true);
        }
        this.A00 = this.A01;
        A05();
        OD od2 = this.A09;
        String[] strArr6 = A0F;
        if (strArr6[4].length() == strArr6[3].length()) {
            A0F[7] = "vPdWlOkx37ezmD0GPDFfrvR6XxeFyYC2";
            od2.setVisibility(8);
            this.A09.setImage(null, null);
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
            bringChildToFront(this.A01);
            this.A01.setVisibility(0);
            A0A(this.A01, A0L);
            return;
        }
        throw new RuntimeException();
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z10) {
        C1400Xy A11 = ((UB) nativeAdBaseApi).A11();
        this.A07.A0F(A11);
        A11.A0G(this);
        this.A0D = true;
        UB A0L = UB.A0L(nativeAdBaseApi);
        A0L.A1P(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.A01;
            if (view2 instanceof O4) {
                ((O4) view2).A04();
            } else {
                ((F9) view2).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        K5 adIcon = A0L.getAdIcon();
        if (adIcon != null) {
            Bitmap A0M = A0L.A10().A0M(adIcon.getUrl());
            if (A0M != null) {
                this.A02.setImageBitmap(A0M);
                if (z10) {
                    this.A03.post(new C1563bl(this, A0L));
                }
            } else {
                A0G(A0L, z10, adIcon);
            }
        } else {
            UA A15 = A0L.A15();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A11.A0D().A2a(A0L.A0x(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A15 != null) {
                A15.AAi(KH.A00(adErrorType));
            }
            Log.e(A04(46, 17, 115), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                this.A07.A06().A8y(A04(258, 3, 84), C07828z.A0W, new AnonymousClass90(A04(DownloadResource.STATUS_RUNNING, 23, 96)));
            }
        }
        A0A(this.A02, A0L);
    }

    public final boolean A0N() {
        View view = this.A01;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C8S
    public final C1400Xy A5b() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view == this.A01 || view == this.A05 || view == this.A09 || view == this.A02) {
            this.A06.bringChildToFront(view);
            C1180Pi c1180Pi = this.A0B;
            if (c1180Pi != null) {
                this.A06.bringChildToFront(c1180Pi);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        if (A0F[1].charAt(24) != 't') {
            A0F[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getWidth();
        }
        String[] strArr = A0F;
        if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
            String[] strArr2 = A0F;
            strArr2[5] = "pFreRfYdfw1";
            strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1400Xy) {
            this.A07 = (C1400Xy) context;
        } else {
            this.A07 = C5G.A02(context);
        }
        this.A07.A0G(this);
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            A0F(this.A07, mediaView);
        } else if (initializationType == 1) {
            A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
        } else if (initializationType == 2) {
            A0D(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
        } else if (initializationType == 3) {
            A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
        } else {
            throw new IllegalArgumentException(A04(155, 37, 116));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        int width = this.A03.getWidth();
        int height = this.A03.getHeight();
        if (width > 0 && height > 0) {
            this.A03.repair(th);
            this.A03.getLayoutParams().width = width;
            MediaView mediaView = this.A03;
            if (A0F[1].charAt(24) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C5L) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C5L) this.A05.getMediaViewVideoRendererApi()).A07(new C1556be(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A05;
            if (A0F[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A03.removeView(mediaViewVideoRenderer2);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((C5L) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A08());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((C1555bd) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(MS.A00());
            return;
        }
        throw new IllegalStateException(A04(215, 43, 114));
    }
}
