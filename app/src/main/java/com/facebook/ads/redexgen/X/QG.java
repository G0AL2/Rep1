package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class QG implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C07587v A00;

    public QG(C07587v c07587v) {
        this.A00 = c07587v;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new KW(this, i10));
    }
}
