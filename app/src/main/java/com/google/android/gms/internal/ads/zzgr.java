package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgr implements zzjb {
    private final zzjz zza;
    private final zzgq zzb;
    private zzjt zzc;
    private zzjb zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzgr(zzgq zzgqVar, zzcx zzcxVar) {
        this.zzb = zzgqVar;
        this.zza = new zzjz(zzcxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z10) {
        zzjt zzjtVar = this.zzc;
        if (zzjtVar != null && !zzjtVar.zzM() && (this.zzc.zzN() || (!z10 && !this.zzc.zzG()))) {
            zzjb zzjbVar = this.zzd;
            Objects.requireNonNull(zzjbVar);
            long zza = zzjbVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzbt zzc = zzjbVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        } else {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzjb zzjbVar2 = this.zzd;
        Objects.requireNonNull(zzjbVar2);
        return zzjbVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final zzbt zzc() {
        zzjb zzjbVar = this.zzd;
        return zzjbVar != null ? zzjbVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzjt zzjtVar) {
        if (zzjtVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzjt zzjtVar) throws zzgt {
        zzjb zzjbVar;
        zzjb zzi = zzjtVar.zzi();
        if (zzi == null || zzi == (zzjbVar = this.zzd)) {
            return;
        }
        if (zzjbVar == null) {
            this.zzd = zzi;
            this.zzc = zzjtVar;
            zzi.zzg(this.zza.zzc());
            return;
        }
        throw zzgt.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
    }

    public final void zzf(long j10) {
        this.zza.zzb(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzg(zzbt zzbtVar) {
        zzjb zzjbVar = this.zzd;
        if (zzjbVar != null) {
            zzjbVar.zzg(zzbtVar);
            zzbtVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbtVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
