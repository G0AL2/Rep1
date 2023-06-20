package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzvn {
    public final int zza;
    public final zzjv[] zzb;
    public final zzvg[] zzc;
    public final zzct zzd;
    public final Object zze;

    public zzvn(zzjv[] zzjvVarArr, zzvg[] zzvgVarArr, zzct zzctVar, Object obj) {
        this.zzb = zzjvVarArr;
        this.zzc = (zzvg[]) zzvgVarArr.clone();
        this.zzd = zzctVar;
        this.zze = obj;
        this.zza = zzjvVarArr.length;
    }

    public final boolean zza(zzvn zzvnVar, int i10) {
        return zzvnVar != null && zzeg.zzS(this.zzb[i10], zzvnVar.zzb[i10]) && zzeg.zzS(this.zzc[i10], zzvnVar.zzc[i10]);
    }

    public final boolean zzb(int i10) {
        return this.zzb[i10] != null;
    }
}
