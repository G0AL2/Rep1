package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzave {
    public final zzavn zza = new zzavn();
    public final zzauf zzb;
    public zzavl zzc;
    public zzavb zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public zzaue zzh;
    public zzavm zzi;

    public zzave(zzauf zzaufVar) {
        this.zzb = zzaufVar;
    }

    public final void zza(zzavl zzavlVar, zzavb zzavbVar) {
        Objects.requireNonNull(zzavlVar);
        this.zzc = zzavlVar;
        Objects.requireNonNull(zzavbVar);
        this.zzd = zzavbVar;
        this.zzb.zza(zzavlVar.zzf);
        zzb();
    }

    public final void zzb() {
        zzavn zzavnVar = this.zza;
        zzavnVar.zzd = 0;
        zzavnVar.zzr = 0L;
        zzavnVar.zzl = false;
        zzavnVar.zzq = false;
        zzavnVar.zzn = null;
        this.zze = 0;
        this.zzg = 0;
        this.zzf = 0;
        this.zzh = null;
        this.zzi = null;
    }
}
