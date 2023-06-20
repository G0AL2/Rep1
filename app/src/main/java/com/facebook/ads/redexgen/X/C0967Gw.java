package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.facebook.ads.redexgen.X.Gw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0967Gw {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    @Nullable
    public final String A07;

    public C0967Gw(@Nullable String str) {
        this(str, Float.MIN_VALUE, Float.MIN_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, Float.MIN_VALUE, RecyclerView.UNDEFINED_DURATION, Float.MIN_VALUE);
    }

    public C0967Gw(@Nullable String str, float f10, float f11, int i10, int i11, float f12, int i12, float f13) {
        this.A07 = str;
        this.A01 = f10;
        this.A00 = f11;
        this.A05 = i10;
        this.A04 = i11;
        this.A03 = f12;
        this.A06 = i12;
        this.A02 = f13;
    }
}
