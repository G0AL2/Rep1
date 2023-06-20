package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzoc {
    private final zzmy[] zza;
    private final zzou zzb;
    private final zzow zzc;

    public zzoc(zzmy... zzmyVarArr) {
        zzou zzouVar = new zzou();
        zzow zzowVar = new zzow();
        this.zza = r2;
        System.arraycopy(zzmyVarArr, 0, r2, 0, 0);
        this.zzb = zzouVar;
        this.zzc = zzowVar;
        zzmy[] zzmyVarArr2 = {zzouVar, zzowVar};
    }

    public final long zza(long j10) {
        return this.zzc.zzi(j10);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbt zzc(zzbt zzbtVar) {
        this.zzc.zzk(zzbtVar.zzc);
        this.zzc.zzj(zzbtVar.zzd);
        return zzbtVar;
    }

    public final boolean zzd(boolean z10) {
        this.zzb.zzp(z10);
        return z10;
    }

    public final zzmy[] zze() {
        return this.zza;
    }
}
