package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC1132Nm implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int action = motionEvent.getAction();
        if (action == 0) {
            i10 = C1138Ns.A0D;
            MS.A0M(view, i10);
        } else if (action == 1) {
            MS.A0M(view, 0);
        }
        return false;
    }
}
