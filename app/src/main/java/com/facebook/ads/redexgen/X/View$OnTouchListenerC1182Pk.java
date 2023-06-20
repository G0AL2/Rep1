package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC1182Pk implements View.OnTouchListener {
    public final /* synthetic */ C1183Pl A00;

    public View$OnTouchListenerC1182Pk(C1183Pl c1183Pl) {
        this.A00 = c1183Pl;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC1028Jh interfaceC1028Jh;
        AnonymousClass18 anonymousClass18;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1183Pl.A00(this.A00);
            interfaceC1028Jh = this.A00.A06;
            anonymousClass18 = this.A00.A03;
            interfaceC1028Jh.A99(anonymousClass18.A0U(), new OG().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
