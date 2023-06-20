package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzy extends zzx {
    final /* synthetic */ zzz zza;
    private final com.google.android.gms.internal.measurement.zzes zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzz zzzVar, String str, int i10, com.google.android.gms.internal.measurement.zzes zzesVar) {
        super(str, i10);
        this.zza = zzzVar;
        this.zzh = zzesVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzx
    public final int zza() {
        return this.zzh.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzx
    public final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzx
    public final boolean zzc() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(Long l10, Long l11, com.google.android.gms.internal.measurement.zzgl zzglVar, boolean z10) {
        zzoi.zzc();
        boolean zzs = this.zza.zzs.zzf().zzs(this.zzb, zzel.zzV);
        boolean zzg = this.zzh.zzg();
        boolean zzh = this.zzh.zzh();
        boolean zzi = this.zzh.zzi();
        boolean z11 = zzg || zzh || zzi;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z10 && !z11) {
            this.zza.zzs.zzaz().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzj() ? Integer.valueOf(this.zzh.zza()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzel zzb = this.zzh.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzglVar.zzr()) {
            if (!zzb.zzi()) {
                this.zza.zzs.zzaz().zzk().zzb("No number filter for long property. property", this.zza.zzs.zzj().zzf(zzglVar.zzf()));
            } else {
                bool = zzx.zzj(zzx.zzh(zzglVar.zzb(), zzb.zzc()), zzg2);
            }
        } else if (zzglVar.zzq()) {
            if (!zzb.zzi()) {
                this.zza.zzs.zzaz().zzk().zzb("No number filter for double property. property", this.zza.zzs.zzj().zzf(zzglVar.zzf()));
            } else {
                bool = zzx.zzj(zzx.zzg(zzglVar.zza(), zzb.zzc()), zzg2);
            }
        } else if (zzglVar.zzt()) {
            if (!zzb.zzk()) {
                if (!zzb.zzi()) {
                    this.zza.zzs.zzaz().zzk().zzb("No string or number filter defined. property", this.zza.zzs.zzj().zzf(zzglVar.zzf()));
                } else if (zzlk.zzx(zzglVar.zzg())) {
                    bool = zzx.zzj(zzx.zzi(zzglVar.zzg(), zzb.zzc()), zzg2);
                } else {
                    this.zza.zzs.zzaz().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.zza.zzs.zzj().zzf(zzglVar.zzf()), zzglVar.zzg());
                }
            } else {
                bool = zzx.zzj(zzx.zzf(zzglVar.zzg(), zzb.zzd(), this.zza.zzs.zzaz()), zzg2);
            }
        } else {
            this.zza.zzs.zzaz().zzk().zzb("User property has no value, property", this.zza.zzs.zzj().zzf(zzglVar.zzf()));
        }
        this.zza.zzs.zzaz().zzj().zzb("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (!zzi || bool.booleanValue()) {
            if (!z10 || this.zzh.zzg()) {
                this.zze = bool;
            }
            if (bool.booleanValue() && z11 && zzglVar.zzs()) {
                long zzc = zzglVar.zzc();
                if (l10 != null) {
                    zzc = l10.longValue();
                }
                if (zzs && this.zzh.zzg() && !this.zzh.zzh() && l11 != null) {
                    zzc = l11.longValue();
                }
                if (this.zzh.zzh()) {
                    this.zzg = Long.valueOf(zzc);
                } else {
                    this.zzf = Long.valueOf(zzc);
                }
            }
            return true;
        }
        return true;
    }
}
