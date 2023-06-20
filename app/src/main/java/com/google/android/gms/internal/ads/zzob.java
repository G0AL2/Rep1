package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzob {
    public final zzad zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzmy[] zzi;

    public zzob(zzad zzadVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, zzmy[] zzmyVarArr) {
        this.zza = zzadVar;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzmyVarArr;
    }

    public final long zza(long j10) {
        return (j10 * 1000000) / this.zze;
    }

    public final AudioTrack zzb(boolean z10, zzi zziVar, int i10) throws zznm {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            int i11 = zzeg.zza;
            if (i11 >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zziVar.zza()).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i10).setOffloadedPlayback(this.zzc == 1).build();
            } else if (i11 >= 21) {
                AudioAttributes zza = zziVar.zza();
                build = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack(zza, build, this.zzh, 1, i10);
            } else {
                int i12 = zziVar.zzc;
                if (i10 == 0) {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i10);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zznm(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new zznm(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e10);
        }
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
