package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzey implements zzep {
    private zzfs zzb;
    private String zzc;
    private boolean zzf;
    private final zzfm zza = new zzfm();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzey zzb(boolean z10) {
        this.zzf = true;
        return this;
    }

    public final zzey zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzey zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzey zze(zzfs zzfsVar) {
        this.zzb = zzfsVar;
        return this;
    }

    public final zzey zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzep
    /* renamed from: zzg */
    public final zzfd zza() {
        zzfd zzfdVar = new zzfd(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzfs zzfsVar = this.zzb;
        if (zzfsVar != null) {
            zzfdVar.zzf(zzfsVar);
        }
        return zzfdVar;
    }
}
