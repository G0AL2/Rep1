package com.fyber.inneractive.sdk.player.mediaplayer;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f19743a;

    public c(a aVar) {
        this.f19743a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = this.f19743a;
        String c10 = aVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) aVar.f19705a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = streamVolume / streamMaxVolume;
        IAlog.a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", aVar.c(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f10));
        if (f10 == 0.0f) {
            f10 = 0.1f;
        }
        aVar.setVolume(f10, f10);
        IAlog.d(c10 + "timelog: unmute took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
