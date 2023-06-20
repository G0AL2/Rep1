package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzoj extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzom zza;
    final /* synthetic */ zzok zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzoj(zzok zzokVar, zzom zzomVar) {
        this.zzb = zzokVar;
        this.zza = zzomVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        AudioTrack audioTrack2;
        zznn zznnVar;
        boolean z10;
        zznn zznnVar2;
        audioTrack2 = this.zzb.zza.zzq;
        zzcw.zzf(audioTrack == audioTrack2);
        zzom zzomVar = this.zzb.zza;
        zznnVar = zzomVar.zzn;
        if (zznnVar != null) {
            z10 = zzomVar.zzO;
            if (z10) {
                zznnVar2 = zzomVar.zzn;
                zznnVar2.zzb();
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zznn zznnVar;
        boolean z10;
        zznn zznnVar2;
        audioTrack2 = this.zzb.zza.zzq;
        zzcw.zzf(audioTrack == audioTrack2);
        zzom zzomVar = this.zzb.zza;
        zznnVar = zzomVar.zzn;
        if (zznnVar != null) {
            z10 = zzomVar.zzO;
            if (z10) {
                zznnVar2 = zzomVar.zzn;
                zznnVar2.zzb();
            }
        }
    }
}
