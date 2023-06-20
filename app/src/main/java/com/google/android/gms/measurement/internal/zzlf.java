package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlf {
    com.google.android.gms.internal.measurement.zzgc zza;
    List zzb;
    List zzc;
    long zzd;
    final /* synthetic */ zzli zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzlf(zzli zzliVar, zzle zzleVar) {
        this.zze = zzliVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        return ((zzfsVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean zza(long j10, com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        Preconditions.checkNotNull(zzfsVar);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (this.zzc.size() <= 0 || zzb((com.google.android.gms.internal.measurement.zzfs) this.zzc.get(0)) == zzb(zzfsVar)) {
            long zzbz = this.zzd + zzfsVar.zzbz();
            this.zze.zzg();
            if (zzbz >= Math.max(0, ((Integer) zzel.zzh.zza(null)).intValue())) {
                return false;
            }
            this.zzd = zzbz;
            this.zzc.add(zzfsVar);
            this.zzb.add(Long.valueOf(j10));
            int size = this.zzc.size();
            this.zze.zzg();
            return size < Math.max(1, ((Integer) zzel.zzi.zza(null)).intValue());
        }
        return false;
    }
}
