package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1571bt extends C5E implements AdOptionsViewApi {
    public static byte[] A03;
    public static final int A04;
    public static final int A05;
    public final ImageView A00;
    public final ImageView A01;
    public final AdOptionsView A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 125);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{91, 108, 121, 102, 123, 125, 41, 72, 109};
    }

    static {
        A02();
        A04 = (int) (Lr.A00 * 23.0f);
        A05 = (int) (Lr.A00 * 4.0f);
    }

    public C1571bt(final Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i10, AdOptionsView adOptionsView) {
        int i11;
        this.A02 = adOptionsView;
        final LinearLayout linearLayout = new LinearLayout(context);
        this.A02.addView(linearLayout);
        if (orientation == AdOptionsView.Orientation.HORIZONTAL) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        linearLayout.setOrientation(i11);
        this.A01 = A00(EnumC1094Ma.DEFAULT_INFO_ICON);
        this.A00 = A00(EnumC1094Ma.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 116));
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        setIconSizeDp(i10);
        setIconColor(-10459280);
        final UB A0L = UB.A0L(nativeAdBase.getInternalNativeAd());
        A0L.A1S(nativeAdLayout);
        A0L.A1U(this);
        C1670da A0y = A0L.A0y();
        if (A0y != null && A0y.A0T() && !A0y.A0R()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.52
            public static String[] A04 = {"KRKQmCMMKryGk4zgpNIytFvS3TD6bAeJ", "Xc6miAmzcu08Y", "37gtSV6CsPxBYDJYgwQ03wIm04Bn1UoS", "vc4nNQQkh46pzBlyEmkoOi4CgZODKTHg", "arJKEayC0J1tSfFqlaoS22WOKdh4xl60", "Efttk19GyNCXlxxyYR0mavkkkhSaw2Qp", "IGlWio493rL8eTjetjpBhFYcUhZqKyAr", ""};

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (L0.A02(this)) {
                    return;
                }
                try {
                    A0L.A1I();
                    if (Build.VERSION.SDK_INT >= 16 && JR.A1k(context)) {
                        linearLayout.performAccessibilityAction(128, null);
                    }
                } catch (Throwable th) {
                    if (A04[5].charAt(5) == 'z') {
                        throw new RuntimeException();
                    }
                    A04[6] = "upfEaDqgYzKFHRA83M0GBorRIFZJY191";
                    L0.A00(th, this);
                }
            }
        });
        EnumC1090Lw.A04(this.A02, EnumC1090Lw.A0B);
    }

    public C1571bt(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private ImageView A00(EnumC1094Ma enumC1094Ma) {
        ImageView imageView = new ImageView(this.A02.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i10 = A05;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setImageBitmap(C1095Mb.A01(enumC1094Ma));
        return imageView;
    }

    public final void A03(EnumC1094Ma enumC1094Ma) {
        this.A01.setImageBitmap(C1095Mb.A01(enumC1094Ma));
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i10) {
        this.A01.setColorFilter(i10);
        this.A00.setColorFilter(i10);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i10) {
        int max = Math.max(A04, (int) (Lr.A00 * i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(max, max);
        this.A01.setLayoutParams(layoutParams);
        this.A00.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z10) {
        MS.A0N(this.A01, z10 ? 8 : 0);
    }
}
