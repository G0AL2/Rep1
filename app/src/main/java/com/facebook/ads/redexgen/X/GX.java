package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: assets/audience_network.dex */
public class GX {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    @Nullable
    public final Bitmap A0A;
    @Nullable
    public final Layout.Alignment A0B;
    @Nullable
    public final CharSequence A0C;
    public final boolean A0D;

    public GX(Bitmap bitmap, float f10, int i10, float f11, int i11, float f12, float f13) {
        this(null, null, bitmap, f11, 0, i11, f10, i10, RecyclerView.UNDEFINED_DURATION, Float.MIN_VALUE, f12, f13, false, -16777216);
    }

    public GX(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, Float.MIN_VALUE, RecyclerView.UNDEFINED_DURATION, Float.MIN_VALUE);
    }

    public GX(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        this(charSequence, alignment, f10, i10, i11, f11, i12, f12, false, -16777216);
    }

    public GX(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, int i13, float f13) {
        this(charSequence, alignment, null, f10, i10, i11, f11, i12, i13, f13, f12, Float.MIN_VALUE, false, -16777216);
    }

    public GX(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13) {
        this(charSequence, alignment, null, f10, i10, i11, f11, i12, RecyclerView.UNDEFINED_DURATION, Float.MIN_VALUE, f12, Float.MIN_VALUE, z10, i13);
    }

    public GX(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14) {
        this.A0C = charSequence;
        this.A0B = alignment;
        this.A0A = bitmap;
        this.A01 = f10;
        this.A06 = i10;
        this.A05 = i11;
        this.A02 = f11;
        this.A07 = i12;
        this.A03 = f13;
        this.A00 = f14;
        this.A0D = z10;
        this.A09 = i14;
        this.A08 = i13;
        this.A04 = f12;
    }
}
