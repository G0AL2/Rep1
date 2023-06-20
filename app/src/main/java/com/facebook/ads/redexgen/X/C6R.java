package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* renamed from: com.facebook.ads.redexgen.X.6R  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6R extends Handler {
    public final /* synthetic */ C6S A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6R(C6S c6s, Looper looper) {
        super(looper);
        this.A00 = c6s;
    }

    @Override // android.os.Handler
    @SuppressLint({"CatchGeneralException"})
    public final void handleMessage(Message message) {
        MotionEvent motionEvent;
        C07196c c07196c;
        if (L0.A02(this)) {
            return;
        }
        try {
            if (C6P.A00[C6Q.values()[message.what].ordinal()] == 1 && (motionEvent = (MotionEvent) message.obj) != null) {
                c07196c = this.A00.A02;
                c07196c.A00(motionEvent);
            }
        } catch (Throwable th) {
            try {
                C6O.A03(th);
            } catch (Throwable th2) {
                L0.A00(th2, this);
            }
        }
    }
}
