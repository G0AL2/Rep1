package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Py  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC1196Py implements View.OnTouchListener {
    public final /* synthetic */ QK A00;

    public View$OnTouchListenerC1196Py(QK qk) {
        this.A00 = qk;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C07849b c07849b;
        c07849b = this.A00.A0B;
        c07849b.A02(new C1060Kp(view, motionEvent));
        return false;
    }
}
