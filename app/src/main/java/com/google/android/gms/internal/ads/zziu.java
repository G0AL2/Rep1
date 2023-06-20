package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zziu {
    public zzjn zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zziu(zzjn zzjnVar) {
        this.zza = zzjnVar;
    }

    public final void zza(int i10) {
        this.zzg = 1 == ((this.zzg ? 1 : 0) | i10);
        this.zzb += i10;
    }

    public final void zzb(int i10) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i10;
    }

    public final void zzc(zzjn zzjnVar) {
        this.zzg |= this.zza != zzjnVar;
        this.zza = zzjnVar;
    }

    public final void zzd(int i10) {
        if (this.zzc && this.zzd != 5) {
            zzcw.zzd(i10 == 5);
            return;
        }
        this.zzg = true;
        this.zzc = true;
        this.zzd = i10;
    }
}
