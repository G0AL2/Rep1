package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Bf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0838Bf extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ X9 A01;

    public C0838Bf(X9 x92, AudioTrack audioTrack) {
        this.A01 = x92;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.flush();
            this.A00.release();
            conditionVariable = this.A01.A0f;
            conditionVariable.open();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
