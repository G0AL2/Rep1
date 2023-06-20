package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzgi zzgiVar) {
        super(zzgiVar);
        this.zzb = new a();
        this.zza = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzd zzdVar, String str, long j10) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j10;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            zzdVar.zzs.zzaz().zzk().zza("Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j10) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zziu zzj = zzdVar.zzs.zzs().zzj(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzdVar.zzb.remove(str);
                Long l10 = (Long) zzdVar.zza.get(str);
                if (l10 == null) {
                    zzdVar.zzs.zzaz().zzd().zza("First ad unit exposure time was never set");
                } else {
                    long longValue = l10.longValue();
                    zzdVar.zza.remove(str);
                    zzdVar.zzi(str, j10 - longValue, zzj);
                }
                if (zzdVar.zzb.isEmpty()) {
                    long j11 = zzdVar.zzc;
                    if (j11 == 0) {
                        zzdVar.zzs.zzaz().zzd().zza("First ad exposure time was never set");
                        return;
                    }
                    zzdVar.zzh(j10 - j11, zzj);
                    zzdVar.zzc = 0L;
                    return;
                }
                return;
            }
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzs.zzaz().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void zzh(long j10, zziu zziuVar) {
        if (zziuVar == null) {
            this.zzs.zzaz().zzj().zza("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            this.zzs.zzaz().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            zzlp.zzK(zziuVar, bundle, true);
            this.zzs.zzq().zzH("am", "_xa", bundle);
        }
    }

    private final void zzi(String str, long j10, zziu zziuVar) {
        if (zziuVar == null) {
            this.zzs.zzaz().zzj().zza("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            this.zzs.zzaz().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            zzlp.zzK(zziuVar, bundle, true);
            this.zzs.zzq().zzH("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j10) {
        for (String str : this.zza.keySet()) {
            this.zza.put(str, Long.valueOf(j10));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j10;
    }

    public final void zzd(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.zzs.zzaA().zzp(new zza(this, str, j10));
        } else {
            this.zzs.zzaz().zzd().zza("Ad unit id must be a non-empty string");
        }
    }

    public final void zze(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.zzs.zzaA().zzp(new zzb(this, str, j10));
        } else {
            this.zzs.zzaz().zzd().zza("Ad unit id must be a non-empty string");
        }
    }

    public final void zzf(long j10) {
        zziu zzj = this.zzs.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j10 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j10 - this.zzc, zzj);
        }
        zzj(j10);
    }
}
