package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbtj {
    private final zzbsm zza;
    private zzfvl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtj(zzbsm zzbsmVar) {
        this.zza = zzbsmVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcga zzcgaVar = new zzcga();
            this.zzb = zzcgaVar;
            this.zza.zzb(null).zzi(new zzcge() { // from class: com.google.android.gms.internal.ads.zzbth
                @Override // com.google.android.gms.internal.ads.zzcge
                public final void zza(Object obj) {
                    zzcga.this.zzd((zzbsn) obj);
                }
            }, new zzcgc() { // from class: com.google.android.gms.internal.ads.zzbti
                @Override // com.google.android.gms.internal.ads.zzcgc
                public final void zza() {
                    zzcga.this.zze(new zzbsp("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbtm zza(String str, zzbst zzbstVar, zzbss zzbssVar) {
        zzd();
        return new zzbtm(this.zzb, "google.afma.activeView.handleUpdate", zzbstVar, zzbssVar);
    }

    public final void zzb(final String str, final zzbom zzbomVar) {
        zzd();
        this.zzb = zzfvc.zzn(this.zzb, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzbtf
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                zzbsn zzbsnVar = (zzbsn) obj;
                zzbsnVar.zzq(str, zzbomVar);
                return zzfvc.zzi(zzbsnVar);
            }
        }, zzcfv.zzf);
    }

    public final void zzc(final String str, final zzbom zzbomVar) {
        this.zzb = zzfvc.zzm(this.zzb, new zzfok() { // from class: com.google.android.gms.internal.ads.zzbtg
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                zzbsn zzbsnVar = (zzbsn) obj;
                zzbsnVar.zzr(str, zzbomVar);
                return zzbsnVar;
            }
        }, zzcfv.zzf);
    }
}
