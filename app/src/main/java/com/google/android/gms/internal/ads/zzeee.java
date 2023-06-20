package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeee implements zzfgg {
    private final zzeds zza;
    private final zzedw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeee(zzeds zzedsVar, zzedw zzedwVar) {
        this.zza = zzedsVar;
        this.zzb = zzedwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffzVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && zzffz.RENDERER == zzffzVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffzVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
            if (zzffz.RENDERER == zzffzVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime());
            } else if (zzffz.PRELOADED_LOADER == zzffzVar || zzffz.SERVER_TRANSACTION == zzffzVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime());
                final zzedw zzedwVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzedwVar.zza.zza(new zzffi() { // from class: com.google.android.gms.internal.ads.zzedv
                    @Override // com.google.android.gms.internal.ads.zzffi
                    public final Object zza(Object obj) {
                        zzedw zzedwVar2 = zzedw.this;
                        long j10 = zzd;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzedwVar2.zzf()) {
                            return null;
                        }
                        zzbfu zzg = zzbfv.zzg();
                        zzg.zzh(j10);
                        byte[] zzaw = ((zzbfv) zzg.zzal()).zzaw();
                        zzeed.zzg(sQLiteDatabase, false, false);
                        zzeed.zzd(sQLiteDatabase, j10, zzaw);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffzVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && zzffz.RENDERER == zzffzVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zza.zzc());
        }
    }
}
