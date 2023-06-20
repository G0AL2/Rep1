package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgh implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzgj zza;
    private final Handler zzb;

    public zzgh(zzgj zzgjVar, Handler handler) {
        this.zza = zzgjVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgg
            @Override // java.lang.Runnable
            public final void run() {
                zzgh zzghVar = zzgh.this;
                zzgj.zzc(zzghVar.zza, i10);
            }
        });
    }
}
