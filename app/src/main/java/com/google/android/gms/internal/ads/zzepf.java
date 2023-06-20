package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzepf implements zzetg {
    private final zzfvm zza;
    private final Context zzb;

    public zzepf(zzfvm zzfvmVar, Context context) {
        this.zza = zzfvmVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepf.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzepg zzc() throws Exception {
        int i10;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i11 = -1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziq)).booleanValue()) {
            i10 = com.google.android.gms.ads.internal.zzt.zzq().zzi(audioManager);
            i11 = audioManager.getStreamMaxVolume(3);
        } else {
            i10 = -1;
        }
        return new zzepg(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i10, i11, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzt.zzr().zza(), com.google.android.gms.ads.internal.zzt.zzr().zze());
    }
}
