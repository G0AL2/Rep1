package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Bg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0839Bg extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ X9 A01;

    public C0839Bg(X9 x92, AudioTrack audioTrack) {
        this.A01 = x92;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
