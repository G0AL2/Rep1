package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC1170Oy implements View.OnTouchListener {
    public final /* synthetic */ A2 A00;

    public View$OnTouchListenerC1170Oy(A2 a22) {
        this.A00 = a22;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        P2 p22;
        p22 = this.A00.A0E;
        p22.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
