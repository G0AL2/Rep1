package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1676dg implements InterfaceC1171Oz {
    public final /* synthetic */ C1673dd A00;

    public C1676dg(C1673dd c1673dd) {
        this.A00 = c1673dd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1171Oz
    public final void A8i() {
        C1655dL c1655dL;
        C0904El c0904El;
        c1655dL = this.A00.A02;
        String A00 = c1655dL.A0R().A00();
        if (!TextUtils.isEmpty(A00)) {
            LZ lz = new LZ();
            c0904El = this.A00.A03;
            LZ.A0E(lz, c0904El, C1070La.A00(A00), this.A00.A65());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1171Oz
    public final void AAf(A1 a12) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1677dh(this, a12), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1171Oz
    public final void AAt() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1171Oz
    public final void ACX(View view, MotionEvent motionEvent) {
    }
}
