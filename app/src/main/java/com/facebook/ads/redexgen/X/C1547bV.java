package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.bV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1547bV implements C5S {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C5U A01;
    public final /* synthetic */ UB A02;

    public C1547bV(C5U c5u, ImageView imageView, UB ub2) {
        this.A01 = c5u;
        this.A00 = imageView;
        this.A02 = ub2;
    }

    @Override // com.facebook.ads.redexgen.X.C5S
    public final void AAy(@Nullable Drawable drawable) {
        UB.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
