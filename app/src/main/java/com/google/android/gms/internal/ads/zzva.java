package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
abstract class zzva {
    public final int zza;
    public final zzck zzb;
    public final int zzc;
    public final zzad zzd;

    public zzva(int i10, zzck zzckVar, int i11) {
        this.zza = i10;
        this.zzb = zzckVar;
        this.zzc = i11;
        this.zzd = zzckVar.zzb(i11);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzva zzvaVar);
}
