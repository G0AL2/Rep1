package com.google.android.gms.internal.ads;

import android.util.Log;
import com.inmobi.media.fq;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzpy {
    private long zza;
    private long zzb;
    private boolean zzc;

    private final long zzd(long j10) {
        return this.zza + Math.max(0L, ((this.zzb - 529) * 1000000) / j10);
    }

    public final long zza(zzad zzadVar) {
        return zzd(zzadVar.zzA);
    }

    public final long zzb(zzad zzadVar, zzgb zzgbVar) {
        if (this.zzb == 0) {
            this.zza = zzgbVar.zzd;
        }
        if (this.zzc) {
            return zzgbVar.zzd;
        }
        ByteBuffer byteBuffer = zzgbVar.zzb;
        Objects.requireNonNull(byteBuffer);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        int zzc = zzzl.zzc(i10);
        if (zzc == -1) {
            this.zzc = true;
            this.zzb = 0L;
            this.zza = zzgbVar.zzd;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return zzgbVar.zzd;
        }
        long zzd = zzd(zzadVar.zzA);
        this.zzb += zzc;
        return zzd;
    }

    public final void zzc() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }
}
