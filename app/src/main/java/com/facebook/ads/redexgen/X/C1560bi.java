package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.bi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1560bi implements InterfaceC1171Oz {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C1555bd A01;
    public final /* synthetic */ UB A02;

    public C1560bi(C1555bd c1555bd, UB ub2, NativeAd nativeAd) {
        this.A01 = c1555bd;
        this.A02 = ub2;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1171Oz
    public final void A8i() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1171Oz
    public final void AAf(A1 a12) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1561bj(this, a12), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1171Oz
    public final void AAt() {
        A1 a12;
        A1 a13;
        a12 = this.A01.A0A;
        if (a12 != null) {
            a13 = this.A01.A0A;
            a13.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1171Oz
    public final void ACX(View view, MotionEvent motionEvent) {
        C1400Xy c1400Xy;
        boolean A0J;
        MK A19 = this.A02.A19();
        c1400Xy = this.A01.A07;
        A19.A06(c1400Xy, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A12() != null) {
                this.A02.A12().onClick(view);
            }
        }
    }
}
