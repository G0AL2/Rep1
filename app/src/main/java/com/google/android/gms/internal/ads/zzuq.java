package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzuq implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzuq(zzad zzadVar, int i10) {
        this.zza = 1 == (zzadVar.zze & 1);
        this.zzb = zzve.zzi(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzuq zzuqVar) {
        return zzfqy.zzj().zzd(this.zzb, zzuqVar.zzb).zzd(this.zza, zzuqVar.zza).zza();
    }
}
