package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Jx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC1044Jx implements View.OnTouchListener {
    public static String[] A01 = {"Jj6DPCpvRav0Dl4Hzko1ZYQ46cJHU9e3", "aRIYRX895b825x5MQHViVQuTPsX5EcgU", "WsB7SnaDyHBw", "ElhXrOblYWeIXKV5fK", "0U38eQ8bNMWMKT3qwHCBhGirZFomfBRA", "KG5ePHom1Hb0a65hRE12sPtgaad7Jk0V", "yn6apVjnupr8JkU7fdbub5PEYmvdUytV", "Qv1reMq3fGwFA"};
    public final /* synthetic */ UN A00;

    public View$OnTouchListenerC1044Jx(UN un) {
        this.A00 = un;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0819Al c0819Al;
        C0819Al c0819Al2;
        c0819Al = this.A00.A04;
        if (c0819Al != null) {
            int action = motionEvent.getAction();
            if (A01[6].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "gh2YpB8N5DvGnIVUwjzoCnzlhXQ6xZpi";
            strArr[4] = "c0aZKZ8jQy4nragOlR5MHbPn3w24MGfh";
            if (action == 1) {
                c0819Al2 = this.A00.A04;
                c0819Al2.A0n();
            }
        }
        return true;
    }
}
