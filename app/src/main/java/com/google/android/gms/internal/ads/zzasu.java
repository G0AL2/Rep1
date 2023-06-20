package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(19)
/* loaded from: classes2.dex */
final class zzasu extends zzast {
    private final AudioTimestamp zzb;
    private long zzc;
    private long zzd;
    private long zze;

    public zzasu() {
        super(null);
        this.zzb = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final long zzd() {
        return this.zzb.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final void zzg(AudioTrack audioTrack, boolean z10) {
        super.zzg(audioTrack, z10);
        this.zzc = 0L;
        this.zzd = 0L;
        this.zze = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final boolean zzh() {
        boolean timestamp = this.zza.getTimestamp(this.zzb);
        if (timestamp) {
            long j10 = this.zzb.framePosition;
            if (this.zzd > j10) {
                this.zzc++;
            }
            this.zzd = j10;
            this.zze = j10 + (this.zzc << 32);
        }
        return timestamp;
    }
}
